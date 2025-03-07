// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs Empty = new GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs();

    /**
     * Number of milliseconds a token is valid after being authenticated.
     * 
     */
    @Import(name="authTtl")
    private @Nullable Output<Integer> authTtl;

    /**
     * @return Number of milliseconds a token is valid after being authenticated.
     * 
     */
    public Optional<Output<Integer>> authTtl() {
        return Optional.ofNullable(this.authTtl);
    }

    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Number of milliseconds a token is valid after being issued to a user.
     * 
     */
    @Import(name="iatTtl")
    private @Nullable Output<Integer> iatTtl;

    /**
     * @return Number of milliseconds a token is valid after being issued to a user.
     * 
     */
    public Optional<Output<Integer>> iatTtl() {
        return Optional.ofNullable(this.iatTtl);
    }

    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     * 
     */
    @Import(name="issuer", required=true)
    private Output<String> issuer;

    /**
     * @return Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }

    private GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs() {}

    private GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs(GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs $) {
        this.authTtl = $.authTtl;
        this.clientId = $.clientId;
        this.iatTtl = $.iatTtl;
        this.issuer = $.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs $;

        public Builder() {
            $ = new GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs();
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs defaults) {
            $ = new GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authTtl Number of milliseconds a token is valid after being authenticated.
         * 
         * @return builder
         * 
         */
        public Builder authTtl(@Nullable Output<Integer> authTtl) {
            $.authTtl = authTtl;
            return this;
        }

        /**
         * @param authTtl Number of milliseconds a token is valid after being authenticated.
         * 
         * @return builder
         * 
         */
        public Builder authTtl(Integer authTtl) {
            return authTtl(Output.of(authTtl));
        }

        /**
         * @param clientId Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param iatTtl Number of milliseconds a token is valid after being issued to a user.
         * 
         * @return builder
         * 
         */
        public Builder iatTtl(@Nullable Output<Integer> iatTtl) {
            $.iatTtl = iatTtl;
            return this;
        }

        /**
         * @param iatTtl Number of milliseconds a token is valid after being issued to a user.
         * 
         * @return builder
         * 
         */
        public Builder iatTtl(Integer iatTtl) {
            return iatTtl(Output.of(iatTtl));
        }

        /**
         * @param issuer Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
         * 
         * @return builder
         * 
         */
        public Builder issuer(Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        public GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigArgs build() {
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            return $;
        }
    }

}
