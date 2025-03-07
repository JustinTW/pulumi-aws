// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chimesdkmediapipelines.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfiguration {
    /**
     * @return Labels all personally identifiable information (PII) identified in Transcript events.
     * 
     */
    private @Nullable String contentIdentificationType;
    /**
     * @return Redacts all personally identifiable information (PII) identified in Transcript events.
     * 
     */
    private @Nullable String contentRedactionType;
    /**
     * @return Enables partial result stabilization in Transcript events.
     * 
     */
    private @Nullable Boolean enablePartialResultsStabilization;
    /**
     * @return Filters partial Utterance events from delivery to the insights target.
     * 
     */
    private @Nullable Boolean filterPartialResults;
    /**
     * @return Language code for the transcription model.
     * 
     */
    private String languageCode;
    /**
     * @return Name of custom language model for transcription.
     * 
     */
    private @Nullable String languageModelName;
    /**
     * @return Level of stability to use when partial results stabilization is enabled.
     * 
     */
    private @Nullable String partialResultsStability;
    /**
     * @return Types of personally identifiable information (PII) to redact from a Transcript event.
     * 
     */
    private @Nullable String piiEntityTypes;
    /**
     * @return Enables speaker partitioning (diarization) in your Transcript events.
     * 
     */
    private @Nullable Boolean showSpeakerLabel;
    /**
     * @return Method for applying a vocabulary filter to Transcript events.
     * 
     */
    private @Nullable String vocabularyFilterMethod;
    /**
     * @return Name of the custom vocabulary filter to use when processing Transcript events.
     * 
     */
    private @Nullable String vocabularyFilterName;
    /**
     * @return Name of the custom vocabulary to use when processing Transcript events.
     * 
     */
    private @Nullable String vocabularyName;

    private MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfiguration() {}
    /**
     * @return Labels all personally identifiable information (PII) identified in Transcript events.
     * 
     */
    public Optional<String> contentIdentificationType() {
        return Optional.ofNullable(this.contentIdentificationType);
    }
    /**
     * @return Redacts all personally identifiable information (PII) identified in Transcript events.
     * 
     */
    public Optional<String> contentRedactionType() {
        return Optional.ofNullable(this.contentRedactionType);
    }
    /**
     * @return Enables partial result stabilization in Transcript events.
     * 
     */
    public Optional<Boolean> enablePartialResultsStabilization() {
        return Optional.ofNullable(this.enablePartialResultsStabilization);
    }
    /**
     * @return Filters partial Utterance events from delivery to the insights target.
     * 
     */
    public Optional<Boolean> filterPartialResults() {
        return Optional.ofNullable(this.filterPartialResults);
    }
    /**
     * @return Language code for the transcription model.
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return Name of custom language model for transcription.
     * 
     */
    public Optional<String> languageModelName() {
        return Optional.ofNullable(this.languageModelName);
    }
    /**
     * @return Level of stability to use when partial results stabilization is enabled.
     * 
     */
    public Optional<String> partialResultsStability() {
        return Optional.ofNullable(this.partialResultsStability);
    }
    /**
     * @return Types of personally identifiable information (PII) to redact from a Transcript event.
     * 
     */
    public Optional<String> piiEntityTypes() {
        return Optional.ofNullable(this.piiEntityTypes);
    }
    /**
     * @return Enables speaker partitioning (diarization) in your Transcript events.
     * 
     */
    public Optional<Boolean> showSpeakerLabel() {
        return Optional.ofNullable(this.showSpeakerLabel);
    }
    /**
     * @return Method for applying a vocabulary filter to Transcript events.
     * 
     */
    public Optional<String> vocabularyFilterMethod() {
        return Optional.ofNullable(this.vocabularyFilterMethod);
    }
    /**
     * @return Name of the custom vocabulary filter to use when processing Transcript events.
     * 
     */
    public Optional<String> vocabularyFilterName() {
        return Optional.ofNullable(this.vocabularyFilterName);
    }
    /**
     * @return Name of the custom vocabulary to use when processing Transcript events.
     * 
     */
    public Optional<String> vocabularyName() {
        return Optional.ofNullable(this.vocabularyName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String contentIdentificationType;
        private @Nullable String contentRedactionType;
        private @Nullable Boolean enablePartialResultsStabilization;
        private @Nullable Boolean filterPartialResults;
        private String languageCode;
        private @Nullable String languageModelName;
        private @Nullable String partialResultsStability;
        private @Nullable String piiEntityTypes;
        private @Nullable Boolean showSpeakerLabel;
        private @Nullable String vocabularyFilterMethod;
        private @Nullable String vocabularyFilterName;
        private @Nullable String vocabularyName;
        public Builder() {}
        public Builder(MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentIdentificationType = defaults.contentIdentificationType;
    	      this.contentRedactionType = defaults.contentRedactionType;
    	      this.enablePartialResultsStabilization = defaults.enablePartialResultsStabilization;
    	      this.filterPartialResults = defaults.filterPartialResults;
    	      this.languageCode = defaults.languageCode;
    	      this.languageModelName = defaults.languageModelName;
    	      this.partialResultsStability = defaults.partialResultsStability;
    	      this.piiEntityTypes = defaults.piiEntityTypes;
    	      this.showSpeakerLabel = defaults.showSpeakerLabel;
    	      this.vocabularyFilterMethod = defaults.vocabularyFilterMethod;
    	      this.vocabularyFilterName = defaults.vocabularyFilterName;
    	      this.vocabularyName = defaults.vocabularyName;
        }

        @CustomType.Setter
        public Builder contentIdentificationType(@Nullable String contentIdentificationType) {
            this.contentIdentificationType = contentIdentificationType;
            return this;
        }
        @CustomType.Setter
        public Builder contentRedactionType(@Nullable String contentRedactionType) {
            this.contentRedactionType = contentRedactionType;
            return this;
        }
        @CustomType.Setter
        public Builder enablePartialResultsStabilization(@Nullable Boolean enablePartialResultsStabilization) {
            this.enablePartialResultsStabilization = enablePartialResultsStabilization;
            return this;
        }
        @CustomType.Setter
        public Builder filterPartialResults(@Nullable Boolean filterPartialResults) {
            this.filterPartialResults = filterPartialResults;
            return this;
        }
        @CustomType.Setter
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        @CustomType.Setter
        public Builder languageModelName(@Nullable String languageModelName) {
            this.languageModelName = languageModelName;
            return this;
        }
        @CustomType.Setter
        public Builder partialResultsStability(@Nullable String partialResultsStability) {
            this.partialResultsStability = partialResultsStability;
            return this;
        }
        @CustomType.Setter
        public Builder piiEntityTypes(@Nullable String piiEntityTypes) {
            this.piiEntityTypes = piiEntityTypes;
            return this;
        }
        @CustomType.Setter
        public Builder showSpeakerLabel(@Nullable Boolean showSpeakerLabel) {
            this.showSpeakerLabel = showSpeakerLabel;
            return this;
        }
        @CustomType.Setter
        public Builder vocabularyFilterMethod(@Nullable String vocabularyFilterMethod) {
            this.vocabularyFilterMethod = vocabularyFilterMethod;
            return this;
        }
        @CustomType.Setter
        public Builder vocabularyFilterName(@Nullable String vocabularyFilterName) {
            this.vocabularyFilterName = vocabularyFilterName;
            return this;
        }
        @CustomType.Setter
        public Builder vocabularyName(@Nullable String vocabularyName) {
            this.vocabularyName = vocabularyName;
            return this;
        }
        public MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfiguration build() {
            final var o = new MediaInsightsPipelineConfigurationElementAmazonTranscribeProcessorConfiguration();
            o.contentIdentificationType = contentIdentificationType;
            o.contentRedactionType = contentRedactionType;
            o.enablePartialResultsStabilization = enablePartialResultsStabilization;
            o.filterPartialResults = filterPartialResults;
            o.languageCode = languageCode;
            o.languageModelName = languageModelName;
            o.partialResultsStability = partialResultsStability;
            o.piiEntityTypes = piiEntityTypes;
            o.showSpeakerLabel = showSpeakerLabel;
            o.vocabularyFilterMethod = vocabularyFilterMethod;
            o.vocabularyFilterName = vocabularyFilterName;
            o.vocabularyName = vocabularyName;
            return o;
        }
    }
}
