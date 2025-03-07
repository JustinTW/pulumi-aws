// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResource {
    /**
     * @return The Amazon S3 URI for the statistics resource.
     * 
     */
    private @Nullable String s3Uri;

    private DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResource() {}
    /**
     * @return The Amazon S3 URI for the statistics resource.
     * 
     */
    public Optional<String> s3Uri() {
        return Optional.ofNullable(this.s3Uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String s3Uri;
        public Builder() {}
        public Builder(DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        @CustomType.Setter
        public Builder s3Uri(@Nullable String s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }
        public DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResource build() {
            final var o = new DataQualityJobDefinitionDataQualityBaselineConfigStatisticsResource();
            o.s3Uri = s3Uri;
            return o;
        }
    }
}
