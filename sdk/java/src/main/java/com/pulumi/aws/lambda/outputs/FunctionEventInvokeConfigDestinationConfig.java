// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.aws.lambda.outputs.FunctionEventInvokeConfigDestinationConfigOnFailure;
import com.pulumi.aws.lambda.outputs.FunctionEventInvokeConfigDestinationConfigOnSuccess;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionEventInvokeConfigDestinationConfig {
    /**
     * @return Configuration block with destination configuration for failed asynchronous invocations. See below for details.
     * 
     */
    private @Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure;
    /**
     * @return Configuration block with destination configuration for successful asynchronous invocations. See below for details.
     * 
     */
    private @Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess;

    private FunctionEventInvokeConfigDestinationConfig() {}
    /**
     * @return Configuration block with destination configuration for failed asynchronous invocations. See below for details.
     * 
     */
    public Optional<FunctionEventInvokeConfigDestinationConfigOnFailure> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }
    /**
     * @return Configuration block with destination configuration for successful asynchronous invocations. See below for details.
     * 
     */
    public Optional<FunctionEventInvokeConfigDestinationConfigOnSuccess> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigDestinationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure;
        private @Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess;
        public Builder() {}
        public Builder(FunctionEventInvokeConfigDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onSuccess = defaults.onSuccess;
        }

        @CustomType.Setter
        public Builder onFailure(@Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }
        @CustomType.Setter
        public Builder onSuccess(@Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }
        public FunctionEventInvokeConfigDestinationConfig build() {
            final var o = new FunctionEventInvokeConfigDestinationConfig();
            o.onFailure = onFailure;
            o.onSuccess = onSuccess;
            return o;
        }
    }
}
