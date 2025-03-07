// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetGroupConfigHealthCheckMatcher {
    /**
     * @return The HTTP codes to use when checking for a successful response from a target.
     * 
     */
    private @Nullable String value;

    private TargetGroupConfigHealthCheckMatcher() {}
    /**
     * @return The HTTP codes to use when checking for a successful response from a target.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupConfigHealthCheckMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String value;
        public Builder() {}
        public Builder(TargetGroupConfigHealthCheckMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public TargetGroupConfigHealthCheckMatcher build() {
            final var o = new TargetGroupConfigHealthCheckMatcher();
            o.value = value;
            return o;
        }
    }
}
