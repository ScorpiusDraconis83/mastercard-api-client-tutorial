/**
 * MDES Digital Enablement API
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The TokenInfoForNTUAndGetToken model module.
 * @module model/TokenInfoForNTUAndGetToken
 * @version 1.3.0
 */
class TokenInfoForNTUAndGetToken {
    /**
     * Constructs a new <code>TokenInfoForNTUAndGetToken</code>.
     * @alias module:model/TokenInfoForNTUAndGetToken
     * @param tokenPanSuffix {String} The last few digits (typically four) of the Token PAN. 
     * @param accountPanPrefix {String} The first few digits (typically six) of the Account PAN. 
     * @param accountPanSuffix {String} The last few digits (typically four) of the Account PAN. 
     * @param tokenExpiry {String} The expiry of the Token PAN, given in MMYY format. 
     * @param dsrpCapable {String} Whether DSRP transactions are supported by this Token. Must be either 'true' (DSRP capable) or 'false' (Not DSRP capable). 
     */
    constructor(tokenPanSuffix, accountPanPrefix, accountPanSuffix, tokenExpiry, dsrpCapable) { 
        
        TokenInfoForNTUAndGetToken.initialize(this, tokenPanSuffix, accountPanPrefix, accountPanSuffix, tokenExpiry, dsrpCapable);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, tokenPanSuffix, accountPanPrefix, accountPanSuffix, tokenExpiry, dsrpCapable) { 
        obj['tokenPanSuffix'] = tokenPanSuffix;
        obj['accountPanPrefix'] = accountPanPrefix;
        obj['accountPanSuffix'] = accountPanSuffix;
        obj['tokenExpiry'] = tokenExpiry;
        obj['dsrpCapable'] = dsrpCapable;
    }

