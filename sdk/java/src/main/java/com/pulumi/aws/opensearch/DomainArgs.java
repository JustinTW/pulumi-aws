// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch;

import com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs;
import com.pulumi.aws.opensearch.inputs.DomainCognitoOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs;
import com.pulumi.aws.opensearch.inputs.DomainLogPublishingOptionArgs;
import com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs;
import com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainSnapshotOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainSoftwareUpdateOptionsArgs;
import com.pulumi.aws.opensearch.inputs.DomainVpcOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * IAM policy document specifying the access policies for the domain.
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable Output<String> accessPolicies;

    /**
     * @return IAM policy document specifying the access policies for the domain.
     * 
     */
    public Optional<Output<String>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your OpenSearch domain on every apply.
     * 
     */
    @Import(name="advancedOptions")
    private @Nullable Output<Map<String,String>> advancedOptions;

    /**
     * @return Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your OpenSearch domain on every apply.
     * 
     */
    public Optional<Output<Map<String,String>>> advancedOptions() {
        return Optional.ofNullable(this.advancedOptions);
    }

    /**
     * Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    @Import(name="advancedSecurityOptions")
    private @Nullable Output<DomainAdvancedSecurityOptionsArgs> advancedSecurityOptions;

    /**
     * @return Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    public Optional<Output<DomainAdvancedSecurityOptionsArgs>> advancedSecurityOptions() {
        return Optional.ofNullable(this.advancedSecurityOptions);
    }

    /**
     * Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    @Import(name="autoTuneOptions")
    private @Nullable Output<DomainAutoTuneOptionsArgs> autoTuneOptions;

    /**
     * @return Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    public Optional<Output<DomainAutoTuneOptionsArgs>> autoTuneOptions() {
        return Optional.ofNullable(this.autoTuneOptions);
    }

    /**
     * Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    @Import(name="clusterConfig")
    private @Nullable Output<DomainClusterConfigArgs> clusterConfig;

    /**
     * @return Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    public Optional<Output<DomainClusterConfigArgs>> clusterConfig() {
        return Optional.ofNullable(this.clusterConfig);
    }

    /**
     * Configuration block for authenticating dashboard with Cognito. Detailed below.
     * 
     */
    @Import(name="cognitoOptions")
    private @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions;

    /**
     * @return Configuration block for authenticating dashboard with Cognito. Detailed below.
     * 
     */
    public Optional<Output<DomainCognitoOptionsArgs>> cognitoOptions() {
        return Optional.ofNullable(this.cognitoOptions);
    }

    /**
     * Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    @Import(name="domainEndpointOptions")
    private @Nullable Output<DomainDomainEndpointOptionsArgs> domainEndpointOptions;

    /**
     * @return Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    public Optional<Output<DomainDomainEndpointOptionsArgs>> domainEndpointOptions() {
        return Optional.ofNullable(this.domainEndpointOptions);
    }

    /**
     * Name of the domain.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return Name of the domain.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
     * 
     */
    @Import(name="ebsOptions")
    private @Nullable Output<DomainEbsOptionsArgs> ebsOptions;

    /**
     * @return Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
     * 
     */
    public Optional<Output<DomainEbsOptionsArgs>> ebsOptions() {
        return Optional.ofNullable(this.ebsOptions);
    }

    /**
     * Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
     * 
     */
    @Import(name="encryptAtRest")
    private @Nullable Output<DomainEncryptAtRestArgs> encryptAtRest;

    /**
     * @return Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
     * 
     */
    public Optional<Output<DomainEncryptAtRestArgs>> encryptAtRest() {
        return Optional.ofNullable(this.encryptAtRest);
    }

    /**
     * Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`.
     * See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains).
     * Defaults to the lastest version of OpenSearch.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`.
     * See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains).
     * Defaults to the lastest version of OpenSearch.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    @Import(name="logPublishingOptions")
    private @Nullable Output<List<DomainLogPublishingOptionArgs>> logPublishingOptions;

    /**
     * @return Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    public Optional<Output<List<DomainLogPublishingOptionArgs>>> logPublishingOptions() {
        return Optional.ofNullable(this.logPublishingOptions);
    }

    /**
     * Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    @Import(name="nodeToNodeEncryption")
    private @Nullable Output<DomainNodeToNodeEncryptionArgs> nodeToNodeEncryption;

    /**
     * @return Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    public Optional<Output<DomainNodeToNodeEncryptionArgs>> nodeToNodeEncryption() {
        return Optional.ofNullable(this.nodeToNodeEncryption);
    }

    /**
     * Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
     * 
     */
    @Import(name="offPeakWindowOptions")
    private @Nullable Output<DomainOffPeakWindowOptionsArgs> offPeakWindowOptions;

    /**
     * @return Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
     * 
     */
    public Optional<Output<DomainOffPeakWindowOptionsArgs>> offPeakWindowOptions() {
        return Optional.ofNullable(this.offPeakWindowOptions);
    }

    /**
     * Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
     * 
     */
    @Import(name="snapshotOptions")
    private @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions;

    /**
     * @return Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
     * 
     */
    public Optional<Output<DomainSnapshotOptionsArgs>> snapshotOptions() {
        return Optional.ofNullable(this.snapshotOptions);
    }

    /**
     * Software update options for the domain. Detailed below.
     * 
     */
    @Import(name="softwareUpdateOptions")
    private @Nullable Output<DomainSoftwareUpdateOptionsArgs> softwareUpdateOptions;

    /**
     * @return Software update options for the domain. Detailed below.
     * 
     */
    public Optional<Output<DomainSoftwareUpdateOptionsArgs>> softwareUpdateOptions() {
        return Optional.ofNullable(this.softwareUpdateOptions);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
     * 
     */
    @Import(name="vpcOptions")
    private @Nullable Output<DomainVpcOptionsArgs> vpcOptions;

    /**
     * @return Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
     * 
     */
    public Optional<Output<DomainVpcOptionsArgs>> vpcOptions() {
        return Optional.ofNullable(this.vpcOptions);
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.accessPolicies = $.accessPolicies;
        this.advancedOptions = $.advancedOptions;
        this.advancedSecurityOptions = $.advancedSecurityOptions;
        this.autoTuneOptions = $.autoTuneOptions;
        this.clusterConfig = $.clusterConfig;
        this.cognitoOptions = $.cognitoOptions;
        this.domainEndpointOptions = $.domainEndpointOptions;
        this.domainName = $.domainName;
        this.ebsOptions = $.ebsOptions;
        this.encryptAtRest = $.encryptAtRest;
        this.engineVersion = $.engineVersion;
        this.logPublishingOptions = $.logPublishingOptions;
        this.nodeToNodeEncryption = $.nodeToNodeEncryption;
        this.offPeakWindowOptions = $.offPeakWindowOptions;
        this.snapshotOptions = $.snapshotOptions;
        this.softwareUpdateOptions = $.softwareUpdateOptions;
        this.tags = $.tags;
        this.vpcOptions = $.vpcOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicies IAM policy document specifying the access policies for the domain.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(@Nullable Output<String> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        /**
         * @param accessPolicies IAM policy document specifying the access policies for the domain.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(String accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        /**
         * @param advancedOptions Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your OpenSearch domain on every apply.
         * 
         * @return builder
         * 
         */
        public Builder advancedOptions(@Nullable Output<Map<String,String>> advancedOptions) {
            $.advancedOptions = advancedOptions;
            return this;
        }

        /**
         * @param advancedOptions Key-value string pairs to specify advanced configuration options. Note that the values for these configuration options must be strings (wrapped in quotes) or they may be wrong and cause a perpetual diff, causing the provider to want to recreate your OpenSearch domain on every apply.
         * 
         * @return builder
         * 
         */
        public Builder advancedOptions(Map<String,String> advancedOptions) {
            return advancedOptions(Output.of(advancedOptions));
        }

        /**
         * @param advancedSecurityOptions Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder advancedSecurityOptions(@Nullable Output<DomainAdvancedSecurityOptionsArgs> advancedSecurityOptions) {
            $.advancedSecurityOptions = advancedSecurityOptions;
            return this;
        }

        /**
         * @param advancedSecurityOptions Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder advancedSecurityOptions(DomainAdvancedSecurityOptionsArgs advancedSecurityOptions) {
            return advancedSecurityOptions(Output.of(advancedSecurityOptions));
        }

        /**
         * @param autoTuneOptions Configuration block for the Auto-Tune options of the domain. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder autoTuneOptions(@Nullable Output<DomainAutoTuneOptionsArgs> autoTuneOptions) {
            $.autoTuneOptions = autoTuneOptions;
            return this;
        }

        /**
         * @param autoTuneOptions Configuration block for the Auto-Tune options of the domain. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder autoTuneOptions(DomainAutoTuneOptionsArgs autoTuneOptions) {
            return autoTuneOptions(Output.of(autoTuneOptions));
        }

        /**
         * @param clusterConfig Configuration block for the cluster of the domain. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(@Nullable Output<DomainClusterConfigArgs> clusterConfig) {
            $.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * @param clusterConfig Configuration block for the cluster of the domain. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(DomainClusterConfigArgs clusterConfig) {
            return clusterConfig(Output.of(clusterConfig));
        }

        /**
         * @param cognitoOptions Configuration block for authenticating dashboard with Cognito. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder cognitoOptions(@Nullable Output<DomainCognitoOptionsArgs> cognitoOptions) {
            $.cognitoOptions = cognitoOptions;
            return this;
        }

        /**
         * @param cognitoOptions Configuration block for authenticating dashboard with Cognito. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder cognitoOptions(DomainCognitoOptionsArgs cognitoOptions) {
            return cognitoOptions(Output.of(cognitoOptions));
        }

        /**
         * @param domainEndpointOptions Configuration block for domain endpoint HTTP(S) related options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder domainEndpointOptions(@Nullable Output<DomainDomainEndpointOptionsArgs> domainEndpointOptions) {
            $.domainEndpointOptions = domainEndpointOptions;
            return this;
        }

        /**
         * @param domainEndpointOptions Configuration block for domain endpoint HTTP(S) related options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder domainEndpointOptions(DomainDomainEndpointOptionsArgs domainEndpointOptions) {
            return domainEndpointOptions(Output.of(domainEndpointOptions));
        }

        /**
         * @param domainName Name of the domain.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName Name of the domain.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param ebsOptions Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsOptions(@Nullable Output<DomainEbsOptionsArgs> ebsOptions) {
            $.ebsOptions = ebsOptions;
            return this;
        }

        /**
         * @param ebsOptions Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsOptions(DomainEbsOptionsArgs ebsOptions) {
            return ebsOptions(Output.of(ebsOptions));
        }

        /**
         * @param encryptAtRest Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder encryptAtRest(@Nullable Output<DomainEncryptAtRestArgs> encryptAtRest) {
            $.encryptAtRest = encryptAtRest;
            return this;
        }

        /**
         * @param encryptAtRest Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder encryptAtRest(DomainEncryptAtRestArgs encryptAtRest) {
            return encryptAtRest(Output.of(encryptAtRest));
        }

        /**
         * @param engineVersion Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`.
         * See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains).
         * Defaults to the lastest version of OpenSearch.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Either `Elasticsearch_X.Y` or `OpenSearch_X.Y` to specify the engine version for the Amazon OpenSearch Service domain. For example, `OpenSearch_1.0` or `Elasticsearch_7.9`.
         * See [Creating and managing Amazon OpenSearch Service domains](http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains).
         * Defaults to the lastest version of OpenSearch.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder logPublishingOptions(@Nullable Output<List<DomainLogPublishingOptionArgs>> logPublishingOptions) {
            $.logPublishingOptions = logPublishingOptions;
            return this;
        }

        /**
         * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder logPublishingOptions(List<DomainLogPublishingOptionArgs> logPublishingOptions) {
            return logPublishingOptions(Output.of(logPublishingOptions));
        }

        /**
         * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder logPublishingOptions(DomainLogPublishingOptionArgs... logPublishingOptions) {
            return logPublishingOptions(List.of(logPublishingOptions));
        }

        /**
         * @param nodeToNodeEncryption Configuration block for node-to-node encryption options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder nodeToNodeEncryption(@Nullable Output<DomainNodeToNodeEncryptionArgs> nodeToNodeEncryption) {
            $.nodeToNodeEncryption = nodeToNodeEncryption;
            return this;
        }

        /**
         * @param nodeToNodeEncryption Configuration block for node-to-node encryption options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder nodeToNodeEncryption(DomainNodeToNodeEncryptionArgs nodeToNodeEncryption) {
            return nodeToNodeEncryption(Output.of(nodeToNodeEncryption));
        }

        /**
         * @param offPeakWindowOptions Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder offPeakWindowOptions(@Nullable Output<DomainOffPeakWindowOptionsArgs> offPeakWindowOptions) {
            $.offPeakWindowOptions = offPeakWindowOptions;
            return this;
        }

        /**
         * @param offPeakWindowOptions Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder offPeakWindowOptions(DomainOffPeakWindowOptionsArgs offPeakWindowOptions) {
            return offPeakWindowOptions(Output.of(offPeakWindowOptions));
        }

        /**
         * @param snapshotOptions Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
         * 
         * @return builder
         * 
         */
        public Builder snapshotOptions(@Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions) {
            $.snapshotOptions = snapshotOptions;
            return this;
        }

        /**
         * @param snapshotOptions Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
         * 
         * @return builder
         * 
         */
        public Builder snapshotOptions(DomainSnapshotOptionsArgs snapshotOptions) {
            return snapshotOptions(Output.of(snapshotOptions));
        }

        /**
         * @param softwareUpdateOptions Software update options for the domain. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder softwareUpdateOptions(@Nullable Output<DomainSoftwareUpdateOptionsArgs> softwareUpdateOptions) {
            $.softwareUpdateOptions = softwareUpdateOptions;
            return this;
        }

        /**
         * @param softwareUpdateOptions Software update options for the domain. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder softwareUpdateOptions(DomainSoftwareUpdateOptionsArgs softwareUpdateOptions) {
            return softwareUpdateOptions(Output.of(softwareUpdateOptions));
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcOptions Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcOptions(@Nullable Output<DomainVpcOptionsArgs> vpcOptions) {
            $.vpcOptions = vpcOptions;
            return this;
        }

        /**
         * @param vpcOptions Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcOptions(DomainVpcOptionsArgs vpcOptions) {
            return vpcOptions(Output.of(vpcOptions));
        }

        public DomainArgs build() {
            return $;
        }
    }

}
