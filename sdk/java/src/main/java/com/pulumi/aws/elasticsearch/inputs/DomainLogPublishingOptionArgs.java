// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainLogPublishingOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainLogPublishingOptionArgs Empty = new DomainLogPublishingOptionArgs();

    /**
     * ARN of the Cloudwatch log group to which log needs to be published.
     * 
     */
    @Import(name="cloudwatchLogGroupArn", required=true)
    private Output<String> cloudwatchLogGroupArn;

    /**
     * @return ARN of the Cloudwatch log group to which log needs to be published.
     * 
     */
    public Output<String> cloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }

    /**
     * Whether given log publishing option is enabled or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether given log publishing option is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
     * 
     */
    @Import(name="logType", required=true)
    private Output<String> logType;

    /**
     * @return Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
     * 
     */
    public Output<String> logType() {
        return this.logType;
    }

    private DomainLogPublishingOptionArgs() {}

    private DomainLogPublishingOptionArgs(DomainLogPublishingOptionArgs $) {
        this.cloudwatchLogGroupArn = $.cloudwatchLogGroupArn;
        this.enabled = $.enabled;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainLogPublishingOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainLogPublishingOptionArgs $;

        public Builder() {
            $ = new DomainLogPublishingOptionArgs();
        }

        public Builder(DomainLogPublishingOptionArgs defaults) {
            $ = new DomainLogPublishingOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchLogGroupArn ARN of the Cloudwatch log group to which log needs to be published.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogGroupArn(Output<String> cloudwatchLogGroupArn) {
            $.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        /**
         * @param cloudwatchLogGroupArn ARN of the Cloudwatch log group to which log needs to be published.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            return cloudwatchLogGroupArn(Output.of(cloudwatchLogGroupArn));
        }

        /**
         * @param enabled Whether given log publishing option is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether given log publishing option is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param logType Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
         * 
         * @return builder
         * 
         */
        public Builder logType(Output<String> logType) {
            $.logType = logType;
            return this;
        }

        /**
         * @param logType Type of Elasticsearch log. Valid values: `INDEX_SLOW_LOGS`, `SEARCH_SLOW_LOGS`, `ES_APPLICATION_LOGS`, `AUDIT_LOGS`.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            return logType(Output.of(logType));
        }

        public DomainLogPublishingOptionArgs build() {
            $.cloudwatchLogGroupArn = Objects.requireNonNull($.cloudwatchLogGroupArn, "expected parameter 'cloudwatchLogGroupArn' to be non-null");
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            return $;
        }
    }

}
