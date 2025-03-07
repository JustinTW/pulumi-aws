// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserHierarchyGroupHierarchyPathLevelTwo {
    /**
     * @return ARN of the hierarchy group.
     * 
     */
    private String arn;
    /**
     * @return The identifier of the hierarchy group.
     * 
     */
    private String id;
    /**
     * @return Returns information on a specific hierarchy group by name
     * 
     */
    private String name;

    private GetUserHierarchyGroupHierarchyPathLevelTwo() {}
    /**
     * @return ARN of the hierarchy group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The identifier of the hierarchy group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Returns information on a specific hierarchy group by name
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserHierarchyGroupHierarchyPathLevelTwo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetUserHierarchyGroupHierarchyPathLevelTwo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetUserHierarchyGroupHierarchyPathLevelTwo build() {
            final var o = new GetUserHierarchyGroupHierarchyPathLevelTwo();
            o.arn = arn;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
