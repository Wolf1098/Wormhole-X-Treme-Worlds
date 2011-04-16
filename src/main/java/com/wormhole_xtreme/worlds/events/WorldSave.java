/*
 * Wormhole X-Treme Worlds Plugin for Bukkit
 * Copyright (C) 2011 Dean Bailey
 * 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.wormhole_xtreme.worlds.events;

import java.util.logging.Level;

import org.bukkit.World;
import org.bukkit.event.world.WorldListener;
import org.bukkit.event.world.WorldSaveEvent;

import com.wormhole_xtreme.worlds.WormholeXTremeWorlds;

/**
 * The Class WorldSave.
 * 
 * @author alron
 */
public class WorldSave extends WorldListener {

    /** The Constant thisPlugin. */
    private static final WormholeXTremeWorlds thisPlugin = WormholeXTremeWorlds.getThisPlugin();

    /* (non-Javadoc)
     * @see org.bukkit.event.world.WorldListener#onWorldSave(org.bukkit.event.world.WorldSaveEvent)
     */
    @Override
    public void onWorldSave(final WorldSaveEvent event) {
        final World world = event.getWorld();
        if (world != null) {
            thisPlugin.prettyLog(Level.FINE, false, "Caught World Save: " + world.getName());
        }
    }

}
