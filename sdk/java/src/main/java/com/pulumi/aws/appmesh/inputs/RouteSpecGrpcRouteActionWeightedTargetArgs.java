// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteActionWeightedTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteActionWeightedTargetArgs Empty = new RouteSpecGrpcRouteActionWeightedTargetArgs();

    /**
     * The targeted port of the weighted object.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The targeted port of the weighted object.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualNode", required=true)
    private Output<String> virtualNode;

    /**
     * @return Virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> virtualNode() {
        return this.virtualNode;
    }

    /**
     * Relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return Relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private RouteSpecGrpcRouteActionWeightedTargetArgs() {}

    private RouteSpecGrpcRouteActionWeightedTargetArgs(RouteSpecGrpcRouteActionWeightedTargetArgs $) {
        this.port = $.port;
        this.virtualNode = $.virtualNode;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecGrpcRouteActionWeightedTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecGrpcRouteActionWeightedTargetArgs $;

        public Builder() {
            $ = new RouteSpecGrpcRouteActionWeightedTargetArgs();
        }

        public Builder(RouteSpecGrpcRouteActionWeightedTargetArgs defaults) {
            $ = new RouteSpecGrpcRouteActionWeightedTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param port The targeted port of the weighted object.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The targeted port of the weighted object.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param virtualNode Virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualNode(Output<String> virtualNode) {
            $.virtualNode = virtualNode;
            return this;
        }

        /**
         * @param virtualNode Virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualNode(String virtualNode) {
            return virtualNode(Output.of(virtualNode));
        }

        /**
         * @param weight Relative weight of the weighted target. An integer between 0 and 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Relative weight of the weighted target. An integer between 0 and 100.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public RouteSpecGrpcRouteActionWeightedTargetArgs build() {
            $.virtualNode = Objects.requireNonNull($.virtualNode, "expected parameter 'virtualNode' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
