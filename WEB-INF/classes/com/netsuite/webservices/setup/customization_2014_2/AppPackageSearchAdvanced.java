/**
 * AppPackageSearchAdvanced.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2014_2;

public class AppPackageSearchAdvanced  extends com.netsuite.webservices.platform.core_2014_2.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.setup.customization_2014_2.AppPackageSearch criteria;

    private com.netsuite.webservices.setup.customization_2014_2.AppPackageSearchRow columns;

    private java.lang.String savedSearchId;  // attribute

    private java.lang.String savedSearchScriptId;  // attribute

    public AppPackageSearchAdvanced() {
    }

    public AppPackageSearchAdvanced(
           java.lang.String savedSearchId,
           java.lang.String savedSearchScriptId,
           com.netsuite.webservices.setup.customization_2014_2.AppPackageSearch criteria,
           com.netsuite.webservices.setup.customization_2014_2.AppPackageSearchRow columns) {
        this.savedSearchId = savedSearchId;
        this.savedSearchScriptId = savedSearchScriptId;
        this.criteria = criteria;
        this.columns = columns;
    }


    /**
     * Gets the criteria value for this AppPackageSearchAdvanced.
     * 
     * @return criteria
     */
    public com.netsuite.webservices.setup.customization_2014_2.AppPackageSearch getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this AppPackageSearchAdvanced.
     * 
     * @param criteria
     */
    public void setCriteria(com.netsuite.webservices.setup.customization_2014_2.AppPackageSearch criteria) {
        this.criteria = criteria;
    }


    /**
     * Gets the columns value for this AppPackageSearchAdvanced.
     * 
     * @return columns
     */
    public com.netsuite.webservices.setup.customization_2014_2.AppPackageSearchRow getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this AppPackageSearchAdvanced.
     * 
     * @param columns
     */
    public void setColumns(com.netsuite.webservices.setup.customization_2014_2.AppPackageSearchRow columns) {
        this.columns = columns;
    }


    /**
     * Gets the savedSearchId value for this AppPackageSearchAdvanced.
     * 
     * @return savedSearchId
     */
    public java.lang.String getSavedSearchId() {
        return savedSearchId;
    }


    /**
     * Sets the savedSearchId value for this AppPackageSearchAdvanced.
     * 
     * @param savedSearchId
     */
    public void setSavedSearchId(java.lang.String savedSearchId) {
        this.savedSearchId = savedSearchId;
    }


    /**
     * Gets the savedSearchScriptId value for this AppPackageSearchAdvanced.
     * 
     * @return savedSearchScriptId
     */
    public java.lang.String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }


    /**
     * Sets the savedSearchScriptId value for this AppPackageSearchAdvanced.
     * 
     * @param savedSearchScriptId
     */
    public void setSavedSearchScriptId(java.lang.String savedSearchScriptId) {
        this.savedSearchScriptId = savedSearchScriptId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppPackageSearchAdvanced)) return false;
        AppPackageSearchAdvanced other = (AppPackageSearchAdvanced) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              this.criteria.equals(other.getCriteria()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              this.columns.equals(other.getColumns()))) &&
            ((this.savedSearchId==null && other.getSavedSearchId()==null) || 
             (this.savedSearchId!=null &&
              this.savedSearchId.equals(other.getSavedSearchId()))) &&
            ((this.savedSearchScriptId==null && other.getSavedSearchScriptId()==null) || 
             (this.savedSearchScriptId!=null &&
              this.savedSearchScriptId.equals(other.getSavedSearchScriptId())));
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
        if (getCriteria() != null) {
            _hashCode += getCriteria().hashCode();
        }
        if (getColumns() != null) {
            _hashCode += getColumns().hashCode();
        }
        if (getSavedSearchId() != null) {
            _hashCode += getSavedSearchId().hashCode();
        }
        if (getSavedSearchScriptId() != null) {
            _hashCode += getSavedSearchScriptId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppPackageSearchAdvanced.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppPackageSearchAdvanced"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("savedSearchId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "savedSearchId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("savedSearchScriptId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "savedSearchScriptId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppPackageSearch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppPackageSearchRow"));
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
