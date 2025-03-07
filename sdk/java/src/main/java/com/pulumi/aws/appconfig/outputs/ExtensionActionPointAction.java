// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExtensionActionPointAction {
    /**
     * @return Information about the action.
     * 
     */
    private @Nullable String description;
    /**
     * @return The action name.
     * 
     */
    private String name;
    /**
     * @return An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * 
     */
    private String roleArn;
    /**
     * @return The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic, or the Amazon EventBridge default event bus.
     * 
     */
    private String uri;

    private ExtensionActionPointAction() {}
    /**
     * @return Information about the action.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The action name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic, or the Amazon EventBridge default event bus.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionActionPointAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String name;
        private String roleArn;
        private String uri;
        public Builder() {}
        public Builder(ExtensionActionPointAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ExtensionActionPointAction build() {
            final var o = new ExtensionActionPointAction();
            o.description = description;
            o.name = name;
            o.roleArn = roleArn;
            o.uri = uri;
            return o;
        }
    }
}
