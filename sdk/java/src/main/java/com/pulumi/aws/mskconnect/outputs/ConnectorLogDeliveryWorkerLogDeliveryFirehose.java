// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorLogDeliveryWorkerLogDeliveryFirehose {
    /**
     * @return The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * 
     */
    private @Nullable String deliveryStream;
    /**
     * @return Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * 
     */
    private Boolean enabled;

    private ConnectorLogDeliveryWorkerLogDeliveryFirehose() {}
    /**
     * @return The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * 
     */
    public Optional<String> deliveryStream() {
        return Optional.ofNullable(this.deliveryStream);
    }
    /**
     * @return Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorLogDeliveryWorkerLogDeliveryFirehose defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deliveryStream;
        private Boolean enabled;
        public Builder() {}
        public Builder(ConnectorLogDeliveryWorkerLogDeliveryFirehose defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStream = defaults.deliveryStream;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder deliveryStream(@Nullable String deliveryStream) {
            this.deliveryStream = deliveryStream;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public ConnectorLogDeliveryWorkerLogDeliveryFirehose build() {
            final var o = new ConnectorLogDeliveryWorkerLogDeliveryFirehose();
            o.deliveryStream = deliveryStream;
            o.enabled = enabled;
            return o;
        }
    }
}
