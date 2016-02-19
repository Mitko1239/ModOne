package com.mitko1239.miscutilities.crafting;

import com.mitko1239.miscutilities.blocks.ModBlocks;
import com.mitko1239.miscutilities.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), "##",
				"##", '#', ModItems.tutorialItem);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.propertyBlock, 8, 0),
				"###", "#I#", "###", '#', Blocks.cobblestone, 'I',
				new ItemStack(Items.dye, 1, 15));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.propertyBlock, 8, 1),
				"###", "#I#", "###", '#', Blocks.cobblestone, 'I',
				new ItemStack(Items.dye, 1, 0));
		GameRegistry.addShapelessRecipe(
				new ItemStack(ModItems.tutorialItem, 4, 0),
				ModBlocks.tutorialBlock);
		GameRegistry.addSmelting(Items.diamond,
				new ItemStack(ModItems.tutorialItem), 1.0F);

		GameRegistry.addRecipe(new ItemStack(ModItems.tutorialAxe), "## ",
				"#I ", " I ", '#', Items.emerald, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.tutorialHoe), "## ",
				" I ", " I ", '#', Items.emerald, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.tutorialPickaxe), "###",
				" I ", " I ", '#', Items.emerald, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.tutorialSpade), " # ",
				" I ", " I ", '#', Items.emerald, 'I', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.tutorialSword), " # ",
				" # ", " I ", '#', Items.emerald, 'I', Items.stick);
	}
}
