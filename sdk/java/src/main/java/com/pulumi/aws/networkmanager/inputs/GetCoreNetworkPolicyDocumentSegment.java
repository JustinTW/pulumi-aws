// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCoreNetworkPolicyDocumentSegment extends com.pulumi.resources.InvokeArgs {

    public static final GetCoreNetworkPolicyDocumentSegment Empty = new GetCoreNetworkPolicyDocumentSegment();

    /**
     * List of strings of segment names that explicitly allows only routes from the segments that are listed in the array. Use the `allow_filter` setting if a segment has a well-defined group of other segments that connectivity should be restricted to. It is applied after routes have been shared in `segment_actions`. If a segment is listed in `allow_filter`, attachments between the two segments will have routes if they are also shared in the segment-actions area. For example, you might have a segment named &#34;video-producer&#34; that should only ever share routes with a &#34;video-distributor&#34; segment, no matter how many other share statements are created.
     * 
     */
    @Import(name="allowFilters")
    private @Nullable List<String> allowFilters;

    /**
     * @return List of strings of segment names that explicitly allows only routes from the segments that are listed in the array. Use the `allow_filter` setting if a segment has a well-defined group of other segments that connectivity should be restricted to. It is applied after routes have been shared in `segment_actions`. If a segment is listed in `allow_filter`, attachments between the two segments will have routes if they are also shared in the segment-actions area. For example, you might have a segment named &#34;video-producer&#34; that should only ever share routes with a &#34;video-distributor&#34; segment, no matter how many other share statements are created.
     * 
     */
    public Optional<List<String>> allowFilters() {
        return Optional.ofNullable(this.allowFilters);
    }

    /**
     * An array of segments that disallows routes from the segments listed in the array. It is applied only after routes have been shared in `segment_actions`. If a segment is listed in the `deny_filter`, attachments between the two segments will never have routes shared across them. For example, you might have a &#34;financial&#34; payment segment that should never share routes with a &#34;development&#34; segment, regardless of how many other share statements are created. Adding the payments segment to the deny-filter parameter prevents any shared routes from being created with other segments.
     * 
     */
    @Import(name="denyFilters")
    private @Nullable List<String> denyFilters;

    /**
     * @return An array of segments that disallows routes from the segments listed in the array. It is applied only after routes have been shared in `segment_actions`. If a segment is listed in the `deny_filter`, attachments between the two segments will never have routes shared across them. For example, you might have a &#34;financial&#34; payment segment that should never share routes with a &#34;development&#34; segment, regardless of how many other share statements are created. Adding the payments segment to the deny-filter parameter prevents any shared routes from being created with other segments.
     * 
     */
    public Optional<List<String>> denyFilters() {
        return Optional.ofNullable(this.denyFilters);
    }

    /**
     * A user-defined string describing the segment.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return A user-defined string describing the segment.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
     * 
     */
    @Import(name="edgeLocations")
    private @Nullable List<String> edgeLocations;

    /**
     * @return A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
     * 
     */
    public Optional<List<String>> edgeLocations() {
        return Optional.ofNullable(this.edgeLocations);
    }

    /**
     * This Boolean setting determines whether attachments on the same segment can communicate with each other. If set to `true`, the only routes available will be either shared routes through the share actions, which are attachments in other segments, or static routes. The default value is `false`. For example, you might have a segment dedicated to &#34;development&#34; that should never allow VPCs to talk to each other, even if they’re on the same segment. In this example, you would keep the default parameter of `false`.
     * 
     */
    @Import(name="isolateAttachments")
    private @Nullable Boolean isolateAttachments;

    /**
     * @return This Boolean setting determines whether attachments on the same segment can communicate with each other. If set to `true`, the only routes available will be either shared routes through the share actions, which are attachments in other segments, or static routes. The default value is `false`. For example, you might have a segment dedicated to &#34;development&#34; that should never allow VPCs to talk to each other, even if they’re on the same segment. In this example, you would keep the default parameter of `false`.
     * 
     */
    public Optional<Boolean> isolateAttachments() {
        return Optional.ofNullable(this.isolateAttachments);
    }

    /**
     * Unique name for a segment. The name is a string used in other parts of the policy document, as well as in the console for metrics and other reference points. Valid characters are a–z, and 0–9.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Unique name for a segment. The name is a string used in other parts of the policy document, as well as in the console for metrics and other reference points. Valid characters are a–z, and 0–9.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * This Boolean setting determines whether attachment requests are automatically approved or require acceptance. The default is `true`, indicating that attachment requests require acceptance. For example, you might use this setting to allow a &#34;sandbox&#34; segment to allow any attachment request so that a core network or attachment administrator does not need to review and approve attachment requests. In this example, `require_attachment_acceptance` is set to `false`.
     * 
     */
    @Import(name="requireAttachmentAcceptance")
    private @Nullable Boolean requireAttachmentAcceptance;

    /**
     * @return This Boolean setting determines whether attachment requests are automatically approved or require acceptance. The default is `true`, indicating that attachment requests require acceptance. For example, you might use this setting to allow a &#34;sandbox&#34; segment to allow any attachment request so that a core network or attachment administrator does not need to review and approve attachment requests. In this example, `require_attachment_acceptance` is set to `false`.
     * 
     */
    public Optional<Boolean> requireAttachmentAcceptance() {
        return Optional.ofNullable(this.requireAttachmentAcceptance);
    }

    private GetCoreNetworkPolicyDocumentSegment() {}

    private GetCoreNetworkPolicyDocumentSegment(GetCoreNetworkPolicyDocumentSegment $) {
        this.allowFilters = $.allowFilters;
        this.denyFilters = $.denyFilters;
        this.description = $.description;
        this.edgeLocations = $.edgeLocations;
        this.isolateAttachments = $.isolateAttachments;
        this.name = $.name;
        this.requireAttachmentAcceptance = $.requireAttachmentAcceptance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCoreNetworkPolicyDocumentSegment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCoreNetworkPolicyDocumentSegment $;

        public Builder() {
            $ = new GetCoreNetworkPolicyDocumentSegment();
        }

        public Builder(GetCoreNetworkPolicyDocumentSegment defaults) {
            $ = new GetCoreNetworkPolicyDocumentSegment(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowFilters List of strings of segment names that explicitly allows only routes from the segments that are listed in the array. Use the `allow_filter` setting if a segment has a well-defined group of other segments that connectivity should be restricted to. It is applied after routes have been shared in `segment_actions`. If a segment is listed in `allow_filter`, attachments between the two segments will have routes if they are also shared in the segment-actions area. For example, you might have a segment named &#34;video-producer&#34; that should only ever share routes with a &#34;video-distributor&#34; segment, no matter how many other share statements are created.
         * 
         * @return builder
         * 
         */
        public Builder allowFilters(@Nullable List<String> allowFilters) {
            $.allowFilters = allowFilters;
            return this;
        }

        /**
         * @param allowFilters List of strings of segment names that explicitly allows only routes from the segments that are listed in the array. Use the `allow_filter` setting if a segment has a well-defined group of other segments that connectivity should be restricted to. It is applied after routes have been shared in `segment_actions`. If a segment is listed in `allow_filter`, attachments between the two segments will have routes if they are also shared in the segment-actions area. For example, you might have a segment named &#34;video-producer&#34; that should only ever share routes with a &#34;video-distributor&#34; segment, no matter how many other share statements are created.
         * 
         * @return builder
         * 
         */
        public Builder allowFilters(String... allowFilters) {
            return allowFilters(List.of(allowFilters));
        }

        /**
         * @param denyFilters An array of segments that disallows routes from the segments listed in the array. It is applied only after routes have been shared in `segment_actions`. If a segment is listed in the `deny_filter`, attachments between the two segments will never have routes shared across them. For example, you might have a &#34;financial&#34; payment segment that should never share routes with a &#34;development&#34; segment, regardless of how many other share statements are created. Adding the payments segment to the deny-filter parameter prevents any shared routes from being created with other segments.
         * 
         * @return builder
         * 
         */
        public Builder denyFilters(@Nullable List<String> denyFilters) {
            $.denyFilters = denyFilters;
            return this;
        }

        /**
         * @param denyFilters An array of segments that disallows routes from the segments listed in the array. It is applied only after routes have been shared in `segment_actions`. If a segment is listed in the `deny_filter`, attachments between the two segments will never have routes shared across them. For example, you might have a &#34;financial&#34; payment segment that should never share routes with a &#34;development&#34; segment, regardless of how many other share statements are created. Adding the payments segment to the deny-filter parameter prevents any shared routes from being created with other segments.
         * 
         * @return builder
         * 
         */
        public Builder denyFilters(String... denyFilters) {
            return denyFilters(List.of(denyFilters));
        }

        /**
         * @param description A user-defined string describing the segment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param edgeLocations A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
         * 
         * @return builder
         * 
         */
        public Builder edgeLocations(@Nullable List<String> edgeLocations) {
            $.edgeLocations = edgeLocations;
            return this;
        }

        /**
         * @param edgeLocations A list of strings of AWS Region names. Allows you to define a more restrictive set of Regions for a segment. The edge location must be a subset of the locations that are defined for `edge_locations` in the `core_network_configuration`.
         * 
         * @return builder
         * 
         */
        public Builder edgeLocations(String... edgeLocations) {
            return edgeLocations(List.of(edgeLocations));
        }

        /**
         * @param isolateAttachments This Boolean setting determines whether attachments on the same segment can communicate with each other. If set to `true`, the only routes available will be either shared routes through the share actions, which are attachments in other segments, or static routes. The default value is `false`. For example, you might have a segment dedicated to &#34;development&#34; that should never allow VPCs to talk to each other, even if they’re on the same segment. In this example, you would keep the default parameter of `false`.
         * 
         * @return builder
         * 
         */
        public Builder isolateAttachments(@Nullable Boolean isolateAttachments) {
            $.isolateAttachments = isolateAttachments;
            return this;
        }

        /**
         * @param name Unique name for a segment. The name is a string used in other parts of the policy document, as well as in the console for metrics and other reference points. Valid characters are a–z, and 0–9.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param requireAttachmentAcceptance This Boolean setting determines whether attachment requests are automatically approved or require acceptance. The default is `true`, indicating that attachment requests require acceptance. For example, you might use this setting to allow a &#34;sandbox&#34; segment to allow any attachment request so that a core network or attachment administrator does not need to review and approve attachment requests. In this example, `require_attachment_acceptance` is set to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireAttachmentAcceptance(@Nullable Boolean requireAttachmentAcceptance) {
            $.requireAttachmentAcceptance = requireAttachmentAcceptance;
            return this;
        }

        public GetCoreNetworkPolicyDocumentSegment build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
