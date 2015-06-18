/**
 * SearchColumnSelectCustomField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2014_2;

public class SearchColumnSelectCustomField  extends com.netsuite.webservices.platform.core_2014_2.SearchColumnCustomField  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.ListOrRecordRef searchValue;

    public SearchColumnSelectCustomField() {
    }

    public SearchColumnSelectCustomField(
           java.lang.String internalId,
           java.lang.String scriptId,
           java.lang.String customLabel,
           com.netsuite.webservices.platform.core_2014_2.ListOrRecordRef searchValue) {
        super(
            internalId,
            scriptId,
            customLabel);
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchValue value for this SearchColumnSelectCustomField.
     * 
     * @return searchValue
     */
    public com.netsuite.webservices.platform.core_2014_2.ListOrRecordRef getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchColumnSelectCustomField.
     * 
     * @param searchValue
     */
    public void setSearchValue(com.netsuite.webservices.platform.core_2014_2.ListOrRecordRef searchValue) {
        this.searchValue = searchValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchColumnSelectCustomField)) return false;
        SearchColumnSelectCustomField other = (SearchColumnSelectCustomField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              this.searchValue.equals(other.getSearchValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSearchValue() != null) {
            _hashCode += getSearchValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchColumnSelectCustomField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnSelectCustomField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "ListOrRecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}