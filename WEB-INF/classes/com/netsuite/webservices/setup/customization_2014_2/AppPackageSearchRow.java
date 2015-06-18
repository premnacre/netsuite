/**
 * AppPackageSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2014_2;

public class AppPackageSearchRow  extends com.netsuite.webservices.platform.core_2014_2.SearchRow  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2014_2.AppPackageSearchRowBasic basic;

    private com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchRowBasic appDefinitionJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic creatorJoin;

    private com.netsuite.webservices.platform.common_2014_2.FileSearchRowBasic packageFileJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic userJoin;

    public AppPackageSearchRow() {
    }

    public AppPackageSearchRow(
           com.netsuite.webservices.platform.common_2014_2.AppPackageSearchRowBasic basic,
           com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchRowBasic appDefinitionJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic creatorJoin,
           com.netsuite.webservices.platform.common_2014_2.FileSearchRowBasic packageFileJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic userJoin) {
        this.basic = basic;
        this.appDefinitionJoin = appDefinitionJoin;
        this.creatorJoin = creatorJoin;
        this.packageFileJoin = packageFileJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this AppPackageSearchRow.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2014_2.AppPackageSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this AppPackageSearchRow.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2014_2.AppPackageSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the appDefinitionJoin value for this AppPackageSearchRow.
     * 
     * @return appDefinitionJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchRowBasic getAppDefinitionJoin() {
        return appDefinitionJoin;
    }


    /**
     * Sets the appDefinitionJoin value for this AppPackageSearchRow.
     * 
     * @param appDefinitionJoin
     */
    public void setAppDefinitionJoin(com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchRowBasic appDefinitionJoin) {
        this.appDefinitionJoin = appDefinitionJoin;
    }


    /**
     * Gets the creatorJoin value for this AppPackageSearchRow.
     * 
     * @return creatorJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic getCreatorJoin() {
        return creatorJoin;
    }


    /**
     * Sets the creatorJoin value for this AppPackageSearchRow.
     * 
     * @param creatorJoin
     */
    public void setCreatorJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic creatorJoin) {
        this.creatorJoin = creatorJoin;
    }


    /**
     * Gets the packageFileJoin value for this AppPackageSearchRow.
     * 
     * @return packageFileJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.FileSearchRowBasic getPackageFileJoin() {
        return packageFileJoin;
    }


    /**
     * Sets the packageFileJoin value for this AppPackageSearchRow.
     * 
     * @param packageFileJoin
     */
    public void setPackageFileJoin(com.netsuite.webservices.platform.common_2014_2.FileSearchRowBasic packageFileJoin) {
        this.packageFileJoin = packageFileJoin;
    }


    /**
     * Gets the userJoin value for this AppPackageSearchRow.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this AppPackageSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppPackageSearchRow)) return false;
        AppPackageSearchRow other = (AppPackageSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.appDefinitionJoin==null && other.getAppDefinitionJoin()==null) || 
             (this.appDefinitionJoin!=null &&
              this.appDefinitionJoin.equals(other.getAppDefinitionJoin()))) &&
            ((this.creatorJoin==null && other.getCreatorJoin()==null) || 
             (this.creatorJoin!=null &&
              this.creatorJoin.equals(other.getCreatorJoin()))) &&
            ((this.packageFileJoin==null && other.getPackageFileJoin()==null) || 
             (this.packageFileJoin!=null &&
              this.packageFileJoin.equals(other.getPackageFileJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getAppDefinitionJoin() != null) {
            _hashCode += getAppDefinitionJoin().hashCode();
        }
        if (getCreatorJoin() != null) {
            _hashCode += getCreatorJoin().hashCode();
        }
        if (getPackageFileJoin() != null) {
            _hashCode += getPackageFileJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppPackageSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppPackageSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppPackageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appDefinitionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appDefinitionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppDefinitionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "creatorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageFileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "packageFileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
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
