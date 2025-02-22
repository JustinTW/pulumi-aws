// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.licensemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReceivedLicenseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReceivedLicenseArgs Empty = new GetReceivedLicenseArgs();

    /**
     * The ARN of the received license you want data for.
     * 
     */
    @Import(name="licenseArn", required=true)
    private Output<String> licenseArn;

    /**
     * @return The ARN of the received license you want data for.
     * 
     */
    public Output<String> licenseArn() {
        return this.licenseArn;
    }

    private GetReceivedLicenseArgs() {}

    private GetReceivedLicenseArgs(GetReceivedLicenseArgs $) {
        this.licenseArn = $.licenseArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReceivedLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReceivedLicenseArgs $;

        public Builder() {
            $ = new GetReceivedLicenseArgs();
        }

        public Builder(GetReceivedLicenseArgs defaults) {
            $ = new GetReceivedLicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param licenseArn The ARN of the received license you want data for.
         * 
         * @return builder
         * 
         */
        public Builder licenseArn(Output<String> licenseArn) {
            $.licenseArn = licenseArn;
            return this;
        }

        /**
         * @param licenseArn The ARN of the received license you want data for.
         * 
         * @return builder
         * 
         */
        public Builder licenseArn(String licenseArn) {
            return licenseArn(Output.of(licenseArn));
        }

        public GetReceivedLicenseArgs build() {
            $.licenseArn = Objects.requireNonNull($.licenseArn, "expected parameter 'licenseArn' to be non-null");
            return $;
        }
    }

}
