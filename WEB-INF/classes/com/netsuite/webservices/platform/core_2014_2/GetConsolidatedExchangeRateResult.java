/**
 * GetConsolidatedExchangeRateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2014_2;

public class GetConsolidatedExchangeRateResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.StatusDetail[] status;

    private com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRate[] consolidatedExchangeRateList;

    public GetConsolidatedExchangeRateResult() {
    }

    public GetConsolidatedExchangeRateResult(
           com.netsuite.webservices.platform.core_2014_2.StatusDetail[] status,
           com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRate[] consolidatedExchangeRateList) {
           this.status = status;
           this.consolidatedExchangeRateList = consolidatedExchangeRateList;
    }


    /**
     * Gets the status value for this GetConsolidatedExchangeRateResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2014_2.StatusDetail[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetConsolidatedExchangeRateResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2014_2.StatusDetail[] status) {
        this.status = status;
    }


    /**
     * Gets the consolidatedExchangeRateList value for this GetConsolidatedExchangeRateResult.
     * 
     * @return consolidatedExchangeRateList
     */
    public com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRate[] getConsolidatedExchangeRateList() {
        return consolidatedExchangeRateList;
    }


    /**
     * Sets the consolidatedExchangeRateList value for this GetConsolidatedExchangeRateResult.
     * 
     * @param consolidatedExchangeRateList
     */
    public void setConsolidatedExchangeRateList(com.netsuite.webservices.platform.core_2014_2.ConsolidatedExchangeRate[] consolidatedExchangeRateList) {
        this.consolidatedExchangeRateList = consolidatedExchangeRateList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConsolidatedExchangeRateResult)) return false;
        GetConsolidatedExchangeRateResult other = (GetConsolidatedExchangeRateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.consolidatedExchangeRateList==null && other.getConsolidatedExchangeRateList()==null) || 
             (this.consolidatedExchangeRateList!=null &&
              java.util.Arrays.equals(this.consolidatedExchangeRateList, other.getConsolidatedExchangeRateList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsolidatedExchangeRateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsolidatedExchangeRateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsolidatedExchangeRateList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetConsolidatedExchangeRateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "GetConsolidatedExchangeRateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedExchangeRateList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "consolidatedExchangeRateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "ConsolidatedExchangeRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "consolidatedExchangeRate"));
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