// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
    /**
     * @return Metric type.
     * 
     */
    private String predefinedMetricType;
    /**
     * @return Reserved for future use if the `predefined_metric_type` is not `ALBRequestCountPerTarget`. If the `predefined_metric_type` is `ALBRequestCountPerTarget`, you must specify this argument. Documentation can be found at: [AWS Predefined Scaling Metric Specification](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html). Must be less than or equal to 1023 characters in length.
     * 
     */
    private @Nullable String resourceLabel;

    private PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification() {}
    /**
     * @return Metric type.
     * 
     */
    public String predefinedMetricType() {
        return this.predefinedMetricType;
    }
    /**
     * @return Reserved for future use if the `predefined_metric_type` is not `ALBRequestCountPerTarget`. If the `predefined_metric_type` is `ALBRequestCountPerTarget`, you must specify this argument. Documentation can be found at: [AWS Predefined Scaling Metric Specification](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html). Must be less than or equal to 1023 characters in length.
     * 
     */
    public Optional<String> resourceLabel() {
        return Optional.ofNullable(this.resourceLabel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String predefinedMetricType;
        private @Nullable String resourceLabel;
        public Builder() {}
        public Builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        @CustomType.Setter
        public Builder predefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }
        @CustomType.Setter
        public Builder resourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }
        public PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification build() {
            final var o = new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification();
            o.predefinedMetricType = predefinedMetricType;
            o.resourceLabel = resourceLabel;
            return o;
        }
    }
}
