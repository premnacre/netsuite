/**
 * EntityGroupPeriodSize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.relationships_2014_2.types;

public class EntityGroupPeriodSize implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityGroupPeriodSize(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __10minutes = "_10minutes";
    public static final java.lang.String __15minutes = "_15minutes";
    public static final java.lang.String __20minutes = "_20minutes";
    public static final java.lang.String __30minutes = "_30minutes";
    public static final java.lang.String __oneHour = "_oneHour";
    public static final EntityGroupPeriodSize _10minutes = new EntityGroupPeriodSize(__10minutes);
    public static final EntityGroupPeriodSize _15minutes = new EntityGroupPeriodSize(__15minutes);
    public static final EntityGroupPeriodSize _20minutes = new EntityGroupPeriodSize(__20minutes);
    public static final EntityGroupPeriodSize _30minutes = new EntityGroupPeriodSize(__30minutes);
    public static final EntityGroupPeriodSize _oneHour = new EntityGroupPeriodSize(__oneHour);
    public java.lang.String getValue() { return _value_;}
    public static EntityGroupPeriodSize fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityGroupPeriodSize enumeration = (EntityGroupPeriodSize)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityGroupPeriodSize fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityGroupPeriodSize.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.relationships_2014_2.lists.webservices.netsuite.com", "EntityGroupPeriodSize"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
