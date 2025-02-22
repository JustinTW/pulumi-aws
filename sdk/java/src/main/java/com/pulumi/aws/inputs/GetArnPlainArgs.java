// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetArnPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetArnPlainArgs Empty = new GetArnPlainArgs();

    /**
     * ARN to parse.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return ARN to parse.
     * 
     */
    public String arn() {
        return this.arn;
    }

    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetArnPlainArgs() {}

    private GetArnPlainArgs(GetArnPlainArgs $) {
        this.arn = $.arn;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetArnPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetArnPlainArgs $;

        public Builder() {
            $ = new GetArnPlainArgs();
        }

        public Builder(GetArnPlainArgs defaults) {
            $ = new GetArnPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN to parse.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetArnPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
