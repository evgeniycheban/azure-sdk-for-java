/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.GalleryImagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GalleryImages.
 */
public interface GalleryImages extends HasInner<GalleryImagesInner> {
    /**
     * List gallery images in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GalleryImage> listAsync(final String resourceGroupName, final String labName);

}
