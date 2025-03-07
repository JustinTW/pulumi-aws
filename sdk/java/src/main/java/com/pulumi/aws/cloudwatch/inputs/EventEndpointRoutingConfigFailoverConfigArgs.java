// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigPrimaryArgs;
import com.pulumi.aws.cloudwatch.inputs.EventEndpointRoutingConfigFailoverConfigSecondaryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class EventEndpointRoutingConfigFailoverConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventEndpointRoutingConfigFailoverConfigArgs Empty = new EventEndpointRoutingConfigFailoverConfigArgs();

    /**
     * Parameters used for the primary Region. Documented below.
     * 
     */
    @Import(name="primary", required=true)
    private Output<EventEndpointRoutingConfigFailoverConfigPrimaryArgs> primary;

    /**
     * @return Parameters used for the primary Region. Documented below.
     * 
     */
    public Output<EventEndpointRoutingConfigFailoverConfigPrimaryArgs> primary() {
        return this.primary;
    }

    /**
     * Parameters used for the secondary Region, the Region that events are routed to when failover is triggered or event replication is enabled. Documented below.
     * 
     */
    @Import(name="secondary", required=true)
    private Output<EventEndpointRoutingConfigFailoverConfigSecondaryArgs> secondary;

    /**
     * @return Parameters used for the secondary Region, the Region that events are routed to when failover is triggered or event replication is enabled. Documented below.
     * 
     */
    public Output<EventEndpointRoutingConfigFailoverConfigSecondaryArgs> secondary() {
        return this.secondary;
    }

    private EventEndpointRoutingConfigFailoverConfigArgs() {}

    private EventEndpointRoutingConfigFailoverConfigArgs(EventEndpointRoutingConfigFailoverConfigArgs $) {
        this.primary = $.primary;
        this.secondary = $.secondary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventEndpointRoutingConfigFailoverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventEndpointRoutingConfigFailoverConfigArgs $;

        public Builder() {
            $ = new EventEndpointRoutingConfigFailoverConfigArgs();
        }

        public Builder(EventEndpointRoutingConfigFailoverConfigArgs defaults) {
            $ = new EventEndpointRoutingConfigFailoverConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param primary Parameters used for the primary Region. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder primary(Output<EventEndpointRoutingConfigFailoverConfigPrimaryArgs> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Parameters used for the primary Region. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder primary(EventEndpointRoutingConfigFailoverConfigPrimaryArgs primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param secondary Parameters used for the secondary Region, the Region that events are routed to when failover is triggered or event replication is enabled. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondary(Output<EventEndpointRoutingConfigFailoverConfigSecondaryArgs> secondary) {
            $.secondary = secondary;
            return this;
        }

        /**
         * @param secondary Parameters used for the secondary Region, the Region that events are routed to when failover is triggered or event replication is enabled. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondary(EventEndpointRoutingConfigFailoverConfigSecondaryArgs secondary) {
            return secondary(Output.of(secondary));
        }

        public EventEndpointRoutingConfigFailoverConfigArgs build() {
            $.primary = Objects.requireNonNull($.primary, "expected parameter 'primary' to be non-null");
            $.secondary = Objects.requireNonNull($.secondary, "expected parameter 'secondary' to be non-null");
            return $;
        }
    }

}
