/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Shipping address where customer wishes to receive the device.
 */
public class ShippingAddress {
    /**
     * Street Address line 1.
     */
    @JsonProperty(value = "streetAddress1", required = true)
    private String streetAddress1;

    /**
     * Street Address line 2.
     */
    @JsonProperty(value = "streetAddress2")
    private String streetAddress2;

    /**
     * Street Address line 3.
     */
    @JsonProperty(value = "streetAddress3")
    private String streetAddress3;

    /**
     * Name of the City.
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * Name of the State or Province.
     */
    @JsonProperty(value = "stateOrProvince")
    private String stateOrProvince;

    /**
     * Name of the Country.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /**
     * Postal code.
     */
    @JsonProperty(value = "postalCode", required = true)
    private String postalCode;

    /**
     * Extended Zip Code.
     */
    @JsonProperty(value = "zipExtendedCode")
    private String zipExtendedCode;

    /**
     * Name of the company.
     */
    @JsonProperty(value = "companyName")
    private String companyName;

    /**
     * Type of address. Possible values include: 'None', 'Residential',
     * 'Commercial'.
     */
    @JsonProperty(value = "addressType")
    private AddressType addressType;

    /**
     * Get street Address line 1.
     *
     * @return the streetAddress1 value
     */
    public String streetAddress1() {
        return this.streetAddress1;
    }

    /**
     * Set street Address line 1.
     *
     * @param streetAddress1 the streetAddress1 value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
        return this;
    }

    /**
     * Get street Address line 2.
     *
     * @return the streetAddress2 value
     */
    public String streetAddress2() {
        return this.streetAddress2;
    }

    /**
     * Set street Address line 2.
     *
     * @param streetAddress2 the streetAddress2 value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
        return this;
    }

    /**
     * Get street Address line 3.
     *
     * @return the streetAddress3 value
     */
    public String streetAddress3() {
        return this.streetAddress3;
    }

    /**
     * Set street Address line 3.
     *
     * @param streetAddress3 the streetAddress3 value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withStreetAddress3(String streetAddress3) {
        this.streetAddress3 = streetAddress3;
        return this;
    }

    /**
     * Get name of the City.
     *
     * @return the city value
     */
    public String city() {
        return this.city;
    }

    /**
     * Set name of the City.
     *
     * @param city the city value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get name of the State or Province.
     *
     * @return the stateOrProvince value
     */
    public String stateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * Set name of the State or Province.
     *
     * @param stateOrProvince the stateOrProvince value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * Get name of the Country.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set name of the Country.
     *
     * @param country the country value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get postal code.
     *
     * @return the postalCode value
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set postal code.
     *
     * @param postalCode the postalCode value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get extended Zip Code.
     *
     * @return the zipExtendedCode value
     */
    public String zipExtendedCode() {
        return this.zipExtendedCode;
    }

    /**
     * Set extended Zip Code.
     *
     * @param zipExtendedCode the zipExtendedCode value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withZipExtendedCode(String zipExtendedCode) {
        this.zipExtendedCode = zipExtendedCode;
        return this;
    }

    /**
     * Get name of the company.
     *
     * @return the companyName value
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set name of the company.
     *
     * @param companyName the companyName value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get type of address. Possible values include: 'None', 'Residential', 'Commercial'.
     *
     * @return the addressType value
     */
    public AddressType addressType() {
        return this.addressType;
    }

    /**
     * Set type of address. Possible values include: 'None', 'Residential', 'Commercial'.
     *
     * @param addressType the addressType value to set
     * @return the ShippingAddress object itself.
     */
    public ShippingAddress withAddressType(AddressType addressType) {
        this.addressType = addressType;
        return this;
    }

}
