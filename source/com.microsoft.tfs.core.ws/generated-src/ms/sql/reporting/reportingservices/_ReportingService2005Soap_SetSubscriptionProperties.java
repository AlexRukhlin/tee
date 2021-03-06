// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._ArrayOfChoice1;
import ms.sql.reporting.reportingservices._ExtensionSettings;
import ms.sql.reporting.reportingservices._ParameterFieldReference;
import ms.sql.reporting.reportingservices._ParameterValue;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_SetSubscriptionProperties;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ReportingService2005Soap_SetSubscriptionProperties
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String subscriptionID;
    protected _ExtensionSettings extensionSettings;
    protected String description;
    protected String eventType;
    protected String matchData;
    protected _ParameterValue[] parameters;

    public _ReportingService2005Soap_SetSubscriptionProperties()
    {
        super();
    }

    public _ReportingService2005Soap_SetSubscriptionProperties(
        final String subscriptionID,
        final _ExtensionSettings extensionSettings,
        final String description,
        final String eventType,
        final String matchData,
        final _ParameterValue[] parameters)
    {
        // TODO : Call super() instead of setting all fields directly?
        setSubscriptionID(subscriptionID);
        setExtensionSettings(extensionSettings);
        setDescription(description);
        setEventType(eventType);
        setMatchData(matchData);
        setParameters(parameters);
    }

    public String getSubscriptionID()
    {
        return this.subscriptionID;
    }

    public void setSubscriptionID(String value)
    {
        this.subscriptionID = value;
    }

    public _ExtensionSettings getExtensionSettings()
    {
        return this.extensionSettings;
    }

    public void setExtensionSettings(_ExtensionSettings value)
    {
        this.extensionSettings = value;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String value)
    {
        this.description = value;
    }

    public String getEventType()
    {
        return this.eventType;
    }

    public void setEventType(String value)
    {
        this.eventType = value;
    }

    public String getMatchData()
    {
        return this.matchData;
    }

    public void setMatchData(String value)
    {
        this.matchData = value;
    }

    public _ParameterValue[] getParameters()
    {
        return this.parameters;
    }

    public void setParameters(_ParameterValue[] value)
    {
        this.parameters = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "SubscriptionID",
            this.subscriptionID);

        if (this.extensionSettings != null)
        {
            this.extensionSettings.writeAsElement(
                writer,
                "ExtensionSettings");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "Description",
            this.description);
        XMLStreamWriterHelper.writeElement(
            writer,
            "EventType",
            this.eventType);
        XMLStreamWriterHelper.writeElement(
            writer,
            "MatchData",
            this.matchData);

        if (this.parameters != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Parameters");

            for (int iterator0 = 0; iterator0 < this.parameters.length; iterator0++)
            {
                this.parameters[iterator0].writeAsElement(
                    writer,
                    "ParameterValue");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
