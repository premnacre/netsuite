/**
 * AppPackageSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2014_2;

public class AppPackageSearch  extends com.netsuite.webservices.platform.core_2014_2.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic basic;

    private com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic appDefinitionJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic creatorJoin;

    private com.netsuite.webservices.platform.common_2014_2.FileSearchBasic packageFileJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin;

    public AppPackageSearch() {
    }

    public AppPackageSearch(
           com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic basic,
           com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic appDefinitionJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic creatorJoin,
           com.netsuite.webservices.platform.common_2014_2.FileSearchBasic packageFileJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin) {
        this.basic = basic;
        this.appDefinitionJoin = appDefinitionJoin;
        this.creatorJoin = creatorJoin;
        this.packageFileJoin = packageFileJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this AppPackageSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this AppPackageSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2014_2.AppPackageSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the appDefinitionJoin value for this AppPackageSearch.
     * 
     * @return appDefinitionJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic getAppDefinitionJoin() {
        return appDefinitionJoin;
    }


    /**
     * Sets the appDefinitionJoin value for this AppPackageSearch.
     * 
     * @param appDefinitionJoin
     */
    public void setAppDefinitionJoin(com.netsuite.webservices.platform.common_2014_2.AppDefinitionSearchBasic appDefinitionJoin) {
        this.appDefinitionJoin = appDefinitionJoin;
    }


    /**
     * Gets the creatorJoin value for this AppPackageSearch.
     * 
     * @return creatorJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic getCreatorJoin() {
        return creatorJoin;
    }


    /**
     * Sets the creatorJoin value for this AppPackageSearch.
     * 
     * @param creatorJoin
     */
    public void setCreatorJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic creatorJoin) {
        this.creatorJoin = creatorJoin;
    }


    /**
     * Gets the packageFileJoin value for this AppPackageSearch.
     * 
     * @return packageFileJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.FileSearchBasic getPackageFileJoin() {
        return packageFileJoin;
    }


    /**
     * Sets the packageFileJoin value for this AppPackageSearch.
     * 
     * @param packageFileJoin
     */
    public void setPackageFileJoin(com.netsuite.webservices.platform.common_2014_2.FileSearchBasic packageFileJoin) {
        this.packageFileJoin = packageFileJoin;
    }


    /**
     * Gets the userJoin value for this AppPackageSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this AppPackageSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppPackageSearch)) return false;
        AppPackageSearch other = (AppPackageSearch) obj;
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
        new org.apache.axis.description.TypeDesc(AppPackageSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppPackageSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppPackageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appDefinitionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appDefinitionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppDefinitionSearchBasic"));
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
        elemField.setFieldName("packageFileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "packageFileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "FileSearchBasic"));
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
