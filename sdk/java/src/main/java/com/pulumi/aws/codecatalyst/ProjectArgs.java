// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecatalyst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The friendly name of the project that will be displayed to users.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The friendly name of the project that will be displayed to users.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The name of the space.
     * 
     */
    @Import(name="spaceName", required=true)
    private Output<String> spaceName;

    /**
     * @return The name of the space.
     * 
     */
    public Output<String> spaceName() {
        return this.spaceName;
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.spaceName = $.spaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the project. This description will be displayed to all users of the project. We recommend providing a brief description of the project and its intended purpose.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The friendly name of the project that will be displayed to users.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The friendly name of the project that will be displayed to users.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param spaceName The name of the space.
         * 
         * @return builder
         * 
         */
        public Builder spaceName(Output<String> spaceName) {
            $.spaceName = spaceName;
            return this;
        }

        /**
         * @param spaceName The name of the space.
         * 
         * @return builder
         * 
         */
        public Builder spaceName(String spaceName) {
            return spaceName(Output.of(spaceName));
        }

        public ProjectArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.spaceName = Objects.requireNonNull($.spaceName, "expected parameter 'spaceName' to be non-null");
            return $;
        }
    }

}
