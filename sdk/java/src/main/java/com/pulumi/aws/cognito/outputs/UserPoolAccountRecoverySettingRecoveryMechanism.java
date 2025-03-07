// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserPoolAccountRecoverySettingRecoveryMechanism {
    /**
     * @return Name of the user pool.
     * 
     * The following arguments are optional:
     * 
     */
    private String name;
    /**
     * @return Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    private Integer priority;

    private UserPoolAccountRecoverySettingRecoveryMechanism() {}
    /**
     * @return Name of the user pool.
     * 
     * The following arguments are optional:
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    public Integer priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingRecoveryMechanism defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Integer priority;
        public Builder() {}
        public Builder(UserPoolAccountRecoverySettingRecoveryMechanism defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public UserPoolAccountRecoverySettingRecoveryMechanism build() {
            final var o = new UserPoolAccountRecoverySettingRecoveryMechanism();
            o.name = name;
            o.priority = priority;
            return o;
        }
    }
}
