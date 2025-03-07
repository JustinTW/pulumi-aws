// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.quicksight.IamPolicyAssignmentArgs;
import com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentState;
import com.pulumi.aws.quicksight.outputs.IamPolicyAssignmentIdentities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS QuickSight IAM Policy Assignment.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.IamPolicyAssignment;
 * import com.pulumi.aws.quicksight.IamPolicyAssignmentArgs;
 * import com.pulumi.aws.quicksight.inputs.IamPolicyAssignmentIdentitiesArgs;
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
 *         var example = new IamPolicyAssignment(&#34;example&#34;, IamPolicyAssignmentArgs.builder()        
 *             .assignmentName(&#34;example&#34;)
 *             .assignmentStatus(&#34;ENABLED&#34;)
 *             .policyArn(aws_iam_policy.example().arn())
 *             .identities(IamPolicyAssignmentIdentitiesArgs.builder()
 *                 .users(aws_quicksight_user.example().user_name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import QuickSight IAM Policy Assignment using the AWS account ID, namespace, and assignment name separated by commas (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:quicksight/iamPolicyAssignment:IamPolicyAssignment example 123456789012,default,example
 * ```
 * 
 */
@ResourceType(type="aws:quicksight/iamPolicyAssignment:IamPolicyAssignment")
public class IamPolicyAssignment extends com.pulumi.resources.CustomResource {
    /**
     * Assignment ID.
     * 
     */
    @Export(name="assignmentId", refs={String.class}, tree="[0]")
    private Output<String> assignmentId;

    /**
     * @return Assignment ID.
     * 
     */
    public Output<String> assignmentId() {
        return this.assignmentId;
    }
    /**
     * Name of the assignment.
     * 
     */
    @Export(name="assignmentName", refs={String.class}, tree="[0]")
    private Output<String> assignmentName;

    /**
     * @return Name of the assignment.
     * 
     */
    public Output<String> assignmentName() {
        return this.assignmentName;
    }
    /**
     * Status of the assignment. Valid values are `ENABLED`, `DISABLED`, and `DRAFT`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="assignmentStatus", refs={String.class}, tree="[0]")
    private Output<String> assignmentStatus;

    /**
     * @return Status of the assignment. Valid values are `ENABLED`, `DISABLED`, and `DRAFT`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> assignmentStatus() {
        return this.assignmentStatus;
    }
    /**
     * AWS account ID.
     * 
     */
    @Export(name="awsAccountId", refs={String.class}, tree="[0]")
    private Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * Amazon QuickSight users, groups, or both to assign the policy to. See `identities`.
     * 
     */
    @Export(name="identities", refs={IamPolicyAssignmentIdentities.class}, tree="[0]")
    private Output</* @Nullable */ IamPolicyAssignmentIdentities> identities;

    /**
     * @return Amazon QuickSight users, groups, or both to assign the policy to. See `identities`.
     * 
     */
    public Output<Optional<IamPolicyAssignmentIdentities>> identities() {
        return Codegen.optional(this.identities);
    }
    /**
     * Namespace that contains the assignment. Defaults to `default`.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output<String> namespace;

    /**
     * @return Namespace that contains the assignment. Defaults to `default`.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * ARN of the IAM policy to apply to the Amazon QuickSight users and groups specified in this assignment.
     * 
     */
    @Export(name="policyArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyArn;

    /**
     * @return ARN of the IAM policy to apply to the Amazon QuickSight users and groups specified in this assignment.
     * 
     */
    public Output<Optional<String>> policyArn() {
        return Codegen.optional(this.policyArn);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamPolicyAssignment(String name) {
        this(name, IamPolicyAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamPolicyAssignment(String name, IamPolicyAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamPolicyAssignment(String name, IamPolicyAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/iamPolicyAssignment:IamPolicyAssignment", name, args == null ? IamPolicyAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IamPolicyAssignment(String name, Output<String> id, @Nullable IamPolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/iamPolicyAssignment:IamPolicyAssignment", name, state, makeResourceOptions(options, id));
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
    public static IamPolicyAssignment get(String name, Output<String> id, @Nullable IamPolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IamPolicyAssignment(name, id, state, options);
    }
}
