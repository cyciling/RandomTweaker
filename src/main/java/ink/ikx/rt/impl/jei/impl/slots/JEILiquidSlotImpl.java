package ink.ikx.rt.impl.jei.impl.slots;

import ink.ikx.rt.api.instance.jei.interfaces.slots.JEILiquidSlot;

public class JEILiquidSlotImpl extends JEISlotImpl implements JEILiquidSlot {

    public boolean isBase;
    public int width;
    public int heigh;
    public int capacityMb;
    public boolean showCapacity;

    public JEILiquidSlotImpl(boolean isInput, int x, int y, int width, int heigh,
        int capacityMb, boolean showCapacity, boolean isBase, String texture) {
        super(isInput, x, y, texture);

        this.isBase = isBase;
        this.width = width;
        this.heigh = heigh;
        this.capacityMb = capacityMb;
        this.showCapacity = showCapacity;
    }

    @Override
    public boolean isBase() {
        return this.isBase;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeigh() {
        return heigh;
    }

    @Override
    public int getCapacityMb() {
        return capacityMb;
    }

    @Override
    public boolean isShowCapacity() {
        return showCapacity;
    }
}
