// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediastore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ContainerPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerPolicyArgs Empty = new ContainerPolicyArgs();

    /**
     * The name of the container.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return The name of the container.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The contents of the policy.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return The contents of the policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    private ContainerPolicyArgs() {}

    private ContainerPolicyArgs(ContainerPolicyArgs $) {
        this.containerName = $.containerName;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerPolicyArgs $;

        public Builder() {
            $ = new ContainerPolicyArgs();
        }

        public Builder(ContainerPolicyArgs defaults) {
            $ = new ContainerPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName The name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param policy The contents of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The contents of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public ContainerPolicyArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}
