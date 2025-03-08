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

public class AuthlibConstants
{
	public static final String AUTH_HOST = "https://authserver.mojang.com";
	public static final String ACCOUNT_HOST = "https://api.mojang.com";
	public static final String SESSION_HOST = "https://sessionserver.mojang.com";
	public static final String SERVICES_HOST = "https://api.minecraftservices.com";

	public static final String AUTH_PROPERTY_KEY = "minecraft.api.auth.host";
	public static final String ACCOUNT_PROPERTY_KEY = "minecraft.api.account.host";
	public static final String SESSION_PROPERTY_KEY = "minecraft.api.session.host";
	public static final String SERVICES_PROPERTY_KEY = "minecraft.api.services.host";
}
