// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.aws.emrcontainers.outputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfiguration;
import com.pulumi.aws.emrcontainers.outputs.JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfiguration {
    /**
     * @return Monitoring configurations for CloudWatch.
     * 
     */
    private @Nullable JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfiguration cloudWatchMonitoringConfiguration;
    /**
     * @return Monitoring configurations for the persistent application UI.
     * 
     */
    private @Nullable String persistentAppUi;
    /**
     * @return Amazon S3 configuration for monitoring log publishing.
     * 
     */
    private @Nullable JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfiguration s3MonitoringConfiguration;

    private JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfiguration() {}
    /**
     * @return Monitoring configurations for CloudWatch.
     * 
     */
    public Optional<JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfiguration> cloudWatchMonitoringConfiguration() {
        return Optional.ofNullable(this.cloudWatchMonitoringConfiguration);
    }
    /**
     * @return Monitoring configurations for the persistent application UI.
     * 
     */
    public Optional<String> persistentAppUi() {
        return Optional.ofNullable(this.persistentAppUi);
    }
    /**
     * @return Amazon S3 configuration for monitoring log publishing.
     * 
     */
    public Optional<JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfiguration> s3MonitoringConfiguration() {
        return Optional.ofNullable(this.s3MonitoringConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfiguration cloudWatchMonitoringConfiguration;
        private @Nullable String persistentAppUi;
        private @Nullable JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfiguration s3MonitoringConfiguration;
        public Builder() {}
        public Builder(JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchMonitoringConfiguration = defaults.cloudWatchMonitoringConfiguration;
    	      this.persistentAppUi = defaults.persistentAppUi;
    	      this.s3MonitoringConfiguration = defaults.s3MonitoringConfiguration;
        }

        @CustomType.Setter
        public Builder cloudWatchMonitoringConfiguration(@Nullable JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationCloudWatchMonitoringConfiguration cloudWatchMonitoringConfiguration) {
            this.cloudWatchMonitoringConfiguration = cloudWatchMonitoringConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder persistentAppUi(@Nullable String persistentAppUi) {
            this.persistentAppUi = persistentAppUi;
            return this;
        }
        @CustomType.Setter
        public Builder s3MonitoringConfiguration(@Nullable JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfigurationS3MonitoringConfiguration s3MonitoringConfiguration) {
            this.s3MonitoringConfiguration = s3MonitoringConfiguration;
            return this;
        }
        public JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfiguration build() {
            final var o = new JobTemplateJobTemplateDataConfigurationOverridesMonitoringConfiguration();
            o.cloudWatchMonitoringConfiguration = cloudWatchMonitoringConfiguration;
            o.persistentAppUi = persistentAppUi;
            o.s3MonitoringConfiguration = s3MonitoringConfiguration;
            return o;
        }
    }
}
