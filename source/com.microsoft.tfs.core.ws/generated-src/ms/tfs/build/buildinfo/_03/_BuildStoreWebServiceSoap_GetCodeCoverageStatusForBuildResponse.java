// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_GetCodeCoverageStatusForBuildResponse;
import ms.tfs.build.buildinfo._03._CodeCoverageStatus;

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
public class _BuildStoreWebServiceSoap_GetCodeCoverageStatusForBuildResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _CodeCoverageStatus getCodeCoverageStatusForBuildResult;

    public _BuildStoreWebServiceSoap_GetCodeCoverageStatusForBuildResponse()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_GetCodeCoverageStatusForBuildResponse(
        final _CodeCoverageStatus getCodeCoverageStatusForBuildResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetCodeCoverageStatusForBuildResult(getCodeCoverageStatusForBuildResult);
    }

    public _CodeCoverageStatus getGetCodeCoverageStatusForBuildResult()
    {
        return this.getCodeCoverageStatusForBuildResult;
    }

    public void setGetCodeCoverageStatusForBuildResult(_CodeCoverageStatus value)
    {
        this.getCodeCoverageStatusForBuildResult = value;
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

                if (localName.equalsIgnoreCase("GetCodeCoverageStatusForBuildResult"))
                {
                    this.getCodeCoverageStatusForBuildResult = new _CodeCoverageStatus();
                    this.getCodeCoverageStatusForBuildResult.readFromElement(reader);
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
