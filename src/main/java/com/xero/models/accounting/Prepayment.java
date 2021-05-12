/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** Prepayment */
public class Prepayment {
  StringUtil util = new StringUtil();
  /** See Prepayment Types */
  public enum TypeEnum {
    /** RECEIVE_PREPAYMENT */
    RECEIVE_PREPAYMENT("RECEIVE-PREPAYMENT"),

    /** SPEND_PREPAYMENT */
    SPEND_PREPAYMENT("SPEND-PREPAYMENT"),

    /** ARPREPAYMENT */
    ARPREPAYMENT("ARPREPAYMENT"),

    /** APPREPAYMENT */
    APPREPAYMENT("APPREPAYMENT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * toString
     *
     * @return String value
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * fromValue
     *
     * @param value String
     */
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
  private Contact contact;

  @JsonProperty("Date")
  private String date;
  /** See Prepayment Status Codes */
  public enum StatusEnum {
    /** AUTHORISED */
    AUTHORISED("AUTHORISED"),

    /** PAID */
    PAID("PAID"),

    /** VOIDED */
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * toString
     *
     * @return String value
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * fromValue
     *
     * @param value String
     */
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

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("PrepaymentID")
  private UUID prepaymentID;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("RemainingCredit")
  private Double remainingCredit;

  @JsonProperty("Allocations")
  private List<Allocation> allocations = new ArrayList<Allocation>();

  @JsonProperty("Payments")
  private List<Payment> payments = new ArrayList<Payment>();

  @JsonProperty("AppliedAmount")
  private Double appliedAmount;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("Attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();
  /**
   * See Prepayment Types
   *
   * @param type TypeEnum
   * @return Prepayment
   */
  public Prepayment type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * See Prepayment Types
   *
   * @return type
   */
  @ApiModelProperty(value = "See Prepayment Types")
  /**
   * See Prepayment Types
   *
   * @return type TypeEnum
   */
  public TypeEnum getType() {
    return type;
  }

  /**
   * See Prepayment Types
   *
   * @param type TypeEnum
   */
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * contact
   *
   * @param contact Contact
   * @return Prepayment
   */
  public Prepayment contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  /**
   * contact
   *
   * @return contact Contact
   */
  public Contact getContact() {
    return contact;
  }

  /**
   * contact
   *
   * @param contact Contact
   */
  public void setContact(Contact contact) {
    this.contact = contact;
  }

  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @param date String
   * @return Prepayment
   */
  public Prepayment date(String date) {
    this.date = date;
    return this;
  }

  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "The date the prepayment is created YYYY-MM-DD")
  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @return date String
   */
  public String getDate() {
    return date;
  }
  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @return LocalDate
   */
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

  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @param date String
   */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * The date the prepayment is created YYYY-MM-DD
   *
   * @param date LocalDateTime
   */
  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * See Prepayment Status Codes
   *
   * @param status StatusEnum
   * @return Prepayment
   */
  public Prepayment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * See Prepayment Status Codes
   *
   * @return status
   */
  @ApiModelProperty(value = "See Prepayment Status Codes")
  /**
   * See Prepayment Status Codes
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * See Prepayment Status Codes
   *
   * @param status StatusEnum
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * lineAmountTypes
   *
   * @param lineAmountTypes LineAmountTypes
   * @return Prepayment
   */
  public Prepayment lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

  /**
   * Get lineAmountTypes
   *
   * @return lineAmountTypes
   */
  @ApiModelProperty(value = "")
  /**
   * lineAmountTypes
   *
   * @return lineAmountTypes LineAmountTypes
   */
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  /**
   * lineAmountTypes
   *
   * @param lineAmountTypes LineAmountTypes
   */
  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  /**
   * See Prepayment Line Items
   *
   * @param lineItems List&lt;LineItem&gt;
   * @return Prepayment
   */
  public Prepayment lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * See Prepayment Line Items
   *
   * @param lineItemsItem LineItem
   * @return Prepayment
   */
  public Prepayment addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * See Prepayment Line Items
   *
   * @return lineItems
   */
  @ApiModelProperty(value = "See Prepayment Line Items")
  /**
   * See Prepayment Line Items
   *
   * @return lineItems List<LineItem>
   */
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  /**
   * See Prepayment Line Items
   *
   * @param lineItems List&lt;LineItem&gt;
   */
  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The subtotal of the prepayment excluding taxes
   *
   * @param subTotal Double
   * @return Prepayment
   */
  public Prepayment subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * The subtotal of the prepayment excluding taxes
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "The subtotal of the prepayment excluding taxes")
  /**
   * The subtotal of the prepayment excluding taxes
   *
   * @return subTotal Double
   */
  public Double getSubTotal() {
    return subTotal;
  }

  /**
   * The subtotal of the prepayment excluding taxes
   *
   * @param subTotal Double
   */
  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  /**
   * The total tax on the prepayment
   *
   * @param totalTax Double
   * @return Prepayment
   */
  public Prepayment totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * The total tax on the prepayment
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "The total tax on the prepayment")
  /**
   * The total tax on the prepayment
   *
   * @return totalTax Double
   */
  public Double getTotalTax() {
    return totalTax;
  }

