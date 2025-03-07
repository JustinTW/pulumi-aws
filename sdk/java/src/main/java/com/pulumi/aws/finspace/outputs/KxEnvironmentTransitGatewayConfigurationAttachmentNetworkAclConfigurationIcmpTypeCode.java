// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.finspace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCode {
    /**
     * @return ICMP code. A value of `-1` means all codes for the specified ICMP type.
     * 
     */
    private Integer code;
    /**
     * @return ICMP type. A value of `-1` means all types.
     * 
     */
    private Integer type;

    private KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCode() {}
    /**
     * @return ICMP code. A value of `-1` means all codes for the specified ICMP type.
     * 
     */
    public Integer code() {
        return this.code;
    }
    /**
     * @return ICMP type. A value of `-1` means all types.
     * 
     */
    public Integer type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer code;
        private Integer type;
        public Builder() {}
        public Builder(KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder code(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        @CustomType.Setter
        public Builder type(Integer type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCode build() {
            final var o = new KxEnvironmentTransitGatewayConfigurationAttachmentNetworkAclConfigurationIcmpTypeCode();
            o.code = code;
            o.type = type;
            return o;
        }
    }
}
