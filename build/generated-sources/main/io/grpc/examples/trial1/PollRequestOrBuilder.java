// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trial1.proto

package io.grpc.examples.trial1;

public interface PollRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.grpc.examples.trial1.PollRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string moderatorId = 1;</code>
   */
  java.lang.String getModeratorId();
  /**
   * <code>optional string moderatorId = 1;</code>
   */
  com.google.protobuf.ByteString
      getModeratorIdBytes();

  /**
   * <code>optional string question = 2;</code>
   */
  java.lang.String getQuestion();
  /**
   * <code>optional string question = 2;</code>
   */
  com.google.protobuf.ByteString
      getQuestionBytes();

  /**
   * <code>optional string startedAt = 3;</code>
   */
  java.lang.String getStartedAt();
  /**
   * <code>optional string startedAt = 3;</code>
   */
  com.google.protobuf.ByteString
      getStartedAtBytes();

  /**
   * <code>optional string expiredAt = 4;</code>
   */
  java.lang.String getExpiredAt();
  /**
   * <code>optional string expiredAt = 4;</code>
   */
  com.google.protobuf.ByteString
      getExpiredAtBytes();

  /**
   * <code>repeated string choice = 5;</code>
   */
  com.google.protobuf.ProtocolStringList
      getChoiceList();
  /**
   * <code>repeated string choice = 5;</code>
   */
  int getChoiceCount();
  /**
   * <code>repeated string choice = 5;</code>
   */
  java.lang.String getChoice(int index);
  /**
   * <code>repeated string choice = 5;</code>
   */
  com.google.protobuf.ByteString
      getChoiceBytes(int index);
}
