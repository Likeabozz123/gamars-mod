package GamarsMod.util.handlers;

import GamarsMod.objects.blocks.container.ContainerTestCoalGenerator;
import GamarsMod.objects.blocks.custom.pedestal.ContainerPedestal;
import GamarsMod.objects.blocks.custom.pedestal.GuiPedestal;
import GamarsMod.objects.blocks.custom.pedestal.TileEntityPedestal;
import GamarsMod.objects.blocks.gui.GuiTestCoalGenerator;
import GamarsMod.objects.blocks.machines.customfurnace.ContainerCustomFurnace;
import GamarsMod.objects.blocks.machines.customfurnace.GuiCustomFurnace;
import GamarsMod.objects.blocks.machines.customfurnace.TileEntityCustomFurnace;
import GamarsMod.objects.blocks.machines.sinteringfurnace.ContainerSinteringFurnace;
import GamarsMod.objects.blocks.machines.sinteringfurnace.GuiSinteringFurnace;
import GamarsMod.objects.blocks.machines.sinteringfurnace.TileEntitySinteringFurnace;
import GamarsMod.objects.tileentity.TileEntityTestCoalGen;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiRegistry implements IGuiHandler {

    public static final int GUI_BLOCK_CUSTOM_FURNACE = 1;
    public static final int GUI_TEST_COAL_GENERATOR = 2;
    public static final int GUI_SINTERING_FURNACE = 3;
    public static final int GUI_PEDESTAL = 4;

    /**
     * gets the server's part of a Gui
     *
     * @return a {@link Container} for the server
     */
    @Override
    public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        switch (ID) {
            case GUI_TEST_COAL_GENERATOR:
                // get container for gui
                return new ContainerTestCoalGenerator(player.inventory, (TileEntityTestCoalGen)world.getTileEntity(new BlockPos(x, y, z)));
            case GUI_BLOCK_CUSTOM_FURNACE:
                return new ContainerCustomFurnace(player.inventory, (TileEntityCustomFurnace) world.getTileEntity(new BlockPos(x,y,z)));
            case GUI_SINTERING_FURNACE:
                return new ContainerSinteringFurnace(player.inventory, (TileEntitySinteringFurnace)world.getTileEntity(new BlockPos(x, y, z)));
            case GUI_PEDESTAL:
                return new ContainerPedestal(player.inventory, (TileEntityPedestal)world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

    /**
     * gets the client's part of a Gui
     *
     * @return a {@link // GuiScreen} for the client
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        switch (ID) {
            case GUI_TEST_COAL_GENERATOR:
                // get gui for gui
                return new GuiTestCoalGenerator(player.inventory, (TileEntityTestCoalGen)world.getTileEntity(new BlockPos(x, y, z)));
            case GUI_BLOCK_CUSTOM_FURNACE:
                return new GuiCustomFurnace(player.inventory, (TileEntityCustomFurnace)world.getTileEntity(new BlockPos(x, y, z)));
            case GUI_SINTERING_FURNACE:
                return new GuiSinteringFurnace(player.inventory, (TileEntitySinteringFurnace)world.getTileEntity(new BlockPos(x, y, z)));
            case GUI_PEDESTAL:
                return new GuiPedestal(player.inventory, (TileEntityPedestal)world.getTileEntity(new BlockPos(x, y, z)));
            default:
                return null;
        }
    }

}
