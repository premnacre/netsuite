/**
 * AppDefinitionSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2014_2;

public class AppDefinitionSearch  extends com.netsuite.webservices.platform.core_2014_2.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic basic;

    private com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic appPackageJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic creatorJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin;

    public AppDefinitionSearch() {
    }

    public AppDefinitionSearch(
           com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic basic,
           com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic appPackageJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic creatorJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin) {
        this.basic = basic;
        this.appPackageJoin = appPackageJoin;
        this.creatorJoin = creatorJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this AppDefinitionSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this AppDefinitionSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the appPackageJoin value for this AppDefinitionSearch.
     * 
     * @return appPackageJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic getAppPackageJoin() {
        return appPackageJoin;
    }


    /**
     * Sets the appPackageJoin value for this AppDefinitionSearch.
     * 
     * @param appPackageJoin
     */
    public void setAppPackageJoin(com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic appPackageJoin) {
        this.appPackageJoin = appPackageJoin;
    }


    /**
     * Gets the creatorJoin value for this AppDefinitionSearch.
     * 
     * @return creatorJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic getCreatorJoin() {
        return creatorJoin;
    }


    /**
     * Sets the creatorJoin value for this AppDefinitionSearch.
     * 
     * @param creatorJoin
     */
    public void setCreatorJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic creatorJoin) {
        this.creatorJoin = creatorJoin;
    }


    /**
     * Gets the userJoin value for this AppDefinitionSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this AppDefinitionSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppDefinitionSearch)) return false;
        AppDefinitionSearch other = (AppDefinitionSearch) obj;
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
            ((this.appPackageJoin==null && other.getAppPackageJoin()==null) || 
             (this.appPackageJoin!=null &&
              this.appPackageJoin.equals(other.getAppPackageJoin()))) &&
            ((this.creatorJoin==null && other.getCreatorJoin()==null) || 
             (this.creatorJoin!=null &&
              this.creatorJoin.equals(other.getCreatorJoin()))) &&
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
        if (getAppPackageJoin() != null) {
            _hashCode += getAppPackageJoin().hashCode();
        }
        if (getCreatorJoin() != null) {
            _hashCode += getCreatorJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppDefinitionSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppDefinitionSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppDefinitionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPackageJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appPackageJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppPackageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "creatorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
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
