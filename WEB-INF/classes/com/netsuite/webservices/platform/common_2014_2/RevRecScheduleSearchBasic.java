/**
 * RevRecScheduleSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class RevRecScheduleSearchBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] accountingBook;

    private java.lang.String[] amorStatus;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField amortizedAmount;

    private java.lang.String[] amorType;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField amount;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] currency;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField deferredAmount;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] destAcct;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField initialAmt;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isRecognized;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] jeDoc;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField name;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField pctComplete;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField pctRecognition;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField periodOffset;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] postPeriod;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField schedDate;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField scheduleNumber;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField scheduleNumberText;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] sourceAcct;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] srcTranPostPeriod;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] srcTranType;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField startOffset;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField templateName;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField useForeignAmounts;

    public RevRecScheduleSearchBasic() {
    }

    public RevRecScheduleSearchBasic(
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] accountingBook,
           java.lang.String[] amorStatus,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField amortizedAmount,
           java.lang.String[] amorType,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField amount,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] currency,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField deferredAmount,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] destAcct,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField initialAmt,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isRecognized,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] jeDoc,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField name,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField pctComplete,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField pctRecognition,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField periodOffset,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] postPeriod,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField schedDate,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField scheduleNumber,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField scheduleNumberText,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] sourceAcct,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] srcTranPostPeriod,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] srcTranType,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField startOffset,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField templateName,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField useForeignAmounts) {
        this.accountingBook = accountingBook;
        this.amorStatus = amorStatus;
        this.amortizedAmount = amortizedAmount;
        this.amorType = amorType;
        this.amount = amount;
        this.currency = currency;
        this.deferredAmount = deferredAmount;
        this.destAcct = destAcct;
        this.initialAmt = initialAmt;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isRecognized = isRecognized;
        this.jeDoc = jeDoc;
        this.name = name;
        this.pctComplete = pctComplete;
        this.pctRecognition = pctRecognition;
        this.periodOffset = periodOffset;
        this.postPeriod = postPeriod;
        this.schedDate = schedDate;
        this.scheduleNumber = scheduleNumber;
        this.scheduleNumberText = scheduleNumberText;
        this.sourceAcct = sourceAcct;
        this.srcTranPostPeriod = srcTranPostPeriod;
        this.srcTranType = srcTranType;
        this.startOffset = startOffset;
        this.templateName = templateName;
        this.useForeignAmounts = useForeignAmounts;
    }


    /**
     * Gets the accountingBook value for this RevRecScheduleSearchBasic.
     * 
     * @return accountingBook
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getAccountingBook() {
        return accountingBook;
    }


    /**
     * Sets the accountingBook value for this RevRecScheduleSearchBasic.
     * 
     * @param accountingBook
     */
    public void setAccountingBook(com.netsuite.webservices.platform.core_2014_2.RecordRef[] accountingBook) {
        this.accountingBook = accountingBook;
    }


    /**
     * Gets the amorStatus value for this RevRecScheduleSearchBasic.
     * 
     * @return amorStatus
     */
    public java.lang.String[] getAmorStatus() {
        return amorStatus;
    }


    /**
     * Sets the amorStatus value for this RevRecScheduleSearchBasic.
     * 
     * @param amorStatus
     */
    public void setAmorStatus(java.lang.String[] amorStatus) {
        this.amorStatus = amorStatus;
    }


    /**
     * Gets the amortizedAmount value for this RevRecScheduleSearchBasic.
     * 
     * @return amortizedAmount
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getAmortizedAmount() {
        return amortizedAmount;
    }


    /**
     * Sets the amortizedAmount value for this RevRecScheduleSearchBasic.
     * 
     * @param amortizedAmount
     */
    public void setAmortizedAmount(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField amortizedAmount) {
        this.amortizedAmount = amortizedAmount;
    }


    /**
     * Gets the amorType value for this RevRecScheduleSearchBasic.
     * 
     * @return amorType
     */
    public java.lang.String[] getAmorType() {
        return amorType;
    }


    /**
     * Sets the amorType value for this RevRecScheduleSearchBasic.
     * 
     * @param amorType
     */
    public void setAmorType(java.lang.String[] amorType) {
        this.amorType = amorType;
    }


    /**
     * Gets the amount value for this RevRecScheduleSearchBasic.
     * 
     * @return amount
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RevRecScheduleSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this RevRecScheduleSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this RevRecScheduleSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2014_2.RecordRef[] currency) {
        this.currency = currency;
    }


    /**
     * Gets the deferredAmount value for this RevRecScheduleSearchBasic.
     * 
     * @return deferredAmount
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getDeferredAmount() {
        return deferredAmount;
    }


    /**
     * Sets the deferredAmount value for this RevRecScheduleSearchBasic.
     * 
     * @param deferredAmount
     */
    public void setDeferredAmount(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField deferredAmount) {
        this.deferredAmount = deferredAmount;
    }


    /**
     * Gets the destAcct value for this RevRecScheduleSearchBasic.
     * 
     * @return destAcct
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getDestAcct() {
        return destAcct;
    }


    /**
     * Sets the destAcct value for this RevRecScheduleSearchBasic.
     * 
     * @param destAcct
     */
    public void setDestAcct(com.netsuite.webservices.platform.core_2014_2.RecordRef[] destAcct) {
        this.destAcct = destAcct;
    }


    /**
     * Gets the initialAmt value for this RevRecScheduleSearchBasic.
     * 
     * @return initialAmt
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getInitialAmt() {
        return initialAmt;
    }


    /**
     * Sets the initialAmt value for this RevRecScheduleSearchBasic.
     * 
     * @param initialAmt
     */
    public void setInitialAmt(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField initialAmt) {
        this.initialAmt = initialAmt;
    }


    /**
     * Gets the internalId value for this RevRecScheduleSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RevRecScheduleSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this RevRecScheduleSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this RevRecScheduleSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isRecognized value for this RevRecScheduleSearchBasic.
     * 
     * @return isRecognized
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsRecognized() {
        return isRecognized;
    }


    /**
     * Sets the isRecognized value for this RevRecScheduleSearchBasic.
     * 
     * @param isRecognized
     */
    public void setIsRecognized(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isRecognized) {
        this.isRecognized = isRecognized;
    }


    /**
     * Gets the jeDoc value for this RevRecScheduleSearchBasic.
     * 
     * @return jeDoc
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getJeDoc() {
        return jeDoc;
    }


    /**
     * Sets the jeDoc value for this RevRecScheduleSearchBasic.
     * 
     * @param jeDoc
     */
    public void setJeDoc(com.netsuite.webservices.platform.core_2014_2.RecordRef[] jeDoc) {
        this.jeDoc = jeDoc;
    }


    /**
     * Gets the name value for this RevRecScheduleSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this RevRecScheduleSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2014_2.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the pctComplete value for this RevRecScheduleSearchBasic.
     * 
     * @return pctComplete
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getPctComplete() {
        return pctComplete;
    }


    /**
     * Sets the pctComplete value for this RevRecScheduleSearchBasic.
     * 
     * @param pctComplete
     */
    public void setPctComplete(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField pctComplete) {
        this.pctComplete = pctComplete;
    }


    /**
     * Gets the pctRecognition value for this RevRecScheduleSearchBasic.
     * 
     * @return pctRecognition
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getPctRecognition() {
        return pctRecognition;
    }


    /**
     * Sets the pctRecognition value for this RevRecScheduleSearchBasic.
     * 
     * @param pctRecognition
     */
    public void setPctRecognition(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField pctRecognition) {
        this.pctRecognition = pctRecognition;
    }


    /**
     * Gets the periodOffset value for this RevRecScheduleSearchBasic.
     * 
     * @return periodOffset
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getPeriodOffset() {
        return periodOffset;
    }


    /**
     * Sets the periodOffset value for this RevRecScheduleSearchBasic.
     * 
     * @param periodOffset
     */
    public void setPeriodOffset(com.netsuite.webservices.platform.core_2014_2.SearchLongField periodOffset) {
        this.periodOffset = periodOffset;
    }


    /**
     * Gets the postPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @return postPeriod
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getPostPeriod() {
        return postPeriod;
    }


    /**
     * Sets the postPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @param postPeriod
     */
    public void setPostPeriod(com.netsuite.webservices.platform.core_2014_2.RecordRef[] postPeriod) {
        this.postPeriod = postPeriod;
    }


    /**
     * Gets the schedDate value for this RevRecScheduleSearchBasic.
     * 
     * @return schedDate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getSchedDate() {
        return schedDate;
    }


    /**
     * Sets the schedDate value for this RevRecScheduleSearchBasic.
     * 
     * @param schedDate
     */
    public void setSchedDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField schedDate) {
        this.schedDate = schedDate;
    }


    /**
     * Gets the scheduleNumber value for this RevRecScheduleSearchBasic.
     * 
     * @return scheduleNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getScheduleNumber() {
        return scheduleNumber;
    }


    /**
     * Sets the scheduleNumber value for this RevRecScheduleSearchBasic.
     * 
     * @param scheduleNumber
     */
    public void setScheduleNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }


    /**
     * Gets the scheduleNumberText value for this RevRecScheduleSearchBasic.
     * 
     * @return scheduleNumberText
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getScheduleNumberText() {
        return scheduleNumberText;
    }


    /**
     * Sets the scheduleNumberText value for this RevRecScheduleSearchBasic.
     * 
     * @param scheduleNumberText
     */
    public void setScheduleNumberText(com.netsuite.webservices.platform.core_2014_2.SearchStringField scheduleNumberText) {
        this.scheduleNumberText = scheduleNumberText;
    }


    /**
     * Gets the sourceAcct value for this RevRecScheduleSearchBasic.
     * 
     * @return sourceAcct
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSourceAcct() {
        return sourceAcct;
    }


    /**
     * Sets the sourceAcct value for this RevRecScheduleSearchBasic.
     * 
     * @param sourceAcct
     */
    public void setSourceAcct(com.netsuite.webservices.platform.core_2014_2.RecordRef[] sourceAcct) {
        this.sourceAcct = sourceAcct;
    }


    /**
     * Gets the srcTranPostPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @return srcTranPostPeriod
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSrcTranPostPeriod() {
        return srcTranPostPeriod;
    }


    /**
     * Sets the srcTranPostPeriod value for this RevRecScheduleSearchBasic.
     * 
     * @param srcTranPostPeriod
     */
    public void setSrcTranPostPeriod(com.netsuite.webservices.platform.core_2014_2.RecordRef[] srcTranPostPeriod) {
        this.srcTranPostPeriod = srcTranPostPeriod;
    }


    /**
     * Gets the srcTranType value for this RevRecScheduleSearchBasic.
     * 
     * @return srcTranType
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSrcTranType() {
        return srcTranType;
    }


    /**
     * Sets the srcTranType value for this RevRecScheduleSearchBasic.
     * 
     * @param srcTranType
     */
    public void setSrcTranType(com.netsuite.webservices.platform.core_2014_2.RecordRef[] srcTranType) {
        this.srcTranType = srcTranType;
    }


    /**
     * Gets the startOffset value for this RevRecScheduleSearchBasic.
     * 
     * @return startOffset
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getStartOffset() {
        return startOffset;
    }


    /**
     * Sets the startOffset value for this RevRecScheduleSearchBasic.
     * 
     * @param startOffset
     */
    public void setStartOffset(com.netsuite.webservices.platform.core_2014_2.SearchLongField startOffset) {
        this.startOffset = startOffset;
    }


    /**
     * Gets the templateName value for this RevRecScheduleSearchBasic.
     * 
     * @return templateName
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this RevRecScheduleSearchBasic.
     * 
     * @param templateName
     */
    public void setTemplateName(com.netsuite.webservices.platform.core_2014_2.SearchStringField templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets the useForeignAmounts value for this RevRecScheduleSearchBasic.
     * 
     * @return useForeignAmounts
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getUseForeignAmounts() {
        return useForeignAmounts;
    }


    /**
     * Sets the useForeignAmounts value for this RevRecScheduleSearchBasic.
     * 
     * @param useForeignAmounts
     */
    public void setUseForeignAmounts(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevRecScheduleSearchBasic)) return false;
        RevRecScheduleSearchBasic other = (RevRecScheduleSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountingBook==null && other.getAccountingBook()==null) || 
             (this.accountingBook!=null &&
              java.util.Arrays.equals(this.accountingBook, other.getAccountingBook()))) &&
            ((this.amorStatus==null && other.getAmorStatus()==null) || 
             (this.amorStatus!=null &&
              java.util.Arrays.equals(this.amorStatus, other.getAmorStatus()))) &&
            ((this.amortizedAmount==null && other.getAmortizedAmount()==null) || 
             (this.amortizedAmount!=null &&
              this.amortizedAmount.equals(other.getAmortizedAmount()))) &&
            ((this.amorType==null && other.getAmorType()==null) || 
             (this.amorType!=null &&
              java.util.Arrays.equals(this.amorType, other.getAmorType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.deferredAmount==null && other.getDeferredAmount()==null) || 
             (this.deferredAmount!=null &&
              this.deferredAmount.equals(other.getDeferredAmount()))) &&
            ((this.destAcct==null && other.getDestAcct()==null) || 
             (this.destAcct!=null &&
              java.util.Arrays.equals(this.destAcct, other.getDestAcct()))) &&
            ((this.initialAmt==null && other.getInitialAmt()==null) || 
             (this.initialAmt!=null &&
              this.initialAmt.equals(other.getInitialAmt()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isRecognized==null && other.getIsRecognized()==null) || 
             (this.isRecognized!=null &&
              this.isRecognized.equals(other.getIsRecognized()))) &&
            ((this.jeDoc==null && other.getJeDoc()==null) || 
             (this.jeDoc!=null &&
              java.util.Arrays.equals(this.jeDoc, other.getJeDoc()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pctComplete==null && other.getPctComplete()==null) || 
             (this.pctComplete!=null &&
              this.pctComplete.equals(other.getPctComplete()))) &&
            ((this.pctRecognition==null && other.getPctRecognition()==null) || 
             (this.pctRecognition!=null &&
              this.pctRecognition.equals(other.getPctRecognition()))) &&
            ((this.periodOffset==null && other.getPeriodOffset()==null) || 
             (this.periodOffset!=null &&
              this.periodOffset.equals(other.getPeriodOffset()))) &&
            ((this.postPeriod==null && other.getPostPeriod()==null) || 
             (this.postPeriod!=null &&
              java.util.Arrays.equals(this.postPeriod, other.getPostPeriod()))) &&
            ((this.schedDate==null && other.getSchedDate()==null) || 
             (this.schedDate!=null &&
              this.schedDate.equals(other.getSchedDate()))) &&
            ((this.scheduleNumber==null && other.getScheduleNumber()==null) || 
             (this.scheduleNumber!=null &&
              this.scheduleNumber.equals(other.getScheduleNumber()))) &&
            ((this.scheduleNumberText==null && other.getScheduleNumberText()==null) || 
             (this.scheduleNumberText!=null &&
              this.scheduleNumberText.equals(other.getScheduleNumberText()))) &&
            ((this.sourceAcct==null && other.getSourceAcct()==null) || 
             (this.sourceAcct!=null &&
              java.util.Arrays.equals(this.sourceAcct, other.getSourceAcct()))) &&
            ((this.srcTranPostPeriod==null && other.getSrcTranPostPeriod()==null) || 
             (this.srcTranPostPeriod!=null &&
              java.util.Arrays.equals(this.srcTranPostPeriod, other.getSrcTranPostPeriod()))) &&
            ((this.srcTranType==null && other.getSrcTranType()==null) || 
             (this.srcTranType!=null &&
              java.util.Arrays.equals(this.srcTranType, other.getSrcTranType()))) &&
            ((this.startOffset==null && other.getStartOffset()==null) || 
             (this.startOffset!=null &&
              this.startOffset.equals(other.getStartOffset()))) &&
            ((this.templateName==null && other.getTemplateName()==null) || 
             (this.templateName!=null &&
              this.templateName.equals(other.getTemplateName()))) &&
            ((this.useForeignAmounts==null && other.getUseForeignAmounts()==null) || 
             (this.useForeignAmounts!=null &&
              this.useForeignAmounts.equals(other.getUseForeignAmounts())));
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
        if (getAccountingBook() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingBook());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingBook(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmorStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmortizedAmount() != null) {
            _hashCode += getAmortizedAmount().hashCode();
        }
        if (getAmorType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmorType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmorType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredAmount() != null) {
            _hashCode += getDeferredAmount().hashCode();
        }
        if (getDestAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInitialAmt() != null) {
            _hashCode += getInitialAmt().hashCode();
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
        if (getIsRecognized() != null) {
            _hashCode += getIsRecognized().hashCode();
        }
        if (getJeDoc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJeDoc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJeDoc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPctComplete() != null) {
            _hashCode += getPctComplete().hashCode();
        }
        if (getPctRecognition() != null) {
            _hashCode += getPctRecognition().hashCode();
        }
        if (getPeriodOffset() != null) {
            _hashCode += getPeriodOffset().hashCode();
        }
        if (getPostPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchedDate() != null) {
            _hashCode += getSchedDate().hashCode();
        }
        if (getScheduleNumber() != null) {
            _hashCode += getScheduleNumber().hashCode();
        }
        if (getScheduleNumberText() != null) {
            _hashCode += getScheduleNumberText().hashCode();
        }
        if (getSourceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrcTranPostPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrcTranPostPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrcTranPostPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSrcTranType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrcTranType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrcTranType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartOffset() != null) {
            _hashCode += getStartOffset().hashCode();
        }
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        if (getUseForeignAmounts() != null) {
            _hashCode += getUseForeignAmounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevRecScheduleSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "amorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amortizedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "amortizedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "deferredAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "destAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "initialAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isRecognized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isRecognized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jeDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "jeDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pctRecognition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "pctRecognition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "postPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "schedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "scheduleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleNumberText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "scheduleNumberText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "sourceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTranPostPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "srcTranPostPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcTranType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "srcTranType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "startOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "templateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
