package com.jdh.microcraft.item.custom;

import com.jdh.microcraft.item.Material;
import com.jdh.microcraft.item.armor.ItemArmor;
import com.jdh.microcraft.item.armor.ItemBoots;
import com.jdh.microcraft.item.armor.ItemChestplate;
import com.jdh.microcraft.item.armor.ItemHelmet;
import com.jdh.microcraft.item.armor.ItemLeggings;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.resource.ItemIngot;
import com.jdh.microcraft.item.resource.ItemIron;
import com.jdh.microcraft.item.resource.ItemOre;
import com.jdh.microcraft.item.tool.ItemAxe;
import com.jdh.microcraft.item.tool.ItemHoe;
import com.jdh.microcraft.item.tool.ItemPickaxe;
import com.jdh.microcraft.item.tool.ItemShovel;
import com.jdh.microcraft.item.tool.ItemSword;

public interface Iron_Item {

	ItemOre IRON_ORE = new ItemOre(6, ItemIron.IRON);
	ItemIngot IRON_INGOT = new ItemIngot(7, ItemIron.IRON);
	
	ItemSword IRON_SWORD = new ItemSword(18, Recipe.STATION_ANVIL, Material.IRON);
	ItemShovel IRON_SHOVEL = new ItemShovel(19, Recipe.STATION_ANVIL, Material.IRON);
	ItemPickaxe IRON_PICKAXE = new ItemPickaxe(20, Recipe.STATION_ANVIL, Material.IRON);
	ItemAxe IRON_AXE = new ItemAxe(21, Recipe.STATION_ANVIL, Material.IRON);
	ItemHoe IRON_HOE = new ItemHoe(22, Recipe.STATION_ANVIL, Material.IRON);
	
	ItemHelmet IRON_HELMET = new ItemHelmet(60, ItemArmor.TYPE_HELMET, Material.IRON);
	ItemChestplate IRON_CHESTPLATE = new ItemChestplate(61, ItemArmor.TYPE_CHESTPLATE, Material.IRON);
	ItemLeggings IRON_LEGGINGS = new ItemLeggings(62, ItemArmor.TYPE_LEGGINGS, Material.IRON);
	ItemBoots IRON_BOOTS = new ItemBoots(63, ItemArmor.TYPE_BOOTS, Material.IRON);

}