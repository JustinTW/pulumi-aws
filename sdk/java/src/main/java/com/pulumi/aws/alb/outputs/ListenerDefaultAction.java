// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.outputs;

import com.pulumi.aws.alb.outputs.ListenerDefaultActionAuthenticateCognito;
import com.pulumi.aws.alb.outputs.ListenerDefaultActionAuthenticateOidc;
import com.pulumi.aws.alb.outputs.ListenerDefaultActionFixedResponse;
import com.pulumi.aws.alb.outputs.ListenerDefaultActionForward;
import com.pulumi.aws.alb.outputs.ListenerDefaultActionRedirect;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultAction {
    /**
     * @return Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    private @Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito;
    /**
     * @return Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    private @Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc;
    /**
     * @return Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    private @Nullable ListenerDefaultActionFixedResponse fixedResponse;
    /**
     * @return Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    private @Nullable ListenerDefaultActionForward forward;
    /**
     * @return Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    private @Nullable Integer order;
    /**
     * @return Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    private @Nullable ListenerDefaultActionRedirect redirect;
    /**
     * @return ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    private @Nullable String targetGroupArn;
    /**
     * @return Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     * The following arguments are optional:
     * 
     */
    private String type;

    private ListenerDefaultAction() {}
    /**
     * @return Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    public Optional<ListenerDefaultActionAuthenticateCognito> authenticateCognito() {
        return Optional.ofNullable(this.authenticateCognito);
    }
    /**
     * @return Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    public Optional<ListenerDefaultActionAuthenticateOidc> authenticateOidc() {
        return Optional.ofNullable(this.authenticateOidc);
    }
    /**
     * @return Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    public Optional<ListenerDefaultActionFixedResponse> fixedResponse() {
        return Optional.ofNullable(this.fixedResponse);
    }
    /**
     * @return Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    public Optional<ListenerDefaultActionForward> forward() {
        return Optional.ofNullable(this.forward);
    }
    /**
     * @return Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    public Optional<ListenerDefaultActionRedirect> redirect() {
        return Optional.ofNullable(this.redirect);
    }
    /**
     * @return ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    /**
     * @return Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     * The following arguments are optional:
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito;
        private @Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc;
        private @Nullable ListenerDefaultActionFixedResponse fixedResponse;
        private @Nullable ListenerDefaultActionForward forward;
        private @Nullable Integer order;
        private @Nullable ListenerDefaultActionRedirect redirect;
        private @Nullable String targetGroupArn;
        private String type;
        public Builder() {}
        public Builder(ListenerDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder authenticateCognito(@Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }
        @CustomType.Setter
        public Builder authenticateOidc(@Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }
        @CustomType.Setter
        public Builder fixedResponse(@Nullable ListenerDefaultActionFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        @CustomType.Setter
        public Builder forward(@Nullable ListenerDefaultActionForward forward) {
            this.forward = forward;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder redirect(@Nullable ListenerDefaultActionRedirect redirect) {
            this.redirect = redirect;
            return this;
        }
        @CustomType.Setter
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListenerDefaultAction build() {
            final var o = new ListenerDefaultAction();
            o.authenticateCognito = authenticateCognito;
            o.authenticateOidc = authenticateOidc;
            o.fixedResponse = fixedResponse;
            o.forward = forward;
            o.order = order;
            o.redirect = redirect;
            o.targetGroupArn = targetGroupArn;
            o.type = type;
            return o;
        }
    }
}
