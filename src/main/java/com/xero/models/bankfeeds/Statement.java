/*
 * Xero Bank Feeds API
 * The Bank Feeds API is a closed API that is only available to financial institutions that have an established financial services partnership with Xero. If you're an existing financial services partner that wants access, contact your local Partner Manager. If you're a financial institution who wants to provide bank feeds to your business customers, contact us to become a financial services partner.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.bankfeeds;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/** Statement */
public class Statement {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("feedConnectionId")
  private UUID feedConnectionId;
  /** Current status of statements */
  public enum StatusEnum {
    PENDING("PENDING"),

    REJECTED("REJECTED"),

    DELIVERED("DELIVERED");

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

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("startBalance")
  private StartBalance startBalance;

  @JsonProperty("endBalance")
  private EndBalance endBalance;

  @JsonProperty("statementLines")
  private List<StatementLine> statementLines = new ArrayList<StatementLine>();

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("statementLineCount")
  private Integer statementLineCount;

  public Statement id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * GUID used to identify the Statement.
   *
   * @return id
   */
  @ApiModelProperty(
      example = "ba4f3127-5e46-427d-80ea-dea2fcd26afe",
      value = "GUID used to identify the Statement.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Statement feedConnectionId(UUID feedConnectionId) {
    this.feedConnectionId = feedConnectionId;
    return this;
  }

  /**
   * The Xero generated feed connection Id that identifies the Xero Bank Account Container into
   * which the statement should be delivered. This is obtained by calling GET FeedConnections.
   *
   * @return feedConnectionId
   */
  @ApiModelProperty(
      example = "87cb0dc8-fa32-409c-b622-19f8de8dcc83",
      value =
          "The Xero generated feed connection Id that identifies the Xero Bank Account Container"
              + " into which the statement should be delivered. This is obtained by calling GET"
              + " FeedConnections.")
  public UUID getFeedConnectionId() {
    return feedConnectionId;
  }

  public void setFeedConnectionId(UUID feedConnectionId) {
    this.feedConnectionId = feedConnectionId;
  }

  public Statement status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of statements
   *
   * @return status
   */
  @ApiModelProperty(example = "PENDING", value = "Current status of statements")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Statement startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Opening balance date (can be no older than one year from the current date) ISO-8601 YYYY-MM-DD
   *
   * @return startDate
   */
  @ApiModelProperty(
      example = "Fri Jul 27 00:00:00 GMT 2018",
      value =
          "Opening balance date (can be no older than one year from the current date) ISO-8601"
              + " YYYY-MM-DD")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Statement endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Closing balance date ISO-8601 YYYY-MM-DD
   *
   * @return endDate
   */
  @ApiModelProperty(
      example = "Fri Jul 27 00:00:00 GMT 2018",
      value = "Closing balance date ISO-8601 YYYY-MM-DD")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Statement startBalance(StartBalance startBalance) {
    this.startBalance = startBalance;
    return this;
  }

  /**
   * Get startBalance
   *
   * @return startBalance
   */
  @ApiModelProperty(value = "")
  public StartBalance getStartBalance() {
    return startBalance;
  }

  public void setStartBalance(StartBalance startBalance) {
    this.startBalance = startBalance;
  }

  public Statement endBalance(EndBalance endBalance) {
    this.endBalance = endBalance;
    return this;
  }

  /**
   * Get endBalance
   *
   * @return endBalance
   */
  @ApiModelProperty(value = "")
  public EndBalance getEndBalance() {
    return endBalance;
  }

  public void setEndBalance(EndBalance endBalance) {
    this.endBalance = endBalance;
  }

  public Statement statementLines(List<StatementLine> statementLines) {
    this.statementLines = statementLines;
    return this;
  }

  public Statement addStatementLinesItem(StatementLine statementLinesItem) {
    if (this.statementLines == null) {
      this.statementLines = new ArrayList<StatementLine>();
    }
    this.statementLines.add(statementLinesItem);
    return this;
  }

  /**
   * Get statementLines
   *
   * @return statementLines
   */
  @ApiModelProperty(value = "")
  public List<StatementLine> getStatementLines() {
    return statementLines;
  }

  public void setStatementLines(List<StatementLine> statementLines) {
    this.statementLines = statementLines;
  }

  public Statement errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public Statement addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Error>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   *
   * @return errors
   */
  @ApiModelProperty(value = "")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public Statement statementLineCount(Integer statementLineCount) {
    this.statementLineCount = statementLineCount;
    return this;
  }

  /**
   * Get statementLineCount
   *
   * @return statementLineCount
   */
  @ApiModelProperty(example = "1", value = "")
  public Integer getStatementLineCount() {
    return statementLineCount;
  }

  public void setStatementLineCount(Integer statementLineCount) {
    this.statementLineCount = statementLineCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.id, statement.id)
        && Objects.equals(this.feedConnectionId, statement.feedConnectionId)
        && Objects.equals(this.status, statement.status)
        && Objects.equals(this.startDate, statement.startDate)
        && Objects.equals(this.endDate, statement.endDate)
        && Objects.equals(this.startBalance, statement.startBalance)
        && Objects.equals(this.endBalance, statement.endBalance)
        && Objects.equals(this.statementLines, statement.statementLines)
        && Objects.equals(this.errors, statement.errors)
        && Objects.equals(this.statementLineCount, statement.statementLineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        feedConnectionId,
        status,
        startDate,
        endDate,
        startBalance,
        endBalance,
        statementLines,
        errors,
        statementLineCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feedConnectionId: ").append(toIndentedString(feedConnectionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startBalance: ").append(toIndentedString(startBalance)).append("\n");
    sb.append("    endBalance: ").append(toIndentedString(endBalance)).append("\n");
    sb.append("    statementLines: ").append(toIndentedString(statementLines)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    statementLineCount: ").append(toIndentedString(statementLineCount)).append("\n");
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
