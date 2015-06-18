/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2014_2;

public class Location  extends com.netsuite.webservices.platform.core_2014_2.Record  implements java.io.Serializable {
    private java.lang.String name;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef parent;

    private java.lang.Boolean includeChildren;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiaryList;

    private java.lang.Boolean isInactive;

    private java.lang.String tranPrefix;

    private com.netsuite.webservices.platform.common_2014_2.Address mainAddress;

    private com.netsuite.webservices.platform.common_2014_2.Address returnAddress;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef logo;

    private java.lang.Boolean makeInventoryAvailable;

    private java.lang.Boolean makeInventoryAvailableStore;

    private com.netsuite.webservices.lists.accounting_2014_2.ClassTranslation[] classTranslationList;

    private com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Location() {
    }

    public Location(
           java.lang.String[] nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           com.netsuite.webservices.platform.core_2014_2.RecordRef parent,
           java.lang.Boolean includeChildren,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiaryList,
           java.lang.Boolean isInactive,
           java.lang.String tranPrefix,
           com.netsuite.webservices.platform.common_2014_2.Address mainAddress,
           com.netsuite.webservices.platform.common_2014_2.Address returnAddress,
           com.netsuite.webservices.platform.core_2014_2.RecordRef logo,
           java.lang.Boolean makeInventoryAvailable,
           java.lang.Boolean makeInventoryAvailableStore,
           com.netsuite.webservices.lists.accounting_2014_2.ClassTranslation[] classTranslationList,
           com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.parent = parent;
        this.includeChildren = includeChildren;
        this.subsidiaryList = subsidiaryList;
        this.isInactive = isInactive;
        this.tranPrefix = tranPrefix;
        this.mainAddress = mainAddress;
        this.returnAddress = returnAddress;
        this.logo = logo;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.classTranslationList = classTranslationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the name value for this Location.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Location.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this Location.
     * 
     * @return parent
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Location.
     * 
     * @param parent
     */
    public void setParent(com.netsuite.webservices.platform.core_2014_2.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the includeChildren value for this Location.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this Location.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the subsidiaryList value for this Location.
     * 
     * @return subsidiaryList
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this Location.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the isInactive value for this Location.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Location.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the tranPrefix value for this Location.
     * 
     * @return tranPrefix
     */
    public java.lang.String getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this Location.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(java.lang.String tranPrefix) {
        this.tranPrefix = tranPrefix;
    }


    /**
     * Gets the mainAddress value for this Location.
     * 
     * @return mainAddress
     */
    public com.netsuite.webservices.platform.common_2014_2.Address getMainAddress() {
        return mainAddress;
    }


    /**
     * Sets the mainAddress value for this Location.
     * 
     * @param mainAddress
     */
    public void setMainAddress(com.netsuite.webservices.platform.common_2014_2.Address mainAddress) {
        this.mainAddress = mainAddress;
    }


    /**
     * Gets the returnAddress value for this Location.
     * 
     * @return returnAddress
     */
    public com.netsuite.webservices.platform.common_2014_2.Address getReturnAddress() {
        return returnAddress;
    }


    /**
     * Sets the returnAddress value for this Location.
     * 
     * @param returnAddress
     */
    public void setReturnAddress(com.netsuite.webservices.platform.common_2014_2.Address returnAddress) {
        this.returnAddress = returnAddress;
    }


    /**
     * Gets the logo value for this Location.
     * 
     * @return logo
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this Location.
     * 
     * @param logo
     */
    public void setLogo(com.netsuite.webservices.platform.core_2014_2.RecordRef logo) {
        this.logo = logo;
    }


    /**
     * Gets the makeInventoryAvailable value for this Location.
     * 
     * @return makeInventoryAvailable
     */
    public java.lang.Boolean getMakeInventoryAvailable() {
        return makeInventoryAvailable;
    }


    /**
     * Sets the makeInventoryAvailable value for this Location.
     * 
     * @param makeInventoryAvailable
     */
    public void setMakeInventoryAvailable(java.lang.Boolean makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }


    /**
     * Gets the makeInventoryAvailableStore value for this Location.
     * 
     * @return makeInventoryAvailableStore
     */
    public java.lang.Boolean getMakeInventoryAvailableStore() {
        return makeInventoryAvailableStore;
    }


    /**
     * Sets the makeInventoryAvailableStore value for this Location.
     * 
     * @param makeInventoryAvailableStore
     */
    public void setMakeInventoryAvailableStore(java.lang.Boolean makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }


    /**
     * Gets the classTranslationList value for this Location.
     * 
     * @return classTranslationList
     */
    public com.netsuite.webservices.lists.accounting_2014_2.ClassTranslation[] getClassTranslationList() {
        return classTranslationList;
    }


    /**
     * Sets the classTranslationList value for this Location.
     * 
     * @param classTranslationList
     */
    public void setClassTranslationList(com.netsuite.webservices.lists.accounting_2014_2.ClassTranslation[] classTranslationList) {
        this.classTranslationList = classTranslationList;
    }


    /**
     * Gets the customFieldList value for this Location.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Location.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Location.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Location.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Location.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Location.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              java.util.Arrays.equals(this.subsidiaryList, other.getSubsidiaryList()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              this.tranPrefix.equals(other.getTranPrefix()))) &&
            ((this.mainAddress==null && other.getMainAddress()==null) || 
             (this.mainAddress!=null &&
              this.mainAddress.equals(other.getMainAddress()))) &&
            ((this.returnAddress==null && other.getReturnAddress()==null) || 
             (this.returnAddress!=null &&
              this.returnAddress.equals(other.getReturnAddress()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.makeInventoryAvailable==null && other.getMakeInventoryAvailable()==null) || 
             (this.makeInventoryAvailable!=null &&
              this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable()))) &&
            ((this.makeInventoryAvailableStore==null && other.getMakeInventoryAvailableStore()==null) || 
             (this.makeInventoryAvailableStore!=null &&
              this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore()))) &&
            ((this.classTranslationList==null && other.getClassTranslationList()==null) || 
             (this.classTranslationList!=null &&
              java.util.Arrays.equals(this.classTranslationList, other.getClassTranslationList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getSubsidiaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiaryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getTranPrefix() != null) {
            _hashCode += getTranPrefix().hashCode();
        }
        if (getMainAddress() != null) {
            _hashCode += getMainAddress().hashCode();
        }
        if (getReturnAddress() != null) {
            _hashCode += getReturnAddress().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getMakeInventoryAvailable() != null) {
            _hashCode += getMakeInventoryAvailable().hashCode();
        }
        if (getMakeInventoryAvailableStore() != null) {
            _hashCode += getMakeInventoryAvailableStore().hashCode();
        }
        if (getClassTranslationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClassTranslationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClassTranslationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "Location"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "recordRef"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "mainAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "returnAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classTranslationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "classTranslationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "ClassTranslation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "classTranslation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "CustomFieldRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "customField"));
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