  /**
   * The total tax on the prepayment
   *
   * @param totalTax Double
   */
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total of the prepayment(subtotal + total tax)
   *
   * @param total Double
   * @return Prepayment
   */
  public Prepayment total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * The total of the prepayment(subtotal + total tax)
   *
   * @return total
   */
  @ApiModelProperty(value = "The total of the prepayment(subtotal + total tax)")
  /**
   * The total of the prepayment(subtotal + total tax)
   *
   * @return total Double
   */
  public Double getTotal() {
    return total;
  }

  /**
   * The total of the prepayment(subtotal + total tax)
   *
   * @param total Double
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * Returns Invoice number field. Reference field isn&#39;t available.
   *
   * @return reference
   */
  @ApiModelProperty(value = "Returns Invoice number field. Reference field isn't available.")
  /**
   * Returns Invoice number field. Reference field isn&#39;t available.
   *
   * @return reference String
   */
  public String getReference() {
    return reference;
  }

  /**
   * UTC timestamp of last update to the prepayment
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(
      example = "/Date(1573755038314)/",
      value = "UTC timestamp of last update to the prepayment")
  /**
   * UTC timestamp of last update to the prepayment
   *
   * @return updatedDateUTC String
   */
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  /**
   * UTC timestamp of last update to the prepayment
   *
   * @return OffsetDateTime
   */
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
   * currencyCode
   *
   * @param currencyCode CurrencyCode
   * @return Prepayment
   */
  public Prepayment currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  /**
   * currencyCode
   *
   * @return currencyCode CurrencyCode
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  /**
   * currencyCode
   *
   * @param currencyCode CurrencyCode
   */
  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Xero generated unique identifier
   *
   * @param prepaymentID UUID
   * @return Prepayment
   */
  public Prepayment prepaymentID(UUID prepaymentID) {
    this.prepaymentID = prepaymentID;
    return this;
  }

  /**
   * Xero generated unique identifier
   *
   * @return prepaymentID
   */
  @ApiModelProperty(value = "Xero generated unique identifier")
  /**
   * Xero generated unique identifier
   *
   * @return prepaymentID UUID
   */
  public UUID getPrepaymentID() {
    return prepaymentID;
  }

  /**
   * Xero generated unique identifier
   *
   * @param prepaymentID UUID
   */
  public void setPrepaymentID(UUID prepaymentID) {
    this.prepaymentID = prepaymentID;
  }

  /**
   * The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate
   * is used
   *
   * @param currencyRate Double
   * @return Prepayment
   */
  public Prepayment currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate
   * is used
   *
   * @return currencyRate
   */
  @ApiModelProperty(
      value =
          "The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com"
              + " day rate is used")
  /**
   * The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate
   * is used
   *
   * @return currencyRate Double
   */
  public Double getCurrencyRate() {
    return currencyRate;
  }

  /**
   * The currency rate for a multicurrency prepayment. If no rate is specified, the XE.com day rate
   * is used
   *
   * @param currencyRate Double
   */
  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  /**
   * The remaining credit balance on the prepayment
   *
   * @param remainingCredit Double
   * @return Prepayment
   */
  public Prepayment remainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
    return this;
  }

  /**
   * The remaining credit balance on the prepayment
   *
   * @return remainingCredit
   */
  @ApiModelProperty(value = "The remaining credit balance on the prepayment")
  /**
   * The remaining credit balance on the prepayment
   *
   * @return remainingCredit Double
   */
  public Double getRemainingCredit() {
    return remainingCredit;
  }

