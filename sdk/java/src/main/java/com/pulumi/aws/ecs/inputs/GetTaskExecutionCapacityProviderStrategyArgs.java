// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaskExecutionCapacityProviderStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetTaskExecutionCapacityProviderStrategyArgs Empty = new GetTaskExecutionCapacityProviderStrategyArgs();

    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. Defaults to `0`.
     * 
     */
    @Import(name="base")
    private @Nullable Output<Integer> base;

    /**
     * @return The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * Name of the capacity provider.
     * 
     */
    @Import(name="capacityProvider", required=true)
    private Output<String> capacityProvider;

    /**
     * @return Name of the capacity provider.
     * 
     */
    public Output<String> capacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider. The `weight` value is taken into consideration after the `base` count of tasks has been satisfied. Defaults to `0`.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The relative percentage of the total number of launched tasks that should use the specified capacity provider. The `weight` value is taken into consideration after the `base` count of tasks has been satisfied. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private GetTaskExecutionCapacityProviderStrategyArgs() {}

    private GetTaskExecutionCapacityProviderStrategyArgs(GetTaskExecutionCapacityProviderStrategyArgs $) {
        this.base = $.base;
        this.capacityProvider = $.capacityProvider;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskExecutionCapacityProviderStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskExecutionCapacityProviderStrategyArgs $;

        public Builder() {
            $ = new GetTaskExecutionCapacityProviderStrategyArgs();
        }

        public Builder(GetTaskExecutionCapacityProviderStrategyArgs defaults) {
            $ = new GetTaskExecutionCapacityProviderStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param base The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder base(@Nullable Output<Integer> base) {
            $.base = base;
            return this;
        }

        /**
         * @param base The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder base(Integer base) {
            return base(Output.of(base));
        }

        /**
         * @param capacityProvider Name of the capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder capacityProvider(Output<String> capacityProvider) {
            $.capacityProvider = capacityProvider;
            return this;
        }

        /**
         * @param capacityProvider Name of the capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder capacityProvider(String capacityProvider) {
            return capacityProvider(Output.of(capacityProvider));
        }

        /**
         * @param weight The relative percentage of the total number of launched tasks that should use the specified capacity provider. The `weight` value is taken into consideration after the `base` count of tasks has been satisfied. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The relative percentage of the total number of launched tasks that should use the specified capacity provider. The `weight` value is taken into consideration after the `base` count of tasks has been satisfied. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public GetTaskExecutionCapacityProviderStrategyArgs build() {
            $.capacityProvider = Objects.requireNonNull($.capacityProvider, "expected parameter 'capacityProvider' to be non-null");
            return $;
        }
    }

}
