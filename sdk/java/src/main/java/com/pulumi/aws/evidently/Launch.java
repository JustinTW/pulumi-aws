// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.evidently;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.evidently.LaunchArgs;
import com.pulumi.aws.evidently.inputs.LaunchState;
import com.pulumi.aws.evidently.outputs.LaunchExecution;
import com.pulumi.aws.evidently.outputs.LaunchGroup;
import com.pulumi.aws.evidently.outputs.LaunchMetricMonitor;
import com.pulumi.aws.evidently.outputs.LaunchScheduledSplitsConfig;
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
 * Provides a CloudWatch Evidently Launch resource.
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .groups(LaunchGroupArgs.builder()
 *                 .feature(aws_evidently_feature.example().name())
 *                 .name(&#34;Variation1&#34;)
 *                 .variation(&#34;Variation1&#34;)
 *                 .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(LaunchScheduledSplitsConfigStepArgs.builder()
 *                     .groupWeights(Map.of(&#34;Variation1&#34;, 0))
 *                     .startTime(&#34;2024-01-07 01:43:59+00:00&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With description
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .description(&#34;example description&#34;)
 *             .groups(LaunchGroupArgs.builder()
 *                 .feature(aws_evidently_feature.example().name())
 *                 .name(&#34;Variation1&#34;)
 *                 .variation(&#34;Variation1&#34;)
 *                 .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(LaunchScheduledSplitsConfigStepArgs.builder()
 *                     .groupWeights(Map.of(&#34;Variation1&#34;, 0))
 *                     .startTime(&#34;2024-01-07 01:43:59+00:00&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With multiple groups
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .groups(            
 *                 LaunchGroupArgs.builder()
 *                     .feature(aws_evidently_feature.example().name())
 *                     .name(&#34;Variation1&#34;)
 *                     .variation(&#34;Variation1&#34;)
 *                     .description(&#34;first-group&#34;)
 *                     .build(),
 *                 LaunchGroupArgs.builder()
 *                     .feature(aws_evidently_feature.example().name())
 *                     .name(&#34;Variation2&#34;)
 *                     .variation(&#34;Variation2&#34;)
 *                     .description(&#34;second-group&#34;)
 *                     .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(LaunchScheduledSplitsConfigStepArgs.builder()
 *                     .groupWeights(Map.ofEntries(
 *                         Map.entry(&#34;Variation1&#34;, 0),
 *                         Map.entry(&#34;Variation2&#34;, 0)
 *                     ))
 *                     .startTime(&#34;2024-01-07 01:43:59+00:00&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With metric_monitors
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchMetricMonitorArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchMetricMonitorMetricDefinitionArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .groups(LaunchGroupArgs.builder()
 *                 .feature(aws_evidently_feature.example().name())
 *                 .name(&#34;Variation1&#34;)
 *                 .variation(&#34;Variation1&#34;)
 *                 .build())
 *             .metricMonitors(            
 *                 LaunchMetricMonitorArgs.builder()
 *                     .metricDefinition(LaunchMetricMonitorMetricDefinitionArgs.builder()
 *                         .entityIdKey(&#34;entity_id_key1&#34;)
 *                         .eventPattern(&#34;{\&#34;Price\&#34;:[{\&#34;numeric\&#34;:[\&#34;&gt;\&#34;,11,\&#34;&lt;=\&#34;,22]}]}&#34;)
 *                         .name(&#34;name1&#34;)
 *                         .unitLabel(&#34;unit_label1&#34;)
 *                         .valueKey(&#34;value_key1&#34;)
 *                         .build())
 *                     .build(),
 *                 LaunchMetricMonitorArgs.builder()
 *                     .metricDefinition(LaunchMetricMonitorMetricDefinitionArgs.builder()
 *                         .entityIdKey(&#34;entity_id_key2&#34;)
 *                         .eventPattern(&#34;{\&#34;Price\&#34;:[{\&#34;numeric\&#34;:[\&#34;&gt;\&#34;,9,\&#34;&lt;=\&#34;,19]}]}&#34;)
 *                         .name(&#34;name2&#34;)
 *                         .unitLabel(&#34;unit_label2&#34;)
 *                         .valueKey(&#34;value_key2&#34;)
 *                         .build())
 *                     .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(LaunchScheduledSplitsConfigStepArgs.builder()
 *                     .groupWeights(Map.of(&#34;Variation1&#34;, 0))
 *                     .startTime(&#34;2024-01-07 01:43:59+00:00&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With randomization_salt
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .randomizationSalt(&#34;example randomization salt&#34;)
 *             .groups(LaunchGroupArgs.builder()
 *                 .feature(aws_evidently_feature.example().name())
 *                 .name(&#34;Variation1&#34;)
 *                 .variation(&#34;Variation1&#34;)
 *                 .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(LaunchScheduledSplitsConfigStepArgs.builder()
 *                     .groupWeights(Map.of(&#34;Variation1&#34;, 0))
 *                     .startTime(&#34;2024-01-07 01:43:59+00:00&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With multiple steps
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .groups(            
 *                 LaunchGroupArgs.builder()
 *                     .feature(aws_evidently_feature.example().name())
 *                     .name(&#34;Variation1&#34;)
 *                     .variation(&#34;Variation1&#34;)
 *                     .build(),
 *                 LaunchGroupArgs.builder()
 *                     .feature(aws_evidently_feature.example().name())
 *                     .name(&#34;Variation2&#34;)
 *                     .variation(&#34;Variation2&#34;)
 *                     .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(                
 *                     LaunchScheduledSplitsConfigStepArgs.builder()
 *                         .groupWeights(Map.ofEntries(
 *                             Map.entry(&#34;Variation1&#34;, 15),
 *                             Map.entry(&#34;Variation2&#34;, 10)
 *                         ))
 *                         .startTime(&#34;2024-01-07 01:43:59+00:00&#34;)
 *                         .build(),
 *                     LaunchScheduledSplitsConfigStepArgs.builder()
 *                         .groupWeights(Map.ofEntries(
 *                             Map.entry(&#34;Variation1&#34;, 20),
 *                             Map.entry(&#34;Variation2&#34;, 25)
 *                         ))
 *                         .startTime(&#34;2024-01-08 01:43:59+00:00&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With segment overrides
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.evidently.Launch;
 * import com.pulumi.aws.evidently.LaunchArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchGroupArgs;
 * import com.pulumi.aws.evidently.inputs.LaunchScheduledSplitsConfigArgs;
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
 *         var example = new Launch(&#34;example&#34;, LaunchArgs.builder()        
 *             .project(aws_evidently_project.example().name())
 *             .groups(            
 *                 LaunchGroupArgs.builder()
 *                     .feature(aws_evidently_feature.example().name())
 *                     .name(&#34;Variation1&#34;)
 *                     .variation(&#34;Variation1&#34;)
 *                     .build(),
 *                 LaunchGroupArgs.builder()
 *                     .feature(aws_evidently_feature.example().name())
 *                     .name(&#34;Variation2&#34;)
 *                     .variation(&#34;Variation2&#34;)
 *                     .build())
 *             .scheduledSplitsConfig(LaunchScheduledSplitsConfigArgs.builder()
 *                 .steps(LaunchScheduledSplitsConfigStepArgs.builder()
 *                     .groupWeights(Map.ofEntries(
 *                         Map.entry(&#34;Variation1&#34;, 0),
 *                         Map.entry(&#34;Variation2&#34;, 0)
 *                     ))
 *                     .segmentOverrides(                    
 *                         LaunchScheduledSplitsConfigStepSegmentOverrideArgs.builder()
 *                             .evaluationOrder(1)
 *                             .segment(aws_evidently_segment.example().name())
 *                             .weights(Map.of(&#34;Variation2&#34;, 10000))
 *                             .build(),
 *                         LaunchScheduledSplitsConfigStepSegmentOverrideArgs.builder()
 *                             .evaluationOrder(2)
 *                             .segment(aws_evidently_segment.example().name())
 *                             .weights(Map.ofEntries(
 *                                 Map.entry(&#34;Variation1&#34;, 40000),
 *                                 Map.entry(&#34;Variation2&#34;, 30000)
 *                             ))
 *                             .build())
 *                     .startTime(&#34;2024-01-08 01:43:59+00:00&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the `name` of the launch and `arn` of the project separated by a `:`:
 * 
 * __Using `pulumi import` to import__ CloudWatch Evidently Launch using the `name` of the launch and `name` of the project or `arn` of the hosting CloudWatch Evidently Project separated by a `:`. For example:
 * 
 * Import using the `name` of the launch and `name` of the project separated by a `:`:
 * 
 * ```sh
 *  $ pulumi import aws:evidently/launch:Launch example exampleLaunchName:exampleProjectName
 * ```
 *  Import using the `name` of the launch and `arn` of the project separated by a `:`:
 * 
 * ```sh
 *  $ pulumi import aws:evidently/launch:Launch example exampleLaunchName:arn:aws:evidently:us-east-1:123456789012:project/exampleProjectName
 * ```
 * 
 */
@ResourceType(type="aws:evidently/launch:Launch")
public class Launch extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the launch.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the launch.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time that the launch is created.
     * 
     */
    @Export(name="createdTime", refs={String.class}, tree="[0]")
    private Output<String> createdTime;

    /**
     * @return The date and time that the launch is created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * Specifies the description of the launch.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the launch.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A block that contains information about the start and end times of the launch. Detailed below
     * 
     */
    @Export(name="executions", refs={List.class,LaunchExecution.class}, tree="[0,1]")
    private Output<List<LaunchExecution>> executions;

    /**
     * @return A block that contains information about the start and end times of the launch. Detailed below
     * 
     */
    public Output<List<LaunchExecution>> executions() {
        return this.executions;
    }
    /**
     * One or up to five blocks that contain the feature and variations that are to be used for the launch. Detailed below.
     * 
     */
    @Export(name="groups", refs={List.class,LaunchGroup.class}, tree="[0,1]")
    private Output<List<LaunchGroup>> groups;

    /**
     * @return One or up to five blocks that contain the feature and variations that are to be used for the launch. Detailed below.
     * 
     */
    public Output<List<LaunchGroup>> groups() {
        return this.groups;
    }
    /**
     * The date and time that the launch was most recently updated.
     * 
     */
    @Export(name="lastUpdatedTime", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedTime;

    /**
     * @return The date and time that the launch was most recently updated.
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * One or up to three blocks that define the metrics that will be used to monitor the launch performance. Detailed below.
     * 
     */
    @Export(name="metricMonitors", refs={List.class,LaunchMetricMonitor.class}, tree="[0,1]")
    private Output</* @Nullable */ List<LaunchMetricMonitor>> metricMonitors;

    /**
     * @return One or up to three blocks that define the metrics that will be used to monitor the launch performance. Detailed below.
     * 
     */
    public Output<Optional<List<LaunchMetricMonitor>>> metricMonitors() {
        return Codegen.optional(this.metricMonitors);
    }
    /**
     * The name for the new launch. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the new launch. Minimum length of `1`. Maximum length of `127`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name or ARN of the project that is to contain the new launch.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The name or ARN of the project that is to contain the new launch.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt. If you omit randomizationSalt, Evidently uses the launch name as the randomizationSalt.
     * 
     */
    @Export(name="randomizationSalt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> randomizationSalt;

    /**
     * @return When Evidently assigns a particular user session to a launch, it must use a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt. If you omit randomizationSalt, Evidently uses the launch name as the randomizationSalt.
     * 
     */
    public Output<Optional<String>> randomizationSalt() {
        return Codegen.optional(this.randomizationSalt);
    }
    /**
     * A block that defines the traffic allocation percentages among the feature variations during each step of the launch. Detailed below.
     * 
     */
    @Export(name="scheduledSplitsConfig", refs={LaunchScheduledSplitsConfig.class}, tree="[0]")
    private Output</* @Nullable */ LaunchScheduledSplitsConfig> scheduledSplitsConfig;

    /**
     * @return A block that defines the traffic allocation percentages among the feature variations during each step of the launch. Detailed below.
     * 
     */
    public Output<Optional<LaunchScheduledSplitsConfig>> scheduledSplitsConfig() {
        return Codegen.optional(this.scheduledSplitsConfig);
    }
    /**
     * The current state of the launch. Valid values are `CREATED`, `UPDATING`, `RUNNING`, `COMPLETED`, and `CANCELLED`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current state of the launch. Valid values are `CREATED`, `UPDATING`, `RUNNING`, `COMPLETED`, and `CANCELLED`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain why it was stopped.
     * 
     */
    @Export(name="statusReason", refs={String.class}, tree="[0]")
    private Output<String> statusReason;

    /**
     * @return If the launch was stopped, this is the string that was entered by the person who stopped the launch, to explain why it was stopped.
     * 
     */
    public Output<String> statusReason() {
        return this.statusReason;
    }
    /**
     * Tags to apply to the launch. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the launch. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The type of launch.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of launch.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Launch(String name) {
        this(name, LaunchArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Launch(String name, LaunchArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Launch(String name, LaunchArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:evidently/launch:Launch", name, args == null ? LaunchArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Launch(String name, Output<String> id, @Nullable LaunchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:evidently/launch:Launch", name, state, makeResourceOptions(options, id));
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
    public static Launch get(String name, Output<String> id, @Nullable LaunchState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Launch(name, id, state, options);
    }
}
