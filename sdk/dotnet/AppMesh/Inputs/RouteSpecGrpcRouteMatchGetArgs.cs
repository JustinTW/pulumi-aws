// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class RouteSpecGrpcRouteMatchGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("metadatas")]
        private InputList<Inputs.RouteSpecGrpcRouteMatchMetadataGetArgs>? _metadatas;

        /// <summary>
        /// Data to match from the gRPC request.
        /// </summary>
        public InputList<Inputs.RouteSpecGrpcRouteMatchMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.RouteSpecGrpcRouteMatchMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// Method name to match from the request. If you specify a name, you must also specify a `service_name`.
        /// </summary>
        [Input("methodName")]
        public Input<string>? MethodName { get; set; }

        /// <summary>
        /// The port number to match from the request.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Header value sent by the client must begin with the specified characters.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Fully qualified domain name for the service to match from the request.
        /// </summary>
        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        public RouteSpecGrpcRouteMatchGetArgs()
        {
        }
        public static new RouteSpecGrpcRouteMatchGetArgs Empty => new RouteSpecGrpcRouteMatchGetArgs();
    }
}
