/*
 *         Copyright (c) Cedar Software LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cedarsoftware.lang;

/**
 * Useful Utilities for working with the System.
 *
 * @author John DeRegnaucourt (jdereg@gmail.com)
 * @author Ken Partlow (kpartlow@gmail.com)
 *
 */
public final class SystemUtilities {

    private SystemUtilities() {
        super();
    }

    /**
     * Fetch value from environment variable and if not set, then fetch from
     * System properties.  If neither available, return null.
     *
     * @param
     *     var String key of variable to return
     *
     */
    public static String getExternalVariable(String var)
    {
        String variable = System.getenv(var);
        if (CharSequenceUtilities.isBlank(variable))
        {
            variable = System.getProperty(var);
        }
        if (CharSequenceUtilities.isBlank(variable))
        {
            variable = null;
        }
        return variable;
    }
}