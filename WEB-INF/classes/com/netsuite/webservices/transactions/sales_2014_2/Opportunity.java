/**
 * Opportunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.sales_2014_2;

public class Opportunity  extends com.netsuite.webservices.platform.core_2014_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.RecordRef customForm;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef currency;

    private java.lang.Double estimatedBudget;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef entity;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef job;

    private java.lang.String title;

    private java.lang.String tranId;

    private java.lang.String source;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef salesRep;

    private java.lang.String contribPct;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef partner;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef salesGroup;

    private java.lang.Boolean syncSalesTeams;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef leadSource;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef entityStatus;

    private java.lang.Double probability;

    private java.util.Calendar tranDate;

    private java.util.Calendar expectedCloseDate;

    private java.lang.Long daysOpen;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef forecastType;

    private java.lang.String currencyName;

    private java.lang.Double exchangeRate;

    private java.lang.Double projectedTotal;

    private java.lang.Double rangeLow;

    private java.lang.Double rangeHigh;

    private java.lang.Double projAltSalesAmt;

    private java.lang.Double altSalesRangeLow;

    private java.lang.Double altSalesRangeHigh;

    private java.lang.Double weightedTotal;

    private java.lang.String actionItem;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef winLossReason;

    private java.lang.String memo;

    private java.lang.Double taxTotal;

    private java.lang.Boolean isBudgetApproved;

    private java.lang.Double tax2Total;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef salesReadiness;

    private java.lang.Double totalCostEstimate;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef buyingTimeFrame;

    private java.lang.Double estGrossProfit;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef buyingReason;

    private java.lang.Double estGrossProfitPercent;

    private com.netsuite.webservices.platform.common_2014_2.Address billingAddress;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef billAddressList;

    private com.netsuite.webservices.platform.common_2014_2.Address shippingAddress;

    private java.lang.Boolean shipIsResidential;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef shipAddressList;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef _class;

    private java.util.Calendar closeDate;

    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef department;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef location;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef subsidiary;

    private java.lang.String status;

    private java.lang.String vatRegNum;

    private java.lang.Boolean syncPartnerTeams;

    private com.netsuite.webservices.transactions.sales_2014_2.OpportunitySalesTeam[] salesTeamList;

    private com.netsuite.webservices.platform.common_2014_2.Partners[] partnersList;

    private com.netsuite.webservices.transactions.sales_2014_2.OpportunityItem[] itemList;

    private com.netsuite.webservices.transactions.sales_2014_2.OpportunityCompetitors[] competitorsList;

    private com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Opportunity() {
    }

    public Opportunity(
           java.lang.String[] nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2014_2.RecordRef customForm,
           com.netsuite.webservices.platform.core_2014_2.RecordRef currency,
           java.lang.Double estimatedBudget,
           com.netsuite.webservices.platform.core_2014_2.RecordRef entity,
           com.netsuite.webservices.platform.core_2014_2.RecordRef job,
           java.lang.String title,
           java.lang.String tranId,
           java.lang.String source,
           com.netsuite.webservices.platform.core_2014_2.RecordRef salesRep,
           java.lang.String contribPct,
           com.netsuite.webservices.platform.core_2014_2.RecordRef partner,
           com.netsuite.webservices.platform.core_2014_2.RecordRef salesGroup,
           java.lang.Boolean syncSalesTeams,
           com.netsuite.webservices.platform.core_2014_2.RecordRef leadSource,
           com.netsuite.webservices.platform.core_2014_2.RecordRef entityStatus,
           java.lang.Double probability,
           java.util.Calendar tranDate,
           java.util.Calendar expectedCloseDate,
           java.lang.Long daysOpen,
           com.netsuite.webservices.platform.core_2014_2.RecordRef forecastType,
           java.lang.String currencyName,
           java.lang.Double exchangeRate,
           java.lang.Double projectedTotal,
           java.lang.Double rangeLow,
           java.lang.Double rangeHigh,
           java.lang.Double projAltSalesAmt,
           java.lang.Double altSalesRangeLow,
           java.lang.Double altSalesRangeHigh,
           java.lang.Double weightedTotal,
           java.lang.String actionItem,
           com.netsuite.webservices.platform.core_2014_2.RecordRef winLossReason,
           java.lang.String memo,
           java.lang.Double taxTotal,
           java.lang.Boolean isBudgetApproved,
           java.lang.Double tax2Total,
           com.netsuite.webservices.platform.core_2014_2.RecordRef salesReadiness,
           java.lang.Double totalCostEstimate,
           com.netsuite.webservices.platform.core_2014_2.RecordRef buyingTimeFrame,
           java.lang.Double estGrossProfit,
           com.netsuite.webservices.platform.core_2014_2.RecordRef buyingReason,
           java.lang.Double estGrossProfitPercent,
           com.netsuite.webservices.platform.common_2014_2.Address billingAddress,
           com.netsuite.webservices.platform.core_2014_2.RecordRef billAddressList,
           com.netsuite.webservices.platform.common_2014_2.Address shippingAddress,
           java.lang.Boolean shipIsResidential,
           com.netsuite.webservices.platform.core_2014_2.RecordRef shipAddressList,
           com.netsuite.webservices.platform.core_2014_2.RecordRef _class,
           java.util.Calendar closeDate,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.netsuite.webservices.platform.core_2014_2.RecordRef department,
           com.netsuite.webservices.platform.core_2014_2.RecordRef location,
           com.netsuite.webservices.platform.core_2014_2.RecordRef subsidiary,
           java.lang.String status,
           java.lang.String vatRegNum,
           java.lang.Boolean syncPartnerTeams,
           com.netsuite.webservices.transactions.sales_2014_2.OpportunitySalesTeam[] salesTeamList,
           com.netsuite.webservices.platform.common_2014_2.Partners[] partnersList,
           com.netsuite.webservices.transactions.sales_2014_2.OpportunityItem[] itemList,
           com.netsuite.webservices.transactions.sales_2014_2.OpportunityCompetitors[] competitorsList,
           com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.currency = currency;
        this.estimatedBudget = estimatedBudget;
        this.entity = entity;
        this.job = job;
        this.title = title;
        this.tranId = tranId;
        this.source = source;
        this.salesRep = salesRep;
        this.contribPct = contribPct;
        this.partner = partner;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.leadSource = leadSource;
        this.entityStatus = entityStatus;
        this.probability = probability;
        this.tranDate = tranDate;
        this.expectedCloseDate = expectedCloseDate;
        this.daysOpen = daysOpen;
        this.forecastType = forecastType;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.projectedTotal = projectedTotal;
        this.rangeLow = rangeLow;
        this.rangeHigh = rangeHigh;
        this.projAltSalesAmt = projAltSalesAmt;
        this.altSalesRangeLow = altSalesRangeLow;
        this.altSalesRangeHigh = altSalesRangeHigh;
        this.weightedTotal = weightedTotal;
        this.actionItem = actionItem;
        this.winLossReason = winLossReason;
        this.memo = memo;
        this.taxTotal = taxTotal;
        this.isBudgetApproved = isBudgetApproved;
        this.tax2Total = tax2Total;
        this.salesReadiness = salesReadiness;
        this.totalCostEstimate = totalCostEstimate;
        this.buyingTimeFrame = buyingTimeFrame;
        this.estGrossProfit = estGrossProfit;
        this.buyingReason = buyingReason;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this._class = _class;
        this.closeDate = closeDate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.department = department;
        this.location = location;
        this.subsidiary = subsidiary;
        this.status = status;
        this.vatRegNum = vatRegNum;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.itemList = itemList;
        this.competitorsList = competitorsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Opportunity.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Opportunity.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2014_2.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the currency value for this Opportunity.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Opportunity.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2014_2.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the estimatedBudget value for this Opportunity.
     * 
     * @return estimatedBudget
     */
    public java.lang.Double getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this Opportunity.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(java.lang.Double estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }


    /**
     * Gets the entity value for this Opportunity.
     * 
     * @return entity
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Opportunity.
     * 
     * @param entity
     */
    public void setEntity(com.netsuite.webservices.platform.core_2014_2.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the job value for this Opportunity.
     * 
     * @return job
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this Opportunity.
     * 
     * @param job
     */
    public void setJob(com.netsuite.webservices.platform.core_2014_2.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the title value for this Opportunity.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Opportunity.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the tranId value for this Opportunity.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this Opportunity.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the source value for this Opportunity.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this Opportunity.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the salesRep value for this Opportunity.
     * 
     * @return salesRep
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this Opportunity.
     * 
     * @param salesRep
     */
    public void setSalesRep(com.netsuite.webservices.platform.core_2014_2.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the contribPct value for this Opportunity.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this Opportunity.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the partner value for this Opportunity.
     * 
     * @return partner
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this Opportunity.
     * 
     * @param partner
     */
    public void setPartner(com.netsuite.webservices.platform.core_2014_2.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the salesGroup value for this Opportunity.
     * 
     * @return salesGroup
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this Opportunity.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(com.netsuite.webservices.platform.core_2014_2.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the syncSalesTeams value for this Opportunity.
     * 
     * @return syncSalesTeams
     */
    public java.lang.Boolean getSyncSalesTeams() {
        return syncSalesTeams;
    }


    /**
     * Sets the syncSalesTeams value for this Opportunity.
     * 
     * @param syncSalesTeams
     */
    public void setSyncSalesTeams(java.lang.Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }


    /**
     * Gets the leadSource value for this Opportunity.
     * 
     * @return leadSource
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Opportunity.
     * 
     * @param leadSource
     */
    public void setLeadSource(com.netsuite.webservices.platform.core_2014_2.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the entityStatus value for this Opportunity.
     * 
     * @return entityStatus
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this Opportunity.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(com.netsuite.webservices.platform.core_2014_2.RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the probability value for this Opportunity.
     * 
     * @return probability
     */
    public java.lang.Double getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this Opportunity.
     * 
     * @param probability
     */
    public void setProbability(java.lang.Double probability) {
        this.probability = probability;
    }


    /**
     * Gets the tranDate value for this Opportunity.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this Opportunity.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the expectedCloseDate value for this Opportunity.
     * 
     * @return expectedCloseDate
     */
    public java.util.Calendar getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this Opportunity.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(java.util.Calendar expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }


    /**
     * Gets the daysOpen value for this Opportunity.
     * 
     * @return daysOpen
     */
    public java.lang.Long getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this Opportunity.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(java.lang.Long daysOpen) {
        this.daysOpen = daysOpen;
    }


    /**
     * Gets the forecastType value for this Opportunity.
     * 
     * @return forecastType
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this Opportunity.
     * 
     * @param forecastType
     */
    public void setForecastType(com.netsuite.webservices.platform.core_2014_2.RecordRef forecastType) {
        this.forecastType = forecastType;
    }


    /**
     * Gets the currencyName value for this Opportunity.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this Opportunity.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the exchangeRate value for this Opportunity.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Opportunity.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the projectedTotal value for this Opportunity.
     * 
     * @return projectedTotal
     */
    public java.lang.Double getProjectedTotal() {
        return projectedTotal;
    }


    /**
     * Sets the projectedTotal value for this Opportunity.
     * 
     * @param projectedTotal
     */
    public void setProjectedTotal(java.lang.Double projectedTotal) {
        this.projectedTotal = projectedTotal;
    }


    /**
     * Gets the rangeLow value for this Opportunity.
     * 
     * @return rangeLow
     */
    public java.lang.Double getRangeLow() {
        return rangeLow;
    }


    /**
     * Sets the rangeLow value for this Opportunity.
     * 
     * @param rangeLow
     */
    public void setRangeLow(java.lang.Double rangeLow) {
        this.rangeLow = rangeLow;
    }


    /**
     * Gets the rangeHigh value for this Opportunity.
     * 
     * @return rangeHigh
     */
    public java.lang.Double getRangeHigh() {
        return rangeHigh;
    }


    /**
     * Sets the rangeHigh value for this Opportunity.
     * 
     * @param rangeHigh
     */
    public void setRangeHigh(java.lang.Double rangeHigh) {
        this.rangeHigh = rangeHigh;
    }


    /**
     * Gets the projAltSalesAmt value for this Opportunity.
     * 
     * @return projAltSalesAmt
     */
    public java.lang.Double getProjAltSalesAmt() {
        return projAltSalesAmt;
    }


    /**
     * Sets the projAltSalesAmt value for this Opportunity.
     * 
     * @param projAltSalesAmt
     */
    public void setProjAltSalesAmt(java.lang.Double projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }


    /**
     * Gets the altSalesRangeLow value for this Opportunity.
     * 
     * @return altSalesRangeLow
     */
    public java.lang.Double getAltSalesRangeLow() {
        return altSalesRangeLow;
    }


    /**
     * Sets the altSalesRangeLow value for this Opportunity.
     * 
     * @param altSalesRangeLow
     */
    public void setAltSalesRangeLow(java.lang.Double altSalesRangeLow) {
        this.altSalesRangeLow = altSalesRangeLow;
    }


    /**
     * Gets the altSalesRangeHigh value for this Opportunity.
     * 
     * @return altSalesRangeHigh
     */
    public java.lang.Double getAltSalesRangeHigh() {
        return altSalesRangeHigh;
    }


    /**
     * Sets the altSalesRangeHigh value for this Opportunity.
     * 
     * @param altSalesRangeHigh
     */
    public void setAltSalesRangeHigh(java.lang.Double altSalesRangeHigh) {
        this.altSalesRangeHigh = altSalesRangeHigh;
    }


    /**
     * Gets the weightedTotal value for this Opportunity.
     * 
     * @return weightedTotal
     */
    public java.lang.Double getWeightedTotal() {
        return weightedTotal;
    }


    /**
     * Sets the weightedTotal value for this Opportunity.
     * 
     * @param weightedTotal
     */
    public void setWeightedTotal(java.lang.Double weightedTotal) {
        this.weightedTotal = weightedTotal;
    }


    /**
     * Gets the actionItem value for this Opportunity.
     * 
     * @return actionItem
     */
    public java.lang.String getActionItem() {
        return actionItem;
    }


    /**
     * Sets the actionItem value for this Opportunity.
     * 
     * @param actionItem
     */
    public void setActionItem(java.lang.String actionItem) {
        this.actionItem = actionItem;
    }


    /**
     * Gets the winLossReason value for this Opportunity.
     * 
     * @return winLossReason
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getWinLossReason() {
        return winLossReason;
    }


    /**
     * Sets the winLossReason value for this Opportunity.
     * 
     * @param winLossReason
     */
    public void setWinLossReason(com.netsuite.webservices.platform.core_2014_2.RecordRef winLossReason) {
        this.winLossReason = winLossReason;
    }


    /**
     * Gets the memo value for this Opportunity.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this Opportunity.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the taxTotal value for this Opportunity.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this Opportunity.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the isBudgetApproved value for this Opportunity.
     * 
     * @return isBudgetApproved
     */
    public java.lang.Boolean getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this Opportunity.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(java.lang.Boolean isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }


    /**
     * Gets the tax2Total value for this Opportunity.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this Opportunity.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the salesReadiness value for this Opportunity.
     * 
     * @return salesReadiness
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this Opportunity.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(com.netsuite.webservices.platform.core_2014_2.RecordRef salesReadiness) {
        this.salesReadiness = salesReadiness;
    }


    /**
     * Gets the totalCostEstimate value for this Opportunity.
     * 
     * @return totalCostEstimate
     */
    public java.lang.Double getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this Opportunity.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(java.lang.Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }


    /**
     * Gets the buyingTimeFrame value for this Opportunity.
     * 
     * @return buyingTimeFrame
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this Opportunity.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(com.netsuite.webservices.platform.core_2014_2.RecordRef buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }


    /**
     * Gets the estGrossProfit value for this Opportunity.
     * 
     * @return estGrossProfit
     */
    public java.lang.Double getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this Opportunity.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(java.lang.Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the buyingReason value for this Opportunity.
     * 
     * @return buyingReason
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this Opportunity.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(com.netsuite.webservices.platform.core_2014_2.RecordRef buyingReason) {
        this.buyingReason = buyingReason;
    }


    /**
     * Gets the estGrossProfitPercent value for this Opportunity.
     * 
     * @return estGrossProfitPercent
     */
    public java.lang.Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this Opportunity.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(java.lang.Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }


    /**
     * Gets the billingAddress value for this Opportunity.
     * 
     * @return billingAddress
     */
    public com.netsuite.webservices.platform.common_2014_2.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this Opportunity.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.netsuite.webservices.platform.common_2014_2.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the billAddressList value for this Opportunity.
     * 
     * @return billAddressList
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this Opportunity.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(com.netsuite.webservices.platform.core_2014_2.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the shippingAddress value for this Opportunity.
     * 
     * @return shippingAddress
     */
    public com.netsuite.webservices.platform.common_2014_2.Address getShippingAddress() {
        return shippingAddress;
    }


    /**
     * Sets the shippingAddress value for this Opportunity.
     * 
     * @param shippingAddress
     */
    public void setShippingAddress(com.netsuite.webservices.platform.common_2014_2.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    /**
     * Gets the shipIsResidential value for this Opportunity.
     * 
     * @return shipIsResidential
     */
    public java.lang.Boolean getShipIsResidential() {
        return shipIsResidential;
    }


    /**
     * Sets the shipIsResidential value for this Opportunity.
     * 
     * @param shipIsResidential
     */
    public void setShipIsResidential(java.lang.Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }


    /**
     * Gets the shipAddressList value for this Opportunity.
     * 
     * @return shipAddressList
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this Opportunity.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(com.netsuite.webservices.platform.core_2014_2.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the _class value for this Opportunity.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this Opportunity.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2014_2.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the closeDate value for this Opportunity.
     * 
     * @return closeDate
     */
    public java.util.Calendar getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this Opportunity.
     * 
     * @param closeDate
     */
    public void setCloseDate(java.util.Calendar closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the createdDate value for this Opportunity.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Opportunity.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this Opportunity.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Opportunity.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the department value for this Opportunity.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Opportunity.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2014_2.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Opportunity.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Opportunity.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2014_2.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiary value for this Opportunity.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this Opportunity.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2014_2.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the status value for this Opportunity.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Opportunity.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the vatRegNum value for this Opportunity.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this Opportunity.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the syncPartnerTeams value for this Opportunity.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this Opportunity.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the salesTeamList value for this Opportunity.
     * 
     * @return salesTeamList
     */
    public com.netsuite.webservices.transactions.sales_2014_2.OpportunitySalesTeam[] getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this Opportunity.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(com.netsuite.webservices.transactions.sales_2014_2.OpportunitySalesTeam[] salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the partnersList value for this Opportunity.
     * 
     * @return partnersList
     */
    public com.netsuite.webservices.platform.common_2014_2.Partners[] getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this Opportunity.
     * 
     * @param partnersList
     */
    public void setPartnersList(com.netsuite.webservices.platform.common_2014_2.Partners[] partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the itemList value for this Opportunity.
     * 
     * @return itemList
     */
    public com.netsuite.webservices.transactions.sales_2014_2.OpportunityItem[] getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this Opportunity.
     * 
     * @param itemList
     */
    public void setItemList(com.netsuite.webservices.transactions.sales_2014_2.OpportunityItem[] itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the competitorsList value for this Opportunity.
     * 
     * @return competitorsList
     */
    public com.netsuite.webservices.transactions.sales_2014_2.OpportunityCompetitors[] getCompetitorsList() {
        return competitorsList;
    }


    /**
     * Sets the competitorsList value for this Opportunity.
     * 
     * @param competitorsList
     */
    public void setCompetitorsList(com.netsuite.webservices.transactions.sales_2014_2.OpportunityCompetitors[] competitorsList) {
        this.competitorsList = competitorsList;
    }


    /**
     * Gets the customFieldList value for this Opportunity.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Opportunity.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Opportunity.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Opportunity.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Opportunity.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Opportunity.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Opportunity)) return false;
        Opportunity other = (Opportunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              this.estimatedBudget.equals(other.getEstimatedBudget()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.syncSalesTeams==null && other.getSyncSalesTeams()==null) || 
             (this.syncSalesTeams!=null &&
              this.syncSalesTeams.equals(other.getSyncSalesTeams()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              this.expectedCloseDate.equals(other.getExpectedCloseDate()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              this.daysOpen.equals(other.getDaysOpen()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              this.forecastType.equals(other.getForecastType()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.projectedTotal==null && other.getProjectedTotal()==null) || 
             (this.projectedTotal!=null &&
              this.projectedTotal.equals(other.getProjectedTotal()))) &&
            ((this.rangeLow==null && other.getRangeLow()==null) || 
             (this.rangeLow!=null &&
              this.rangeLow.equals(other.getRangeLow()))) &&
            ((this.rangeHigh==null && other.getRangeHigh()==null) || 
             (this.rangeHigh!=null &&
              this.rangeHigh.equals(other.getRangeHigh()))) &&
            ((this.projAltSalesAmt==null && other.getProjAltSalesAmt()==null) || 
             (this.projAltSalesAmt!=null &&
              this.projAltSalesAmt.equals(other.getProjAltSalesAmt()))) &&
            ((this.altSalesRangeLow==null && other.getAltSalesRangeLow()==null) || 
             (this.altSalesRangeLow!=null &&
              this.altSalesRangeLow.equals(other.getAltSalesRangeLow()))) &&
            ((this.altSalesRangeHigh==null && other.getAltSalesRangeHigh()==null) || 
             (this.altSalesRangeHigh!=null &&
              this.altSalesRangeHigh.equals(other.getAltSalesRangeHigh()))) &&
            ((this.weightedTotal==null && other.getWeightedTotal()==null) || 
             (this.weightedTotal!=null &&
              this.weightedTotal.equals(other.getWeightedTotal()))) &&
            ((this.actionItem==null && other.getActionItem()==null) || 
             (this.actionItem!=null &&
              this.actionItem.equals(other.getActionItem()))) &&
            ((this.winLossReason==null && other.getWinLossReason()==null) || 
             (this.winLossReason!=null &&
              this.winLossReason.equals(other.getWinLossReason()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              this.isBudgetApproved.equals(other.getIsBudgetApproved()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              this.salesReadiness.equals(other.getSalesReadiness()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              this.totalCostEstimate.equals(other.getTotalCostEstimate()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              this.buyingTimeFrame.equals(other.getBuyingTimeFrame()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              this.buyingReason.equals(other.getBuyingReason()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.billAddressList==null && other.getBillAddressList()==null) || 
             (this.billAddressList!=null &&
              this.billAddressList.equals(other.getBillAddressList()))) &&
            ((this.shippingAddress==null && other.getShippingAddress()==null) || 
             (this.shippingAddress!=null &&
              this.shippingAddress.equals(other.getShippingAddress()))) &&
            ((this.shipIsResidential==null && other.getShipIsResidential()==null) || 
             (this.shipIsResidential!=null &&
              this.shipIsResidential.equals(other.getShipIsResidential()))) &&
            ((this.shipAddressList==null && other.getShipAddressList()==null) || 
             (this.shipAddressList!=null &&
              this.shipAddressList.equals(other.getShipAddressList()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
            ((this.syncPartnerTeams==null && other.getSyncPartnerTeams()==null) || 
             (this.syncPartnerTeams!=null &&
              this.syncPartnerTeams.equals(other.getSyncPartnerTeams()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              java.util.Arrays.equals(this.salesTeamList, other.getSalesTeamList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              java.util.Arrays.equals(this.partnersList, other.getPartnersList()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              java.util.Arrays.equals(this.itemList, other.getItemList()))) &&
            ((this.competitorsList==null && other.getCompetitorsList()==null) || 
             (this.competitorsList!=null &&
              java.util.Arrays.equals(this.competitorsList, other.getCompetitorsList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEstimatedBudget() != null) {
            _hashCode += getEstimatedBudget().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getContribPct() != null) {
            _hashCode += getContribPct().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSyncSalesTeams() != null) {
            _hashCode += getSyncSalesTeams().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getExpectedCloseDate() != null) {
            _hashCode += getExpectedCloseDate().hashCode();
        }
        if (getDaysOpen() != null) {
            _hashCode += getDaysOpen().hashCode();
        }
        if (getForecastType() != null) {
            _hashCode += getForecastType().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getProjectedTotal() != null) {
            _hashCode += getProjectedTotal().hashCode();
        }
        if (getRangeLow() != null) {
            _hashCode += getRangeLow().hashCode();
        }
        if (getRangeHigh() != null) {
            _hashCode += getRangeHigh().hashCode();
        }
        if (getProjAltSalesAmt() != null) {
            _hashCode += getProjAltSalesAmt().hashCode();
        }
        if (getAltSalesRangeLow() != null) {
            _hashCode += getAltSalesRangeLow().hashCode();
        }
        if (getAltSalesRangeHigh() != null) {
            _hashCode += getAltSalesRangeHigh().hashCode();
        }
        if (getWeightedTotal() != null) {
            _hashCode += getWeightedTotal().hashCode();
        }
        if (getActionItem() != null) {
            _hashCode += getActionItem().hashCode();
        }
        if (getWinLossReason() != null) {
            _hashCode += getWinLossReason().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getIsBudgetApproved() != null) {
            _hashCode += getIsBudgetApproved().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getSalesReadiness() != null) {
            _hashCode += getSalesReadiness().hashCode();
        }
        if (getTotalCostEstimate() != null) {
            _hashCode += getTotalCostEstimate().hashCode();
        }
        if (getBuyingTimeFrame() != null) {
            _hashCode += getBuyingTimeFrame().hashCode();
        }
        if (getEstGrossProfit() != null) {
            _hashCode += getEstGrossProfit().hashCode();
        }
        if (getBuyingReason() != null) {
            _hashCode += getBuyingReason().hashCode();
        }
        if (getEstGrossProfitPercent() != null) {
            _hashCode += getEstGrossProfitPercent().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getBillAddressList() != null) {
            _hashCode += getBillAddressList().hashCode();
        }
        if (getShippingAddress() != null) {
            _hashCode += getShippingAddress().hashCode();
        }
        if (getShipIsResidential() != null) {
            _hashCode += getShipIsResidential().hashCode();
        }
        if (getShipAddressList() != null) {
            _hashCode += getShipAddressList().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
        }
        if (getSyncPartnerTeams() != null) {
            _hashCode += getSyncPartnerTeams().hashCode();
        }
        if (getSalesTeamList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnersList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnersList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnersList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompetitorsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompetitorsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompetitorsList(), i);
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
        new org.apache.axis.description.TypeDesc(Opportunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "Opportunity"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesRangeLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "altSalesRangeLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesRangeHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "altSalesRangeHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "weightedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "actionItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "OpportunitySalesTeam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "salesTeam"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "Partners"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "partners"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "OpportunityItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitorsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "competitorsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "OpportunityCompetitors"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "competitors"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2014_2.transactions.webservices.netsuite.com", "customFieldList"));
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
