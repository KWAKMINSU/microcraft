package com.jdh.microcraft.item;

import com.jdh.microcraft.gfx.Color;
import com.jdh.microcraft.item.custom.Gold_Item;
import com.jdh.microcraft.item.resource.ItemGem;
import com.jdh.microcraft.item.resource.ItemGold;
import com.jdh.microcraft.item.resource.ItemIron;
import com.jdh.microcraft.item.resource.ItemMithril;
import com.jdh.microcraft.item.resource.ItemWood;
import com.jdh.microcraft.level.tile.TileRock;

public class Material {
    public static final Material BASE =
        new Material("BASE", 0, 0.5, 0, 0);
    public static final Material WOOD =
        new Material("WOOD", 3 /* WOOD */, 0.8,
            Color.get(110, 220, ItemWood.BASE_COLOR, Color.add(ItemWood.BASE_COLOR, 111)),
            0);
    public static final Material ROCK =
        new Material("ROCK", 2 /* ROCK */, 1.2,
            Color.get(110, 220, TileRock.BASE_COLOR, Color.add(TileRock.BASE_COLOR, 111)),
            0);
    public static final Material IRON =
        new Material("IRON", 7 /* IRON_INGOT */, 2.0,
            Color.get(110, 330, ItemIron.IRON.baseColor, Color.add(ItemIron.IRON.baseColor, 111)),
            ItemIron.IRON.color);
    public static final Material GOLD =
        new Material("GOLD", 5 /* GOLD_INGOT */, 3.0,
            Color.get(110, 330, ItemGold.GOLD.baseColor, Color.add(ItemGold.GOLD.baseColor, 111)),
            ItemGold.GOLD.color);
    public static final Material GEM =
        new Material("GEM", 33 /* GEM */, 5.0,
            Color.get(110, 330, ItemGem.BASE_COLOR, Color.add(ItemGem.BASE_COLOR, 111)),
            0);
    public static final Material MITHRIL =
        new Material("MITH", 52 /* MITHRIL_INGOT */, 10.0,
            Color.get(110, 330, ItemMithril.MITHRIL.baseColor, Color.add(ItemMithril.MITHRIL.baseColor, 111)),
            ItemMithril.MITHRIL.color);

    public final String name;
    public final int baseId;
    public final double efficiency;
    public final int toolColor, armorColor;

    public Material(String name, int baseId, double efficiency, int toolColor, int armorColor) {
        this.name = name;
        this.baseId = baseId;
        this.efficiency = efficiency;
        this.toolColor = toolColor;
        this.armorColor = armorColor;
    }

    public Gold_Item getBase() {
        return Item.ITEMS[this.baseId];
    }
}
