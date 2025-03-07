// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StageRouteSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageRouteSettingArgs Empty = new StageRouteSettingArgs();

    /**
     * Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    @Import(name="dataTraceEnabled")
    private @Nullable Output<Boolean> dataTraceEnabled;

    /**
     * @return Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    public Optional<Output<Boolean>> dataTraceEnabled() {
        return Optional.ofNullable(this.dataTraceEnabled);
    }

    /**
     * Whether detailed metrics are enabled for the route. Defaults to `false`.
     * 
     */
    @Import(name="detailedMetricsEnabled")
    private @Nullable Output<Boolean> detailedMetricsEnabled;

    /**
     * @return Whether detailed metrics are enabled for the route. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> detailedMetricsEnabled() {
        return Optional.ofNullable(this.detailedMetricsEnabled);
    }

    /**
     * Logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="loggingLevel")
    private @Nullable Output<String> loggingLevel;

    /**
     * @return Logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
     * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Optional<Output<String>> loggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }

    /**
     * Route key.
     * 
     */
    @Import(name="routeKey", required=true)
    private Output<String> routeKey;

    /**
     * @return Route key.
     * 
     */
    public Output<String> routeKey() {
        return this.routeKey;
    }

    /**
     * Throttling burst limit for the route.
     * 
     */
    @Import(name="throttlingBurstLimit")
    private @Nullable Output<Integer> throttlingBurstLimit;

    /**
     * @return Throttling burst limit for the route.
     * 
     */
    public Optional<Output<Integer>> throttlingBurstLimit() {
        return Optional.ofNullable(this.throttlingBurstLimit);
    }

    /**
     * Throttling rate limit for the route.
     * 
     */
    @Import(name="throttlingRateLimit")
    private @Nullable Output<Double> throttlingRateLimit;

    /**
     * @return Throttling rate limit for the route.
     * 
     */
    public Optional<Output<Double>> throttlingRateLimit() {
        return Optional.ofNullable(this.throttlingRateLimit);
    }

    private StageRouteSettingArgs() {}

    private StageRouteSettingArgs(StageRouteSettingArgs $) {
        this.dataTraceEnabled = $.dataTraceEnabled;
        this.detailedMetricsEnabled = $.detailedMetricsEnabled;
        this.loggingLevel = $.loggingLevel;
        this.routeKey = $.routeKey;
        this.throttlingBurstLimit = $.throttlingBurstLimit;
        this.throttlingRateLimit = $.throttlingRateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageRouteSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageRouteSettingArgs $;

        public Builder() {
            $ = new StageRouteSettingArgs();
        }

        public Builder(StageRouteSettingArgs defaults) {
            $ = new StageRouteSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataTraceEnabled Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
         * Defaults to `false`. Supported only for WebSocket APIs.
         * 
         * @return builder
         * 
         */
        public Builder dataTraceEnabled(@Nullable Output<Boolean> dataTraceEnabled) {
            $.dataTraceEnabled = dataTraceEnabled;
            return this;
        }

        /**
         * @param dataTraceEnabled Whether data trace logging is enabled for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
         * Defaults to `false`. Supported only for WebSocket APIs.
         * 
         * @return builder
         * 
         */
        public Builder dataTraceEnabled(Boolean dataTraceEnabled) {
            return dataTraceEnabled(Output.of(dataTraceEnabled));
        }

        /**
         * @param detailedMetricsEnabled Whether detailed metrics are enabled for the route. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder detailedMetricsEnabled(@Nullable Output<Boolean> detailedMetricsEnabled) {
            $.detailedMetricsEnabled = detailedMetricsEnabled;
            return this;
        }

        /**
         * @param detailedMetricsEnabled Whether detailed metrics are enabled for the route. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder detailedMetricsEnabled(Boolean detailedMetricsEnabled) {
            return detailedMetricsEnabled(Output.of(detailedMetricsEnabled));
        }

        /**
         * @param loggingLevel Logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
         * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder loggingLevel(@Nullable Output<String> loggingLevel) {
            $.loggingLevel = loggingLevel;
            return this;
        }

        /**
         * @param loggingLevel Logging level for the route. Affects the log entries pushed to Amazon CloudWatch Logs.
         * Valid values: `ERROR`, `INFO`, `OFF`. Defaults to `OFF`. Supported only for WebSocket APIs. This provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder loggingLevel(String loggingLevel) {
            return loggingLevel(Output.of(loggingLevel));
        }

        /**
         * @param routeKey Route key.
         * 
         * @return builder
         * 
         */
        public Builder routeKey(Output<String> routeKey) {
            $.routeKey = routeKey;
            return this;
        }

        /**
         * @param routeKey Route key.
         * 
         * @return builder
         * 
         */
        public Builder routeKey(String routeKey) {
            return routeKey(Output.of(routeKey));
        }

        /**
         * @param throttlingBurstLimit Throttling burst limit for the route.
         * 
         * @return builder
         * 
         */
        public Builder throttlingBurstLimit(@Nullable Output<Integer> throttlingBurstLimit) {
            $.throttlingBurstLimit = throttlingBurstLimit;
            return this;
        }

        /**
         * @param throttlingBurstLimit Throttling burst limit for the route.
         * 
         * @return builder
         * 
         */
        public Builder throttlingBurstLimit(Integer throttlingBurstLimit) {
            return throttlingBurstLimit(Output.of(throttlingBurstLimit));
        }

        /**
         * @param throttlingRateLimit Throttling rate limit for the route.
         * 
         * @return builder
         * 
         */
        public Builder throttlingRateLimit(@Nullable Output<Double> throttlingRateLimit) {
            $.throttlingRateLimit = throttlingRateLimit;
            return this;
        }

        /**
         * @param throttlingRateLimit Throttling rate limit for the route.
         * 
         * @return builder
         * 
         */
        public Builder throttlingRateLimit(Double throttlingRateLimit) {
            return throttlingRateLimit(Output.of(throttlingRateLimit));
        }

        public StageRouteSettingArgs build() {
            $.routeKey = Objects.requireNonNull($.routeKey, "expected parameter 'routeKey' to be non-null");
            return $;
        }
    }

}
