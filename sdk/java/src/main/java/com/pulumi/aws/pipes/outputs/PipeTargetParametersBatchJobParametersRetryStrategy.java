// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipeTargetParametersBatchJobParametersRetryStrategy {
    /**
     * @return The number of times to move a job to the RUNNABLE status. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value. Maximum value of 10.
     * 
     */
    private @Nullable Integer attempts;

    private PipeTargetParametersBatchJobParametersRetryStrategy() {}
    /**
     * @return The number of times to move a job to the RUNNABLE status. If the value of attempts is greater than one, the job is retried on failure the same number of attempts as the value. Maximum value of 10.
     * 
     */
    public Optional<Integer> attempts() {
        return Optional.ofNullable(this.attempts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipeTargetParametersBatchJobParametersRetryStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer attempts;
        public Builder() {}
        public Builder(PipeTargetParametersBatchJobParametersRetryStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attempts = defaults.attempts;
        }

        @CustomType.Setter
        public Builder attempts(@Nullable Integer attempts) {
            this.attempts = attempts;
            return this;
        }
        public PipeTargetParametersBatchJobParametersRetryStrategy build() {
            final var o = new PipeTargetParametersBatchJobParametersRetryStrategy();
            o.attempts = attempts;
            return o;
        }
    }
}
