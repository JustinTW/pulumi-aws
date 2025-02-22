// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless.outputs;

import com.pulumi.aws.redshiftserverless.outputs.GetWorkgroupEndpointVpcEndpoint;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkgroupEndpoint {
    /**
     * @return The DNS address of the VPC endpoint.
     * 
     */
    private String address;
    /**
     * @return The port that Amazon Redshift Serverless listens on.
     * 
     */
    private Integer port;
    /**
     * @return The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * 
     */
    private List<GetWorkgroupEndpointVpcEndpoint> vpcEndpoints;

    private GetWorkgroupEndpoint() {}
    /**
     * @return The DNS address of the VPC endpoint.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The port that Amazon Redshift Serverless listens on.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * 
     */
    public List<GetWorkgroupEndpointVpcEndpoint> vpcEndpoints() {
        return this.vpcEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkgroupEndpoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer port;
        private List<GetWorkgroupEndpointVpcEndpoint> vpcEndpoints;
        public Builder() {}
        public Builder(GetWorkgroupEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
    	      this.vpcEndpoints = defaults.vpcEndpoints;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder vpcEndpoints(List<GetWorkgroupEndpointVpcEndpoint> vpcEndpoints) {
            this.vpcEndpoints = Objects.requireNonNull(vpcEndpoints);
            return this;
        }
        public Builder vpcEndpoints(GetWorkgroupEndpointVpcEndpoint... vpcEndpoints) {
            return vpcEndpoints(List.of(vpcEndpoints));
        }
        public GetWorkgroupEndpoint build() {
            final var o = new GetWorkgroupEndpoint();
            o.address = address;
            o.port = port;
            o.vpcEndpoints = vpcEndpoints;
            return o;
        }
    }
}
