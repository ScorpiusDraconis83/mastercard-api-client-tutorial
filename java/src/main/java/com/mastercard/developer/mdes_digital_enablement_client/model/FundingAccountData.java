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
import com.mastercard.developer.mdes_digital_enablement_client.model.AccountHolderData;
import com.mastercard.developer.mdes_digital_enablement_client.model.CardAccountDataInbound;
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
 * FundingAccountData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T13:37:45.612619+01:00[Europe/Dublin]", comments = "Generator version: 7.5.0")
public class FundingAccountData {
  public static final String SERIALIZED_NAME_CARD_ACCOUNT_DATA = "cardAccountData";
  @SerializedName(SERIALIZED_NAME_CARD_ACCOUNT_DATA)
  private CardAccountDataInbound cardAccountData;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_DATA = "accountHolderData";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_DATA)
  private AccountHolderData accountHolderData;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public FundingAccountData() {
  }

  public FundingAccountData cardAccountData(CardAccountDataInbound cardAccountData) {
    this.cardAccountData = cardAccountData;
    return this;
  }

   /**
   * Get cardAccountData
   * @return cardAccountData
  **/
  @javax.annotation.Nullable
  public CardAccountDataInbound getCardAccountData() {
    return cardAccountData;
  }

  public void setCardAccountData(CardAccountDataInbound cardAccountData) {
    this.cardAccountData = cardAccountData;
  }


  public FundingAccountData accountHolderData(AccountHolderData accountHolderData) {
    this.accountHolderData = accountHolderData;
    return this;
  }

   /**
   * Get accountHolderData
   * @return accountHolderData
  **/
  @javax.annotation.Nullable
  public AccountHolderData getAccountHolderData() {
    return accountHolderData;
  }

  public void setAccountHolderData(AccountHolderData accountHolderData) {
    this.accountHolderData = accountHolderData;
  }


  public FundingAccountData source(String source) {
    this.source = source;
    return this;
  }

   /**
   * (**Required as minimum for Tokenization**) The source of the account. Must be one of   * ACCOUNT_ON_FILE   * ACCOUNT_ADDED_MANUALLY   * ACCOUNT_ADDED_VIA_APPLICATION 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingAccountData fundingAccountData = (FundingAccountData) o;
    return Objects.equals(this.cardAccountData, fundingAccountData.cardAccountData) &&
        Objects.equals(this.accountHolderData, fundingAccountData.accountHolderData) &&
        Objects.equals(this.source, fundingAccountData.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardAccountData, accountHolderData, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingAccountData {\n");
    sb.append("    cardAccountData: ").append(toIndentedString(cardAccountData)).append("\n");
    sb.append("    accountHolderData: ").append(toIndentedString(accountHolderData)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("cardAccountData");
    openapiFields.add("accountHolderData");
    openapiFields.add("source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FundingAccountData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FundingAccountData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundingAccountData is not found in the empty JSON string", FundingAccountData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FundingAccountData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FundingAccountData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cardAccountData`
      if (jsonObj.get("cardAccountData") != null && !jsonObj.get("cardAccountData").isJsonNull()) {
        CardAccountDataInbound.validateJsonElement(jsonObj.get("cardAccountData"));
      }
      // validate the optional field `accountHolderData`
      if (jsonObj.get("accountHolderData") != null && !jsonObj.get("accountHolderData").isJsonNull()) {
        AccountHolderData.validateJsonElement(jsonObj.get("accountHolderData"));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundingAccountData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundingAccountData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundingAccountData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundingAccountData.class));

       return (TypeAdapter<T>) new TypeAdapter<FundingAccountData>() {
           @Override
           public void write(JsonWriter out, FundingAccountData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FundingAccountData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FundingAccountData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundingAccountData
  * @throws IOException if the JSON string is invalid with respect to FundingAccountData
  */
  public static FundingAccountData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundingAccountData.class);
  }

 /**
  * Convert an instance of FundingAccountData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

