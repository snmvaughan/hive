/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class DropDatabaseRequest implements org.apache.thrift.TBase<DropDatabaseRequest, DropDatabaseRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DropDatabaseRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DropDatabaseRequest");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catalogName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IGNORE_UNKNOWN_DB_FIELD_DESC = new org.apache.thrift.protocol.TField("ignoreUnknownDb", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField DELETE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("deleteData", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField CASCADE_FIELD_DESC = new org.apache.thrift.protocol.TField("cascade", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField SOFT_DELETE_FIELD_DESC = new org.apache.thrift.protocol.TField("softDelete", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnId", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField DELETE_MANAGED_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("deleteManagedDir", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DropDatabaseRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DropDatabaseRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String catalogName; // optional
  private boolean ignoreUnknownDb; // required
  private boolean deleteData; // required
  private boolean cascade; // required
  private boolean softDelete; // optional
  private long txnId; // optional
  private boolean deleteManagedDir; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    CATALOG_NAME((short)2, "catalogName"),
    IGNORE_UNKNOWN_DB((short)3, "ignoreUnknownDb"),
    DELETE_DATA((short)4, "deleteData"),
    CASCADE((short)5, "cascade"),
    SOFT_DELETE((short)6, "softDelete"),
    TXN_ID((short)7, "txnId"),
    DELETE_MANAGED_DIR((short)8, "deleteManagedDir");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // CATALOG_NAME
          return CATALOG_NAME;
        case 3: // IGNORE_UNKNOWN_DB
          return IGNORE_UNKNOWN_DB;
        case 4: // DELETE_DATA
          return DELETE_DATA;
        case 5: // CASCADE
          return CASCADE;
        case 6: // SOFT_DELETE
          return SOFT_DELETE;
        case 7: // TXN_ID
          return TXN_ID;
        case 8: // DELETE_MANAGED_DIR
          return DELETE_MANAGED_DIR;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IGNOREUNKNOWNDB_ISSET_ID = 0;
  private static final int __DELETEDATA_ISSET_ID = 1;
  private static final int __CASCADE_ISSET_ID = 2;
  private static final int __SOFTDELETE_ISSET_ID = 3;
  private static final int __TXNID_ISSET_ID = 4;
  private static final int __DELETEMANAGEDDIR_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CATALOG_NAME,_Fields.SOFT_DELETE,_Fields.TXN_ID,_Fields.DELETE_MANAGED_DIR};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATALOG_NAME, new org.apache.thrift.meta_data.FieldMetaData("catalogName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IGNORE_UNKNOWN_DB, new org.apache.thrift.meta_data.FieldMetaData("ignoreUnknownDb", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DELETE_DATA, new org.apache.thrift.meta_data.FieldMetaData("deleteData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CASCADE, new org.apache.thrift.meta_data.FieldMetaData("cascade", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SOFT_DELETE, new org.apache.thrift.meta_data.FieldMetaData("softDelete", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txnId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DELETE_MANAGED_DIR, new org.apache.thrift.meta_data.FieldMetaData("deleteManagedDir", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DropDatabaseRequest.class, metaDataMap);
  }

  public DropDatabaseRequest() {
    this.softDelete = false;

    this.txnId = 0L;

    this.deleteManagedDir = true;

  }

  public DropDatabaseRequest(
    java.lang.String name,
    boolean ignoreUnknownDb,
    boolean deleteData,
    boolean cascade)
  {
    this();
    this.name = name;
    this.ignoreUnknownDb = ignoreUnknownDb;
    setIgnoreUnknownDbIsSet(true);
    this.deleteData = deleteData;
    setDeleteDataIsSet(true);
    this.cascade = cascade;
    setCascadeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DropDatabaseRequest(DropDatabaseRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetCatalogName()) {
      this.catalogName = other.catalogName;
    }
    this.ignoreUnknownDb = other.ignoreUnknownDb;
    this.deleteData = other.deleteData;
    this.cascade = other.cascade;
    this.softDelete = other.softDelete;
    this.txnId = other.txnId;
    this.deleteManagedDir = other.deleteManagedDir;
  }

  public DropDatabaseRequest deepCopy() {
    return new DropDatabaseRequest(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.catalogName = null;
    setIgnoreUnknownDbIsSet(false);
    this.ignoreUnknownDb = false;
    setDeleteDataIsSet(false);
    this.deleteData = false;
    setCascadeIsSet(false);
    this.cascade = false;
    this.softDelete = false;

    this.txnId = 0L;

    this.deleteManagedDir = true;

  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public void setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalogName() {
    return this.catalogName;
  }

  public void setCatalogName(@org.apache.thrift.annotation.Nullable java.lang.String catalogName) {
    this.catalogName = catalogName;
  }

  public void unsetCatalogName() {
    this.catalogName = null;
  }

  /** Returns true if field catalogName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalogName() {
    return this.catalogName != null;
  }

  public void setCatalogNameIsSet(boolean value) {
    if (!value) {
      this.catalogName = null;
    }
  }

  public boolean isIgnoreUnknownDb() {
    return this.ignoreUnknownDb;
  }

  public void setIgnoreUnknownDb(boolean ignoreUnknownDb) {
    this.ignoreUnknownDb = ignoreUnknownDb;
    setIgnoreUnknownDbIsSet(true);
  }

  public void unsetIgnoreUnknownDb() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IGNOREUNKNOWNDB_ISSET_ID);
  }

  /** Returns true if field ignoreUnknownDb is set (has been assigned a value) and false otherwise */
  public boolean isSetIgnoreUnknownDb() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IGNOREUNKNOWNDB_ISSET_ID);
  }

  public void setIgnoreUnknownDbIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IGNOREUNKNOWNDB_ISSET_ID, value);
  }

  public boolean isDeleteData() {
    return this.deleteData;
  }

  public void setDeleteData(boolean deleteData) {
    this.deleteData = deleteData;
    setDeleteDataIsSet(true);
  }

  public void unsetDeleteData() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DELETEDATA_ISSET_ID);
  }

  /** Returns true if field deleteData is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteData() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DELETEDATA_ISSET_ID);
  }

  public void setDeleteDataIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DELETEDATA_ISSET_ID, value);
  }

  public boolean isCascade() {
    return this.cascade;
  }

  public void setCascade(boolean cascade) {
    this.cascade = cascade;
    setCascadeIsSet(true);
  }

  public void unsetCascade() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CASCADE_ISSET_ID);
  }

  /** Returns true if field cascade is set (has been assigned a value) and false otherwise */
  public boolean isSetCascade() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CASCADE_ISSET_ID);
  }

  public void setCascadeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CASCADE_ISSET_ID, value);
  }

  public boolean isSoftDelete() {
    return this.softDelete;
  }

  public void setSoftDelete(boolean softDelete) {
    this.softDelete = softDelete;
    setSoftDeleteIsSet(true);
  }

  public void unsetSoftDelete() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SOFTDELETE_ISSET_ID);
  }

  /** Returns true if field softDelete is set (has been assigned a value) and false otherwise */
  public boolean isSetSoftDelete() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SOFTDELETE_ISSET_ID);
  }

  public void setSoftDeleteIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SOFTDELETE_ISSET_ID, value);
  }

  public long getTxnId() {
    return this.txnId;
  }

  public void setTxnId(long txnId) {
    this.txnId = txnId;
    setTxnIdIsSet(true);
  }

  public void unsetTxnId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnId is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public boolean isDeleteManagedDir() {
    return this.deleteManagedDir;
  }

  public void setDeleteManagedDir(boolean deleteManagedDir) {
    this.deleteManagedDir = deleteManagedDir;
    setDeleteManagedDirIsSet(true);
  }

  public void unsetDeleteManagedDir() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DELETEMANAGEDDIR_ISSET_ID);
  }

  /** Returns true if field deleteManagedDir is set (has been assigned a value) and false otherwise */
  public boolean isSetDeleteManagedDir() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DELETEMANAGEDDIR_ISSET_ID);
  }

  public void setDeleteManagedDirIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DELETEMANAGEDDIR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case CATALOG_NAME:
      if (value == null) {
        unsetCatalogName();
      } else {
        setCatalogName((java.lang.String)value);
      }
      break;

    case IGNORE_UNKNOWN_DB:
      if (value == null) {
        unsetIgnoreUnknownDb();
      } else {
        setIgnoreUnknownDb((java.lang.Boolean)value);
      }
      break;

    case DELETE_DATA:
      if (value == null) {
        unsetDeleteData();
      } else {
        setDeleteData((java.lang.Boolean)value);
      }
      break;

    case CASCADE:
      if (value == null) {
        unsetCascade();
      } else {
        setCascade((java.lang.Boolean)value);
      }
      break;

    case SOFT_DELETE:
      if (value == null) {
        unsetSoftDelete();
      } else {
        setSoftDelete((java.lang.Boolean)value);
      }
      break;

    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((java.lang.Long)value);
      }
      break;

    case DELETE_MANAGED_DIR:
      if (value == null) {
        unsetDeleteManagedDir();
      } else {
        setDeleteManagedDir((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case CATALOG_NAME:
      return getCatalogName();

    case IGNORE_UNKNOWN_DB:
      return isIgnoreUnknownDb();

    case DELETE_DATA:
      return isDeleteData();

    case CASCADE:
      return isCascade();

    case SOFT_DELETE:
      return isSoftDelete();

    case TXN_ID:
      return getTxnId();

    case DELETE_MANAGED_DIR:
      return isDeleteManagedDir();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case CATALOG_NAME:
      return isSetCatalogName();
    case IGNORE_UNKNOWN_DB:
      return isSetIgnoreUnknownDb();
    case DELETE_DATA:
      return isSetDeleteData();
    case CASCADE:
      return isSetCascade();
    case SOFT_DELETE:
      return isSetSoftDelete();
    case TXN_ID:
      return isSetTxnId();
    case DELETE_MANAGED_DIR:
      return isSetDeleteManagedDir();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DropDatabaseRequest)
      return this.equals((DropDatabaseRequest)that);
    return false;
  }

  public boolean equals(DropDatabaseRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_catalogName = true && this.isSetCatalogName();
    boolean that_present_catalogName = true && that.isSetCatalogName();
    if (this_present_catalogName || that_present_catalogName) {
      if (!(this_present_catalogName && that_present_catalogName))
        return false;
      if (!this.catalogName.equals(that.catalogName))
        return false;
    }

    boolean this_present_ignoreUnknownDb = true;
    boolean that_present_ignoreUnknownDb = true;
    if (this_present_ignoreUnknownDb || that_present_ignoreUnknownDb) {
      if (!(this_present_ignoreUnknownDb && that_present_ignoreUnknownDb))
        return false;
      if (this.ignoreUnknownDb != that.ignoreUnknownDb)
        return false;
    }

    boolean this_present_deleteData = true;
    boolean that_present_deleteData = true;
    if (this_present_deleteData || that_present_deleteData) {
      if (!(this_present_deleteData && that_present_deleteData))
        return false;
      if (this.deleteData != that.deleteData)
        return false;
    }

    boolean this_present_cascade = true;
    boolean that_present_cascade = true;
    if (this_present_cascade || that_present_cascade) {
      if (!(this_present_cascade && that_present_cascade))
        return false;
      if (this.cascade != that.cascade)
        return false;
    }

    boolean this_present_softDelete = true && this.isSetSoftDelete();
    boolean that_present_softDelete = true && that.isSetSoftDelete();
    if (this_present_softDelete || that_present_softDelete) {
      if (!(this_present_softDelete && that_present_softDelete))
        return false;
      if (this.softDelete != that.softDelete)
        return false;
    }

    boolean this_present_txnId = true && this.isSetTxnId();
    boolean that_present_txnId = true && that.isSetTxnId();
    if (this_present_txnId || that_present_txnId) {
      if (!(this_present_txnId && that_present_txnId))
        return false;
      if (this.txnId != that.txnId)
        return false;
    }

    boolean this_present_deleteManagedDir = true && this.isSetDeleteManagedDir();
    boolean that_present_deleteManagedDir = true && that.isSetDeleteManagedDir();
    if (this_present_deleteManagedDir || that_present_deleteManagedDir) {
      if (!(this_present_deleteManagedDir && that_present_deleteManagedDir))
        return false;
      if (this.deleteManagedDir != that.deleteManagedDir)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatalogName()) ? 131071 : 524287);
    if (isSetCatalogName())
      hashCode = hashCode * 8191 + catalogName.hashCode();

    hashCode = hashCode * 8191 + ((ignoreUnknownDb) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((deleteData) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((cascade) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetSoftDelete()) ? 131071 : 524287);
    if (isSetSoftDelete())
      hashCode = hashCode * 8191 + ((softDelete) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTxnId()) ? 131071 : 524287);
    if (isSetTxnId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txnId);

    hashCode = hashCode * 8191 + ((isSetDeleteManagedDir()) ? 131071 : 524287);
    if (isSetDeleteManagedDir())
      hashCode = hashCode * 8191 + ((deleteManagedDir) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(DropDatabaseRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatalogName(), other.isSetCatalogName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalogName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalogName, other.catalogName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIgnoreUnknownDb(), other.isSetIgnoreUnknownDb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIgnoreUnknownDb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ignoreUnknownDb, other.ignoreUnknownDb);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDeleteData(), other.isSetDeleteData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleteData, other.deleteData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCascade(), other.isSetCascade());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCascade()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cascade, other.cascade);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSoftDelete(), other.isSetSoftDelete());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSoftDelete()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.softDelete, other.softDelete);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTxnId(), other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnId, other.txnId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDeleteManagedDir(), other.isSetDeleteManagedDir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeleteManagedDir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deleteManagedDir, other.deleteManagedDir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DropDatabaseRequest(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetCatalogName()) {
      if (!first) sb.append(", ");
      sb.append("catalogName:");
      if (this.catalogName == null) {
        sb.append("null");
      } else {
        sb.append(this.catalogName);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("ignoreUnknownDb:");
    sb.append(this.ignoreUnknownDb);
    first = false;
    if (!first) sb.append(", ");
    sb.append("deleteData:");
    sb.append(this.deleteData);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cascade:");
    sb.append(this.cascade);
    first = false;
    if (isSetSoftDelete()) {
      if (!first) sb.append(", ");
      sb.append("softDelete:");
      sb.append(this.softDelete);
      first = false;
    }
    if (isSetTxnId()) {
      if (!first) sb.append(", ");
      sb.append("txnId:");
      sb.append(this.txnId);
      first = false;
    }
    if (isSetDeleteManagedDir()) {
      if (!first) sb.append(", ");
      sb.append("deleteManagedDir:");
      sb.append(this.deleteManagedDir);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!isSetIgnoreUnknownDb()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ignoreUnknownDb' is unset! Struct:" + toString());
    }

    if (!isSetDeleteData()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'deleteData' is unset! Struct:" + toString());
    }

    if (!isSetCascade()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cascade' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DropDatabaseRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DropDatabaseRequestStandardScheme getScheme() {
      return new DropDatabaseRequestStandardScheme();
    }
  }

  private static class DropDatabaseRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<DropDatabaseRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DropDatabaseRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATALOG_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalogName = iprot.readString();
              struct.setCatalogNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IGNORE_UNKNOWN_DB
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ignoreUnknownDb = iprot.readBool();
              struct.setIgnoreUnknownDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DELETE_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.deleteData = iprot.readBool();
              struct.setDeleteDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CASCADE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.cascade = iprot.readBool();
              struct.setCascadeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SOFT_DELETE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.softDelete = iprot.readBool();
              struct.setSoftDeleteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnId = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // DELETE_MANAGED_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.deleteManagedDir = iprot.readBool();
              struct.setDeleteManagedDirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DropDatabaseRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.catalogName != null) {
        if (struct.isSetCatalogName()) {
          oprot.writeFieldBegin(CATALOG_NAME_FIELD_DESC);
          oprot.writeString(struct.catalogName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(IGNORE_UNKNOWN_DB_FIELD_DESC);
      oprot.writeBool(struct.ignoreUnknownDb);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DELETE_DATA_FIELD_DESC);
      oprot.writeBool(struct.deleteData);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CASCADE_FIELD_DESC);
      oprot.writeBool(struct.cascade);
      oprot.writeFieldEnd();
      if (struct.isSetSoftDelete()) {
        oprot.writeFieldBegin(SOFT_DELETE_FIELD_DESC);
        oprot.writeBool(struct.softDelete);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txnId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDeleteManagedDir()) {
        oprot.writeFieldBegin(DELETE_MANAGED_DIR_FIELD_DESC);
        oprot.writeBool(struct.deleteManagedDir);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DropDatabaseRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DropDatabaseRequestTupleScheme getScheme() {
      return new DropDatabaseRequestTupleScheme();
    }
  }

  private static class DropDatabaseRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<DropDatabaseRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DropDatabaseRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeBool(struct.ignoreUnknownDb);
      oprot.writeBool(struct.deleteData);
      oprot.writeBool(struct.cascade);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatalogName()) {
        optionals.set(0);
      }
      if (struct.isSetSoftDelete()) {
        optionals.set(1);
      }
      if (struct.isSetTxnId()) {
        optionals.set(2);
      }
      if (struct.isSetDeleteManagedDir()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCatalogName()) {
        oprot.writeString(struct.catalogName);
      }
      if (struct.isSetSoftDelete()) {
        oprot.writeBool(struct.softDelete);
      }
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txnId);
      }
      if (struct.isSetDeleteManagedDir()) {
        oprot.writeBool(struct.deleteManagedDir);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DropDatabaseRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.ignoreUnknownDb = iprot.readBool();
      struct.setIgnoreUnknownDbIsSet(true);
      struct.deleteData = iprot.readBool();
      struct.setDeleteDataIsSet(true);
      struct.cascade = iprot.readBool();
      struct.setCascadeIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.catalogName = iprot.readString();
        struct.setCatalogNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.softDelete = iprot.readBool();
        struct.setSoftDeleteIsSet(true);
      }
      if (incoming.get(2)) {
        struct.txnId = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.deleteManagedDir = iprot.readBool();
        struct.setDeleteManagedDirIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

