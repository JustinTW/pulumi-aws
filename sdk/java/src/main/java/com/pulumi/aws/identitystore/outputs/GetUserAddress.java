// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserAddress {
    /**
     * @return The country that this address is in.
     * 
     */
    private String country;
    /**
     * @return The name that is typically displayed when the name is shown for display.
     * 
     */
    private String formatted;
    /**
     * @return The address locality.
     * 
     */
    private String locality;
    /**
     * @return The postal code of the address.
     * 
     */
    private String postalCode;
    /**
     * @return When `true`, this is the primary phone number associated with the user.
     * 
     */
    private Boolean primary;
    /**
     * @return The region of the address.
     * 
     */
    private String region;
    /**
     * @return The street of the address.
     * 
     */
    private String streetAddress;
    /**
     * @return The type of phone number.
     * 
     */
    private String type;

    private GetUserAddress() {}
    /**
     * @return The country that this address is in.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return The name that is typically displayed when the name is shown for display.
     * 
     */
    public String formatted() {
        return this.formatted;
    }
    /**
     * @return The address locality.
     * 
     */
    public String locality() {
        return this.locality;
    }
    /**
     * @return The postal code of the address.
     * 
     */
    public String postalCode() {
        return this.postalCode;
    }
    /**
     * @return When `true`, this is the primary phone number associated with the user.
     * 
     */
    public Boolean primary() {
        return this.primary;
    }
    /**
     * @return The region of the address.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The street of the address.
     * 
     */
    public String streetAddress() {
        return this.streetAddress;
    }
    /**
     * @return The type of phone number.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String country;
        private String formatted;
        private String locality;
        private String postalCode;
        private Boolean primary;
        private String region;
        private String streetAddress;
        private String type;
        public Builder() {}
        public Builder(GetUserAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.country = defaults.country;
    	      this.formatted = defaults.formatted;
    	      this.locality = defaults.locality;
    	      this.postalCode = defaults.postalCode;
    	      this.primary = defaults.primary;
    	      this.region = defaults.region;
    	      this.streetAddress = defaults.streetAddress;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        @CustomType.Setter
        public Builder formatted(String formatted) {
            this.formatted = Objects.requireNonNull(formatted);
            return this;
        }
        @CustomType.Setter
        public Builder locality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }
        @CustomType.Setter
        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        @CustomType.Setter
        public Builder primary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder streetAddress(String streetAddress) {
            this.streetAddress = Objects.requireNonNull(streetAddress);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetUserAddress build() {
            final var o = new GetUserAddress();
            o.country = country;
            o.formatted = formatted;
            o.locality = locality;
            o.postalCode = postalCode;
            o.primary = primary;
            o.region = region;
            o.streetAddress = streetAddress;
            o.type = type;
            return o;
        }
    }
}
