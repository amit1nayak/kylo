/**
 *
 */
package com.thinkbiganalytics.nifi.v2.metadata;

/*-
 * #%L
 * thinkbig-nifi-core-processors
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.processor.util.StandardValidators;

/**
 * @author Sean Felten
 */
public interface DirectoryProperties {

    String DIRECTORY_PATH_PROP = "directory.path";

    PropertyDescriptor DIRECTORY_PATH = new PropertyDescriptor.Builder()
        .name(DIRECTORY_PATH_PROP)
        .displayName("Directory path")
        .description("The path for the directory dataset")
        .required(true)
        .addValidator(StandardValidators.createDirectoryExistsValidator(false, true))
        .build();

}
