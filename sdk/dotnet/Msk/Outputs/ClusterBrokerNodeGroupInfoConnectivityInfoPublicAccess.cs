// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Outputs
{

    [OutputType]
    public sealed class ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess
    {
        /// <summary>
        /// Public access type. Valid values: `DISABLED`, `SERVICE_PROVIDED_EIPS`.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess(string? type)
        {
            Type = type;
        }
    }
}
