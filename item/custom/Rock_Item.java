package com.jdh.microcraft.item.custom;

import com.jdh.microcraft.item.Material;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.resource.ItemRock;
import com.jdh.microcraft.item.tool.ItemAxe;
import com.jdh.microcraft.item.tool.ItemHoe;
import com.jdh.microcraft.item.tool.ItemPickaxe;
import com.jdh.microcraft.item.tool.ItemShovel;
import com.jdh.microcraft.item.tool.ItemSword;

public interface Rock_Item {

	ItemRock ROCK = new ItemRock(2);
	
	ItemSword ROCK_SWORD = new ItemSword(43, Recipe.STATION_BENCH, Material.ROCK);
	ItemShovel ROCK_SHOVEL = new ItemShovel(44, Recipe.STATION_BENCH, Material.ROCK);
	ItemPickaxe ROCK_PICKAXE = new ItemPickaxe(45, Recipe.STATION_BENCH, Material.ROCK);
	ItemAxe ROCK_AXE = new ItemAxe(46, Recipe.STATION_BENCH, Material.ROCK);
	ItemHoe ROCK_HOE = new ItemHoe(47, Recipe.STATION_BENCH, Material.ROCK);

}