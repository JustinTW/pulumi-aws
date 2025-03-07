// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
     * 
     */
    @Import(name="hsmType", required=true)
    private Output<String> hsmType;

    /**
     * @return The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
     * 
     */
    public Output<String> hsmType() {
        return this.hsmType;
    }

    /**
     * ID of Cloud HSM v2 cluster backup to be restored.
     * 
     */
    @Import(name="sourceBackupIdentifier")
    private @Nullable Output<String> sourceBackupIdentifier;

    /**
     * @return ID of Cloud HSM v2 cluster backup to be restored.
     * 
     */
    public Optional<Output<String>> sourceBackupIdentifier() {
        return Optional.ofNullable(this.sourceBackupIdentifier);
    }

    /**
     * The IDs of subnets in which cluster will operate.
     * 
     */
    @Import(name="subnetIds", required=true)
    private Output<List<String>> subnetIds;

    /**
     * @return The IDs of subnets in which cluster will operate.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.hsmType = $.hsmType;
        this.sourceBackupIdentifier = $.sourceBackupIdentifier;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hsmType The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
         * 
         * @return builder
         * 
         */
        public Builder hsmType(Output<String> hsmType) {
            $.hsmType = hsmType;
            return this;
        }

        /**
         * @param hsmType The type of HSM module in the cluster. Currently, only `hsm1.medium` is supported.
         * 
         * @return builder
         * 
         */
        public Builder hsmType(String hsmType) {
            return hsmType(Output.of(hsmType));
        }

        /**
         * @param sourceBackupIdentifier ID of Cloud HSM v2 cluster backup to be restored.
         * 
         * @return builder
         * 
         */
        public Builder sourceBackupIdentifier(@Nullable Output<String> sourceBackupIdentifier) {
            $.sourceBackupIdentifier = sourceBackupIdentifier;
            return this;
        }

        /**
         * @param sourceBackupIdentifier ID of Cloud HSM v2 cluster backup to be restored.
         * 
         * @return builder
         * 
         */
        public Builder sourceBackupIdentifier(String sourceBackupIdentifier) {
            return sourceBackupIdentifier(Output.of(sourceBackupIdentifier));
        }

        /**
         * @param subnetIds The IDs of subnets in which cluster will operate.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The IDs of subnets in which cluster will operate.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The IDs of subnets in which cluster will operate.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ClusterArgs build() {
            $.hsmType = Objects.requireNonNull($.hsmType, "expected parameter 'hsmType' to be non-null");
            $.subnetIds = Objects.requireNonNull($.subnetIds, "expected parameter 'subnetIds' to be non-null");
            return $;
        }
    }

}
