// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/settings.proto

package service;

public final class SettingsProto {
  private SettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_ProcessListReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_ProcessListReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_ProcessListRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_ProcessListRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_NetworkInfoReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_NetworkInfoReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_NetworkInfoRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_NetworkInfoRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_ExecuteReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_ExecuteReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_ExecuteRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_ExecuteRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027services/settings.proto\022\010services\"\020\n\016P" +
      "rocessListReq\";\n\016ProcessListRes\022\023\n\013proce" +
      "ssList\030\001 \003(\t\022\024\n\014isSuccessful\030\002 \001(\010\"\020\n\016Ne" +
      "tworkInfoReq\";\n\016NetworkInfoRes\022\023\n\013Networ" +
      "kInfo\030\001 \003(\t\022\024\n\014isSuccessful\030\002 \001(\010\"\035\n\nExe" +
      "cuteReq\022\017\n\007command\030\001 \001(\t\"9\n\nExecuteRes\022\025" +
      "\n\rcommandOutput\030\001 \003(\t\022\024\n\014isSuccessful\030\002 " +
      "\001(\0102\323\001\n\010Settings\022F\n\016getProcessList\022\030.ser" +
      "vices.ProcessListReq\032\030.services.ProcessL" +
      "istRes\"\000\022F\n\016getNetworkInfo\022\030.services.Ne" +
      "tworkInfoReq\032\030.services.NetworkInfoRes\"\000" +
      "\0227\n\007execute\022\024.services.ExecuteReq\032\024.serv" +
      "ices.ExecuteRes\"\000B\032\n\007serviceB\rSettingsPr" +
      "otoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_services_ProcessListReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_ProcessListReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_ProcessListReq_descriptor,
        new java.lang.String[] { });
    internal_static_services_ProcessListRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_ProcessListRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_ProcessListRes_descriptor,
        new java.lang.String[] { "ProcessList", "IsSuccessful", });
    internal_static_services_NetworkInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_NetworkInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_NetworkInfoReq_descriptor,
        new java.lang.String[] { });
    internal_static_services_NetworkInfoRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_NetworkInfoRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_NetworkInfoRes_descriptor,
        new java.lang.String[] { "NetworkInfo", "IsSuccessful", });
    internal_static_services_ExecuteReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_services_ExecuteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_ExecuteReq_descriptor,
        new java.lang.String[] { "Command", });
    internal_static_services_ExecuteRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_services_ExecuteRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_ExecuteRes_descriptor,
        new java.lang.String[] { "CommandOutput", "IsSuccessful", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
