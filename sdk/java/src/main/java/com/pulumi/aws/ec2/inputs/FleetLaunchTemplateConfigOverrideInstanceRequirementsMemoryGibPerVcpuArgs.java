// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs Empty = new FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs();

    /**
     * The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
     * 
     */
    @Import(name="max")
    private @Nullable Output<Double> max;

    /**
     * @return The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
     * 
     */
    public Optional<Output<Double>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * The minimum number of vCPUs. To specify no minimum limit, specify `0`.
     * 
     */
    @Import(name="min")
    private @Nullable Output<Double> min;

    /**
     * @return The minimum number of vCPUs. To specify no minimum limit, specify `0`.
     * 
     */
    public Optional<Output<Double>> min() {
        return Optional.ofNullable(this.min);
    }

    private FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs() {}

    private FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs(FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs $;

        public Builder() {
            $ = new FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs();
        }

        public Builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs defaults) {
            $ = new FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<Double> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
         * 
         * @return builder
         * 
         */
        public Builder max(Double max) {
            return max(Output.of(max));
        }

        /**
         * @param min The minimum number of vCPUs. To specify no minimum limit, specify `0`.
         * 
         * @return builder
         * 
         */
        public Builder min(@Nullable Output<Double> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min The minimum number of vCPUs. To specify no minimum limit, specify `0`.
         * 
         * @return builder
         * 
         */
        public Builder min(Double min) {
            return min(Output.of(min));
        }

        public FleetLaunchTemplateConfigOverrideInstanceRequirementsMemoryGibPerVcpuArgs build() {
            return $;
        }
    }

}
