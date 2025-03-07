// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class CustomActionTypeInputArtifactDetails {
    /**
     * @return The maximum number of artifacts allowed for the action type. Min: 0, Max: 5
     * 
     */
    private Integer maximumCount;
    /**
     * @return The minimum number of artifacts allowed for the action type. Min: 0, Max: 5
     * 
     */
    private Integer minimumCount;

    private CustomActionTypeInputArtifactDetails() {}
    /**
     * @return The maximum number of artifacts allowed for the action type. Min: 0, Max: 5
     * 
     */
    public Integer maximumCount() {
        return this.maximumCount;
    }
    /**
     * @return The minimum number of artifacts allowed for the action type. Min: 0, Max: 5
     * 
     */
    public Integer minimumCount() {
        return this.minimumCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomActionTypeInputArtifactDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maximumCount;
        private Integer minimumCount;
        public Builder() {}
        public Builder(CustomActionTypeInputArtifactDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCount = defaults.maximumCount;
    	      this.minimumCount = defaults.minimumCount;
        }

        @CustomType.Setter
        public Builder maximumCount(Integer maximumCount) {
            this.maximumCount = Objects.requireNonNull(maximumCount);
            return this;
        }
        @CustomType.Setter
        public Builder minimumCount(Integer minimumCount) {
            this.minimumCount = Objects.requireNonNull(minimumCount);
            return this;
        }
        public CustomActionTypeInputArtifactDetails build() {
            final var o = new CustomActionTypeInputArtifactDetails();
            o.maximumCount = maximumCount;
            o.minimumCount = minimumCount;
            return o;
        }
    }
}
