// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProvisionedProductOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductOutputArgs Empty = new ProvisionedProductOutputArgs();

    /**
     * The description of the output.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the output.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Parameter key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Parameter key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Parameter value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Parameter value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ProvisionedProductOutputArgs() {}

    private ProvisionedProductOutputArgs(ProvisionedProductOutputArgs $) {
        this.description = $.description;
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProvisionedProductOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProvisionedProductOutputArgs $;

        public Builder() {
            $ = new ProvisionedProductOutputArgs();
        }

        public Builder(ProvisionedProductOutputArgs defaults) {
            $ = new ProvisionedProductOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the output.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the output.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key Parameter key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Parameter key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProvisionedProductOutputArgs build() {
            return $;
        }
    }

}
