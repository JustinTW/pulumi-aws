// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.organizations.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationalUnitPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationalUnitPlainArgs Empty = new GetOrganizationalUnitPlainArgs();

    /**
     * Name of the organizational unit
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the organizational unit
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Parent ID of the organizational unit.
     * 
     */
    @Import(name="parentId", required=true)
    private String parentId;

    /**
     * @return Parent ID of the organizational unit.
     * 
     */
    public String parentId() {
        return this.parentId;
    }

    private GetOrganizationalUnitPlainArgs() {}

    private GetOrganizationalUnitPlainArgs(GetOrganizationalUnitPlainArgs $) {
        this.name = $.name;
        this.parentId = $.parentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationalUnitPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationalUnitPlainArgs $;

        public Builder() {
            $ = new GetOrganizationalUnitPlainArgs();
        }

        public Builder(GetOrganizationalUnitPlainArgs defaults) {
            $ = new GetOrganizationalUnitPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the organizational unit
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param parentId Parent ID of the organizational unit.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            $.parentId = parentId;
            return this;
        }

        public GetOrganizationalUnitPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.parentId = Objects.requireNonNull($.parentId, "expected parameter 'parentId' to be non-null");
            return $;
        }
    }

}
