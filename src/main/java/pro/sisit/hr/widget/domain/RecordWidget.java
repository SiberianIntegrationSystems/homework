package pro.sisit.hr.widget.domain;


import java.math.BigDecimal;
import java.math.RoundingMode;
import pro.sisit.hr.widget.api.Shape;
import pro.sisit.hr.widget.api.Widget;

public class RecordWidget implements Widget {

    private final int code;
    private final String name;
    private final Shape shape;
    private final SingleDimensionWidgetSettings settings;
    private final BigDecimal minValue;
    private final BigDecimal maxValue;

    public RecordWidget(
        int code,
        String name,
        Shape shape,
        SingleDimensionWidgetSettings settings,
        BigDecimal minValue,
        BigDecimal maxValue
    ) {
        this.code = code;
        this.name = name;
        this.shape = shape;
        this.settings = settings;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBody() {
        StringBuilder builder = new StringBuilder();
        builder.append("Минимум по направлению ");
        builder.append(settings.getDimensionCode());
        builder.append(System.lineSeparator());
        var val = minValue.setScale(getSettings().getScale(), RoundingMode.HALF_EVEN);
        builder.append(val);
        builder.append(" руб. ");

        builder.append(System.lineSeparator());
        builder.append("Максимум по направлению ");
        builder.append(settings.getDimensionCode());
        builder.append(System.lineSeparator());
        var maxVal = maxValue.setScale(getSettings().getScale(), RoundingMode.HALF_EVEN);
        builder.append(maxVal);
        builder.append(" руб. ");
        return builder.toString();
    }

    @Override
    public Shape shape() {
        return shape;
    }


    public SingleDimensionWidgetSettings getSettings() {
        return settings;
    }

}
