// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceStorageConfigStorageConfigKinesisStreamConfig {
    /**
     * @return The Amazon Resource Name (ARN) of the data stream.
     * 
     */
    private String streamArn;

    private InstanceStorageConfigStorageConfigKinesisStreamConfig() {}
    /**
     * @return The Amazon Resource Name (ARN) of the data stream.
     * 
     */
    public String streamArn() {
        return this.streamArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStorageConfigStorageConfigKinesisStreamConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String streamArn;
        public Builder() {}
        public Builder(InstanceStorageConfigStorageConfigKinesisStreamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamArn = defaults.streamArn;
        }

        @CustomType.Setter
        public Builder streamArn(String streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }
        public InstanceStorageConfigStorageConfigKinesisStreamConfig build() {
            final var o = new InstanceStorageConfigStorageConfigKinesisStreamConfig();
            o.streamArn = streamArn;
            return o;
        }
    }
}
