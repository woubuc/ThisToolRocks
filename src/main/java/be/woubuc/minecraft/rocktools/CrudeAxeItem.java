package be.woubuc.minecraft.rocktools;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class CrudeAxeItem extends AxeItem {
    public static Tier CRUDE_TIER = TierSortingRegistry.registerTier(
            new ForgeTier(0, 21, 1.5f, 0.0f, 6, Tags.Blocks.NEEDS_WOOD_TOOL, Ingredient::of),
            new ResourceLocation(RockToolsMod.MODID, "crude"),
            List.of(),
            List.of(Tiers.WOOD)
    );

    public CrudeAxeItem() {
        super(CRUDE_TIER, 1, -3f, new Item.Properties().setNoRepair().stacksTo(1));
    }
}
