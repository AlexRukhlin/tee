// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldDefinition;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_CreateTeamProjectFolder;
import ms.tfs.versioncontrol.clientservices._03._TeamProjectFolderOptions;
import ms.tfs.versioncontrol.clientservices._03._TeamProjectFolderPermission;

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
public class _RepositorySoap_CreateTeamProjectFolder
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _TeamProjectFolderOptions teamProjectOptions;

    public _RepositorySoap_CreateTeamProjectFolder()
    {
        super();
    }

    public _RepositorySoap_CreateTeamProjectFolder(final _TeamProjectFolderOptions teamProjectOptions)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTeamProjectOptions(teamProjectOptions);
    }

    public _TeamProjectFolderOptions getTeamProjectOptions()
    {
        return this.teamProjectOptions;
    }

    public void setTeamProjectOptions(_TeamProjectFolderOptions value)
    {
        this.teamProjectOptions = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.teamProjectOptions != null)
        {
            this.teamProjectOptions.writeAsElement(
                writer,
                "teamProjectOptions");
        }

        writer.writeEndElement();
    }
}
