package com.pistonproject.api.inventory.action;

import org.bukkit.entity.Player;

public interface RightAction {
    void action(Player player, int slot);
}