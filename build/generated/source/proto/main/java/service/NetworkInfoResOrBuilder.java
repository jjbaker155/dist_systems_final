// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/settings.proto

package service;

public interface NetworkInfoResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.NetworkInfoRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string NetworkInfo = 1;</code>
   * @return A list containing the networkInfo.
   */
  java.util.List<java.lang.String>
      getNetworkInfoList();
  /**
   * <code>repeated string NetworkInfo = 1;</code>
   * @return The count of networkInfo.
   */
  int getNetworkInfoCount();
  /**
   * <code>repeated string NetworkInfo = 1;</code>
   * @param index The index of the element to return.
   * @return The networkInfo at the given index.
   */
  java.lang.String getNetworkInfo(int index);
  /**
   * <code>repeated string NetworkInfo = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the networkInfo at the given index.
   */
  com.google.protobuf.ByteString
      getNetworkInfoBytes(int index);

  /**
   * <code>bool isSuccessful = 2;</code>
   * @return The isSuccessful.
   */
  boolean getIsSuccessful();
}