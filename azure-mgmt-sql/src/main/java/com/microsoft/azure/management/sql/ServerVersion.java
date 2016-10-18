/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ServerVersion.
 */
public final class ServerVersion {
    /** Static value 2.0 for ServerVersion. */
    public static final ServerVersion TWO_FULL_STOP_ZERO = new ServerVersion("2.0");

    /** Static value 12.0 for ServerVersion. */
    public static final ServerVersion ONE_TWO_FULL_STOP_ZERO = new ServerVersion("12.0");

    private String value;

    /**
     * Creates a custom value for ServerVersion.
     * @param value the custom value
     */
    public ServerVersion(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ServerVersion)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ServerVersion rhs = (ServerVersion) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
