/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Attachment;
import com.xero.models.accounting.Contact;
import com.xero.models.accounting.CreditNote;
import com.xero.models.accounting.CurrencyCode;
import com.xero.models.accounting.LineAmountTypes;
import com.xero.models.accounting.LineItem;
import com.xero.models.accounting.Overpayment;
import com.xero.models.accounting.Payment;
import com.xero.models.accounting.Prepayment;
import com.xero.models.accounting.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Invoice
 */

public class Invoice {
  StringUtil util = new StringUtil();
  /**
   * See Invoice Types
   */
  public enum TypeEnum {
    ACCPAY("ACCPAY"),
    
    ACCPAYCREDIT("ACCPAYCREDIT"),
    
    APOVERPAYMENT("APOVERPAYMENT"),
    
    APPREPAYMENT("APPREPAYMENT"),
    
    ACCREC("ACCREC"),
    
    ACCRECCREDIT("ACCRECCREDIT"),
    
    AROVERPAYMENT("AROVERPAYMENT"),
    
    ARPREPAYMENT("ARPREPAYMENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("Contact")
  private Contact contact = null;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("Date")
  private String date;

  @JsonProperty("DueDate")
  private String dueDate;

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("InvoiceNumber")
  private String invoiceNumber;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("BrandingThemeID")
  private UUID brandingThemeID;

  @JsonProperty("Url")
  private String url;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;
  /**
   * See Invoice Status Codes
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    SUBMITTED("SUBMITTED"),
    
    DELETED("DELETED"),
    
    AUTHORISED("AUTHORISED"),
    
    PAID("PAID"),
    
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }


  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("SentToContact")
  private Boolean sentToContact;

  @JsonProperty("ExpectedPaymentDate")
  private String expectedPaymentDate;

  @JsonProperty("PlannedPaymentDate")
  private String plannedPaymentDate;

  @JsonProperty("CISDeduction")
  private Double ciSDeduction;

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("TotalDiscount")
  private Double totalDiscount;

  @JsonProperty("InvoiceID")
  private UUID invoiceID;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("IsDiscounted")
  private Boolean isDiscounted;

  @JsonProperty("Payments")
  private List<Payment> payments = new ArrayList<Payment>();

  @JsonProperty("Prepayments")
  private List<Prepayment> prepayments = new ArrayList<Prepayment>();

  @JsonProperty("Overpayments")
  private List<Overpayment> overpayments = new ArrayList<Overpayment>();

  @JsonProperty("AmountDue")
  private Double amountDue;

  @JsonProperty("AmountPaid")
  private Double amountPaid;

  @JsonProperty("FullyPaidOnDate")
  private String fullyPaidOnDate;

  @JsonProperty("AmountCredited")
  private Double amountCredited;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("CreditNotes")
  private List<CreditNote> creditNotes = new ArrayList<CreditNote>();

  @JsonProperty("Attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  @JsonProperty("HasErrors")
  private Boolean hasErrors;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  @JsonProperty("Warnings")
  private List<ValidationError> warnings = new ArrayList<ValidationError>();
  public Invoice type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * See Invoice Types
   * @return type
  **/
  @ApiModelProperty(value = "See Invoice Types")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Invoice contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Invoice lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * See LineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "See LineItems")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Invoice date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date invoice was issued – YYYY-MM-DD. If the Date element is not specified it will default to the current date based on the timezone setting of the organisation
   * @return date
  **/
  @ApiModelProperty(value = "Date invoice was issued – YYYY-MM-DD. If the Date element is not specified it will default to the current date based on the timezone setting of the organisation")
  public String getDate() {
    return date;
  }
  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Invoice dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Date invoice is due – YYYY-MM-DD
   * @return dueDate
  **/
  @ApiModelProperty(value = "Date invoice is due – YYYY-MM-DD")
  public String getDueDate() {
    return dueDate;
  }
  public LocalDate getDueDateAsDate() {
    if (this.dueDate != null) {
      try {
        return util.convertStringToDate(this.dueDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  dueDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.dueDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Invoice lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

   /**
   * Get lineAmountTypes
   * @return lineAmountTypes
  **/
  @ApiModelProperty(value = "")
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * ACCREC – Unique alpha numeric code identifying invoice (when missing will auto-generate from your Organisation Invoice Settings) (max length &#x3D; 255)
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "ACCREC – Unique alpha numeric code identifying invoice (when missing will auto-generate from your Organisation Invoice Settings) (max length = 255)")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * ACCREC only – additional reference number (max length &#x3D; 255)
   * @return reference
  **/
  @ApiModelProperty(value = "ACCREC only – additional reference number (max length = 255)")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Invoice brandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
    return this;
  }

   /**
   * See BrandingThemes
   * @return brandingThemeID
  **/
  @ApiModelProperty(value = "See BrandingThemes")
  public UUID getBrandingThemeID() {
    return brandingThemeID;
  }

  public void setBrandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
  }

  public Invoice url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL link to a source document – shown as “Go to [appName]” in the Xero app
   * @return url
  **/
  @ApiModelProperty(value = "URL link to a source document – shown as “Go to [appName]” in the Xero app")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Invoice currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Invoice currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * The currency rate for a multicurrency invoice. If no rate is specified, the XE.com day rate is used. (max length &#x3D; [18].[6])
   * @return currencyRate
  **/
  @ApiModelProperty(value = "The currency rate for a multicurrency invoice. If no rate is specified, the XE.com day rate is used. (max length = [18].[6])")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  public Invoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * See Invoice Status Codes
   * @return status
  **/
  @ApiModelProperty(value = "See Invoice Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invoice sentToContact(Boolean sentToContact) {
    this.sentToContact = sentToContact;
    return this;
  }

   /**
   * Boolean to set whether the invoice in the Xero app should be marked as “sent”. This can be set only on invoices that have been approved
   * @return sentToContact
  **/
  @ApiModelProperty(value = "Boolean to set whether the invoice in the Xero app should be marked as “sent”. This can be set only on invoices that have been approved")
  public Boolean getSentToContact() {
    return sentToContact;
  }

  public void setSentToContact(Boolean sentToContact) {
    this.sentToContact = sentToContact;
  }

  public Invoice expectedPaymentDate(String expectedPaymentDate) {
    this.expectedPaymentDate = expectedPaymentDate;
    return this;
  }

   /**
   * Shown on sales invoices (Accounts Receivable) when this has been set
   * @return expectedPaymentDate
  **/
  @ApiModelProperty(value = "Shown on sales invoices (Accounts Receivable) when this has been set")
  public String getExpectedPaymentDate() {
    return expectedPaymentDate;
  }
  public LocalDate getExpectedPaymentDateAsDate() {
    if (this.expectedPaymentDate != null) {
      try {
        return util.convertStringToDate(this.expectedPaymentDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setExpectedPaymentDate(String expectedPaymentDate) {
    this.expectedPaymentDate = expectedPaymentDate;
  }

  public void setExpectedPaymentDate(LocalDate expectedPaymentDate) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  expectedPaymentDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.expectedPaymentDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Invoice plannedPaymentDate(String plannedPaymentDate) {
    this.plannedPaymentDate = plannedPaymentDate;
    return this;
  }

   /**
   * Shown on bills (Accounts Payable) when this has been set
   * @return plannedPaymentDate
  **/
  @ApiModelProperty(value = "Shown on bills (Accounts Payable) when this has been set")
  public String getPlannedPaymentDate() {
    return plannedPaymentDate;
  }
  public LocalDate getPlannedPaymentDateAsDate() {
    if (this.plannedPaymentDate != null) {
      try {
        return util.convertStringToDate(this.plannedPaymentDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

  public void setPlannedPaymentDate(String plannedPaymentDate) {
    this.plannedPaymentDate = plannedPaymentDate;
  }

  public void setPlannedPaymentDate(LocalDate plannedPaymentDate) {
    //CONVERT LocalDate args into MS DateFromat String
    Instant instant =  plannedPaymentDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();  
    long timeInMillis = instant.toEpochMilli();

    this.plannedPaymentDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

   /**
   * CIS deduction for UK contractors
   * @return ciSDeduction
  **/
  @ApiModelProperty(value = "CIS deduction for UK contractors")
  public Double getCiSDeduction() {
    return ciSDeduction;
  }

   /**
   * Total of invoice excluding taxes
   * @return subTotal
  **/
  @ApiModelProperty(value = "Total of invoice excluding taxes")
  public Double getSubTotal() {
    return subTotal;
  }

   /**
   * Total tax on invoice
   * @return totalTax
  **/
  @ApiModelProperty(value = "Total tax on invoice")
  public Double getTotalTax() {
    return totalTax;
  }

   /**
   * Total of Invoice tax inclusive (i.e. SubTotal + TotalTax). This will be ignored if it doesn’t equal the sum of the LineAmounts
   * @return total
  **/
  @ApiModelProperty(value = "Total of Invoice tax inclusive (i.e. SubTotal + TotalTax). This will be ignored if it doesn’t equal the sum of the LineAmounts")
  public Double getTotal() {
    return total;
  }

   /**
   * Total of discounts applied on the invoice line items
   * @return totalDiscount
  **/
  @ApiModelProperty(value = "Total of discounts applied on the invoice line items")
  public Double getTotalDiscount() {
    return totalDiscount;
  }

  public Invoice invoiceID(UUID invoiceID) {
    this.invoiceID = invoiceID;
    return this;
  }

   /**
   * Xero generated unique identifier for invoice
   * @return invoiceID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier for invoice")
  public UUID getInvoiceID() {
    return invoiceID;
  }

  public void setInvoiceID(UUID invoiceID) {
    this.invoiceID = invoiceID;
  }

   /**
   * boolean to indicate if an invoice has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(example = "false", value = "boolean to indicate if an invoice has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

   /**
   * boolean to indicate if an invoice has a discount
   * @return isDiscounted
  **/
  @ApiModelProperty(value = "boolean to indicate if an invoice has a discount")
  public Boolean getIsDiscounted() {
    return isDiscounted;
  }

   /**
   * See Payments
   * @return payments
  **/
  @ApiModelProperty(value = "See Payments")
  public List<Payment> getPayments() {
    return payments;
  }

   /**
   * See Prepayments
   * @return prepayments
  **/
  @ApiModelProperty(value = "See Prepayments")
  public List<Prepayment> getPrepayments() {
    return prepayments;
  }

   /**
   * See Overpayments
   * @return overpayments
  **/
  @ApiModelProperty(value = "See Overpayments")
  public List<Overpayment> getOverpayments() {
    return overpayments;
  }

   /**
   * Amount remaining to be paid on invoice
   * @return amountDue
  **/
  @ApiModelProperty(value = "Amount remaining to be paid on invoice")
  public Double getAmountDue() {
    return amountDue;
  }

   /**
   * Sum of payments received for invoice
   * @return amountPaid
  **/
  @ApiModelProperty(value = "Sum of payments received for invoice")
  public Double getAmountPaid() {
    return amountPaid;
  }

   /**
   * The date the invoice was fully paid. Only returned on fully paid invoices
   * @return fullyPaidOnDate
  **/
  @ApiModelProperty(value = "The date the invoice was fully paid. Only returned on fully paid invoices")
  public String getFullyPaidOnDate() {
    return fullyPaidOnDate;
  }
  public LocalDate getFullyPaidOnDateAsDate() {
    if (this.fullyPaidOnDate != null) {
      try {
        return util.convertStringToDate(this.fullyPaidOnDate);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

   /**
   * Sum of all credit notes, over-payments and pre-payments applied to invoice
   * @return amountCredited
  **/
  @ApiModelProperty(value = "Sum of all credit notes, over-payments and pre-payments applied to invoice")
  public Double getAmountCredited() {
    return amountCredited;
  }

   /**
   * Last modified date UTC format
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Last modified date UTC format")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }  
    }
    return null;        
  }

   /**
   * Details of credit notes that have been applied to an invoice
   * @return creditNotes
  **/
  @ApiModelProperty(value = "Details of credit notes that have been applied to an invoice")
  public List<CreditNote> getCreditNotes() {
    return creditNotes;
  }

  public Invoice attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Invoice addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Displays array of attachments from the API
   * @return attachments
  **/
  @ApiModelProperty(value = "Displays array of attachments from the API")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public Invoice hasErrors(Boolean hasErrors) {
    this.hasErrors = hasErrors;
    return this;
  }

   /**
   * A boolean to indicate if a invoice has an validation errors
   * @return hasErrors
  **/
  @ApiModelProperty(value = "A boolean to indicate if a invoice has an validation errors")
  public Boolean getHasErrors() {
    return hasErrors;
  }

  public void setHasErrors(Boolean hasErrors) {
    this.hasErrors = hasErrors;
  }

  public Invoice statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

   /**
   * A string to indicate if a invoice status
   * @return statusAttributeString
  **/
  @ApiModelProperty(value = "A string to indicate if a invoice status")
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public Invoice validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Invoice addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Displays array of validation error messages from the API
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public Invoice warnings(List<ValidationError> warnings) {
    this.warnings = warnings;
    return this;
  }

  public Invoice addWarningsItem(ValidationError warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<ValidationError>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Displays array of warning messages from the API
   * @return warnings
  **/
  @ApiModelProperty(value = "Displays array of warning messages from the API")
  public List<ValidationError> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ValidationError> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.type, invoice.type) &&
        Objects.equals(this.contact, invoice.contact) &&
        Objects.equals(this.lineItems, invoice.lineItems) &&
        Objects.equals(this.date, invoice.date) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.lineAmountTypes, invoice.lineAmountTypes) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.reference, invoice.reference) &&
        Objects.equals(this.brandingThemeID, invoice.brandingThemeID) &&
        Objects.equals(this.url, invoice.url) &&
        Objects.equals(this.currencyCode, invoice.currencyCode) &&
        Objects.equals(this.currencyRate, invoice.currencyRate) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.sentToContact, invoice.sentToContact) &&
        Objects.equals(this.expectedPaymentDate, invoice.expectedPaymentDate) &&
        Objects.equals(this.plannedPaymentDate, invoice.plannedPaymentDate) &&
        Objects.equals(this.ciSDeduction, invoice.ciSDeduction) &&
        Objects.equals(this.subTotal, invoice.subTotal) &&
        Objects.equals(this.totalTax, invoice.totalTax) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.totalDiscount, invoice.totalDiscount) &&
        Objects.equals(this.invoiceID, invoice.invoiceID) &&
        Objects.equals(this.hasAttachments, invoice.hasAttachments) &&
        Objects.equals(this.isDiscounted, invoice.isDiscounted) &&
        Objects.equals(this.payments, invoice.payments) &&
        Objects.equals(this.prepayments, invoice.prepayments) &&
        Objects.equals(this.overpayments, invoice.overpayments) &&
        Objects.equals(this.amountDue, invoice.amountDue) &&
        Objects.equals(this.amountPaid, invoice.amountPaid) &&
        Objects.equals(this.fullyPaidOnDate, invoice.fullyPaidOnDate) &&
        Objects.equals(this.amountCredited, invoice.amountCredited) &&
        Objects.equals(this.updatedDateUTC, invoice.updatedDateUTC) &&
        Objects.equals(this.creditNotes, invoice.creditNotes) &&
        Objects.equals(this.attachments, invoice.attachments) &&
        Objects.equals(this.hasErrors, invoice.hasErrors) &&
        Objects.equals(this.statusAttributeString, invoice.statusAttributeString) &&
        Objects.equals(this.validationErrors, invoice.validationErrors) &&
        Objects.equals(this.warnings, invoice.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contact, lineItems, date, dueDate, lineAmountTypes, invoiceNumber, reference, brandingThemeID, url, currencyCode, currencyRate, status, sentToContact, expectedPaymentDate, plannedPaymentDate, ciSDeduction, subTotal, totalTax, total, totalDiscount, invoiceID, hasAttachments, isDiscounted, payments, prepayments, overpayments, amountDue, amountPaid, fullyPaidOnDate, amountCredited, updatedDateUTC, creditNotes, attachments, hasErrors, statusAttributeString, validationErrors, warnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    brandingThemeID: ").append(toIndentedString(brandingThemeID)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentToContact: ").append(toIndentedString(sentToContact)).append("\n");
    sb.append("    expectedPaymentDate: ").append(toIndentedString(expectedPaymentDate)).append("\n");
    sb.append("    plannedPaymentDate: ").append(toIndentedString(plannedPaymentDate)).append("\n");
    sb.append("    ciSDeduction: ").append(toIndentedString(ciSDeduction)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    invoiceID: ").append(toIndentedString(invoiceID)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    isDiscounted: ").append(toIndentedString(isDiscounted)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    prepayments: ").append(toIndentedString(prepayments)).append("\n");
    sb.append("    overpayments: ").append(toIndentedString(overpayments)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    fullyPaidOnDate: ").append(toIndentedString(fullyPaidOnDate)).append("\n");
    sb.append("    amountCredited: ").append(toIndentedString(amountCredited)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    creditNotes: ").append(toIndentedString(creditNotes)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    hasErrors: ").append(toIndentedString(hasErrors)).append("\n");
    sb.append("    statusAttributeString: ").append(toIndentedString(statusAttributeString)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

