// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings {
    /**
     * @return Temporal filter settings. See Temporal Filter Settings
     * 
     */
    private @Nullable ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettings temporalFilterSettings;

    private ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings() {}
    /**
     * @return Temporal filter settings. See Temporal Filter Settings
     * 
     */
    public Optional<ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettings> temporalFilterSettings() {
        return Optional.ofNullable(this.temporalFilterSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettings temporalFilterSettings;
        public Builder() {}
        public Builder(ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.temporalFilterSettings = defaults.temporalFilterSettings;
        }

        @CustomType.Setter
        public Builder temporalFilterSettings(@Nullable ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettingsTemporalFilterSettings temporalFilterSettings) {
            this.temporalFilterSettings = temporalFilterSettings;
            return this;
        }
        public ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings build() {
            final var o = new ChannelEncoderSettingsVideoDescriptionCodecSettingsH264SettingsFilterSettings();
            o.temporalFilterSettings = temporalFilterSettings;
            return o;
        }
    }
}
