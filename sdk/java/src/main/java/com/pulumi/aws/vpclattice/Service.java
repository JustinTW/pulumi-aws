// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.vpclattice.ServiceArgs;
import com.pulumi.aws.vpclattice.inputs.ServiceState;
import com.pulumi.aws.vpclattice.outputs.ServiceDnsEntry;
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
 * Resource for managing an AWS VPC Lattice Service.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.vpclattice.Service;
 * import com.pulumi.aws.vpclattice.ServiceArgs;
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
 *         var example = new Service(&#34;example&#34;, ServiceArgs.builder()        
 *             .authType(&#34;AWS_IAM&#34;)
 *             .customDomainName(&#34;example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Lattice Service using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:vpclattice/service:Service example svc-06728e2357ea55f8a
 * ```
 * 
 */
@ResourceType(type="aws:vpclattice/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the service. Do not begin the description with &#34;An&#34;, &#34;The&#34;, &#34;Defines&#34;, &#34;Indicates&#34;, or &#34;Specifies,&#34; as these are verbose. In other words, &#34;Indicates the amount of storage,&#34; can be rewritten as &#34;Amount of storage,&#34; without losing any information.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the service. Do not begin the description with &#34;An&#34;, &#34;The&#34;, &#34;Defines&#34;, &#34;Indicates&#34;, or &#34;Specifies,&#34; as these are verbose. In other words, &#34;Indicates the amount of storage,&#34; can be rewritten as &#34;Amount of storage,&#34; without losing any information.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Type of IAM policy. Either `NONE` or `AWS_IAM`.
     * 
     */
    @Export(name="authType", refs={String.class}, tree="[0]")
    private Output<String> authType;

    /**
     * @return Type of IAM policy. Either `NONE` or `AWS_IAM`.
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }
    /**
     * Amazon Resource Name (ARN) of the certificate.
     * 
     */
    @Export(name="certificateArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return Amazon Resource Name (ARN) of the certificate.
     * 
     */
    public Output<Optional<String>> certificateArn() {
        return Codegen.optional(this.certificateArn);
    }
    /**
     * Custom domain name of the service.
     * 
     */
    @Export(name="customDomainName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customDomainName;

    /**
     * @return Custom domain name of the service.
     * 
     */
    public Output<Optional<String>> customDomainName() {
        return Codegen.optional(this.customDomainName);
    }
    /**
     * Concise description. Do not begin the description with &#34;An&#34;, &#34;The&#34;, &#34;Defines&#34;, &#34;Indicates&#34;, or &#34;Specifies,&#34; as these are verbose. In other words, &#34;Indicates the amount of storage,&#34; can be rewritten as &#34;Amount of storage,&#34; without losing any information.
     * 
     */
    @Export(name="dnsEntries", refs={List.class,ServiceDnsEntry.class}, tree="[0,1]")
    private Output<List<ServiceDnsEntry>> dnsEntries;

    /**
     * @return Concise description. Do not begin the description with &#34;An&#34;, &#34;The&#34;, &#34;Defines&#34;, &#34;Indicates&#34;, or &#34;Specifies,&#34; as these are verbose. In other words, &#34;Indicates the amount of storage,&#34; can be rewritten as &#34;Amount of storage,&#34; without losing any information.
     * 
     */
    public Output<List<ServiceDnsEntry>> dnsEntries() {
        return this.dnsEntries;
    }
    /**
     * Name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can&#39;t use a hyphen as the first or last character, or immediately after another hyphen.Must be between 3 and 40 characters in length.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can&#39;t use a hyphen as the first or last character, or immediately after another hyphen.Must be between 3 and 40 characters in length.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Status of the service.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the service.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, @Nullable ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, @Nullable ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/service:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:vpclattice/service:Service", name, state, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
