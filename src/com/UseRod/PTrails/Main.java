package com.UseRod.PTrails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class Main extends JavaPlugin implements Listener{
	public Inventory trailslist;
	private Map<Projectile, BukkitTask> tasks = new HashMap<>();
	public void onEnable() {
		String mark = (ChatColor.DARK_GREEN + "[PTrails] ");
		ConsoleCommandSender console = getServer().getConsoleSender();
		console.sendMessage(mark + ChatColor.DARK_AQUA + "Plugin Is Working!" + ChatColor.DARK_GRAY + " Version 1.0" + ChatColor.ITALIC + " (Made By: UseRod)");
		console.sendMessage(mark + ChatColor.BOLD + "" + ChatColor.RED + "BETA 1.0");
		Bukkit.getPluginManager().registerEvents(this, this);
		
	}
	public void onDisable() {
		String mark = (ChatColor.DARK_GREEN + "[PTrails] ");
		ConsoleCommandSender console = getServer().getConsoleSender();
		console.sendMessage(mark + ChatColor.DARK_AQUA + "Plugin Is Disabled!" + ChatColor.DARK_GRAY + " Version 1.0" + ChatColor.ITALIC + " (Made By: UseRod)");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
      if ((sender instanceof Player))
      {
        Player p = (Player)sender;
        Location loc = p.getLocation();
        if (cmd.getName().equalsIgnoreCase("ptrails") && p.hasPermission("PTrails.use"))
        {
// Here we create our named help "inventory"
        	  trailslist = Bukkit.getServer().createInventory(p, 54, ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Trails List");
          	  p.getWorld().playSound(loc, Sound.CHEST_OPEN, 1, 1);
   //Here you define our item
              ItemStack ref1 = new ItemStack(Material.JUKEBOX);
              ItemMeta metaref1 = ref1.getItemMeta();
              ArrayList<String> lore= new ArrayList<String>();

              
              metaref1.setLore(lore);
              metaref1.setDisplayName("§5NOTE");
              

              ref1.setItemMeta(metaref1);
              trailslist.setItem(10, ref1);
              
              
              ItemStack ref2 = new ItemStack(Material.APPLE);
              ItemMeta metaref2 = ref2.getItemMeta();
              ArrayList<String> lore1= new ArrayList<String>();

              
              metaref2.setLore(lore1);
              metaref2.setDisplayName("§cHEART");
              

              ref2.setItemMeta(metaref2);
              trailslist.setItem(12, ref2);
              
              ItemStack ref3 = new ItemStack(Material.ENCHANTMENT_TABLE);
              ItemMeta metaref3 = ref3.getItemMeta();
              ArrayList<String> lore2= new ArrayList<String>();

              
              metaref3.setLore(lore2);
              metaref3.setDisplayName("ENCHANTMENT PARTICLE");
              

              ref3.setItemMeta(metaref3);
              trailslist.setItem(14, ref3);
              
              ItemStack ref4 = new ItemStack(Material.MAGMA_CREAM);
              ItemMeta metaref4 = ref4.getItemMeta();
              ArrayList<String> lore3= new ArrayList<String>();

              
              metaref4.setLore(lore3);
              metaref4.setDisplayName("§6FLAME");
              

              ref4.setItemMeta(metaref4);
              trailslist.setItem(16, ref4);
              
              ItemStack ref0 = new ItemStack(Material.BARRIER);
              ItemMeta metaref0 = ref0.getItemMeta();
              ArrayList<String> lore0= new ArrayList<String>();

              
              metaref0.setLore(lore0);
              metaref0.setDisplayName("§4CLOSE");
              

              ref0.setItemMeta(metaref0);
              trailslist.setItem(53, ref0);
              
              ItemStack ref5 = new ItemStack(Material.REDSTONE_BLOCK);
              ItemMeta metaref5 = ref5.getItemMeta();
              ArrayList<String> lore4= new ArrayList<String>();

              
              metaref5.setLore(lore4);
              metaref5.setDisplayName("§c§lBLOOD");
              

              ref5.setItemMeta(metaref5);
              trailslist.setItem(28, ref5);
              
              
              ItemStack ref6 = new ItemStack(Material.PRISMARINE_SHARD);
              ItemMeta metaref6 = ref6.getItemMeta();
              ArrayList<String> lore5= new ArrayList<String>();

              
              metaref6.setLore(lore5);
              metaref6.setDisplayName("§lILLUMINATE");
              

              ref6.setItemMeta(metaref6);
              trailslist.setItem(30, ref6);
              
              ItemStack ref7 = new ItemStack(Material.POTION);
              ItemMeta metaref7 = ref6.getItemMeta();
              ArrayList<String> lore6= new ArrayList<String>();

              
              metaref7.setLore(lore6);
              metaref7.setDisplayName("§dMAGIC");
              

              ref7.setItemMeta(metaref7);
              trailslist.setItem(32, ref7);
              
              
              
              ItemStack ref8 = new ItemStack(Material.GREEN_RECORD);
              ItemMeta metaref8 = ref8.getItemMeta();
              ArrayList<String> lore7= new ArrayList<String>();

              
              metaref8.setLore(lore7);
              metaref8.setDisplayName("§2GREENSTAR");
              

              ref8.setItemMeta(metaref8);
              trailslist.setItem(34, ref8);
              

              ItemStack ref9 = new ItemStack(Material.SAND);
              ItemMeta metaref9 = ref9.getItemMeta();
              ArrayList<String> lore8= new ArrayList<String>();

              
              metaref9.setLore(lore8);
              metaref9.setDisplayName("Clear Trails");
              

              ref9.setItemMeta(metaref9);
              trailslist.setItem(49, ref9);
              
              ItemStack g1 = new ItemStack(Material.STAINED_GLASS_PANE);



              ItemMeta gl1 = g1.getItemMeta();
              ArrayList<String> l1= new ArrayList<String>();

              
              gl1.setLore(l1);
              gl1.setDisplayName("");
              g1.setItemMeta(gl1);
              trailslist.setItem(0, g1);
              trailslist.setItem(1, g1);
              trailslist.setItem(2, g1);
              trailslist.setItem(3, g1);
              trailslist.setItem(4, g1);
              trailslist.setItem(5, g1);
              trailslist.setItem(6, g1);
              trailslist.setItem(7, g1);
              trailslist.setItem(8, g1);
              trailslist.setItem(17, g1);
              trailslist.setItem(26, g1);
              trailslist.setItem(35, g1);
              trailslist.setItem(44, g1);
              trailslist.setItem(52, g1);
              trailslist.setItem(51, g1);
              trailslist.setItem(50, g1);
              trailslist.setItem(48, g1);
              trailslist.setItem(47, g1);
              trailslist.setItem(46, g1);
              trailslist.setItem(45, g1);
              trailslist.setItem(36, g1);
              trailslist.setItem(27, g1);
              trailslist.setItem(18, g1);
              trailslist.setItem(9, g1);
              
              ItemStack n = new ItemStack(Material.NETHER_STAR);



              ItemMeta nn = n.getItemMeta();
              ArrayList<String> n1= new ArrayList<String>();

              
              nn.setLore(n1);
              nn.setDisplayName("§3SPIRAL");
              trailslist.setItem(40, n);



              
          
          //Here opens the inventory
          p.openInventory(trailslist);
          
          
        } else {
        	p.sendMessage(ChatColor.DARK_RED + "You Don't Have Enough Permissions.");
        }
        
      }
      return false;
    }
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player player = (Player) e.getWhoClicked();
		Location loc = player.getLocation();
		loc.add(1, 5, 1);
        if(ChatColor.translateAlternateColorCodes('&', e.getClickedInventory().getTitle()).equals(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Trails List")) {
      	  if (e.getCurrentItem() != null) {
      		  e.setCancelled(true);
      		  switch (e.getCurrentItem().getType()) {
      		  case JUKEBOX:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " NOTE " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  player.getWorld().playEffect(player.getLocation(), Effect.NOTE, 1);
      			  break;
      		  case APPLE:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " HEART " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  player.getWorld().playEffect(player.getLocation(), Effect.HEART, 1);
      			  break;
      		  case ENCHANTMENT_TABLE:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " ENCHANTMENT " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  player.getWorld().playEffect(player.getLocation(), Effect.CRIT, 1);
      			  break;
      		  case MAGMA_CREAM:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " FLAME " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  player.getWorld().playEffect(player.getLocation(), Effect.FLAME, 0);
      			  break;
      		  case REDSTONE_BLOCK:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " BLOOD " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playEffect(player.getLocation(), Effect.TILE_BREAK, 152, 2);
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  break;
      		  case PRISMARINE_SHARD:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " ILLUMINATE " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playEffect(player.getLocation(), Effect.CRIT, 1);
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  break;
      		  case POTION:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " MAGIC " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playEffect(player.getLocation(), Effect.WITCH_MAGIC, 1);
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  break;
      		  case GREEN_RECORD:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " GREENSTAR " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playEffect(player.getLocation(), Effect.HAPPY_VILLAGER, 1);
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  break;
      		  case NETHER_STAR:
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " SPIRAL " + ChatColor.GREEN + "Trail!");
      			  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      	          Inventory spiral = Bukkit.getServer().createInventory(player, 54, ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Spiral Trails List");
                  ItemStack g1 = new ItemStack(Material.STAINED_GLASS_PANE);
                  spiral.setItem(0, g1);
                  spiral.setItem(1, g1);
                  spiral.setItem(2, g1);
                  spiral.setItem(3, g1);
                  spiral.setItem(4, g1);
                  spiral.setItem(5, g1);
                  spiral.setItem(6, g1);
                  spiral.setItem(7, g1);
                  spiral.setItem(8, g1);
                  spiral.setItem(17, g1);
                  spiral.setItem(26, g1);
                  spiral.setItem(35, g1);
                  spiral.setItem(44, g1);
                  spiral.setItem(52, g1);
                  spiral.setItem(51, g1);
                  spiral.setItem(50, g1);
                  spiral.setItem(48, g1);
                  spiral.setItem(47, g1);
                  spiral.setItem(46, g1);
                  spiral.setItem(45, g1);
                  spiral.setItem(36, g1);
                  spiral.setItem(27, g1);
                  spiral.setItem(18, g1);
                  spiral.setItem(9, g1);
                  spiral.setItem(53, g1);
                  
                  ItemStack ref8 = new ItemStack(Material.BEACON);
                  ItemMeta metaref8 = ref8.getItemMeta();
                  ArrayList<String> lore7= new ArrayList<String>();

                  
                  metaref8.setLore(lore7);
                  metaref8.setDisplayName("§1R§2a§3i§4n§5b§6o§7w");
                  

                  ref8.setItemMeta(metaref8);
                  spiral.setItem(19, ref8);
                  
                  ItemStack ref0 = new ItemStack(Material.WOOL);
                  ItemMeta metaref0 = ref0.getItemMeta();
                  ArrayList<String> lore0= new ArrayList<String>();

                  
                  metaref0.setLore(lore0);
                  metaref0.setDisplayName("CLOUD");
                  

                  ref0.setItemMeta(metaref0);
                  spiral.setItem(21, ref0);
                  
                  
                  ItemStack ref01 = new ItemStack(Material.FURNACE);
                  ItemMeta metaref01 = ref01.getItemMeta();
                  ArrayList<String> lore01= new ArrayList<String>();

                  
                  metaref01.setLore(lore01);
                  metaref01.setDisplayName("§8SMOKE");
                  

                  ref01.setItemMeta(metaref01);
                  spiral.setItem(23, ref01);
                  
                  
                  ItemStack ref011 = new ItemStack(Material.EMERALD);
                  ItemMeta metaref011 = ref011.getItemMeta();
                  ArrayList<String> lore011= new ArrayList<String>();

                  
                  metaref011.setLore(lore011);
                  metaref011.setDisplayName("§2GREENSTAR");
                  

                  ref011.setItemMeta(metaref011);
                  spiral.setItem(25, ref011);
                  
                  
                  ItemStack ref0111 = new ItemStack(Material.BARRIER);
                  ItemMeta metaref0111 = ref0111.getItemMeta();
                  ArrayList<String> lore0111= new ArrayList<String>();

                  
                  metaref0111.setLore(lore0111);
                  metaref0111.setDisplayName("§4CLOSE");
                  

                  ref0111.setItemMeta(metaref0111);
                  spiral.setItem(49, ref0111);
                  ItemStack head = new ItemStack(Material.SKULL_ITEM);
                  SkullMeta skull = (SkullMeta) head.getItemMeta();
                  skull.setOwner("a68f0b648d144000a95f4b9ba14f8df9");
                  head.setItemMeta(skull);
                  ItemStack ref01111 = new ItemStack(head);
                  ItemMeta metaref01111 = ref01111.getItemMeta();
                  ArrayList<String> lore01111= new ArrayList<String>();

                  
                  metaref01111.setLore(lore01111);
                  metaref01111.setDisplayName(ChatColor.GRAY + "<-" + ChatColor.DARK_GRAY + "Back");
                  

                  ref01111.setItemMeta(metaref01111);
                  spiral.setItem(45, ref01111);
                  
                  
                  
      	          player.openInventory(spiral);
      			  break;
      		  case BARRIER:
      			  player.sendMessage(ChatColor.DARK_RED + "Menu Closed.");
      			  player.getWorld().playEffect(player.getLocation(), Effect.CRIT, 1);
              	  player.getWorld().playSound(loc, Sound.CHEST_CLOSE, 1, 1);
      			  player.closeInventory();
      			  break;
      		  case SAND:
      			  player.sendMessage(ChatColor.RED + "Trails Cleared.");
      			  player.getWorld().playSound(loc, Sound.WOOD_CLICK, 1, 1);
      		      break;
      		  case STAINED_GLASS_PANE:
      			  player.getWorld().playSound(loc, Sound.NOTE_BASS, 1, 1);
      		  default:
      		  	return;
      		  }
      	  }
        }
        else if(ChatColor.translateAlternateColorCodes('&', e.getClickedInventory().getTitle()).equals(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Spiral Trails List")) {
      	  if (e.getCurrentItem() != null) {
        		  e.setCancelled(true);
        		  switch (e.getCurrentItem().getType()) {
        	    case EMERALD:
        	      player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " GREENSTAR " + ChatColor.GREEN + "Trail!");

        	    	break;
        	    case FURNACE:
          	      player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
      			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " SMOKE " + ChatColor.GREEN + "Trail!");

          	    	break;
        	    case WOOL:
            	      player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
          			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " CLOUD " + ChatColor.GREEN + "Trail!");

            	    	break;
        	    case BEACON:
            	      player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
          			  player.sendMessage(ChatColor.GREEN + "You Selected" + ChatColor.DARK_GREEN + " RAINBOW " + ChatColor.GREEN + "Trail!");

            	    	break;
        	    case SKULL_ITEM:
          	      	  player.getWorld().playSound(loc, Sound.CLICK, 1, 1);
          	      	  player.openInventory(trailslist);
        	    case BARRIER:
        	    	player.closeInventory();
        	    case STAINED_GLASS_PANE:
      			player.getWorld().playSound(loc, Sound.NOTE_BASS, 1, 1);
				default:
					break;
        			  
        		  }
            }
        }
	}
}
