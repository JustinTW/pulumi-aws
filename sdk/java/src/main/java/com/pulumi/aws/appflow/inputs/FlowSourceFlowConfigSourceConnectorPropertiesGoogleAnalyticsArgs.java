// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs Empty = new FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs();

    /**
     * Object specified in the flow destination.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return Object specified in the flow destination.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    private FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs() {}

    private FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs(FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs $) {
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs $;

        public Builder() {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs();
        }

        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs defaults) {
            $ = new FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param object Object specified in the flow destination.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Object specified in the flow destination.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public FlowSourceFlowConfigSourceConnectorPropertiesGoogleAnalyticsArgs build() {
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
