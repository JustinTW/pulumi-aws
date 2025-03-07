// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketPublicAccessBlockArgs;
import com.pulumi.aws.s3.inputs.BucketPublicAccessBlockState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages S3 bucket-level Public Access Block configuration. For more information about these settings, see the [AWS S3 Block Public Access documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketPublicAccessBlock;
 * import com.pulumi.aws.s3.BucketPublicAccessBlockArgs;
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketPublicAccessBlock = new BucketPublicAccessBlock(&#34;exampleBucketPublicAccessBlock&#34;, BucketPublicAccessBlockArgs.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .blockPublicAcls(true)
 *             .blockPublicPolicy(true)
 *             .ignorePublicAcls(true)
 *             .restrictPublicBuckets(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_s3_bucket_public_access_block` using the bucket name. For example:
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock example my-bucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock")
public class BucketPublicAccessBlock extends com.pulumi.resources.CustomResource {
    /**
     * Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls will fail if the request includes an object ACL.
     * 
     */
    @Export(name="blockPublicAcls", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> blockPublicAcls;

    /**
     * @return Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
     * * PUT Object calls will fail if the request includes an object ACL.
     * 
     */
    public Output<Optional<Boolean>> blockPublicAcls() {
        return Codegen.optional(this.blockPublicAcls);
    }
    /**
     * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    @Export(name="blockPublicPolicy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> blockPublicPolicy;

    /**
     * @return Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    public Output<Optional<Boolean>> blockPublicPolicy() {
        return Codegen.optional(this.blockPublicPolicy);
    }
    /**
     * S3 Bucket to which this Public Access Block configuration should be applied.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return S3 Bucket to which this Public Access Block configuration should be applied.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore public ACLs on this bucket and any objects that it contains.
     * 
     */
    @Export(name="ignorePublicAcls", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignorePublicAcls;

    /**
     * @return Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore public ACLs on this bucket and any objects that it contains.
     * 
     */
    public Output<Optional<Boolean>> ignorePublicAcls() {
        return Codegen.optional(this.ignorePublicAcls);
    }
    /**
     * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
     * 
     */
    @Export(name="restrictPublicBuckets", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> restrictPublicBuckets;

    /**
     * @return Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
     * 
     */
    public Output<Optional<Boolean>> restrictPublicBuckets() {
        return Codegen.optional(this.restrictPublicBuckets);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketPublicAccessBlock(String name) {
        this(name, BucketPublicAccessBlockArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketPublicAccessBlock(String name, BucketPublicAccessBlockArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketPublicAccessBlock(String name, BucketPublicAccessBlockArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock", name, args == null ? BucketPublicAccessBlockArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketPublicAccessBlock(String name, Output<String> id, @Nullable BucketPublicAccessBlockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketPublicAccessBlock:BucketPublicAccessBlock", name, state, makeResourceOptions(options, id));
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
    public static BucketPublicAccessBlock get(String name, Output<String> id, @Nullable BucketPublicAccessBlockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketPublicAccessBlock(name, id, state, options);
    }
}
