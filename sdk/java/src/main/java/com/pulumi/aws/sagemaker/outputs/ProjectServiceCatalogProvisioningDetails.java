// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.ProjectServiceCatalogProvisioningDetailsProvisioningParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectServiceCatalogProvisioningDetails {
    /**
     * @return The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    private @Nullable String pathId;
    /**
     * @return The ID of the product to provision.
     * 
     */
    private String productId;
    /**
     * @return The ID of the provisioning artifact.
     * 
     */
    private @Nullable String provisioningArtifactId;
    /**
     * @return A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    private @Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters;

    private ProjectServiceCatalogProvisioningDetails() {}
    /**
     * @return The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path.
     * 
     */
    public Optional<String> pathId() {
        return Optional.ofNullable(this.pathId);
    }
    /**
     * @return The ID of the product to provision.
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return The ID of the provisioning artifact.
     * 
     */
    public Optional<String> provisioningArtifactId() {
        return Optional.ofNullable(this.provisioningArtifactId);
    }
    /**
     * @return A list of key value pairs that you specify when you provision a product. See Provisioning Parameter below.
     * 
     */
    public List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters() {
        return this.provisioningParameters == null ? List.of() : this.provisioningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectServiceCatalogProvisioningDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pathId;
        private String productId;
        private @Nullable String provisioningArtifactId;
        private @Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters;
        public Builder() {}
        public Builder(ProjectServiceCatalogProvisioningDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathId = defaults.pathId;
    	      this.productId = defaults.productId;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningParameters = defaults.provisioningParameters;
        }

        @CustomType.Setter
        public Builder pathId(@Nullable String pathId) {
            this.pathId = pathId;
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }
        @CustomType.Setter
        public Builder provisioningParameters(@Nullable List<ProjectServiceCatalogProvisioningDetailsProvisioningParameter> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }
        public Builder provisioningParameters(ProjectServiceCatalogProvisioningDetailsProvisioningParameter... provisioningParameters) {
            return provisioningParameters(List.of(provisioningParameters));
        }
        public ProjectServiceCatalogProvisioningDetails build() {
            final var o = new ProjectServiceCatalogProvisioningDetails();
            o.pathId = pathId;
            o.productId = productId;
            o.provisioningArtifactId = provisioningArtifactId;
            o.provisioningParameters = provisioningParameters;
            return o;
        }
    }
}
