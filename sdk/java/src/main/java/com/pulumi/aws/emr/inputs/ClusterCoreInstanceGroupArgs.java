// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupEbsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceGroupArgs Empty = new ClusterCoreInstanceGroupArgs();

    /**
     * String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
     * 
     */
    @Import(name="autoscalingPolicy")
    private @Nullable Output<String> autoscalingPolicy;

    /**
     * @return String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
     * 
     */
    public Optional<Output<String>> autoscalingPolicy() {
        return Optional.ofNullable(this.autoscalingPolicy);
    }

    /**
     * Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    @Import(name="bidPrice")
    private @Nullable Output<String> bidPrice;

    /**
     * @return Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
     * 
     */
    public Optional<Output<String>> bidPrice() {
        return Optional.ofNullable(this.bidPrice);
    }

    /**
     * Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    @Import(name="ebsConfigs")
    private @Nullable Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs;

    /**
     * @return Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
     * 
     */
    public Optional<Output<List<ClusterCoreInstanceGroupEbsConfigArgs>>> ebsConfigs() {
        return Optional.ofNullable(this.ebsConfigs);
    }

    /**
     * ID of the cluster.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return ID of the cluster.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Target number of instances for the instance group. Must be at least 1. Defaults to 1.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return Target number of instances for the instance group. Must be at least 1. Defaults to 1.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * EC2 instance type for all instances in the instance group.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return EC2 instance type for all instances in the instance group.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * Friendly name given to the instance group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Friendly name given to the instance group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ClusterCoreInstanceGroupArgs() {}

    private ClusterCoreInstanceGroupArgs(ClusterCoreInstanceGroupArgs $) {
        this.autoscalingPolicy = $.autoscalingPolicy;
        this.bidPrice = $.bidPrice;
        this.ebsConfigs = $.ebsConfigs;
        this.id = $.id;
        this.instanceCount = $.instanceCount;
        this.instanceType = $.instanceType;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCoreInstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCoreInstanceGroupArgs $;

        public Builder() {
            $ = new ClusterCoreInstanceGroupArgs();
        }

        public Builder(ClusterCoreInstanceGroupArgs defaults) {
            $ = new ClusterCoreInstanceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingPolicy String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingPolicy(@Nullable Output<String> autoscalingPolicy) {
            $.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        /**
         * @param autoscalingPolicy String containing the [EMR Auto Scaling Policy](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html) JSON.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingPolicy(String autoscalingPolicy) {
            return autoscalingPolicy(Output.of(autoscalingPolicy));
        }

        /**
         * @param bidPrice Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
         * 
         * @return builder
         * 
         */
        public Builder bidPrice(@Nullable Output<String> bidPrice) {
            $.bidPrice = bidPrice;
            return this;
        }

        /**
         * @param bidPrice Bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
         * 
         * @return builder
         * 
         */
        public Builder bidPrice(String bidPrice) {
            return bidPrice(Output.of(bidPrice));
        }

        /**
         * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(@Nullable Output<List<ClusterCoreInstanceGroupEbsConfigArgs>> ebsConfigs) {
            $.ebsConfigs = ebsConfigs;
            return this;
        }

        /**
         * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(List<ClusterCoreInstanceGroupEbsConfigArgs> ebsConfigs) {
            return ebsConfigs(Output.of(ebsConfigs));
        }

        /**
         * @param ebsConfigs Configuration block(s) for EBS volumes attached to each instance in the instance group. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder ebsConfigs(ClusterCoreInstanceGroupEbsConfigArgs... ebsConfigs) {
            return ebsConfigs(List.of(ebsConfigs));
        }

        /**
         * @param id ID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param instanceCount Target number of instances for the instance group. Must be at least 1. Defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount Target number of instances for the instance group. Must be at least 1. Defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param instanceType EC2 instance type for all instances in the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType EC2 instance type for all instances in the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param name Friendly name given to the instance group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Friendly name given to the instance group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ClusterCoreInstanceGroupArgs build() {
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            return $;
        }
    }

}
