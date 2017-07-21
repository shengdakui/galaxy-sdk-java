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
 * 存在快照的表视图
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-21")
public class SnapshotTableView implements libthrift091.TBase<SnapshotTableView, SnapshotTableView._Fields>, java.io.Serializable, Cloneable, Comparable<SnapshotTableView> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SnapshotTableView");

  private static final libthrift091.protocol.TField TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("tableName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField TABLE_EXIST_FIELD_DESC = new libthrift091.protocol.TField("tableExist", libthrift091.protocol.TType.BOOL, (short)2);
  private static final libthrift091.protocol.TField DELETE_TIME_FIELD_DESC = new libthrift091.protocol.TField("deleteTime", libthrift091.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SnapshotTableViewStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SnapshotTableViewTupleSchemeFactory());
  }

  /**
   * 表名
   */
  public String tableName; // optional
  /**
   * 表是否存在
   */
  public boolean tableExist; // optional
  /**
   * 表的删除时间
   */
  public long deleteTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 表名
     */
    TABLE_NAME((short)1, "tableName"),
    /**
     * 表是否存在
     */
    TABLE_EXIST((short)2, "tableExist"),
    /**
     * 表的删除时间
     */
    DELETE_TIME((short)3, "deleteTime");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // TABLE_EXIST
          return TABLE_EXIST;
        case 3: // DELETE_TIME
          return DELETE_TIME;
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
  private static final int __TABLEEXIST_ISSET_ID = 0;
  private static final int __DELETETIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE_NAME,_Fields.TABLE_EXIST};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new libthrift091.meta_data.FieldMetaData("tableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_EXIST, new libthrift091.meta_data.FieldMetaData("tableExist", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DELETE_TIME, new libthrift091.meta_data.FieldMetaData("deleteTime", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SnapshotTableView.class, metaDataMap);
  }

  public SnapshotTableView() {
  }

  public SnapshotTableView(
    long deleteTime)
  {
    this();
    this.deleteTime = deleteTime;
    setDeleteTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnapshotTableView(SnapshotTableView other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    this.tableExist = other.tableExist;
    this.deleteTime = other.deleteTime;
  }

  public SnapshotTableView deepCopy() {
    return new SnapshotTableView(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    setTableExistIsSet(false);
    this.tableExist = false;
    setDeleteTimeIsSet(false);
    this.deleteTime = 0;
  }

  /**
   * 表名
   */
  public String getTableName() {
    return this.tableName;
  }

  /**
   * 表名
   */
  public SnapshotTableView setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  /**
   * 表是否存在
   */
  public boolean isTableExist() {
    return this.tableExist;
  }

  /**
   * 表是否存在
   */
  public SnapshotTableView setTableExist(boolean tableExist) {
    this.tableExist = tableExist;
    setTableExistIsSet(true);
    return this;
  }

  public void unsetTableExist() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TABLEEXIST_ISSET_ID);
  }

  /** Returns true if field tableExist is set (has been assigned a value) and false otherwise */
  public boolean isSetTableExist() {
    return EncodingUtils.testBit(__isset_bitfield, __TABLEEXIST_ISSET_ID);
  }

  public void setTableExistIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TABLEEXIST_ISSET_ID, value);
  }

  /**
   * 表的删除时间
   */
  public long getDeleteTime() {
    return this.deleteTime;
  }

  /**
   * 表的删除时间
   */
  public SnapshotTableView setDeleteTime(long deleteTime) {
    this.deleteTime = deleteTime;
    setDeleteTimeIsSet(true);
    return this;
  }

  public void unsetDeleteTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DELETETIME_ISSET_ID);
  }

  /** Returns true if field deleteTime is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteTime() {
    return EncodingUtils.testBit(__isset_bitfield, __DELETETIME_ISSET_ID);
  }

  public void setDeleteTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DELETETIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case TABLE_EXIST:
      if (value == null) {
        unsetTableExist();
      } else {
        setTableExist((Boolean)value);
      }
      break;

    case DELETE_TIME:
      if (value == null) {
        unsetDeleteTime();
      } else {
        setDeleteTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case TABLE_EXIST:
      return Boolean.valueOf(isTableExist());

    case DELETE_TIME:
      return Long.valueOf(getDeleteTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case TABLE_EXIST:
      return isSetTableExist();
    case DELETE_TIME:
      return isSetDeleteTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SnapshotTableView)
      return this.equals((SnapshotTableView)that);
    return false;
  }

  public boolean equals(SnapshotTableView that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_tableExist = true && this.isSetTableExist();
    boolean that_present_tableExist = true && that.isSetTableExist();
    if (this_present_tableExist || that_present_tableExist) {
      if (!(this_present_tableExist && that_present_tableExist))
        return false;
      if (this.tableExist != that.tableExist)
        return false;
    }

    boolean this_present_deleteTime = true;
    boolean that_present_deleteTime = true;
    if (this_present_deleteTime || that_present_deleteTime) {
      if (!(this_present_deleteTime && that_present_deleteTime))
        return false;
      if (this.deleteTime != that.deleteTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tableName = true && (isSetTableName());
    list.add(present_tableName);
    if (present_tableName)
      list.add(tableName);

    boolean present_tableExist = true && (isSetTableExist());
    list.add(present_tableExist);
    if (present_tableExist)
      list.add(tableExist);

    boolean present_deleteTime = true;
    list.add(present_deleteTime);
    if (present_deleteTime)
      list.add(deleteTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(SnapshotTableView other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableExist()).compareTo(other.isSetTableExist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableExist()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.tableExist, other.tableExist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeleteTime()).compareTo(other.isSetDeleteTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.deleteTime, other.deleteTime);
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
    StringBuilder sb = new StringBuilder("SnapshotTableView(");
    boolean first = true;

    if (isSetTableName()) {
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (isSetTableExist()) {
      if (!first) sb.append(", ");
      sb.append("tableExist:");
      sb.append(this.tableExist);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("deleteTime:");
    sb.append(this.deleteTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SnapshotTableViewStandardSchemeFactory implements SchemeFactory {
    public SnapshotTableViewStandardScheme getScheme() {
      return new SnapshotTableViewStandardScheme();
    }
  }

  private static class SnapshotTableViewStandardScheme extends StandardScheme<SnapshotTableView> {

    public void read(libthrift091.protocol.TProtocol iprot, SnapshotTableView struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_EXIST
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.tableExist = iprot.readBool();
              struct.setTableExistIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DELETE_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.deleteTime = iprot.readI64();
              struct.setDeleteTimeIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SnapshotTableView struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTableExist()) {
        oprot.writeFieldBegin(TABLE_EXIST_FIELD_DESC);
        oprot.writeBool(struct.tableExist);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DELETE_TIME_FIELD_DESC);
      oprot.writeI64(struct.deleteTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SnapshotTableViewTupleSchemeFactory implements SchemeFactory {
    public SnapshotTableViewTupleScheme getScheme() {
      return new SnapshotTableViewTupleScheme();
    }
  }

  private static class SnapshotTableViewTupleScheme extends TupleScheme<SnapshotTableView> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SnapshotTableView struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTableName()) {
        optionals.set(0);
      }
      if (struct.isSetTableExist()) {
        optionals.set(1);
      }
      if (struct.isSetDeleteTime()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetTableExist()) {
        oprot.writeBool(struct.tableExist);
      }
      if (struct.isSetDeleteTime()) {
        oprot.writeI64(struct.deleteTime);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SnapshotTableView struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tableExist = iprot.readBool();
        struct.setTableExistIsSet(true);
      }
      if (incoming.get(2)) {
        struct.deleteTime = iprot.readI64();
        struct.setDeleteTimeIsSet(true);
      }
    }
  }

}

