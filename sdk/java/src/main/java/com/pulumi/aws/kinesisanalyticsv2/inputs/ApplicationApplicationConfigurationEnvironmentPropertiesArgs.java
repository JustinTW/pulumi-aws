// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class ApplicationApplicationConfigurationEnvironmentPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationEnvironmentPropertiesArgs Empty = new ApplicationApplicationConfigurationEnvironmentPropertiesArgs();

    /**
     * Describes the execution property groups.
     * 
     */
    @Import(name="propertyGroups", required=true)
    private Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs>> propertyGroups;

    /**
     * @return Describes the execution property groups.
     * 
     */
    public Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs>> propertyGroups() {
        return this.propertyGroups;
    }

    private ApplicationApplicationConfigurationEnvironmentPropertiesArgs() {}

    private ApplicationApplicationConfigurationEnvironmentPropertiesArgs(ApplicationApplicationConfigurationEnvironmentPropertiesArgs $) {
        this.propertyGroups = $.propertyGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationEnvironmentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationEnvironmentPropertiesArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationEnvironmentPropertiesArgs();
        }

        public Builder(ApplicationApplicationConfigurationEnvironmentPropertiesArgs defaults) {
            $ = new ApplicationApplicationConfigurationEnvironmentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param propertyGroups Describes the execution property groups.
         * 
         * @return builder
         * 
         */
        public Builder propertyGroups(Output<List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs>> propertyGroups) {
            $.propertyGroups = propertyGroups;
            return this;
        }

        /**
         * @param propertyGroups Describes the execution property groups.
         * 
         * @return builder
         * 
         */
        public Builder propertyGroups(List<ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs> propertyGroups) {
            return propertyGroups(Output.of(propertyGroups));
        }

        /**
         * @param propertyGroups Describes the execution property groups.
         * 
         * @return builder
         * 
         */
        public Builder propertyGroups(ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupArgs... propertyGroups) {
            return propertyGroups(List.of(propertyGroups));
        }

        public ApplicationApplicationConfigurationEnvironmentPropertiesArgs build() {
            $.propertyGroups = Objects.requireNonNull($.propertyGroups, "expected parameter 'propertyGroups' to be non-null");
            return $;
        }
    }

}
