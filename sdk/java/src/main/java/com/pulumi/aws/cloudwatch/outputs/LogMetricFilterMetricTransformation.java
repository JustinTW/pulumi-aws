// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogMetricFilterMetricTransformation {
    /**
     * @return The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    private @Nullable String defaultValue;
    /**
     * @return Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    private @Nullable Map<String,String> dimensions;
    /**
     * @return The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    private String name;
    /**
     * @return The destination namespace of the CloudWatch metric.
     * 
     */
    private String namespace;
    /**
     * @return The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    private @Nullable String unit;
    /**
     * @return What to publish to the metric. For example, if you&#39;re counting the occurrences of a particular term like &#34;Error&#34;, the value will be &#34;1&#34; for each occurrence. If you&#39;re counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    private String value;

    private LogMetricFilterMetricTransformation() {}
    /**
     * @return The value to emit when a filter pattern does not match a log event. Conflicts with `dimensions`.
     * 
     */
    public Optional<String> defaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * @return Map of fields to use as dimensions for the metric. Up to 3 dimensions are allowed. Conflicts with `default_value`.
     * 
     */
    public Map<String,String> dimensions() {
        return this.dimensions == null ? Map.of() : this.dimensions;
    }
    /**
     * @return The name of the CloudWatch metric to which the monitored log information should be published (e.g., `ErrorCount`)
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The destination namespace of the CloudWatch metric.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return The unit to assign to the metric. If you omit this, the unit is set as `None`.
     * 
     */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * @return What to publish to the metric. For example, if you&#39;re counting the occurrences of a particular term like &#34;Error&#34;, the value will be &#34;1&#34; for each occurrence. If you&#39;re counting the bytes transferred the published value will be the value in the log event.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterMetricTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable Map<String,String> dimensions;
        private String name;
        private String namespace;
        private @Nullable String unit;
        private String value;
        public Builder() {}
        public Builder(LogMetricFilterMetricTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.dimensions = defaults.dimensions;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        @CustomType.Setter
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LogMetricFilterMetricTransformation build() {
            final var o = new LogMetricFilterMetricTransformation();
            o.defaultValue = defaultValue;
            o.dimensions = dimensions;
            o.name = name;
            o.namespace = namespace;
            o.unit = unit;
            o.value = value;
            return o;
        }
    }
}
