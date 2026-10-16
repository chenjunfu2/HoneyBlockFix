package chenjunfu2.honeyblockfix.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.HoneyBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(HoneyBlock.class)
public class HoneyBlockMixin extends TransparentBlock
{
	public HoneyBlockMixin(Settings settings)
	{
		super(settings);
	}
	
	@Override
	@Intrinsic(displace = true)
	public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.fullCube();
    }
}