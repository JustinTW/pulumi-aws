// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CrawlerHudiTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CrawlerHudiTargetArgs Empty = new CrawlerHudiTargetArgs();

    /**
     * The name of the connection to use to connect to the Hudi target.
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    /**
     * @return The name of the connection to use to connect to the Hudi target.
     * 
     */
    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * A list of glob patterns used to exclude from the crawl.
     * 
     */
    @Import(name="exclusions")
    private @Nullable Output<List<String>> exclusions;

    /**
     * @return A list of glob patterns used to exclude from the crawl.
     * 
     */
    public Optional<Output<List<String>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    /**
     * The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Hudi metadata folder in your Amazon S3 path. Used to limit the crawler run time. Valid values are between `1` and `20`.
     * 
     */
    @Import(name="maximumTraversalDepth", required=true)
    private Output<Integer> maximumTraversalDepth;

    /**
     * @return The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Hudi metadata folder in your Amazon S3 path. Used to limit the crawler run time. Valid values are between `1` and `20`.
     * 
     */
    public Output<Integer> maximumTraversalDepth() {
        return this.maximumTraversalDepth;
    }

    /**
     * One or more Amazon S3 paths that contains Hudi metadata folders as s3://bucket/prefix.
     * 
     */
    @Import(name="paths", required=true)
    private Output<List<String>> paths;

    /**
     * @return One or more Amazon S3 paths that contains Hudi metadata folders as s3://bucket/prefix.
     * 
     */
    public Output<List<String>> paths() {
        return this.paths;
    }

    private CrawlerHudiTargetArgs() {}

    private CrawlerHudiTargetArgs(CrawlerHudiTargetArgs $) {
        this.connectionName = $.connectionName;
        this.exclusions = $.exclusions;
        this.maximumTraversalDepth = $.maximumTraversalDepth;
        this.paths = $.paths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrawlerHudiTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrawlerHudiTargetArgs $;

        public Builder() {
            $ = new CrawlerHudiTargetArgs();
        }

        public Builder(CrawlerHudiTargetArgs defaults) {
            $ = new CrawlerHudiTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName The name of the connection to use to connect to the Hudi target.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName The name of the connection to use to connect to the Hudi target.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param exclusions A list of glob patterns used to exclude from the crawl.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(@Nullable Output<List<String>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        /**
         * @param exclusions A list of glob patterns used to exclude from the crawl.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(List<String> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        /**
         * @param exclusions A list of glob patterns used to exclude from the crawl.
         * 
         * @return builder
         * 
         */
        public Builder exclusions(String... exclusions) {
            return exclusions(List.of(exclusions));
        }

        /**
         * @param maximumTraversalDepth The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Hudi metadata folder in your Amazon S3 path. Used to limit the crawler run time. Valid values are between `1` and `20`.
         * 
         * @return builder
         * 
         */
        public Builder maximumTraversalDepth(Output<Integer> maximumTraversalDepth) {
            $.maximumTraversalDepth = maximumTraversalDepth;
            return this;
        }

        /**
         * @param maximumTraversalDepth The maximum depth of Amazon S3 paths that the crawler can traverse to discover the Hudi metadata folder in your Amazon S3 path. Used to limit the crawler run time. Valid values are between `1` and `20`.
         * 
         * @return builder
         * 
         */
        public Builder maximumTraversalDepth(Integer maximumTraversalDepth) {
            return maximumTraversalDepth(Output.of(maximumTraversalDepth));
        }

        /**
         * @param paths One or more Amazon S3 paths that contains Hudi metadata folders as s3://bucket/prefix.
         * 
         * @return builder
         * 
         */
        public Builder paths(Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths One or more Amazon S3 paths that contains Hudi metadata folders as s3://bucket/prefix.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths One or more Amazon S3 paths that contains Hudi metadata folders as s3://bucket/prefix.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        public CrawlerHudiTargetArgs build() {
            $.maximumTraversalDepth = Objects.requireNonNull($.maximumTraversalDepth, "expected parameter 'maximumTraversalDepth' to be non-null");
            $.paths = Objects.requireNonNull($.paths, "expected parameter 'paths' to be non-null");
            return $;
        }
    }

}
