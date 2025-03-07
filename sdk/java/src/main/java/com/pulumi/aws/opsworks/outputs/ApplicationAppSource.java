// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationAppSource {
    /**
     * @return Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    private @Nullable String password;
    /**
     * @return For sources that are version-aware, the revision to use.
     * 
     */
    private @Nullable String revision;
    /**
     * @return SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    private @Nullable String sshKey;
    /**
     * @return The type of source to use. For example, &#34;archive&#34;.
     * 
     */
    private String type;
    /**
     * @return The URL where the app resource can be found.
     * 
     */
    private @Nullable String url;
    /**
     * @return Username to use when authenticating to the source.
     * 
     */
    private @Nullable String username;

    private ApplicationAppSource() {}
    /**
     * @return Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return For sources that are version-aware, the revision to use.
     * 
     */
    public Optional<String> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Optional<String> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }
    /**
     * @return The type of source to use. For example, &#34;archive&#34;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The URL where the app resource can be found.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return Username to use when authenticating to the source.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String password;
        private @Nullable String revision;
        private @Nullable String sshKey;
        private String type;
        private @Nullable String url;
        private @Nullable String username;
        public Builder() {}
        public Builder(ApplicationAppSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder revision(@Nullable String revision) {
            this.revision = revision;
            return this;
        }
        @CustomType.Setter
        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public ApplicationAppSource build() {
            final var o = new ApplicationAppSource();
            o.password = password;
            o.revision = revision;
            o.sshKey = sshKey;
            o.type = type;
            o.url = url;
            o.username = username;
            return o;
        }
    }
}
