// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directoryservice.TrustArgs;
import com.pulumi.aws.directoryservice.inputs.TrustState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a trust relationship between two Active Directory Directories.
 * 
 * The directories may either be both AWS Managed Microsoft AD domains or an AWS Managed Microsoft AD domain and a self-managed Active Directory Domain.
 * 
 * The Trust relationship must be configured on both sides of the relationship.
 * If a Trust has only been created on one side, it will be in the state `VerifyFailed`.
 * Once the second Trust is created, the first will update to the correct state.
 * 
 * ## Example Usage
 * ### Two-Way Trust
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.Trust;
 * import com.pulumi.aws.directoryservice.TrustArgs;
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
 *         var oneDirectory = new Directory(&#34;oneDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;one.example.com&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .build());
 * 
 *         var twoDirectory = new Directory(&#34;twoDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;two.example.com&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .build());
 * 
 *         var oneTrust = new Trust(&#34;oneTrust&#34;, TrustArgs.builder()        
 *             .directoryId(oneDirectory.id())
 *             .remoteDomainName(twoDirectory.name())
 *             .trustDirection(&#34;Two-Way&#34;)
 *             .trustPassword(&#34;Some0therPassword&#34;)
 *             .conditionalForwarderIpAddrs(twoDirectory.dnsIpAddresses())
 *             .build());
 * 
 *         var twoTrust = new Trust(&#34;twoTrust&#34;, TrustArgs.builder()        
 *             .directoryId(twoDirectory.id())
 *             .remoteDomainName(oneDirectory.name())
 *             .trustDirection(&#34;Two-Way&#34;)
 *             .trustPassword(&#34;Some0therPassword&#34;)
 *             .conditionalForwarderIpAddrs(oneDirectory.dnsIpAddresses())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### One-Way Trust
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.Trust;
 * import com.pulumi.aws.directoryservice.TrustArgs;
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
 *         var oneDirectory = new Directory(&#34;oneDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;one.example.com&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .build());
 * 
 *         var twoDirectory = new Directory(&#34;twoDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;two.example.com&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .build());
 * 
 *         var oneTrust = new Trust(&#34;oneTrust&#34;, TrustArgs.builder()        
 *             .directoryId(oneDirectory.id())
 *             .remoteDomainName(twoDirectory.name())
 *             .trustDirection(&#34;One-Way: Incoming&#34;)
 *             .trustPassword(&#34;Some0therPassword&#34;)
 *             .conditionalForwarderIpAddrs(twoDirectory.dnsIpAddresses())
 *             .build());
 * 
 *         var twoTrust = new Trust(&#34;twoTrust&#34;, TrustArgs.builder()        
 *             .directoryId(twoDirectory.id())
 *             .remoteDomainName(oneDirectory.name())
 *             .trustDirection(&#34;One-Way: Outgoing&#34;)
 *             .trustPassword(&#34;Some0therPassword&#34;)
 *             .conditionalForwarderIpAddrs(oneDirectory.dnsIpAddresses())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import the Trust relationship using the directory ID and remote domain name, separated by a `/`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:directoryservice/trust:Trust example d-926724cf57/directory.example.com
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/trust:Trust")
public class Trust extends com.pulumi.resources.CustomResource {
    /**
     * Set of IPv4 addresses for the DNS server associated with the remote Directory.
     * Can contain between 1 and 4 values.
     * 
     */
    @Export(name="conditionalForwarderIpAddrs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> conditionalForwarderIpAddrs;

    /**
     * @return Set of IPv4 addresses for the DNS server associated with the remote Directory.
     * Can contain between 1 and 4 values.
     * 
     */
    public Output<Optional<List<String>>> conditionalForwarderIpAddrs() {
        return Codegen.optional(this.conditionalForwarderIpAddrs);
    }
    /**
     * Date and time when the Trust was created.
     * 
     */
    @Export(name="createdDateTime", refs={String.class}, tree="[0]")
    private Output<String> createdDateTime;

    /**
     * @return Date and time when the Trust was created.
     * 
     */
    public Output<String> createdDateTime() {
        return this.createdDateTime;
    }
    /**
     * Whether to delete the conditional forwarder when deleting the Trust relationship.
     * 
     */
    @Export(name="deleteAssociatedConditionalForwarder", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deleteAssociatedConditionalForwarder;

    /**
     * @return Whether to delete the conditional forwarder when deleting the Trust relationship.
     * 
     */
    public Output<Boolean> deleteAssociatedConditionalForwarder() {
        return this.deleteAssociatedConditionalForwarder;
    }
    /**
     * ID of the Directory.
     * 
     */
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output<String> directoryId;

    /**
     * @return ID of the Directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * Date and time when the Trust was last updated.
     * 
     */
    @Export(name="lastUpdatedDateTime", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDateTime;

    /**
     * @return Date and time when the Trust was last updated.
     * 
     */
    public Output<String> lastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Fully qualified domain name of the remote Directory.
     * 
     */
    @Export(name="remoteDomainName", refs={String.class}, tree="[0]")
    private Output<String> remoteDomainName;

    /**
     * @return Fully qualified domain name of the remote Directory.
     * 
     */
    public Output<String> remoteDomainName() {
        return this.remoteDomainName;
    }
    /**
     * Whether to enable selective authentication.
     * Valid values are `Enabled` and `Disabled`.
     * Default value is `Disabled`.
     * 
     */
    @Export(name="selectiveAuth", refs={String.class}, tree="[0]")
    private Output<String> selectiveAuth;

    /**
     * @return Whether to enable selective authentication.
     * Valid values are `Enabled` and `Disabled`.
     * Default value is `Disabled`.
     * 
     */
    public Output<String> selectiveAuth() {
        return this.selectiveAuth;
    }
    /**
     * Date and time when the Trust state in `trust_state` was last updated.
     * 
     */
    @Export(name="stateLastUpdatedDateTime", refs={String.class}, tree="[0]")
    private Output<String> stateLastUpdatedDateTime;

    /**
     * @return Date and time when the Trust state in `trust_state` was last updated.
     * 
     */
    public Output<String> stateLastUpdatedDateTime() {
        return this.stateLastUpdatedDateTime;
    }
    /**
     * The direction of the Trust relationship.
     * Valid values are `One-Way: Outgoing`, `One-Way: Incoming`, and `Two-Way`.
     * 
     */
    @Export(name="trustDirection", refs={String.class}, tree="[0]")
    private Output<String> trustDirection;

    /**
     * @return The direction of the Trust relationship.
     * Valid values are `One-Way: Outgoing`, `One-Way: Incoming`, and `Two-Way`.
     * 
     */
    public Output<String> trustDirection() {
        return this.trustDirection;
    }
    /**
     * Password for the Trust.
     * Does not need to match the passwords for either Directory.
     * Can contain upper- and lower-case letters, numbers, and punctuation characters.
     * May be up to 128 characters long.
     * 
     */
    @Export(name="trustPassword", refs={String.class}, tree="[0]")
    private Output<String> trustPassword;

    /**
     * @return Password for the Trust.
     * Does not need to match the passwords for either Directory.
     * Can contain upper- and lower-case letters, numbers, and punctuation characters.
     * May be up to 128 characters long.
     * 
     */
    public Output<String> trustPassword() {
        return this.trustPassword;
    }
    /**
     * State of the Trust relationship.
     * One of `Created`, `VerifyFailed`,`Verified`, `UpdateFailed`,`Updated`,`Deleted`, or `Failed`.
     * 
     */
    @Export(name="trustState", refs={String.class}, tree="[0]")
    private Output<String> trustState;

    /**
     * @return State of the Trust relationship.
     * One of `Created`, `VerifyFailed`,`Verified`, `UpdateFailed`,`Updated`,`Deleted`, or `Failed`.
     * 
     */
    public Output<String> trustState() {
        return this.trustState;
    }
    /**
     * Reason for the Trust state set in `trust_state`.
     * 
     */
    @Export(name="trustStateReason", refs={String.class}, tree="[0]")
    private Output<String> trustStateReason;

    /**
     * @return Reason for the Trust state set in `trust_state`.
     * 
     */
    public Output<String> trustStateReason() {
        return this.trustStateReason;
    }
    /**
     * Type of the Trust relationship.
     * Valid values are `Forest` and `External`.
     * Default value is `Forest`.
     * 
     */
    @Export(name="trustType", refs={String.class}, tree="[0]")
    private Output<String> trustType;

    /**
     * @return Type of the Trust relationship.
     * Valid values are `Forest` and `External`.
     * Default value is `Forest`.
     * 
     */
    public Output<String> trustType() {
        return this.trustType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trust(String name) {
        this(name, TrustArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trust(String name, TrustArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trust(String name, TrustArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/trust:Trust", name, args == null ? TrustArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trust(String name, Output<String> id, @Nullable TrustState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/trust:Trust", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Trust get(String name, Output<String> id, @Nullable TrustState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Trust(name, id, state, options);
    }
}
