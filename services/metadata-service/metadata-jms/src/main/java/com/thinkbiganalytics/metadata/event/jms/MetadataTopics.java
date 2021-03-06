package com.thinkbiganalytics.metadata.event.jms;

/*-
 * #%L
 * thinkbig-metadata-jms
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

/**
 * JMS topics for communicating with NiFi.
 */
public interface MetadataTopics {
    
    /**
     * Indicates the cancelation of a high-water mark
     */
    String CANCEL_ACTIVE_WATER_MARK = "cancelActiveWaterMark";
    
    /**
     * Indicates changes to the initialization status of a feed
     */
    String FEED_INIT_STATUS_CHANGE = "feedInitStatusChange";

    /**
     * Indicates changes to a data source
     */
    String DATASOURCE_CHANGE = "datasourceChange";

    /**
     * Indicates changes to a savepoint
     */
    String SAVEPOINT_CHANGE = "savepointChange";

}
