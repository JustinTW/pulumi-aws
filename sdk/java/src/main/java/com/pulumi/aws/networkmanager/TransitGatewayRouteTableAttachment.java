// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachmentArgs;
import com.pulumi.aws.networkmanager.inputs.TransitGatewayRouteTableAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a transit gateway route table attachment.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachment;
 * import com.pulumi.aws.networkmanager.TransitGatewayRouteTableAttachmentArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new TransitGatewayRouteTableAttachment(&#34;example&#34;, TransitGatewayRouteTableAttachmentArgs.builder()        
 *             .peeringId(aws_networkmanager_transit_gateway_peering.example().id())
 *             .transitGatewayRouteTableArn(aws_ec2_transit_gateway_route_table.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_networkmanager_transit_gateway_route_table_attachment` using the attachment ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment example attachment-0f8fa60d2238d1bd8
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment")
public class TransitGatewayRouteTableAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Attachment Amazon Resource Name (ARN).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Attachment Amazon Resource Name (ARN).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The policy rule number associated with the attachment.
     * 
     */
    @Export(name="attachmentPolicyRuleNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> attachmentPolicyRuleNumber;

    /**
     * @return The policy rule number associated with the attachment.
     * 
     */
    public Output<Integer> attachmentPolicyRuleNumber() {
        return this.attachmentPolicyRuleNumber;
    }
    /**
     * The type of attachment.
     * 
     */
    @Export(name="attachmentType", refs={String.class}, tree="[0]")
    private Output<String> attachmentType;

    /**
     * @return The type of attachment.
     * 
     */
    public Output<String> attachmentType() {
        return this.attachmentType;
    }
    /**
     * The ARN of the core network.
     * 
     */
    @Export(name="coreNetworkArn", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkArn;

    /**
     * @return The ARN of the core network.
     * 
     */
    public Output<String> coreNetworkArn() {
        return this.coreNetworkArn;
    }
    /**
     * The ID of the core network.
     * 
     */
    @Export(name="coreNetworkId", refs={String.class}, tree="[0]")
    private Output<String> coreNetworkId;

    /**
     * @return The ID of the core network.
     * 
     */
    public Output<String> coreNetworkId() {
        return this.coreNetworkId;
    }
    /**
     * The edge location for the peer.
     * 
     */
    @Export(name="edgeLocation", refs={String.class}, tree="[0]")
    private Output<String> edgeLocation;

    /**
     * @return The edge location for the peer.
     * 
     */
    public Output<String> edgeLocation() {
        return this.edgeLocation;
    }
    /**
     * The ID of the attachment account owner.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return The ID of the attachment account owner.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The ID of the peer for the attachment.
     * 
     */
    @Export(name="peeringId", refs={String.class}, tree="[0]")
    private Output<String> peeringId;

    /**
     * @return The ID of the peer for the attachment.
     * 
     */
    public Output<String> peeringId() {
        return this.peeringId;
    }
    /**
     * The attachment resource ARN.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The attachment resource ARN.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The name of the segment attachment.
     * 
     */
    @Export(name="segmentName", refs={String.class}, tree="[0]")
    private Output<String> segmentName;

    /**
     * @return The name of the segment attachment.
     * 
     */
    public Output<String> segmentName() {
        return this.segmentName;
    }
    /**
     * The state of the attachment.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the attachment.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ARN of the transit gateway route table for the attachment.
     * 
     */
    @Export(name="transitGatewayRouteTableArn", refs={String.class}, tree="[0]")
    private Output<String> transitGatewayRouteTableArn;

    /**
     * @return The ARN of the transit gateway route table for the attachment.
     * 
     */
    public Output<String> transitGatewayRouteTableArn() {
        return this.transitGatewayRouteTableArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayRouteTableAttachment(String name) {
        this(name, TransitGatewayRouteTableAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayRouteTableAttachment(String name, TransitGatewayRouteTableAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayRouteTableAttachment(String name, TransitGatewayRouteTableAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment", name, args == null ? TransitGatewayRouteTableAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayRouteTableAttachment(String name, Output<String> id, @Nullable TransitGatewayRouteTableAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/transitGatewayRouteTableAttachment:TransitGatewayRouteTableAttachment", name, state, makeResourceOptions(options, id));
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
    public static TransitGatewayRouteTableAttachment get(String name, Output<String> id, @Nullable TransitGatewayRouteTableAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayRouteTableAttachment(name, id, state, options);
    }
}
