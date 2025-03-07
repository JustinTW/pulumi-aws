// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.finspace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KxClusterCode {
    /**
     * @return Unique name for the S3 bucket.
     * 
     */
    private String s3Bucket;
    /**
     * @return Full S3 path (excluding bucket) to the .zip file that contains the code to be loaded onto the cluster when it’s started.
     * 
     */
    private String s3Key;
    /**
     * @return Version of an S3 Object.
     * 
     */
    private @Nullable String s3ObjectVersion;

    private KxClusterCode() {}
    /**
     * @return Unique name for the S3 bucket.
     * 
     */
    public String s3Bucket() {
        return this.s3Bucket;
    }
    /**
     * @return Full S3 path (excluding bucket) to the .zip file that contains the code to be loaded onto the cluster when it’s started.
     * 
     */
    public String s3Key() {
        return this.s3Key;
    }
    /**
     * @return Version of an S3 Object.
     * 
     */
    public Optional<String> s3ObjectVersion() {
        return Optional.ofNullable(this.s3ObjectVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KxClusterCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String s3Bucket;
        private String s3Key;
        private @Nullable String s3ObjectVersion;
        public Builder() {}
        public Builder(KxClusterCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
        }

        @CustomType.Setter
        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }
        @CustomType.Setter
        public Builder s3Key(String s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }
        @CustomType.Setter
        public Builder s3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }
        public KxClusterCode build() {
            final var o = new KxClusterCode();
            o.s3Bucket = s3Bucket;
            o.s3Key = s3Key;
            o.s3ObjectVersion = s3ObjectVersion;
            return o;
        }
    }
}
