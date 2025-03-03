=begin
#MDES Digital Enablement API

#These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 

The version of the OpenAPI document: 1.3.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'date'
require 'time'

module OpenapiClient
  class DecisioningData
    # **(OPTIONAL)** Digitization decision recommended by the Token Requestor. Must be either APPROVED (Recommend a decision of Approved), DECLINED (Recommend a decision of Decline). 
    attr_accessor :recommendation

    # **(OPTIONAL)** Version of the algorithm used by the Token Requestor to determine its recommendation. Must be a value of \"01\". Other values may be supported in the future. 
    attr_accessor :recommendation_algorithm_version

    # **(OPTIONAL)** Score assigned by the Token Requestor for the target device being provisioned. Must be a value from 1 to 5. 
    attr_accessor :device_score

    # **(OPTIONAL)** Score assigned by the Token Requestor for the consumer account or relationship. Must be a value from 1 to 5. 
    attr_accessor :account_score

    # **(OPTIONAL)** Code indicating the reasons the Token Requestor is suggesting the digitization decision.  See table here - https://developer.mastercard.com/mdes-digital-enablement/documentation/code-and-formats/#recommendation-reason-codes 
    attr_accessor :recommendation_reasons

    # **(OPTIONAL)** Latitude and longitude in the format \"(sign) latitude, (sign) longitude\" with a precision of 2 decimal places.  Ex - \"38.63, -90.25\"  Latitude is between -90 and 90.  Longitude between -180 and 180. Relates to the target device being provisioned. If there is no target device, then this should be the current consumer location, if available. 
    attr_accessor :device_current_location

    # **(OPTIONAL)** The IP address of the device through which the device reaches the internet. This may be a temporary or permanent IP address assigned to a home router, or the IP address of a gateway through which the device connects to a network. IPv4 address format of 4 octets separated by \".\" Ex - 127.0.0.1 Relates to the target device being provisioned. If there is no target device, then this should be the current consumer IP address, if available. 
    attr_accessor :device_ip_address

    # **(OPTIONAL)** The last few digits (typically four) of the consumer's mobile phone number as available on file or on the consumer's current device, which may or may not be the mobile number of the target device being provisioned. 
    attr_accessor :mobile_number_suffix

    # **(OPTIONAL)** SHA-256 hash of the Cardholder?s account ID with the Token Requestor. Typically expected to be an email address. 
    attr_accessor :account_id_hash

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'recommendation' => :'recommendation',
        :'recommendation_algorithm_version' => :'recommendationAlgorithmVersion',
        :'device_score' => :'deviceScore',
        :'account_score' => :'accountScore',
        :'recommendation_reasons' => :'recommendationReasons',
        :'device_current_location' => :'deviceCurrentLocation',
        :'device_ip_address' => :'deviceIpAddress',
        :'mobile_number_suffix' => :'mobileNumberSuffix',
        :'account_id_hash' => :'accountIdHash'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'recommendation' => :'String',
        :'recommendation_algorithm_version' => :'String',
        :'device_score' => :'String',
        :'account_score' => :'String',
        :'recommendation_reasons' => :'Array<String>',
        :'device_current_location' => :'String',
        :'device_ip_address' => :'String',
        :'mobile_number_suffix' => :'String',
        :'account_id_hash' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::DecisioningData` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::DecisioningData`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'recommendation')
        self.recommendation = attributes[:'recommendation']
      end

      if attributes.key?(:'recommendation_algorithm_version')
        self.recommendation_algorithm_version = attributes[:'recommendation_algorithm_version']
      end

      if attributes.key?(:'device_score')
        self.device_score = attributes[:'device_score']
      end

      if attributes.key?(:'account_score')
        self.account_score = attributes[:'account_score']
      end

      if attributes.key?(:'recommendation_reasons')
        if (value = attributes[:'recommendation_reasons']).is_a?(Array)
          self.recommendation_reasons = value
        end
      end

      if attributes.key?(:'device_current_location')
        self.device_current_location = attributes[:'device_current_location']
      end

      if attributes.key?(:'device_ip_address')
        self.device_ip_address = attributes[:'device_ip_address']
      end

      if attributes.key?(:'mobile_number_suffix')
        self.mobile_number_suffix = attributes[:'mobile_number_suffix']
      end

      if attributes.key?(:'account_id_hash')
        self.account_id_hash = attributes[:'account_id_hash']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@recommendation.nil? && @recommendation.to_s.length > 64
        invalid_properties.push('invalid value for "recommendation", the character length must be smaller than or equal to 64.')
      end

      if !@recommendation_algorithm_version.nil? && @recommendation_algorithm_version.to_s.length > 16
        invalid_properties.push('invalid value for "recommendation_algorithm_version", the character length must be smaller than or equal to 16.')
      end

      if !@device_current_location.nil? && @device_current_location.to_s.length > 14
        invalid_properties.push('invalid value for "device_current_location", the character length must be smaller than or equal to 14.')
      end

      if !@device_ip_address.nil? && @device_ip_address.to_s.length > 15
        invalid_properties.push('invalid value for "device_ip_address", the character length must be smaller than or equal to 15.')
      end

      if !@mobile_number_suffix.nil? && @mobile_number_suffix.to_s.length > 32
        invalid_properties.push('invalid value for "mobile_number_suffix", the character length must be smaller than or equal to 32.')
      end

      if !@account_id_hash.nil? && @account_id_hash.to_s.length > 64
        invalid_properties.push('invalid value for "account_id_hash", the character length must be smaller than or equal to 64.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@recommendation.nil? && @recommendation.to_s.length > 64
      return false if !@recommendation_algorithm_version.nil? && @recommendation_algorithm_version.to_s.length > 16
      return false if !@device_current_location.nil? && @device_current_location.to_s.length > 14
      return false if !@device_ip_address.nil? && @device_ip_address.to_s.length > 15
      return false if !@mobile_number_suffix.nil? && @mobile_number_suffix.to_s.length > 32
      return false if !@account_id_hash.nil? && @account_id_hash.to_s.length > 64
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] recommendation Value to be assigned
    def recommendation=(recommendation)
      if !recommendation.nil? && recommendation.to_s.length > 64
        fail ArgumentError, 'invalid value for "recommendation", the character length must be smaller than or equal to 64.'
      end

      @recommendation = recommendation
    end

    # Custom attribute writer method with validation
    # @param [Object] recommendation_algorithm_version Value to be assigned
    def recommendation_algorithm_version=(recommendation_algorithm_version)
      if !recommendation_algorithm_version.nil? && recommendation_algorithm_version.to_s.length > 16
        fail ArgumentError, 'invalid value for "recommendation_algorithm_version", the character length must be smaller than or equal to 16.'
      end

      @recommendation_algorithm_version = recommendation_algorithm_version
    end

    # Custom attribute writer method with validation
    # @param [Object] device_current_location Value to be assigned
    def device_current_location=(device_current_location)
      if !device_current_location.nil? && device_current_location.to_s.length > 14
        fail ArgumentError, 'invalid value for "device_current_location", the character length must be smaller than or equal to 14.'
      end

      @device_current_location = device_current_location
    end

    # Custom attribute writer method with validation
    # @param [Object] device_ip_address Value to be assigned
    def device_ip_address=(device_ip_address)
      if !device_ip_address.nil? && device_ip_address.to_s.length > 15
        fail ArgumentError, 'invalid value for "device_ip_address", the character length must be smaller than or equal to 15.'
      end

      @device_ip_address = device_ip_address
    end

    # Custom attribute writer method with validation
    # @param [Object] mobile_number_suffix Value to be assigned
    def mobile_number_suffix=(mobile_number_suffix)
      if !mobile_number_suffix.nil? && mobile_number_suffix.to_s.length > 32
        fail ArgumentError, 'invalid value for "mobile_number_suffix", the character length must be smaller than or equal to 32.'
      end

      @mobile_number_suffix = mobile_number_suffix
    end

    # Custom attribute writer method with validation
    # @param [Object] account_id_hash Value to be assigned
    def account_id_hash=(account_id_hash)
      if !account_id_hash.nil? && account_id_hash.to_s.length > 64
        fail ArgumentError, 'invalid value for "account_id_hash", the character length must be smaller than or equal to 64.'
      end

      @account_id_hash = account_id_hash
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          recommendation == o.recommendation &&
          recommendation_algorithm_version == o.recommendation_algorithm_version &&
          device_score == o.device_score &&
          account_score == o.account_score &&
          recommendation_reasons == o.recommendation_reasons &&
          device_current_location == o.device_current_location &&
          device_ip_address == o.device_ip_address &&
          mobile_number_suffix == o.mobile_number_suffix &&
          account_id_hash == o.account_id_hash
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [recommendation, recommendation_algorithm_version, device_score, account_score, recommendation_reasons, device_current_location, device_ip_address, mobile_number_suffix, account_id_hash].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
