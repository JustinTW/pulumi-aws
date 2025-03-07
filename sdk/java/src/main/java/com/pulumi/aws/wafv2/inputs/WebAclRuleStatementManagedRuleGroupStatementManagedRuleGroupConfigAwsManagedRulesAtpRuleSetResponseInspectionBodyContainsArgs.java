// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs();

    /**
     * Strings in the body of the response that indicate a failed login attempt.
     * 
     */
    @Import(name="failureStrings", required=true)
    private Output<List<String>> failureStrings;

    /**
     * @return Strings in the body of the response that indicate a failed login attempt.
     * 
     */
    public Output<List<String>> failureStrings() {
        return this.failureStrings;
    }

    /**
     * Strings in the body of the response that indicate a successful login attempt.
     * 
     */
    @Import(name="successStrings", required=true)
    private Output<List<String>> successStrings;

    /**
     * @return Strings in the body of the response that indicate a successful login attempt.
     * 
     */
    public Output<List<String>> successStrings() {
        return this.successStrings;
    }

    private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs $) {
        this.failureStrings = $.failureStrings;
        this.successStrings = $.successStrings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureStrings Strings in the body of the response that indicate a failed login attempt.
         * 
         * @return builder
         * 
         */
        public Builder failureStrings(Output<List<String>> failureStrings) {
            $.failureStrings = failureStrings;
            return this;
        }

        /**
         * @param failureStrings Strings in the body of the response that indicate a failed login attempt.
         * 
         * @return builder
         * 
         */
        public Builder failureStrings(List<String> failureStrings) {
            return failureStrings(Output.of(failureStrings));
        }

        /**
         * @param failureStrings Strings in the body of the response that indicate a failed login attempt.
         * 
         * @return builder
         * 
         */
        public Builder failureStrings(String... failureStrings) {
            return failureStrings(List.of(failureStrings));
        }

        /**
         * @param successStrings Strings in the body of the response that indicate a successful login attempt.
         * 
         * @return builder
         * 
         */
        public Builder successStrings(Output<List<String>> successStrings) {
            $.successStrings = successStrings;
            return this;
        }

        /**
         * @param successStrings Strings in the body of the response that indicate a successful login attempt.
         * 
         * @return builder
         * 
         */
        public Builder successStrings(List<String> successStrings) {
            return successStrings(Output.of(successStrings));
        }

        /**
         * @param successStrings Strings in the body of the response that indicate a successful login attempt.
         * 
         * @return builder
         * 
         */
        public Builder successStrings(String... successStrings) {
            return successStrings(List.of(successStrings));
        }

        public WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs build() {
            $.failureStrings = Objects.requireNonNull($.failureStrings, "expected parameter 'failureStrings' to be non-null");
            $.successStrings = Objects.requireNonNull($.successStrings, "expected parameter 'successStrings' to be non-null");
            return $;
        }
    }

}
