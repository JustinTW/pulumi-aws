// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.RuleGroupArgs;
import com.pulumi.aws.waf.inputs.RuleGroupState;
import com.pulumi.aws.waf.outputs.RuleGroupActivatedRule;
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
 * Provides a WAF Rule Group Resource
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.waf.Rule;
 * import com.pulumi.aws.waf.RuleArgs;
 * import com.pulumi.aws.waf.RuleGroup;
 * import com.pulumi.aws.waf.RuleGroupArgs;
 * import com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs;
 * import com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleActionArgs;
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
 *         var exampleRule = new Rule(&#34;exampleRule&#34;, RuleArgs.builder()        
 *             .metricName(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleRuleGroup = new RuleGroup(&#34;exampleRuleGroup&#34;, RuleGroupArgs.builder()        
 *             .metricName(&#34;example&#34;)
 *             .activatedRules(RuleGroupActivatedRuleArgs.builder()
 *                 .action(RuleGroupActivatedRuleActionArgs.builder()
 *                     .type(&#34;COUNT&#34;)
 *                     .build())
 *                 .priority(50)
 *                 .ruleId(exampleRule.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WAF Rule Group using the id. For example:
 * 
 * ```sh
 *  $ pulumi import aws:waf/ruleGroup:RuleGroup example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/ruleGroup:RuleGroup")
public class RuleGroup extends com.pulumi.resources.CustomResource {
    /**
     * A list of activated rules, see below
     * 
     */
    @Export(name="activatedRules", refs={List.class,RuleGroupActivatedRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RuleGroupActivatedRule>> activatedRules;

    /**
     * @return A list of activated rules, see below
     * 
     */
    public Output<Optional<List<RuleGroupActivatedRule>>> activatedRules() {
        return Codegen.optional(this.activatedRules);
    }
    /**
     * The ARN of the WAF rule group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the WAF rule group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A friendly name for the metrics from the rule group
     * 
     */
    @Export(name="metricName", refs={String.class}, tree="[0]")
    private Output<String> metricName;

    /**
     * @return A friendly name for the metrics from the rule group
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }
    /**
     * Name of the rule group. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the rule group. If omitted, the provider will assign a random, unique name. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public RuleGroup(String name) {
        this(name, RuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleGroup(String name, RuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroup(String name, RuleGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/ruleGroup:RuleGroup", name, args == null ? RuleGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RuleGroup(String name, Output<String> id, @Nullable RuleGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/ruleGroup:RuleGroup", name, state, makeResourceOptions(options, id));
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
    public static RuleGroup get(String name, Output<String> id, @Nullable RuleGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroup(name, id, state, options);
    }
}
