// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /enumeration.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Automatically generated enumeration class.
 */
public final class _ItemNamespaceEnum
    extends Enumeration
{
    /**
     * This map lets static methods in this class map strings to
     * the correct instance type at deserialization time.
     */
    private final static Map VALUES_TO_INSTANCES = new HashMap();
    public static final _ItemNamespaceEnum PathBased = new _ItemNamespaceEnum("PathBased");
    public static final _ItemNamespaceEnum GUIDBased = new _ItemNamespaceEnum("GUIDBased");

    private _ItemNamespaceEnum(final String name)
    {
        super(name, _ItemNamespaceEnum.VALUES_TO_INSTANCES);
    }

    /**
     * Gets the specific enumeration value in this class appropriate for the given
     * XML attribute value.  If no value is known, null is returned (_DEFAULT is not used; that
     * value is for when the attribute is not present).
     *
     * @param value
     *        the XML attribute value (not null)
     * @return the appropriate enumeration instance.
     */
    public static _ItemNamespaceEnum fromString(final String value)
        throws SOAPSerializationException
    {
        return (_ItemNamespaceEnum) Enumeration.fromString(
            value,
            _ItemNamespaceEnum.VALUES_TO_INSTANCES);
    }
}
