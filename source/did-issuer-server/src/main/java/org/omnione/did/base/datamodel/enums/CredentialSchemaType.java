/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.base.datamodel.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Enum class for the credential_schema_type table.
 */
@Getter
public enum CredentialSchemaType {
    OSD_SCHEMA_CREDENTIAL("OsdSchemaCredential");

    private final String value;

    CredentialSchemaType(String value) {
        this.value = value;
    }
    @JsonCreator
    public static CredentialSchemaType fromValue(String value) {
        for (CredentialSchemaType type : CredentialSchemaType.values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown enum value: " + value);
    }

    @JsonValue
    public String toValue() {
        return value;
    }
}
