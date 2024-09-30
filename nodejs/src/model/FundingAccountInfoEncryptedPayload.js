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
import FundingAccountData from './FundingAccountData';

/**
 * The FundingAccountInfoEncryptedPayload model module.
 * @module model/FundingAccountInfoEncryptedPayload
 * @version 1.3.0
 */
class FundingAccountInfoEncryptedPayload {
    /**
     * Constructs a new <code>FundingAccountInfoEncryptedPayload</code>.
     * @alias module:model/FundingAccountInfoEncryptedPayload
     */
    constructor() { 
        
        FundingAccountInfoEncryptedPayload.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FundingAccountInfoEncryptedPayload</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FundingAccountInfoEncryptedPayload} obj Optional instance to populate.
     * @return {module:model/FundingAccountInfoEncryptedPayload} The populated <code>FundingAccountInfoEncryptedPayload</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FundingAccountInfoEncryptedPayload();

            if (data.hasOwnProperty('publicKeyFingerprint')) {
                obj['publicKeyFingerprint'] = ApiClient.convertToType(data['publicKeyFingerprint'], 'String');
            }
            if (data.hasOwnProperty('encryptedKey')) {
                obj['encryptedKey'] = ApiClient.convertToType(data['encryptedKey'], 'String');
            }
            if (data.hasOwnProperty('oaepHashingAlgorithm')) {
                obj['oaepHashingAlgorithm'] = ApiClient.convertToType(data['oaepHashingAlgorithm'], 'String');
            }
            if (data.hasOwnProperty('iv')) {
                obj['iv'] = ApiClient.convertToType(data['iv'], 'String');
            }
            if (data.hasOwnProperty('encryptedData')) {
                obj['encryptedData'] = FundingAccountData.constructFromObject(data['encryptedData']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>FundingAccountInfoEncryptedPayload</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>FundingAccountInfoEncryptedPayload</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['publicKeyFingerprint'] && !(typeof data['publicKeyFingerprint'] === 'string' || data['publicKeyFingerprint'] instanceof String)) {
            throw new Error("Expected the field `publicKeyFingerprint` to be a primitive type in the JSON string but got " + data['publicKeyFingerprint']);
        }
        // ensure the json data is a string
        if (data['encryptedKey'] && !(typeof data['encryptedKey'] === 'string' || data['encryptedKey'] instanceof String)) {
            throw new Error("Expected the field `encryptedKey` to be a primitive type in the JSON string but got " + data['encryptedKey']);
        }
        // ensure the json data is a string
        if (data['oaepHashingAlgorithm'] && !(typeof data['oaepHashingAlgorithm'] === 'string' || data['oaepHashingAlgorithm'] instanceof String)) {
            throw new Error("Expected the field `oaepHashingAlgorithm` to be a primitive type in the JSON string but got " + data['oaepHashingAlgorithm']);
        }
        // ensure the json data is a string
        if (data['iv'] && !(typeof data['iv'] === 'string' || data['iv'] instanceof String)) {
            throw new Error("Expected the field `iv` to be a primitive type in the JSON string but got " + data['iv']);
        }
        // validate the optional field `encryptedData`
        if (data['encryptedData']) { // data not null
          FundingAccountData.validateJSON(data['encryptedData']);
        }

        return true;
    }


}



/**
 * The fingerprint of the public key used to encrypt the ephemeral AES key. 
 * @member {String} publicKeyFingerprint
 */
FundingAccountInfoEncryptedPayload.prototype['publicKeyFingerprint'] = undefined;

/**
 * One-time use AES key encrypted by the MasterCard public key (as identified by publicKeyFingerprint) using the OAEP or PKCS#1 v1.5 scheme (depending on the value of oaepHashingAlgorithm. 
 * @member {String} encryptedKey
 */
FundingAccountInfoEncryptedPayload.prototype['encryptedKey'] = undefined;

/**
 * Hashing algorithm used with the OAEP scheme. Must be either SHA256 or SHA512. 
 * @member {String} oaepHashingAlgorithm
 */
FundingAccountInfoEncryptedPayload.prototype['oaepHashingAlgorithm'] = undefined;

/**
 * The initialization vector used when encrypting data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. If not present, an IV of zero is assumed. 
 * @member {String} iv
 */
FundingAccountInfoEncryptedPayload.prototype['iv'] = undefined;

/**
 * @member {module:model/FundingAccountData} encryptedData
 */
FundingAccountInfoEncryptedPayload.prototype['encryptedData'] = undefined;






export default FundingAccountInfoEncryptedPayload;

