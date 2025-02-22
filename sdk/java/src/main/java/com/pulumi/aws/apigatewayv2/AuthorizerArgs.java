// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorizerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizerArgs Empty = new AuthorizerArgs();

    /**
     * API identifier.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Required credentials as an IAM role for API Gateway to invoke the authorizer.
     * Supported only for `REQUEST` authorizers.
     * 
     */
    @Import(name="authorizerCredentialsArn")
    private @Nullable Output<String> authorizerCredentialsArn;

    /**
     * @return Required credentials as an IAM role for API Gateway to invoke the authorizer.
     * Supported only for `REQUEST` authorizers.
     * 
     */
    public Optional<Output<String>> authorizerCredentialsArn() {
        return Optional.ofNullable(this.authorizerCredentialsArn);
    }

    /**
     * Format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
     * Valid values: `1.0`, `2.0`.
     * 
     */
    @Import(name="authorizerPayloadFormatVersion")
    private @Nullable Output<String> authorizerPayloadFormatVersion;

    /**
     * @return Format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
     * Valid values: `1.0`, `2.0`.
     * 
     */
    public Optional<Output<String>> authorizerPayloadFormatVersion() {
        return Optional.ofNullable(this.authorizerPayloadFormatVersion);
    }

    /**
     * Time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
     * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
     * Supported only for HTTP API Lambda authorizers.
     * 
     */
    @Import(name="authorizerResultTtlInSeconds")
    private @Nullable Output<Integer> authorizerResultTtlInSeconds;

    /**
     * @return Time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
     * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
     * Supported only for HTTP API Lambda authorizers.
     * 
     */
    public Optional<Output<Integer>> authorizerResultTtlInSeconds() {
        return Optional.ofNullable(this.authorizerResultTtlInSeconds);
    }

    /**
     * Authorizer type. Valid values: `JWT`, `REQUEST`.
     * Specify `REQUEST` for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
     * 
     */
    @Import(name="authorizerType", required=true)
    private Output<String> authorizerType;

    /**
     * @return Authorizer type. Valid values: `JWT`, `REQUEST`.
     * Specify `REQUEST` for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
     * 
     */
    public Output<String> authorizerType() {
        return this.authorizerType;
    }

    /**
     * Authorizer&#39;s Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
     * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
     * 
     */
    @Import(name="authorizerUri")
    private @Nullable Output<String> authorizerUri;

    /**
     * @return Authorizer&#39;s Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
     * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
     * 
     */
    public Optional<Output<String>> authorizerUri() {
        return Optional.ofNullable(this.authorizerUri);
    }

    /**
     * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     * Supported only for HTTP APIs.
     * 
     */
    @Import(name="enableSimpleResponses")
    private @Nullable Output<Boolean> enableSimpleResponses;

    /**
     * @return Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     * Supported only for HTTP APIs.
     * 
     */
    public Optional<Output<Boolean>> enableSimpleResponses() {
        return Optional.ofNullable(this.enableSimpleResponses);
    }

    /**
     * Identity sources for which authorization is requested.
     * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
     * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
     * 
     */
    @Import(name="identitySources")
    private @Nullable Output<List<String>> identitySources;

    /**
     * @return Identity sources for which authorization is requested.
     * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
     * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
     * 
     */
    public Optional<Output<List<String>>> identitySources() {
        return Optional.ofNullable(this.identitySources);
    }

    /**
     * Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     * Supported only for HTTP APIs.
     * 
     */
    @Import(name="jwtConfiguration")
    private @Nullable Output<AuthorizerJwtConfigurationArgs> jwtConfiguration;

    /**
     * @return Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     * Supported only for HTTP APIs.
     * 
     */
    public Optional<Output<AuthorizerJwtConfigurationArgs>> jwtConfiguration() {
        return Optional.ofNullable(this.jwtConfiguration);
    }

    /**
     * Name of the authorizer. Must be between 1 and 128 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the authorizer. Must be between 1 and 128 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AuthorizerArgs() {}

    private AuthorizerArgs(AuthorizerArgs $) {
        this.apiId = $.apiId;
        this.authorizerCredentialsArn = $.authorizerCredentialsArn;
        this.authorizerPayloadFormatVersion = $.authorizerPayloadFormatVersion;
        this.authorizerResultTtlInSeconds = $.authorizerResultTtlInSeconds;
        this.authorizerType = $.authorizerType;
        this.authorizerUri = $.authorizerUri;
        this.enableSimpleResponses = $.enableSimpleResponses;
        this.identitySources = $.identitySources;
        this.jwtConfiguration = $.jwtConfiguration;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizerArgs $;

        public Builder() {
            $ = new AuthorizerArgs();
        }

        public Builder(AuthorizerArgs defaults) {
            $ = new AuthorizerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API identifier.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param authorizerCredentialsArn Required credentials as an IAM role for API Gateway to invoke the authorizer.
         * Supported only for `REQUEST` authorizers.
         * 
         * @return builder
         * 
         */
        public Builder authorizerCredentialsArn(@Nullable Output<String> authorizerCredentialsArn) {
            $.authorizerCredentialsArn = authorizerCredentialsArn;
            return this;
        }

        /**
         * @param authorizerCredentialsArn Required credentials as an IAM role for API Gateway to invoke the authorizer.
         * Supported only for `REQUEST` authorizers.
         * 
         * @return builder
         * 
         */
        public Builder authorizerCredentialsArn(String authorizerCredentialsArn) {
            return authorizerCredentialsArn(Output.of(authorizerCredentialsArn));
        }

        /**
         * @param authorizerPayloadFormatVersion Format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
         * Valid values: `1.0`, `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder authorizerPayloadFormatVersion(@Nullable Output<String> authorizerPayloadFormatVersion) {
            $.authorizerPayloadFormatVersion = authorizerPayloadFormatVersion;
            return this;
        }

        /**
         * @param authorizerPayloadFormatVersion Format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
         * Valid values: `1.0`, `2.0`.
         * 
         * @return builder
         * 
         */
        public Builder authorizerPayloadFormatVersion(String authorizerPayloadFormatVersion) {
            return authorizerPayloadFormatVersion(Output.of(authorizerPayloadFormatVersion));
        }

        /**
         * @param authorizerResultTtlInSeconds Time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
         * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
         * Supported only for HTTP API Lambda authorizers.
         * 
         * @return builder
         * 
         */
        public Builder authorizerResultTtlInSeconds(@Nullable Output<Integer> authorizerResultTtlInSeconds) {
            $.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }

        /**
         * @param authorizerResultTtlInSeconds Time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
         * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
         * Supported only for HTTP API Lambda authorizers.
         * 
         * @return builder
         * 
         */
        public Builder authorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
            return authorizerResultTtlInSeconds(Output.of(authorizerResultTtlInSeconds));
        }

        /**
         * @param authorizerType Authorizer type. Valid values: `JWT`, `REQUEST`.
         * Specify `REQUEST` for a Lambda function using incoming request parameters.
         * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
         * 
         * @return builder
         * 
         */
        public Builder authorizerType(Output<String> authorizerType) {
            $.authorizerType = authorizerType;
            return this;
        }

        /**
         * @param authorizerType Authorizer type. Valid values: `JWT`, `REQUEST`.
         * Specify `REQUEST` for a Lambda function using incoming request parameters.
         * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
         * 
         * @return builder
         * 
         */
        public Builder authorizerType(String authorizerType) {
            return authorizerType(Output.of(authorizerType));
        }

        /**
         * @param authorizerUri Authorizer&#39;s Uniform Resource Identifier (URI).
         * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
         * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder authorizerUri(@Nullable Output<String> authorizerUri) {
            $.authorizerUri = authorizerUri;
            return this;
        }

        /**
         * @param authorizerUri Authorizer&#39;s Uniform Resource Identifier (URI).
         * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
         * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder authorizerUri(String authorizerUri) {
            return authorizerUri(Output.of(authorizerUri));
        }

        /**
         * @param enableSimpleResponses Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
         * Supported only for HTTP APIs.
         * 
         * @return builder
         * 
         */
        public Builder enableSimpleResponses(@Nullable Output<Boolean> enableSimpleResponses) {
            $.enableSimpleResponses = enableSimpleResponses;
            return this;
        }

        /**
         * @param enableSimpleResponses Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
         * Supported only for HTTP APIs.
         * 
         * @return builder
         * 
         */
        public Builder enableSimpleResponses(Boolean enableSimpleResponses) {
            return enableSimpleResponses(Output.of(enableSimpleResponses));
        }

        /**
         * @param identitySources Identity sources for which authorization is requested.
         * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
         * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
         * 
         * @return builder
         * 
         */
        public Builder identitySources(@Nullable Output<List<String>> identitySources) {
            $.identitySources = identitySources;
            return this;
        }

        /**
         * @param identitySources Identity sources for which authorization is requested.
         * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
         * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
         * 
         * @return builder
         * 
         */
        public Builder identitySources(List<String> identitySources) {
            return identitySources(Output.of(identitySources));
        }

        /**
         * @param identitySources Identity sources for which authorization is requested.
         * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
         * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
         * 
         * @return builder
         * 
         */
        public Builder identitySources(String... identitySources) {
            return identitySources(List.of(identitySources));
        }

        /**
         * @param jwtConfiguration Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
         * Supported only for HTTP APIs.
         * 
         * @return builder
         * 
         */
        public Builder jwtConfiguration(@Nullable Output<AuthorizerJwtConfigurationArgs> jwtConfiguration) {
            $.jwtConfiguration = jwtConfiguration;
            return this;
        }

        /**
         * @param jwtConfiguration Configuration of a JWT authorizer. Required for the `JWT` authorizer type.
         * Supported only for HTTP APIs.
         * 
         * @return builder
         * 
         */
        public Builder jwtConfiguration(AuthorizerJwtConfigurationArgs jwtConfiguration) {
            return jwtConfiguration(Output.of(jwtConfiguration));
        }

        /**
         * @param name Name of the authorizer. Must be between 1 and 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the authorizer. Must be between 1 and 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AuthorizerArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.authorizerType = Objects.requireNonNull($.authorizerType, "expected parameter 'authorizerType' to be non-null");
            return $;
        }
    }

}
