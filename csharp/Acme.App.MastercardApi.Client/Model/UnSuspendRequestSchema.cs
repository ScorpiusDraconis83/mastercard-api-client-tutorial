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
    /// UnSuspendRequestSchema
    /// </summary>
    [DataContract(Name = "UnSuspendRequestSchema")]
    public partial class UnSuspendRequestSchema : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UnSuspendRequestSchema" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UnSuspendRequestSchema() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UnSuspendRequestSchema" /> class.
        /// </summary>
        /// <param name="responseHost">The host that originated the request. Future calls in the same conversation may be routed to this host. .</param>
        /// <param name="requestId">Unique identifier for the request.  (required).</param>
        /// <param name="paymentAppInstanceId">Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \&quot;-\&quot;, underscore \&quot;_\&quot;) up to a maximum length of 48, &#x3D; should not be URL encoded. Conditional - not applicable for server based tokens but required otherwise. .</param>
        /// <param name="tokenUniqueReferences">The specific Token to be unsuspended. Array of more or more valid references as assigned by MDES  (required).</param>
        /// <param name="causedBy">Who or what caused the Token to be unsuspended. Must be either the &#39;CARDHOLDER&#39; (operation requested by the Cardholder) or &#39;TOKEN_REQUESTOR&#39; (operation requested by the token requestor).  (required).</param>
        /// <param name="reason">Free form reason why the Tokens are being suspended. .</param>
        /// <param name="reasonCode">The reason for the action to be unsuspended. Must be one of &#39;SUSPECTED_FRAUD&#39; (suspected fraudulent token transactions), &#39;OTHER&#39; (Other - default used if value not provided).  (required).</param>
        public UnSuspendRequestSchema(string responseHost = default(string), string requestId = default(string), string paymentAppInstanceId = default(string), List<string> tokenUniqueReferences = default(List<string>), string causedBy = default(string), string reason = default(string), string reasonCode = default(string))
        {
            // to ensure "requestId" is required (not null)
            if (requestId == null)
            {
                throw new ArgumentNullException("requestId is a required property for UnSuspendRequestSchema and cannot be null");
            }
            this.RequestId = requestId;
            // to ensure "tokenUniqueReferences" is required (not null)
            if (tokenUniqueReferences == null)
            {
                throw new ArgumentNullException("tokenUniqueReferences is a required property for UnSuspendRequestSchema and cannot be null");
            }
            this.TokenUniqueReferences = tokenUniqueReferences;
            // to ensure "causedBy" is required (not null)
            if (causedBy == null)
            {
                throw new ArgumentNullException("causedBy is a required property for UnSuspendRequestSchema and cannot be null");
            }
            this.CausedBy = causedBy;
            // to ensure "reasonCode" is required (not null)
            if (reasonCode == null)
            {
                throw new ArgumentNullException("reasonCode is a required property for UnSuspendRequestSchema and cannot be null");
            }
            this.ReasonCode = reasonCode;
            this.ResponseHost = responseHost;
            this.PaymentAppInstanceId = paymentAppInstanceId;
            this.Reason = reason;
        }

        /// <summary>
        /// The host that originated the request. Future calls in the same conversation may be routed to this host. 
        /// </summary>
        /// <value>The host that originated the request. Future calls in the same conversation may be routed to this host. </value>
        /// <example>site2.payment-app-provider.com</example>
        [DataMember(Name = "responseHost", EmitDefaultValue = false)]
        public string ResponseHost { get; set; }

        /// <summary>
        /// Unique identifier for the request. 
        /// </summary>
        /// <value>Unique identifier for the request. </value>
        /// <example>123456</example>
        [DataMember(Name = "requestId", IsRequired = true, EmitDefaultValue = true)]
        public string RequestId { get; set; }

        /// <summary>
        /// Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \&quot;-\&quot;, underscore \&quot;_\&quot;) up to a maximum length of 48, &#x3D; should not be URL encoded. Conditional - not applicable for server based tokens but required otherwise. 
        /// </summary>
        /// <value>Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \&quot;-\&quot;, underscore \&quot;_\&quot;) up to a maximum length of 48, &#x3D; should not be URL encoded. Conditional - not applicable for server based tokens but required otherwise. </value>
        /// <example>123456789</example>
        [DataMember(Name = "paymentAppInstanceId", EmitDefaultValue = false)]
        public string PaymentAppInstanceId { get; set; }

        /// <summary>
        /// The specific Token to be unsuspended. Array of more or more valid references as assigned by MDES 
        /// </summary>
        /// <value>The specific Token to be unsuspended. Array of more or more valid references as assigned by MDES </value>
        /// <example>DWSPMC000000000132d72d4fcb2f4136a0532d3093ff1a45</example>
        [DataMember(Name = "tokenUniqueReferences", IsRequired = true, EmitDefaultValue = true)]
        public List<string> TokenUniqueReferences { get; set; }

        /// <summary>
        /// Who or what caused the Token to be unsuspended. Must be either the &#39;CARDHOLDER&#39; (operation requested by the Cardholder) or &#39;TOKEN_REQUESTOR&#39; (operation requested by the token requestor). 
        /// </summary>
        /// <value>Who or what caused the Token to be unsuspended. Must be either the &#39;CARDHOLDER&#39; (operation requested by the Cardholder) or &#39;TOKEN_REQUESTOR&#39; (operation requested by the token requestor). </value>
        /// <example>CARDHOLDER</example>
        [DataMember(Name = "causedBy", IsRequired = true, EmitDefaultValue = true)]
        public string CausedBy { get; set; }

        /// <summary>
        /// Free form reason why the Tokens are being suspended. 
        /// </summary>
        /// <value>Free form reason why the Tokens are being suspended. </value>
        /// <example>Lost/stolen device</example>
        [DataMember(Name = "reason", EmitDefaultValue = false)]
        public string Reason { get; set; }

        /// <summary>
        /// The reason for the action to be unsuspended. Must be one of &#39;SUSPECTED_FRAUD&#39; (suspected fraudulent token transactions), &#39;OTHER&#39; (Other - default used if value not provided). 
        /// </summary>
        /// <value>The reason for the action to be unsuspended. Must be one of &#39;SUSPECTED_FRAUD&#39; (suspected fraudulent token transactions), &#39;OTHER&#39; (Other - default used if value not provided). </value>
        /// <example>SUSPECTED_FRAUD</example>
        [DataMember(Name = "reasonCode", IsRequired = true, EmitDefaultValue = true)]
        public string ReasonCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UnSuspendRequestSchema {\n");
            sb.Append("  ResponseHost: ").Append(ResponseHost).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  PaymentAppInstanceId: ").Append(PaymentAppInstanceId).Append("\n");
            sb.Append("  TokenUniqueReferences: ").Append(TokenUniqueReferences).Append("\n");
            sb.Append("  CausedBy: ").Append(CausedBy).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
            sb.Append("  ReasonCode: ").Append(ReasonCode).Append("\n");
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
            // PaymentAppInstanceId (string) maxLength
            if (this.PaymentAppInstanceId != null && this.PaymentAppInstanceId.Length > 48)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PaymentAppInstanceId, length must be less than 48.", new [] { "PaymentAppInstanceId" });
            }

            // CausedBy (string) maxLength
            if (this.CausedBy != null && this.CausedBy.Length > 64)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CausedBy, length must be less than 64.", new [] { "CausedBy" });
            }

            // Reason (string) maxLength
            if (this.Reason != null && this.Reason.Length > 256)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Reason, length must be less than 256.", new [] { "Reason" });
            }

            // ReasonCode (string) maxLength
            if (this.ReasonCode != null && this.ReasonCode.Length > 64)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ReasonCode, length must be less than 64.", new [] { "ReasonCode" });
            }

            yield break;
        }
    }

}
