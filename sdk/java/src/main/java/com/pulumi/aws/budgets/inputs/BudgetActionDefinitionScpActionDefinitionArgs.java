// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BudgetActionDefinitionScpActionDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionScpActionDefinitionArgs Empty = new BudgetActionDefinitionScpActionDefinitionArgs();

    /**
     * The policy ID attached.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return The policy ID attached.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * A list of target IDs.
     * 
     */
    @Import(name="targetIds", required=true)
    private Output<List<String>> targetIds;

    /**
     * @return A list of target IDs.
     * 
     */
    public Output<List<String>> targetIds() {
        return this.targetIds;
    }

    private BudgetActionDefinitionScpActionDefinitionArgs() {}

    private BudgetActionDefinitionScpActionDefinitionArgs(BudgetActionDefinitionScpActionDefinitionArgs $) {
        this.policyId = $.policyId;
        this.targetIds = $.targetIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetActionDefinitionScpActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetActionDefinitionScpActionDefinitionArgs $;

        public Builder() {
            $ = new BudgetActionDefinitionScpActionDefinitionArgs();
        }

        public Builder(BudgetActionDefinitionScpActionDefinitionArgs defaults) {
            $ = new BudgetActionDefinitionScpActionDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyId The policy ID attached.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The policy ID attached.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param targetIds A list of target IDs.
         * 
         * @return builder
         * 
         */
        public Builder targetIds(Output<List<String>> targetIds) {
            $.targetIds = targetIds;
            return this;
        }

        /**
         * @param targetIds A list of target IDs.
         * 
         * @return builder
         * 
         */
        public Builder targetIds(List<String> targetIds) {
            return targetIds(Output.of(targetIds));
        }

        /**
         * @param targetIds A list of target IDs.
         * 
         * @return builder
         * 
         */
        public Builder targetIds(String... targetIds) {
            return targetIds(List.of(targetIds));
        }

        public BudgetActionDefinitionScpActionDefinitionArgs build() {
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.targetIds = Objects.requireNonNull($.targetIds, "expected parameter 'targetIds' to be non-null");
            return $;
        }
    }

}
