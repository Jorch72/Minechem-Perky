package ljdp.minechem.client;

import ljdp.minechem.common.CommonProxy;
import ljdp.minechem.common.MinechemBlocks;
import ljdp.minechem.common.MinechemItems;
import ljdp.minechem.common.tileentity.TileEntityDecomposer;
import ljdp.minechem.common.tileentity.TileEntityMicroscope;
import ljdp.minechem.common.tileentity.TileEntitySynthesis;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ELEMENTBOTTLES_PNG);
		MinecraftForgeClient.preloadTexture(DECOMPOSER_GUI_PNG);
		MinecraftForgeClient.preloadTexture(MICROSCOPE_GUI_PNG);
		MinecraftForgeClient.preloadTexture(SYNTHESIS_GUI_PNG);
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
		MinecraftForgeClient.preloadTexture(TERRAIN_ALPHA_PNG);
		MinecraftForgeClient.preloadTexture(MICROSCOPE_MODEL);
		MinecraftForgeClient.preloadTexture(DECOMPOSER_MODEL_ON);
		MinecraftForgeClient.preloadTexture(DECOMPOSER_MODEL_OFF);
		MinecraftForgeClient.preloadTexture(SYNTHESIS_MODEL);
		
		CUSTOM_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
		
		MinecraftForgeClient.registerItemRenderer(MinechemItems.element.shiftedIndex, new ItemElementRenderer());
		MinecraftForgeClient.registerItemRenderer(MinechemItems.molecule.shiftedIndex, new ItemMoleculeRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.itemsList[MinechemBlocks.microscope.blockID].shiftedIndex, new ItemMicroscopeRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.itemsList[MinechemBlocks.decomposer.blockID].shiftedIndex, new ItemDecomposerRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.itemsList[MinechemBlocks.synthesis.blockID].shiftedIndex, new ItemSynthesisRenderer());
		RenderingRegistry.registerBlockHandler(new RenderBlockGhostBlock());
		TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMicroscope.class, new TileEntityMicroscopeRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDecomposer.class, new TileEntityDecomposerRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySynthesis.class, new TileEntitySynthesisRenderer());
	}
	
	@Override
	public World getClientWorld() {
		return FMLClientHandler.instance().getClient().theWorld;
	}

}
