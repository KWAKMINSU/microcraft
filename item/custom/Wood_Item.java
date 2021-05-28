package com.jdh.microcraft.item.custom;

import com.jdh.microcraft.item.Material;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.resource.ItemWood;
import com.jdh.microcraft.item.tool.ItemAxe;
import com.jdh.microcraft.item.tool.ItemHoe;
import com.jdh.microcraft.item.tool.ItemPickaxe;
import com.jdh.microcraft.item.tool.ItemShovel;
import com.jdh.microcraft.item.tool.ItemSword;

public interface Wood_Item {

	ItemWood WOOD = new ItemWood(3);
	
	ItemSword WOOD_SWORD = new ItemSword(8, Recipe.STATION_BENCH, Material.WOOD);
	ItemShovel WOOD_SHOVEL = new ItemShovel(9, Recipe.STATION_BENCH, Material.WOOD);
	ItemPickaxe WOOD_PICKAXE = new ItemPickaxe(10, Recipe.STATION_BENCH, Material.WOOD);
	ItemAxe WOOD_AXE = new ItemAxe(11, Recipe.STATION_BENCH, Material.WOOD);
	ItemHoe WOOD_HOE = new ItemHoe(12, Recipe.STATION_BENCH, Material.WOOD);

}