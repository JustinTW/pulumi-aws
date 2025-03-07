// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVirtualGatewaySpecListenerHealthCheck {
    private Integer healthyThreshold;
    private Integer intervalMillis;
    private String path;
    private Integer port;
    private String protocol;
    private Integer timeoutMillis;
    private Integer unhealthyThreshold;

    private GetVirtualGatewaySpecListenerHealthCheck() {}
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    public Integer intervalMillis() {
        return this.intervalMillis;
    }
    public String path() {
        return this.path;
    }
    public Integer port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public Integer timeoutMillis() {
        return this.timeoutMillis;
    }
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualGatewaySpecListenerHealthCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer healthyThreshold;
        private Integer intervalMillis;
        private String path;
        private Integer port;
        private String protocol;
        private Integer timeoutMillis;
        private Integer unhealthyThreshold;
        public Builder() {}
        public Builder(GetVirtualGatewaySpecListenerHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalMillis = defaults.intervalMillis;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeoutMillis = defaults.timeoutMillis;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        @CustomType.Setter
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder intervalMillis(Integer intervalMillis) {
            this.intervalMillis = Objects.requireNonNull(intervalMillis);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutMillis(Integer timeoutMillis) {
            this.timeoutMillis = Objects.requireNonNull(timeoutMillis);
            return this;
        }
        @CustomType.Setter
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetVirtualGatewaySpecListenerHealthCheck build() {
            final var o = new GetVirtualGatewaySpecListenerHealthCheck();
            o.healthyThreshold = healthyThreshold;
            o.intervalMillis = intervalMillis;
            o.path = path;
            o.port = port;
            o.protocol = protocol;
            o.timeoutMillis = timeoutMillis;
            o.unhealthyThreshold = unhealthyThreshold;
            return o;
        }
    }
}
