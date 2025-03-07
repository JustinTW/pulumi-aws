// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rbin.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleResourceTag {
    /**
     * @return The tag key.
     * 
     * The following argument is optional:
     * 
     */
    private String resourceTagKey;
    /**
     * @return The tag value.
     * 
     */
    private @Nullable String resourceTagValue;

    private RuleResourceTag() {}
    /**
     * @return The tag key.
     * 
     * The following argument is optional:
     * 
     */
    public String resourceTagKey() {
        return this.resourceTagKey;
    }
    /**
     * @return The tag value.
     * 
     */
    public Optional<String> resourceTagValue() {
        return Optional.ofNullable(this.resourceTagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleResourceTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceTagKey;
        private @Nullable String resourceTagValue;
        public Builder() {}
        public Builder(RuleResourceTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTagKey = defaults.resourceTagKey;
    	      this.resourceTagValue = defaults.resourceTagValue;
        }

        @CustomType.Setter
        public Builder resourceTagKey(String resourceTagKey) {
            this.resourceTagKey = Objects.requireNonNull(resourceTagKey);
            return this;
        }
        @CustomType.Setter
        public Builder resourceTagValue(@Nullable String resourceTagValue) {
            this.resourceTagValue = resourceTagValue;
            return this;
        }
        public RuleResourceTag build() {
            final var o = new RuleResourceTag();
            o.resourceTagKey = resourceTagKey;
            o.resourceTagValue = resourceTagValue;
            return o;
        }
    }
}
