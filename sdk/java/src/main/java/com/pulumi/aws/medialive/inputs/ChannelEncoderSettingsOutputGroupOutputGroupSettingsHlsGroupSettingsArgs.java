// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs;
import com.pulumi.aws.medialive.inputs.ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs Empty = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs();

    /**
     * The ad marker type for this output group.
     * 
     */
    @Import(name="adMarkers")
    private @Nullable Output<List<String>> adMarkers;

    /**
     * @return The ad marker type for this output group.
     * 
     */
    public Optional<Output<List<String>>> adMarkers() {
        return Optional.ofNullable(this.adMarkers);
    }

    @Import(name="baseUrlContent")
    private @Nullable Output<String> baseUrlContent;

    public Optional<Output<String>> baseUrlContent() {
        return Optional.ofNullable(this.baseUrlContent);
    }

    @Import(name="baseUrlContent1")
    private @Nullable Output<String> baseUrlContent1;

    public Optional<Output<String>> baseUrlContent1() {
        return Optional.ofNullable(this.baseUrlContent1);
    }

    @Import(name="baseUrlManifest")
    private @Nullable Output<String> baseUrlManifest;

    public Optional<Output<String>> baseUrlManifest() {
        return Optional.ofNullable(this.baseUrlManifest);
    }

    @Import(name="baseUrlManifest1")
    private @Nullable Output<String> baseUrlManifest1;

    public Optional<Output<String>> baseUrlManifest1() {
        return Optional.ofNullable(this.baseUrlManifest1);
    }

    @Import(name="captionLanguageMappings")
    private @Nullable Output<List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs>> captionLanguageMappings;

    public Optional<Output<List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs>>> captionLanguageMappings() {
        return Optional.ofNullable(this.captionLanguageMappings);
    }

    @Import(name="captionLanguageSetting")
    private @Nullable Output<String> captionLanguageSetting;

    public Optional<Output<String>> captionLanguageSetting() {
        return Optional.ofNullable(this.captionLanguageSetting);
    }

    @Import(name="clientCache")
    private @Nullable Output<String> clientCache;

    public Optional<Output<String>> clientCache() {
        return Optional.ofNullable(this.clientCache);
    }

    @Import(name="codecSpecification")
    private @Nullable Output<String> codecSpecification;

    public Optional<Output<String>> codecSpecification() {
        return Optional.ofNullable(this.codecSpecification);
    }

    @Import(name="constantIv")
    private @Nullable Output<String> constantIv;

    public Optional<Output<String>> constantIv() {
        return Optional.ofNullable(this.constantIv);
    }

    /**
     * A director and base filename where archive files should be written. See Destination for more details.
     * 
     */
    @Import(name="destination", required=true)
    private Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs> destination;

    /**
     * @return A director and base filename where archive files should be written. See Destination for more details.
     * 
     */
    public Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs> destination() {
        return this.destination;
    }

    @Import(name="directoryStructure")
    private @Nullable Output<String> directoryStructure;

    public Optional<Output<String>> directoryStructure() {
        return Optional.ofNullable(this.directoryStructure);
    }

    @Import(name="discontinuityTags")
    private @Nullable Output<String> discontinuityTags;

    public Optional<Output<String>> discontinuityTags() {
        return Optional.ofNullable(this.discontinuityTags);
    }

    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    @Import(name="hlsCdnSettings")
    private @Nullable Output<List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs>> hlsCdnSettings;

    public Optional<Output<List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs>>> hlsCdnSettings() {
        return Optional.ofNullable(this.hlsCdnSettings);
    }

    @Import(name="hlsId3SegmentTagging")
    private @Nullable Output<String> hlsId3SegmentTagging;

    public Optional<Output<String>> hlsId3SegmentTagging() {
        return Optional.ofNullable(this.hlsId3SegmentTagging);
    }

    @Import(name="iframeOnlyPlaylists")
    private @Nullable Output<String> iframeOnlyPlaylists;

    public Optional<Output<String>> iframeOnlyPlaylists() {
        return Optional.ofNullable(this.iframeOnlyPlaylists);
    }

    @Import(name="incompleteSegmentBehavior")
    private @Nullable Output<String> incompleteSegmentBehavior;

    public Optional<Output<String>> incompleteSegmentBehavior() {
        return Optional.ofNullable(this.incompleteSegmentBehavior);
    }

    @Import(name="indexNSegments")
    private @Nullable Output<Integer> indexNSegments;

    public Optional<Output<Integer>> indexNSegments() {
        return Optional.ofNullable(this.indexNSegments);
    }

    /**
     * Controls the behavior of the RTMP group if input becomes unavailable.
     * 
     */
    @Import(name="inputLossAction")
    private @Nullable Output<String> inputLossAction;

    /**
     * @return Controls the behavior of the RTMP group if input becomes unavailable.
     * 
     */
    public Optional<Output<String>> inputLossAction() {
        return Optional.ofNullable(this.inputLossAction);
    }

    @Import(name="ivInManifest")
    private @Nullable Output<String> ivInManifest;

    public Optional<Output<String>> ivInManifest() {
        return Optional.ofNullable(this.ivInManifest);
    }

    @Import(name="ivSource")
    private @Nullable Output<String> ivSource;

    public Optional<Output<String>> ivSource() {
        return Optional.ofNullable(this.ivSource);
    }

    @Import(name="keepSegments")
    private @Nullable Output<Integer> keepSegments;

    public Optional<Output<Integer>> keepSegments() {
        return Optional.ofNullable(this.keepSegments);
    }

    @Import(name="keyFormat")
    private @Nullable Output<String> keyFormat;

    public Optional<Output<String>> keyFormat() {
        return Optional.ofNullable(this.keyFormat);
    }

    @Import(name="keyFormatVersions")
    private @Nullable Output<String> keyFormatVersions;

    public Optional<Output<String>> keyFormatVersions() {
        return Optional.ofNullable(this.keyFormatVersions);
    }

    @Import(name="keyProviderSettings")
    private @Nullable Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs> keyProviderSettings;

    public Optional<Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs>> keyProviderSettings() {
        return Optional.ofNullable(this.keyProviderSettings);
    }

    @Import(name="manifestCompression")
    private @Nullable Output<String> manifestCompression;

    public Optional<Output<String>> manifestCompression() {
        return Optional.ofNullable(this.manifestCompression);
    }

    @Import(name="manifestDurationFormat")
    private @Nullable Output<String> manifestDurationFormat;

    public Optional<Output<String>> manifestDurationFormat() {
        return Optional.ofNullable(this.manifestDurationFormat);
    }

    @Import(name="minSegmentLength")
    private @Nullable Output<Integer> minSegmentLength;

    public Optional<Output<Integer>> minSegmentLength() {
        return Optional.ofNullable(this.minSegmentLength);
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="outputSelection")
    private @Nullable Output<String> outputSelection;

    public Optional<Output<String>> outputSelection() {
        return Optional.ofNullable(this.outputSelection);
    }

    @Import(name="programDateTime")
    private @Nullable Output<String> programDateTime;

    public Optional<Output<String>> programDateTime() {
        return Optional.ofNullable(this.programDateTime);
    }

    @Import(name="programDateTimeClock")
    private @Nullable Output<String> programDateTimeClock;

    public Optional<Output<String>> programDateTimeClock() {
        return Optional.ofNullable(this.programDateTimeClock);
    }

    @Import(name="programDateTimePeriod")
    private @Nullable Output<Integer> programDateTimePeriod;

    public Optional<Output<Integer>> programDateTimePeriod() {
        return Optional.ofNullable(this.programDateTimePeriod);
    }

    @Import(name="redundantManifest")
    private @Nullable Output<String> redundantManifest;

    public Optional<Output<String>> redundantManifest() {
        return Optional.ofNullable(this.redundantManifest);
    }

    @Import(name="segmentLength")
    private @Nullable Output<Integer> segmentLength;

    public Optional<Output<Integer>> segmentLength() {
        return Optional.ofNullable(this.segmentLength);
    }

    @Import(name="segmentsPerSubdirectory")
    private @Nullable Output<Integer> segmentsPerSubdirectory;

    public Optional<Output<Integer>> segmentsPerSubdirectory() {
        return Optional.ofNullable(this.segmentsPerSubdirectory);
    }

    @Import(name="streamInfResolution")
    private @Nullable Output<String> streamInfResolution;

    public Optional<Output<String>> streamInfResolution() {
        return Optional.ofNullable(this.streamInfResolution);
    }

    /**
     * Indicates ID3 frame that has the timecode.
     * 
     */
    @Import(name="timedMetadataId3Frame")
    private @Nullable Output<String> timedMetadataId3Frame;

    /**
     * @return Indicates ID3 frame that has the timecode.
     * 
     */
    public Optional<Output<String>> timedMetadataId3Frame() {
        return Optional.ofNullable(this.timedMetadataId3Frame);
    }

    @Import(name="timedMetadataId3Period")
    private @Nullable Output<Integer> timedMetadataId3Period;

    public Optional<Output<Integer>> timedMetadataId3Period() {
        return Optional.ofNullable(this.timedMetadataId3Period);
    }

    @Import(name="timestampDeltaMilliseconds")
    private @Nullable Output<Integer> timestampDeltaMilliseconds;

    public Optional<Output<Integer>> timestampDeltaMilliseconds() {
        return Optional.ofNullable(this.timestampDeltaMilliseconds);
    }

    @Import(name="tsFileMode")
    private @Nullable Output<String> tsFileMode;

    public Optional<Output<String>> tsFileMode() {
        return Optional.ofNullable(this.tsFileMode);
    }

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs() {}

    private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs $) {
        this.adMarkers = $.adMarkers;
        this.baseUrlContent = $.baseUrlContent;
        this.baseUrlContent1 = $.baseUrlContent1;
        this.baseUrlManifest = $.baseUrlManifest;
        this.baseUrlManifest1 = $.baseUrlManifest1;
        this.captionLanguageMappings = $.captionLanguageMappings;
        this.captionLanguageSetting = $.captionLanguageSetting;
        this.clientCache = $.clientCache;
        this.codecSpecification = $.codecSpecification;
        this.constantIv = $.constantIv;
        this.destination = $.destination;
        this.directoryStructure = $.directoryStructure;
        this.discontinuityTags = $.discontinuityTags;
        this.encryptionType = $.encryptionType;
        this.hlsCdnSettings = $.hlsCdnSettings;
        this.hlsId3SegmentTagging = $.hlsId3SegmentTagging;
        this.iframeOnlyPlaylists = $.iframeOnlyPlaylists;
        this.incompleteSegmentBehavior = $.incompleteSegmentBehavior;
        this.indexNSegments = $.indexNSegments;
        this.inputLossAction = $.inputLossAction;
        this.ivInManifest = $.ivInManifest;
        this.ivSource = $.ivSource;
        this.keepSegments = $.keepSegments;
        this.keyFormat = $.keyFormat;
        this.keyFormatVersions = $.keyFormatVersions;
        this.keyProviderSettings = $.keyProviderSettings;
        this.manifestCompression = $.manifestCompression;
        this.manifestDurationFormat = $.manifestDurationFormat;
        this.minSegmentLength = $.minSegmentLength;
        this.mode = $.mode;
        this.outputSelection = $.outputSelection;
        this.programDateTime = $.programDateTime;
        this.programDateTimeClock = $.programDateTimeClock;
        this.programDateTimePeriod = $.programDateTimePeriod;
        this.redundantManifest = $.redundantManifest;
        this.segmentLength = $.segmentLength;
        this.segmentsPerSubdirectory = $.segmentsPerSubdirectory;
        this.streamInfResolution = $.streamInfResolution;
        this.timedMetadataId3Frame = $.timedMetadataId3Frame;
        this.timedMetadataId3Period = $.timedMetadataId3Period;
        this.timestampDeltaMilliseconds = $.timestampDeltaMilliseconds;
        this.tsFileMode = $.tsFileMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs $;

        public Builder() {
            $ = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs();
        }

        public Builder(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs defaults) {
            $ = new ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adMarkers The ad marker type for this output group.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(@Nullable Output<List<String>> adMarkers) {
            $.adMarkers = adMarkers;
            return this;
        }

        /**
         * @param adMarkers The ad marker type for this output group.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(List<String> adMarkers) {
            return adMarkers(Output.of(adMarkers));
        }

        /**
         * @param adMarkers The ad marker type for this output group.
         * 
         * @return builder
         * 
         */
        public Builder adMarkers(String... adMarkers) {
            return adMarkers(List.of(adMarkers));
        }

        public Builder baseUrlContent(@Nullable Output<String> baseUrlContent) {
            $.baseUrlContent = baseUrlContent;
            return this;
        }

        public Builder baseUrlContent(String baseUrlContent) {
            return baseUrlContent(Output.of(baseUrlContent));
        }

        public Builder baseUrlContent1(@Nullable Output<String> baseUrlContent1) {
            $.baseUrlContent1 = baseUrlContent1;
            return this;
        }

        public Builder baseUrlContent1(String baseUrlContent1) {
            return baseUrlContent1(Output.of(baseUrlContent1));
        }

        public Builder baseUrlManifest(@Nullable Output<String> baseUrlManifest) {
            $.baseUrlManifest = baseUrlManifest;
            return this;
        }

        public Builder baseUrlManifest(String baseUrlManifest) {
            return baseUrlManifest(Output.of(baseUrlManifest));
        }

        public Builder baseUrlManifest1(@Nullable Output<String> baseUrlManifest1) {
            $.baseUrlManifest1 = baseUrlManifest1;
            return this;
        }

        public Builder baseUrlManifest1(String baseUrlManifest1) {
            return baseUrlManifest1(Output.of(baseUrlManifest1));
        }

        public Builder captionLanguageMappings(@Nullable Output<List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs>> captionLanguageMappings) {
            $.captionLanguageMappings = captionLanguageMappings;
            return this;
        }

        public Builder captionLanguageMappings(List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs> captionLanguageMappings) {
            return captionLanguageMappings(Output.of(captionLanguageMappings));
        }

        public Builder captionLanguageMappings(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsCaptionLanguageMappingArgs... captionLanguageMappings) {
            return captionLanguageMappings(List.of(captionLanguageMappings));
        }

        public Builder captionLanguageSetting(@Nullable Output<String> captionLanguageSetting) {
            $.captionLanguageSetting = captionLanguageSetting;
            return this;
        }

        public Builder captionLanguageSetting(String captionLanguageSetting) {
            return captionLanguageSetting(Output.of(captionLanguageSetting));
        }

        public Builder clientCache(@Nullable Output<String> clientCache) {
            $.clientCache = clientCache;
            return this;
        }

        public Builder clientCache(String clientCache) {
            return clientCache(Output.of(clientCache));
        }

        public Builder codecSpecification(@Nullable Output<String> codecSpecification) {
            $.codecSpecification = codecSpecification;
            return this;
        }

        public Builder codecSpecification(String codecSpecification) {
            return codecSpecification(Output.of(codecSpecification));
        }

        public Builder constantIv(@Nullable Output<String> constantIv) {
            $.constantIv = constantIv;
            return this;
        }

        public Builder constantIv(String constantIv) {
            return constantIv(Output.of(constantIv));
        }

        /**
         * @param destination A director and base filename where archive files should be written. See Destination for more details.
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination A director and base filename where archive files should be written. See Destination for more details.
         * 
         * @return builder
         * 
         */
        public Builder destination(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder directoryStructure(@Nullable Output<String> directoryStructure) {
            $.directoryStructure = directoryStructure;
            return this;
        }

        public Builder directoryStructure(String directoryStructure) {
            return directoryStructure(Output.of(directoryStructure));
        }

        public Builder discontinuityTags(@Nullable Output<String> discontinuityTags) {
            $.discontinuityTags = discontinuityTags;
            return this;
        }

        public Builder discontinuityTags(String discontinuityTags) {
            return discontinuityTags(Output.of(discontinuityTags));
        }

        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        public Builder hlsCdnSettings(@Nullable Output<List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs>> hlsCdnSettings) {
            $.hlsCdnSettings = hlsCdnSettings;
            return this;
        }

        public Builder hlsCdnSettings(List<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs> hlsCdnSettings) {
            return hlsCdnSettings(Output.of(hlsCdnSettings));
        }

        public Builder hlsCdnSettings(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsHlsCdnSettingArgs... hlsCdnSettings) {
            return hlsCdnSettings(List.of(hlsCdnSettings));
        }

        public Builder hlsId3SegmentTagging(@Nullable Output<String> hlsId3SegmentTagging) {
            $.hlsId3SegmentTagging = hlsId3SegmentTagging;
            return this;
        }

        public Builder hlsId3SegmentTagging(String hlsId3SegmentTagging) {
            return hlsId3SegmentTagging(Output.of(hlsId3SegmentTagging));
        }

        public Builder iframeOnlyPlaylists(@Nullable Output<String> iframeOnlyPlaylists) {
            $.iframeOnlyPlaylists = iframeOnlyPlaylists;
            return this;
        }

        public Builder iframeOnlyPlaylists(String iframeOnlyPlaylists) {
            return iframeOnlyPlaylists(Output.of(iframeOnlyPlaylists));
        }

        public Builder incompleteSegmentBehavior(@Nullable Output<String> incompleteSegmentBehavior) {
            $.incompleteSegmentBehavior = incompleteSegmentBehavior;
            return this;
        }

        public Builder incompleteSegmentBehavior(String incompleteSegmentBehavior) {
            return incompleteSegmentBehavior(Output.of(incompleteSegmentBehavior));
        }

        public Builder indexNSegments(@Nullable Output<Integer> indexNSegments) {
            $.indexNSegments = indexNSegments;
            return this;
        }

        public Builder indexNSegments(Integer indexNSegments) {
            return indexNSegments(Output.of(indexNSegments));
        }

        /**
         * @param inputLossAction Controls the behavior of the RTMP group if input becomes unavailable.
         * 
         * @return builder
         * 
         */
        public Builder inputLossAction(@Nullable Output<String> inputLossAction) {
            $.inputLossAction = inputLossAction;
            return this;
        }

        /**
         * @param inputLossAction Controls the behavior of the RTMP group if input becomes unavailable.
         * 
         * @return builder
         * 
         */
        public Builder inputLossAction(String inputLossAction) {
            return inputLossAction(Output.of(inputLossAction));
        }

        public Builder ivInManifest(@Nullable Output<String> ivInManifest) {
            $.ivInManifest = ivInManifest;
            return this;
        }

        public Builder ivInManifest(String ivInManifest) {
            return ivInManifest(Output.of(ivInManifest));
        }

        public Builder ivSource(@Nullable Output<String> ivSource) {
            $.ivSource = ivSource;
            return this;
        }

        public Builder ivSource(String ivSource) {
            return ivSource(Output.of(ivSource));
        }

        public Builder keepSegments(@Nullable Output<Integer> keepSegments) {
            $.keepSegments = keepSegments;
            return this;
        }

        public Builder keepSegments(Integer keepSegments) {
            return keepSegments(Output.of(keepSegments));
        }

        public Builder keyFormat(@Nullable Output<String> keyFormat) {
            $.keyFormat = keyFormat;
            return this;
        }

        public Builder keyFormat(String keyFormat) {
            return keyFormat(Output.of(keyFormat));
        }

        public Builder keyFormatVersions(@Nullable Output<String> keyFormatVersions) {
            $.keyFormatVersions = keyFormatVersions;
            return this;
        }

        public Builder keyFormatVersions(String keyFormatVersions) {
            return keyFormatVersions(Output.of(keyFormatVersions));
        }

        public Builder keyProviderSettings(@Nullable Output<ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs> keyProviderSettings) {
            $.keyProviderSettings = keyProviderSettings;
            return this;
        }

        public Builder keyProviderSettings(ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsKeyProviderSettingsArgs keyProviderSettings) {
            return keyProviderSettings(Output.of(keyProviderSettings));
        }

        public Builder manifestCompression(@Nullable Output<String> manifestCompression) {
            $.manifestCompression = manifestCompression;
            return this;
        }

        public Builder manifestCompression(String manifestCompression) {
            return manifestCompression(Output.of(manifestCompression));
        }

        public Builder manifestDurationFormat(@Nullable Output<String> manifestDurationFormat) {
            $.manifestDurationFormat = manifestDurationFormat;
            return this;
        }

        public Builder manifestDurationFormat(String manifestDurationFormat) {
            return manifestDurationFormat(Output.of(manifestDurationFormat));
        }

        public Builder minSegmentLength(@Nullable Output<Integer> minSegmentLength) {
            $.minSegmentLength = minSegmentLength;
            return this;
        }

        public Builder minSegmentLength(Integer minSegmentLength) {
            return minSegmentLength(Output.of(minSegmentLength));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder outputSelection(@Nullable Output<String> outputSelection) {
            $.outputSelection = outputSelection;
            return this;
        }

        public Builder outputSelection(String outputSelection) {
            return outputSelection(Output.of(outputSelection));
        }

        public Builder programDateTime(@Nullable Output<String> programDateTime) {
            $.programDateTime = programDateTime;
            return this;
        }

        public Builder programDateTime(String programDateTime) {
            return programDateTime(Output.of(programDateTime));
        }

        public Builder programDateTimeClock(@Nullable Output<String> programDateTimeClock) {
            $.programDateTimeClock = programDateTimeClock;
            return this;
        }

        public Builder programDateTimeClock(String programDateTimeClock) {
            return programDateTimeClock(Output.of(programDateTimeClock));
        }

        public Builder programDateTimePeriod(@Nullable Output<Integer> programDateTimePeriod) {
            $.programDateTimePeriod = programDateTimePeriod;
            return this;
        }

        public Builder programDateTimePeriod(Integer programDateTimePeriod) {
            return programDateTimePeriod(Output.of(programDateTimePeriod));
        }

        public Builder redundantManifest(@Nullable Output<String> redundantManifest) {
            $.redundantManifest = redundantManifest;
            return this;
        }

        public Builder redundantManifest(String redundantManifest) {
            return redundantManifest(Output.of(redundantManifest));
        }

        public Builder segmentLength(@Nullable Output<Integer> segmentLength) {
            $.segmentLength = segmentLength;
            return this;
        }

        public Builder segmentLength(Integer segmentLength) {
            return segmentLength(Output.of(segmentLength));
        }

        public Builder segmentsPerSubdirectory(@Nullable Output<Integer> segmentsPerSubdirectory) {
            $.segmentsPerSubdirectory = segmentsPerSubdirectory;
            return this;
        }

        public Builder segmentsPerSubdirectory(Integer segmentsPerSubdirectory) {
            return segmentsPerSubdirectory(Output.of(segmentsPerSubdirectory));
        }

        public Builder streamInfResolution(@Nullable Output<String> streamInfResolution) {
            $.streamInfResolution = streamInfResolution;
            return this;
        }

        public Builder streamInfResolution(String streamInfResolution) {
            return streamInfResolution(Output.of(streamInfResolution));
        }

        /**
         * @param timedMetadataId3Frame Indicates ID3 frame that has the timecode.
         * 
         * @return builder
         * 
         */
        public Builder timedMetadataId3Frame(@Nullable Output<String> timedMetadataId3Frame) {
            $.timedMetadataId3Frame = timedMetadataId3Frame;
            return this;
        }

        /**
         * @param timedMetadataId3Frame Indicates ID3 frame that has the timecode.
         * 
         * @return builder
         * 
         */
        public Builder timedMetadataId3Frame(String timedMetadataId3Frame) {
            return timedMetadataId3Frame(Output.of(timedMetadataId3Frame));
        }

        public Builder timedMetadataId3Period(@Nullable Output<Integer> timedMetadataId3Period) {
            $.timedMetadataId3Period = timedMetadataId3Period;
            return this;
        }

        public Builder timedMetadataId3Period(Integer timedMetadataId3Period) {
            return timedMetadataId3Period(Output.of(timedMetadataId3Period));
        }

        public Builder timestampDeltaMilliseconds(@Nullable Output<Integer> timestampDeltaMilliseconds) {
            $.timestampDeltaMilliseconds = timestampDeltaMilliseconds;
            return this;
        }

        public Builder timestampDeltaMilliseconds(Integer timestampDeltaMilliseconds) {
            return timestampDeltaMilliseconds(Output.of(timestampDeltaMilliseconds));
        }

        public Builder tsFileMode(@Nullable Output<String> tsFileMode) {
            $.tsFileMode = tsFileMode;
            return this;
        }

        public Builder tsFileMode(String tsFileMode) {
            return tsFileMode(Output.of(tsFileMode));
        }

        public ChannelEncoderSettingsOutputGroupOutputGroupSettingsHlsGroupSettingsArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}
