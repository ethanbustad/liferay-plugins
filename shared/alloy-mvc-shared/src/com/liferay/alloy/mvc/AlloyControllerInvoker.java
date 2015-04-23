/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.alloy.mvc;

import com.liferay.portal.model.Portlet;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * @author Ethan Bustad
 */
public interface AlloyControllerInvoker {

	public String invokeAlloyController(String lifecycle, Object... parameters)
		throws Exception;

	public void setProperties(
		AlloyPortlet alloyPortlet, ThemeDisplay themeDisplay, Portlet portlet,
		Class<? extends AlloyController> controllerClass, String controller);

}