package com.example.examplemod.entity.client;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entity.custom.BEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BModel extends AnimatedGeoModel<BEntity> {
    @Override
    public ResourceLocation getModelResource(BEntity object){
        return new ResourceLocation(ExampleMod.MOD_ID,"geo/b.geo.json");
    }
    @Override
    public ResourceLocation getTextureResource(BEntity object){
        return new ResourceLocation(ExampleMod.MOD_ID, "textures/entity/b.png");
    }
    @Override
    public ResourceLocation getAnimationResource(BEntity animatable){
        return new ResourceLocation(ExampleMod.MOD_ID, "animations/b.animation.json");
    }
}
