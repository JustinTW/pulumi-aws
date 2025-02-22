// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApiGateway
{
    /// <summary>
    /// Provides an HTTP Method Response for an API Gateway Resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myDemoAPI = new Aws.ApiGateway.RestApi("myDemoAPI", new()
    ///     {
    ///         Description = "This is my API for demonstration purposes",
    ///     });
    /// 
    ///     var myDemoResource = new Aws.ApiGateway.Resource("myDemoResource", new()
    ///     {
    ///         RestApi = myDemoAPI.Id,
    ///         ParentId = myDemoAPI.RootResourceId,
    ///         PathPart = "mydemoresource",
    ///     });
    /// 
    ///     var myDemoMethod = new Aws.ApiGateway.Method("myDemoMethod", new()
    ///     {
    ///         RestApi = myDemoAPI.Id,
    ///         ResourceId = myDemoResource.Id,
    ///         HttpMethod = "GET",
    ///         Authorization = "NONE",
    ///     });
    /// 
    ///     var myDemoIntegration = new Aws.ApiGateway.Integration("myDemoIntegration", new()
    ///     {
    ///         RestApi = myDemoAPI.Id,
    ///         ResourceId = myDemoResource.Id,
    ///         HttpMethod = myDemoMethod.HttpMethod,
    ///         Type = "MOCK",
    ///     });
    /// 
    ///     var response200 = new Aws.ApiGateway.MethodResponse("response200", new()
    ///     {
    ///         RestApi = myDemoAPI.Id,
    ///         ResourceId = myDemoResource.Id,
    ///         HttpMethod = myDemoMethod.HttpMethod,
    ///         StatusCode = "200",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_api_gateway_method_response` using `REST-API-ID/RESOURCE-ID/HTTP-METHOD/STATUS-CODE`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:apigateway/methodResponse:MethodResponse example 12345abcde/67890fghij/GET/200
    /// ```
    /// </summary>
    [AwsResourceType("aws:apigateway/methodResponse:MethodResponse")]
    public partial class MethodResponse : global::Pulumi.CustomResource
    {
        /// <summary>
        /// HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        /// </summary>
        [Output("httpMethod")]
        public Output<string> HttpMethod { get; private set; } = null!;

        /// <summary>
        /// API resource ID
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;

        /// <summary>
        /// Map of the API models used for the response's content type
        /// </summary>
        [Output("responseModels")]
        public Output<ImmutableDictionary<string, string>?> ResponseModels { get; private set; } = null!;

        /// <summary>
        /// Map of response parameters that can be sent to the caller.
        /// For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
        /// would define that the header `X-Some-Header` can be provided on the response.
        /// </summary>
        [Output("responseParameters")]
        public Output<ImmutableDictionary<string, bool>?> ResponseParameters { get; private set; } = null!;

        /// <summary>
        /// ID of the associated REST API
        /// </summary>
        [Output("restApi")]
        public Output<string> RestApi { get; private set; } = null!;

        /// <summary>
        /// HTTP status code
        /// </summary>
        [Output("statusCode")]
        public Output<string> StatusCode { get; private set; } = null!;


        /// <summary>
        /// Create a MethodResponse resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MethodResponse(string name, MethodResponseArgs args, CustomResourceOptions? options = null)
            : base("aws:apigateway/methodResponse:MethodResponse", name, args ?? new MethodResponseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MethodResponse(string name, Input<string> id, MethodResponseState? state = null, CustomResourceOptions? options = null)
            : base("aws:apigateway/methodResponse:MethodResponse", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MethodResponse resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MethodResponse Get(string name, Input<string> id, MethodResponseState? state = null, CustomResourceOptions? options = null)
        {
            return new MethodResponse(name, id, state, options);
        }
    }

    public sealed class MethodResponseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        /// </summary>
        [Input("httpMethod", required: true)]
        public Input<string> HttpMethod { get; set; } = null!;

        /// <summary>
        /// API resource ID
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        [Input("responseModels")]
        private InputMap<string>? _responseModels;

        /// <summary>
        /// Map of the API models used for the response's content type
        /// </summary>
        public InputMap<string> ResponseModels
        {
            get => _responseModels ?? (_responseModels = new InputMap<string>());
            set => _responseModels = value;
        }

        [Input("responseParameters")]
        private InputMap<bool>? _responseParameters;

        /// <summary>
        /// Map of response parameters that can be sent to the caller.
        /// For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
        /// would define that the header `X-Some-Header` can be provided on the response.
        /// </summary>
        public InputMap<bool> ResponseParameters
        {
            get => _responseParameters ?? (_responseParameters = new InputMap<bool>());
            set => _responseParameters = value;
        }

        /// <summary>
        /// ID of the associated REST API
        /// </summary>
        [Input("restApi", required: true)]
        public Input<string> RestApi { get; set; } = null!;

        /// <summary>
        /// HTTP status code
        /// </summary>
        [Input("statusCode", required: true)]
        public Input<string> StatusCode { get; set; } = null!;

        public MethodResponseArgs()
        {
        }
        public static new MethodResponseArgs Empty => new MethodResponseArgs();
    }

    public sealed class MethodResponseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
        /// </summary>
        [Input("httpMethod")]
        public Input<string>? HttpMethod { get; set; }

        /// <summary>
        /// API resource ID
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        [Input("responseModels")]
        private InputMap<string>? _responseModels;

        /// <summary>
        /// Map of the API models used for the response's content type
        /// </summary>
        public InputMap<string> ResponseModels
        {
            get => _responseModels ?? (_responseModels = new InputMap<string>());
            set => _responseModels = value;
        }

        [Input("responseParameters")]
        private InputMap<bool>? _responseParameters;

        /// <summary>
        /// Map of response parameters that can be sent to the caller.
        /// For example: `response_parameters = { "method.response.header.X-Some-Header" = true }`
        /// would define that the header `X-Some-Header` can be provided on the response.
        /// </summary>
        public InputMap<bool> ResponseParameters
        {
            get => _responseParameters ?? (_responseParameters = new InputMap<bool>());
            set => _responseParameters = value;
        }

        /// <summary>
        /// ID of the associated REST API
        /// </summary>
        [Input("restApi")]
        public Input<string>? RestApi { get; set; }

        /// <summary>
        /// HTTP status code
        /// </summary>
        [Input("statusCode")]
        public Input<string>? StatusCode { get; set; }

        public MethodResponseState()
        {
        }
        public static new MethodResponseState Empty => new MethodResponseState();
    }
}
