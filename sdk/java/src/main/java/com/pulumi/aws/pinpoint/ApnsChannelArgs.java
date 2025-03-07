// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApnsChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApnsChannelArgs Empty = new ApnsChannelArgs();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    @Import(name="bundleId")
    private @Nullable Output<String> bundleId;

    /**
     * @return The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
     * 
     */
    public Optional<Output<String>> bundleId() {
        return Optional.ofNullable(this.bundleId);
    }

    /**
     * The pem encoded TLS Certificate from Apple.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The pem encoded TLS Certificate from Apple.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     * One of the following sets of credentials is also required.
     * 
     * If you choose to use __Certificate credentials__ you will have to provide:
     * 
     */
    @Import(name="defaultAuthenticationMethod")
    private @Nullable Output<String> defaultAuthenticationMethod;

    /**
     * @return The default authentication method used for APNs.
     * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
     * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
     * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
     * 
     * One of the following sets of credentials is also required.
     * 
     * If you choose to use __Certificate credentials__ you will have to provide:
     * 
     */
    public Optional<Output<String>> defaultAuthenticationMethod() {
        return Optional.ofNullable(this.defaultAuthenticationMethod);
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Certificate Private Key file (ie. `.key` file).
     * 
     * If you choose to use __Key credentials__ you will have to provide:
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The Certificate Private Key file (ie. `.key` file).
     * 
     * If you choose to use __Key credentials__ you will have to provide:
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return The ID assigned to your Apple developer account team. This value is provided on the Membership page.
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    /**
     * The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    @Import(name="tokenKey")
    private @Nullable Output<String> tokenKey;

    /**
     * @return The `.p8` file that you download from your Apple developer account when you create an authentication key.
     * 
     */
    public Optional<Output<String>> tokenKey() {
        return Optional.ofNullable(this.tokenKey);
    }

    /**
     * The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    @Import(name="tokenKeyId")
    private @Nullable Output<String> tokenKeyId;

    /**
     * @return The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
     * 
     */
    public Optional<Output<String>> tokenKeyId() {
        return Optional.ofNullable(this.tokenKeyId);
    }

    private ApnsChannelArgs() {}

    private ApnsChannelArgs(ApnsChannelArgs $) {
        this.applicationId = $.applicationId;
        this.bundleId = $.bundleId;
        this.certificate = $.certificate;
        this.defaultAuthenticationMethod = $.defaultAuthenticationMethod;
        this.enabled = $.enabled;
        this.privateKey = $.privateKey;
        this.teamId = $.teamId;
        this.tokenKey = $.tokenKey;
        this.tokenKeyId = $.tokenKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApnsChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApnsChannelArgs $;

        public Builder() {
            $ = new ApnsChannelArgs();
        }

        public Builder(ApnsChannelArgs defaults) {
            $ = new ApnsChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The application ID.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The application ID.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param bundleId The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
         * 
         * @return builder
         * 
         */
        public Builder bundleId(@Nullable Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        /**
         * @param bundleId The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
         * 
         * @return builder
         * 
         */
        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        /**
         * @param certificate The pem encoded TLS Certificate from Apple.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The pem encoded TLS Certificate from Apple.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param defaultAuthenticationMethod The default authentication method used for APNs.
         * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
         * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
         * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
         * 
         * One of the following sets of credentials is also required.
         * 
         * If you choose to use __Certificate credentials__ you will have to provide:
         * 
         * @return builder
         * 
         */
        public Builder defaultAuthenticationMethod(@Nullable Output<String> defaultAuthenticationMethod) {
            $.defaultAuthenticationMethod = defaultAuthenticationMethod;
            return this;
        }

        /**
         * @param defaultAuthenticationMethod The default authentication method used for APNs.
         * __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
         * You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
         * If your default authentication type fails, Amazon Pinpoint doesn&#39;t attempt to use the other authentication type.
         * 
         * One of the following sets of credentials is also required.
         * 
         * If you choose to use __Certificate credentials__ you will have to provide:
         * 
         * @return builder
         * 
         */
        public Builder defaultAuthenticationMethod(String defaultAuthenticationMethod) {
            return defaultAuthenticationMethod(Output.of(defaultAuthenticationMethod));
        }

        /**
         * @param enabled Whether the channel is enabled or disabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the channel is enabled or disabled. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param privateKey The Certificate Private Key file (ie. `.key` file).
         * 
         * If you choose to use __Key credentials__ you will have to provide:
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The Certificate Private Key file (ie. `.key` file).
         * 
         * If you choose to use __Key credentials__ you will have to provide:
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param teamId The ID assigned to your Apple developer account team. This value is provided on the Membership page.
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId The ID assigned to your Apple developer account team. This value is provided on the Membership page.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param tokenKey The `.p8` file that you download from your Apple developer account when you create an authentication key.
         * 
         * @return builder
         * 
         */
        public Builder tokenKey(@Nullable Output<String> tokenKey) {
            $.tokenKey = tokenKey;
            return this;
        }

        /**
         * @param tokenKey The `.p8` file that you download from your Apple developer account when you create an authentication key.
         * 
         * @return builder
         * 
         */
        public Builder tokenKey(String tokenKey) {
            return tokenKey(Output.of(tokenKey));
        }

        /**
         * @param tokenKeyId The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
         * 
         * @return builder
         * 
         */
        public Builder tokenKeyId(@Nullable Output<String> tokenKeyId) {
            $.tokenKeyId = tokenKeyId;
            return this;
        }

        /**
         * @param tokenKeyId The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
         * 
         * @return builder
         * 
         */
        public Builder tokenKeyId(String tokenKeyId) {
            return tokenKeyId(Output.of(tokenKeyId));
        }

        public ApnsChannelArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            return $;
        }
    }

}
