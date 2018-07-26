/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The DescribeImageInStreamOptionalParameter model.
 */
public class DescribeImageInStreamOptionalParameter {
    /**
     * Maximum number of candidate descriptions to be returned.  The default is
     * 1.
     */
    private String maxCandidates;

    /**
     * The desired language for output generation. If this parameter is not
     * specified, the default value is &amp;quot;en&amp;quot;.Supported
     * languages:en - English, Default. es - Spanish, ja - Japanese, pt -
     * Portuguese, zh - Simplified Chinese. Possible values include: 'en',
     * 'es', 'ja', 'pt', 'zh'.
     */
    private String language;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the maxCandidates value.
     *
     * @return the maxCandidates value
     */
    public String maxCandidates() {
        return this.maxCandidates;
    }

    /**
     * Set the maxCandidates value.
     *
     * @param maxCandidates the maxCandidates value to set
     * @return the DescribeImageInStreamOptionalParameter object itself.
     */
    public DescribeImageInStreamOptionalParameter withMaxCandidates(String maxCandidates) {
        this.maxCandidates = maxCandidates;
        return this;
    }

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the DescribeImageInStreamOptionalParameter object itself.
     */
    public DescribeImageInStreamOptionalParameter withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the DescribeImageInStreamOptionalParameter object itself.
     */
    public DescribeImageInStreamOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
