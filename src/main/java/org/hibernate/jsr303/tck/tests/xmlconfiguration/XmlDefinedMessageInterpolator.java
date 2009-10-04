// $Id$
/*
* JBoss, Home of Professional Open Source
* Copyright 2009, Red Hat, Inc. and/or its affiliates, and individual contributors
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.hibernate.jsr303.tck.tests.xmlconfiguration;

import java.util.Locale;
import javax.validation.MessageInterpolator;

/**
 * @author Hardy Ferentschik
 */
public class XmlDefinedMessageInterpolator implements MessageInterpolator {
	public static final String STATIC_INTERPOLATION_STRING = "Interpolator defined in xml was used.";

	public String interpolate(String messageTemplate, Context context) {
		return STATIC_INTERPOLATION_STRING;
	}

	public String interpolate(String messageTemplate, Context context, Locale locale) {
		return STATIC_INTERPOLATION_STRING;
	}

	public class NoDefaultConstructorInterpolator extends XmlDefinedMessageInterpolator {
		public NoDefaultConstructorInterpolator(String foo) {

		}
	}
}
