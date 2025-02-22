// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.aws.ecr.outputs.GetRepositoryEncryptionConfiguration;
import com.pulumi.aws.ecr.outputs.GetRepositoryImageScanningConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepositoryResult {
    /**
     * @return Full ARN of the repository.
     * 
     */
    private String arn;
    /**
     * @return Encryption configuration for the repository. See Encryption Configuration below.
     * 
     */
    private List<GetRepositoryEncryptionConfiguration> encryptionConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Configuration block that defines image scanning configuration for the repository. See Image Scanning Configuration below.
     * 
     */
    private List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations;
    /**
     * @return The tag mutability setting for the repository.
     * 
     */
    private String imageTagMutability;
    /**
     * @return List of image tags associated with the most recently pushed image in the repository.
     * 
     */
    private List<String> mostRecentImageTags;
    private String name;
    private String registryId;
    /**
     * @return URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
     * 
     */
    private String repositoryUrl;
    /**
     * @return Map of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;

    private GetRepositoryResult() {}
    /**
     * @return Full ARN of the repository.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Encryption configuration for the repository. See Encryption Configuration below.
     * 
     */
    public List<GetRepositoryEncryptionConfiguration> encryptionConfigurations() {
        return this.encryptionConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Configuration block that defines image scanning configuration for the repository. See Image Scanning Configuration below.
     * 
     */
    public List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations() {
        return this.imageScanningConfigurations;
    }
    /**
     * @return The tag mutability setting for the repository.
     * 
     */
    public String imageTagMutability() {
        return this.imageTagMutability;
    }
    /**
     * @return List of image tags associated with the most recently pushed image in the repository.
     * 
     */
    public List<String> mostRecentImageTags() {
        return this.mostRecentImageTags;
    }
    public String name() {
        return this.name;
    }
    public String registryId() {
        return this.registryId;
    }
    /**
     * @return URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
     * 
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * @return Map of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private List<GetRepositoryEncryptionConfiguration> encryptionConfigurations;
        private String id;
        private List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations;
        private String imageTagMutability;
        private List<String> mostRecentImageTags;
        private String name;
        private String registryId;
        private String repositoryUrl;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.encryptionConfigurations = defaults.encryptionConfigurations;
    	      this.id = defaults.id;
    	      this.imageScanningConfigurations = defaults.imageScanningConfigurations;
    	      this.imageTagMutability = defaults.imageTagMutability;
    	      this.mostRecentImageTags = defaults.mostRecentImageTags;
    	      this.name = defaults.name;
    	      this.registryId = defaults.registryId;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder encryptionConfigurations(List<GetRepositoryEncryptionConfiguration> encryptionConfigurations) {
            this.encryptionConfigurations = Objects.requireNonNull(encryptionConfigurations);
            return this;
        }
        public Builder encryptionConfigurations(GetRepositoryEncryptionConfiguration... encryptionConfigurations) {
            return encryptionConfigurations(List.of(encryptionConfigurations));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder imageScanningConfigurations(List<GetRepositoryImageScanningConfiguration> imageScanningConfigurations) {
            this.imageScanningConfigurations = Objects.requireNonNull(imageScanningConfigurations);
            return this;
        }
        public Builder imageScanningConfigurations(GetRepositoryImageScanningConfiguration... imageScanningConfigurations) {
            return imageScanningConfigurations(List.of(imageScanningConfigurations));
        }
        @CustomType.Setter
        public Builder imageTagMutability(String imageTagMutability) {
            this.imageTagMutability = Objects.requireNonNull(imageTagMutability);
            return this;
        }
        @CustomType.Setter
        public Builder mostRecentImageTags(List<String> mostRecentImageTags) {
            this.mostRecentImageTags = Objects.requireNonNull(mostRecentImageTags);
            return this;
        }
        public Builder mostRecentImageTags(String... mostRecentImageTags) {
            return mostRecentImageTags(List.of(mostRecentImageTags));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        @CustomType.Setter
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetRepositoryResult build() {
            final var o = new GetRepositoryResult();
            o.arn = arn;
            o.encryptionConfigurations = encryptionConfigurations;
            o.id = id;
            o.imageScanningConfigurations = imageScanningConfigurations;
            o.imageTagMutability = imageTagMutability;
            o.mostRecentImageTags = mostRecentImageTags;
            o.name = name;
            o.registryId = registryId;
            o.repositoryUrl = repositoryUrl;
            o.tags = tags;
            return o;
        }
    }
}
