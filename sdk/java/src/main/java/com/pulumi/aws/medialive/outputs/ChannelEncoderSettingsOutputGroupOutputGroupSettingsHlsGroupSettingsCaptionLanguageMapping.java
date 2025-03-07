// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMapping {
    private Integer captionChannel;
    /**
     * @return Selects a specific three-letter language code from within an audio source.
     * 
     */
    private String languageCode;
    /**
     * @return Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     */
    private String languageDescription;

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMapping() {}
    public Integer captionChannel() {
        return this.captionChannel;
    }
    /**
     * @return Selects a specific three-letter language code from within an audio source.
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return Human readable information to indicate captions available for players (eg. English, or Spanish).
     * 
     */
    public String languageDescription() {
        return this.languageDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer captionChannel;
        private String languageCode;
        private String languageDescription;
        public Builder() {}
        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captionChannel = defaults.captionChannel;
    	      this.languageCode = defaults.languageCode;
    	      this.languageDescription = defaults.languageDescription;
        }

        @CustomType.Setter
        public Builder captionChannel(Integer captionChannel) {
            this.captionChannel = Objects.requireNonNull(captionChannel);
            return this;
        }
        @CustomType.Setter
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        @CustomType.Setter
        public Builder languageDescription(String languageDescription) {
            this.languageDescription = Objects.requireNonNull(languageDescription);
            return this;
        }
        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMapping build() {
            final var o = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMapping();
            o.captionChannel = captionChannel;
            o.languageCode = languageCode;
            o.languageDescription = languageDescription;
            return o;
        }
    }
}
