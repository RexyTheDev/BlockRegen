package nl.Aurorion.BlockRegen.System;

import nl.Aurorion.BlockRegen.Main;
import nl.Aurorion.BlockRegen.Utils;
import org.bukkit.ChatColor;

public class ConsoleOutput {

    private final Main plugin;

    private boolean debug;
    private String prefix;

    public ConsoleOutput(Main plugin) {
        this.plugin = plugin;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public boolean isDebug() {
        return debug;
    }

    public void debug(String msg) {
        if (debug)
            plugin.getServer().getLogger().info(prefix + ChatColor.YELLOW + "DEBUG: " + Utils.color(msg));
    }

    public void err(String msg) {
        plugin.getServer().getLogger().info(prefix + ChatColor.DARK_RED + Utils.color(msg));
    }

    public void info(String msg) {
        plugin.getServer().getLogger().info(prefix + ChatColor.GRAY + Utils.color(msg));
    }

    public void warn(String msg) {
        plugin.getServer().getLogger().info(prefix + ChatColor.RED + Utils.color(msg));
    }
}