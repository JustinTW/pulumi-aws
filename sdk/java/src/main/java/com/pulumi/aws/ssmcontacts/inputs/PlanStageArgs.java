// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssmcontacts.inputs;

import com.pulumi.aws.ssmcontacts.inputs.PlanStageTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlanStageArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlanStageArgs Empty = new PlanStageArgs();

    @Import(name="durationInMinutes", required=true)
    private Output<Integer> durationInMinutes;

    public Output<Integer> durationInMinutes() {
        return this.durationInMinutes;
    }

    @Import(name="targets")
    private @Nullable Output<List<PlanStageTargetArgs>> targets;

    public Optional<Output<List<PlanStageTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    private PlanStageArgs() {}

    private PlanStageArgs(PlanStageArgs $) {
        this.durationInMinutes = $.durationInMinutes;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlanStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlanStageArgs $;

        public Builder() {
            $ = new PlanStageArgs();
        }

        public Builder(PlanStageArgs defaults) {
            $ = new PlanStageArgs(Objects.requireNonNull(defaults));
        }

        public Builder durationInMinutes(Output<Integer> durationInMinutes) {
            $.durationInMinutes = durationInMinutes;
            return this;
        }

        public Builder durationInMinutes(Integer durationInMinutes) {
            return durationInMinutes(Output.of(durationInMinutes));
        }

        public Builder targets(@Nullable Output<List<PlanStageTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<PlanStageTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(PlanStageTargetArgs... targets) {
            return targets(List.of(targets));
        }

        public PlanStageArgs build() {
            $.durationInMinutes = Objects.requireNonNull($.durationInMinutes, "expected parameter 'durationInMinutes' to be non-null");
            return $;
        }
    }

}