    /**
     * Constructs a <code>TokenInfoForNTUAndGetToken</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TokenInfoForNTUAndGetToken} obj Optional instance to populate.
     * @return {module:model/TokenInfoForNTUAndGetToken} The populated <code>TokenInfoForNTUAndGetToken</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TokenInfoForNTUAndGetToken();

            if (data.hasOwnProperty('tokenPanSuffix')) {
                obj['tokenPanSuffix'] = ApiClient.convertToType(data['tokenPanSuffix'], 'String');
            }
            if (data.hasOwnProperty('accountPanPrefix')) {
                obj['accountPanPrefix'] = ApiClient.convertToType(data['accountPanPrefix'], 'String');
            }
            if (data.hasOwnProperty('accountPanSuffix')) {
                obj['accountPanSuffix'] = ApiClient.convertToType(data['accountPanSuffix'], 'String');
            }
            if (data.hasOwnProperty('tokenExpiry')) {
                obj['tokenExpiry'] = ApiClient.convertToType(data['tokenExpiry'], 'String');
            }
            if (data.hasOwnProperty('accountPanExpiry')) {
                obj['accountPanExpiry'] = ApiClient.convertToType(data['accountPanExpiry'], 'String');
            }
            if (data.hasOwnProperty('dsrpCapable')) {
                obj['dsrpCapable'] = ApiClient.convertToType(data['dsrpCapable'], 'String');
            }
            if (data.hasOwnProperty('tokenAssuranceLevel')) {
                obj['tokenAssuranceLevel'] = ApiClient.convertToType(data['tokenAssuranceLevel'], 'Number');
            }
            if (data.hasOwnProperty('productCategory')) {
                obj['productCategory'] = ApiClient.convertToType(data['productCategory'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TokenInfoForNTUAndGetToken</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TokenInfoForNTUAndGetToken</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of TokenInfoForNTUAndGetToken.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['tokenPanSuffix'] && !(typeof data['tokenPanSuffix'] === 'string' || data['tokenPanSuffix'] instanceof String)) {
            throw new Error("Expected the field `tokenPanSuffix` to be a primitive type in the JSON string but got " + data['tokenPanSuffix']);
        }
        // ensure the json data is a string
        if (data['accountPanPrefix'] && !(typeof data['accountPanPrefix'] === 'string' || data['accountPanPrefix'] instanceof String)) {
            throw new Error("Expected the field `accountPanPrefix` to be a primitive type in the JSON string but got " + data['accountPanPrefix']);
        }
        // ensure the json data is a string
        if (data['accountPanSuffix'] && !(typeof data['accountPanSuffix'] === 'string' || data['accountPanSuffix'] instanceof String)) {
            throw new Error("Expected the field `accountPanSuffix` to be a primitive type in the JSON string but got " + data['accountPanSuffix']);
        }
        // ensure the json data is a string
        if (data['tokenExpiry'] && !(typeof data['tokenExpiry'] === 'string' || data['tokenExpiry'] instanceof String)) {
            throw new Error("Expected the field `tokenExpiry` to be a primitive type in the JSON string but got " + data['tokenExpiry']);
        }
        // ensure the json data is a string
        if (data['accountPanExpiry'] && !(typeof data['accountPanExpiry'] === 'string' || data['accountPanExpiry'] instanceof String)) {
            throw new Error("Expected the field `accountPanExpiry` to be a primitive type in the JSON string but got " + data['accountPanExpiry']);
        }
        // ensure the json data is a string
        if (data['dsrpCapable'] && !(typeof data['dsrpCapable'] === 'string' || data['dsrpCapable'] instanceof String)) {
            throw new Error("Expected the field `dsrpCapable` to be a primitive type in the JSON string but got " + data['dsrpCapable']);
        }
        // ensure the json data is a string
        if (data['productCategory'] && !(typeof data['productCategory'] === 'string' || data['productCategory'] instanceof String)) {
            throw new Error("Expected the field `productCategory` to be a primitive type in the JSON string but got " + data['productCategory']);
        }

        return true;
    }


}

TokenInfoForNTUAndGetToken.RequiredProperties = ["tokenPanSuffix", "accountPanPrefix", "accountPanSuffix", "tokenExpiry", "dsrpCapable"];

/**
 * The last few digits (typically four) of the Token PAN. 
 * @member {String} tokenPanSuffix
 */
TokenInfoForNTUAndGetToken.prototype['tokenPanSuffix'] = undefined;

/**
 * The first few digits (typically six) of the Account PAN. 
 * @member {String} accountPanPrefix
 */
TokenInfoForNTUAndGetToken.prototype['accountPanPrefix'] = undefined;

/**
 * The last few digits (typically four) of the Account PAN. 
 * @member {String} accountPanSuffix
 */
TokenInfoForNTUAndGetToken.prototype['accountPanSuffix'] = undefined;

/**
 * The expiry of the Token PAN, given in MMYY format. 
 * @member {String} tokenExpiry
 */
TokenInfoForNTUAndGetToken.prototype['tokenExpiry'] = undefined;

/**
 * The expiry of the Account PAN, given in MMYY format. 
 * @member {String} accountPanExpiry
 */
TokenInfoForNTUAndGetToken.prototype['accountPanExpiry'] = undefined;

/**
 * Whether DSRP transactions are supported by this Token. Must be either 'true' (DSRP capable) or 'false' (Not DSRP capable). 
 * @member {String} dsrpCapable
 */
TokenInfoForNTUAndGetToken.prototype['dsrpCapable'] = undefined;

/**
 * A value indicating the confidence level of the token to Account PAN binding. 
 * @member {Number} tokenAssuranceLevel
 */
TokenInfoForNTUAndGetToken.prototype['tokenAssuranceLevel'] = undefined;

/**
 * The product category of the Account PAN. When supplied will be one of the following values:    * CREDIT   * DEBIT   * PREPAID   * UNKNOWN 
 * @member {String} productCategory
 */
TokenInfoForNTUAndGetToken.prototype['productCategory'] = undefined;






export default TokenInfoForNTUAndGetToken;

