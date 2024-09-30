/**
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously.  
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */
/**
* Test.
* @module test/api/TokenizeApi
* @version 1.3.0
*/

const fs = require("fs");
const assert = require('assert');
const oauth = require('mastercard-oauth1-signer');
const mcapi = require('mastercard-client-encryption');
const forge = require("node-forge");

const OpenApiClient =require('../../dist/index.js');


const CONFIG = {
    paths: [
      {
        path: "/tokenize",
        toEncrypt: [
          {
            element: "cardInfo.encryptedData",
            obj: "cardInfo"
          },
          {
            element: "fundingAccountInfo.encryptedPayload.encryptedData",
            obj: "fundingAccountInfo.encryptedPayload"
          }],
        toDecrypt: [
          {
            element: "tokenDetail",
            obj: "tokenDetail.encryptedData"
          }
        ]
      },
      {
        path: "/searchTokens",
        toEncrypt: [
          {
            element: "cardInfo.encryptedData",
            obj: "cardInfo"
          },
          {
            element: "fundingAccountInfo.encryptedPayload.encryptedData",
            obj: "fundingAccountInfo.encryptedPayload"
          }],
        toDecrypt: []
      },
      {
        path: "/getToken",
        toEncrypt: [],
        toDecrypt: [
          {
            element: "tokenDetail",
            obj: "tokenDetail.encryptedData"
          }]
      },
      {
        path: "/transact",
        toEncrypt: [],
        toDecrypt: [
          {
            element: "encryptedPayload",
            obj: "encryptedPayload.encryptedData"
          }]
      },
      {
        path: "/notifyTokenUpdated",
        toEncrypt: [
          {
            element: "encryptedPayload.encryptedData",
            obj: "encryptedPayload"
          }],
        toDecrypt: []
      }
    ],
  
  
    oaepPaddingDigestAlgorithm: 'SHA-256',
  
    ivFieldName: 'iv',
    encryptedKeyFieldName: 'encryptedKey',
    encryptedValueFieldName: 'encryptedData',
    oaepHashingAlgorithmFieldName: 'oaepHashingAlgorithm',
    publicKeyFingerprintFieldName: 'publicKeyFingerprint',
    publicKeyFingerprintType: "certificate",
  
    dataEncoding: 'hex',
  
    encryptionCertificate: "test/resources/digital-enablement-sandbox-encryption-key.crt",
    privateKey: "test/resources/digital-enablement-sandbox-decryption-key.key"
  
  };

  const CONSUMER_KEY = "000000000000000000000000000000000000000000000000!000000000000000000000000000000000000000000000000";
  const SIGNING_KEY_PATH = "test/resources/fake-signing-key.p12";
  const KEY_ALIAS = "fake-key";
  const KEY_PASSWORD = "fakepassword";

  function loadSigningKey(){
    const p12Content = fs.readFileSync(SIGNING_KEY_PATH, 'binary');
    const p12Asn1 = forge.asn1.fromDer(p12Content, false);
    const p12 = forge.pkcs12.pkcs12FromAsn1(p12Asn1, false, KEY_PASSWORD);
    const keyObj = p12.getBags({
      friendlyName: KEY_ALIAS,
      bagType: forge.pki.oids.pkcs8ShroudedKeyBag
    }).friendlyName[0];
    return forge.pki.privateKeyToPem(keyObj.key);
  }
  
  function createRequestObj() {

    return {
      consumerLanguage: "en",
      fundingAccountInfo: {
        encryptedPayload: {
          encryptedData: {
            accountHolderData: {
              accountHolderAddress: {
                city: "St. Louis",
                country: "USA",
                countrySubdivision: "MO",
                line1: "100 1st Street",
                line2: "Apt. 4B",
                postalCode: "61000"
              },
              accountHolderName: "John Doe"
            },
            cardAccountData: {
              accountNumber: "5123456789012345",
              expiryMonth: "09",
              expiryYear: "25",
              securityCode: "123"
            },
            source: "ACCOUNT_ON_FILE"
          }
        }
      },
      requestId: "123456",
      responseHost: "site1.your-server.com",
      taskId: "123456",
      tokenRequestorId: "98765432101",
      tokenType: "CLOUD",
      tokenizationAuthenticationValue: "RHVtbXkgYmFzZSA2NCBkYXRhIC0gdGhpcyBpcyBub3QgYSByZWFsIFRBViBleGFtcGxl"
    };
  }

function createService() {
  let client = OpenApiClient.ApiClient.instance;
  client.basePath = "https://sandbox.api.mastercard.com/mdes";
  const signingKey = loadSigningKey();
  // Add OAuth1.0a interceptor
  client.applyAuthToRequest = function(request) {
      const _end = request._end;
      request._end = function() {
          const authHeader = oauth.getAuthorizationHeader(request.url, request.method, JSON.stringify(request._data), CONSUMER_KEY, signingKey);
          request.req.setHeader('Authorization', authHeader);
          _end.call(request);
      };
      return request;
  };
  let service = new mcapi.Service(OpenApiClient, CONFIG);
  return service
};

describe('TokenizeApi', function() {
    let service = createService()
      it("should call createTokenize successfully", function (done) {
        this.timeout(10000);
        let api = new service.TokenizeApi();
        api.createTokenize({
          tokenizeRequestSchema: createRequestObj()
        }, (error, data, response) => {
          assert.ok(data);
          assert.ok(data['decision'] === 'APPROVED');
          assert.ok(data['tokenDetail']['encryptedData']['paymentAccountReference'] === '500181d9f8e0629211e3949a08002');
          done();
        });
      });

  });
