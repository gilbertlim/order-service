// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.gilbert.msa.proto;

public final class productProto {
  private productProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gilbert_msa_ProductRequestGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gilbert_msa_ProductRequestGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gilbert_msa_ProductGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gilbert_msa_ProductGrpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gilbert_msa_ProductResponseGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gilbert_msa_ProductResponseGrpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022\017com.gilbert.msa\"(\n\022Prod" +
      "uctRequestGrpc\022\022\n\nproductIds\030\001 \003(\003\"V\n\013Pr" +
      "oductGrpc\022\021\n\tproductId\030\001 \001(\003\022\023\n\013productN" +
      "ame\030\002 \001(\t\022\r\n\005price\030\003 \001(\005\022\020\n\010quantity\030\004 \001" +
      "(\005\"H\n\023ProductResponseGrpc\0221\n\013productGrpc" +
      "\030\001 \003(\0132\034.com.gilbert.msa.ProductGrpc2l\n\016" +
      "ProductService\022Z\n\013getProducts\022#.com.gilb" +
      "ert.msa.ProductRequestGrpc\032$.com.gilbert" +
      ".msa.ProductResponseGrpc\"\000B\'\n\025com.gilber" +
      "t.msa.protoB\014productProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_gilbert_msa_ProductRequestGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gilbert_msa_ProductRequestGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gilbert_msa_ProductRequestGrpc_descriptor,
        new java.lang.String[] { "ProductIds", });
    internal_static_com_gilbert_msa_ProductGrpc_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_gilbert_msa_ProductGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gilbert_msa_ProductGrpc_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "Price", "Quantity", });
    internal_static_com_gilbert_msa_ProductResponseGrpc_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_gilbert_msa_ProductResponseGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gilbert_msa_ProductResponseGrpc_descriptor,
        new java.lang.String[] { "ProductGrpc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
