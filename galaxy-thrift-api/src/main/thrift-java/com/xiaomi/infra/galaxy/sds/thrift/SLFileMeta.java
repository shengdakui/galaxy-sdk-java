/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * SLFile格式存储元信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-21")
public class SLFileMeta implements libthrift091.TBase<SLFileMeta, SLFileMeta._Fields>, java.io.Serializable, Cloneable, Comparable<SLFileMeta> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SLFileMeta");

  private static final libthrift091.protocol.TField TYPE_FIELD_DESC = new libthrift091.protocol.TField("type", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField DATUM_MAP_META_FIELD_DESC = new libthrift091.protocol.TField("datumMapMeta", libthrift091.protocol.TType.STRUCT, (short)2);
  private static final libthrift091.protocol.TField RC_BASIC_META_FIELD_DESC = new libthrift091.protocol.TField("rcBasicMeta", libthrift091.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SLFileMetaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SLFileMetaTupleSchemeFactory());
  }

  /**
   * 
   * @see SLFileType
   */
  public SLFileType type; // optional
  public DatumMapMeta datumMapMeta; // optional
  public RCBasicMeta rcBasicMeta; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see SLFileType
     */
    TYPE((short)1, "type"),
    DATUM_MAP_META((short)2, "datumMapMeta"),
    RC_BASIC_META((short)3, "rcBasicMeta");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // DATUM_MAP_META
          return DATUM_MAP_META;
        case 3: // RC_BASIC_META
          return RC_BASIC_META;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.DATUM_MAP_META,_Fields.RC_BASIC_META};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new libthrift091.meta_data.FieldMetaData("type", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, SLFileType.class)));
    tmpMap.put(_Fields.DATUM_MAP_META, new libthrift091.meta_data.FieldMetaData("datumMapMeta", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, DatumMapMeta.class)));
    tmpMap.put(_Fields.RC_BASIC_META, new libthrift091.meta_data.FieldMetaData("rcBasicMeta", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, RCBasicMeta.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SLFileMeta.class, metaDataMap);
  }

  public SLFileMeta() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SLFileMeta(SLFileMeta other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetDatumMapMeta()) {
      this.datumMapMeta = new DatumMapMeta(other.datumMapMeta);
    }
    if (other.isSetRcBasicMeta()) {
      this.rcBasicMeta = new RCBasicMeta(other.rcBasicMeta);
    }
  }

  public SLFileMeta deepCopy() {
    return new SLFileMeta(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.datumMapMeta = null;
    this.rcBasicMeta = null;
  }

  /**
   * 
   * @see SLFileType
   */
  public SLFileType getType() {
    return this.type;
  }

  /**
   * 
   * @see SLFileType
   */
  public SLFileMeta setType(SLFileType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public DatumMapMeta getDatumMapMeta() {
    return this.datumMapMeta;
  }

  public SLFileMeta setDatumMapMeta(DatumMapMeta datumMapMeta) {
    this.datumMapMeta = datumMapMeta;
    return this;
  }

  public void unsetDatumMapMeta() {
    this.datumMapMeta = null;
  }

  /** Returns true if field datumMapMeta is set (has been assigned a value) and false otherwise */
  public boolean isSetDatumMapMeta() {
    return this.datumMapMeta != null;
  }

  public void setDatumMapMetaIsSet(boolean value) {
    if (!value) {
      this.datumMapMeta = null;
    }
  }

  public RCBasicMeta getRcBasicMeta() {
    return this.rcBasicMeta;
  }

  public SLFileMeta setRcBasicMeta(RCBasicMeta rcBasicMeta) {
    this.rcBasicMeta = rcBasicMeta;
    return this;
  }

  public void unsetRcBasicMeta() {
    this.rcBasicMeta = null;
  }

  /** Returns true if field rcBasicMeta is set (has been assigned a value) and false otherwise */
  public boolean isSetRcBasicMeta() {
    return this.rcBasicMeta != null;
  }

  public void setRcBasicMetaIsSet(boolean value) {
    if (!value) {
      this.rcBasicMeta = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((SLFileType)value);
      }
      break;

    case DATUM_MAP_META:
      if (value == null) {
        unsetDatumMapMeta();
      } else {
        setDatumMapMeta((DatumMapMeta)value);
      }
      break;

    case RC_BASIC_META:
      if (value == null) {
        unsetRcBasicMeta();
      } else {
        setRcBasicMeta((RCBasicMeta)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case DATUM_MAP_META:
      return getDatumMapMeta();

    case RC_BASIC_META:
      return getRcBasicMeta();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case DATUM_MAP_META:
      return isSetDatumMapMeta();
    case RC_BASIC_META:
      return isSetRcBasicMeta();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SLFileMeta)
      return this.equals((SLFileMeta)that);
    return false;
  }

  public boolean equals(SLFileMeta that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_datumMapMeta = true && this.isSetDatumMapMeta();
    boolean that_present_datumMapMeta = true && that.isSetDatumMapMeta();
    if (this_present_datumMapMeta || that_present_datumMapMeta) {
      if (!(this_present_datumMapMeta && that_present_datumMapMeta))
        return false;
      if (!this.datumMapMeta.equals(that.datumMapMeta))
        return false;
    }

    boolean this_present_rcBasicMeta = true && this.isSetRcBasicMeta();
    boolean that_present_rcBasicMeta = true && that.isSetRcBasicMeta();
    if (this_present_rcBasicMeta || that_present_rcBasicMeta) {
      if (!(this_present_rcBasicMeta && that_present_rcBasicMeta))
        return false;
      if (!this.rcBasicMeta.equals(that.rcBasicMeta))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_datumMapMeta = true && (isSetDatumMapMeta());
    list.add(present_datumMapMeta);
    if (present_datumMapMeta)
      list.add(datumMapMeta);

    boolean present_rcBasicMeta = true && (isSetRcBasicMeta());
    list.add(present_rcBasicMeta);
    if (present_rcBasicMeta)
      list.add(rcBasicMeta);

    return list.hashCode();
  }

  @Override
  public int compareTo(SLFileMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDatumMapMeta()).compareTo(other.isSetDatumMapMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatumMapMeta()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.datumMapMeta, other.datumMapMeta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRcBasicMeta()).compareTo(other.isSetRcBasicMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRcBasicMeta()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.rcBasicMeta, other.rcBasicMeta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SLFileMeta(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetDatumMapMeta()) {
      if (!first) sb.append(", ");
      sb.append("datumMapMeta:");
      if (this.datumMapMeta == null) {
        sb.append("null");
      } else {
        sb.append(this.datumMapMeta);
      }
      first = false;
    }
    if (isSetRcBasicMeta()) {
      if (!first) sb.append(", ");
      sb.append("rcBasicMeta:");
      if (this.rcBasicMeta == null) {
        sb.append("null");
      } else {
        sb.append(this.rcBasicMeta);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (datumMapMeta != null) {
      datumMapMeta.validate();
    }
    if (rcBasicMeta != null) {
      rcBasicMeta.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SLFileMetaStandardSchemeFactory implements SchemeFactory {
    public SLFileMetaStandardScheme getScheme() {
      return new SLFileMetaStandardScheme();
    }
  }

  private static class SLFileMetaStandardScheme extends StandardScheme<SLFileMeta> {

    public void read(libthrift091.protocol.TProtocol iprot, SLFileMeta struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.type = com.xiaomi.infra.galaxy.sds.thrift.SLFileType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATUM_MAP_META
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.datumMapMeta = new DatumMapMeta();
              struct.datumMapMeta.read(iprot);
              struct.setDatumMapMetaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RC_BASIC_META
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.rcBasicMeta = new RCBasicMeta();
              struct.rcBasicMeta.read(iprot);
              struct.setRcBasicMetaIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, SLFileMeta struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.datumMapMeta != null) {
        if (struct.isSetDatumMapMeta()) {
          oprot.writeFieldBegin(DATUM_MAP_META_FIELD_DESC);
          struct.datumMapMeta.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rcBasicMeta != null) {
        if (struct.isSetRcBasicMeta()) {
          oprot.writeFieldBegin(RC_BASIC_META_FIELD_DESC);
          struct.rcBasicMeta.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SLFileMetaTupleSchemeFactory implements SchemeFactory {
    public SLFileMetaTupleScheme getScheme() {
      return new SLFileMetaTupleScheme();
    }
  }

  private static class SLFileMetaTupleScheme extends TupleScheme<SLFileMeta> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SLFileMeta struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetDatumMapMeta()) {
        optionals.set(1);
      }
      if (struct.isSetRcBasicMeta()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetDatumMapMeta()) {
        struct.datumMapMeta.write(oprot);
      }
      if (struct.isSetRcBasicMeta()) {
        struct.rcBasicMeta.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SLFileMeta struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.type = com.xiaomi.infra.galaxy.sds.thrift.SLFileType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.datumMapMeta = new DatumMapMeta();
        struct.datumMapMeta.read(iprot);
        struct.setDatumMapMetaIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rcBasicMeta = new RCBasicMeta();
        struct.rcBasicMeta.read(iprot);
        struct.setRcBasicMetaIsSet(true);
      }
    }
  }

}

