/*
 * MDES Digital Enablement API
 *
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.3.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Acme.App.MastercardApi.Client.Client.OpenAPIDateConverter;

namespace Acme.App.MastercardApi.Client.Model
{
    /// <summary>
    /// NotifyTokenUpdatedRequestSchema
    /// </summary>
    [DataContract(Name = "NotifyTokenUpdatedRequestSchema")]
    public partial class NotifyTokenUpdatedRequestSchema : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotifyTokenUpdatedRequestSchema" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NotifyTokenUpdatedRequestSchema() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NotifyTokenUpdatedRequestSchema" /> class.
        /// </summary>
        /// <param name="responseHost">The host that originated the request. Future calls in the same conversation should be routed to this host.  (required).</param>
        /// <param name="requestId">Unique identifier for the request.  (required).</param>
        /// <param name="encryptedPayload">encryptedPayload (required).</param>
        public NotifyTokenUpdatedRequestSchema(string responseHost = default(string), string requestId = default(string), EncryptedPayload encryptedPayload = default(EncryptedPayload))
        {
            // to ensure "responseHost" is required (not null)
            if (responseHost == null)
            {
                throw new ArgumentNullException("responseHost is a required property for NotifyTokenUpdatedRequestSchema and cannot be null");
            }
            this.ResponseHost = responseHost;
            // to ensure "requestId" is required (not null)
            if (requestId == null)
            {
                throw new ArgumentNullException("requestId is a required property for NotifyTokenUpdatedRequestSchema and cannot be null");
            }
            this.RequestId = requestId;
            // to ensure "encryptedPayload" is required (not null)
            if (encryptedPayload == null)
            {
                throw new ArgumentNullException("encryptedPayload is a required property for NotifyTokenUpdatedRequestSchema and cannot be null");
            }
            this.EncryptedPayload = encryptedPayload;
        }

        /// <summary>
        /// The host that originated the request. Future calls in the same conversation should be routed to this host. 
        /// </summary>
        /// <value>The host that originated the request. Future calls in the same conversation should be routed to this host. </value>
        /// <example>site2.payment-app-provider.com</example>
        [DataMember(Name = "responseHost", IsRequired = true, EmitDefaultValue = true)]
        public string ResponseHost { get; set; }

        /// <summary>
        /// Unique identifier for the request. 
        /// </summary>
        /// <value>Unique identifier for the request. </value>
        /// <example>123456</example>
        [DataMember(Name = "requestId", IsRequired = true, EmitDefaultValue = true)]
        public string RequestId { get; set; }

        /// <summary>
        /// Gets or Sets EncryptedPayload
        /// </summary>
        [DataMember(Name = "encryptedPayload", IsRequired = true, EmitDefaultValue = true)]
        public EncryptedPayload EncryptedPayload { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NotifyTokenUpdatedRequestSchema {\n");
            sb.Append("  ResponseHost: ").Append(ResponseHost).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  EncryptedPayload: ").Append(EncryptedPayload).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
