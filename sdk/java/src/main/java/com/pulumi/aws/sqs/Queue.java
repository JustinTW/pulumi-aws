// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sqs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sqs.QueueArgs;
import com.pulumi.aws.sqs.inputs.QueueState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .delaySeconds(90)
 *             .maxMessageSize(2048)
 *             .messageRetentionSeconds(86400)
 *             .receiveWaitTimeSeconds(10)
 *             .redrivePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;deadLetterTargetArn&#34;, aws_sqs_queue.queue_deadletter().arn()),
 *                     jsonProperty(&#34;maxReceiveCount&#34;, 4)
 *                 )))
 *             .tags(Map.of(&#34;Environment&#34;, &#34;production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## FIFO queue
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .contentBasedDeduplication(true)
 *             .fifoQueue(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## High-throughput FIFO queue
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .deduplicationScope(&#34;messageGroup&#34;)
 *             .fifoQueue(true)
 *             .fifoThroughputLimit(&#34;perMessageGroupId&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Dead-letter queue
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
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
 *         var exampleQueueDeadletter = new Queue(&#34;exampleQueueDeadletter&#34;, QueueArgs.builder()        
 *             .redriveAllowPolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;redrivePermission&#34;, &#34;byQueue&#34;),
 *                     jsonProperty(&#34;sourceQueueArns&#34;, jsonArray(aws_sqs_queue.example_queue().arn()))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Server-side encryption (SSE)
 * 
 * Using [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html):
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .sqsManagedSseEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Using [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html):
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sqs.Queue;
 * import com.pulumi.aws.sqs.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .kmsDataKeyReusePeriodSeconds(300)
 *             .kmsMasterKeyId(&#34;alias/aws/sqs&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SQS Queues using the queue `url`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sqs/queue:Queue public_queue https://queue.amazonaws.com/80398EXAMPLE/MyQueue
 * ```
 * 
 */
@ResourceType(type="aws:sqs/queue:Queue")
public class Queue extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the SQS queue
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the SQS queue
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
     * 
     */
    @Export(name="contentBasedDeduplication", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> contentBasedDeduplication;

    /**
     * @return Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
     * 
     */
    public Output<Optional<Boolean>> contentBasedDeduplication() {
        return Codegen.optional(this.contentBasedDeduplication);
    }
    /**
     * Specifies whether message deduplication occurs at the message group or queue level. Valid values are `messageGroup` and `queue` (default).
     * 
     */
    @Export(name="deduplicationScope", refs={String.class}, tree="[0]")
    private Output<String> deduplicationScope;

    /**
     * @return Specifies whether message deduplication occurs at the message group or queue level. Valid values are `messageGroup` and `queue` (default).
     * 
     */
    public Output<String> deduplicationScope() {
        return this.deduplicationScope;
    }
    /**
     * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
     * 
     */
    @Export(name="delaySeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> delaySeconds;

    /**
     * @return The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
     * 
     */
    public Output<Optional<Integer>> delaySeconds() {
        return Codegen.optional(this.delaySeconds);
    }
    /**
     * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
     * 
     */
    @Export(name="fifoQueue", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> fifoQueue;

    /**
     * @return Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
     * 
     */
    public Output<Optional<Boolean>> fifoQueue() {
        return Codegen.optional(this.fifoQueue);
    }
    /**
     * Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are `perQueue` (default) and `perMessageGroupId`.
     * 
     */
    @Export(name="fifoThroughputLimit", refs={String.class}, tree="[0]")
    private Output<String> fifoThroughputLimit;

    /**
     * @return Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are `perQueue` (default) and `perMessageGroupId`.
     * 
     */
    public Output<String> fifoThroughputLimit() {
        return this.fifoThroughputLimit;
    }
    /**
     * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
     * 
     */
    @Export(name="kmsDataKeyReusePeriodSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> kmsDataKeyReusePeriodSeconds;

    /**
     * @return The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
     * 
     */
    public Output<Integer> kmsDataKeyReusePeriodSeconds() {
        return this.kmsDataKeyReusePeriodSeconds;
    }
    /**
     * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
     * 
     */
    @Export(name="kmsMasterKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsMasterKeyId;

    /**
     * @return The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
     * 
     */
    public Output<Optional<String>> kmsMasterKeyId() {
        return Codegen.optional(this.kmsMasterKeyId);
    }
    /**
     * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
     * 
     */
    @Export(name="maxMessageSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxMessageSize;

    /**
     * @return The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
     * 
     */
    public Output<Optional<Integer>> maxMessageSize() {
        return Codegen.optional(this.maxMessageSize);
    }
    /**
     * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * 
     */
    @Export(name="messageRetentionSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> messageRetentionSeconds;

    /**
     * @return The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
     * 
     */
    public Output<Optional<Integer>> messageRetentionSeconds() {
        return Codegen.optional(this.messageRetentionSeconds);
    }
    /**
     * The name of the queue. Queue names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 80 characters long. For a FIFO (first-in-first-out) queue, the name must end with the `.fifo` suffix. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the queue. Queue names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 80 characters long. For a FIFO (first-in-first-out) queue, the name must end with the `.fifo` suffix. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The JSON policy for the SQS queue.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The JSON policy for the SQS queue.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
     * 
     */
    @Export(name="receiveWaitTimeSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> receiveWaitTimeSeconds;

    /**
     * @return The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
     * 
     */
    public Output<Optional<Integer>> receiveWaitTimeSeconds() {
        return Codegen.optional(this.receiveWaitTimeSeconds);
    }
    /**
     * The JSON policy to set up the Dead Letter Queue redrive permission, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html).
     * 
     */
    @Export(name="redriveAllowPolicy", refs={String.class}, tree="[0]")
    private Output<String> redriveAllowPolicy;

    /**
     * @return The JSON policy to set up the Dead Letter Queue redrive permission, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html).
     * 
     */
    public Output<String> redriveAllowPolicy() {
        return this.redriveAllowPolicy;
    }
    /**
     * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`&#34;5&#34;`).
     * 
     */
    @Export(name="redrivePolicy", refs={String.class}, tree="[0]")
    private Output<String> redrivePolicy;

    /**
     * @return The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`&#34;5&#34;`).
     * 
     */
    public Output<String> redrivePolicy() {
        return this.redrivePolicy;
    }
    /**
     * Boolean to enable server-side encryption (SSE) of message content with SQS-owned encryption keys. See [Encryption at rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html). The provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Export(name="sqsManagedSseEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> sqsManagedSseEnabled;

    /**
     * @return Boolean to enable server-side encryption (SSE) of message content with SQS-owned encryption keys. See [Encryption at rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html). The provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<Boolean> sqsManagedSseEnabled() {
        return this.sqsManagedSseEnabled;
    }
    /**
     * A map of tags to assign to the queue. If configured with a provider `default_tags` configuration block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the queue. If configured with a provider `default_tags` configuration block) present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Same as `id`: The URL for the created Amazon SQS queue.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return Same as `id`: The URL for the created Amazon SQS queue.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
     * 
     */
    @Export(name="visibilityTimeoutSeconds", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> visibilityTimeoutSeconds;

    /**
     * @return The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
     * 
     */
    public Output<Optional<Integer>> visibilityTimeoutSeconds() {
        return Codegen.optional(this.visibilityTimeoutSeconds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, @Nullable QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, @Nullable QueueArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sqs/queue:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable QueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sqs/queue:Queue", name, state, makeResourceOptions(options, id));
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
    public static Queue get(String name, Output<String> id, @Nullable QueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, state, options);
    }
}
