// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.shield;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.shield.ProtectionArgs;
import com.pulumi.aws.shield.inputs.ProtectionState;
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
 * Enables AWS Shield Advanced for a specific AWS resource.
 * The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.
 * 
 * ## Example Usage
 * ### Create protection
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetAvailabilityZonesArgs;
 * import com.pulumi.aws.inputs.GetRegionArgs;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.ec2.Eip;
 * import com.pulumi.aws.ec2.EipArgs;
 * import com.pulumi.aws.shield.Protection;
 * import com.pulumi.aws.shield.ProtectionArgs;
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
 *         final var available = AwsFunctions.getAvailabilityZones();
 * 
 *         final var currentRegion = AwsFunctions.getRegion();
 * 
 *         final var currentCallerIdentity = AwsFunctions.getCallerIdentity();
 * 
 *         var exampleEip = new Eip(&#34;exampleEip&#34;, EipArgs.builder()        
 *             .domain(&#34;vpc&#34;)
 *             .build());
 * 
 *         var exampleProtection = new Protection(&#34;exampleProtection&#34;, ProtectionArgs.builder()        
 *             .resourceArn(exampleEip.id().applyValue(id -&gt; String.format(&#34;arn:aws:ec2:%s:%s:eip-allocation/%s&#34;, currentRegion.applyValue(getRegionResult -&gt; getRegionResult.name()),currentCallerIdentity.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()),id)))
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Dev&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Shield protection resources using specifying their ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:shield/protection:Protection example ff9592dc-22f3-4e88-afa1-7b29fde9669a
 * ```
 * 
 */
@ResourceType(type="aws:shield/protection:Protection")
public class Protection extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the Protection.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the Protection.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A friendly name for the Protection you are creating.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A friendly name for the Protection you are creating.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The ARN (Amazon Resource Name) of the resource to be protected.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Protection(String name) {
        this(name, ProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Protection(String name, ProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Protection(String name, ProtectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protection:Protection", name, args == null ? ProtectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Protection(String name, Output<String> id, @Nullable ProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protection:Protection", name, state, makeResourceOptions(options, id));
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
    public static Protection get(String name, Output<String> id, @Nullable ProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Protection(name, id, state, options);
    }
}
