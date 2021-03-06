/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Provides information about an Azure data center location.
 */
@JsonFlatten
public class LocationInner {
    /**
     * Specifies the resource identifier of the location.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Specifies the name of the location. Use List Locations to get all
     * supported locations.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the type of the location.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The recipient name to use when shipping the drives to the Azure data
     * center.
     */
    @JsonProperty(value = "properties.recipientName")
    private String recipientName;

    /**
     * The first line of the street address to use when shipping the drives to
     * the Azure data center.
     */
    @JsonProperty(value = "properties.streetAddress1")
    private String streetAddress1;

    /**
     * The second line of the street address to use when shipping the drives to
     * the Azure data center.
     */
    @JsonProperty(value = "properties.streetAddress2")
    private String streetAddress2;

    /**
     * The city name to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "properties.city")
    private String city;

    /**
     * The state or province to use when shipping the drives to the Azure data
     * center.
     */
    @JsonProperty(value = "properties.stateOrProvince")
    private String stateOrProvince;

    /**
     * The postal code to use when shipping the drives to the Azure data
     * center.
     */
    @JsonProperty(value = "properties.postalCode")
    private String postalCode;

    /**
     * The country or region to use when shipping the drives to the Azure data
     * center.
     */
    @JsonProperty(value = "properties.countryOrRegion")
    private String countryOrRegion;

    /**
     * The phone number for the Azure data center.
     */
    @JsonProperty(value = "properties.phone")
    private String phone;

    /**
     * A list of carriers that are supported at this location.
     */
    @JsonProperty(value = "properties.supportedCarriers")
    private List<String> supportedCarriers;

    /**
     * A list of location IDs that should be used to ship shipping drives to
     * for jobs created against the current location. If the current location
     * is active, it will be part of the list. If it is temporarily closed due
     * to maintenance, this list may contain other locations.
     */
    @JsonProperty(value = "properties.alternateLocations")
    private List<String> alternateLocations;

    /**
     * Get specifies the resource identifier of the location.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set specifies the resource identifier of the location.
     *
     * @param id the id value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get specifies the name of the location. Use List Locations to get all supported locations.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set specifies the name of the location. Use List Locations to get all supported locations.
     *
     * @param name the name value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the type of the location.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set specifies the type of the location.
     *
     * @param type the type value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the recipient name to use when shipping the drives to the Azure data center.
     *
     * @return the recipientName value
     */
    public String recipientName() {
        return this.recipientName;
    }

    /**
     * Set the recipient name to use when shipping the drives to the Azure data center.
     *
     * @param recipientName the recipientName value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withRecipientName(String recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    /**
     * Get the first line of the street address to use when shipping the drives to the Azure data center.
     *
     * @return the streetAddress1 value
     */
    public String streetAddress1() {
        return this.streetAddress1;
    }

    /**
     * Set the first line of the street address to use when shipping the drives to the Azure data center.
     *
     * @param streetAddress1 the streetAddress1 value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
        return this;
    }

    /**
     * Get the second line of the street address to use when shipping the drives to the Azure data center.
     *
     * @return the streetAddress2 value
     */
    public String streetAddress2() {
        return this.streetAddress2;
    }

    /**
     * Set the second line of the street address to use when shipping the drives to the Azure data center.
     *
     * @param streetAddress2 the streetAddress2 value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
        return this;
    }

    /**
     * Get the city name to use when shipping the drives to the Azure data center.
     *
     * @return the city value
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city name to use when shipping the drives to the Azure data center.
     *
     * @param city the city value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the state or province to use when shipping the drives to the Azure data center.
     *
     * @return the stateOrProvince value
     */
    public String stateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * Set the state or province to use when shipping the drives to the Azure data center.
     *
     * @param stateOrProvince the stateOrProvince value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * Get the postal code to use when shipping the drives to the Azure data center.
     *
     * @return the postalCode value
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postal code to use when shipping the drives to the Azure data center.
     *
     * @param postalCode the postalCode value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the country or region to use when shipping the drives to the Azure data center.
     *
     * @return the countryOrRegion value
     */
    public String countryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Set the country or region to use when shipping the drives to the Azure data center.
     *
     * @param countryOrRegion the countryOrRegion value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withCountryOrRegion(String countryOrRegion) {
        this.countryOrRegion = countryOrRegion;
        return this;
    }

    /**
     * Get the phone number for the Azure data center.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone number for the Azure data center.
     *
     * @param phone the phone value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get a list of carriers that are supported at this location.
     *
     * @return the supportedCarriers value
     */
    public List<String> supportedCarriers() {
        return this.supportedCarriers;
    }

    /**
     * Set a list of carriers that are supported at this location.
     *
     * @param supportedCarriers the supportedCarriers value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withSupportedCarriers(List<String> supportedCarriers) {
        this.supportedCarriers = supportedCarriers;
        return this;
    }

    /**
     * Get a list of location IDs that should be used to ship shipping drives to for jobs created against the current location. If the current location is active, it will be part of the list. If it is temporarily closed due to maintenance, this list may contain other locations.
     *
     * @return the alternateLocations value
     */
    public List<String> alternateLocations() {
        return this.alternateLocations;
    }

    /**
     * Set a list of location IDs that should be used to ship shipping drives to for jobs created against the current location. If the current location is active, it will be part of the list. If it is temporarily closed due to maintenance, this list may contain other locations.
     *
     * @param alternateLocations the alternateLocations value to set
     * @return the LocationInner object itself.
     */
    public LocationInner withAlternateLocations(List<String> alternateLocations) {
        this.alternateLocations = alternateLocations;
        return this;
    }

}
