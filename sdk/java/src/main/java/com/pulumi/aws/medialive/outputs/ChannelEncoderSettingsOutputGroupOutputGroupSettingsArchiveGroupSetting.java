// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettings;
import com.pulumi.aws.medialive.outputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestination;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSetting {
    /**
     * @return Parameters that control the interactions with the CDN. See Archive CDN Settings for more details.
     * 
     */
    private @Nullable ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettings archiveCdnSettings;
    /**
     * @return A director and base filename where archive files should be written. See Destination for more details.
     * 
     */
    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestination destination;
    /**
     * @return Number of seconds to write to archive file before closing and starting a new one.
     * 
     */
    private @Nullable Integer rolloverInterval;

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSetting() {}
    /**
     * @return Parameters that control the interactions with the CDN. See Archive CDN Settings for more details.
     * 
     */
    public Optional<ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettings> archiveCdnSettings() {
        return Optional.ofNullable(this.archiveCdnSettings);
    }
    /**
     * @return A director and base filename where archive files should be written. See Destination for more details.
     * 
     */
    public ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestination destination() {
        return this.destination;
    }
    /**
     * @return Number of seconds to write to archive file before closing and starting a new one.
     * 
     */
    public Optional<Integer> rolloverInterval() {
        return Optional.ofNullable(this.rolloverInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettings archiveCdnSettings;
        private ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestination destination;
        private @Nullable Integer rolloverInterval;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveCdnSettings = defaults.archiveCdnSettings;
    	      this.destination = defaults.destination;
    	      this.rolloverInterval = defaults.rolloverInterval;
        }

        @CustomType.Setter
        public Builder archiveCdnSettings(@Nullable ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingArchiveCdnSettings archiveCdnSettings) {
            this.archiveCdnSettings = archiveCdnSettings;
            return this;
        }
        @CustomType.Setter
        public Builder destination(ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSettingDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder rolloverInterval(@Nullable Integer rolloverInterval) {
            this.rolloverInterval = rolloverInterval;
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSetting build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsArchiveGroupSetting();
            o.archiveCdnSettings = archiveCdnSettings;
            o.destination = destination;
            o.rolloverInterval = rolloverInterval;
            return o;
        }
    }
}
