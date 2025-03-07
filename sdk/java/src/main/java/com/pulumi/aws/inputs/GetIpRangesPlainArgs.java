// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpRangesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpRangesPlainArgs Empty = new GetIpRangesPlainArgs();

    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Filter IP ranges by regions (or include all regions, if
     * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
     * (e.g., `eu-central-1`)
     * 
     */
    @Import(name="regions")
    private @Nullable List<String> regions;

    /**
     * @return Filter IP ranges by regions (or include all regions, if
     * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
     * (e.g., `eu-central-1`)
     * 
     */
    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * Filter IP ranges by services. Valid items are `amazon`
     * (for amazon.com), `amazon_connect`, `api_gateway`, `cloud9`, `cloudfront`,
     * `codebuild`, `dynamodb`, `ec2`, `ec2_instance_connect`, `globalaccelerator`,
     * `route53`, `route53_healthchecks`, `s3` and `workspaces_gateways`. See the
     * [`service` attribute][2] documentation for other possible values.
     * 
     * &gt; **NOTE:** If the specified combination of regions and services does not yield any
     * CIDR blocks, this call will fail.
     * 
     */
    @Import(name="services", required=true)
    private List<String> services;

    /**
     * @return Filter IP ranges by services. Valid items are `amazon`
     * (for amazon.com), `amazon_connect`, `api_gateway`, `cloud9`, `cloudfront`,
     * `codebuild`, `dynamodb`, `ec2`, `ec2_instance_connect`, `globalaccelerator`,
     * `route53`, `route53_healthchecks`, `s3` and `workspaces_gateways`. See the
     * [`service` attribute][2] documentation for other possible values.
     * 
     * &gt; **NOTE:** If the specified combination of regions and services does not yield any
     * CIDR blocks, this call will fail.
     * 
     */
    public List<String> services() {
        return this.services;
    }

    /**
     * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
     * 
     */
    @Import(name="url")
    private @Nullable String url;

    /**
     * @return Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    private GetIpRangesPlainArgs() {}

    private GetIpRangesPlainArgs(GetIpRangesPlainArgs $) {
        this.id = $.id;
        this.regions = $.regions;
        this.services = $.services;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpRangesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpRangesPlainArgs $;

        public Builder() {
            $ = new GetIpRangesPlainArgs();
        }

        public Builder(GetIpRangesPlainArgs defaults) {
            $ = new GetIpRangesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param regions Filter IP ranges by regions (or include all regions, if
         * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
         * (e.g., `eu-central-1`)
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions Filter IP ranges by regions (or include all regions, if
         * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
         * (e.g., `eu-central-1`)
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param services Filter IP ranges by services. Valid items are `amazon`
         * (for amazon.com), `amazon_connect`, `api_gateway`, `cloud9`, `cloudfront`,
         * `codebuild`, `dynamodb`, `ec2`, `ec2_instance_connect`, `globalaccelerator`,
         * `route53`, `route53_healthchecks`, `s3` and `workspaces_gateways`. See the
         * [`service` attribute][2] documentation for other possible values.
         * 
         * &gt; **NOTE:** If the specified combination of regions and services does not yield any
         * CIDR blocks, this call will fail.
         * 
         * @return builder
         * 
         */
        public Builder services(List<String> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services Filter IP ranges by services. Valid items are `amazon`
         * (for amazon.com), `amazon_connect`, `api_gateway`, `cloud9`, `cloudfront`,
         * `codebuild`, `dynamodb`, `ec2`, `ec2_instance_connect`, `globalaccelerator`,
         * `route53`, `route53_healthchecks`, `s3` and `workspaces_gateways`. See the
         * [`service` attribute][2] documentation for other possible values.
         * 
         * &gt; **NOTE:** If the specified combination of regions and services does not yield any
         * CIDR blocks, this call will fail.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        /**
         * @param url Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable String url) {
            $.url = url;
            return this;
        }

        public GetIpRangesPlainArgs build() {
            $.services = Objects.requireNonNull($.services, "expected parameter 'services' to be non-null");
            return $;
        }
    }

}
