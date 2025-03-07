// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig {
    /**
     * @return Whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values for `cookie_behavior` are `none`, `whitelist`, `allExcept`, and `all`.
     * 
     */
    private String cookieBehavior;
    /**
     * @return Object that contains a list of cookie names. See Items for more information.
     * 
     */
    private @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies;

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig() {}
    /**
     * @return Whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values for `cookie_behavior` are `none`, `whitelist`, `allExcept`, and `all`.
     * 
     */
    public String cookieBehavior() {
        return this.cookieBehavior;
    }
    /**
     * @return Object that contains a list of cookie names. See Items for more information.
     * 
     */
    public Optional<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cookieBehavior;
        private @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies;
        public Builder() {}
        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        @CustomType.Setter
        public Builder cookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig build() {
            final var o = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig();
            o.cookieBehavior = cookieBehavior;
            o.cookies = cookies;
            return o;
        }
    }
}
