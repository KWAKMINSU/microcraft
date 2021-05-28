package com.jdh.microcraft.item.custom;

import com.jdh.microcraft.item.Material;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.resource.ItemGem;
import com.jdh.microcraft.item.tool.ItemAxe;
import com.jdh.microcraft.item.tool.ItemHoe;
import com.jdh.microcraft.item.tool.ItemPickaxe;
import com.jdh.microcraft.item.tool.ItemShovel;
import com.jdh.microcraft.item.tool.ItemSword;

public interface Gem_Item {

	ItemSword GEM_SWORD = new ItemSword(23, Recipe.STATION_ANVIL, Material.GEM);
	ItemShovel GEM_SHOVEL = new ItemShovel(24, Recipe.STATION_ANVIL, Material.GEM);
	ItemPickaxe GEM_PICKAXE = new ItemPickaxe(25, Recipe.STATION_ANVIL, Material.GEM);
	ItemAxe GEM_AXE = new ItemAxe(26, Recipe.STATION_ANVIL, Material.GEM);
	ItemHoe GEM_HOE = new ItemHoe(27, Recipe.STATION_ANVIL, Material.GEM);
	
	ItemGem GEM = new ItemGem(33);

}