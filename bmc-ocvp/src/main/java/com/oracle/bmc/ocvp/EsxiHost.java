/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Use this API to manage the Oracle Cloud VMware Solution.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public interface EsxiHost extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Adds another ESXi host to an existing SDDC. The attributes of the specified
     * `Sddc` determine the VMware software and other configuration settings used
     * by the ESXi host.
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * creation of the ESXi host.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateEsxiHostResponse createEsxiHost(CreateEsxiHostRequest request);

    /**
     * Deletes the specified ESXi host. Before deleting the host, back up or
     * migrate any VMware workloads running on it.
     * <p>
     * When you delete an ESXi host, Oracle does not remove the node
     * configuration within the VMware environment itself. That is
     * your responsibility.
     * <p>
     **Note:** If you delete EXSi hosts from the SDDC to total less than 3,
     * you are still billed for the 3 minimum recommended EXSi hosts. Also,
     * you cannot add more VMware workloads to the SDDC until it again has at
     * least 3 ESXi hosts.
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * deletion of the ESXi host.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteEsxiHostResponse deleteEsxiHost(DeleteEsxiHostRequest request);

    /**
     * Gets the specified ESXi host's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetEsxiHostResponse getEsxiHost(GetEsxiHostRequest request);

    /**
     * Lists the ESXi hosts in the specified SDDC. The list can be filtered
     * by Compute instance OCID or ESXi display name.
     * <p>
     * Remember that in terms of implementation, an ESXi host is a Compute instance that
     * is configured with the chosen bundle of VMware software. Each `EsxiHost`
     * object has its own OCID (`id`), and a separate attribute for the OCID of
     * the Compute instance (`computeInstanceId`). When filtering the list of
     * ESXi hosts, you can specify the OCID of the Compute instance, not the
     * ESXi host OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEsxiHostsResponse listEsxiHosts(ListEsxiHostsRequest request);

    /**
     * Updates the specified ESXi host.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateEsxiHostResponse updateEsxiHost(UpdateEsxiHostRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    EsxiHostWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    EsxiHostPaginators getPaginators();
}
