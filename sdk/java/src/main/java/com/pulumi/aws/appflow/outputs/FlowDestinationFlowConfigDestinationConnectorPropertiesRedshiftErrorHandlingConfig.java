// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig {
    /**
     * @return Name of the Amazon S3 bucket.
     * 
     */
    private @Nullable String bucketName;
    /**
     * @return Amazon S3 bucket prefix.
     * 
     */
    private @Nullable String bucketPrefix;
    /**
     * @return If the flow should fail after the first instance of a failure when attempting to place data in the destination.
     * 
     */
    private @Nullable Boolean failOnFirstDestinationError;

    private FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig() {}
    /**
     * @return Name of the Amazon S3 bucket.
     * 
     */
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * @return Amazon S3 bucket prefix.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return If the flow should fail after the first instance of a failure when attempting to place data in the destination.
     * 
     */
    public Optional<Boolean> failOnFirstDestinationError() {
        return Optional.ofNullable(this.failOnFirstDestinationError);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable Boolean failOnFirstDestinationError;
        public Builder() {}
        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.failOnFirstDestinationError = defaults.failOnFirstDestinationError;
        }

        @CustomType.Setter
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        @CustomType.Setter
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder failOnFirstDestinationError(@Nullable Boolean failOnFirstDestinationError) {
            this.failOnFirstDestinationError = failOnFirstDestinationError;
            return this;
        }
        public FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig build() {
            final var o = new FlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftErrorHandlingConfig();
            o.bucketName = bucketName;
            o.bucketPrefix = bucketPrefix;
            o.failOnFirstDestinationError = failOnFirstDestinationError;
            return o;
        }
    }
}
