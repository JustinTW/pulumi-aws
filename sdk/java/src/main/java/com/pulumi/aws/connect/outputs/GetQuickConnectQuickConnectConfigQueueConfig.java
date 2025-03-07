// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetQuickConnectQuickConnectConfigQueueConfig {
    /**
     * @return Identifier of the contact flow.
     * 
     */
    private String contactFlowId;
    /**
     * @return Identifier for the queue.
     * 
     */
    private String queueId;

    private GetQuickConnectQuickConnectConfigQueueConfig() {}
    /**
     * @return Identifier of the contact flow.
     * 
     */
    public String contactFlowId() {
        return this.contactFlowId;
    }
    /**
     * @return Identifier for the queue.
     * 
     */
    public String queueId() {
        return this.queueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectQuickConnectConfigQueueConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contactFlowId;
        private String queueId;
        public Builder() {}
        public Builder(GetQuickConnectQuickConnectConfigQueueConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowId = defaults.contactFlowId;
    	      this.queueId = defaults.queueId;
        }

        @CustomType.Setter
        public Builder contactFlowId(String contactFlowId) {
            this.contactFlowId = Objects.requireNonNull(contactFlowId);
            return this;
        }
        @CustomType.Setter
        public Builder queueId(String queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }
        public GetQuickConnectQuickConnectConfigQueueConfig build() {
            final var o = new GetQuickConnectQuickConnectConfigQueueConfig();
            o.contactFlowId = contactFlowId;
            o.queueId = queueId;
            return o;
        }
    }
}
