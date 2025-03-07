// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ivs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecordingConfigurationThumbnailConfiguration {
    /**
     * @return Thumbnail recording mode. Valid values: `DISABLED`, `INTERVAL`.
     * 
     */
    private @Nullable String recordingMode;
    /**
     * @return The targeted thumbnail-generation interval in seconds.
     * 
     */
    private @Nullable Integer targetIntervalSeconds;

    private RecordingConfigurationThumbnailConfiguration() {}
    /**
     * @return Thumbnail recording mode. Valid values: `DISABLED`, `INTERVAL`.
     * 
     */
    public Optional<String> recordingMode() {
        return Optional.ofNullable(this.recordingMode);
    }
    /**
     * @return The targeted thumbnail-generation interval in seconds.
     * 
     */
    public Optional<Integer> targetIntervalSeconds() {
        return Optional.ofNullable(this.targetIntervalSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordingConfigurationThumbnailConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String recordingMode;
        private @Nullable Integer targetIntervalSeconds;
        public Builder() {}
        public Builder(RecordingConfigurationThumbnailConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordingMode = defaults.recordingMode;
    	      this.targetIntervalSeconds = defaults.targetIntervalSeconds;
        }

        @CustomType.Setter
        public Builder recordingMode(@Nullable String recordingMode) {
            this.recordingMode = recordingMode;
            return this;
        }
        @CustomType.Setter
        public Builder targetIntervalSeconds(@Nullable Integer targetIntervalSeconds) {
            this.targetIntervalSeconds = targetIntervalSeconds;
            return this;
        }
        public RecordingConfigurationThumbnailConfiguration build() {
            final var o = new RecordingConfigurationThumbnailConfiguration();
            o.recordingMode = recordingMode;
            o.targetIntervalSeconds = targetIntervalSeconds;
            return o;
        }
    }
}
