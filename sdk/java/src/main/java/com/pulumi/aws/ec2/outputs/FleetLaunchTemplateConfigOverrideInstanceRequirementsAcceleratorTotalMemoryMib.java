// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMib {
    /**
     * @return The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
     * 
     */
    private @Nullable Integer max;
    /**
     * @return The minimum number of vCPUs. To specify no minimum limit, specify `0`.
     * 
     */
    private @Nullable Integer min;

    private FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMib() {}
    /**
     * @return The maximum number of vCPUs. To specify no maximum limit, omit this parameter.
     * 
     */
    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    /**
     * @return The minimum number of vCPUs. To specify no minimum limit, specify `0`.
     * 
     */
    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMib defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;
        public Builder() {}
        public Builder(FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMib defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        @CustomType.Setter
        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        public FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMib build() {
            final var o = new FleetLaunchTemplateConfigOverrideInstanceRequirementsAcceleratorTotalMemoryMib();
            o.max = max;
            o.min = min;
            return o;
        }
    }
}
