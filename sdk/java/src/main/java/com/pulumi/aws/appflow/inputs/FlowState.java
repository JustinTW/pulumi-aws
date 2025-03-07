// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigArgs;
import com.pulumi.aws.appflow.inputs.FlowSourceFlowConfigArgs;
import com.pulumi.aws.appflow.inputs.FlowTaskArgs;
import com.pulumi.aws.appflow.inputs.FlowTriggerConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowState extends com.pulumi.resources.ResourceArgs {

    public static final FlowState Empty = new FlowState();

    /**
     * Flow&#39;s ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Flow&#39;s ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Description of the flow you want to create.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the flow you want to create.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * 
     */
    @Import(name="destinationFlowConfigs")
    private @Nullable Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigs;

    /**
     * @return A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * 
     */
    public Optional<Output<List<FlowDestinationFlowConfigArgs>>> destinationFlowConfigs() {
        return Optional.ofNullable(this.destinationFlowConfigs);
    }

    /**
     * ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * 
     */
    @Import(name="kmsArn")
    private @Nullable Output<String> kmsArn;

    /**
     * @return ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * 
     */
    public Optional<Output<String>> kmsArn() {
        return Optional.ofNullable(this.kmsArn);
    }

    /**
     * Name of the flow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the flow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * 
     */
    @Import(name="sourceFlowConfig")
    private @Nullable Output<FlowSourceFlowConfigArgs> sourceFlowConfig;

    /**
     * @return The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * 
     */
    public Optional<Output<FlowSourceFlowConfigArgs>> sourceFlowConfig() {
        return Optional.ofNullable(this.sourceFlowConfig);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
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
     * A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * 
     */
    @Import(name="tasks")
    private @Nullable Output<List<FlowTaskArgs>> tasks;

    /**
     * @return A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * 
     */
    public Optional<Output<List<FlowTaskArgs>>> tasks() {
        return Optional.ofNullable(this.tasks);
    }

    /**
     * A Trigger that determine how and when the flow runs.
     * 
     */
    @Import(name="triggerConfig")
    private @Nullable Output<FlowTriggerConfigArgs> triggerConfig;

    /**
     * @return A Trigger that determine how and when the flow runs.
     * 
     */
    public Optional<Output<FlowTriggerConfigArgs>> triggerConfig() {
        return Optional.ofNullable(this.triggerConfig);
    }

    private FlowState() {}

    private FlowState(FlowState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.destinationFlowConfigs = $.destinationFlowConfigs;
        this.kmsArn = $.kmsArn;
        this.name = $.name;
        this.sourceFlowConfig = $.sourceFlowConfig;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.tasks = $.tasks;
        this.triggerConfig = $.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowState $;

        public Builder() {
            $ = new FlowState();
        }

        public Builder(FlowState defaults) {
            $ = new FlowState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Flow&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Flow&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description Description of the flow you want to create.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the flow you want to create.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationFlowConfigs A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
         * 
         * @return builder
         * 
         */
        public Builder destinationFlowConfigs(@Nullable Output<List<FlowDestinationFlowConfigArgs>> destinationFlowConfigs) {
            $.destinationFlowConfigs = destinationFlowConfigs;
            return this;
        }

        /**
         * @param destinationFlowConfigs A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
         * 
         * @return builder
         * 
         */
        public Builder destinationFlowConfigs(List<FlowDestinationFlowConfigArgs> destinationFlowConfigs) {
            return destinationFlowConfigs(Output.of(destinationFlowConfigs));
        }

        /**
         * @param destinationFlowConfigs A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
         * 
         * @return builder
         * 
         */
        public Builder destinationFlowConfigs(FlowDestinationFlowConfigArgs... destinationFlowConfigs) {
            return destinationFlowConfigs(List.of(destinationFlowConfigs));
        }

        /**
         * @param kmsArn ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
         * 
         * @return builder
         * 
         */
        public Builder kmsArn(@Nullable Output<String> kmsArn) {
            $.kmsArn = kmsArn;
            return this;
        }

        /**
         * @param kmsArn ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
         * 
         * @return builder
         * 
         */
        public Builder kmsArn(String kmsArn) {
            return kmsArn(Output.of(kmsArn));
        }

        /**
         * @param name Name of the flow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the flow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceFlowConfig The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
         * 
         * @return builder
         * 
         */
        public Builder sourceFlowConfig(@Nullable Output<FlowSourceFlowConfigArgs> sourceFlowConfig) {
            $.sourceFlowConfig = sourceFlowConfig;
            return this;
        }

        /**
         * @param sourceFlowConfig The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
         * 
         * @return builder
         * 
         */
        public Builder sourceFlowConfig(FlowSourceFlowConfigArgs sourceFlowConfig) {
            return sourceFlowConfig(Output.of(sourceFlowConfig));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
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
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
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
         * @param tasks A Task that Amazon AppFlow performs while transferring the data in the flow run.
         * 
         * @return builder
         * 
         */
        public Builder tasks(@Nullable Output<List<FlowTaskArgs>> tasks) {
            $.tasks = tasks;
            return this;
        }

        /**
         * @param tasks A Task that Amazon AppFlow performs while transferring the data in the flow run.
         * 
         * @return builder
         * 
         */
        public Builder tasks(List<FlowTaskArgs> tasks) {
            return tasks(Output.of(tasks));
        }

        /**
         * @param tasks A Task that Amazon AppFlow performs while transferring the data in the flow run.
         * 
         * @return builder
         * 
         */
        public Builder tasks(FlowTaskArgs... tasks) {
            return tasks(List.of(tasks));
        }

        /**
         * @param triggerConfig A Trigger that determine how and when the flow runs.
         * 
         * @return builder
         * 
         */
        public Builder triggerConfig(@Nullable Output<FlowTriggerConfigArgs> triggerConfig) {
            $.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * @param triggerConfig A Trigger that determine how and when the flow runs.
         * 
         * @return builder
         * 
         */
        public Builder triggerConfig(FlowTriggerConfigArgs triggerConfig) {
            return triggerConfig(Output.of(triggerConfig));
        }

        public FlowState build() {
            return $;
        }
    }

}
