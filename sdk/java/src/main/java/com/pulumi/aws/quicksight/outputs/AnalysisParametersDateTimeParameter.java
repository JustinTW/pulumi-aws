// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AnalysisParametersDateTimeParameter {
    /**
     * @return Display name for the analysis.
     * 
     * The following arguments are optional:
     * 
     */
    private String name;
    private List<String> values;

    private AnalysisParametersDateTimeParameter() {}
    /**
     * @return Display name for the analysis.
     * 
     * The following arguments are optional:
     * 
     */
    public String name() {
        return this.name;
    }
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisParametersDateTimeParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<String> values;
        public Builder() {}
        public Builder(AnalysisParametersDateTimeParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public AnalysisParametersDateTimeParameter build() {
            final var o = new AnalysisParametersDateTimeParameter();
            o.name = name;
            o.values = values;
            return o;
        }
    }
}
