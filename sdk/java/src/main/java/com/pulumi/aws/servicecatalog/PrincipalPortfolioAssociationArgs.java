// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrincipalPortfolioAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrincipalPortfolioAssociationArgs Empty = new PrincipalPortfolioAssociationArgs();

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
     * Portfolio identifier.
     * 
     */
    @Import(name="portfolioId", required=true)
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> portfolioId() {
        return this.portfolioId;
    }

    /**
     * Principal ARN.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="principalArn", required=true)
    private Output<String> principalArn;

    /**
     * @return Principal ARN.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> principalArn() {
        return this.principalArn;
    }

    /**
     * Principal type. Setting this argument empty (e.g., `principal_type = &#34;&#34;`) will result in an error. Valid values are `IAM` and `IAM_PATTERN`. Default is `IAM`.
     * 
     */
    @Import(name="principalType")
    private @Nullable Output<String> principalType;

    /**
     * @return Principal type. Setting this argument empty (e.g., `principal_type = &#34;&#34;`) will result in an error. Valid values are `IAM` and `IAM_PATTERN`. Default is `IAM`.
     * 
     */
    public Optional<Output<String>> principalType() {
        return Optional.ofNullable(this.principalType);
    }

    private PrincipalPortfolioAssociationArgs() {}

    private PrincipalPortfolioAssociationArgs(PrincipalPortfolioAssociationArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.portfolioId = $.portfolioId;
        this.principalArn = $.principalArn;
        this.principalType = $.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrincipalPortfolioAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrincipalPortfolioAssociationArgs $;

        public Builder() {
            $ = new PrincipalPortfolioAssociationArgs();
        }

        public Builder(PrincipalPortfolioAssociationArgs defaults) {
            $ = new PrincipalPortfolioAssociationArgs(Objects.requireNonNull(defaults));
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
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(Output<String> portfolioId) {
            $.portfolioId = portfolioId;
            return this;
        }

        /**
         * @param portfolioId Portfolio identifier.
         * 
         * @return builder
         * 
         */
        public Builder portfolioId(String portfolioId) {
            return portfolioId(Output.of(portfolioId));
        }

        /**
         * @param principalArn Principal ARN.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder principalArn(Output<String> principalArn) {
            $.principalArn = principalArn;
            return this;
        }

        /**
         * @param principalArn Principal ARN.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder principalArn(String principalArn) {
            return principalArn(Output.of(principalArn));
        }

        /**
         * @param principalType Principal type. Setting this argument empty (e.g., `principal_type = &#34;&#34;`) will result in an error. Valid values are `IAM` and `IAM_PATTERN`. Default is `IAM`.
         * 
         * @return builder
         * 
         */
        public Builder principalType(@Nullable Output<String> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType Principal type. Setting this argument empty (e.g., `principal_type = &#34;&#34;`) will result in an error. Valid values are `IAM` and `IAM_PATTERN`. Default is `IAM`.
         * 
         * @return builder
         * 
         */
        public Builder principalType(String principalType) {
            return principalType(Output.of(principalType));
        }

        public PrincipalPortfolioAssociationArgs build() {
            $.portfolioId = Objects.requireNonNull($.portfolioId, "expected parameter 'portfolioId' to be non-null");
            $.principalArn = Objects.requireNonNull($.principalArn, "expected parameter 'principalArn' to be non-null");
            return $;
        }
    }

}
