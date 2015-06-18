/**
 * AppPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.setup.customization_2014_2;

public class AppPackage  extends com.netsuite.webservices.platform.core_2014_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.RecordRef appDefinition;

    private java.lang.String version;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef packageFile;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef bundle;

    private java.lang.String description;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public AppPackage() {
    }

    public AppPackage(
           java.lang.String[] nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2014_2.RecordRef appDefinition,
           java.lang.String version,
           com.netsuite.webservices.platform.core_2014_2.RecordRef packageFile,
           com.netsuite.webservices.platform.core_2014_2.RecordRef bundle,
           java.lang.String description) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.appDefinition = appDefinition;
        this.version = version;
        this.packageFile = packageFile;
        this.bundle = bundle;
        this.description = description;
    }


    /**
     * Gets the appDefinition value for this AppPackage.
     * 
     * @return appDefinition
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getAppDefinition() {
        return appDefinition;
    }


    /**
     * Sets the appDefinition value for this AppPackage.
     * 
     * @param appDefinition
     */
    public void setAppDefinition(com.netsuite.webservices.platform.core_2014_2.RecordRef appDefinition) {
        this.appDefinition = appDefinition;
    }


    /**
     * Gets the version value for this AppPackage.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AppPackage.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the packageFile value for this AppPackage.
     * 
     * @return packageFile
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getPackageFile() {
        return packageFile;
    }


    /**
     * Sets the packageFile value for this AppPackage.
     * 
     * @param packageFile
     */
    public void setPackageFile(com.netsuite.webservices.platform.core_2014_2.RecordRef packageFile) {
        this.packageFile = packageFile;
    }


    /**
     * Gets the bundle value for this AppPackage.
     * 
     * @return bundle
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getBundle() {
        return bundle;
    }


    /**
     * Sets the bundle value for this AppPackage.
     * 
     * @param bundle
     */
    public void setBundle(com.netsuite.webservices.platform.core_2014_2.RecordRef bundle) {
        this.bundle = bundle;
    }


    /**
     * Gets the description value for this AppPackage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AppPackage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the internalId value for this AppPackage.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AppPackage.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this AppPackage.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AppPackage.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppPackage)) return false;
        AppPackage other = (AppPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appDefinition==null && other.getAppDefinition()==null) || 
             (this.appDefinition!=null &&
              this.appDefinition.equals(other.getAppDefinition()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.packageFile==null && other.getPackageFile()==null) || 
             (this.packageFile!=null &&
              this.packageFile.equals(other.getPackageFile()))) &&
            ((this.bundle==null && other.getBundle()==null) || 
             (this.bundle!=null &&
              this.bundle.equals(other.getBundle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getAppDefinition() != null) {
            _hashCode += getAppDefinition().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getPackageFile() != null) {
            _hashCode += getPackageFile().hashCode();
        }
        if (getBundle() != null) {
            _hashCode += getBundle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "AppPackage"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "appDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "packageFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "bundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2014_2.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
