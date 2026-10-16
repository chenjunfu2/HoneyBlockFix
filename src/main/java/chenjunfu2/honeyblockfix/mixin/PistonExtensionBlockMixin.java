package chenjunfu2.honeyblockfix.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.PistonExtensionBlock;
import net.minecraft.block.entity.PistonBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PistonExtensionBlock.class)
public abstract class PistonExtensionBlockMixin extends BlockWithEntity
{
	protected PistonExtensionBlockMixin(Settings settings)
	{
		super(settings);
	}
	
	@Shadow
    private PistonBlockEntity getPistonBlockEntity(BlockView world, BlockPos pos)
	{
        throw new AssertionError("mixin replace");
    }
	
	@Override
	@Intrinsic(displace = true)
    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos)
	{
        PistonBlockEntity pistonBlockEntity = this.getPistonBlockEntity(world, pos);
        return pistonBlockEntity != null ? pistonBlockEntity.getPushedBlock().getSidesShape(world, pos) : VoxelShapes.empty();
    }
}
