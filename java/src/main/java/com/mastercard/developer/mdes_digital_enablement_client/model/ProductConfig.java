/*
 * MDES Digital Enablement API
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mdes_digital_enablement_client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mastercard.developer.mdes_digital_enablement_client.JSON;

/**
 * ProductConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T13:37:45.612619+01:00[Europe/Dublin]", comments = "Generator version: 7.5.0")
public class ProductConfig {
  public static final String SERIALIZED_NAME_BRAND_LOGO_ASSET_ID = "brandLogoAssetId";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO_ASSET_ID)
  private String brandLogoAssetId;

  public static final String SERIALIZED_NAME_ISSUER_LOGO_ASSET_ID = "issuerLogoAssetId";
  @SerializedName(SERIALIZED_NAME_ISSUER_LOGO_ASSET_ID)
  private String issuerLogoAssetId;

  public static final String SERIALIZED_NAME_IS_CO_BRANDED = "isCoBranded";
  @SerializedName(SERIALIZED_NAME_IS_CO_BRANDED)
  private Boolean isCoBranded;

  public static final String SERIALIZED_NAME_CO_BRAND_NAME = "coBrandName";
  @SerializedName(SERIALIZED_NAME_CO_BRAND_NAME)
  private String coBrandName;

  public static final String SERIALIZED_NAME_CO_BRAND_LOGO_ASSET_ID = "coBrandLogoAssetId";
  @SerializedName(SERIALIZED_NAME_CO_BRAND_LOGO_ASSET_ID)
  private String coBrandLogoAssetId;

  public static final String SERIALIZED_NAME_CARD_BACKGROUND_COMBINED_ASSET_ID = "cardBackgroundCombinedAssetId";
  @SerializedName(SERIALIZED_NAME_CARD_BACKGROUND_COMBINED_ASSET_ID)
  private String cardBackgroundCombinedAssetId;

  public static final String SERIALIZED_NAME_CARD_BACKGROUND_ASSET_ID = "cardBackgroundAssetId";
  @SerializedName(SERIALIZED_NAME_CARD_BACKGROUND_ASSET_ID)
  private String cardBackgroundAssetId;

  public static final String SERIALIZED_NAME_ICON_ASSET_ID = "iconAssetId";
  @SerializedName(SERIALIZED_NAME_ICON_ASSET_ID)
  private String iconAssetId;

  public static final String SERIALIZED_NAME_FOREGROUND_COLOR = "foregroundColor";
  @SerializedName(SERIALIZED_NAME_FOREGROUND_COLOR)
  private String foregroundColor;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "shortDescription";
  @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
  private String shortDescription;

  public static final String SERIALIZED_NAME_LONG_DESCRIPTION = "longDescription";
  @SerializedName(SERIALIZED_NAME_LONG_DESCRIPTION)
  private String longDescription;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_URL = "customerServiceUrl";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_URL)
  private String customerServiceUrl;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_EMAIL = "customerServiceEmail";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_EMAIL)
  private String customerServiceEmail;

  public static final String SERIALIZED_NAME_CUSTOMER_SERVICE_PHONE_NUMBER = "customerServicePhoneNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SERVICE_PHONE_NUMBER)
  private String customerServicePhoneNumber;

  public static final String SERIALIZED_NAME_ISSUER_MOBILE_APP = "issuerMobileApp";
  @SerializedName(SERIALIZED_NAME_ISSUER_MOBILE_APP)
  private Object issuerMobileApp;

  public static final String SERIALIZED_NAME_ONLINE_BANKING_LOGIN_URL = "onlineBankingLoginUrl";
  @SerializedName(SERIALIZED_NAME_ONLINE_BANKING_LOGIN_URL)
  private String onlineBankingLoginUrl;

  public static final String SERIALIZED_NAME_TERMS_AND_CONDITIONS_URL = "termsAndConditionsUrl";
  @SerializedName(SERIALIZED_NAME_TERMS_AND_CONDITIONS_URL)
  private String termsAndConditionsUrl;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY_URL = "privacyPolicyUrl";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY_URL)
  private String privacyPolicyUrl;

  public static final String SERIALIZED_NAME_ISSUER_PRODUCT_CONFIG_CODE = "issuerProductConfigCode";
  @SerializedName(SERIALIZED_NAME_ISSUER_PRODUCT_CONFIG_CODE)
  private String issuerProductConfigCode;

  public ProductConfig() {
  }

  public ProductConfig brandLogoAssetId(String brandLogoAssetId) {
    this.brandLogoAssetId = brandLogoAssetId;
    return this;
  }

   /**
   * The MasterCard or Maestro brand logo associated with this card. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. Always returned in Product Configuration object 
   * @return brandLogoAssetId
  **/
  @javax.annotation.Nonnull
  public String getBrandLogoAssetId() {
    return brandLogoAssetId;
  }

  public void setBrandLogoAssetId(String brandLogoAssetId) {
    this.brandLogoAssetId = brandLogoAssetId;
  }


  public ProductConfig issuerLogoAssetId(String issuerLogoAssetId) {
    this.issuerLogoAssetId = issuerLogoAssetId;
    return this;
  }

   /**
   * The logo of the issuing bank. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. Always returned in Product Configuration object 
   * @return issuerLogoAssetId
  **/
  @javax.annotation.Nonnull
  public String getIssuerLogoAssetId() {
    return issuerLogoAssetId;
  }

  public void setIssuerLogoAssetId(String issuerLogoAssetId) {
    this.issuerLogoAssetId = issuerLogoAssetId;
  }


  public ProductConfig isCoBranded(Boolean isCoBranded) {
    this.isCoBranded = isCoBranded;
    return this;
  }

   /**
   * Whether the product is co-branded. Must be either true (this is a co-branded product) or false (this is not a co-branded product). Always returned in Product Configuration object 
   * @return isCoBranded
  **/
  @javax.annotation.Nonnull
  public Boolean getIsCoBranded() {
    return isCoBranded;
  }

  public void setIsCoBranded(Boolean isCoBranded) {
    this.isCoBranded = isCoBranded;
  }


  public ProductConfig coBrandName(String coBrandName) {
    this.coBrandName = coBrandName;
    return this;
  }

   /**
   * Textual name of the co-brand partner. Required if CoBranded is true, not present otherwise. **Conditional: Conditionally required if isCoBranded &#x3D; \&quot;true\&quot;. Not present otherwise** 
   * @return coBrandName
  **/
  @javax.annotation.Nullable
  public String getCoBrandName() {
    return coBrandName;
  }

  public void setCoBrandName(String coBrandName) {
    this.coBrandName = coBrandName;
  }


  public ProductConfig coBrandLogoAssetId(String coBrandLogoAssetId) {
    this.coBrandLogoAssetId = coBrandLogoAssetId;
    return this;
  }

   /**
   * The co-brand logo (if any) for this product. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. 
   * @return coBrandLogoAssetId
  **/
  @javax.annotation.Nullable
  public String getCoBrandLogoAssetId() {
    return coBrandLogoAssetId;
  }

  public void setCoBrandLogoAssetId(String coBrandLogoAssetId) {
    this.coBrandLogoAssetId = coBrandLogoAssetId;
  }


  public ProductConfig cardBackgroundCombinedAssetId(String cardBackgroundCombinedAssetId) {
    this.cardBackgroundCombinedAssetId = cardBackgroundCombinedAssetId;
    return this;
  }

   /**
   * The card image used to represent the digital card in the wallet. This ?combined? option contains the MasterCard, bank and any co- brand logos.  Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. **Conditional: either CardBackgroundCombined or CardBackground will be provided** 
   * @return cardBackgroundCombinedAssetId
  **/
  @javax.annotation.Nullable
  public String getCardBackgroundCombinedAssetId() {
    return cardBackgroundCombinedAssetId;
  }

  public void setCardBackgroundCombinedAssetId(String cardBackgroundCombinedAssetId) {
    this.cardBackgroundCombinedAssetId = cardBackgroundCombinedAssetId;
  }


  public ProductConfig cardBackgroundAssetId(String cardBackgroundAssetId) {
    this.cardBackgroundAssetId = cardBackgroundAssetId;
    return this;
  }

   /**
   * The card image used to represent the digital card in the wallet. This ?non-combined? option does not contain the MasterCard, bank, or co-brand logos. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. **Conditional: either CardBackgroundCombined or CardBackground will be provided** 
   * @return cardBackgroundAssetId
  **/
  @javax.annotation.Nullable
  public String getCardBackgroundAssetId() {
    return cardBackgroundAssetId;
  }

  public void setCardBackgroundAssetId(String cardBackgroundAssetId) {
    this.cardBackgroundAssetId = cardBackgroundAssetId;
  }


  public ProductConfig iconAssetId(String iconAssetId) {
    this.iconAssetId = iconAssetId;
    return this;
  }

   /**
   * The icon representing the primary brand(s) associated with this product. Provided as an Asset ID ? use the Get Asset API to retrieve the actual asset. Always returned in Product Configuration object 
   * @return iconAssetId
  **/
  @javax.annotation.Nonnull
  public String getIconAssetId() {
    return iconAssetId;
  }

  public void setIconAssetId(String iconAssetId) {
    this.iconAssetId = iconAssetId;
  }


  public ProductConfig foregroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

   /**
   * Foreground color, used to overlay text on top of the card image. Always returned in Product Configuration object 
   * @return foregroundColor
  **/
  @javax.annotation.Nonnull
  public String getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
  }


  public ProductConfig issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Name of the issuing bank. Always returned in Product Configuration object 
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  public ProductConfig shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description for this product. Always returned in Product Configuration object 
   * @return shortDescription
  **/
  @javax.annotation.Nonnull
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public ProductConfig longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A long description for this product. 
   * @return longDescription
  **/
  @javax.annotation.Nullable
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }


  public ProductConfig customerServiceUrl(String customerServiceUrl) {
    this.customerServiceUrl = customerServiceUrl;
    return this;
  }

   /**
   * Customer service website of the issuing bank. 
   * @return customerServiceUrl
  **/
  @javax.annotation.Nullable
  public String getCustomerServiceUrl() {
    return customerServiceUrl;
  }

  public void setCustomerServiceUrl(String customerServiceUrl) {
    this.customerServiceUrl = customerServiceUrl;
  }


  public ProductConfig customerServiceEmail(String customerServiceEmail) {
    this.customerServiceEmail = customerServiceEmail;
    return this;
  }

   /**
   * Customer service email address of the issuing bank. 
   * @return customerServiceEmail
  **/
  @javax.annotation.Nullable
  public String getCustomerServiceEmail() {
    return customerServiceEmail;
  }

  public void setCustomerServiceEmail(String customerServiceEmail) {
    this.customerServiceEmail = customerServiceEmail;
  }


  public ProductConfig customerServicePhoneNumber(String customerServicePhoneNumber) {
    this.customerServicePhoneNumber = customerServicePhoneNumber;
    return this;
  }

   /**
   * Customer service phone number of the issuing bank. 
   * @return customerServicePhoneNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerServicePhoneNumber() {
    return customerServicePhoneNumber;
  }

  public void setCustomerServicePhoneNumber(String customerServicePhoneNumber) {
    this.customerServicePhoneNumber = customerServicePhoneNumber;
  }


  public ProductConfig issuerMobileApp(Object issuerMobileApp) {
    this.issuerMobileApp = issuerMobileApp;
    return this;
  }

   /**
   * Contains one or more mobile app details that may be used to deep link from the Mobile Payment App to the issuer mobile app. 
   * @return issuerMobileApp
  **/
  @javax.annotation.Nullable
  public Object getIssuerMobileApp() {
    return issuerMobileApp;
  }

  public void setIssuerMobileApp(Object issuerMobileApp) {
    this.issuerMobileApp = issuerMobileApp;
  }


  public ProductConfig onlineBankingLoginUrl(String onlineBankingLoginUrl) {
    this.onlineBankingLoginUrl = onlineBankingLoginUrl;
    return this;
  }

   /**
   * Logon URL for the issuing bank?s online banking website. 
   * @return onlineBankingLoginUrl
  **/
  @javax.annotation.Nullable
  public String getOnlineBankingLoginUrl() {
    return onlineBankingLoginUrl;
  }

  public void setOnlineBankingLoginUrl(String onlineBankingLoginUrl) {
    this.onlineBankingLoginUrl = onlineBankingLoginUrl;
  }


  public ProductConfig termsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
    return this;
  }

   /**
   * URL linking to the issuing bank?s terms and conditions for this product. 
   * @return termsAndConditionsUrl
  **/
  @javax.annotation.Nullable
  public String getTermsAndConditionsUrl() {
    return termsAndConditionsUrl;
  }

  public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
  }


  public ProductConfig privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * URL linking to the issuing bank?s privacy policy for this product. 
   * @return privacyPolicyUrl
  **/
  @javax.annotation.Nullable
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public ProductConfig issuerProductConfigCode(String issuerProductConfigCode) {
    this.issuerProductConfigCode = issuerProductConfigCode;
    return this;
  }

   /**
   * Freeform identifier for this product configuration as assigned by the issuer. 
   * @return issuerProductConfigCode
  **/
  @javax.annotation.Nullable
  public String getIssuerProductConfigCode() {
    return issuerProductConfigCode;
  }

  public void setIssuerProductConfigCode(String issuerProductConfigCode) {
    this.issuerProductConfigCode = issuerProductConfigCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductConfig productConfig = (ProductConfig) o;
    return Objects.equals(this.brandLogoAssetId, productConfig.brandLogoAssetId) &&
        Objects.equals(this.issuerLogoAssetId, productConfig.issuerLogoAssetId) &&
        Objects.equals(this.isCoBranded, productConfig.isCoBranded) &&
        Objects.equals(this.coBrandName, productConfig.coBrandName) &&
        Objects.equals(this.coBrandLogoAssetId, productConfig.coBrandLogoAssetId) &&
        Objects.equals(this.cardBackgroundCombinedAssetId, productConfig.cardBackgroundCombinedAssetId) &&
        Objects.equals(this.cardBackgroundAssetId, productConfig.cardBackgroundAssetId) &&
        Objects.equals(this.iconAssetId, productConfig.iconAssetId) &&
        Objects.equals(this.foregroundColor, productConfig.foregroundColor) &&
        Objects.equals(this.issuerName, productConfig.issuerName) &&
        Objects.equals(this.shortDescription, productConfig.shortDescription) &&
        Objects.equals(this.longDescription, productConfig.longDescription) &&
        Objects.equals(this.customerServiceUrl, productConfig.customerServiceUrl) &&
        Objects.equals(this.customerServiceEmail, productConfig.customerServiceEmail) &&
        Objects.equals(this.customerServicePhoneNumber, productConfig.customerServicePhoneNumber) &&
        Objects.equals(this.issuerMobileApp, productConfig.issuerMobileApp) &&
        Objects.equals(this.onlineBankingLoginUrl, productConfig.onlineBankingLoginUrl) &&
        Objects.equals(this.termsAndConditionsUrl, productConfig.termsAndConditionsUrl) &&
        Objects.equals(this.privacyPolicyUrl, productConfig.privacyPolicyUrl) &&
        Objects.equals(this.issuerProductConfigCode, productConfig.issuerProductConfigCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandLogoAssetId, issuerLogoAssetId, isCoBranded, coBrandName, coBrandLogoAssetId, cardBackgroundCombinedAssetId, cardBackgroundAssetId, iconAssetId, foregroundColor, issuerName, shortDescription, longDescription, customerServiceUrl, customerServiceEmail, customerServicePhoneNumber, issuerMobileApp, onlineBankingLoginUrl, termsAndConditionsUrl, privacyPolicyUrl, issuerProductConfigCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductConfig {\n");
    sb.append("    brandLogoAssetId: ").append(toIndentedString(brandLogoAssetId)).append("\n");
    sb.append("    issuerLogoAssetId: ").append(toIndentedString(issuerLogoAssetId)).append("\n");
    sb.append("    isCoBranded: ").append(toIndentedString(isCoBranded)).append("\n");
    sb.append("    coBrandName: ").append(toIndentedString(coBrandName)).append("\n");
    sb.append("    coBrandLogoAssetId: ").append(toIndentedString(coBrandLogoAssetId)).append("\n");
    sb.append("    cardBackgroundCombinedAssetId: ").append(toIndentedString(cardBackgroundCombinedAssetId)).append("\n");
    sb.append("    cardBackgroundAssetId: ").append(toIndentedString(cardBackgroundAssetId)).append("\n");
    sb.append("    iconAssetId: ").append(toIndentedString(iconAssetId)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    customerServiceUrl: ").append(toIndentedString(customerServiceUrl)).append("\n");
    sb.append("    customerServiceEmail: ").append(toIndentedString(customerServiceEmail)).append("\n");
    sb.append("    customerServicePhoneNumber: ").append(toIndentedString(customerServicePhoneNumber)).append("\n");
    sb.append("    issuerMobileApp: ").append(toIndentedString(issuerMobileApp)).append("\n");
    sb.append("    onlineBankingLoginUrl: ").append(toIndentedString(onlineBankingLoginUrl)).append("\n");
    sb.append("    termsAndConditionsUrl: ").append(toIndentedString(termsAndConditionsUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    issuerProductConfigCode: ").append(toIndentedString(issuerProductConfigCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("brandLogoAssetId");
    openapiFields.add("issuerLogoAssetId");
    openapiFields.add("isCoBranded");
    openapiFields.add("coBrandName");
    openapiFields.add("coBrandLogoAssetId");
    openapiFields.add("cardBackgroundCombinedAssetId");
    openapiFields.add("cardBackgroundAssetId");
    openapiFields.add("iconAssetId");
    openapiFields.add("foregroundColor");
    openapiFields.add("issuerName");
    openapiFields.add("shortDescription");
    openapiFields.add("longDescription");
    openapiFields.add("customerServiceUrl");
    openapiFields.add("customerServiceEmail");
    openapiFields.add("customerServicePhoneNumber");
    openapiFields.add("issuerMobileApp");
    openapiFields.add("onlineBankingLoginUrl");
    openapiFields.add("termsAndConditionsUrl");
    openapiFields.add("privacyPolicyUrl");
    openapiFields.add("issuerProductConfigCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brandLogoAssetId");
    openapiRequiredFields.add("issuerLogoAssetId");
    openapiRequiredFields.add("isCoBranded");
    openapiRequiredFields.add("iconAssetId");
    openapiRequiredFields.add("foregroundColor");
    openapiRequiredFields.add("issuerName");
    openapiRequiredFields.add("shortDescription");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductConfig is not found in the empty JSON string", ProductConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("brandLogoAssetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandLogoAssetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandLogoAssetId").toString()));
      }
      if (!jsonObj.get("issuerLogoAssetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerLogoAssetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerLogoAssetId").toString()));
      }
      if ((jsonObj.get("coBrandName") != null && !jsonObj.get("coBrandName").isJsonNull()) && !jsonObj.get("coBrandName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coBrandName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coBrandName").toString()));
      }
      if ((jsonObj.get("coBrandLogoAssetId") != null && !jsonObj.get("coBrandLogoAssetId").isJsonNull()) && !jsonObj.get("coBrandLogoAssetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coBrandLogoAssetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coBrandLogoAssetId").toString()));
      }
      if ((jsonObj.get("cardBackgroundCombinedAssetId") != null && !jsonObj.get("cardBackgroundCombinedAssetId").isJsonNull()) && !jsonObj.get("cardBackgroundCombinedAssetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardBackgroundCombinedAssetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardBackgroundCombinedAssetId").toString()));
      }
      if ((jsonObj.get("cardBackgroundAssetId") != null && !jsonObj.get("cardBackgroundAssetId").isJsonNull()) && !jsonObj.get("cardBackgroundAssetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardBackgroundAssetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardBackgroundAssetId").toString()));
      }
      if (!jsonObj.get("iconAssetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconAssetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconAssetId").toString()));
      }
      if (!jsonObj.get("foregroundColor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foregroundColor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foregroundColor").toString()));
      }
      if (!jsonObj.get("issuerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerName").toString()));
      }
      if (!jsonObj.get("shortDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortDescription").toString()));
      }
      if ((jsonObj.get("longDescription") != null && !jsonObj.get("longDescription").isJsonNull()) && !jsonObj.get("longDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longDescription").toString()));
      }
      if ((jsonObj.get("customerServiceUrl") != null && !jsonObj.get("customerServiceUrl").isJsonNull()) && !jsonObj.get("customerServiceUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerServiceUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerServiceUrl").toString()));
      }
      if ((jsonObj.get("customerServiceEmail") != null && !jsonObj.get("customerServiceEmail").isJsonNull()) && !jsonObj.get("customerServiceEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerServiceEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerServiceEmail").toString()));
      }
      if ((jsonObj.get("customerServicePhoneNumber") != null && !jsonObj.get("customerServicePhoneNumber").isJsonNull()) && !jsonObj.get("customerServicePhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerServicePhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerServicePhoneNumber").toString()));
      }
      if ((jsonObj.get("onlineBankingLoginUrl") != null && !jsonObj.get("onlineBankingLoginUrl").isJsonNull()) && !jsonObj.get("onlineBankingLoginUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `onlineBankingLoginUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("onlineBankingLoginUrl").toString()));
      }
      if ((jsonObj.get("termsAndConditionsUrl") != null && !jsonObj.get("termsAndConditionsUrl").isJsonNull()) && !jsonObj.get("termsAndConditionsUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termsAndConditionsUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termsAndConditionsUrl").toString()));
      }
      if ((jsonObj.get("privacyPolicyUrl") != null && !jsonObj.get("privacyPolicyUrl").isJsonNull()) && !jsonObj.get("privacyPolicyUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacyPolicyUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacyPolicyUrl").toString()));
      }
      if ((jsonObj.get("issuerProductConfigCode") != null && !jsonObj.get("issuerProductConfigCode").isJsonNull()) && !jsonObj.get("issuerProductConfigCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerProductConfigCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerProductConfigCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductConfig>() {
           @Override
           public void write(JsonWriter out, ProductConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductConfig
  * @throws IOException if the JSON string is invalid with respect to ProductConfig
  */
  public static ProductConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductConfig.class);
  }

 /**
  * Convert an instance of ProductConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

