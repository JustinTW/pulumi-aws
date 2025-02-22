// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codecommit.ApprovalRuleTemplateArgs;
import com.pulumi.aws.codecommit.inputs.ApprovalRuleTemplateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CodeCommit Approval Rule Template Resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.codecommit.ApprovalRuleTemplate;
 * import com.pulumi.aws.codecommit.ApprovalRuleTemplateArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ApprovalRuleTemplate(&#34;example&#34;, ApprovalRuleTemplateArgs.builder()        
 *             .description(&#34;This is an example approval rule template&#34;)
 *             .content(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2018-11-08&#34;),
 *                     jsonProperty(&#34;DestinationReferences&#34;, jsonArray(&#34;refs/heads/master&#34;)),
 *                     jsonProperty(&#34;Statements&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Type&#34;, &#34;Approvers&#34;),
 *                         jsonProperty(&#34;NumberOfApprovalsNeeded&#34;, 2),
 *                         jsonProperty(&#34;ApprovalPoolMembers&#34;, jsonArray(&#34;arn:aws:sts::123456789012:assumed-role/CodeCommitReview/*&#34;))
 *                     )))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodeCommit approval rule templates using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate imported ExistingApprovalRuleTemplateName
 * ```
 * 
 */
@ResourceType(type="aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate")
public class ApprovalRuleTemplate extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the approval rule template
     * 
     */
    @Export(name="approvalRuleTemplateId", refs={String.class}, tree="[0]")
    private Output<String> approvalRuleTemplateId;

    /**
     * @return The ID of the approval rule template
     * 
     */
    public Output<String> approvalRuleTemplateId() {
        return this.approvalRuleTemplateId;
    }
    /**
     * The content of the approval rule template. Maximum of 3000 characters.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return The content of the approval rule template. Maximum of 3000 characters.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Export(name="creationDate", refs={String.class}, tree="[0]")
    private Output<String> creationDate;

    /**
     * @return The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The description of the approval rule template. Maximum of 1000 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the approval rule template. Maximum of 1000 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Export(name="lastModifiedDate", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedDate;

    /**
     * @return The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> lastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * 
     */
    @Export(name="lastModifiedUser", refs={String.class}, tree="[0]")
    private Output<String> lastModifiedUser;

    /**
     * @return The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * 
     */
    public Output<String> lastModifiedUser() {
        return this.lastModifiedUser;
    }
    /**
     * The name for the approval rule template. Maximum of 100 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the approval rule template. Maximum of 100 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The SHA-256 hash signature for the content of the approval rule template.
     * 
     */
    @Export(name="ruleContentSha256", refs={String.class}, tree="[0]")
    private Output<String> ruleContentSha256;

    /**
     * @return The SHA-256 hash signature for the content of the approval rule template.
     * 
     */
    public Output<String> ruleContentSha256() {
        return this.ruleContentSha256;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApprovalRuleTemplate(String name) {
        this(name, ApprovalRuleTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApprovalRuleTemplate(String name, ApprovalRuleTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApprovalRuleTemplate(String name, ApprovalRuleTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate", name, args == null ? ApprovalRuleTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApprovalRuleTemplate(String name, Output<String> id, @Nullable ApprovalRuleTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate", name, state, makeResourceOptions(options, id));
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
    public static ApprovalRuleTemplate get(String name, Output<String> id, @Nullable ApprovalRuleTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApprovalRuleTemplate(name, id, state, options);
    }
}
