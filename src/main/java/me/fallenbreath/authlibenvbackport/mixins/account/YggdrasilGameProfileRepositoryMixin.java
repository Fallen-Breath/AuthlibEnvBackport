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

package me.fallenbreath.authlibenvbackport.mixins.account;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.yggdrasil.YggdrasilGameProfileRepository;
import me.fallenbreath.authlibenvbackport.AuthlibEnvBackportHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(YggdrasilGameProfileRepository.class)
public abstract class YggdrasilGameProfileRepositoryMixin
{
	@ModifyExpressionValue(
			method = "findProfilesByNames",
			at = @At(
					value = "CONSTANT",
					args = "stringValue=https://api.mojang.com/profiles/",
					remap = false
			),
			remap = false
	)
	private String modifyAccountUrl(String url)
	{
		return AuthlibEnvBackportHelper.modifyAccountUrl(url);
	}
}
