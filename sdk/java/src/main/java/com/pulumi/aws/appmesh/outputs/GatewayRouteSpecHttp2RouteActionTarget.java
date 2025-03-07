// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionTargetVirtualService;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayRouteSpecHttp2RouteActionTarget {
    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return Virtual service gateway route target.
     * 
     */
    private GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService;

    private GatewayRouteSpecHttp2RouteActionTarget() {}
    /**
     * @return The port number that corresponds to the target for Virtual Service provider port. This is required when the provider (router or node) of the Virtual Service has multiple listeners.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Virtual service gateway route target.
     * 
     */
    public GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer port;
        private GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService;
        public Builder() {}
        public Builder(GatewayRouteSpecHttp2RouteActionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.virtualService = defaults.virtualService;
        }

        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder virtualService(GatewayRouteSpecHttp2RouteActionTargetVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public GatewayRouteSpecHttp2RouteActionTarget build() {
            final var o = new GatewayRouteSpecHttp2RouteActionTarget();
            o.port = port;
            o.virtualService = virtualService;
            return o;
        }
    }
}
