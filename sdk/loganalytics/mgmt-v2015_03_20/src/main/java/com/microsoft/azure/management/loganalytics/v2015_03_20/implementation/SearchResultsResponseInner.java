/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import com.microsoft.azure.management.loganalytics.v2015_03_20.SearchMetadata;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2015_03_20.SearchError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The get search result operation response.
 */
public class SearchResultsResponseInner {
    /**
     * The id of the search, which includes the full url.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The metadata from search results.
     */
    @JsonProperty(value = "metaData")
    private SearchMetadata metadata;

    /**
     * The array of result values.
     */
    @JsonProperty(value = "value")
    private List<Object> value;

    /**
     * The error.
     */
    @JsonProperty(value = "error")
    private SearchError error;

    /**
     * Get the id of the search, which includes the full url.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the metadata from search results.
     *
     * @return the metadata value
     */
    public SearchMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata from search results.
     *
     * @param metadata the metadata value to set
     * @return the SearchResultsResponseInner object itself.
     */
    public SearchResultsResponseInner withMetadata(SearchMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the array of result values.
     *
     * @return the value value
     */
    public List<Object> value() {
        return this.value;
    }

    /**
     * Set the array of result values.
     *
     * @param value the value value to set
     * @return the SearchResultsResponseInner object itself.
     */
    public SearchResultsResponseInner withValue(List<Object> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the error.
     *
     * @return the error value
     */
    public SearchError error() {
        return this.error;
    }

    /**
     * Set the error.
     *
     * @param error the error value to set
     * @return the SearchResultsResponseInner object itself.
     */
    public SearchResultsResponseInner withError(SearchError error) {
        this.error = error;
        return this;
    }

}
