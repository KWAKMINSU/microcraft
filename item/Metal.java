package com.jdh.microcraft.item;

import com.jdh.microcraft.item.resource.ItemGold;
import com.jdh.microcraft.item.resource.ItemIngot;
import com.jdh.microcraft.item.resource.ItemIron;
import com.jdh.microcraft.item.resource.ItemMithril;
import com.jdh.microcraft.item.resource.ItemOre;

public class Metal implements ItemGold, ItemIron, ItemMithril {
    public final String name;
    public final int oreId, ingotId;
    public final int baseColor, color;

    public Metal(String name, int oreId, int ingotId, int baseColor, int color) {
        this.name = name;
        this.baseColor = baseColor;
        this.color = color;
        this.oreId = oreId;
        this.ingotId = ingotId;
    }

    public ItemOre getOre() {
        return (ItemOre) Item.ITEMS[this.oreId];
    }

    public ItemIngot getIngot() {
        return (ItemIngot) Item.ITEMS[this.ingotId];
    }
}
