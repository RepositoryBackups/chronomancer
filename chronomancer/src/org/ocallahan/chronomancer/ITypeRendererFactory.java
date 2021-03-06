/* ***** BEGIN LICENSE BLOCK *****
The contents of this file are subject to the Mozilla Public License
Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at
http://www.mozilla.org/MPL/

Software distributed under the License is distributed on an "AS IS"
basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations
under the License.

The Original Code is mozilla.org Chronicle code.

The Initial Developer of the Original Code is Mozilla Foundation.
Portions created by Mozilla Foundation are Copyright (C) 2007
Mozilla Foundation. All Rights Reserved.

Contributor(s): robert@ocallahan.org
*/

package org.ocallahan.chronomancer;

import org.ocallahan.chronicle.Type;

/**
 * Factory for rendering types. It can create one ITypeRenderer for a type.
 * It may not be applicable to a particular type in which case getRendererFor
 * will return null. This interface can be implemented by plugins.
 * 
 * @author roc
 */
public interface ITypeRendererFactory {
    public ITypeRenderer getRendererFor(Type t, DataContext context);
    public void captureRendererPreferences(Type t, DataContext context,
    		ITypeRenderer renderer, TypeRendererCollection collection);

    public static abstract class Stub implements ITypeRendererFactory {
    	public void captureRendererPreferences(Type t, DataContext context,
    			ITypeRenderer renderer, TypeRendererCollection collection) {}
    }
}
