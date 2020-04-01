package com.raoulvdberge.refinedpipes.block;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

public class PipeShapeFactory {
    public VoxelShape createShape(BlockState state, boolean[] attachmentState) {
        VoxelShape shape = PipeShapeProps.CORE_SHAPE;

        if (state.get(PipeBlock.NORTH)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.NORTH_EXTENSION_SHAPE);
        }

        if (state.get(PipeBlock.EAST)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.EAST_EXTENSION_SHAPE);
        }

        if (state.get(PipeBlock.SOUTH)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.SOUTH_EXTENSION_SHAPE);
        }

        if (state.get(PipeBlock.WEST)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.WEST_EXTENSION_SHAPE);
        }

        if (state.get(PipeBlock.UP)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.UP_EXTENSION_SHAPE);
        }

        if (state.get(PipeBlock.DOWN)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.DOWN_EXTENSION_SHAPE);
        }

        if (attachmentState[Direction.NORTH.ordinal()] || state.get(PipeBlock.INV_NORTH)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.NORTH_ATTACHMENT_SHAPE);
        }

        if (attachmentState[Direction.EAST.ordinal()] || state.get(PipeBlock.INV_EAST)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.EAST_ATTACHMENT_SHAPE);
        }

        if (attachmentState[Direction.SOUTH.ordinal()] || state.get(PipeBlock.INV_SOUTH)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.SOUTH_ATTACHMENT_SHAPE);
        }

        if (attachmentState[Direction.WEST.ordinal()] || state.get(PipeBlock.INV_WEST)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.WEST_ATTACHMENT_SHAPE);
        }

        if (attachmentState[Direction.UP.ordinal()] || state.get(PipeBlock.INV_UP)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.UP_ATTACHMENT_SHAPE);
        }

        if (attachmentState[Direction.DOWN.ordinal()] || state.get(PipeBlock.INV_DOWN)) {
            shape = VoxelShapes.or(shape, PipeShapeProps.DOWN_ATTACHMENT_SHAPE);
        }

        return shape;
    }
}
