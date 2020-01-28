/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.responses;

import com.oracle.bmc.datacatalog.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ObjectStatsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Retrieves the next page of results. When this header appears in the response, additional pages of results remain. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * The returned String instance.
     */
    private String value;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ObjectStatsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            value(o.getValue());

            return this;
        }
    }
}
