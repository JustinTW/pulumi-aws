// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSet {
    /**
     * @return Set of IPv4 or IPv6 addresses in CIDR notation to use for the Suricata `HOME_NET` variable.
     * 
     */
    private List<String> definitions;

    private FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSet() {}
    /**
     * @return Set of IPv4 or IPv6 addresses in CIDR notation to use for the Suricata `HOME_NET` variable.
     * 
     */
    public List<String> definitions() {
        return this.definitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> definitions;
        public Builder() {}
        public Builder(FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definitions = defaults.definitions;
        }

        @CustomType.Setter
        public Builder definitions(List<String> definitions) {
            this.definitions = Objects.requireNonNull(definitions);
            return this;
        }
        public Builder definitions(String... definitions) {
            return definitions(List.of(definitions));
        }
        public FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSet build() {
            final var o = new FirewallPolicyFirewallPolicyPolicyVariablesRuleVariableIpSet();
            o.definitions = definitions;
            return o;
        }
    }
}
