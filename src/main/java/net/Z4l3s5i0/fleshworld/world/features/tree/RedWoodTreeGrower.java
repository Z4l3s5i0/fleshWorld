package net.Z4l3s5i0.fleshworld.world.features.tree;


import net.Z4l3s5i0.fleshworld.world.features.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import javax.annotation.Nullable;
import java.util.Random;

public class RedWoodTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return (ConfiguredFeature<TreeConfiguration, ?>) ModConfiguredFeatures.REDWOOD;
    }
}