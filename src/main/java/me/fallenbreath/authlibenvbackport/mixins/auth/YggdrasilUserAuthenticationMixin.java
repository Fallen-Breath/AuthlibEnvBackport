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

package me.fallenbreath.authlibenvbackport.mixins.auth;

import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import me.fallenbreath.authlibenvbackport.AuthlibEnvBackportHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(YggdrasilUserAuthentication.class)
public abstract class YggdrasilUserAuthenticationMixin
{
	@ModifyArg(
			method = "<clinit>",
			at = @At(
					value = "INVOKE",
					target = "Lcom/mojang/authlib/HttpAuthenticationService;constantURL(Ljava/lang/String;)Ljava/net/URL;",
					remap = false
			),
			remap = false
	)
	private static String modifyAuthUrl(String url)
	{
		return AuthlibEnvBackportHelper.modifyAuthUrl(url);
	}
}
