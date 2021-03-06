/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for evaluating a policy set.
 */
public class EvaluatePoliciesRequest {
    /**
     * Policies to evaluate.
     */
    @JsonProperty(value = "policies")
    private List<EvaluatePoliciesProperties> policies;

    /**
     * Get policies to evaluate.
     *
     * @return the policies value
     */
    public List<EvaluatePoliciesProperties> policies() {
        return this.policies;
    }

    /**
     * Set policies to evaluate.
     *
     * @param policies the policies value to set
     * @return the EvaluatePoliciesRequest object itself.
     */
    public EvaluatePoliciesRequest withPolicies(List<EvaluatePoliciesProperties> policies) {
        this.policies = policies;
        return this;
    }

}
