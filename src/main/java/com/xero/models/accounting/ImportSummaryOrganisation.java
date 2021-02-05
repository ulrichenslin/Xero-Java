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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ImportSummaryOrganisation */
public class ImportSummaryOrganisation {
  StringUtil util = new StringUtil();

  @JsonProperty("Present")
  private Boolean present;

  public ImportSummaryOrganisation present(Boolean present) {
    this.present = present;
    return this;
  }

  /**
   * Get present
   *
   * @return present
   */
  @ApiModelProperty(value = "")
  public Boolean getPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportSummaryOrganisation importSummaryOrganisation = (ImportSummaryOrganisation) o;
    return Objects.equals(this.present, importSummaryOrganisation.present);
  }

  @Override
  public int hashCode() {
    return Objects.hash(present);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportSummaryOrganisation {\n");
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
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
