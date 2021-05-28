package com.jdh.microcraft.item;

import com.jdh.microcraft.entity.Entity;
import com.jdh.microcraft.gfx.Renderer;
import com.jdh.microcraft.item.armor.*;
import com.jdh.microcraft.item.consumable.ItemApple;
import com.jdh.microcraft.item.consumable.ItemBread;
import com.jdh.microcraft.item.consumable.ItemCactusGoo;
import com.jdh.microcraft.item.consumable.ItemPie;
import com.jdh.microcraft.item.crafting.Recipe;
import com.jdh.microcraft.item.custom.Gem_Item;
import com.jdh.microcraft.item.custom.Gold_Item;
import com.jdh.microcraft.item.custom.Iron_Item;
import com.jdh.microcraft.item.custom.Mithril_Item;
import com.jdh.microcraft.item.custom.Rock_Item;
import com.jdh.microcraft.item.custom.Wood_Item;
import com.jdh.microcraft.item.furniture.*;
import com.jdh.microcraft.item.resource.*;
import com.jdh.microcraft.item.tool.*;
import com.jdh.microcraft.level.Level;
import com.jdh.microcraft.level.tile.Tile;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Item implements Wood_Item, Gold_Item, Iron_Item, Gem_Item, Mithril_Item, Rock_Item {
    public static final Item[] ITEMS = new Item[256];

    public static final ItemGlove GLOVE = new ItemGlove(1);
    public static final ItemCactus CACTUS = new ItemCactus(28);
    public static final ItemSeed SEED = new ItemSeed(29);
    public static final ItemSand SAND = new ItemSand(30);
    public static final ItemWheat WHEAT = new ItemWheat(31);
    public static final ItemBread BREAD = new ItemBread(32);
    public static final ItemFlower POPPY = new ItemFlower(34, "POPPY", Tile.POPPY);
    public static final ItemFlower DAISY = new ItemFlower(35, "DAISY", Tile.DAISY);

    public static final ItemCraftingBench CRAFTING_BENCH = new ItemCraftingBench(36);
    public static final ItemFurnace FURNACE = new ItemFurnace(37);
    public static final ItemOven OVEN = new ItemOven(38);
    public static final ItemChest CHEST = new ItemChest(39);
    public static final ItemAnvil ANVIL = new ItemAnvil(40);
    public static final ItemApple APPLE = new ItemApple(41);
    public static final ItemSapling SAPLING = new ItemSapling(42);

    public static final ItemCoal COAL = new ItemCoal(48);
    public static final ItemGlass GLASS = new ItemGlass(49);
    public static final ItemPie PIE = new ItemPie(50);
    
    public static final ItemSlime SLIME = new ItemSlime(58);
    public static final ItemLantern LANTERN = new ItemLantern(59);
    
    public static final ItemCactusGoo CACTUS_GOO = new ItemCactusGoo(72);
    public static final ItemBone BONE = new ItemBone(73);
    public static final ItemBonemeal BONEMEAL = new ItemBonemeal(74);

    // all available crafting recipes
    public static final List<Recipe> RECIPES = Arrays.stream(ITEMS)
            .filter(Objects::nonNull)
            .flatMap(i -> i.getRecipes().stream())
            .collect(Collectors.toList());

    // recipes for each crafting station
    public static final Map<Integer, List<Recipe>> STATION_RECIPES = Map.of(
        Recipe.STATION_INVENTORY,
        RECIPES.stream().filter(r -> (r.station & Recipe.STATION_INVENTORY) != 0).collect(Collectors.toList()),
        Recipe.STATION_BENCH,
        RECIPES.stream().filter(r -> (r.station & Recipe.STATION_BENCH) != 0).collect(Collectors.toList()),
        Recipe.STATION_ALL_CRAFTING,
        RECIPES.stream().filter(r -> (r.station & Recipe.STATION_ALL_CRAFTING) != 0).collect(Collectors.toList()),
        Recipe.STATION_OVEN,
        RECIPES.stream().filter(r -> (r.station & Recipe.STATION_OVEN) != 0).collect(Collectors.toList()),
        Recipe.STATION_FURNACE,
        RECIPES.stream().filter(r -> (r.station & Recipe.STATION_FURNACE) != 0).collect(Collectors.toList()),
        Recipe.STATION_ANVIL,
        RECIPES.stream().filter(r -> (r.station & Recipe.STATION_ANVIL) != 0).collect(Collectors.toList())
    );

    public final int id;

    public Item(int id) {
        this.id = id;
        assert(Item.ITEMS[id] == null);
        Item.ITEMS[id] = this;
    }

    public boolean use(ItemInstance instance, Level level, int x, int y, Entity e) {
        return false;
    }

    // render this item in the world
    public void render(ItemInstance instance, Level level, int x, int y) {
        Renderer.render(this.getIconX(), this.getIconY(), x, y, this.getColor(), Renderer.FLIP_NONE);
    }

    // render this item in a menu (as an icon)
    public void renderIcon(ItemInstance instance, int x, int y) {
        Renderer.render(this.getIconX(), this.getIconY(), x, y, this.getColor(), Renderer.FLIP_NONE);
    }

    // render this item being carried by an entity
    public void renderCarry(ItemInstance instance, Level Level, Entity e) {

    }

    public Collection<Recipe> getRecipes() {
        return List.of();
    }

    public boolean carry(Entity e) { return false; }

    public int getLightPower() { return 0; }

    public boolean isEquippable() { return false; }

    public boolean isStackable() {
        return true;
    }

    public boolean isDroppable() {
        return true;
    }

    public boolean showInMenu() {
        return true;
    }

    public abstract String getName();

    public abstract int getColor();

    public abstract int getIconX();

    public abstract int getIconY();
}
