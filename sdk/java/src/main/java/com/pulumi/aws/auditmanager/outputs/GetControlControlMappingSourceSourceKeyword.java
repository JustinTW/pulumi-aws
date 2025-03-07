// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetControlControlMappingSourceSourceKeyword {
    private String keywordInputType;
    private String keywordValue;

    private GetControlControlMappingSourceSourceKeyword() {}
    public String keywordInputType() {
        return this.keywordInputType;
    }
    public String keywordValue() {
        return this.keywordValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlControlMappingSourceSourceKeyword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keywordInputType;
        private String keywordValue;
        public Builder() {}
        public Builder(GetControlControlMappingSourceSourceKeyword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keywordInputType = defaults.keywordInputType;
    	      this.keywordValue = defaults.keywordValue;
        }

        @CustomType.Setter
        public Builder keywordInputType(String keywordInputType) {
            this.keywordInputType = Objects.requireNonNull(keywordInputType);
            return this;
        }
        @CustomType.Setter
        public Builder keywordValue(String keywordValue) {
            this.keywordValue = Objects.requireNonNull(keywordValue);
            return this;
        }
        public GetControlControlMappingSourceSourceKeyword build() {
            final var o = new GetControlControlMappingSourceSourceKeyword();
            o.keywordInputType = keywordInputType;
            o.keywordValue = keywordValue;
            return o;
        }
    }
}
