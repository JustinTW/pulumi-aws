// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.inputs;

import com.pulumi.aws.codepipeline.inputs.CustomActionTypeConfigurationPropertyArgs;
import com.pulumi.aws.codepipeline.inputs.CustomActionTypeInputArtifactDetailsArgs;
import com.pulumi.aws.codepipeline.inputs.CustomActionTypeOutputArtifactDetailsArgs;
import com.pulumi.aws.codepipeline.inputs.CustomActionTypeSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomActionTypeState extends com.pulumi.resources.ResourceArgs {

    public static final CustomActionTypeState Empty = new CustomActionTypeState();

    /**
     * The action ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The action ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The configuration properties for the custom action. Max 10 items.
     * 
     */
    @Import(name="configurationProperties")
    private @Nullable Output<List<CustomActionTypeConfigurationPropertyArgs>> configurationProperties;

    /**
     * @return The configuration properties for the custom action. Max 10 items.
     * 
     */
    public Optional<Output<List<CustomActionTypeConfigurationPropertyArgs>>> configurationProperties() {
        return Optional.ofNullable(this.configurationProperties);
    }

    /**
     * The details of the input artifact for the action.
     * 
     */
    @Import(name="inputArtifactDetails")
    private @Nullable Output<CustomActionTypeInputArtifactDetailsArgs> inputArtifactDetails;

    /**
     * @return The details of the input artifact for the action.
     * 
     */
    public Optional<Output<CustomActionTypeInputArtifactDetailsArgs>> inputArtifactDetails() {
        return Optional.ofNullable(this.inputArtifactDetails);
    }

    /**
     * The details of the output artifact of the action.
     * 
     */
    @Import(name="outputArtifactDetails")
    private @Nullable Output<CustomActionTypeOutputArtifactDetailsArgs> outputArtifactDetails;

    /**
     * @return The details of the output artifact of the action.
     * 
     */
    public Optional<Output<CustomActionTypeOutputArtifactDetailsArgs>> outputArtifactDetails() {
        return Optional.ofNullable(this.outputArtifactDetails);
    }

    /**
     * The creator of the action being called.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return The creator of the action being called.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The provider of the service used in the custom action
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return The provider of the service used in the custom action
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    /**
     * The settings for an action type.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<CustomActionTypeSettingsArgs> settings;

    /**
     * @return The settings for an action type.
     * 
     */
    public Optional<Output<CustomActionTypeSettingsArgs>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The version identifier of the custom action.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version identifier of the custom action.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private CustomActionTypeState() {}

    private CustomActionTypeState(CustomActionTypeState $) {
        this.arn = $.arn;
        this.category = $.category;
        this.configurationProperties = $.configurationProperties;
        this.inputArtifactDetails = $.inputArtifactDetails;
        this.outputArtifactDetails = $.outputArtifactDetails;
        this.owner = $.owner;
        this.providerName = $.providerName;
        this.settings = $.settings;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomActionTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomActionTypeState $;

        public Builder() {
            $ = new CustomActionTypeState();
        }

        public Builder(CustomActionTypeState defaults) {
            $ = new CustomActionTypeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The action ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The action ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param category The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param configurationProperties The configuration properties for the custom action. Max 10 items.
         * 
         * @return builder
         * 
         */
        public Builder configurationProperties(@Nullable Output<List<CustomActionTypeConfigurationPropertyArgs>> configurationProperties) {
            $.configurationProperties = configurationProperties;
            return this;
        }

        /**
         * @param configurationProperties The configuration properties for the custom action. Max 10 items.
         * 
         * @return builder
         * 
         */
        public Builder configurationProperties(List<CustomActionTypeConfigurationPropertyArgs> configurationProperties) {
            return configurationProperties(Output.of(configurationProperties));
        }

        /**
         * @param configurationProperties The configuration properties for the custom action. Max 10 items.
         * 
         * @return builder
         * 
         */
        public Builder configurationProperties(CustomActionTypeConfigurationPropertyArgs... configurationProperties) {
            return configurationProperties(List.of(configurationProperties));
        }

        /**
         * @param inputArtifactDetails The details of the input artifact for the action.
         * 
         * @return builder
         * 
         */
        public Builder inputArtifactDetails(@Nullable Output<CustomActionTypeInputArtifactDetailsArgs> inputArtifactDetails) {
            $.inputArtifactDetails = inputArtifactDetails;
            return this;
        }

        /**
         * @param inputArtifactDetails The details of the input artifact for the action.
         * 
         * @return builder
         * 
         */
        public Builder inputArtifactDetails(CustomActionTypeInputArtifactDetailsArgs inputArtifactDetails) {
            return inputArtifactDetails(Output.of(inputArtifactDetails));
        }

        /**
         * @param outputArtifactDetails The details of the output artifact of the action.
         * 
         * @return builder
         * 
         */
        public Builder outputArtifactDetails(@Nullable Output<CustomActionTypeOutputArtifactDetailsArgs> outputArtifactDetails) {
            $.outputArtifactDetails = outputArtifactDetails;
            return this;
        }

        /**
         * @param outputArtifactDetails The details of the output artifact of the action.
         * 
         * @return builder
         * 
         */
        public Builder outputArtifactDetails(CustomActionTypeOutputArtifactDetailsArgs outputArtifactDetails) {
            return outputArtifactDetails(Output.of(outputArtifactDetails));
        }

        /**
         * @param owner The creator of the action being called.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner The creator of the action being called.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param providerName The provider of the service used in the custom action
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName The provider of the service used in the custom action
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param settings The settings for an action type.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<CustomActionTypeSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings The settings for an action type.
         * 
         * @return builder
         * 
         */
        public Builder settings(CustomActionTypeSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param tags Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param version The version identifier of the custom action.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version identifier of the custom action.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public CustomActionTypeState build() {
            return $;
        }
    }

}
