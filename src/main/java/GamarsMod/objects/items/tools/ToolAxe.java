package GamarsMod.objects.items.tools;

import GamarsMod.Main;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ToolAxe extends ItemTool {

    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.CRAFTING_TABLE);

    public ToolAxe(String name, ToolMaterial material, float attackDamage, float attackSpeed) {
        super(material, EFFECTIVE_ON);
        this.attackDamage = attackDamage - 1.0F;
        this.attackSpeed = attackSpeed - 4.0F;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.gamarsTab);

        // ItemInit.ITEMS.add(this);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }


    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {

        if(enchantment == Enchantments.SHARPNESS) {
            return true;
        }
        if(enchantment == Enchantments.BANE_OF_ARTHROPODS) {
            return true;
        }
        if(enchantment == Enchantments.SMITE) {
            return true;
        }
        else return super.canApplyAtEnchantingTable(stack, enchantment);
    }

}
