// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleRuleLabelGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Label string.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public WebAclRuleRuleLabelGetArgs()
        {
        }
        public static new WebAclRuleRuleLabelGetArgs Empty => new WebAclRuleRuleLabelGetArgs();
    }
}
