// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspection
    {
        public readonly Outputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionEmailField? EmailField;
        /// <summary>
        /// Details about your login page password field. See `password_field` for more details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionPasswordField? PasswordField;
        /// <summary>
        /// The payload type for your login endpoint, either JSON or form encoded.
        /// </summary>
        public readonly string PayloadType;
        /// <summary>
        /// Details about your login page username field. See `username_field` for more details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionUsernameField? UsernameField;

        [OutputConstructor]
        private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspection(
            Outputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionEmailField? emailField,

            Outputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionPasswordField? passwordField,

            string payloadType,

            Outputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionUsernameField? usernameField)
        {
            EmailField = emailField;
            PasswordField = passwordField;
            PayloadType = payloadType;
            UsernameField = usernameField;
        }
    }
}