  /**
   * The remaining credit balance on the prepayment
   *
   * @param remainingCredit Double
   */
  public void setRemainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
  }

  /**
   * See Allocations
   *
   * @param allocations List&lt;Allocation&gt;
   * @return Prepayment
   */
  public Prepayment allocations(List<Allocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  /**
   * See Allocations
   *
   * @param allocationsItem Allocation
   * @return Prepayment
   */
  public Prepayment addAllocationsItem(Allocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<Allocation>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

  /**
   * See Allocations
   *
   * @return allocations
   */
  @ApiModelProperty(value = "See Allocations")
  /**
   * See Allocations
   *
   * @return allocations List<Allocation>
   */
  public List<Allocation> getAllocations() {
    return allocations;
  }

  /**
   * See Allocations
   *
   * @param allocations List&lt;Allocation&gt;
   */
  public void setAllocations(List<Allocation> allocations) {
    this.allocations = allocations;
  }

  /**
   * See Payments
   *
   * @param payments List&lt;Payment&gt;
   * @return Prepayment
   */
  public Prepayment payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  /**
   * See Payments
   *
   * @param paymentsItem Payment
   * @return Prepayment
   */
  public Prepayment addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * See Payments
   *
   * @return payments
   */
  @ApiModelProperty(value = "See Payments")
  /**
   * See Payments
   *
   * @return payments List<Payment>
   */
  public List<Payment> getPayments() {
    return payments;
  }

  /**
   * See Payments
   *
   * @param payments List&lt;Payment&gt;
   */
  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  /**
   * The amount of applied to an invoice
   *
   * @param appliedAmount Double
   * @return Prepayment
   */
  public Prepayment appliedAmount(Double appliedAmount) {
    this.appliedAmount = appliedAmount;
    return this;
  }

  /**
   * The amount of applied to an invoice
   *
   * @return appliedAmount
   */
  @ApiModelProperty(example = "2.0", value = "The amount of applied to an invoice")
  /**
   * The amount of applied to an invoice
   *
   * @return appliedAmount Double
   */
  public Double getAppliedAmount() {
    return appliedAmount;
  }

  /**
   * The amount of applied to an invoice
   *
   * @param appliedAmount Double
   */
  public void setAppliedAmount(Double appliedAmount) {
    this.appliedAmount = appliedAmount;
  }

  /**
   * boolean to indicate if a prepayment has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "boolean to indicate if a prepayment has an attachment")
  /**
   * boolean to indicate if a prepayment has an attachment
   *
   * @return hasAttachments Boolean
   */
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  /**
   * See Attachments
   *
   * @param attachments List&lt;Attachment&gt;
   * @return Prepayment
   */
  public Prepayment attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * See Attachments
   *
   * @param attachmentsItem Attachment
   * @return Prepayment
   */
  public Prepayment addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * See Attachments
   *
   * @return attachments
   */
  @ApiModelProperty(value = "See Attachments")
  /**
   * See Attachments
   *
   * @return attachments List<Attachment>
   */
  public List<Attachment> getAttachments() {
    return attachments;
  }

  /**
   * See Attachments
   *
   * @param attachments List&lt;Attachment&gt;
   */
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prepayment prepayment = (Prepayment) o;
    return Objects.equals(this.type, prepayment.type)
        && Objects.equals(this.contact, prepayment.contact)
        && Objects.equals(this.date, prepayment.date)
        && Objects.equals(this.status, prepayment.status)
        && Objects.equals(this.lineAmountTypes, prepayment.lineAmountTypes)
        && Objects.equals(this.lineItems, prepayment.lineItems)
        && Objects.equals(this.subTotal, prepayment.subTotal)
        && Objects.equals(this.totalTax, prepayment.totalTax)
        && Objects.equals(this.total, prepayment.total)
        && Objects.equals(this.reference, prepayment.reference)
        && Objects.equals(this.updatedDateUTC, prepayment.updatedDateUTC)
        && Objects.equals(this.currencyCode, prepayment.currencyCode)
        && Objects.equals(this.prepaymentID, prepayment.prepaymentID)
        && Objects.equals(this.currencyRate, prepayment.currencyRate)
        && Objects.equals(this.remainingCredit, prepayment.remainingCredit)
        && Objects.equals(this.allocations, prepayment.allocations)
        && Objects.equals(this.payments, prepayment.payments)
        && Objects.equals(this.appliedAmount, prepayment.appliedAmount)
        && Objects.equals(this.hasAttachments, prepayment.hasAttachments)
        && Objects.equals(this.attachments, prepayment.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type,
        contact,
        date,
        status,
        lineAmountTypes,
        lineItems,
        subTotal,
        totalTax,
        total,
        reference,
        updatedDateUTC,
        currencyCode,
        prepaymentID,
        currencyRate,
        remainingCredit,
        allocations,
        payments,
        appliedAmount,
        hasAttachments,
        attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prepayment {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    prepaymentID: ").append(toIndentedString(prepaymentID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    remainingCredit: ").append(toIndentedString(remainingCredit)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    appliedAmount: ").append(toIndentedString(appliedAmount)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
