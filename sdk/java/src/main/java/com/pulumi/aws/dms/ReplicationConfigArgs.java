// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms;

import com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigArgs Empty = new ReplicationConfigArgs();

    /**
     * Configuration block for provisioning an DMS Serverless replication.
     * 
     */
    @Import(name="computeConfig", required=true)
    private Output<ReplicationConfigComputeConfigArgs> computeConfig;

    /**
     * @return Configuration block for provisioning an DMS Serverless replication.
     * 
     */
    public Output<ReplicationConfigComputeConfigArgs> computeConfig() {
        return this.computeConfig;
    }

    /**
     * Unique identifier that you want to use to create the config.
     * 
     */
    @Import(name="replicationConfigIdentifier", required=true)
    private Output<String> replicationConfigIdentifier;

    /**
     * @return Unique identifier that you want to use to create the config.
     * 
     */
    public Output<String> replicationConfigIdentifier() {
        return this.replicationConfigIdentifier;
    }

    /**
     * An escaped JSON string that are used to provision this replication configuration. For example, [Change processing tuning settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * 
     */
    @Import(name="replicationSettings")
    private @Nullable Output<String> replicationSettings;

    /**
     * @return An escaped JSON string that are used to provision this replication configuration. For example, [Change processing tuning settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
     * 
     */
    public Optional<Output<String>> replicationSettings() {
        return Optional.ofNullable(this.replicationSettings);
    }

    /**
     * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
     * 
     */
    @Import(name="replicationType", required=true)
    private Output<String> replicationType;

    /**
     * @return The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
     * 
     */
    public Output<String> replicationType() {
        return this.replicationType;
    }

    /**
     * Unique value or name that you set for a given resource that can be used to construct an Amazon Resource Name (ARN) for that resource. For more information, see [Fine-grained access control using resource names and tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * 
     */
    @Import(name="resourceIdentifier")
    private @Nullable Output<String> resourceIdentifier;

    /**
     * @return Unique value or name that you set for a given resource that can be used to construct an Amazon Resource Name (ARN) for that resource. For more information, see [Fine-grained access control using resource names and tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
     * 
     */
    public Optional<Output<String>> resourceIdentifier() {
        return Optional.ofNullable(this.resourceIdentifier);
    }

    /**
     * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
     * 
     */
    @Import(name="sourceEndpointArn", required=true)
    private Output<String> sourceEndpointArn;

    /**
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
     * 
     */
    public Output<String> sourceEndpointArn() {
        return this.sourceEndpointArn;
    }

    /**
     * Whether to run or stop the serverless replication, default is false.
     * 
     */
    @Import(name="startReplication")
    private @Nullable Output<Boolean> startReplication;

    /**
     * @return Whether to run or stop the serverless replication, default is false.
     * 
     */
    public Optional<Output<Boolean>> startReplication() {
        return Optional.ofNullable(this.startReplication);
    }

    /**
     * JSON settings for specifying supplemental data. For more information see [Specifying supplemental data for task settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
     * 
     */
    @Import(name="supplementalSettings")
    private @Nullable Output<String> supplementalSettings;

    /**
     * @return JSON settings for specifying supplemental data. For more information see [Specifying supplemental data for task settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
     * 
     */
    public Optional<Output<String>> supplementalSettings() {
        return Optional.ofNullable(this.supplementalSettings);
    }

    /**
     * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * 
     */
    @Import(name="tableMappings", required=true)
    private Output<String> tableMappings;

    /**
     * @return An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * 
     */
    public Output<String> tableMappings() {
        return this.tableMappings;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
     * 
     */
    @Import(name="targetEndpointArn", required=true)
    private Output<String> targetEndpointArn;

    /**
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
     * 
     */
    public Output<String> targetEndpointArn() {
        return this.targetEndpointArn;
    }

    private ReplicationConfigArgs() {}

    private ReplicationConfigArgs(ReplicationConfigArgs $) {
        this.computeConfig = $.computeConfig;
        this.replicationConfigIdentifier = $.replicationConfigIdentifier;
        this.replicationSettings = $.replicationSettings;
        this.replicationType = $.replicationType;
        this.resourceIdentifier = $.resourceIdentifier;
        this.sourceEndpointArn = $.sourceEndpointArn;
        this.startReplication = $.startReplication;
        this.supplementalSettings = $.supplementalSettings;
        this.tableMappings = $.tableMappings;
        this.tags = $.tags;
        this.targetEndpointArn = $.targetEndpointArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigArgs $;

        public Builder() {
            $ = new ReplicationConfigArgs();
        }

        public Builder(ReplicationConfigArgs defaults) {
            $ = new ReplicationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeConfig Configuration block for provisioning an DMS Serverless replication.
         * 
         * @return builder
         * 
         */
        public Builder computeConfig(Output<ReplicationConfigComputeConfigArgs> computeConfig) {
            $.computeConfig = computeConfig;
            return this;
        }

        /**
         * @param computeConfig Configuration block for provisioning an DMS Serverless replication.
         * 
         * @return builder
         * 
         */
        public Builder computeConfig(ReplicationConfigComputeConfigArgs computeConfig) {
            return computeConfig(Output.of(computeConfig));
        }

        /**
         * @param replicationConfigIdentifier Unique identifier that you want to use to create the config.
         * 
         * @return builder
         * 
         */
        public Builder replicationConfigIdentifier(Output<String> replicationConfigIdentifier) {
            $.replicationConfigIdentifier = replicationConfigIdentifier;
            return this;
        }

        /**
         * @param replicationConfigIdentifier Unique identifier that you want to use to create the config.
         * 
         * @return builder
         * 
         */
        public Builder replicationConfigIdentifier(String replicationConfigIdentifier) {
            return replicationConfigIdentifier(Output.of(replicationConfigIdentifier));
        }

        /**
         * @param replicationSettings An escaped JSON string that are used to provision this replication configuration. For example, [Change processing tuning settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
         * 
         * @return builder
         * 
         */
        public Builder replicationSettings(@Nullable Output<String> replicationSettings) {
            $.replicationSettings = replicationSettings;
            return this;
        }

        /**
         * @param replicationSettings An escaped JSON string that are used to provision this replication configuration. For example, [Change processing tuning settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.ChangeProcessingTuning.html)
         * 
         * @return builder
         * 
         */
        public Builder replicationSettings(String replicationSettings) {
            return replicationSettings(Output.of(replicationSettings));
        }

        /**
         * @param replicationType The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(Output<String> replicationType) {
            $.replicationType = replicationType;
            return this;
        }

        /**
         * @param replicationType The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(String replicationType) {
            return replicationType(Output.of(replicationType));
        }

        /**
         * @param resourceIdentifier Unique value or name that you set for a given resource that can be used to construct an Amazon Resource Name (ARN) for that resource. For more information, see [Fine-grained access control using resource names and tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
         * 
         * @return builder
         * 
         */
        public Builder resourceIdentifier(@Nullable Output<String> resourceIdentifier) {
            $.resourceIdentifier = resourceIdentifier;
            return this;
        }

        /**
         * @param resourceIdentifier Unique value or name that you set for a given resource that can be used to construct an Amazon Resource Name (ARN) for that resource. For more information, see [Fine-grained access control using resource names and tags](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.FineGrainedAccess)
         * 
         * @return builder
         * 
         */
        public Builder resourceIdentifier(String resourceIdentifier) {
            return resourceIdentifier(Output.of(resourceIdentifier));
        }

        /**
         * @param sourceEndpointArn The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
         * 
         * @return builder
         * 
         */
        public Builder sourceEndpointArn(Output<String> sourceEndpointArn) {
            $.sourceEndpointArn = sourceEndpointArn;
            return this;
        }

        /**
         * @param sourceEndpointArn The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
         * 
         * @return builder
         * 
         */
        public Builder sourceEndpointArn(String sourceEndpointArn) {
            return sourceEndpointArn(Output.of(sourceEndpointArn));
        }

        /**
         * @param startReplication Whether to run or stop the serverless replication, default is false.
         * 
         * @return builder
         * 
         */
        public Builder startReplication(@Nullable Output<Boolean> startReplication) {
            $.startReplication = startReplication;
            return this;
        }

        /**
         * @param startReplication Whether to run or stop the serverless replication, default is false.
         * 
         * @return builder
         * 
         */
        public Builder startReplication(Boolean startReplication) {
            return startReplication(Output.of(startReplication));
        }

        /**
         * @param supplementalSettings JSON settings for specifying supplemental data. For more information see [Specifying supplemental data for task settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
         * 
         * @return builder
         * 
         */
        public Builder supplementalSettings(@Nullable Output<String> supplementalSettings) {
            $.supplementalSettings = supplementalSettings;
            return this;
        }

        /**
         * @param supplementalSettings JSON settings for specifying supplemental data. For more information see [Specifying supplemental data for task settings](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.TaskData.html)
         * 
         * @return builder
         * 
         */
        public Builder supplementalSettings(String supplementalSettings) {
            return supplementalSettings(Output.of(supplementalSettings));
        }

        /**
         * @param tableMappings An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
         * 
         * @return builder
         * 
         */
        public Builder tableMappings(Output<String> tableMappings) {
            $.tableMappings = tableMappings;
            return this;
        }

        /**
         * @param tableMappings An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
         * 
         * @return builder
         * 
         */
        public Builder tableMappings(String tableMappings) {
            return tableMappings(Output.of(tableMappings));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetEndpointArn The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
         * 
         * @return builder
         * 
         */
        public Builder targetEndpointArn(Output<String> targetEndpointArn) {
            $.targetEndpointArn = targetEndpointArn;
            return this;
        }

        /**
         * @param targetEndpointArn The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
         * 
         * @return builder
         * 
         */
        public Builder targetEndpointArn(String targetEndpointArn) {
            return targetEndpointArn(Output.of(targetEndpointArn));
        }

        public ReplicationConfigArgs build() {
            $.computeConfig = Objects.requireNonNull($.computeConfig, "expected parameter 'computeConfig' to be non-null");
            $.replicationConfigIdentifier = Objects.requireNonNull($.replicationConfigIdentifier, "expected parameter 'replicationConfigIdentifier' to be non-null");
            $.replicationType = Objects.requireNonNull($.replicationType, "expected parameter 'replicationType' to be non-null");
            $.sourceEndpointArn = Objects.requireNonNull($.sourceEndpointArn, "expected parameter 'sourceEndpointArn' to be non-null");
            $.tableMappings = Objects.requireNonNull($.tableMappings, "expected parameter 'tableMappings' to be non-null");
            $.targetEndpointArn = Objects.requireNonNull($.targetEndpointArn, "expected parameter 'targetEndpointArn' to be non-null");
            return $;
        }
    }

}
