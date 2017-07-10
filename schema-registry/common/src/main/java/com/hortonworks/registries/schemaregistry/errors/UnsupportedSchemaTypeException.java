/**
 * Copyright 2016 Hortonworks.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package com.hortonworks.registries.schemaregistry.errors;

/**
 * Indicates that schema type is invalid.
 */
public class UnsupportedSchemaTypeException extends RuntimeException {

    private static final long serialVersionUID = -1642354679626087357L;

    public UnsupportedSchemaTypeException() {
        super();
    }

    public UnsupportedSchemaTypeException(String message) {
        super(message);
    }

    public UnsupportedSchemaTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedSchemaTypeException(Throwable cause) {
        super(cause);
    }

    protected UnsupportedSchemaTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
