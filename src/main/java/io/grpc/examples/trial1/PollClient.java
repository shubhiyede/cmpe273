package io.grpc.examples.trial1;

import io.grpc.ChannelImpl;
import io.grpc.transport.netty.NegotiationType;
import io.grpc.transport.netty.NettyChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the {@link HelloWorldServer}.
 */
public class PollClient {
  private static final Logger logger = Logger.getLogger(PollClient.class.getName());

  private final ChannelImpl channel;
  private final PollServiceGrpc.PollServiceBlockingStub blockingStub;

  public PollClient(String host, int port) {
    channel =
        NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT)
            .build();
    blockingStub = PollServiceGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTerminated(5, TimeUnit.SECONDS);
  }

  public void setPollVariables(String moderator_Id,String question,String started_at,String expired_at,String[] choice) {
    try {
      logger.info("Trying to create poll for moderator_Id "+moderator_Id);
      PollRequest request = PollRequest.newBuilder().setModeratorId(moderator_Id).setQuestion(question).setStartedAt(started_at).setExpiredAt(expired_at).addChoice(choice[0]).addChoice(choice[1]).build();
      PollResponse response = blockingStub.createPoll(request);
      logger.info("Created poll with base36 poll_id "+response.getId());
   } catch (RuntimeException e) {
      logger.log(Level.WARNING, "RPC failed", e);
      return;
   }
  }

  public static void main(String[] args) throws Exception {
    PollClient client = new PollClient("localhost", 50051);
    try {
      String moderator_Id="12345";
      String question="What type of smartphone do you have?";
      String started_at="2015-02-23T13:00:00.000Z";
      String expired_at="2015-02-24T13:00:00.000Z";
      String[] choice={ "Android", "iPhone" };

      client.setPollVariables(moderator_Id,question,started_at,expired_at,choice);
    }finally {
      client.shutdown();
    }
  }
}
