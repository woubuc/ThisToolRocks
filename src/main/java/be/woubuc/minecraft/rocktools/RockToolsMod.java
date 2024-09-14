package be.woubuc.minecraft.rocktools;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(RockToolsMod.MODID)
public class RockToolsMod {
    public static final String MODID = "rocktools";

    public static final DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> CRUDE_AXE_ANDESITE = ITEM_REGISTRY.register("crude_axe_andesite", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_COBBLESTONE = ITEM_REGISTRY.register("crude_axe_cobblestone", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_DIORITE = ITEM_REGISTRY.register("crude_axe_diorite", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_END_STONE = ITEM_REGISTRY.register("crude_axe_end_stone", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_GRANITE = ITEM_REGISTRY.register("crude_axe_granite", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_NETHERRACK = ITEM_REGISTRY.register("crude_axe_netherrack", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_RED_SANDSTONE = ITEM_REGISTRY.register("crude_axe_red_sandstone", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_SANDSTONE = ITEM_REGISTRY.register("crude_axe_sandstone", CrudeAxeItem::new);
    public static final RegistryObject<Item> CRUDE_AXE_SOUL_SOIL = ITEM_REGISTRY.register("crude_axe_soul_soil", CrudeAxeItem::new);

    public RockToolsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEM_REGISTRY.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(CRUDE_AXE_ANDESITE.get());
            event.accept(CRUDE_AXE_COBBLESTONE.get());
            event.accept(CRUDE_AXE_DIORITE.get());
            event.accept(CRUDE_AXE_END_STONE.get());
            event.accept(CRUDE_AXE_GRANITE.get());
            event.accept(CRUDE_AXE_NETHERRACK.get());
            event.accept(CRUDE_AXE_RED_SANDSTONE.get());
            event.accept(CRUDE_AXE_SANDSTONE.get());
            event.accept(CRUDE_AXE_SOUL_SOIL.get());
        }
    }
}
