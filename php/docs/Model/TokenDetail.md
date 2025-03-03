# # TokenDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token_unique_reference** | **string** | Globally unique identifier for the Token, as assigned by MDES. | [optional]
**public_key_fingerprint** | **string** | The certificate fingerprint identifying the public key used to encrypt the ephemeral AES key. | [optional]
**encrypted_key** | **string** | One-time use AES key encrypted by the MasterCard public key (as identified by &#39;publicKeyFingerprint&#39;) using the OAEP or RSA Encryption Standard PKCS #1 v1.5 scheme (depending on the value of &#39;oaepHashingAlgorithm&#39;. Requirement is for a 128-bit key (with 256-bit key supported as an option). | [optional]
**oaep_hashing_algorithm** | **string** | Hashing algorithm used with the OAEP scheme. If omitted, then the RSA Encryption Standard PKCS #1 v1.5 will be used. Must be either &#39;SHA256&#39; (Use the SHA-256 algorithm) or &#39;SHA512&#39; (Use the SHA-512 algorithm). | [optional]
**iv** | **string** | It is recommended to supply a random initialization vector when encrypting the data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. Hex-encoded data (case-insensitive). | [optional]
**encrypted_data** | [**\DigitalEnablementClient\Model\TokenDetailData**](TokenDetailData.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
