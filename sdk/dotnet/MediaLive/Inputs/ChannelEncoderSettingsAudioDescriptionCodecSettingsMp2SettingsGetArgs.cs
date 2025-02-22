// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MediaLive.Inputs
{

    public sealed class ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Average bitrate in bits/second.
        /// </summary>
        [Input("bitrate")]
        public Input<double>? Bitrate { get; set; }

        /// <summary>
        /// Mono, Stereo, or 5.1 channel layout.
        /// </summary>
        [Input("codingMode")]
        public Input<string>? CodingMode { get; set; }

        /// <summary>
        /// Sample rate in Hz.
        /// </summary>
        [Input("sampleRate")]
        public Input<double>? SampleRate { get; set; }

        public ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsGetArgs()
        {
        }
        public static new ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsGetArgs Empty => new ChannelEncoderSettingsAudioDescriptionCodecSettingsMp2SettingsGetArgs();
    }
}
