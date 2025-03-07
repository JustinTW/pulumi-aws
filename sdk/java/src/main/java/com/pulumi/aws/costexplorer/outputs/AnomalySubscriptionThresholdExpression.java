// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionAnd;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionCostCategory;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionDimension;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionNot;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionOr;
import com.pulumi.aws.costexplorer.outputs.AnomalySubscriptionThresholdExpressionTags;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnomalySubscriptionThresholdExpression {
    /**
     * @return Return results that match both Dimension objects.
     * 
     */
    private @Nullable List<AnomalySubscriptionThresholdExpressionAnd> ands;
    /**
     * @return Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionCostCategory costCategory;
    /**
     * @return Configuration block for the specific Dimension to use for.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionDimension dimension;
    /**
     * @return Return results that match both Dimension object.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionNot not;
    /**
     * @return Return results that match both Dimension object.
     * 
     */
    private @Nullable List<AnomalySubscriptionThresholdExpressionOr> ors;
    /**
     * @return Configuration block for the specific Tag to use for. See Tags below.
     * 
     */
    private @Nullable AnomalySubscriptionThresholdExpressionTags tags;

    private AnomalySubscriptionThresholdExpression() {}
    /**
     * @return Return results that match both Dimension objects.
     * 
     */
    public List<AnomalySubscriptionThresholdExpressionAnd> ands() {
        return this.ands == null ? List.of() : this.ands;
    }
    /**
     * @return Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionCostCategory> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }
    /**
     * @return Configuration block for the specific Dimension to use for.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return Return results that match both Dimension object.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionNot> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return Return results that match both Dimension object.
     * 
     */
    public List<AnomalySubscriptionThresholdExpressionOr> ors() {
        return this.ors == null ? List.of() : this.ors;
    }
    /**
     * @return Configuration block for the specific Tag to use for. See Tags below.
     * 
     */
    public Optional<AnomalySubscriptionThresholdExpressionTags> tags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalySubscriptionThresholdExpression defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AnomalySubscriptionThresholdExpressionAnd> ands;
        private @Nullable AnomalySubscriptionThresholdExpressionCostCategory costCategory;
        private @Nullable AnomalySubscriptionThresholdExpressionDimension dimension;
        private @Nullable AnomalySubscriptionThresholdExpressionNot not;
        private @Nullable List<AnomalySubscriptionThresholdExpressionOr> ors;
        private @Nullable AnomalySubscriptionThresholdExpressionTags tags;
        public Builder() {}
        public Builder(AnomalySubscriptionThresholdExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
    	      this.costCategory = defaults.costCategory;
    	      this.dimension = defaults.dimension;
    	      this.not = defaults.not;
    	      this.ors = defaults.ors;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder ands(@Nullable List<AnomalySubscriptionThresholdExpressionAnd> ands) {
            this.ands = ands;
            return this;
        }
        public Builder ands(AnomalySubscriptionThresholdExpressionAnd... ands) {
            return ands(List.of(ands));
        }
        @CustomType.Setter
        public Builder costCategory(@Nullable AnomalySubscriptionThresholdExpressionCostCategory costCategory) {
            this.costCategory = costCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dimension(@Nullable AnomalySubscriptionThresholdExpressionDimension dimension) {
            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder not(@Nullable AnomalySubscriptionThresholdExpressionNot not) {
            this.not = not;
            return this;
        }
        @CustomType.Setter
        public Builder ors(@Nullable List<AnomalySubscriptionThresholdExpressionOr> ors) {
            this.ors = ors;
            return this;
        }
        public Builder ors(AnomalySubscriptionThresholdExpressionOr... ors) {
            return ors(List.of(ors));
        }
        @CustomType.Setter
        public Builder tags(@Nullable AnomalySubscriptionThresholdExpressionTags tags) {
            this.tags = tags;
            return this;
        }
        public AnomalySubscriptionThresholdExpression build() {
            final var o = new AnomalySubscriptionThresholdExpression();
            o.ands = ands;
            o.costCategory = costCategory;
            o.dimension = dimension;
            o.not = not;
            o.ors = ors;
            o.tags = tags;
            return o;
        }
    }
}
