/*
 * This file is part of the Authlib Env Backport project, licensed under the
 * GNU Lesser General Public License v3.0
 *
 * Copyright (C) 2025  Fallen_Breath and contributors
 *
 * Authlib Env Backport is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Authlib Env Backport is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Authlib Env Backport.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.fallenbreath.authlibenvbackport;

public class AuthlibEnvBackportHelper
{
	public static String hack(String url, String replacing, String propertyKey)
	{
		String propertyValue = System.getProperty(propertyKey);
		if (propertyValue != null && url.startsWith(replacing))
		{
			url = propertyValue + url.substring(replacing.length());
		}
		return url;
	}

	public static String modifyAuthUrl(String url)
	{
		return hack(url, AuthlibConstants.AUTH_HOST, AuthlibConstants.AUTH_PROPERTY_KEY);
	}

	public static String modifyAccountUrl(String url)
	{
		return hack(url, AuthlibConstants.ACCOUNT_HOST, AuthlibConstants.ACCOUNT_PROPERTY_KEY);
	}

	public static String modifySessionUrl(String url)
	{
		return hack(url, AuthlibConstants.SESSION_HOST, AuthlibConstants.SESSION_PROPERTY_KEY);
	}

	public static String modifyServicesUrl(String url)
	{
		return hack(url, AuthlibConstants.SERVICES_HOST, AuthlibConstants.SERVICES_PROPERTY_KEY);
	}
}
