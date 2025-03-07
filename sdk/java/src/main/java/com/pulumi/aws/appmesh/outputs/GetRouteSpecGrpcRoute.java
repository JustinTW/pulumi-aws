// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetRouteSpecGrpcRouteAction;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecGrpcRouteMatch;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecGrpcRouteRetryPolicy;
import com.pulumi.aws.appmesh.outputs.GetRouteSpecGrpcRouteTimeout;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteSpecGrpcRoute {
    private List<GetRouteSpecGrpcRouteAction> actions;
    private List<GetRouteSpecGrpcRouteMatch> matches;
    private List<GetRouteSpecGrpcRouteRetryPolicy> retryPolicies;
    private List<GetRouteSpecGrpcRouteTimeout> timeouts;

    private GetRouteSpecGrpcRoute() {}
    public List<GetRouteSpecGrpcRouteAction> actions() {
        return this.actions;
    }
    public List<GetRouteSpecGrpcRouteMatch> matches() {
        return this.matches;
    }
    public List<GetRouteSpecGrpcRouteRetryPolicy> retryPolicies() {
        return this.retryPolicies;
    }
    public List<GetRouteSpecGrpcRouteTimeout> timeouts() {
        return this.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteSpecGrpcRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRouteSpecGrpcRouteAction> actions;
        private List<GetRouteSpecGrpcRouteMatch> matches;
        private List<GetRouteSpecGrpcRouteRetryPolicy> retryPolicies;
        private List<GetRouteSpecGrpcRouteTimeout> timeouts;
        public Builder() {}
        public Builder(GetRouteSpecGrpcRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.matches = defaults.matches;
    	      this.retryPolicies = defaults.retryPolicies;
    	      this.timeouts = defaults.timeouts;
        }

        @CustomType.Setter
        public Builder actions(List<GetRouteSpecGrpcRouteAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GetRouteSpecGrpcRouteAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder matches(List<GetRouteSpecGrpcRouteMatch> matches) {
            this.matches = Objects.requireNonNull(matches);
            return this;
        }
        public Builder matches(GetRouteSpecGrpcRouteMatch... matches) {
            return matches(List.of(matches));
        }
        @CustomType.Setter
        public Builder retryPolicies(List<GetRouteSpecGrpcRouteRetryPolicy> retryPolicies) {
            this.retryPolicies = Objects.requireNonNull(retryPolicies);
            return this;
        }
        public Builder retryPolicies(GetRouteSpecGrpcRouteRetryPolicy... retryPolicies) {
            return retryPolicies(List.of(retryPolicies));
        }
        @CustomType.Setter
        public Builder timeouts(List<GetRouteSpecGrpcRouteTimeout> timeouts) {
            this.timeouts = Objects.requireNonNull(timeouts);
            return this;
        }
        public Builder timeouts(GetRouteSpecGrpcRouteTimeout... timeouts) {
            return timeouts(List.of(timeouts));
        }
        public GetRouteSpecGrpcRoute build() {
            final var o = new GetRouteSpecGrpcRoute();
            o.actions = actions;
            o.matches = matches;
            o.retryPolicies = retryPolicies;
            o.timeouts = timeouts;
            return o;
        }
    }
}
