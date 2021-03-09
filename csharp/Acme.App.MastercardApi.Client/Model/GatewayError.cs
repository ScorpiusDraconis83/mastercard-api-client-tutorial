/*
 * MDES for Merchants
 *
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.2.10
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
    /// Only returned in the event of an error condition.
    /// </summary>
    [DataContract(Name = "GatewayError")]
    public partial class GatewayError : IEquatable<GatewayError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GatewayError" /> class.
        /// </summary>
        /// <param name="source">An element used to indicate the source of the issue causing this error. e.g. Gateway __Max Length: 32__ .</param>
        /// <param name="description">Description of the reason the operation failed. See API Response Errors &lt;br&gt; __Max Length: 256__ .</param>
        /// <param name="reasonCode">A reason code for the error that has occurred.&lt;br&gt; __Max Length: 100__ .</param>
        /// <param name="recoverable">Generated by the gateway to indicate if the request could presented again for processing. Either \&quot;TRUE\&quot; or \&quot;FALSE\&quot; .</param>
        /// <param name="details">Always NULL, present for backwards compatiility .</param>
        public GatewayError(string source = default(string), string description = default(string), string reasonCode = default(string), bool recoverable = default(bool), bool details = default(bool))
        {
            this.Source = source;
            this.Description = description;
            this.ReasonCode = reasonCode;
            this.Recoverable = recoverable;
            this.Details = details;
        }

        /// <summary>
        /// An element used to indicate the source of the issue causing this error. e.g. Gateway __Max Length: 32__ 
        /// </summary>
        /// <value>An element used to indicate the source of the issue causing this error. e.g. Gateway __Max Length: 32__ </value>
        [DataMember(Name = "Source", EmitDefaultValue = false)]
        public string Source { get; set; }

        /// <summary>
        /// Description of the reason the operation failed. See API Response Errors &lt;br&gt; __Max Length: 256__ 
        /// </summary>
        /// <value>Description of the reason the operation failed. See API Response Errors &lt;br&gt; __Max Length: 256__ </value>
        [DataMember(Name = "Description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// A reason code for the error that has occurred.&lt;br&gt; __Max Length: 100__ 
        /// </summary>
        /// <value>A reason code for the error that has occurred.&lt;br&gt; __Max Length: 100__ </value>
        [DataMember(Name = "ReasonCode", EmitDefaultValue = false)]
        public string ReasonCode { get; set; }

        /// <summary>
        /// Generated by the gateway to indicate if the request could presented again for processing. Either \&quot;TRUE\&quot; or \&quot;FALSE\&quot; 
        /// </summary>
        /// <value>Generated by the gateway to indicate if the request could presented again for processing. Either \&quot;TRUE\&quot; or \&quot;FALSE\&quot; </value>
        [DataMember(Name = "Recoverable", EmitDefaultValue = false)]
        public bool Recoverable { get; set; }

        /// <summary>
        /// Always NULL, present for backwards compatiility 
        /// </summary>
        /// <value>Always NULL, present for backwards compatiility </value>
        [DataMember(Name = "Details", EmitDefaultValue = false)]
        public bool Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GatewayError {\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ReasonCode: ").Append(ReasonCode).Append("\n");
            sb.Append("  Recoverable: ").Append(Recoverable).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GatewayError);
        }

        /// <summary>
        /// Returns true if GatewayError instances are equal
        /// </summary>
        /// <param name="input">Instance of GatewayError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GatewayError input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.ReasonCode == input.ReasonCode ||
                    (this.ReasonCode != null &&
                    this.ReasonCode.Equals(input.ReasonCode))
                ) && 
                (
                    this.Recoverable == input.Recoverable ||
                    this.Recoverable.Equals(input.Recoverable)
                ) && 
                (
                    this.Details == input.Details ||
                    this.Details.Equals(input.Details)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Source != null)
                    hashCode = hashCode * 59 + this.Source.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.ReasonCode != null)
                    hashCode = hashCode * 59 + this.ReasonCode.GetHashCode();
                hashCode = hashCode * 59 + this.Recoverable.GetHashCode();
                hashCode = hashCode * 59 + this.Details.GetHashCode();
                return hashCode;
            }
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
