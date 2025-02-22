// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime;

import com.pulumi.aws.chime.inputs.SdkvoiceGlobalSettingsVoiceConnectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class SdkvoiceGlobalSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SdkvoiceGlobalSettingsArgs Empty = new SdkvoiceGlobalSettingsArgs();

    /**
     * The Voice Connector settings. See voice_connector.
     * 
     */
    @Import(name="voiceConnector", required=true)
    private Output<SdkvoiceGlobalSettingsVoiceConnectorArgs> voiceConnector;

    /**
     * @return The Voice Connector settings. See voice_connector.
     * 
     */
    public Output<SdkvoiceGlobalSettingsVoiceConnectorArgs> voiceConnector() {
        return this.voiceConnector;
    }

    private SdkvoiceGlobalSettingsArgs() {}

    private SdkvoiceGlobalSettingsArgs(SdkvoiceGlobalSettingsArgs $) {
        this.voiceConnector = $.voiceConnector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SdkvoiceGlobalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SdkvoiceGlobalSettingsArgs $;

        public Builder() {
            $ = new SdkvoiceGlobalSettingsArgs();
        }

        public Builder(SdkvoiceGlobalSettingsArgs defaults) {
            $ = new SdkvoiceGlobalSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param voiceConnector The Voice Connector settings. See voice_connector.
         * 
         * @return builder
         * 
         */
        public Builder voiceConnector(Output<SdkvoiceGlobalSettingsVoiceConnectorArgs> voiceConnector) {
            $.voiceConnector = voiceConnector;
            return this;
        }

        /**
         * @param voiceConnector The Voice Connector settings. See voice_connector.
         * 
         * @return builder
         * 
         */
        public Builder voiceConnector(SdkvoiceGlobalSettingsVoiceConnectorArgs voiceConnector) {
            return voiceConnector(Output.of(voiceConnector));
        }

        public SdkvoiceGlobalSettingsArgs build() {
            $.voiceConnector = Objects.requireNonNull($.voiceConnector, "expected parameter 'voiceConnector' to be non-null");
            return $;
        }
    }

}
