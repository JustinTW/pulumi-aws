// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class GetGatewayRouteSpecGrpcRouteActionResult
    {
        public readonly ImmutableArray<Outputs.GetGatewayRouteSpecGrpcRouteActionTargetResult> Targets;

        [OutputConstructor]
        private GetGatewayRouteSpecGrpcRouteActionResult(ImmutableArray<Outputs.GetGatewayRouteSpecGrpcRouteActionTargetResult> targets)
        {
            Targets = targets;
        }
    }
}
