// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceImplementation.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.httpclient.HttpClient;
import com.microsoft.tfs.core.ws.runtime.client.*;
import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.build.buildservice._04._AgentStatus;
import ms.tfs.build.buildservice._04._BuildAgent;
import ms.tfs.build.buildservice._04._BuildController;
import ms.tfs.build.buildservice._04._BuildControllerSpec;
import ms.tfs.build.buildservice._04._BuildDefinition;
import ms.tfs.build.buildservice._04._BuildDefinitionSourceProvider;
import ms.tfs.build.buildservice._04._BuildDefinitionSpec;
import ms.tfs.build.buildservice._04._BuildDetail;
import ms.tfs.build.buildservice._04._BuildInformationNode;
import ms.tfs.build.buildservice._04._BuildPhaseStatus;
import ms.tfs.build.buildservice._04._BuildQueueQueryResult;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_CancelBuilds;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_CancelBuildsResponse;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueryBuilds;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueryBuildsById;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueryBuildsByIdResponse;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueryBuildsResponse;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueueBuilds;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_QueueBuildsResponse;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_StartBuildsNow;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_StartBuildsNowResponse;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_UpdateBuilds;
import ms.tfs.build.buildservice._04._BuildQueueServiceSoap_UpdateBuildsResponse;
import ms.tfs.build.buildservice._04._BuildQueueSpec;
import ms.tfs.build.buildservice._04._BuildReason;
import ms.tfs.build.buildservice._04._BuildRequest;
import ms.tfs.build.buildservice._04._BuildServiceHost;
import ms.tfs.build.buildservice._04._BuildStatus;
import ms.tfs.build.buildservice._04._ControllerStatus;
import ms.tfs.build.buildservice._04._DefinitionQueueStatus;
import ms.tfs.build.buildservice._04._DefinitionTriggerType;
import ms.tfs.build.buildservice._04._DeleteOptions;
import ms.tfs.build.buildservice._04._GetOption;
import ms.tfs.build.buildservice._04._InformationField;
import ms.tfs.build.buildservice._04._NameValueField;
import ms.tfs.build.buildservice._04._ProcessTemplate;
import ms.tfs.build.buildservice._04._ProcessTemplateType;
import ms.tfs.build.buildservice._04._PropertyValue;
import ms.tfs.build.buildservice._04._QueryOptions;
import ms.tfs.build.buildservice._04._QueueOptions;
import ms.tfs.build.buildservice._04._QueuePriority;
import ms.tfs.build.buildservice._04._QueueStatus;
import ms.tfs.build.buildservice._04._QueuedBuild;
import ms.tfs.build.buildservice._04._QueuedBuildRetryOption;
import ms.tfs.build.buildservice._04._QueuedBuildUpdate;
import ms.tfs.build.buildservice._04._QueuedBuildUpdateOptions;
import ms.tfs.build.buildservice._04._RetentionPolicy;
import ms.tfs.build.buildservice._04._Schedule;
import ms.tfs.build.buildservice._04._ScheduleDays;
import ms.tfs.build.buildservice._04._ServiceHostStatus;
import ms.tfs.build.buildservice._04._WorkspaceMapping;
import ms.tfs.build.buildservice._04._WorkspaceMappingType;
import ms.tfs.build.buildservice._04._WorkspaceTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.lang.Object;
import java.lang.String;

import java.net.URI;

import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2010/Build}BuildQueueServiceSoap12Service
 */
