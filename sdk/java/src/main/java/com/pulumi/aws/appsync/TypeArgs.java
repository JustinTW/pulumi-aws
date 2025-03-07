// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypeArgs Empty = new TypeArgs();

    /**
     * GraphQL API ID.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return GraphQL API ID.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * The type definition.
     * 
     */
    @Import(name="definition", required=true)
    private Output<String> definition;

    /**
     * @return The type definition.
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }

    /**
     * The type format: `SDL` or `JSON`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The type format: `SDL` or `JSON`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    private TypeArgs() {}

    private TypeArgs(TypeArgs $) {
        this.apiId = $.apiId;
        this.definition = $.definition;
        this.format = $.format;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypeArgs $;

        public Builder() {
            $ = new TypeArgs();
        }

        public Builder(TypeArgs defaults) {
            $ = new TypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId GraphQL API ID.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId GraphQL API ID.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param definition The type definition.
         * 
         * @return builder
         * 
         */
        public Builder definition(Output<String> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition The type definition.
         * 
         * @return builder
         * 
         */
        public Builder definition(String definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param format The type format: `SDL` or `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The type format: `SDL` or `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        public TypeArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.definition = Objects.requireNonNull($.definition, "expected parameter 'definition' to be non-null");
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}
