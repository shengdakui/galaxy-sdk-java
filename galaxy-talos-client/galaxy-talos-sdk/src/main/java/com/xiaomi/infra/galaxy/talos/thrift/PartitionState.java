/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-8-23")
public class PartitionState implements libthrift091.TBase<PartitionState, PartitionState._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionState> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("PartitionState");

  private static final libthrift091.protocol.TField PARTITION_ID_FIELD_DESC = new libthrift091.protocol.TField("partitionId", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField START_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("startOffset", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField LASTEST_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("lastestOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("messageNumber", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField MESSAGE_BYTES_FIELD_DESC = new libthrift091.protocol.TField("messageBytes", libthrift091.protocol.TType.I64, (short)5);
  private static final libthrift091.protocol.TField TOTAL_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("totalMessageNumber", libthrift091.protocol.TType.I64, (short)6);
  private static final libthrift091.protocol.TField TOTAL_MESSAGE_BYTES_FIELD_DESC = new libthrift091.protocol.TField("totalMessageBytes", libthrift091.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PartitionStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PartitionStateTupleSchemeFactory());
  }

  /**
   * Partition ID for this topic;
   * 
   */
  public int partitionId; // required
  /**
   * The message start offset for this partition;
   * 
   */
  public long startOffset; // required
  /**
   * The message lastest offset for this partition;
   * 
   */
  public long lastestOffset; // required
  /**
   * The message number in this partition;
   * 
   */
  public long messageNumber; // required
  /**
   * The message bytes in this partition;
   * 
   */
  public long messageBytes; // required
  /**
   * The total message number of this partition
   * optional for compatible forward
   * 
   */
  public long totalMessageNumber; // optional
  /**
   * The total message bytes of this partition
   * optional for compatible forward
   * 
   */
  public long totalMessageBytes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Partition ID for this topic;
     * 
     */
    PARTITION_ID((short)1, "partitionId"),
    /**
     * The message start offset for this partition;
     * 
     */
    START_OFFSET((short)2, "startOffset"),
    /**
     * The message lastest offset for this partition;
     * 
     */
    LASTEST_OFFSET((short)3, "lastestOffset"),
    /**
     * The message number in this partition;
     * 
     */
    MESSAGE_NUMBER((short)4, "messageNumber"),
    /**
     * The message bytes in this partition;
     * 
     */
    MESSAGE_BYTES((short)5, "messageBytes"),
    /**
     * The total message number of this partition
     * optional for compatible forward
     * 
     */
    TOTAL_MESSAGE_NUMBER((short)6, "totalMessageNumber"),
    /**
     * The total message bytes of this partition
     * optional for compatible forward
     * 
     */
    TOTAL_MESSAGE_BYTES((short)7, "totalMessageBytes");

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
        case 1: // PARTITION_ID
          return PARTITION_ID;
        case 2: // START_OFFSET
          return START_OFFSET;
        case 3: // LASTEST_OFFSET
          return LASTEST_OFFSET;
        case 4: // MESSAGE_NUMBER
          return MESSAGE_NUMBER;
        case 5: // MESSAGE_BYTES
          return MESSAGE_BYTES;
        case 6: // TOTAL_MESSAGE_NUMBER
          return TOTAL_MESSAGE_NUMBER;
        case 7: // TOTAL_MESSAGE_BYTES
          return TOTAL_MESSAGE_BYTES;
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
  private static final int __PARTITIONID_ISSET_ID = 0;
  private static final int __STARTOFFSET_ISSET_ID = 1;
  private static final int __LASTESTOFFSET_ISSET_ID = 2;
  private static final int __MESSAGENUMBER_ISSET_ID = 3;
  private static final int __MESSAGEBYTES_ISSET_ID = 4;
  private static final int __TOTALMESSAGENUMBER_ISSET_ID = 5;
  private static final int __TOTALMESSAGEBYTES_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOTAL_MESSAGE_NUMBER,_Fields.TOTAL_MESSAGE_BYTES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITION_ID, new libthrift091.meta_data.FieldMetaData("partitionId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.START_OFFSET, new libthrift091.meta_data.FieldMetaData("startOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.LASTEST_OFFSET, new libthrift091.meta_data.FieldMetaData("lastestOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("messageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MESSAGE_BYTES, new libthrift091.meta_data.FieldMetaData("messageBytes", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.TOTAL_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("totalMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.TOTAL_MESSAGE_BYTES, new libthrift091.meta_data.FieldMetaData("totalMessageBytes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(PartitionState.class, metaDataMap);
  }

  public PartitionState() {
  }

  public PartitionState(
    int partitionId,
    long startOffset,
    long lastestOffset,
    long messageNumber,
    long messageBytes)
  {
    this();
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    this.startOffset = startOffset;
    setStartOffsetIsSet(true);
    this.lastestOffset = lastestOffset;
    setLastestOffsetIsSet(true);
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    this.messageBytes = messageBytes;
    setMessageBytesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionState(PartitionState other) {
    __isset_bitfield = other.__isset_bitfield;
    this.partitionId = other.partitionId;
    this.startOffset = other.startOffset;
    this.lastestOffset = other.lastestOffset;
    this.messageNumber = other.messageNumber;
    this.messageBytes = other.messageBytes;
    this.totalMessageNumber = other.totalMessageNumber;
    this.totalMessageBytes = other.totalMessageBytes;
  }

  public PartitionState deepCopy() {
    return new PartitionState(this);
  }

  @Override
  public void clear() {
    setPartitionIdIsSet(false);
    this.partitionId = 0;
    setStartOffsetIsSet(false);
    this.startOffset = 0;
    setLastestOffsetIsSet(false);
    this.lastestOffset = 0;
    setMessageNumberIsSet(false);
    this.messageNumber = 0;
    setMessageBytesIsSet(false);
    this.messageBytes = 0;
    setTotalMessageNumberIsSet(false);
    this.totalMessageNumber = 0;
    setTotalMessageBytesIsSet(false);
    this.totalMessageBytes = 0;
  }

  /**
   * Partition ID for this topic;
   * 
   */
  public int getPartitionId() {
    return this.partitionId;
  }

  /**
   * Partition ID for this topic;
   * 
   */
  public PartitionState setPartitionId(int partitionId) {
    this.partitionId = partitionId;
    setPartitionIdIsSet(true);
    return this;
  }

  public void unsetPartitionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  /** Returns true if field partitionId is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARTITIONID_ISSET_ID);
  }

  public void setPartitionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARTITIONID_ISSET_ID, value);
  }

  /**
   * The message start offset for this partition;
   * 
   */
  public long getStartOffset() {
    return this.startOffset;
  }

  /**
   * The message start offset for this partition;
   * 
   */
  public PartitionState setStartOffset(long startOffset) {
    this.startOffset = startOffset;
    setStartOffsetIsSet(true);
    return this;
  }

  public void unsetStartOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTOFFSET_ISSET_ID);
  }

  /** Returns true if field startOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetStartOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTOFFSET_ISSET_ID);
  }

  public void setStartOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTOFFSET_ISSET_ID, value);
  }

  /**
   * The message lastest offset for this partition;
   * 
   */
  public long getLastestOffset() {
    return this.lastestOffset;
  }

  /**
   * The message lastest offset for this partition;
   * 
   */
  public PartitionState setLastestOffset(long lastestOffset) {
    this.lastestOffset = lastestOffset;
    setLastestOffsetIsSet(true);
    return this;
  }

  public void unsetLastestOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTESTOFFSET_ISSET_ID);
  }

  /** Returns true if field lastestOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetLastestOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTESTOFFSET_ISSET_ID);
  }

  public void setLastestOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTESTOFFSET_ISSET_ID, value);
  }

  /**
   * The message number in this partition;
   * 
   */
  public long getMessageNumber() {
    return this.messageNumber;
  }

  /**
   * The message number in this partition;
   * 
   */
  public PartitionState setMessageNumber(long messageNumber) {
    this.messageNumber = messageNumber;
    setMessageNumberIsSet(true);
    return this;
  }

  public void unsetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field messageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID);
  }

  public void setMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The message bytes in this partition;
   * 
   */
  public long getMessageBytes() {
    return this.messageBytes;
  }

  /**
   * The message bytes in this partition;
   * 
   */
  public PartitionState setMessageBytes(long messageBytes) {
    this.messageBytes = messageBytes;
    setMessageBytesIsSet(true);
    return this;
  }

  public void unsetMessageBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEBYTES_ISSET_ID);
  }

  /** Returns true if field messageBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEBYTES_ISSET_ID);
  }

  public void setMessageBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEBYTES_ISSET_ID, value);
  }

  /**
   * The total message number of this partition
   * optional for compatible forward
   * 
   */
  public long getTotalMessageNumber() {
    return this.totalMessageNumber;
  }

  /**
   * The total message number of this partition
   * optional for compatible forward
   * 
   */
  public PartitionState setTotalMessageNumber(long totalMessageNumber) {
    this.totalMessageNumber = totalMessageNumber;
    setTotalMessageNumberIsSet(true);
    return this;
  }

  public void unsetTotalMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field totalMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALMESSAGENUMBER_ISSET_ID);
  }

  public void setTotalMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The total message bytes of this partition
   * optional for compatible forward
   * 
   */
  public long getTotalMessageBytes() {
    return this.totalMessageBytes;
  }

  /**
   * The total message bytes of this partition
   * optional for compatible forward
   * 
   */
  public PartitionState setTotalMessageBytes(long totalMessageBytes) {
    this.totalMessageBytes = totalMessageBytes;
    setTotalMessageBytesIsSet(true);
    return this;
  }

  public void unsetTotalMessageBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALMESSAGEBYTES_ISSET_ID);
  }

  /** Returns true if field totalMessageBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalMessageBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALMESSAGEBYTES_ISSET_ID);
  }

  public void setTotalMessageBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALMESSAGEBYTES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITION_ID:
      if (value == null) {
        unsetPartitionId();
      } else {
        setPartitionId((Integer)value);
      }
      break;

    case START_OFFSET:
      if (value == null) {
        unsetStartOffset();
      } else {
        setStartOffset((Long)value);
      }
      break;

    case LASTEST_OFFSET:
      if (value == null) {
        unsetLastestOffset();
      } else {
        setLastestOffset((Long)value);
      }
      break;

    case MESSAGE_NUMBER:
      if (value == null) {
        unsetMessageNumber();
      } else {
        setMessageNumber((Long)value);
      }
      break;

    case MESSAGE_BYTES:
      if (value == null) {
        unsetMessageBytes();
      } else {
        setMessageBytes((Long)value);
      }
      break;

    case TOTAL_MESSAGE_NUMBER:
      if (value == null) {
        unsetTotalMessageNumber();
      } else {
        setTotalMessageNumber((Long)value);
      }
      break;

    case TOTAL_MESSAGE_BYTES:
      if (value == null) {
        unsetTotalMessageBytes();
      } else {
        setTotalMessageBytes((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITION_ID:
      return Integer.valueOf(getPartitionId());

    case START_OFFSET:
      return Long.valueOf(getStartOffset());

    case LASTEST_OFFSET:
      return Long.valueOf(getLastestOffset());

    case MESSAGE_NUMBER:
      return Long.valueOf(getMessageNumber());

    case MESSAGE_BYTES:
      return Long.valueOf(getMessageBytes());

    case TOTAL_MESSAGE_NUMBER:
      return Long.valueOf(getTotalMessageNumber());

    case TOTAL_MESSAGE_BYTES:
      return Long.valueOf(getTotalMessageBytes());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITION_ID:
      return isSetPartitionId();
    case START_OFFSET:
      return isSetStartOffset();
    case LASTEST_OFFSET:
      return isSetLastestOffset();
    case MESSAGE_NUMBER:
      return isSetMessageNumber();
    case MESSAGE_BYTES:
      return isSetMessageBytes();
    case TOTAL_MESSAGE_NUMBER:
      return isSetTotalMessageNumber();
    case TOTAL_MESSAGE_BYTES:
      return isSetTotalMessageBytes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionState)
      return this.equals((PartitionState)that);
    return false;
  }

  public boolean equals(PartitionState that) {
    if (that == null)
      return false;

    boolean this_present_partitionId = true;
    boolean that_present_partitionId = true;
    if (this_present_partitionId || that_present_partitionId) {
      if (!(this_present_partitionId && that_present_partitionId))
        return false;
      if (this.partitionId != that.partitionId)
        return false;
    }

    boolean this_present_startOffset = true;
    boolean that_present_startOffset = true;
    if (this_present_startOffset || that_present_startOffset) {
      if (!(this_present_startOffset && that_present_startOffset))
        return false;
      if (this.startOffset != that.startOffset)
        return false;
    }

    boolean this_present_lastestOffset = true;
    boolean that_present_lastestOffset = true;
    if (this_present_lastestOffset || that_present_lastestOffset) {
      if (!(this_present_lastestOffset && that_present_lastestOffset))
        return false;
      if (this.lastestOffset != that.lastestOffset)
        return false;
    }

    boolean this_present_messageNumber = true;
    boolean that_present_messageNumber = true;
    if (this_present_messageNumber || that_present_messageNumber) {
      if (!(this_present_messageNumber && that_present_messageNumber))
        return false;
      if (this.messageNumber != that.messageNumber)
        return false;
    }

    boolean this_present_messageBytes = true;
    boolean that_present_messageBytes = true;
    if (this_present_messageBytes || that_present_messageBytes) {
      if (!(this_present_messageBytes && that_present_messageBytes))
        return false;
      if (this.messageBytes != that.messageBytes)
        return false;
    }

    boolean this_present_totalMessageNumber = true && this.isSetTotalMessageNumber();
    boolean that_present_totalMessageNumber = true && that.isSetTotalMessageNumber();
    if (this_present_totalMessageNumber || that_present_totalMessageNumber) {
      if (!(this_present_totalMessageNumber && that_present_totalMessageNumber))
        return false;
      if (this.totalMessageNumber != that.totalMessageNumber)
        return false;
    }

    boolean this_present_totalMessageBytes = true && this.isSetTotalMessageBytes();
    boolean that_present_totalMessageBytes = true && that.isSetTotalMessageBytes();
    if (this_present_totalMessageBytes || that_present_totalMessageBytes) {
      if (!(this_present_totalMessageBytes && that_present_totalMessageBytes))
        return false;
      if (this.totalMessageBytes != that.totalMessageBytes)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_partitionId = true;
    list.add(present_partitionId);
    if (present_partitionId)
      list.add(partitionId);

    boolean present_startOffset = true;
    list.add(present_startOffset);
    if (present_startOffset)
      list.add(startOffset);

    boolean present_lastestOffset = true;
    list.add(present_lastestOffset);
    if (present_lastestOffset)
      list.add(lastestOffset);

    boolean present_messageNumber = true;
    list.add(present_messageNumber);
    if (present_messageNumber)
      list.add(messageNumber);

    boolean present_messageBytes = true;
    list.add(present_messageBytes);
    if (present_messageBytes)
      list.add(messageBytes);

    boolean present_totalMessageNumber = true && (isSetTotalMessageNumber());
    list.add(present_totalMessageNumber);
    if (present_totalMessageNumber)
      list.add(totalMessageNumber);

    boolean present_totalMessageBytes = true && (isSetTotalMessageBytes());
    list.add(present_totalMessageBytes);
    if (present_totalMessageBytes)
      list.add(totalMessageBytes);

    return list.hashCode();
  }

  @Override
  public int compareTo(PartitionState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPartitionId()).compareTo(other.isSetPartitionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.partitionId, other.partitionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartOffset()).compareTo(other.isSetStartOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startOffset, other.startOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastestOffset()).compareTo(other.isSetLastestOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastestOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.lastestOffset, other.lastestOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageNumber()).compareTo(other.isSetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageNumber, other.messageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBytes()).compareTo(other.isSetMessageBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBytes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageBytes, other.messageBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalMessageNumber()).compareTo(other.isSetTotalMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.totalMessageNumber, other.totalMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalMessageBytes()).compareTo(other.isSetTotalMessageBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalMessageBytes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.totalMessageBytes, other.totalMessageBytes);
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
    StringBuilder sb = new StringBuilder("PartitionState(");
    boolean first = true;

    sb.append("partitionId:");
    sb.append(this.partitionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startOffset:");
    sb.append(this.startOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastestOffset:");
    sb.append(this.lastestOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageNumber:");
    sb.append(this.messageNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBytes:");
    sb.append(this.messageBytes);
    first = false;
    if (isSetTotalMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("totalMessageNumber:");
      sb.append(this.totalMessageNumber);
      first = false;
    }
    if (isSetTotalMessageBytes()) {
      if (!first) sb.append(", ");
      sb.append("totalMessageBytes:");
      sb.append(this.totalMessageBytes);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'partitionId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'startOffset' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'lastestOffset' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'messageNumber' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'messageBytes' because it's a primitive and you chose the non-beans generator.
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

  private static class PartitionStateStandardSchemeFactory implements SchemeFactory {
    public PartitionStateStandardScheme getScheme() {
      return new PartitionStateStandardScheme();
    }
  }

  private static class PartitionStateStandardScheme extends StandardScheme<PartitionState> {

    public void read(libthrift091.protocol.TProtocol iprot, PartitionState struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_ID
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.partitionId = iprot.readI32();
              struct.setPartitionIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startOffset = iprot.readI64();
              struct.setStartOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LASTEST_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.lastestOffset = iprot.readI64();
              struct.setLastestOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageNumber = iprot.readI64();
              struct.setMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MESSAGE_BYTES
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageBytes = iprot.readI64();
              struct.setMessageBytesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TOTAL_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.totalMessageNumber = iprot.readI64();
              struct.setTotalMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TOTAL_MESSAGE_BYTES
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.totalMessageBytes = iprot.readI64();
              struct.setTotalMessageBytesIsSet(true);
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
      if (!struct.isSetPartitionId()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'partitionId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetStartOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'startOffset' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLastestOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'lastestOffset' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageNumber' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMessageBytes()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageBytes' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, PartitionState struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PARTITION_ID_FIELD_DESC);
      oprot.writeI32(struct.partitionId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.startOffset);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LASTEST_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.lastestOffset);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI64(struct.messageNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MESSAGE_BYTES_FIELD_DESC);
      oprot.writeI64(struct.messageBytes);
      oprot.writeFieldEnd();
      if (struct.isSetTotalMessageNumber()) {
        oprot.writeFieldBegin(TOTAL_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeI64(struct.totalMessageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTotalMessageBytes()) {
        oprot.writeFieldBegin(TOTAL_MESSAGE_BYTES_FIELD_DESC);
        oprot.writeI64(struct.totalMessageBytes);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionStateTupleSchemeFactory implements SchemeFactory {
    public PartitionStateTupleScheme getScheme() {
      return new PartitionStateTupleScheme();
    }
  }

  private static class PartitionStateTupleScheme extends TupleScheme<PartitionState> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, PartitionState struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.partitionId);
      oprot.writeI64(struct.startOffset);
      oprot.writeI64(struct.lastestOffset);
      oprot.writeI64(struct.messageNumber);
      oprot.writeI64(struct.messageBytes);
      BitSet optionals = new BitSet();
      if (struct.isSetTotalMessageNumber()) {
        optionals.set(0);
      }
      if (struct.isSetTotalMessageBytes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTotalMessageNumber()) {
        oprot.writeI64(struct.totalMessageNumber);
      }
      if (struct.isSetTotalMessageBytes()) {
        oprot.writeI64(struct.totalMessageBytes);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, PartitionState struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.partitionId = iprot.readI32();
      struct.setPartitionIdIsSet(true);
      struct.startOffset = iprot.readI64();
      struct.setStartOffsetIsSet(true);
      struct.lastestOffset = iprot.readI64();
      struct.setLastestOffsetIsSet(true);
      struct.messageNumber = iprot.readI64();
      struct.setMessageNumberIsSet(true);
      struct.messageBytes = iprot.readI64();
      struct.setMessageBytesIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.totalMessageNumber = iprot.readI64();
        struct.setTotalMessageNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.totalMessageBytes = iprot.readI64();
        struct.setTotalMessageBytesIsSet(true);
      }
    }
  }

}

