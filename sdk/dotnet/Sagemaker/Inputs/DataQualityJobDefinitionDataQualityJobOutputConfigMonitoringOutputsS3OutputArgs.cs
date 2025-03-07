// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Path to the filesystem where the batch transform data is available to the container. Defaults to `/opt/ml/processing/input`.
        /// </summary>
        [Input("localPath")]
        public Input<string>? LocalPath { get; set; }

        /// <summary>
        /// Whether to upload the results of the monitoring job continuously or after the job completes. Valid values are `Continuous` or `EndOfJob`
        /// </summary>
        [Input("s3UploadMode")]
        public Input<string>? S3UploadMode { get; set; }

        /// <summary>
        /// The Amazon S3 URI for the constraints resource.
        /// </summary>
        [Input("s3Uri", required: true)]
        public Input<string> S3Uri { get; set; } = null!;

        public DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs()
        {
        }
        public static new DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs Empty => new DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs();
    }
}
