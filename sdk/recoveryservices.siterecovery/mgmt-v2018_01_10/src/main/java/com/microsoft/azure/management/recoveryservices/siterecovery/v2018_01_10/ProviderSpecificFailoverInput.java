/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Provider specific failover input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ProviderSpecificFailoverInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AFailoverProviderInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzureFailback", value = HyperVReplicaAzureFailbackProviderInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureFailoverProviderInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2FailoverProviderInput.class),
    @JsonSubTypes.Type(name = "InMage", value = InMageFailoverProviderInput.class)
})
public class ProviderSpecificFailoverInput {
}
