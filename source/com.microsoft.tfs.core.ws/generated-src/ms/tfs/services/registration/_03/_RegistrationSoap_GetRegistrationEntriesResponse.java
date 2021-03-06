// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.services.registration._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.services.registration._03._FrameworkRegistrationEntry;
import ms.tfs.services.registration._03._OutboundLinkType;
import ms.tfs.services.registration._03._RegistrationArtifactType;
import ms.tfs.services.registration._03._RegistrationDatabase;
import ms.tfs.services.registration._03._RegistrationEventType;
import ms.tfs.services.registration._03._RegistrationExtendedAttribute2;
import ms.tfs.services.registration._03._RegistrationServiceInterface;
import ms.tfs.services.registration._03._RegistrationSoap_GetRegistrationEntriesResponse;

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
public class _RegistrationSoap_GetRegistrationEntriesResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _FrameworkRegistrationEntry[] getRegistrationEntriesResult;

    public _RegistrationSoap_GetRegistrationEntriesResponse()
    {
        super();
    }

    public _RegistrationSoap_GetRegistrationEntriesResponse(
        final _FrameworkRegistrationEntry[] getRegistrationEntriesResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetRegistrationEntriesResult(getRegistrationEntriesResult);
    }

    public _FrameworkRegistrationEntry[] getGetRegistrationEntriesResult()
    {
        return this.getRegistrationEntriesResult;
    }

    public void setGetRegistrationEntriesResult(_FrameworkRegistrationEntry[] value)
    {
        this.getRegistrationEntriesResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("GetRegistrationEntriesResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _FrameworkRegistrationEntry complexObject0 = new _FrameworkRegistrationEntry();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getRegistrationEntriesResult = (_FrameworkRegistrationEntry[]) list0.toArray(
                                new _FrameworkRegistrationEntry[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
