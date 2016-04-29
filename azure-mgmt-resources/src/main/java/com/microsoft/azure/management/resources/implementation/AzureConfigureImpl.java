package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.management.resources.fluentcore.arm.implementation.AzureConfigureBaseImpl;
import com.microsoft.rest.credentials.ServiceClientCredentials;

final class AzureConfigureImpl extends AzureConfigureBaseImpl<AzureResourceManager.Configure>
        implements AzureResourceManager.Configure {
    @Override
    public AzureResourceManager.Authenticated authenticate(ServiceClientCredentials credentials) {
        this.restClient = this.restClientBuilder.withCredentials(credentials).build();
        return new AzureAuthenticatedImpl(this.restClient);
    }
}
