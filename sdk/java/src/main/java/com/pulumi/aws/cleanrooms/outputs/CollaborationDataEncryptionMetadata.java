// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cleanrooms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class CollaborationDataEncryptionMetadata {
    private Boolean allowClearText;
    private Boolean allowDuplicates;
    private Boolean allowJoinsOnColumnsWithDifferentNames;
    private Boolean preserveNulls;

    private CollaborationDataEncryptionMetadata() {}
    public Boolean allowClearText() {
        return this.allowClearText;
    }
    public Boolean allowDuplicates() {
        return this.allowDuplicates;
    }
    public Boolean allowJoinsOnColumnsWithDifferentNames() {
        return this.allowJoinsOnColumnsWithDifferentNames;
    }
    public Boolean preserveNulls() {
        return this.preserveNulls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollaborationDataEncryptionMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowClearText;
        private Boolean allowDuplicates;
        private Boolean allowJoinsOnColumnsWithDifferentNames;
        private Boolean preserveNulls;
        public Builder() {}
        public Builder(CollaborationDataEncryptionMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClearText = defaults.allowClearText;
    	      this.allowDuplicates = defaults.allowDuplicates;
    	      this.allowJoinsOnColumnsWithDifferentNames = defaults.allowJoinsOnColumnsWithDifferentNames;
    	      this.preserveNulls = defaults.preserveNulls;
        }

        @CustomType.Setter
        public Builder allowClearText(Boolean allowClearText) {
            this.allowClearText = Objects.requireNonNull(allowClearText);
            return this;
        }
        @CustomType.Setter
        public Builder allowDuplicates(Boolean allowDuplicates) {
            this.allowDuplicates = Objects.requireNonNull(allowDuplicates);
            return this;
        }
        @CustomType.Setter
        public Builder allowJoinsOnColumnsWithDifferentNames(Boolean allowJoinsOnColumnsWithDifferentNames) {
            this.allowJoinsOnColumnsWithDifferentNames = Objects.requireNonNull(allowJoinsOnColumnsWithDifferentNames);
            return this;
        }
        @CustomType.Setter
        public Builder preserveNulls(Boolean preserveNulls) {
            this.preserveNulls = Objects.requireNonNull(preserveNulls);
            return this;
        }
        public CollaborationDataEncryptionMetadata build() {
            final var o = new CollaborationDataEncryptionMetadata();
            o.allowClearText = allowClearText;
            o.allowDuplicates = allowDuplicates;
            o.allowJoinsOnColumnsWithDifferentNames = allowJoinsOnColumnsWithDifferentNames;
            o.preserveNulls = preserveNulls;
            return o;
        }
    }
}
