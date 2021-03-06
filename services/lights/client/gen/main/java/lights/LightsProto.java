// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lights.proto

package lights;

public final class LightsProto {
  private LightsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lights_Light_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lights_Light_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lights_LightsStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lights_LightsStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lights_LightsTurnedOnResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lights_LightsTurnedOnResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lights_LightsTurnedOffResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lights_LightsTurnedOffResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lights_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lights_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014lights.proto\022\006lights\"5\n\005Light\022\n\n\002id\030\001 " +
      "\001(\005\022\014\n\004isOn\030\002 \001(\010\022\022\n\nbrightness\030\003 \001(\005\"-\n" +
      "\014LightsStatus\022\035\n\006lights\030\001 \003(\0132\r.lights.L" +
      "ight\"G\n\026LightsTurnedOnResponse\022\026\n\016lights" +
      "TurnedOn\030\001 \001(\005\022\025\n\rtotalLightsOn\030\002 \001(\005\"J\n" +
      "\027LightsTurnedOffResponse\022\027\n\017lightsTurned" +
      "Off\030\001 \001(\005\022\026\n\016totalLightsOff\030\002 \001(\005\"\007\n\005Emp" +
      "ty2\266\002\n\006Lights\0227\n\006TurnOn\022\r.lights.Light\032\036" +
      ".lights.LightsTurnedOnResponse\0229\n\007TurnOf" +
      "f\022\r.lights.Light\032\037.lights.LightsTurnedOf" +
      "fResponse\022A\n\016TurnOnMultiple\022\r.lights.Lig" +
      "ht\032\036.lights.LightsTurnedOnResponse(\001\022C\n\017" +
      "TurnOffMultiple\022\r.lights.Light\032\037.lights." +
      "LightsTurnedOffResponse(\001\0220\n\tGetStatus\022\r" +
      ".lights.Empty\032\024.lights.LightsStatusB\025B\013L" +
      "ightsProtoP\001\242\002\003LTSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_lights_Light_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lights_Light_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lights_Light_descriptor,
        new java.lang.String[] { "Id", "IsOn", "Brightness", });
    internal_static_lights_LightsStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lights_LightsStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lights_LightsStatus_descriptor,
        new java.lang.String[] { "Lights", });
    internal_static_lights_LightsTurnedOnResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lights_LightsTurnedOnResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lights_LightsTurnedOnResponse_descriptor,
        new java.lang.String[] { "LightsTurnedOn", "TotalLightsOn", });
    internal_static_lights_LightsTurnedOffResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lights_LightsTurnedOffResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lights_LightsTurnedOffResponse_descriptor,
        new java.lang.String[] { "LightsTurnedOff", "TotalLightsOff", });
    internal_static_lights_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lights_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lights_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
