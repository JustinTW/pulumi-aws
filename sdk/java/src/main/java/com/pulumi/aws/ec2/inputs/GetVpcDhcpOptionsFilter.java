// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetVpcDhcpOptionsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcDhcpOptionsFilter Empty = new GetVpcDhcpOptionsFilter();

    /**
     * Name of the field to filter.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the field to filter.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Set of values for filtering.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Set of values for filtering.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetVpcDhcpOptionsFilter() {}

    private GetVpcDhcpOptionsFilter(GetVpcDhcpOptionsFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcDhcpOptionsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcDhcpOptionsFilter $;

        public Builder() {
            $ = new GetVpcDhcpOptionsFilter();
        }

        public Builder(GetVpcDhcpOptionsFilter defaults) {
            $ = new GetVpcDhcpOptionsFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the field to filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Set of values for filtering.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Set of values for filtering.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetVpcDhcpOptionsFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
