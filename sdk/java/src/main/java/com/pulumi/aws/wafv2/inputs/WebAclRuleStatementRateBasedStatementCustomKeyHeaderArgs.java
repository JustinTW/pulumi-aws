// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs Empty = new WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs();

    /**
     * The name of the header to use.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the header to use.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `text_transformation` above for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `text_transformation` above for details.
     * 
     */
    public Output<List<WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs() {}

    private WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs(WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs $) {
        this.name = $.name;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the header to use.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the header to use.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `text_transformation` above for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `text_transformation` above for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `text_transformation` above for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
