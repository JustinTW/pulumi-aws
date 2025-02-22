// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProxyTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProxyTargetArgs Empty = new ProxyTargetArgs();

    /**
     * DB cluster identifier.
     * 
     * **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
     * 
     */
    @Import(name="dbClusterIdentifier")
    private @Nullable Output<String> dbClusterIdentifier;

    /**
     * @return DB cluster identifier.
     * 
     * **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
     * 
     */
    public Optional<Output<String>> dbClusterIdentifier() {
        return Optional.ofNullable(this.dbClusterIdentifier);
    }

    /**
     * DB instance identifier.
     * 
     */
    @Import(name="dbInstanceIdentifier")
    private @Nullable Output<String> dbInstanceIdentifier;

    /**
     * @return DB instance identifier.
     * 
     */
    public Optional<Output<String>> dbInstanceIdentifier() {
        return Optional.ofNullable(this.dbInstanceIdentifier);
    }

    /**
     * The name of the DB proxy.
     * 
     */
    @Import(name="dbProxyName", required=true)
    private Output<String> dbProxyName;

    /**
     * @return The name of the DB proxy.
     * 
     */
    public Output<String> dbProxyName() {
        return this.dbProxyName;
    }

    /**
     * The name of the target group.
     * 
     */
    @Import(name="targetGroupName", required=true)
    private Output<String> targetGroupName;

    /**
     * @return The name of the target group.
     * 
     */
    public Output<String> targetGroupName() {
        return this.targetGroupName;
    }

    private ProxyTargetArgs() {}

    private ProxyTargetArgs(ProxyTargetArgs $) {
        this.dbClusterIdentifier = $.dbClusterIdentifier;
        this.dbInstanceIdentifier = $.dbInstanceIdentifier;
        this.dbProxyName = $.dbProxyName;
        this.targetGroupName = $.targetGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProxyTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProxyTargetArgs $;

        public Builder() {
            $ = new ProxyTargetArgs();
        }

        public Builder(ProxyTargetArgs defaults) {
            $ = new ProxyTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbClusterIdentifier DB cluster identifier.
         * 
         * **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            $.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        /**
         * @param dbClusterIdentifier DB cluster identifier.
         * 
         * **NOTE:** Either `db_instance_identifier` or `db_cluster_identifier` should be specified and both should not be specified together
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            return dbClusterIdentifier(Output.of(dbClusterIdentifier));
        }

        /**
         * @param dbInstanceIdentifier DB instance identifier.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(@Nullable Output<String> dbInstanceIdentifier) {
            $.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        /**
         * @param dbInstanceIdentifier DB instance identifier.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIdentifier(String dbInstanceIdentifier) {
            return dbInstanceIdentifier(Output.of(dbInstanceIdentifier));
        }

        /**
         * @param dbProxyName The name of the DB proxy.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyName(Output<String> dbProxyName) {
            $.dbProxyName = dbProxyName;
            return this;
        }

        /**
         * @param dbProxyName The name of the DB proxy.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyName(String dbProxyName) {
            return dbProxyName(Output.of(dbProxyName));
        }

        /**
         * @param targetGroupName The name of the target group.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupName(Output<String> targetGroupName) {
            $.targetGroupName = targetGroupName;
            return this;
        }

        /**
         * @param targetGroupName The name of the target group.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupName(String targetGroupName) {
            return targetGroupName(Output.of(targetGroupName));
        }

        public ProxyTargetArgs build() {
            $.dbProxyName = Objects.requireNonNull($.dbProxyName, "expected parameter 'dbProxyName' to be non-null");
            $.targetGroupName = Objects.requireNonNull($.targetGroupName, "expected parameter 'targetGroupName' to be non-null");
            return $;
        }
    }

}
