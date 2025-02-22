// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directoryservice.SharedDirectoryArgs;
import com.pulumi.aws.directoryservice.inputs.SharedDirectoryState;
import com.pulumi.aws.directoryservice.outputs.SharedDirectoryTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a directory in your account (directory owner) shared with another account (directory consumer).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs;
 * import com.pulumi.aws.directoryservice.SharedDirectory;
 * import com.pulumi.aws.directoryservice.SharedDirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs;
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
 *         var exampleDirectory = new Directory(&#34;exampleDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;tf-example&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .edition(&#34;Standard&#34;)
 *             .vpcSettings(DirectoryVpcSettingsArgs.builder()
 *                 .vpcId(aws_vpc.example().id())
 *                 .subnetIds(aws_subnet.example().stream().map(element -&gt; element.id()).collect(toList()))
 *                 .build())
 *             .build());
 * 
 *         var exampleSharedDirectory = new SharedDirectory(&#34;exampleSharedDirectory&#34;, SharedDirectoryArgs.builder()        
 *             .directoryId(exampleDirectory.id())
 *             .notes(&#34;You wanna have a catch?&#34;)
 *             .target(SharedDirectoryTargetArgs.builder()
 *                 .id(data.aws_caller_identity().receiver().account_id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Directory Service Shared Directories using the owner directory ID/shared directory ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:directoryservice/sharedDirectory:SharedDirectory example d-1234567890/d-9267633ece
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/sharedDirectory:SharedDirectory")
public class SharedDirectory extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
     * 
     */
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output<String> directoryId;

    /**
     * @return Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> method;

    /**
     * @return Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
     * 
     */
    public Output<Optional<String>> method() {
        return Codegen.optional(this.method);
    }
    /**
     * Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    /**
     * @return Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    /**
     * Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     * 
     */
    @Export(name="sharedDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> sharedDirectoryId;

    /**
     * @return Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     * 
     */
    public Output<String> sharedDirectoryId() {
        return this.sharedDirectoryId;
    }
    /**
     * Identifier for the directory consumer account with whom the directory is to be shared. See below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="target", refs={SharedDirectoryTarget.class}, tree="[0]")
    private Output<SharedDirectoryTarget> target;

    /**
     * @return Identifier for the directory consumer account with whom the directory is to be shared. See below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<SharedDirectoryTarget> target() {
        return this.target;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedDirectory(String name) {
        this(name, SharedDirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedDirectory(String name, SharedDirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedDirectory(String name, SharedDirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/sharedDirectory:SharedDirectory", name, args == null ? SharedDirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedDirectory(String name, Output<String> id, @Nullable SharedDirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/sharedDirectory:SharedDirectory", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "notes"
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
    public static SharedDirectory get(String name, Output<String> id, @Nullable SharedDirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedDirectory(name, id, state, options);
    }
}
