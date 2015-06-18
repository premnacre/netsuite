/**
 * TransactionColumnCustomFieldFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2014_2;

public class TransactionColumnCustomFieldFilter  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.RecordRef fldFilter;

    private java.lang.Boolean fldFilterChecked;

    private com.netsuite.webservices.setup.customization_2014_2.types.CustomizationFilterCompareType fldFilterCompareType;

    private java.lang.String fldFilterVal;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] fldFilterSelList;

    private java.lang.Boolean fldFilterNotNull;

    public TransactionColumnCustomFieldFilter() {
    }

    public TransactionColumnCustomFieldFilter(
           com.netsuite.webservices.platform.core_2014_2.RecordRef fldFilter,
           java.lang.Boolean fldFilterChecked,
           com.netsuite.webservices.setup.customization_2014_2.types.CustomizationFilterCompareType fldFilterCompareType,
           java.lang.String fldFilterVal,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] fldFilterSelList,
           java.lang.Boolean fldFilterNotNull) {
           this.fldFilter = fldFilter;
           this.fldFilterChecked = fldFilterChecked;
           this.fldFilterCompareType = fldFilterCompareType;
           this.fldFilterVal = fldFilterVal;
           this.fldFilterSelList = fldFilterSelList;
           this.fldFilterNotNull = fldFilterNotNull;
    }


    /**
     * Gets the fldFilter value for this TransactionColumnCustomFieldFilter.
     * 
     * @return fldFilter
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getFldFilter() {
        return fldFilter;
    }


    /**
     * Sets the fldFilter value for this TransactionColumnCustomFieldFilter.
     * 
     * @param fldFilter
     */
    public void setFldFilter(com.netsuite.webservices.platform.core_2014_2.RecordRef fldFilter) {
        this.fldFilter = fldFilter;
    }


    /**
     * Gets the fldFilterChecked value for this TransactionColumnCustomFieldFilter.
     * 
     * @return fldFilterChecked
     */
    public java.lang.Boolean getFldFilterChecked() {
        return fldFilterChecked;
    }


    /**
     * Sets the fldFilterChecked value for this TransactionColumnCustomFieldFilter.
     * 
     * @param fldFilterChecked
     */
    public void setFldFilterChecked(java.lang.Boolean fldFilterChecked) {
        this.fldFilterChecked = fldFilterChecked;
    }


    /**
     * Gets the fldFilterCompareType value for this TransactionColumnCustomFieldFilter.
     * 
     * @return fldFilterCompareType
     */
    public com.netsuite.webservices.setup.customization_2014_2.types.CustomizationFilterCompareType getFldFilterCompareType() {
        return fldFilterCompareType;
    }


    /**
     * Sets the fldFilterCompareType value for this TransactionColumnCustomFieldFilter.
     * 
     * @param fldFilterCompareType
     */
    public void setFldFilterCompareType(com.netsuite.webservices.setup.customization_2014_2.types.CustomizationFilterCompareType fldFilterCompareType) {
        this.fldFilterCompareType = fldFilterCompareType;
    }


    /**
     * Gets the fldFilterVal value for this TransactionColumnCustomFieldFilter.
     * 
     * @return fldFilterVal
     */
    public java.lang.String getFldFilterVal() {
        return fldFilterVal;
    }


    /**
     * Sets the fldFilterVal value for this TransactionColumnCustomFieldFilter.
     * 
     * @param fldFilterVal
     */
    public void setFldFilterVal(java.lang.String fldFilterVal) {
        this.fldFilterVal = fldFilterVal;
    }


    /**
     * Gets the fldFilterSelList value for this TransactionColumnCustomFieldFilter.
     * 
     * @return fldFilterSelList
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getFldFilterSelList() {
        return fldFilterSelList;
    }


    /**
     * Sets the fldFilterSelList value for this TransactionColumnCustomFieldFilter.
     * 
     * @param fldFilterSelList
     */
    public void setFldFilterSelList(com.netsuite.webservices.platform.core_2014_2.RecordRef[] fldFilterSelList) {
        this.fldFilterSelList = fldFilterSelList;
    }


    /**
     * Gets the fldFilterNotNull value for this TransactionColumnCustomFieldFilter.
     * 
     * @return fldFilterNotNull
     */
    public java.lang.Boolean getFldFilterNotNull() {
        return fldFilterNotNull;
    }


    /**
     * Sets the fldFilterNotNull value for this TransactionColumnCustomFieldFilter.
     * 
     * @param fldFilterNotNull
     */
    public void setFldFilterNotNull(java.lang.Boolean fldFilterNotNull) {
        this.fldFilterNotNull = fldFilterNotNull;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionColumnCustomFieldFilter)) return false;
        TransactionColumnCustomFieldFilter other = (TransactionColumnCustomFieldFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fldFilter==null && other.getFldFilter()==null) || 
             (this.fldFilter!=null &&
              this.fldFilter.equals(other.getFldFilter()))) &&
            ((this.fldFilterChecked==null && other.getFldFilterChecked()==null) || 
             (this.fldFilterChecked!=null &&
              this.fldFilterChecked.equals(other.getFldFilterChecked()))) &&
            ((this.fldFilterCompareType==null && other.getFldFilterCompareType()==null) || 
             (this.fldFilterCompareType!=null &&
              this.fldFilterCompareType.equals(other.getFldFilterCompareType()))) &&
            ((this.fldFilterVal==null && other.getFldFilterVal()==null) || 
             (this.fldFilterVal!=null &&
              this.fldFilterVal.equals(other.getFldFilterVal()))) &&
            ((this.fldFilterSelList==null && other.getFldFilterSelList()==null) || 
             (this.fldFilterSelList!=null &&
              java.util.Arrays.equals(this.fldFilterSelList, other.getFldFilterSelList()))) &&
            ((this.fldFilterNotNull==null && other.getFldFilterNotNull()==null) || 
             (this.fldFilterNotNull!=null &&
              this.fldFilterNotNull.equals(other.getFldFilterNotNull())));
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
        if (getFldFilter() != null) {
            _hashCode += getFldFilter().hashCode();
        }
        if (getFldFilterChecked() != null) {
            _hashCode += getFldFilterChecked().hashCode();
        }
        if (getFldFilterCompareType() != null) {
            _hashCode += getFldFilterCompareType().hashCode();
        }
        if (getFldFilterVal() != null) {
            _hashCode += getFldFilterVal().hashCode();
        }
        if (getFldFilterSelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFldFilterSelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFldFilterSelList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFldFilterNotNull() != null) {
            _hashCode += getFldFilterNotNull().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionColumnCustomFieldFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilterChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterCompareType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilterCompareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.customization_2014_2.setup.webservices.netsuite.com", "CustomizationFilterCompareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterVal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilterVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterSelList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilterSelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilterSel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterNotNull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "fldFilterNotNull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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