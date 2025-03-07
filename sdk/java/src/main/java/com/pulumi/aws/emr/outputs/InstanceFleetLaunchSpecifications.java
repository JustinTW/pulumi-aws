// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.outputs;

import com.pulumi.aws.emr.outputs.InstanceFleetLaunchSpecificationsOnDemandSpecification;
import com.pulumi.aws.emr.outputs.InstanceFleetLaunchSpecificationsSpotSpecification;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFleetLaunchSpecifications {
    /**
     * @return Configuration block for on demand instances launch specifications
     * 
     */
    private @Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications;
    /**
     * @return Configuration block for spot instances launch specifications
     * 
     */
    private @Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications;

    private InstanceFleetLaunchSpecifications() {}
    /**
     * @return Configuration block for on demand instances launch specifications
     * 
     */
    public List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications() {
        return this.onDemandSpecifications == null ? List.of() : this.onDemandSpecifications;
    }
    /**
     * @return Configuration block for spot instances launch specifications
     * 
     */
    public List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications() {
        return this.spotSpecifications == null ? List.of() : this.spotSpecifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecifications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications;
        private @Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications;
        public Builder() {}
        public Builder(InstanceFleetLaunchSpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        @CustomType.Setter
        public Builder onDemandSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }
        public Builder onDemandSpecifications(InstanceFleetLaunchSpecificationsOnDemandSpecification... onDemandSpecifications) {
            return onDemandSpecifications(List.of(onDemandSpecifications));
        }
        @CustomType.Setter
        public Builder spotSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }
        public Builder spotSpecifications(InstanceFleetLaunchSpecificationsSpotSpecification... spotSpecifications) {
            return spotSpecifications(List.of(spotSpecifications));
        }
        public InstanceFleetLaunchSpecifications build() {
            final var o = new InstanceFleetLaunchSpecifications();
            o.onDemandSpecifications = onDemandSpecifications;
            o.spotSpecifications = spotSpecifications;
            return o;
        }
    }
}
