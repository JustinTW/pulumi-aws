// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchRangeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteMatchMetadataMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchMetadataMatchArgs Empty = new RouteSpecGrpcRouteMatchMetadataMatchArgs();

    /**
     * The exact path to match on.
     * 
     */
    @Import(name="exact")
    private @Nullable Output<String> exact;

    /**
     * @return The exact path to match on.
     * 
     */
    public Optional<Output<String>> exact() {
        return Optional.ofNullable(this.exact);
    }

    /**
     * Header value sent by the client must begin with the specified characters.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Header value sent by the client must begin with the specified characters.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * Object that specifies the range of numbers that the header value sent by the client must be included in.
     * 
     */
    @Import(name="range")
    private @Nullable Output<RouteSpecGrpcRouteMatchMetadataMatchRangeArgs> range;

    /**
     * @return Object that specifies the range of numbers that the header value sent by the client must be included in.
     * 
     */
    public Optional<Output<RouteSpecGrpcRouteMatchMetadataMatchRangeArgs>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * The regex used to match the path.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return The regex used to match the path.
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    /**
     * Header value sent by the client must end with the specified characters.
     * 
     */
    @Import(name="suffix")
    private @Nullable Output<String> suffix;

    /**
     * @return Header value sent by the client must end with the specified characters.
     * 
     */
    public Optional<Output<String>> suffix() {
        return Optional.ofNullable(this.suffix);
    }

    private RouteSpecGrpcRouteMatchMetadataMatchArgs() {}

    private RouteSpecGrpcRouteMatchMetadataMatchArgs(RouteSpecGrpcRouteMatchMetadataMatchArgs $) {
        this.exact = $.exact;
        this.prefix = $.prefix;
        this.range = $.range;
        this.regex = $.regex;
        this.suffix = $.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecGrpcRouteMatchMetadataMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecGrpcRouteMatchMetadataMatchArgs $;

        public Builder() {
            $ = new RouteSpecGrpcRouteMatchMetadataMatchArgs();
        }

        public Builder(RouteSpecGrpcRouteMatchMetadataMatchArgs defaults) {
            $ = new RouteSpecGrpcRouteMatchMetadataMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exact The exact path to match on.
         * 
         * @return builder
         * 
         */
        public Builder exact(@Nullable Output<String> exact) {
            $.exact = exact;
            return this;
        }

        /**
         * @param exact The exact path to match on.
         * 
         * @return builder
         * 
         */
        public Builder exact(String exact) {
            return exact(Output.of(exact));
        }

        /**
         * @param prefix Header value sent by the client must begin with the specified characters.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Header value sent by the client must begin with the specified characters.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param range Object that specifies the range of numbers that the header value sent by the client must be included in.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<RouteSpecGrpcRouteMatchMetadataMatchRangeArgs> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range Object that specifies the range of numbers that the header value sent by the client must be included in.
         * 
         * @return builder
         * 
         */
        public Builder range(RouteSpecGrpcRouteMatchMetadataMatchRangeArgs range) {
            return range(Output.of(range));
        }

        /**
         * @param regex The regex used to match the path.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex The regex used to match the path.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        /**
         * @param suffix Header value sent by the client must end with the specified characters.
         * 
         * @return builder
         * 
         */
        public Builder suffix(@Nullable Output<String> suffix) {
            $.suffix = suffix;
            return this;
        }

        /**
         * @param suffix Header value sent by the client must end with the specified characters.
         * 
         * @return builder
         * 
         */
        public Builder suffix(String suffix) {
            return suffix(Output.of(suffix));
        }

        public RouteSpecGrpcRouteMatchMetadataMatchArgs build() {
            return $;
        }
    }

}
