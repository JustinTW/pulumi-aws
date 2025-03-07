// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteSpecHttpRouteMatchPath {
    private String exact;
    private String regex;

    private GetRouteSpecHttpRouteMatchPath() {}
    public String exact() {
        return this.exact;
    }
    public String regex() {
        return this.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteSpecHttpRouteMatchPath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String exact;
        private String regex;
        public Builder() {}
        public Builder(GetRouteSpecHttpRouteMatchPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.regex = defaults.regex;
        }

        @CustomType.Setter
        public Builder exact(String exact) {
            this.exact = Objects.requireNonNull(exact);
            return this;
        }
        @CustomType.Setter
        public Builder regex(String regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }
        public GetRouteSpecHttpRouteMatchPath build() {
            final var o = new GetRouteSpecHttpRouteMatchPath();
            o.exact = exact;
            o.regex = regex;
            return o;
        }
    }
}
