/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.importexport;

import com.amazonaws.services.importexport.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonImportExport}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonImportExport implements AmazonImportExport {

    protected AbstractAmazonImportExport() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelJobResult cancelJob(CancelJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateJobResult createJob(CreateJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetShippingLabelResult getShippingLabel(GetShippingLabelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStatusResult getStatus(GetStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs(ListJobsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListJobsResult listJobs() {
        return listJobs(new ListJobsRequest());
    }

    @Override
    public UpdateJobResult updateJob(UpdateJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
