package GamarsMod.init;

import GamarsMod.objects.armour.ArmourBase;
import GamarsMod.objects.items.ItemBase;
import GamarsMod.objects.tools.*;
import GamarsMod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

                        //type of variable  //makes what the variable is equal to
    public static final List<Item> ITEMS = new ArrayList<Item>();
                                   //name of variable

    //ITEMS
    public static final Item TEST_ITEM = new ItemBase("test_item");
    public static final Item TEST_MATERIAL = new ItemBase("test_material");
    public static final Item TEST_FOOD = new ItemBase("test_food");
    public static final Item TEST_TEST = new ItemBase("test_test");

    //MATERIALS
    public static final Item.ToolMaterial TEST_TOOL = EnumHelper.addToolMaterial("test_cool", 3, 1561, 8.0F, 3.0F, 10);
    public static final ItemArmor.ArmorMaterial TEST_ARMOUR = EnumHelper.addArmorMaterial("test_armour", Reference.MOD_ID + ":TEST", 15, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    //ARMOUR
    public static final Item TEST_HELMET = new ArmourBase("test_helmet", TEST_ARMOUR, 1, EntityEquipmentSlot.HEAD);
    public static final Item TEST_CHESTPLATE = new ArmourBase("test_chestplate", TEST_ARMOUR,1, EntityEquipmentSlot.CHEST);
    public static final Item TEST_LEGGINGS = new ArmourBase("test_leggings", TEST_ARMOUR, 2, EntityEquipmentSlot.LEGS);
    public static final Item TEST_BOOTS = new ArmourBase("test_boots", TEST_ARMOUR, 1, EntityEquipmentSlot.FEET);

    //TOOLS
    public static final Item TEST_SWORD = new ToolSword("test_sword", TEST_TOOL);
    public static final Item TEST_PICKAXE = new ToolPickaxe("test_pickaxe", TEST_TOOL);
    public static final Item TEST_AXE = new ToolAxe("test_axe", TEST_TOOL);
    public static final Item TEST_SHOVEL = new ToolShovel("test_shovel", TEST_TOOL);
    public static final Item TEST_HOE = new ToolHoe("test_hoe", TEST_TOOL);

    //ROBERT ITEM
    public static final Item BONK_HAMMER = new ItemBase("bonk_hammer");

    //ANGELO ITEM
}
