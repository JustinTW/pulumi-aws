// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.shield.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DrtAccessLogBucketAssociationTimeoutsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DrtAccessLogBucketAssociationTimeoutsArgs Empty = new DrtAccessLogBucketAssociationTimeoutsArgs();

    @Import(name="create")
    private @Nullable Output<String> create;

    public Optional<Output<String>> create() {
        return Optional.ofNullable(this.create);
    }

    @Import(name="delete")
    private @Nullable Output<String> delete;

    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    @Import(name="read")
    private @Nullable Output<String> read;

    public Optional<Output<String>> read() {
        return Optional.ofNullable(this.read);
    }

    private DrtAccessLogBucketAssociationTimeoutsArgs() {}

    private DrtAccessLogBucketAssociationTimeoutsArgs(DrtAccessLogBucketAssociationTimeoutsArgs $) {
        this.create = $.create;
        this.delete = $.delete;
        this.read = $.read;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DrtAccessLogBucketAssociationTimeoutsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DrtAccessLogBucketAssociationTimeoutsArgs $;

        public Builder() {
            $ = new DrtAccessLogBucketAssociationTimeoutsArgs();
        }

        public Builder(DrtAccessLogBucketAssociationTimeoutsArgs defaults) {
            $ = new DrtAccessLogBucketAssociationTimeoutsArgs(Objects.requireNonNull(defaults));
        }

        public Builder create(@Nullable Output<String> create) {
            $.create = create;
            return this;
        }

        public Builder create(String create) {
            return create(Output.of(create));
        }

        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        public Builder read(@Nullable Output<String> read) {
            $.read = read;
            return this;
        }

        public Builder read(String read) {
            return read(Output.of(read));
        }

        public DrtAccessLogBucketAssociationTimeoutsArgs build() {
            return $;
        }
    }

}
