/**
 * AppPackageSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class AppPackageSearchRowBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRowBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] appDefinition;

    private com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] bundle;

    private com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] description;

    private com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] externalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] packageFile;

    private com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] version;

    public AppPackageSearchRowBasic() {
    }

    public AppPackageSearchRowBasic(
           com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] appDefinition,
           com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] bundle,
           com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] description,
           com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] externalId,
           com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] packageFile,
           com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] version) {
        this.appDefinition = appDefinition;
        this.bundle = bundle;
        this.description = description;
        this.externalId = externalId;
        this.internalId = internalId;
        this.packageFile = packageFile;
        this.version = version;
    }


    /**
     * Gets the appDefinition value for this AppPackageSearchRowBasic.
     * 
     * @return appDefinition
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] getAppDefinition() {
        return appDefinition;
    }


    /**
     * Sets the appDefinition value for this AppPackageSearchRowBasic.
     * 
     * @param appDefinition
     */
    public void setAppDefinition(com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] appDefinition) {
        this.appDefinition = appDefinition;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField getAppDefinition(int i) {
        return this.appDefinition[i];
    }

    public void setAppDefinition(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField _value) {
        this.appDefinition[i] = _value;
    }


    /**
     * Gets the bundle value for this AppPackageSearchRowBasic.
     * 
     * @return bundle
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] getBundle() {
        return bundle;
    }


    /**
     * Sets the bundle value for this AppPackageSearchRowBasic.
     * 
     * @param bundle
     */
    public void setBundle(com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] bundle) {
        this.bundle = bundle;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField getBundle(int i) {
        return this.bundle[i];
    }

    public void setBundle(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField _value) {
        this.bundle[i] = _value;
    }


    /**
     * Gets the description value for this AppPackageSearchRowBasic.
     * 
     * @return description
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AppPackageSearchRowBasic.
     * 
     * @param description
     */
    public void setDescription(com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] description) {
        this.description = description;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the externalId value for this AppPackageSearchRowBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this AppPackageSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] externalId) {
        this.externalId = externalId;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the internalId value for this AppPackageSearchRowBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this AppPackageSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the packageFile value for this AppPackageSearchRowBasic.
     * 
     * @return packageFile
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] getPackageFile() {
        return packageFile;
    }


    /**
     * Sets the packageFile value for this AppPackageSearchRowBasic.
     * 
     * @param packageFile
     */
    public void setPackageFile(com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField[] packageFile) {
        this.packageFile = packageFile;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField getPackageFile(int i) {
        return this.packageFile[i];
    }

    public void setPackageFile(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnSelectField _value) {
        this.packageFile[i] = _value;
    }


    /**
     * Gets the version value for this AppPackageSearchRowBasic.
     * 
     * @return version
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AppPackageSearchRowBasic.
     * 
     * @param version
     */
    public void setVersion(com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField[] version) {
        this.version = version;
    }

    public com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField getVersion(int i) {
        return this.version[i];
    }

    public void setVersion(int i, com.netsuite.webservices.platform.core_2014_2.SearchColumnStringField _value) {
        this.version[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppPackageSearchRowBasic)) return false;
        AppPackageSearchRowBasic other = (AppPackageSearchRowBasic) obj;
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
              java.util.Arrays.equals(this.appDefinition, other.getAppDefinition()))) &&
            ((this.bundle==null && other.getBundle()==null) || 
             (this.bundle!=null &&
              java.util.Arrays.equals(this.bundle, other.getBundle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.packageFile==null && other.getPackageFile()==null) || 
             (this.packageFile!=null &&
              java.util.Arrays.equals(this.packageFile, other.getPackageFile()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              java.util.Arrays.equals(this.version, other.getVersion())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersion(), i);
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
        new org.apache.axis.description.TypeDesc(AppPackageSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "AppPackageSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "appDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "bundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "packageFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
