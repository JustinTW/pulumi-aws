// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ChannelDestinationMediaPackageSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelDestinationMediaPackageSettingArgs Empty = new ChannelDestinationMediaPackageSettingArgs();

    /**
     * ID of the channel in MediaPackage that is the destination for this output group.
     * 
     */
    @Import(name="channelId", required=true)
    private Output<String> channelId;

    /**
     * @return ID of the channel in MediaPackage that is the destination for this output group.
     * 
     */
    public Output<String> channelId() {
        return this.channelId;
    }

    private ChannelDestinationMediaPackageSettingArgs() {}

    private ChannelDestinationMediaPackageSettingArgs(ChannelDestinationMediaPackageSettingArgs $) {
        this.channelId = $.channelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelDestinationMediaPackageSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelDestinationMediaPackageSettingArgs $;

        public Builder() {
            $ = new ChannelDestinationMediaPackageSettingArgs();
        }

        public Builder(ChannelDestinationMediaPackageSettingArgs defaults) {
            $ = new ChannelDestinationMediaPackageSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channelId ID of the channel in MediaPackage that is the destination for this output group.
         * 
         * @return builder
         * 
         */
        public Builder channelId(Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        /**
         * @param channelId ID of the channel in MediaPackage that is the destination for this output group.
         * 
         * @return builder
         * 
         */
        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        public ChannelDestinationMediaPackageSettingArgs build() {
            $.channelId = Objects.requireNonNull($.channelId, "expected parameter 'channelId' to be non-null");
            return $;
        }
    }

}
