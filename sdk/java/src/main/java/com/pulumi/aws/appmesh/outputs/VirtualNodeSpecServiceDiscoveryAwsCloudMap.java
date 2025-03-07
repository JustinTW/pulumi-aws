// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecServiceDiscoveryAwsCloudMap {
    /**
     * @return String map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
     * 
     */
    private @Nullable Map<String,String> attributes;
    /**
     * @return Name of the AWS Cloud Map namespace to use.
     * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
     * 
     */
    private String namespaceName;
    /**
     * @return Name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
     * 
     */
    private String serviceName;

    private VirtualNodeSpecServiceDiscoveryAwsCloudMap() {}
    /**
     * @return String map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
     * 
     */
    public Map<String,String> attributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }
    /**
     * @return Name of the AWS Cloud Map namespace to use.
     * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }
    /**
     * @return Name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryAwsCloudMap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> attributes;
        private String namespaceName;
        private String serviceName;
        public Builder() {}
        public Builder(VirtualNodeSpecServiceDiscoveryAwsCloudMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.namespaceName = defaults.namespaceName;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = attributes;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public VirtualNodeSpecServiceDiscoveryAwsCloudMap build() {
            final var o = new VirtualNodeSpecServiceDiscoveryAwsCloudMap();
            o.attributes = attributes;
            o.namespaceName = namespaceName;
            o.serviceName = serviceName;
            return o;
        }
    }
}
