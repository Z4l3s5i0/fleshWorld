package net.Z4l3s5i0.fleshworld.block;

import net.Z4l3s5i0.fleshworld.FleshWorld;
import net.Z4l3s5i0.fleshworld.block.custom.RawMeatPlantBlock;
import net.Z4l3s5i0.fleshworld.block.custom.SpeedyBlock;
import net.Z4l3s5i0.fleshworld.item.ModCreativeModeTab;
import net.Z4l3s5i0.fleshworld.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.core.Logger;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Properties;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FleshWorld.MOD_ID);

    // mine
    public static final RegistryObject<Block> ROTTEN_BLOCK = registerBlock("rotten_flesh_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> RAW_MUTTON_BLOCK = registerBlock("raw_mutton_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> COOKED_MUTTON_BLOCK = registerBlock("cooked_mutton_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> RAW_BEEF_BLOCK = registerBlock("raw_beef_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> COOKED_BEEF_BLOCK = registerBlock("cooked_beef_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> RAW_CHICKEN_BLOCK = registerBlock("raw_chicken_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> COOKED_CHICKEN_BLOCK = registerBlock("cooked_chicken_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> RAW_PORKCHOP_BLOCK = registerBlock("raw_porkchop_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> COOKED_PORKCHOP_BLOCK = registerBlock("cooked_porkchop_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> RAW_RABBIT_BLOCK = registerBlock("raw_rabbit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> COOKED_RABBIT_BLOCK = registerBlock("cooked_rabbit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> FLESH_STONE = registerBlock("flesh_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).destroyTime(5)), ModCreativeModeTab.TUTORIAL_TAB);
/*
    public static final RegistryObject<Block> RAWMEATPLANT = register("raw_meat_crop",
            () -> new RawMeatPlantBlock(Block.Properties.of(Blocks.WHEAT)), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> ROTTENFLESHPLANT = register("rotten_flesh_crop",
            () -> new RottenFleshPlantBlock(BlockBehaviour.Properties.of(Blocks.WHEAT)), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Fluid> BLOOD_WATER = regisertFluid("blood_water",
            () -> new Fluid(whuuuuut));
     */
    // not mine
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlock("raw_citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB, "tooltip.tutorialmod.block.speedy_block");


    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs",
            () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_SLAB = registerBlock("citrine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> CITRINE_FENCE = registerBlock("citrine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_FENCE_GATE = registerBlock("citrine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_WALL = registerBlock("citrine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> CITRINE_BUTTON = registerBlock("citrine_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> CITRINE_PRESSURE_PLATE = registerBlock("citrine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> PINK_ROSE = registerBlock("pink_rose",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            () -> new FlowerPotBlock(null, ModBlocks.PINK_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
