// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrserverless.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationAutoStartConfiguration {
    /**
     * @return Enables the application to automatically start on job submission. Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;

    private ApplicationAutoStartConfiguration() {}
    /**
     * @return Enables the application to automatically start on job submission. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAutoStartConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(ApplicationAutoStartConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public ApplicationAutoStartConfiguration build() {
            final var o = new ApplicationAutoStartConfiguration();
            o.enabled = enabled;
            return o;
        }
    }
}
