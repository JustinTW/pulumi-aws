// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Temporal filter settings. See Temporal Filter Settings
        /// </summary>
        [Input("temporalFilterSettings")]
        public Input<Inputs.ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsTemporalFilterSettingsArgs>? TemporalFilterSettings { get; set; }

        public ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs()
        {
        }
        public static new ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs Empty => new ChannelEncoderSettingsVideoDescriptionCodecSettingsH265SettingsFilterSettingsArgs();
    }
}
