package org.unitedbaseplayers.legacy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Legacy extends JavaPlugin {
    @Override
    public void onEnable(){
        // TODO Insert logic to be performed when the plugin is enabled
      getLogger().info("onEnable has been invoked!");
    }
    
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
    	getLogger().info("onDisable has been invoked!");
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    	if (cmd.getName().equalsIgnoreCase("leap"))
    	{
    		if (!(sender instanceof Player)) 
    		{
    			sender.sendMessage("This command can only be run by a player.");
            	return false;
    		}
    		else 
    		{
    			sender.sendMessage("Leap now " + sender.getName() + "!");
            	return true;
    		}
    	}
    	else if (cmd.getName().equalsIgnoreCase("fart"))
    	{
    		if (!(sender instanceof Player)) 
    		{
    			sender.sendMessage("This command can only be run by a player.");
            	return false;
    		}
    		else 
    		{
    			sender.sendMessage("Excuse me!");
    			// playEffect()
            	return true;
    		}
    	}
		return false;
    } 
}
