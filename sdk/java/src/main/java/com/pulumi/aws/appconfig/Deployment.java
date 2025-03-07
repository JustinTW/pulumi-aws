// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.DeploymentArgs;
import com.pulumi.aws.appconfig.inputs.DeploymentState;
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
 * Provides an AppConfig Deployment resource for an `aws.appconfig.Application` resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appconfig.Deployment;
 * import com.pulumi.aws.appconfig.DeploymentArgs;
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
 *         var example = new Deployment(&#34;example&#34;, DeploymentArgs.builder()        
 *             .applicationId(aws_appconfig_application.example().id())
 *             .configurationProfileId(aws_appconfig_configuration_profile.example().configuration_profile_id())
 *             .configurationVersion(aws_appconfig_hosted_configuration_version.example().version_number())
 *             .deploymentStrategyId(aws_appconfig_deployment_strategy.example().id())
 *             .description(&#34;My example deployment&#34;)
 *             .environmentId(aws_appconfig_environment.example().environment_id())
 *             .tags(Map.of(&#34;Type&#34;, &#34;AppConfig Deployment&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AppConfig Deployments using the application ID, environment ID, and deployment number separated by a slash (`/`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/deployment:Deployment example 71abcde/11xxxxx/1
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * Application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return Application ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * ARN of the AppConfig Deployment.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the AppConfig Deployment.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration profile ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Export(name="configurationProfileId", refs={String.class}, tree="[0]")
    private Output<String> configurationProfileId;

    /**
     * @return Configuration profile ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Output<String> configurationProfileId() {
        return this.configurationProfileId;
    }
    /**
     * Configuration version to deploy. Can be at most 1024 characters.
     * 
     */
    @Export(name="configurationVersion", refs={String.class}, tree="[0]")
    private Output<String> configurationVersion;

    /**
     * @return Configuration version to deploy. Can be at most 1024 characters.
     * 
     */
    public Output<String> configurationVersion() {
        return this.configurationVersion;
    }
    /**
     * Deployment number.
     * 
     */
    @Export(name="deploymentNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> deploymentNumber;

    /**
     * @return Deployment number.
     * 
     */
    public Output<Integer> deploymentNumber() {
        return this.deploymentNumber;
    }
    /**
     * Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     * 
     */
    @Export(name="deploymentStrategyId", refs={String.class}, tree="[0]")
    private Output<String> deploymentStrategyId;

    /**
     * @return Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
     * 
     */
    public Output<String> deploymentStrategyId() {
        return this.deploymentStrategyId;
    }
    /**
     * Description of the deployment. Can be at most 1024 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the deployment. Can be at most 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Environment ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Export(name="environmentId", refs={String.class}, tree="[0]")
    private Output<String> environmentId;

    /**
     * @return Environment ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }
    /**
     * State of the deployment.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the deployment.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/deployment:Deployment", name, state, makeResourceOptions(options, id));
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
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
