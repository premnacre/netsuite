/**
 * EmployeeSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class EmployeeSearchBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.SearchStringField address;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField addressee;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField addressLabel;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField addressPhone;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField alienNumber;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField anniversary;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField approvalLimit;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] approver;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField attention;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField authWorkDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField billAddress;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] billingClass;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField birthDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField birthDay;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] cContribution;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField city;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] _class;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField comments;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] commissionPlan;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField concurrentWebServicesUser;

    private java.lang.String[] country;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField county;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] deduction;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] department;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] earning;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] education;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField eligibleForCommission;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField email;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] employeeStatus;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] employeeType;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField employeeTypeKpi;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField entityId;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] ethnicity;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField expenseLimit;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField fax;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField firstName;

    private java.lang.String[] gender;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField giveAccess;

    private java.lang.String[] globalSubscriptionStatus;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] group;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField hireDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField i9Verified;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField image;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefaultBilling;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefaultShipping;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isJobResource;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isTemplate;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField jobDescription;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField laborCost;

    private java.lang.String[] language;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField lastModifiedDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField lastName;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField lastPaidDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField lastReviewDate;

    private java.lang.String[] level;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] location;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] maritalStatus;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField middleName;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField nextReviewDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField offlineAccess;

    private java.lang.String[] payFrequency;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField permChangeDate;

    private java.lang.String[] permission;

    private java.lang.String[] permissionChange;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField phone;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField phoneticName;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField primaryEarningAmount;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField primaryEarningItem;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField primaryEarningType;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField purchaseOrderApprovalLimit;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] purchaseOrderApprover;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField purchaseOrderLimit;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField releaseDate;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] residentStatus;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] role;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] roleChange;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField roleChangeDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField salesRep;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] salesRole;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField salutation;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField socialSecurityNumber;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField state;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] supervisor;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField supportRep;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] timeApprover;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField title;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField usePerquest;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField useTimeData;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField visaExpDate;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] visaType;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] withholding;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] workCalendar;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] workplace;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField zipCode;

    private com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList;

    public EmployeeSearchBasic() {
    }

    public EmployeeSearchBasic(
           com.netsuite.webservices.platform.core_2014_2.SearchStringField address,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField addressee,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField addressLabel,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField addressPhone,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField alienNumber,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField anniversary,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField approvalLimit,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] approver,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField attention,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField authWorkDate,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField billAddress,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] billingClass,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField birthDate,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField birthDay,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] cContribution,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField city,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] _class,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField comments,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] commissionPlan,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField concurrentWebServicesUser,
           java.lang.String[] country,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField county,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] deduction,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] department,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] earning,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] education,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField eligibleForCommission,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField email,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] employeeStatus,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] employeeType,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField employeeTypeKpi,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField entityId,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] ethnicity,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField expenseLimit,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField fax,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField firstName,
           java.lang.String[] gender,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField giveAccess,
           java.lang.String[] globalSubscriptionStatus,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] group,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField hireDate,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField i9Verified,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField image,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefaultBilling,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefaultShipping,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isJobResource,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isTemplate,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField jobDescription,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField laborCost,
           java.lang.String[] language,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField lastModifiedDate,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField lastName,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField lastPaidDate,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField lastReviewDate,
           java.lang.String[] level,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] location,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] maritalStatus,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField middleName,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField nextReviewDate,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField offlineAccess,
           java.lang.String[] payFrequency,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField permChangeDate,
           java.lang.String[] permission,
           java.lang.String[] permissionChange,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField phone,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField phoneticName,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField primaryEarningAmount,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField primaryEarningItem,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField primaryEarningType,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField purchaseOrderApprovalLimit,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] purchaseOrderApprover,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField purchaseOrderLimit,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField releaseDate,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] residentStatus,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] role,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] roleChange,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField roleChangeDate,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField salesRep,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] salesRole,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField salutation,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField socialSecurityNumber,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField state,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] supervisor,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField supportRep,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] timeApprover,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField title,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField usePerquest,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField useTimeData,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField visaExpDate,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] visaType,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] withholding,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] workCalendar,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] workplace,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField zipCode,
           com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.alienNumber = alienNumber;
        this.anniversary = anniversary;
        this.approvalLimit = approvalLimit;
        this.approver = approver;
        this.attention = attention;
        this.authWorkDate = authWorkDate;
        this.billAddress = billAddress;
        this.billingClass = billingClass;
        this.birthDate = birthDate;
        this.birthDay = birthDay;
        this.cContribution = cContribution;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.commissionPlan = commissionPlan;
        this.concurrentWebServicesUser = concurrentWebServicesUser;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.deduction = deduction;
        this.department = department;
        this.earning = earning;
        this.education = education;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.employeeStatus = employeeStatus;
        this.employeeType = employeeType;
        this.employeeTypeKpi = employeeTypeKpi;
        this.entityId = entityId;
        this.ethnicity = ethnicity;
        this.expenseLimit = expenseLimit;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.firstName = firstName;
        this.gender = gender;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hireDate = hireDate;
        this.i9Verified = i9Verified;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobResource = isJobResource;
        this.isTemplate = isTemplate;
        this.jobDescription = jobDescription;
        this.laborCost = laborCost;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastPaidDate = lastPaidDate;
        this.lastReviewDate = lastReviewDate;
        this.level = level;
        this.location = location;
        this.maritalStatus = maritalStatus;
        this.middleName = middleName;
        this.nextReviewDate = nextReviewDate;
        this.offlineAccess = offlineAccess;
        this.payFrequency = payFrequency;
        this.permChangeDate = permChangeDate;
        this.permission = permission;
        this.permissionChange = permissionChange;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.primaryEarningAmount = primaryEarningAmount;
        this.primaryEarningItem = primaryEarningItem;
        this.primaryEarningType = primaryEarningType;
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
        this.purchaseOrderApprover = purchaseOrderApprover;
        this.purchaseOrderLimit = purchaseOrderLimit;
        this.releaseDate = releaseDate;
        this.residentStatus = residentStatus;
        this.role = role;
        this.roleChange = roleChange;
        this.roleChangeDate = roleChangeDate;
        this.salesRep = salesRep;
        this.salesRole = salesRole;
        this.salutation = salutation;
        this.socialSecurityNumber = socialSecurityNumber;
        this.state = state;
        this.subsidiary = subsidiary;
        this.supervisor = supervisor;
        this.supportRep = supportRep;
        this.timeApprover = timeApprover;
        this.title = title;
        this.usePerquest = usePerquest;
        this.useTimeData = useTimeData;
        this.visaExpDate = visaExpDate;
        this.visaType = visaType;
        this.withholding = withholding;
        this.workCalendar = workCalendar;
        this.workplace = workplace;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this EmployeeSearchBasic.
     * 
     * @return address
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EmployeeSearchBasic.
     * 
     * @param address
     */
    public void setAddress(com.netsuite.webservices.platform.core_2014_2.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this EmployeeSearchBasic.
     * 
     * @return addressee
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this EmployeeSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(com.netsuite.webservices.platform.core_2014_2.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this EmployeeSearchBasic.
     * 
     * @return addressLabel
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this EmployeeSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(com.netsuite.webservices.platform.core_2014_2.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this EmployeeSearchBasic.
     * 
     * @return addressPhone
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this EmployeeSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(com.netsuite.webservices.platform.core_2014_2.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the alienNumber value for this EmployeeSearchBasic.
     * 
     * @return alienNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getAlienNumber() {
        return alienNumber;
    }


    /**
     * Sets the alienNumber value for this EmployeeSearchBasic.
     * 
     * @param alienNumber
     */
    public void setAlienNumber(com.netsuite.webservices.platform.core_2014_2.SearchStringField alienNumber) {
        this.alienNumber = alienNumber;
    }


    /**
     * Gets the anniversary value for this EmployeeSearchBasic.
     * 
     * @return anniversary
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getAnniversary() {
        return anniversary;
    }


    /**
     * Sets the anniversary value for this EmployeeSearchBasic.
     * 
     * @param anniversary
     */
    public void setAnniversary(com.netsuite.webservices.platform.core_2014_2.SearchDateField anniversary) {
        this.anniversary = anniversary;
    }


    /**
     * Gets the approvalLimit value for this EmployeeSearchBasic.
     * 
     * @return approvalLimit
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getApprovalLimit() {
        return approvalLimit;
    }


    /**
     * Sets the approvalLimit value for this EmployeeSearchBasic.
     * 
     * @param approvalLimit
     */
    public void setApprovalLimit(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField approvalLimit) {
        this.approvalLimit = approvalLimit;
    }


    /**
     * Gets the approver value for this EmployeeSearchBasic.
     * 
     * @return approver
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this EmployeeSearchBasic.
     * 
     * @param approver
     */
    public void setApprover(com.netsuite.webservices.platform.core_2014_2.RecordRef[] approver) {
        this.approver = approver;
    }


    /**
     * Gets the attention value for this EmployeeSearchBasic.
     * 
     * @return attention
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this EmployeeSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(com.netsuite.webservices.platform.core_2014_2.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the authWorkDate value for this EmployeeSearchBasic.
     * 
     * @return authWorkDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getAuthWorkDate() {
        return authWorkDate;
    }


    /**
     * Sets the authWorkDate value for this EmployeeSearchBasic.
     * 
     * @param authWorkDate
     */
    public void setAuthWorkDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField authWorkDate) {
        this.authWorkDate = authWorkDate;
    }


    /**
     * Gets the billAddress value for this EmployeeSearchBasic.
     * 
     * @return billAddress
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this EmployeeSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(com.netsuite.webservices.platform.core_2014_2.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the billingClass value for this EmployeeSearchBasic.
     * 
     * @return billingClass
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this EmployeeSearchBasic.
     * 
     * @param billingClass
     */
    public void setBillingClass(com.netsuite.webservices.platform.core_2014_2.RecordRef[] billingClass) {
        this.billingClass = billingClass;
    }


    /**
     * Gets the birthDate value for this EmployeeSearchBasic.
     * 
     * @return birthDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this EmployeeSearchBasic.
     * 
     * @param birthDate
     */
    public void setBirthDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the birthDay value for this EmployeeSearchBasic.
     * 
     * @return birthDay
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getBirthDay() {
        return birthDay;
    }


    /**
     * Sets the birthDay value for this EmployeeSearchBasic.
     * 
     * @param birthDay
     */
    public void setBirthDay(com.netsuite.webservices.platform.core_2014_2.SearchDateField birthDay) {
        this.birthDay = birthDay;
    }


    /**
     * Gets the cContribution value for this EmployeeSearchBasic.
     * 
     * @return cContribution
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getCContribution() {
        return cContribution;
    }


    /**
     * Sets the cContribution value for this EmployeeSearchBasic.
     * 
     * @param cContribution
     */
    public void setCContribution(com.netsuite.webservices.platform.core_2014_2.RecordRef[] cContribution) {
        this.cContribution = cContribution;
    }


    /**
     * Gets the city value for this EmployeeSearchBasic.
     * 
     * @return city
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this EmployeeSearchBasic.
     * 
     * @param city
     */
    public void setCity(com.netsuite.webservices.platform.core_2014_2.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the _class value for this EmployeeSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this EmployeeSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2014_2.RecordRef[] _class) {
        this._class = _class;
    }


    /**
     * Gets the comments value for this EmployeeSearchBasic.
     * 
     * @return comments
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EmployeeSearchBasic.
     * 
     * @param comments
     */
    public void setComments(com.netsuite.webservices.platform.core_2014_2.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the commissionPlan value for this EmployeeSearchBasic.
     * 
     * @return commissionPlan
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getCommissionPlan() {
        return commissionPlan;
    }


    /**
     * Sets the commissionPlan value for this EmployeeSearchBasic.
     * 
     * @param commissionPlan
     */
    public void setCommissionPlan(com.netsuite.webservices.platform.core_2014_2.RecordRef[] commissionPlan) {
        this.commissionPlan = commissionPlan;
    }


    /**
     * Gets the concurrentWebServicesUser value for this EmployeeSearchBasic.
     * 
     * @return concurrentWebServicesUser
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getConcurrentWebServicesUser() {
        return concurrentWebServicesUser;
    }


    /**
     * Sets the concurrentWebServicesUser value for this EmployeeSearchBasic.
     * 
     * @param concurrentWebServicesUser
     */
    public void setConcurrentWebServicesUser(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }


    /**
     * Gets the country value for this EmployeeSearchBasic.
     * 
     * @return country
     */
    public java.lang.String[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EmployeeSearchBasic.
     * 
     * @param country
     */
    public void setCountry(java.lang.String[] country) {
        this.country = country;
    }


    /**
     * Gets the county value for this EmployeeSearchBasic.
     * 
     * @return county
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this EmployeeSearchBasic.
     * 
     * @param county
     */
    public void setCounty(com.netsuite.webservices.platform.core_2014_2.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the dateCreated value for this EmployeeSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this EmployeeSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2014_2.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the deduction value for this EmployeeSearchBasic.
     * 
     * @return deduction
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getDeduction() {
        return deduction;
    }


    /**
     * Sets the deduction value for this EmployeeSearchBasic.
     * 
     * @param deduction
     */
    public void setDeduction(com.netsuite.webservices.platform.core_2014_2.RecordRef[] deduction) {
        this.deduction = deduction;
    }


    /**
     * Gets the department value for this EmployeeSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this EmployeeSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2014_2.RecordRef[] department) {
        this.department = department;
    }


    /**
     * Gets the earning value for this EmployeeSearchBasic.
     * 
     * @return earning
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getEarning() {
        return earning;
    }


    /**
     * Sets the earning value for this EmployeeSearchBasic.
     * 
     * @param earning
     */
    public void setEarning(com.netsuite.webservices.platform.core_2014_2.RecordRef[] earning) {
        this.earning = earning;
    }


    /**
     * Gets the education value for this EmployeeSearchBasic.
     * 
     * @return education
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getEducation() {
        return education;
    }


    /**
     * Sets the education value for this EmployeeSearchBasic.
     * 
     * @param education
     */
    public void setEducation(com.netsuite.webservices.platform.core_2014_2.RecordRef[] education) {
        this.education = education;
    }


    /**
     * Gets the eligibleForCommission value for this EmployeeSearchBasic.
     * 
     * @return eligibleForCommission
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this EmployeeSearchBasic.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the email value for this EmployeeSearchBasic.
     * 
     * @return email
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EmployeeSearchBasic.
     * 
     * @param email
     */
    public void setEmail(com.netsuite.webservices.platform.core_2014_2.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the employeeStatus value for this EmployeeSearchBasic.
     * 
     * @return employeeStatus
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getEmployeeStatus() {
        return employeeStatus;
    }


    /**
     * Sets the employeeStatus value for this EmployeeSearchBasic.
     * 
     * @param employeeStatus
     */
    public void setEmployeeStatus(com.netsuite.webservices.platform.core_2014_2.RecordRef[] employeeStatus) {
        this.employeeStatus = employeeStatus;
    }


    /**
     * Gets the employeeType value for this EmployeeSearchBasic.
     * 
     * @return employeeType
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getEmployeeType() {
        return employeeType;
    }


    /**
     * Sets the employeeType value for this EmployeeSearchBasic.
     * 
     * @param employeeType
     */
    public void setEmployeeType(com.netsuite.webservices.platform.core_2014_2.RecordRef[] employeeType) {
        this.employeeType = employeeType;
    }


    /**
     * Gets the employeeTypeKpi value for this EmployeeSearchBasic.
     * 
     * @return employeeTypeKpi
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getEmployeeTypeKpi() {
        return employeeTypeKpi;
    }


    /**
     * Sets the employeeTypeKpi value for this EmployeeSearchBasic.
     * 
     * @param employeeTypeKpi
     */
    public void setEmployeeTypeKpi(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField employeeTypeKpi) {
        this.employeeTypeKpi = employeeTypeKpi;
    }


    /**
     * Gets the entityId value for this EmployeeSearchBasic.
     * 
     * @return entityId
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this EmployeeSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(com.netsuite.webservices.platform.core_2014_2.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the ethnicity value for this EmployeeSearchBasic.
     * 
     * @return ethnicity
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the ethnicity value for this EmployeeSearchBasic.
     * 
     * @param ethnicity
     */
    public void setEthnicity(com.netsuite.webservices.platform.core_2014_2.RecordRef[] ethnicity) {
        this.ethnicity = ethnicity;
    }


    /**
     * Gets the expenseLimit value for this EmployeeSearchBasic.
     * 
     * @return expenseLimit
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getExpenseLimit() {
        return expenseLimit;
    }


    /**
     * Sets the expenseLimit value for this EmployeeSearchBasic.
     * 
     * @param expenseLimit
     */
    public void setExpenseLimit(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField expenseLimit) {
        this.expenseLimit = expenseLimit;
    }


    /**
     * Gets the externalId value for this EmployeeSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EmployeeSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this EmployeeSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this EmployeeSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this EmployeeSearchBasic.
     * 
     * @return fax
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this EmployeeSearchBasic.
     * 
     * @param fax
     */
    public void setFax(com.netsuite.webservices.platform.core_2014_2.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the firstName value for this EmployeeSearchBasic.
     * 
     * @return firstName
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this EmployeeSearchBasic.
     * 
     * @param firstName
     */
    public void setFirstName(com.netsuite.webservices.platform.core_2014_2.SearchStringField firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this EmployeeSearchBasic.
     * 
     * @return gender
     */
    public java.lang.String[] getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this EmployeeSearchBasic.
     * 
     * @param gender
     */
    public void setGender(java.lang.String[] gender) {
        this.gender = gender;
    }


    /**
     * Gets the giveAccess value for this EmployeeSearchBasic.
     * 
     * @return giveAccess
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this EmployeeSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this EmployeeSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public java.lang.String[] getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this EmployeeSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(java.lang.String[] globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the group value for this EmployeeSearchBasic.
     * 
     * @return group
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this EmployeeSearchBasic.
     * 
     * @param group
     */
    public void setGroup(com.netsuite.webservices.platform.core_2014_2.RecordRef[] group) {
        this.group = group;
    }


    /**
     * Gets the hireDate value for this EmployeeSearchBasic.
     * 
     * @return hireDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this EmployeeSearchBasic.
     * 
     * @param hireDate
     */
    public void setHireDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField hireDate) {
        this.hireDate = hireDate;
    }


    /**
     * Gets the i9Verified value for this EmployeeSearchBasic.
     * 
     * @return i9Verified
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getI9Verified() {
        return i9Verified;
    }


    /**
     * Sets the i9Verified value for this EmployeeSearchBasic.
     * 
     * @param i9Verified
     */
    public void setI9Verified(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField i9Verified) {
        this.i9Verified = i9Verified;
    }


    /**
     * Gets the image value for this EmployeeSearchBasic.
     * 
     * @return image
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this EmployeeSearchBasic.
     * 
     * @param image
     */
    public void setImage(com.netsuite.webservices.platform.core_2014_2.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the internalId value for this EmployeeSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EmployeeSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this EmployeeSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this EmployeeSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefaultBilling value for this EmployeeSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this EmployeeSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this EmployeeSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this EmployeeSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isInactive value for this EmployeeSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EmployeeSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isJobResource value for this EmployeeSearchBasic.
     * 
     * @return isJobResource
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsJobResource() {
        return isJobResource;
    }


    /**
     * Sets the isJobResource value for this EmployeeSearchBasic.
     * 
     * @param isJobResource
     */
    public void setIsJobResource(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isJobResource) {
        this.isJobResource = isJobResource;
    }


    /**
     * Gets the isTemplate value for this EmployeeSearchBasic.
     * 
     * @return isTemplate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsTemplate() {
        return isTemplate;
    }


    /**
     * Sets the isTemplate value for this EmployeeSearchBasic.
     * 
     * @param isTemplate
     */
    public void setIsTemplate(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isTemplate) {
        this.isTemplate = isTemplate;
    }


    /**
     * Gets the jobDescription value for this EmployeeSearchBasic.
     * 
     * @return jobDescription
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getJobDescription() {
        return jobDescription;
    }


    /**
     * Sets the jobDescription value for this EmployeeSearchBasic.
     * 
     * @param jobDescription
     */
    public void setJobDescription(com.netsuite.webservices.platform.core_2014_2.SearchStringField jobDescription) {
        this.jobDescription = jobDescription;
    }


    /**
     * Gets the laborCost value for this EmployeeSearchBasic.
     * 
     * @return laborCost
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this EmployeeSearchBasic.
     * 
     * @param laborCost
     */
    public void setLaborCost(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField laborCost) {
        this.laborCost = laborCost;
    }


    /**
     * Gets the language value for this EmployeeSearchBasic.
     * 
     * @return language
     */
    public java.lang.String[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this EmployeeSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String[] language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedDate value for this EmployeeSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EmployeeSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this EmployeeSearchBasic.
     * 
     * @return lastName
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this EmployeeSearchBasic.
     * 
     * @param lastName
     */
    public void setLastName(com.netsuite.webservices.platform.core_2014_2.SearchStringField lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastPaidDate value for this EmployeeSearchBasic.
     * 
     * @return lastPaidDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getLastPaidDate() {
        return lastPaidDate;
    }


    /**
     * Sets the lastPaidDate value for this EmployeeSearchBasic.
     * 
     * @param lastPaidDate
     */
    public void setLastPaidDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }


    /**
     * Gets the lastReviewDate value for this EmployeeSearchBasic.
     * 
     * @return lastReviewDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getLastReviewDate() {
        return lastReviewDate;
    }


    /**
     * Sets the lastReviewDate value for this EmployeeSearchBasic.
     * 
     * @param lastReviewDate
     */
    public void setLastReviewDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }


    /**
     * Gets the level value for this EmployeeSearchBasic.
     * 
     * @return level
     */
    public java.lang.String[] getLevel() {
        return level;
    }


    /**
     * Sets the level value for this EmployeeSearchBasic.
     * 
     * @param level
     */
    public void setLevel(java.lang.String[] level) {
        this.level = level;
    }


    /**
     * Gets the location value for this EmployeeSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this EmployeeSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2014_2.RecordRef[] location) {
        this.location = location;
    }


    /**
     * Gets the maritalStatus value for this EmployeeSearchBasic.
     * 
     * @return maritalStatus
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this EmployeeSearchBasic.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(com.netsuite.webservices.platform.core_2014_2.RecordRef[] maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the middleName value for this EmployeeSearchBasic.
     * 
     * @return middleName
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this EmployeeSearchBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(com.netsuite.webservices.platform.core_2014_2.SearchStringField middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the nextReviewDate value for this EmployeeSearchBasic.
     * 
     * @return nextReviewDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getNextReviewDate() {
        return nextReviewDate;
    }


    /**
     * Sets the nextReviewDate value for this EmployeeSearchBasic.
     * 
     * @param nextReviewDate
     */
    public void setNextReviewDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }


    /**
     * Gets the offlineAccess value for this EmployeeSearchBasic.
     * 
     * @return offlineAccess
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getOfflineAccess() {
        return offlineAccess;
    }


    /**
     * Sets the offlineAccess value for this EmployeeSearchBasic.
     * 
     * @param offlineAccess
     */
    public void setOfflineAccess(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField offlineAccess) {
        this.offlineAccess = offlineAccess;
    }


    /**
     * Gets the payFrequency value for this EmployeeSearchBasic.
     * 
     * @return payFrequency
     */
    public java.lang.String[] getPayFrequency() {
        return payFrequency;
    }


    /**
     * Sets the payFrequency value for this EmployeeSearchBasic.
     * 
     * @param payFrequency
     */
    public void setPayFrequency(java.lang.String[] payFrequency) {
        this.payFrequency = payFrequency;
    }


    /**
     * Gets the permChangeDate value for this EmployeeSearchBasic.
     * 
     * @return permChangeDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getPermChangeDate() {
        return permChangeDate;
    }


    /**
     * Sets the permChangeDate value for this EmployeeSearchBasic.
     * 
     * @param permChangeDate
     */
    public void setPermChangeDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField permChangeDate) {
        this.permChangeDate = permChangeDate;
    }


    /**
     * Gets the permission value for this EmployeeSearchBasic.
     * 
     * @return permission
     */
    public java.lang.String[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this EmployeeSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(java.lang.String[] permission) {
        this.permission = permission;
    }


    /**
     * Gets the permissionChange value for this EmployeeSearchBasic.
     * 
     * @return permissionChange
     */
    public java.lang.String[] getPermissionChange() {
        return permissionChange;
    }


    /**
     * Sets the permissionChange value for this EmployeeSearchBasic.
     * 
     * @param permissionChange
     */
    public void setPermissionChange(java.lang.String[] permissionChange) {
        this.permissionChange = permissionChange;
    }


    /**
     * Gets the phone value for this EmployeeSearchBasic.
     * 
     * @return phone
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this EmployeeSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(com.netsuite.webservices.platform.core_2014_2.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this EmployeeSearchBasic.
     * 
     * @return phoneticName
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this EmployeeSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(com.netsuite.webservices.platform.core_2014_2.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the primaryEarningAmount value for this EmployeeSearchBasic.
     * 
     * @return primaryEarningAmount
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getPrimaryEarningAmount() {
        return primaryEarningAmount;
    }


    /**
     * Sets the primaryEarningAmount value for this EmployeeSearchBasic.
     * 
     * @param primaryEarningAmount
     */
    public void setPrimaryEarningAmount(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField primaryEarningAmount) {
        this.primaryEarningAmount = primaryEarningAmount;
    }


    /**
     * Gets the primaryEarningItem value for this EmployeeSearchBasic.
     * 
     * @return primaryEarningItem
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getPrimaryEarningItem() {
        return primaryEarningItem;
    }


    /**
     * Sets the primaryEarningItem value for this EmployeeSearchBasic.
     * 
     * @param primaryEarningItem
     */
    public void setPrimaryEarningItem(com.netsuite.webservices.platform.core_2014_2.SearchStringField primaryEarningItem) {
        this.primaryEarningItem = primaryEarningItem;
    }


    /**
     * Gets the primaryEarningType value for this EmployeeSearchBasic.
     * 
     * @return primaryEarningType
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getPrimaryEarningType() {
        return primaryEarningType;
    }


    /**
     * Sets the primaryEarningType value for this EmployeeSearchBasic.
     * 
     * @param primaryEarningType
     */
    public void setPrimaryEarningType(com.netsuite.webservices.platform.core_2014_2.SearchStringField primaryEarningType) {
        this.primaryEarningType = primaryEarningType;
    }


    /**
     * Gets the purchaseOrderApprovalLimit value for this EmployeeSearchBasic.
     * 
     * @return purchaseOrderApprovalLimit
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getPurchaseOrderApprovalLimit() {
        return purchaseOrderApprovalLimit;
    }


    /**
     * Sets the purchaseOrderApprovalLimit value for this EmployeeSearchBasic.
     * 
     * @param purchaseOrderApprovalLimit
     */
    public void setPurchaseOrderApprovalLimit(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }


    /**
     * Gets the purchaseOrderApprover value for this EmployeeSearchBasic.
     * 
     * @return purchaseOrderApprover
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getPurchaseOrderApprover() {
        return purchaseOrderApprover;
    }


    /**
     * Sets the purchaseOrderApprover value for this EmployeeSearchBasic.
     * 
     * @param purchaseOrderApprover
     */
    public void setPurchaseOrderApprover(com.netsuite.webservices.platform.core_2014_2.RecordRef[] purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }


    /**
     * Gets the purchaseOrderLimit value for this EmployeeSearchBasic.
     * 
     * @return purchaseOrderLimit
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getPurchaseOrderLimit() {
        return purchaseOrderLimit;
    }


    /**
     * Sets the purchaseOrderLimit value for this EmployeeSearchBasic.
     * 
     * @param purchaseOrderLimit
     */
    public void setPurchaseOrderLimit(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }


    /**
     * Gets the releaseDate value for this EmployeeSearchBasic.
     * 
     * @return releaseDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this EmployeeSearchBasic.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the residentStatus value for this EmployeeSearchBasic.
     * 
     * @return residentStatus
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getResidentStatus() {
        return residentStatus;
    }


    /**
     * Sets the residentStatus value for this EmployeeSearchBasic.
     * 
     * @param residentStatus
     */
    public void setResidentStatus(com.netsuite.webservices.platform.core_2014_2.RecordRef[] residentStatus) {
        this.residentStatus = residentStatus;
    }


    /**
     * Gets the role value for this EmployeeSearchBasic.
     * 
     * @return role
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this EmployeeSearchBasic.
     * 
     * @param role
     */
    public void setRole(com.netsuite.webservices.platform.core_2014_2.RecordRef[] role) {
        this.role = role;
    }


    /**
     * Gets the roleChange value for this EmployeeSearchBasic.
     * 
     * @return roleChange
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getRoleChange() {
        return roleChange;
    }


    /**
     * Sets the roleChange value for this EmployeeSearchBasic.
     * 
     * @param roleChange
     */
    public void setRoleChange(com.netsuite.webservices.platform.core_2014_2.RecordRef[] roleChange) {
        this.roleChange = roleChange;
    }


    /**
     * Gets the roleChangeDate value for this EmployeeSearchBasic.
     * 
     * @return roleChangeDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getRoleChangeDate() {
        return roleChangeDate;
    }


    /**
     * Sets the roleChangeDate value for this EmployeeSearchBasic.
     * 
     * @param roleChangeDate
     */
    public void setRoleChangeDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField roleChangeDate) {
        this.roleChangeDate = roleChangeDate;
    }


    /**
     * Gets the salesRep value for this EmployeeSearchBasic.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this EmployeeSearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesRole value for this EmployeeSearchBasic.
     * 
     * @return salesRole
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSalesRole() {
        return salesRole;
    }


    /**
     * Sets the salesRole value for this EmployeeSearchBasic.
     * 
     * @param salesRole
     */
    public void setSalesRole(com.netsuite.webservices.platform.core_2014_2.RecordRef[] salesRole) {
        this.salesRole = salesRole;
    }


    /**
     * Gets the salutation value for this EmployeeSearchBasic.
     * 
     * @return salutation
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this EmployeeSearchBasic.
     * 
     * @param salutation
     */
    public void setSalutation(com.netsuite.webservices.platform.core_2014_2.SearchStringField salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the socialSecurityNumber value for this EmployeeSearchBasic.
     * 
     * @return socialSecurityNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this EmployeeSearchBasic.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(com.netsuite.webservices.platform.core_2014_2.SearchStringField socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the state value for this EmployeeSearchBasic.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this EmployeeSearchBasic.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2014_2.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this EmployeeSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EmployeeSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the supervisor value for this EmployeeSearchBasic.
     * 
     * @return supervisor
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this EmployeeSearchBasic.
     * 
     * @param supervisor
     */
    public void setSupervisor(com.netsuite.webservices.platform.core_2014_2.RecordRef[] supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the supportRep value for this EmployeeSearchBasic.
     * 
     * @return supportRep
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getSupportRep() {
        return supportRep;
    }


    /**
     * Sets the supportRep value for this EmployeeSearchBasic.
     * 
     * @param supportRep
     */
    public void setSupportRep(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField supportRep) {
        this.supportRep = supportRep;
    }


    /**
     * Gets the timeApprover value for this EmployeeSearchBasic.
     * 
     * @return timeApprover
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getTimeApprover() {
        return timeApprover;
    }


    /**
     * Sets the timeApprover value for this EmployeeSearchBasic.
     * 
     * @param timeApprover
     */
    public void setTimeApprover(com.netsuite.webservices.platform.core_2014_2.RecordRef[] timeApprover) {
        this.timeApprover = timeApprover;
    }


    /**
     * Gets the title value for this EmployeeSearchBasic.
     * 
     * @return title
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this EmployeeSearchBasic.
     * 
     * @param title
     */
    public void setTitle(com.netsuite.webservices.platform.core_2014_2.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the usePerquest value for this EmployeeSearchBasic.
     * 
     * @return usePerquest
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getUsePerquest() {
        return usePerquest;
    }


    /**
     * Sets the usePerquest value for this EmployeeSearchBasic.
     * 
     * @param usePerquest
     */
    public void setUsePerquest(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField usePerquest) {
        this.usePerquest = usePerquest;
    }


    /**
     * Gets the useTimeData value for this EmployeeSearchBasic.
     * 
     * @return useTimeData
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getUseTimeData() {
        return useTimeData;
    }


    /**
     * Sets the useTimeData value for this EmployeeSearchBasic.
     * 
     * @param useTimeData
     */
    public void setUseTimeData(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField useTimeData) {
        this.useTimeData = useTimeData;
    }


    /**
     * Gets the visaExpDate value for this EmployeeSearchBasic.
     * 
     * @return visaExpDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getVisaExpDate() {
        return visaExpDate;
    }


    /**
     * Sets the visaExpDate value for this EmployeeSearchBasic.
     * 
     * @param visaExpDate
     */
    public void setVisaExpDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField visaExpDate) {
        this.visaExpDate = visaExpDate;
    }


    /**
     * Gets the visaType value for this EmployeeSearchBasic.
     * 
     * @return visaType
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getVisaType() {
        return visaType;
    }


    /**
     * Sets the visaType value for this EmployeeSearchBasic.
     * 
     * @param visaType
     */
    public void setVisaType(com.netsuite.webservices.platform.core_2014_2.RecordRef[] visaType) {
        this.visaType = visaType;
    }


    /**
     * Gets the withholding value for this EmployeeSearchBasic.
     * 
     * @return withholding
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getWithholding() {
        return withholding;
    }


    /**
     * Sets the withholding value for this EmployeeSearchBasic.
     * 
     * @param withholding
     */
    public void setWithholding(com.netsuite.webservices.platform.core_2014_2.RecordRef[] withholding) {
        this.withholding = withholding;
    }


    /**
     * Gets the workCalendar value for this EmployeeSearchBasic.
     * 
     * @return workCalendar
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this EmployeeSearchBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(com.netsuite.webservices.platform.core_2014_2.RecordRef[] workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the workplace value for this EmployeeSearchBasic.
     * 
     * @return workplace
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this EmployeeSearchBasic.
     * 
     * @param workplace
     */
    public void setWorkplace(com.netsuite.webservices.platform.core_2014_2.RecordRef[] workplace) {
        this.workplace = workplace;
    }


    /**
     * Gets the zipCode value for this EmployeeSearchBasic.
     * 
     * @return zipCode
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this EmployeeSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(com.netsuite.webservices.platform.core_2014_2.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this EmployeeSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EmployeeSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeSearchBasic)) return false;
        EmployeeSearchBasic other = (EmployeeSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addressLabel==null && other.getAddressLabel()==null) || 
             (this.addressLabel!=null &&
              this.addressLabel.equals(other.getAddressLabel()))) &&
            ((this.addressPhone==null && other.getAddressPhone()==null) || 
             (this.addressPhone!=null &&
              this.addressPhone.equals(other.getAddressPhone()))) &&
            ((this.alienNumber==null && other.getAlienNumber()==null) || 
             (this.alienNumber!=null &&
              this.alienNumber.equals(other.getAlienNumber()))) &&
            ((this.anniversary==null && other.getAnniversary()==null) || 
             (this.anniversary!=null &&
              this.anniversary.equals(other.getAnniversary()))) &&
            ((this.approvalLimit==null && other.getApprovalLimit()==null) || 
             (this.approvalLimit!=null &&
              this.approvalLimit.equals(other.getApprovalLimit()))) &&
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              java.util.Arrays.equals(this.approver, other.getApprover()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.authWorkDate==null && other.getAuthWorkDate()==null) || 
             (this.authWorkDate!=null &&
              this.authWorkDate.equals(other.getAuthWorkDate()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              java.util.Arrays.equals(this.billingClass, other.getBillingClass()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.birthDay==null && other.getBirthDay()==null) || 
             (this.birthDay!=null &&
              this.birthDay.equals(other.getBirthDay()))) &&
            ((this.cContribution==null && other.getCContribution()==null) || 
             (this.cContribution!=null &&
              java.util.Arrays.equals(this.cContribution, other.getCContribution()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.commissionPlan==null && other.getCommissionPlan()==null) || 
             (this.commissionPlan!=null &&
              java.util.Arrays.equals(this.commissionPlan, other.getCommissionPlan()))) &&
            ((this.concurrentWebServicesUser==null && other.getConcurrentWebServicesUser()==null) || 
             (this.concurrentWebServicesUser!=null &&
              this.concurrentWebServicesUser.equals(other.getConcurrentWebServicesUser()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.deduction==null && other.getDeduction()==null) || 
             (this.deduction!=null &&
              java.util.Arrays.equals(this.deduction, other.getDeduction()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.earning==null && other.getEarning()==null) || 
             (this.earning!=null &&
              java.util.Arrays.equals(this.earning, other.getEarning()))) &&
            ((this.education==null && other.getEducation()==null) || 
             (this.education!=null &&
              java.util.Arrays.equals(this.education, other.getEducation()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.employeeStatus==null && other.getEmployeeStatus()==null) || 
             (this.employeeStatus!=null &&
              java.util.Arrays.equals(this.employeeStatus, other.getEmployeeStatus()))) &&
            ((this.employeeType==null && other.getEmployeeType()==null) || 
             (this.employeeType!=null &&
              java.util.Arrays.equals(this.employeeType, other.getEmployeeType()))) &&
            ((this.employeeTypeKpi==null && other.getEmployeeTypeKpi()==null) || 
             (this.employeeTypeKpi!=null &&
              this.employeeTypeKpi.equals(other.getEmployeeTypeKpi()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.ethnicity==null && other.getEthnicity()==null) || 
             (this.ethnicity!=null &&
              java.util.Arrays.equals(this.ethnicity, other.getEthnicity()))) &&
            ((this.expenseLimit==null && other.getExpenseLimit()==null) || 
             (this.expenseLimit!=null &&
              this.expenseLimit.equals(other.getExpenseLimit()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              java.util.Arrays.equals(this.gender, other.getGender()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              java.util.Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup()))) &&
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              this.hireDate.equals(other.getHireDate()))) &&
            ((this.i9Verified==null && other.getI9Verified()==null) || 
             (this.i9Verified!=null &&
              this.i9Verified.equals(other.getI9Verified()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              this.isDefaultBilling.equals(other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              this.isDefaultShipping.equals(other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isJobResource==null && other.getIsJobResource()==null) || 
             (this.isJobResource!=null &&
              this.isJobResource.equals(other.getIsJobResource()))) &&
            ((this.isTemplate==null && other.getIsTemplate()==null) || 
             (this.isTemplate!=null &&
              this.isTemplate.equals(other.getIsTemplate()))) &&
            ((this.jobDescription==null && other.getJobDescription()==null) || 
             (this.jobDescription!=null &&
              this.jobDescription.equals(other.getJobDescription()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              this.laborCost.equals(other.getLaborCost()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastPaidDate==null && other.getLastPaidDate()==null) || 
             (this.lastPaidDate!=null &&
              this.lastPaidDate.equals(other.getLastPaidDate()))) &&
            ((this.lastReviewDate==null && other.getLastReviewDate()==null) || 
             (this.lastReviewDate!=null &&
              this.lastReviewDate.equals(other.getLastReviewDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              java.util.Arrays.equals(this.level, other.getLevel()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              java.util.Arrays.equals(this.maritalStatus, other.getMaritalStatus()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.nextReviewDate==null && other.getNextReviewDate()==null) || 
             (this.nextReviewDate!=null &&
              this.nextReviewDate.equals(other.getNextReviewDate()))) &&
            ((this.offlineAccess==null && other.getOfflineAccess()==null) || 
             (this.offlineAccess!=null &&
              this.offlineAccess.equals(other.getOfflineAccess()))) &&
            ((this.payFrequency==null && other.getPayFrequency()==null) || 
             (this.payFrequency!=null &&
              java.util.Arrays.equals(this.payFrequency, other.getPayFrequency()))) &&
            ((this.permChangeDate==null && other.getPermChangeDate()==null) || 
             (this.permChangeDate!=null &&
              this.permChangeDate.equals(other.getPermChangeDate()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              java.util.Arrays.equals(this.permission, other.getPermission()))) &&
            ((this.permissionChange==null && other.getPermissionChange()==null) || 
             (this.permissionChange!=null &&
              java.util.Arrays.equals(this.permissionChange, other.getPermissionChange()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.primaryEarningAmount==null && other.getPrimaryEarningAmount()==null) || 
             (this.primaryEarningAmount!=null &&
              this.primaryEarningAmount.equals(other.getPrimaryEarningAmount()))) &&
            ((this.primaryEarningItem==null && other.getPrimaryEarningItem()==null) || 
             (this.primaryEarningItem!=null &&
              this.primaryEarningItem.equals(other.getPrimaryEarningItem()))) &&
            ((this.primaryEarningType==null && other.getPrimaryEarningType()==null) || 
             (this.primaryEarningType!=null &&
              this.primaryEarningType.equals(other.getPrimaryEarningType()))) &&
            ((this.purchaseOrderApprovalLimit==null && other.getPurchaseOrderApprovalLimit()==null) || 
             (this.purchaseOrderApprovalLimit!=null &&
              this.purchaseOrderApprovalLimit.equals(other.getPurchaseOrderApprovalLimit()))) &&
            ((this.purchaseOrderApprover==null && other.getPurchaseOrderApprover()==null) || 
             (this.purchaseOrderApprover!=null &&
              java.util.Arrays.equals(this.purchaseOrderApprover, other.getPurchaseOrderApprover()))) &&
            ((this.purchaseOrderLimit==null && other.getPurchaseOrderLimit()==null) || 
             (this.purchaseOrderLimit!=null &&
              this.purchaseOrderLimit.equals(other.getPurchaseOrderLimit()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.residentStatus==null && other.getResidentStatus()==null) || 
             (this.residentStatus!=null &&
              java.util.Arrays.equals(this.residentStatus, other.getResidentStatus()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole()))) &&
            ((this.roleChange==null && other.getRoleChange()==null) || 
             (this.roleChange!=null &&
              java.util.Arrays.equals(this.roleChange, other.getRoleChange()))) &&
            ((this.roleChangeDate==null && other.getRoleChangeDate()==null) || 
             (this.roleChangeDate!=null &&
              this.roleChangeDate.equals(other.getRoleChangeDate()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesRole==null && other.getSalesRole()==null) || 
             (this.salesRole!=null &&
              java.util.Arrays.equals(this.salesRole, other.getSalesRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              java.util.Arrays.equals(this.supervisor, other.getSupervisor()))) &&
            ((this.supportRep==null && other.getSupportRep()==null) || 
             (this.supportRep!=null &&
              this.supportRep.equals(other.getSupportRep()))) &&
            ((this.timeApprover==null && other.getTimeApprover()==null) || 
             (this.timeApprover!=null &&
              java.util.Arrays.equals(this.timeApprover, other.getTimeApprover()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.usePerquest==null && other.getUsePerquest()==null) || 
             (this.usePerquest!=null &&
              this.usePerquest.equals(other.getUsePerquest()))) &&
            ((this.useTimeData==null && other.getUseTimeData()==null) || 
             (this.useTimeData!=null &&
              this.useTimeData.equals(other.getUseTimeData()))) &&
            ((this.visaExpDate==null && other.getVisaExpDate()==null) || 
             (this.visaExpDate!=null &&
              this.visaExpDate.equals(other.getVisaExpDate()))) &&
            ((this.visaType==null && other.getVisaType()==null) || 
             (this.visaType!=null &&
              java.util.Arrays.equals(this.visaType, other.getVisaType()))) &&
            ((this.withholding==null && other.getWithholding()==null) || 
             (this.withholding!=null &&
              java.util.Arrays.equals(this.withholding, other.getWithholding()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              java.util.Arrays.equals(this.workCalendar, other.getWorkCalendar()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              java.util.Arrays.equals(this.workplace, other.getWorkplace()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddressLabel() != null) {
            _hashCode += getAddressLabel().hashCode();
        }
        if (getAddressPhone() != null) {
            _hashCode += getAddressPhone().hashCode();
        }
        if (getAlienNumber() != null) {
            _hashCode += getAlienNumber().hashCode();
        }
        if (getAnniversary() != null) {
            _hashCode += getAnniversary().hashCode();
        }
        if (getApprovalLimit() != null) {
            _hashCode += getApprovalLimit().hashCode();
        }
        if (getApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAuthWorkDate() != null) {
            _hashCode += getAuthWorkDate().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getBillingClass() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingClass());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingClass(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getBirthDay() != null) {
            _hashCode += getBirthDay().hashCode();
        }
        if (getCContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCommissionPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommissionPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommissionPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConcurrentWebServicesUser() != null) {
            _hashCode += getConcurrentWebServicesUser().hashCode();
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDeduction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeduction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeduction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEducation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEducation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEducation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmployeeStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeTypeKpi() != null) {
            _hashCode += getEmployeeTypeKpi().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEthnicity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEthnicity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEthnicity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseLimit() != null) {
            _hashCode += getExpenseLimit().hashCode();
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
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGender() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGender());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGender(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalSubscriptionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalSubscriptionStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHireDate() != null) {
            _hashCode += getHireDate().hashCode();
        }
        if (getI9Verified() != null) {
            _hashCode += getI9Verified().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
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
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDefaultBilling() != null) {
            _hashCode += getIsDefaultBilling().hashCode();
        }
        if (getIsDefaultShipping() != null) {
            _hashCode += getIsDefaultShipping().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsJobResource() != null) {
            _hashCode += getIsJobResource().hashCode();
        }
        if (getIsTemplate() != null) {
            _hashCode += getIsTemplate().hashCode();
        }
        if (getJobDescription() != null) {
            _hashCode += getJobDescription().hashCode();
        }
        if (getLaborCost() != null) {
            _hashCode += getLaborCost().hashCode();
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastPaidDate() != null) {
            _hashCode += getLastPaidDate().hashCode();
        }
        if (getLastReviewDate() != null) {
            _hashCode += getLastReviewDate().hashCode();
        }
        if (getLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaritalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaritalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaritalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getNextReviewDate() != null) {
            _hashCode += getNextReviewDate().hashCode();
        }
        if (getOfflineAccess() != null) {
            _hashCode += getOfflineAccess().hashCode();
        }
        if (getPayFrequency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayFrequency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayFrequency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermChangeDate() != null) {
            _hashCode += getPermChangeDate().hashCode();
        }
        if (getPermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermission(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermissionChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getPrimaryEarningAmount() != null) {
            _hashCode += getPrimaryEarningAmount().hashCode();
        }
        if (getPrimaryEarningItem() != null) {
            _hashCode += getPrimaryEarningItem().hashCode();
        }
        if (getPrimaryEarningType() != null) {
            _hashCode += getPrimaryEarningType().hashCode();
        }
        if (getPurchaseOrderApprovalLimit() != null) {
            _hashCode += getPurchaseOrderApprovalLimit().hashCode();
        }
        if (getPurchaseOrderApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderLimit() != null) {
            _hashCode += getPurchaseOrderLimit().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getResidentStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResidentStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResidentStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleChangeDate() != null) {
            _hashCode += getRoleChangeDate().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getSalesRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupervisor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupervisor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupervisor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSupportRep() != null) {
            _hashCode += getSupportRep().hashCode();
        }
        if (getTimeApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUsePerquest() != null) {
            _hashCode += getUsePerquest().hashCode();
        }
        if (getUseTimeData() != null) {
            _hashCode += getUseTimeData().hashCode();
        }
        if (getVisaExpDate() != null) {
            _hashCode += getVisaExpDate().hashCode();
        }
        if (getVisaType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisaType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisaType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWithholding() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWithholding());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWithholding(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkCalendar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkCalendar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkCalendar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkplace() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkplace());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkplace(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alienNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "alienNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anniversary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "anniversary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authWorkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "authWorkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "birthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "cContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "commissionPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deduction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "deduction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "earning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "education"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeTypeKpi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "employeeTypeKpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "expenseLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i9Verified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "I9Verified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isDefaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "jobDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lastReviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "maritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "offlineAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "permChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "permissionChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "primaryEarningAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "primaryEarningItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "primaryEarningType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "residentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "roleChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "roleChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "salesRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "supportRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "timeApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "visaExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "visaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withholding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "withholding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchCustomField"));
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
