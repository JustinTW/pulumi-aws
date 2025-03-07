// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InputVpc {
    /**
     * @return A list of up to 5 EC2 VPC security group IDs to attach to the Input.
     * 
     */
    private @Nullable List<String> securityGroupIds;
    /**
     * @return A list of 2 VPC subnet IDs from the same VPC.
     * 
     */
    private List<String> subnetIds;

    private InputVpc() {}
    /**
     * @return A list of up to 5 EC2 VPC security group IDs to attach to the Input.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return A list of 2 VPC subnet IDs from the same VPC.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private List<String> subnetIds;
        public Builder() {}
        public Builder(InputVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public InputVpc build() {
            final var o = new InputVpc();
            o.securityGroupIds = securityGroupIds;
            o.subnetIds = subnetIds;
            return o;
        }
    }
}
