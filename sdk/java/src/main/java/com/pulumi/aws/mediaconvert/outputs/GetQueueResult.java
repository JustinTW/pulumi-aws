// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediaconvert.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetQueueResult {
    /**
     * @return The Arn of the queue.
     * 
     */
    private String arn;
    private String id;
    /**
     * @return The same as `id`.
     * 
     */
    private String name;
    /**
     * @return The status of the queue.
     * 
     */
    private String status;
    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    private Map<String,String> tags;

    private GetQueueResult() {}
    /**
     * @return The Arn of the queue.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The same as `id`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The status of the queue.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private String status;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
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
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetQueueResult build() {
            final var o = new GetQueueResult();
            o.arn = arn;
            o.id = id;
            o.name = name;
            o.status = status;
            o.tags = tags;
            return o;
        }
    }
}
