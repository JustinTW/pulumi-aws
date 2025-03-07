// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIdentityPoolCognitoIdentityProvider {
    private String clientId;
    private String providerName;
    private Boolean serverSideTokenCheck;

    private GetIdentityPoolCognitoIdentityProvider() {}
    public String clientId() {
        return this.clientId;
    }
    public String providerName() {
        return this.providerName;
    }
    public Boolean serverSideTokenCheck() {
        return this.serverSideTokenCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIdentityPoolCognitoIdentityProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String providerName;
        private Boolean serverSideTokenCheck;
        public Builder() {}
        public Builder(GetIdentityPoolCognitoIdentityProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.providerName = defaults.providerName;
    	      this.serverSideTokenCheck = defaults.serverSideTokenCheck;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        @CustomType.Setter
        public Builder serverSideTokenCheck(Boolean serverSideTokenCheck) {
            this.serverSideTokenCheck = Objects.requireNonNull(serverSideTokenCheck);
            return this;
        }
        public GetIdentityPoolCognitoIdentityProvider build() {
            final var o = new GetIdentityPoolCognitoIdentityProvider();
            o.clientId = clientId;
            o.providerName = providerName;
            o.serverSideTokenCheck = serverSideTokenCheck;
            return o;
        }
    }
}
