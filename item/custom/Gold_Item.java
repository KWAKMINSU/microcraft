package com.jdh.microcraft.item.custom;

import com.jdh.microcraft.item.Material;
import com.jdh.microcraft.item.armor.ItemArmor;
import com.jdh.microcraft.item.armor.ItemBoots;
import com.jdh.microcraft.item.armor.ItemChestplate;
import com.jdh.microcraft.item.armor.ItemHelmet;
import com.jdh.microcraft.item.armor.ItemLeggings;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.resource.ItemGold;
import com.jdh.microcraft.item.resource.ItemIngot;
import com.jdh.microcraft.item.resource.ItemOre;
import com.jdh.microcraft.item.tool.ItemAxe;
import com.jdh.microcraft.item.tool.ItemHoe;
import com.jdh.microcraft.item.tool.ItemPickaxe;
import com.jdh.microcraft.item.tool.ItemShovel;
import com.jdh.microcraft.item.tool.ItemSword;

public interface Gold_Item {

	ItemOre GOLD_ORE = new ItemOre(4, ItemGold.GOLD);
	ItemIngot GOLD_INGOT = new ItemIngot(5, ItemGold.GOLD);
	
	ItemSword GOLD_SWORD = new ItemSword(13, Recipe.STATION_ANVIL, Material.GOLD);
	ItemShovel GOLD_SHOVEL = new ItemShovel(14, Recipe.STATION_ANVIL, Material.GOLD);
	ItemPickaxe GOLD_PICKAXE = new ItemPickaxe(15, Recipe.STATION_ANVIL, Material.GOLD);
	ItemAxe GOLD_AXE = new ItemAxe(16, Recipe.STATION_ANVIL, Material.GOLD);
	ItemHoe GOLD_HOE = new ItemHoe(17, Recipe.STATION_ANVIL, Material.GOLD);
	
	ItemHelmet GOLD_HELMET = new ItemHelmet(64, ItemArmor.TYPE_HELMET, Material.GOLD);
	ItemChestplate GOLD_CHESTPLATE = new ItemChestplate(65, ItemArmor.TYPE_CHESTPLATE, Material.GOLD);
	ItemLeggings GOLD_LEGGINGS = new ItemLeggings(66, ItemArmor.TYPE_LEGGINGS, Material.GOLD);
	ItemBoots GOLD_BOOTS = new ItemBoots(67, ItemArmor.TYPE_BOOTS, Material.GOLD);

}