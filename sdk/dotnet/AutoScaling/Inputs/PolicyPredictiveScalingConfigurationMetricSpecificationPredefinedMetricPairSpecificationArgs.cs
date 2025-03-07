// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Which metrics to use. There are two different types of metrics for each metric type: one is a load metric and one is a scaling metric. For example, if the metric type is `ASGCPUUtilization`, the Auto Scaling group's total CPU metric is used as the load metric, and the average CPU metric is used for the scaling metric. Valid values are `ASGCPUUtilization`, `ASGNetworkIn`, `ASGNetworkOut`, or `ALBRequestCount`.
        /// </summary>
        [Input("predefinedMetricType", required: true)]
        public Input<string> PredefinedMetricType { get; set; } = null!;

        /// <summary>
        /// Label that uniquely identifies a specific Application Load Balancer target group from which to determine the request count served by your Auto Scaling group.
        /// </summary>
        [Input("resourceLabel")]
        public Input<string>? ResourceLabel { get; set; }

        public PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs()
        {
        }
        public static new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs Empty => new PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecificationArgs();
    }
}
