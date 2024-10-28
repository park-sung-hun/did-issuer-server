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

package org.omnione.did.issuer.v1.service;

import org.omnione.did.issuer.v1.dto.EnrollEntityResDto;

/**
 * Service interface for handling entity enrollment.
 */
public interface EnrollEntityService {
    /**
     * Enrolls an entity and returns the response as an EnrollEntityResDto object.
     *
     * @return The response to enrolling an entity.
     */
    EnrollEntityResDto enrollEntity();
}