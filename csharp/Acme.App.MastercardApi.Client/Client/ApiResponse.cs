/*
 * MDES for Merchants
 *
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.2.10
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Net;

namespace Acme.App.MastercardApi.Client.Client
{
    /// <summary>
    /// Provides a non-generic contract for the ApiResponse wrapper.
    /// </summary>
    public interface IApiResponse
    {
        /// <summary>
        /// The data type of <see cref="Content"/>
        /// </summary>
        Type ResponseType { get; }

        /// <summary>
        /// The content of this response
        /// </summary>
        Object Content { get; }

        /// <summary>
        /// Gets or sets the status code (HTTP status code)
        /// </summary>
        /// <value>The status code.</value>
        HttpStatusCode StatusCode { get; }

        /// <summary>
        /// Gets or sets the HTTP headers
        /// </summary>
        /// <value>HTTP headers</value>
        Multimap<string, string> Headers { get; }

        /// <summary>
        /// Gets or sets any error text defined by the calling client.
        /// </summary>
        String ErrorText { get; set; }

        /// <summary>
        /// Gets or sets any cookies passed along on the response.
        /// </summary>
        List<Cookie> Cookies { get; set; }

        /// <summary>
        /// The raw content of this response
        /// </summary>
        string RawContent { get; }
    }

    /// <summary>
    /// API Response
    /// </summary>
    public class ApiResponse<T> : IApiResponse
    {
        #region Properties

        /// <summary>
        /// Gets or sets the status code (HTTP status code)
        /// </summary>
        /// <value>The status code.</value>
        public HttpStatusCode StatusCode { get; }

        /// <summary>
        /// Gets or sets the HTTP headers
        /// </summary>
        /// <value>HTTP headers</value>
        public Multimap<string, string> Headers { get; }

        /// <summary>
        /// Gets or sets the data (parsed HTTP body)
        /// </summary>
        /// <value>The data.</value>
        public T Data { get; }

        /// <summary>
        /// Gets or sets any error text defined by the calling client.
        /// </summary>
        public String ErrorText { get; set; }

        /// <summary>
        /// Gets or sets any cookies passed along on the response.
        /// </summary>
        public List<Cookie> Cookies { get; set; }

        /// <summary>
        /// The content of this response
        /// </summary>
        public Type ResponseType
        {
            get { return typeof(T); }
        }

        /// <summary>
        /// The data type of <see cref="Content"/>
        /// </summary>
        public object Content
        {
            get { return Data; }
        }

        /// <summary>
        /// The raw content
        /// </summary>
        public string RawContent { get; }

        #endregion Properties

        #region Constructors

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiResponse{T}" /> class.
        /// </summary>
        /// <param name="statusCode">HTTP status code.</param>
        /// <param name="headers">HTTP headers.</param>
        /// <param name="data">Data (parsed HTTP body)</param>
        /// <param name="rawContent">Raw content.</param>
        public ApiResponse(HttpStatusCode statusCode, Multimap<string, string> headers, T data, string rawContent)
        {
            StatusCode = statusCode;
            Headers = headers;
            Data = data;
            RawContent = rawContent;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiResponse{T}" /> class.
        /// </summary>
        /// <param name="statusCode">HTTP status code.</param>
        /// <param name="headers">HTTP headers.</param>
        /// <param name="data">Data (parsed HTTP body)</param>
        public ApiResponse(HttpStatusCode statusCode, Multimap<string, string> headers, T data) : this(statusCode, headers, data, null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiResponse{T}" /> class.
        /// </summary>
        /// <param name="statusCode">HTTP status code.</param>
        /// <param name="data">Data (parsed HTTP body)</param>
        /// <param name="rawContent">Raw content.</param>
        public ApiResponse(HttpStatusCode statusCode, T data, string rawContent) : this(statusCode, null, data, rawContent)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ApiResponse{T}" /> class.
        /// </summary>
        /// <param name="statusCode">HTTP status code.</param>
        /// <param name="data">Data (parsed HTTP body)</param>
        public ApiResponse(HttpStatusCode statusCode, T data) : this(statusCode, data, null)
        {
        }

        #endregion Constructors
    }
}
