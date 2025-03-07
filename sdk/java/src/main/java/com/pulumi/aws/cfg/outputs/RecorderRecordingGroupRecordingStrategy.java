// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecorderRecordingGroupRecordingStrategy {
    private @Nullable String useOnly;

    private RecorderRecordingGroupRecordingStrategy() {}
    public Optional<String> useOnly() {
        return Optional.ofNullable(this.useOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecorderRecordingGroupRecordingStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String useOnly;
        public Builder() {}
        public Builder(RecorderRecordingGroupRecordingStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useOnly = defaults.useOnly;
        }

        @CustomType.Setter
        public Builder useOnly(@Nullable String useOnly) {
            this.useOnly = useOnly;
            return this;
        }
        public RecorderRecordingGroupRecordingStrategy build() {
            final var o = new RecorderRecordingGroupRecordingStrategy();
            o.useOnly = useOnly;
            return o;
        }
    }
}
