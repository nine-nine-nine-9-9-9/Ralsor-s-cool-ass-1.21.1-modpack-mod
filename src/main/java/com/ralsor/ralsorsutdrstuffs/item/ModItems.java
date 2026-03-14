package com.ralsor.ralsorsutdrstuffs.item;

import com.ralsor.ralsorsutdrstuffs.RalsorsUtdrStuffs;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import org.intellij.lang.annotations.Identifier;



public class ModItems {

    public static final Item BUTTERSCOTCH_PIE = registerItem("buttercotch_pie", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of (RalsorsUtdrStuffs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RalsorsUtdrStuffs.LOGGER.info("Registering ModItems for" + RalsorsUtdrStuffs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINKS).register(entries -> {
            entries.add(BUTTERSCOTCH_PIE);
        });
    }

}
