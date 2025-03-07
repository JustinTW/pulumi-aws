// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.GetContainerRecipesFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContainerRecipesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContainerRecipesPlainArgs Empty = new GetContainerRecipesPlainArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetContainerRecipesFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetContainerRecipesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Owner of the container recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Owner of the container recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    private GetContainerRecipesPlainArgs() {}

    private GetContainerRecipesPlainArgs(GetContainerRecipesPlainArgs $) {
        this.filters = $.filters;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContainerRecipesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContainerRecipesPlainArgs $;

        public Builder() {
            $ = new GetContainerRecipesPlainArgs();
        }

        public Builder(GetContainerRecipesPlainArgs defaults) {
            $ = new GetContainerRecipesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetContainerRecipesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetContainerRecipesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param owner Owner of the container recipes. Valid values are `Self`, `Shared` and `Amazon`. Defaults to `Self`.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        public GetContainerRecipesPlainArgs build() {
            return $;
        }
    }

}
