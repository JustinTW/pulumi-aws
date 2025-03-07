// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttp2RouteMatchHeaderMatch {
    private String exact;
    private String prefix;
    private List<GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange> ranges;
    private String regex;
    private String suffix;

    private GetGatewayRouteSpecHttp2RouteMatchHeaderMatch() {}
    public String exact() {
        return this.exact;
    }
    public String prefix() {
        return this.prefix;
    }
    public List<GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange> ranges() {
        return this.ranges;
    }
    public String regex() {
        return this.regex;
    }
    public String suffix() {
        return this.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttp2RouteMatchHeaderMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String exact;
        private String prefix;
        private List<GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange> ranges;
        private String regex;
        private String suffix;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttp2RouteMatchHeaderMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.ranges = defaults.ranges;
    	      this.regex = defaults.regex;
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder exact(String exact) {
            this.exact = Objects.requireNonNull(exact);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder ranges(List<GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange> ranges) {
            this.ranges = Objects.requireNonNull(ranges);
            return this;
        }
        public Builder ranges(GetGatewayRouteSpecHttp2RouteMatchHeaderMatchRange... ranges) {
            return ranges(List.of(ranges));
        }
        @CustomType.Setter
        public Builder regex(String regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }
        @CustomType.Setter
        public Builder suffix(String suffix) {
            this.suffix = Objects.requireNonNull(suffix);
            return this;
        }
        public GetGatewayRouteSpecHttp2RouteMatchHeaderMatch build() {
            final var o = new GetGatewayRouteSpecHttp2RouteMatchHeaderMatch();
            o.exact = exact;
            o.prefix = prefix;
            o.ranges = ranges;
            o.regex = regex;
            o.suffix = suffix;
            return o;
        }
    }
}
