// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProductArgs Empty = new ProductArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Description of the product.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the product.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Distributor (i.e., vendor) of the product.
     * 
     */
    @Import(name="distributor")
    private @Nullable Output<String> distributor;

    /**
     * @return Distributor (i.e., vendor) of the product.
     * 
     */
    public Optional<Output<String>> distributor() {
        return Optional.ofNullable(this.distributor);
    }

    /**
     * Name of the product.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the product.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Owner of the product.
     * 
     */
    @Import(name="owner", required=true)
    private Output<String> owner;

    /**
     * @return Owner of the product.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }

    /**
     * Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    @Import(name="provisioningArtifactParameters", required=true)
    private Output<ProductProvisioningArtifactParametersArgs> provisioningArtifactParameters;

    /**
     * @return Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
     * 
     */
    public Output<ProductProvisioningArtifactParametersArgs> provisioningArtifactParameters() {
        return this.provisioningArtifactParameters;
    }

    /**
     * Support information about the product.
     * 
     */
    @Import(name="supportDescription")
    private @Nullable Output<String> supportDescription;

    /**
     * @return Support information about the product.
     * 
     */
    public Optional<Output<String>> supportDescription() {
        return Optional.ofNullable(this.supportDescription);
    }

    /**
     * Contact email for product support.
     * 
     */
    @Import(name="supportEmail")
    private @Nullable Output<String> supportEmail;

    /**
     * @return Contact email for product support.
     * 
     */
    public Optional<Output<String>> supportEmail() {
        return Optional.ofNullable(this.supportEmail);
    }

    /**
     * Contact URL for product support.
     * 
     */
    @Import(name="supportUrl")
    private @Nullable Output<String> supportUrl;

    /**
     * @return Contact URL for product support.
     * 
     */
    public Optional<Output<String>> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    /**
     * Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ProductArgs() {}

    private ProductArgs(ProductArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.description = $.description;
        this.distributor = $.distributor;
        this.name = $.name;
        this.owner = $.owner;
        this.provisioningArtifactParameters = $.provisioningArtifactParameters;
        this.supportDescription = $.supportDescription;
        this.supportEmail = $.supportEmail;
        this.supportUrl = $.supportUrl;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductArgs $;

        public Builder() {
            $ = new ProductArgs();
        }

        public Builder(ProductArgs defaults) {
            $ = new ProductArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param description Description of the product.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the product.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param distributor Distributor (i.e., vendor) of the product.
         * 
         * @return builder
         * 
         */
        public Builder distributor(@Nullable Output<String> distributor) {
            $.distributor = distributor;
            return this;
        }

        /**
         * @param distributor Distributor (i.e., vendor) of the product.
         * 
         * @return builder
         * 
         */
        public Builder distributor(String distributor) {
            return distributor(Output.of(distributor));
        }

        /**
         * @param name Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the product.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Owner of the product.
         * 
         * @return builder
         * 
         */
        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Owner of the product.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param provisioningArtifactParameters Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactParameters(Output<ProductProvisioningArtifactParametersArgs> provisioningArtifactParameters) {
            $.provisioningArtifactParameters = provisioningArtifactParameters;
            return this;
        }

        /**
         * @param provisioningArtifactParameters Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder provisioningArtifactParameters(ProductProvisioningArtifactParametersArgs provisioningArtifactParameters) {
            return provisioningArtifactParameters(Output.of(provisioningArtifactParameters));
        }

        /**
         * @param supportDescription Support information about the product.
         * 
         * @return builder
         * 
         */
        public Builder supportDescription(@Nullable Output<String> supportDescription) {
            $.supportDescription = supportDescription;
            return this;
        }

        /**
         * @param supportDescription Support information about the product.
         * 
         * @return builder
         * 
         */
        public Builder supportDescription(String supportDescription) {
            return supportDescription(Output.of(supportDescription));
        }

        /**
         * @param supportEmail Contact email for product support.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(@Nullable Output<String> supportEmail) {
            $.supportEmail = supportEmail;
            return this;
        }

        /**
         * @param supportEmail Contact email for product support.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(String supportEmail) {
            return supportEmail(Output.of(supportEmail));
        }

        /**
         * @param supportUrl Contact URL for product support.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(@Nullable Output<String> supportUrl) {
            $.supportUrl = supportUrl;
            return this;
        }

        /**
         * @param supportUrl Contact URL for product support.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(String supportUrl) {
            return supportUrl(Output.of(supportUrl));
        }

        /**
         * @param tags Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to apply to the product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProductArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            $.provisioningArtifactParameters = Objects.requireNonNull($.provisioningArtifactParameters, "expected parameter 'provisioningArtifactParameters' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
