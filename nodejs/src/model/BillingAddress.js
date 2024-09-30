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
 * The BillingAddress model module.
 * @module model/BillingAddress
 * @version 1.3.0
 */
class BillingAddress {
    /**
     * Constructs a new <code>BillingAddress</code>.
     * @alias module:model/BillingAddress
     */
    constructor() { 
        
        BillingAddress.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BillingAddress</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BillingAddress} obj Optional instance to populate.
     * @return {module:model/BillingAddress} The populated <code>BillingAddress</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BillingAddress();

            if (data.hasOwnProperty('line1')) {
                obj['line1'] = ApiClient.convertToType(data['line1'], 'String');
            }
            if (data.hasOwnProperty('line2')) {
                obj['line2'] = ApiClient.convertToType(data['line2'], 'String');
            }
            if (data.hasOwnProperty('city')) {
                obj['city'] = ApiClient.convertToType(data['city'], 'String');
            }
            if (data.hasOwnProperty('countrySubdivision')) {
                obj['countrySubdivision'] = ApiClient.convertToType(data['countrySubdivision'], 'String');
            }
            if (data.hasOwnProperty('postalCode')) {
                obj['postalCode'] = ApiClient.convertToType(data['postalCode'], 'String');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = ApiClient.convertToType(data['country'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BillingAddress</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BillingAddress</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['line1'] && !(typeof data['line1'] === 'string' || data['line1'] instanceof String)) {
            throw new Error("Expected the field `line1` to be a primitive type in the JSON string but got " + data['line1']);
        }
        // ensure the json data is a string
        if (data['line2'] && !(typeof data['line2'] === 'string' || data['line2'] instanceof String)) {
            throw new Error("Expected the field `line2` to be a primitive type in the JSON string but got " + data['line2']);
        }
        // ensure the json data is a string
        if (data['city'] && !(typeof data['city'] === 'string' || data['city'] instanceof String)) {
            throw new Error("Expected the field `city` to be a primitive type in the JSON string but got " + data['city']);
        }
        // ensure the json data is a string
        if (data['countrySubdivision'] && !(typeof data['countrySubdivision'] === 'string' || data['countrySubdivision'] instanceof String)) {
            throw new Error("Expected the field `countrySubdivision` to be a primitive type in the JSON string but got " + data['countrySubdivision']);
        }
        // ensure the json data is a string
        if (data['postalCode'] && !(typeof data['postalCode'] === 'string' || data['postalCode'] instanceof String)) {
            throw new Error("Expected the field `postalCode` to be a primitive type in the JSON string but got " + data['postalCode']);
        }
        // ensure the json data is a string
        if (data['country'] && !(typeof data['country'] === 'string' || data['country'] instanceof String)) {
            throw new Error("Expected the field `country` to be a primitive type in the JSON string but got " + data['country']);
        }

        return true;
    }


}



/**
 * **(OPTIONAL)** The first line of the street address for the billing address. 
 * @member {String} line1
 */
BillingAddress.prototype['line1'] = undefined;

/**
 * **(OPTIONAL)** The second line of the street address for the billing address. 
 * @member {String} line2
 */
BillingAddress.prototype['line2'] = undefined;

/**
 * **(OPTIONAL)** The city of the billing address. 
 * @member {String} city
 */
BillingAddress.prototype['city'] = undefined;

/**
 * **(OPTIONAL)** The state or country subdivision of the billing address. 
 * @member {String} countrySubdivision
 */
BillingAddress.prototype['countrySubdivision'] = undefined;

/**
 * **(OPTIONAL)** The postal of code of the billing address. 
 * @member {String} postalCode
 */
BillingAddress.prototype['postalCode'] = undefined;

/**
 * **(OPTIONAL)** The country of the billing address. 
 * @member {String} country
 */
BillingAddress.prototype['country'] = undefined;






export default BillingAddress;

