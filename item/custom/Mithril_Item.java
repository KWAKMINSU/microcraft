package com.jdh.microcraft.item.custom;

import com.jdh.microcraft.item.Material;
import com.jdh.microcraft.item.armor.ItemArmor;
import com.jdh.microcraft.item.armor.ItemBoots;
import com.jdh.microcraft.item.armor.ItemChestplate;
import com.jdh.microcraft.item.armor.ItemHelmet;
import com.jdh.microcraft.item.armor.ItemLeggings;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.resource.ItemIngot;
import com.jdh.microcraft.item.resource.ItemMithril;
import com.jdh.microcraft.item.resource.ItemOre;
import com.jdh.microcraft.item.tool.ItemAxe;
import com.jdh.microcraft.item.tool.ItemHoe;
import com.jdh.microcraft.item.tool.ItemPickaxe;
import com.jdh.microcraft.item.tool.ItemShovel;
import com.jdh.microcraft.item.tool.ItemSword;

public interface Mithril_Item {

	ItemOre MITHRIL_ORE = new ItemOre(51, ItemMithril.MITHRIL);
	ItemIngot MITHRIL_INGOT = new ItemIngot(52, ItemMithril.MITHRIL);
	
	ItemSword MITHRIL_SWORD = new ItemSword(53, Recipe.STATION_ANVIL, Material.MITHRIL);
	ItemShovel MITHRIL_SHOVEL = new ItemShovel(54, Recipe.STATION_ANVIL, Material.MITHRIL);
	ItemPickaxe MITHRIL_PICKAXE = new ItemPickaxe(55, Recipe.STATION_ANVIL, Material.MITHRIL);
	ItemAxe MITHRIL_AXE = new ItemAxe(56, Recipe.STATION_ANVIL, Material.MITHRIL);
	ItemHoe MITHRIL_HOE = new ItemHoe(57, Recipe.STATION_ANVIL, Material.MITHRIL);
	
	ItemHelmet MITHRIL_HELMET = new ItemHelmet(68, ItemArmor.TYPE_HELMET, Material.MITHRIL);
	ItemChestplate MITHRIL_CHESTPLATE = new ItemChestplate(69, ItemArmor.TYPE_CHESTPLATE, Material.MITHRIL);
	ItemLeggings MITHRIL_LEGGINGS = new ItemLeggings(70, ItemArmor.TYPE_LEGGINGS, Material.MITHRIL);
	ItemBoots MITHRIL_BOOTS = new ItemBoots(71, ItemArmor.TYPE_BOOTS, Material.MITHRIL);

}