public class _BuildQueueServiceSoap12Service
    extends SOAP12Service
    implements _BuildQueueServiceSoap
{
    private static final QName PORT_QNAME = new QName("http://schemas.microsoft.com/TeamFoundation/2010/Build",
            "BuildQueueServiceSoap12Service");
    private static final String ENDPOINT_PATH = "/tfs/DefaultCollection/Build/v4.0/BuildQueueService.asmx";

    public _BuildQueueServiceSoap12Service(
        final URI endpoint,
        final QName port)
    {
        super(endpoint, port);
    }

    public _BuildQueueServiceSoap12Service(
        final HttpClient client,
        URI endpoint,
        QName port)
    {
        super(client, endpoint, port);
    }

    /**
     * @return the qualified name of the WSDL port this service implementation can be used with
     */
    public static QName getPortQName()
    {
        return _BuildQueueServiceSoap12Service.PORT_QNAME;
    }

    /**
     * @return the path part to use when constructing a URI to contact a host that provides this service
     */
    public static String getEndpointPath()
    {
        return _BuildQueueServiceSoap12Service.ENDPOINT_PATH;
    }

    public void cancelBuilds(final int[] queueIds)
        throws TransportException, SOAPFault
    {
        final _BuildQueueServiceSoap_CancelBuilds requestData = new _BuildQueueServiceSoap_CancelBuilds(queueIds);

        final SOAPRequest request = createSOAPRequest(
                "CancelBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "CancelBuilds");
                    }
                });

        final _BuildQueueServiceSoap_CancelBuildsResponse responseData = new _BuildQueueServiceSoap_CancelBuildsResponse();

        executeSOAPRequest(
            request,
            "CancelBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });
    }

    public _BuildQueueQueryResult[] queryBuilds(final _BuildQueueSpec[] specs)
        throws TransportException, SOAPFault
    {
        final _BuildQueueServiceSoap_QueryBuilds requestData = new _BuildQueueServiceSoap_QueryBuilds(specs);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuilds");
                    }
                });

        final _BuildQueueServiceSoap_QueryBuildsResponse responseData = new _BuildQueueServiceSoap_QueryBuildsResponse();

        executeSOAPRequest(
            request,
            "QueryBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueryBuildsResult();
    }

    public _BuildQueueQueryResult queryBuildsById(
        final int[] ids,
        final String[] informationTypes,
        final _QueryOptions options)
        throws TransportException, SOAPFault
    {
        final _BuildQueueServiceSoap_QueryBuildsById requestData = new _BuildQueueServiceSoap_QueryBuildsById(ids,
                informationTypes, options);

        final SOAPRequest request = createSOAPRequest(
                "QueryBuildsById",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueryBuildsById");
                    }
                });

        final _BuildQueueServiceSoap_QueryBuildsByIdResponse responseData = new _BuildQueueServiceSoap_QueryBuildsByIdResponse();

        executeSOAPRequest(
            request,
            "QueryBuildsByIdResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueryBuildsByIdResult();
    }

    public _BuildQueueQueryResult queueBuilds(
        final _BuildRequest[] requests,
        final _QueueOptions options)
        throws TransportException, SOAPFault
    {
        final _BuildQueueServiceSoap_QueueBuilds requestData = new _BuildQueueServiceSoap_QueueBuilds(requests, options);

        final SOAPRequest request = createSOAPRequest(
                "QueueBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "QueueBuilds");
                    }
                });

        final _BuildQueueServiceSoap_QueueBuildsResponse responseData = new _BuildQueueServiceSoap_QueueBuildsResponse();

        executeSOAPRequest(
            request,
            "QueueBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getQueueBuildsResult();
    }

    public _BuildQueueQueryResult startBuildsNow(final int[] queueIds)
        throws TransportException, SOAPFault
    {
        final _BuildQueueServiceSoap_StartBuildsNow requestData = new _BuildQueueServiceSoap_StartBuildsNow(queueIds);

        final SOAPRequest request = createSOAPRequest(
                "StartBuildsNow",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "StartBuildsNow");
                    }
                });

        final _BuildQueueServiceSoap_StartBuildsNowResponse responseData = new _BuildQueueServiceSoap_StartBuildsNowResponse();

        executeSOAPRequest(
            request,
            "StartBuildsNowResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getStartBuildsNowResult();
    }

    public _BuildQueueQueryResult updateBuilds(final _QueuedBuildUpdateOptions[] updates)
        throws TransportException, SOAPFault
    {
        final _BuildQueueServiceSoap_UpdateBuilds requestData = new _BuildQueueServiceSoap_UpdateBuilds(updates);

        final SOAPRequest request = createSOAPRequest(
                "UpdateBuilds",
                new SOAPMethodRequestWriter()
                {
                    public void writeSOAPRequest(
                        final XMLStreamWriter writer,
                        final OutputStream out)
                        throws XMLStreamException, IOException
                    {
                        requestData.writeAsElement(
                            writer,
                            "UpdateBuilds");
                    }
                });

        final _BuildQueueServiceSoap_UpdateBuildsResponse responseData = new _BuildQueueServiceSoap_UpdateBuildsResponse();

        executeSOAPRequest(
            request,
            "UpdateBuildsResponse",
            new SOAPMethodResponseReader()
            {
                public void readSOAPResponse(
                    final XMLStreamReader reader,
                    final InputStream in)
                    throws XMLStreamException, IOException
                {
                    responseData.readFromElement(reader);
                }
            });

        return responseData.getUpdateBuildsResult();
    }
}
