package pro.sisit.hr.widget.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import pro.sisit.hr.widget.api.Shape;
import pro.sisit.hr.widget.api.Widget;

public class SpentMoneyWidget implements Widget {

    private final int code;
    private final String name;
    private final Shape shape;
    private final SingleDimensionWidgetSettings settings;
    private final BigDecimal value;


    public SpentMoneyWidget(
        int code,
        String name,
        SingleDimensionWidgetSettings settings,
        Shape shape,
        BigDecimal sum
    ) {
        this.code = code;
        this.name = name;
        this.shape = shape;
        this.settings = settings;
        this.value = sum;
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
        builder.append("Итог по направлению ");
        builder.append(settings.getDimensionCode());
        builder.append(System.lineSeparator());
        var val = value; // todo учитывайте scale
        builder.append(val);
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
