// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.NetworkInsightsAnalysisExplanationSecurityGroupRulePortRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisExplanationSecurityGroupRule {
    private @Nullable String cidr;
    private @Nullable String direction;
    private @Nullable List<NetworkInsightsAnalysisExplanationSecurityGroupRulePortRange> portRanges;
    private @Nullable String prefixListId;
    private @Nullable String protocol;
    private @Nullable String securityGroupId;

    private NetworkInsightsAnalysisExplanationSecurityGroupRule() {}
    public Optional<String> cidr() {
        return Optional.ofNullable(this.cidr);
    }
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    public List<NetworkInsightsAnalysisExplanationSecurityGroupRulePortRange> portRanges() {
        return this.portRanges == null ? List.of() : this.portRanges;
    }
    public Optional<String> prefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    public Optional<String> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisExplanationSecurityGroupRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cidr;
        private @Nullable String direction;
        private @Nullable List<NetworkInsightsAnalysisExplanationSecurityGroupRulePortRange> portRanges;
        private @Nullable String prefixListId;
        private @Nullable String protocol;
        private @Nullable String securityGroupId;
        public Builder() {}
        public Builder(NetworkInsightsAnalysisExplanationSecurityGroupRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.direction = defaults.direction;
    	      this.portRanges = defaults.portRanges;
    	      this.prefixListId = defaults.prefixListId;
    	      this.protocol = defaults.protocol;
    	      this.securityGroupId = defaults.securityGroupId;
        }

        @CustomType.Setter
        public Builder cidr(@Nullable String cidr) {
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder portRanges(@Nullable List<NetworkInsightsAnalysisExplanationSecurityGroupRulePortRange> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public Builder portRanges(NetworkInsightsAnalysisExplanationSecurityGroupRulePortRange... portRanges) {
            return portRanges(List.of(portRanges));
        }
        @CustomType.Setter
        public Builder prefixListId(@Nullable String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public NetworkInsightsAnalysisExplanationSecurityGroupRule build() {
            final var o = new NetworkInsightsAnalysisExplanationSecurityGroupRule();
            o.cidr = cidr;
            o.direction = direction;
            o.portRanges = portRanges;
            o.prefixListId = prefixListId;
            o.protocol = protocol;
            o.securityGroupId = securityGroupId;
            return o;
        }
    }
}
