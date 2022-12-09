package pro.sisit.hr.widget.domain;

public class SingleDimensionWidgetSettings {

    boolean toCurrentDate;
    private int scale;
    private Dimension dimensionCode;

    public SingleDimensionWidgetSettings(int scale, Dimension dimensionCode, boolean toCurrentDate) {
        this.scale = scale;
        this.dimensionCode = dimensionCode;
        this.toCurrentDate = toCurrentDate;
    }

    public int getScale() {
        return scale;
    }

    public Dimension getDimensionCode() {
        return dimensionCode;
    }

    public boolean isToCurrentDate() {
        return toCurrentDate;
    }

}
