// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2Args;
import com.pulumi.aws.s3.inputs.BucketRequestPaymentConfigurationV2State;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an S3 bucket request payment configuration resource. For more information, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html).
 * 
 * &gt; **NOTE:** Destroying an `aws.s3.BucketRequestPaymentConfigurationV2` resource resets the bucket&#39;s `payer` to the S3 default: the bucket owner.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2;
 * import com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2Args;
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
 *         var example = new BucketRequestPaymentConfigurationV2(&#34;example&#34;, BucketRequestPaymentConfigurationV2Args.builder()        
 *             .bucket(aws_s3_bucket.example().id())
 *             .payer(&#34;Requester&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * __Using `pulumi import` to import__ S3 bucket request payment configuration using the `bucket` or using the `bucket` and `expected_bucket_owner` separated by a comma (`,`). For example:
 * 
 * If the owner (account ID) of the source bucket is the same account used to configure the AWS Provider, import using the `bucket`:
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketRequestPaymentConfigurationV2:BucketRequestPaymentConfigurationV2 example bucket-name
 * ```
 *  If the owner (account ID) of the source bucket differs from the account used to configure the AWS Provider, import using the `bucket` and `expected_bucket_owner` separated by a comma (`,`):
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketRequestPaymentConfigurationV2:BucketRequestPaymentConfigurationV2 example bucket-name,123456789012
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketRequestPaymentConfigurationV2:BucketRequestPaymentConfigurationV2")
public class BucketRequestPaymentConfigurationV2 extends com.pulumi.resources.CustomResource {
    /**
     * Name of the bucket.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Account ID of the expected bucket owner.
     * 
     */
    @Export(name="expectedBucketOwner", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expectedBucketOwner;

    /**
     * @return Account ID of the expected bucket owner.
     * 
     */
    public Output<Optional<String>> expectedBucketOwner() {
        return Codegen.optional(this.expectedBucketOwner);
    }
    /**
     * Specifies who pays for the download and request fees. Valid values: `BucketOwner`, `Requester`.
     * 
     */
    @Export(name="payer", refs={String.class}, tree="[0]")
    private Output<String> payer;

    /**
     * @return Specifies who pays for the download and request fees. Valid values: `BucketOwner`, `Requester`.
     * 
     */
    public Output<String> payer() {
        return this.payer;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketRequestPaymentConfigurationV2(String name) {
        this(name, BucketRequestPaymentConfigurationV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketRequestPaymentConfigurationV2(String name, BucketRequestPaymentConfigurationV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketRequestPaymentConfigurationV2(String name, BucketRequestPaymentConfigurationV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketRequestPaymentConfigurationV2:BucketRequestPaymentConfigurationV2", name, args == null ? BucketRequestPaymentConfigurationV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketRequestPaymentConfigurationV2(String name, Output<String> id, @Nullable BucketRequestPaymentConfigurationV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketRequestPaymentConfigurationV2:BucketRequestPaymentConfigurationV2", name, state, makeResourceOptions(options, id));
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
    public static BucketRequestPaymentConfigurationV2 get(String name, Output<String> id, @Nullable BucketRequestPaymentConfigurationV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketRequestPaymentConfigurationV2(name, id, state, options);
    }
}
