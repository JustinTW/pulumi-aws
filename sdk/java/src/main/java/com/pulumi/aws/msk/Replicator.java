// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.msk.ReplicatorArgs;
import com.pulumi.aws.msk.inputs.ReplicatorState;
import com.pulumi.aws.msk.outputs.ReplicatorKafkaCluster;
import com.pulumi.aws.msk.outputs.ReplicatorReplicationInfoList;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Managed Streaming for Kafka Replicator.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Using `pulumi import`, import MSK replicators using the replicator ARN. For example:
 * 
 * ```sh
 *  $ pulumi import aws:msk/replicator:Replicator example arn:aws:kafka:us-west-2:123456789012:configuration/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/replicator:Replicator")
public class Replicator extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Replicator. Do not begin the description with &#34;An&#34;, &#34;The&#34;, &#34;Defines&#34;, &#34;Indicates&#34;, or &#34;Specifies,&#34; as these are verbose. In other words, &#34;Indicates the amount of storage,&#34; can be rewritten as &#34;Amount of storage,&#34; without losing any information.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Replicator. Do not begin the description with &#34;An&#34;, &#34;The&#34;, &#34;Defines&#34;, &#34;Indicates&#34;, or &#34;Specifies,&#34; as these are verbose. In other words, &#34;Indicates the amount of storage,&#34; can be rewritten as &#34;Amount of storage,&#34; without losing any information.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="currentVersion", refs={String.class}, tree="[0]")
    private Output<String> currentVersion;

    public Output<String> currentVersion() {
        return this.currentVersion;
    }
    /**
     * A summary description of the replicator.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A summary description of the replicator.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A list of Kafka clusters which are targets of the replicator.
     * 
     */
    @Export(name="kafkaClusters", refs={List.class,ReplicatorKafkaCluster.class}, tree="[0,1]")
    private Output<List<ReplicatorKafkaCluster>> kafkaClusters;

    /**
     * @return A list of Kafka clusters which are targets of the replicator.
     * 
     */
    public Output<List<ReplicatorKafkaCluster>> kafkaClusters() {
        return this.kafkaClusters;
    }
    /**
     * A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
     * 
     */
    @Export(name="replicationInfoList", refs={ReplicatorReplicationInfoList.class}, tree="[0]")
    private Output<ReplicatorReplicationInfoList> replicationInfoList;

    /**
     * @return A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
     * 
     */
    public Output<ReplicatorReplicationInfoList> replicationInfoList() {
        return this.replicationInfoList;
    }
    /**
     * The name of the replicator.
     * 
     */
    @Export(name="replicatorName", refs={String.class}, tree="[0]")
    private Output<String> replicatorName;

    /**
     * @return The name of the replicator.
     * 
     */
    public Output<String> replicatorName() {
        return this.replicatorName;
    }
    /**
     * The ARN of the IAM role used by the replicator to access resources in the customer&#39;s account (e.g source and target clusters).
     * 
     */
    @Export(name="serviceExecutionRoleArn", refs={String.class}, tree="[0]")
    private Output<String> serviceExecutionRoleArn;

    /**
     * @return The ARN of the IAM role used by the replicator to access resources in the customer&#39;s account (e.g source and target clusters).
     * 
     */
    public Output<String> serviceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Replicator(String name) {
        this(name, ReplicatorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Replicator(String name, ReplicatorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Replicator(String name, ReplicatorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/replicator:Replicator", name, args == null ? ReplicatorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Replicator(String name, Output<String> id, @Nullable ReplicatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/replicator:Replicator", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "tagsAll"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Replicator get(String name, Output<String> id, @Nullable ReplicatorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Replicator(name, id, state, options);
    }
}
