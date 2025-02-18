package cy.jdkdigital.euconverter.block.entity;

import cy.jdkdigital.euconverter.EUConverter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class LVConverterBlockEntity extends ConverterBlockEntity
{
    public LVConverterBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(pPos, pBlockState, 1, 32, 64);
    }

    @Override
    public BlockEntityType<?> createType() {
        return EUConverter.LV_CONVERTER_BLOCK_ENTITY.get();
    }
}
