// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterKubernetesNetworkConfig {
    /**
     * @return `ipv4` or `ipv6`.
     * 
     */
    private String ipFamily;
    /**
     * @return The CIDR block to assign Kubernetes pod and service IP addresses from if `ipv4` was specified when the cluster was created.
     * 
     */
    private String serviceIpv4Cidr;
    /**
     * @return The CIDR block to assign Kubernetes pod and service IP addresses from if `ipv6` was specified when the cluster was created. Kubernetes assigns service addresses from the unique local address range (fc00::/7) because you can&#39;t specify a custom IPv6 CIDR block when you create the cluster.
     * 
     */
    private String serviceIpv6Cidr;

    private GetClusterKubernetesNetworkConfig() {}
    /**
     * @return `ipv4` or `ipv6`.
     * 
     */
    public String ipFamily() {
        return this.ipFamily;
    }
    /**
     * @return The CIDR block to assign Kubernetes pod and service IP addresses from if `ipv4` was specified when the cluster was created.
     * 
     */
    public String serviceIpv4Cidr() {
        return this.serviceIpv4Cidr;
    }
    /**
     * @return The CIDR block to assign Kubernetes pod and service IP addresses from if `ipv6` was specified when the cluster was created. Kubernetes assigns service addresses from the unique local address range (fc00::/7) because you can&#39;t specify a custom IPv6 CIDR block when you create the cluster.
     * 
     */
    public String serviceIpv6Cidr() {
        return this.serviceIpv6Cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterKubernetesNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipFamily;
        private String serviceIpv4Cidr;
        private String serviceIpv6Cidr;
        public Builder() {}
        public Builder(GetClusterKubernetesNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
    	      this.serviceIpv6Cidr = defaults.serviceIpv6Cidr;
        }

        @CustomType.Setter
        public Builder ipFamily(String ipFamily) {
            this.ipFamily = Objects.requireNonNull(ipFamily);
            return this;
        }
        @CustomType.Setter
        public Builder serviceIpv4Cidr(String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Objects.requireNonNull(serviceIpv4Cidr);
            return this;
        }
        @CustomType.Setter
        public Builder serviceIpv6Cidr(String serviceIpv6Cidr) {
            this.serviceIpv6Cidr = Objects.requireNonNull(serviceIpv6Cidr);
            return this;
        }
        public GetClusterKubernetesNetworkConfig build() {
            final var o = new GetClusterKubernetesNetworkConfig();
            o.ipFamily = ipFamily;
            o.serviceIpv4Cidr = serviceIpv4Cidr;
            o.serviceIpv6Cidr = serviceIpv6Cidr;
            return o;
        }
    }
}
