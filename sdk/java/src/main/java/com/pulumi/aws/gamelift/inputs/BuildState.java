// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildState extends com.pulumi.resources.ResourceArgs {

    public static final BuildState Empty = new BuildState();

    /**
     * GameLift Build ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return GameLift Build ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Name of the build
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the build
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
     * 
     */
    @Import(name="operatingSystem")
    private @Nullable Output<String> operatingSystem;

    /**
     * @return Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
     * 
     */
    public Optional<Output<String>> operatingSystem() {
        return Optional.ofNullable(this.operatingSystem);
    }

    /**
     * Information indicating where your game build files are stored. See below.
     * 
     */
    @Import(name="storageLocation")
    private @Nullable Output<BuildStorageLocationArgs> storageLocation;

    /**
     * @return Information indicating where your game build files are stored. See below.
     * 
     */
    public Optional<Output<BuildStorageLocationArgs>> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Version that is associated with this build.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version that is associated with this build.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private BuildState() {}

    private BuildState(BuildState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.operatingSystem = $.operatingSystem;
        this.storageLocation = $.storageLocation;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildState $;

        public Builder() {
            $ = new BuildState();
        }

        public Builder(BuildState defaults) {
            $ = new BuildState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn GameLift Build ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn GameLift Build ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name Name of the build
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the build
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param operatingSystem Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(@Nullable Output<String> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(String operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param storageLocation Information indicating where your game build files are stored. See below.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(@Nullable Output<BuildStorageLocationArgs> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation Information indicating where your game build files are stored. See below.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(BuildStorageLocationArgs storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use `tags` instead.
         * 
         */
        @Deprecated /* Please use `tags` instead. */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param version Version that is associated with this build.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version that is associated with this build.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public BuildState build() {
            return $;
        }
    }

}
