// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.ResponseHeadersPolicyRemoveHeadersConfigItem;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResponseHeadersPolicyRemoveHeadersConfig {
    private @Nullable List<ResponseHeadersPolicyRemoveHeadersConfigItem> items;

    private ResponseHeadersPolicyRemoveHeadersConfig() {}
    public List<ResponseHeadersPolicyRemoveHeadersConfigItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyRemoveHeadersConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ResponseHeadersPolicyRemoveHeadersConfigItem> items;
        public Builder() {}
        public Builder(ResponseHeadersPolicyRemoveHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        @CustomType.Setter
        public Builder items(@Nullable List<ResponseHeadersPolicyRemoveHeadersConfigItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(ResponseHeadersPolicyRemoveHeadersConfigItem... items) {
            return items(List.of(items));
        }
        public ResponseHeadersPolicyRemoveHeadersConfig build() {
            final var o = new ResponseHeadersPolicyRemoveHeadersConfig();
            o.items = items;
            return o;
        }
    }
}
