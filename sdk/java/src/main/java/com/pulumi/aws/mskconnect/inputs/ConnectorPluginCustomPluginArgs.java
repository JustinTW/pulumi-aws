// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ConnectorPluginCustomPluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorPluginCustomPluginArgs Empty = new ConnectorPluginCustomPluginArgs();

    /**
     * The Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the custom plugin.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The revision of the custom plugin.
     * 
     */
    @Import(name="revision", required=true)
    private Output<Integer> revision;

    /**
     * @return The revision of the custom plugin.
     * 
     */
    public Output<Integer> revision() {
        return this.revision;
    }

    private ConnectorPluginCustomPluginArgs() {}

    private ConnectorPluginCustomPluginArgs(ConnectorPluginCustomPluginArgs $) {
        this.arn = $.arn;
        this.revision = $.revision;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorPluginCustomPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorPluginCustomPluginArgs $;

        public Builder() {
            $ = new ConnectorPluginCustomPluginArgs();
        }

        public Builder(ConnectorPluginCustomPluginArgs defaults) {
            $ = new ConnectorPluginCustomPluginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the custom plugin.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the custom plugin.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param revision The revision of the custom plugin.
         * 
         * @return builder
         * 
         */
        public Builder revision(Output<Integer> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision The revision of the custom plugin.
         * 
         * @return builder
         * 
         */
        public Builder revision(Integer revision) {
            return revision(Output.of(revision));
        }

        public ConnectorPluginCustomPluginArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            return $;
        }
    }

}
