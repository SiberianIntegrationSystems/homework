package pro.sisit.hr;

import java.math.BigDecimal;
import java.time.LocalDate;
import pro.sisit.hr.widget.api.ControlPlane;
import pro.sisit.hr.widget.api.Shape;
import pro.sisit.hr.widget.api.WidgetApi;
import pro.sisit.hr.widget.domain.Dimension;
import pro.sisit.hr.widget.domain.FactRepository;
import pro.sisit.hr.widget.domain.MoneyOperations;
import pro.sisit.hr.widget.domain.Point;
import pro.sisit.hr.widget.domain.Shape2D;
import pro.sisit.hr.widget.domain.SingleDimensionWidgetSettings;
import pro.sisit.hr.widget.domain.WidgetApiImpl;
import pro.sisit.hr.widget.domain.WidgetConsoleWriter;

public class Main {

    public static void main(String[] args) {
        FactRepository factRepository = new FactRepository();
        MoneyOperations moneyOperations = new MoneyOperations();
        WidgetApi widgetApi = new WidgetApiImpl(factRepository);

        moneyOperations.spent(Dimension.FOOD, LocalDate.of(2020, 1, 1), BigDecimal.valueOf(12.2222d));
        moneyOperations.spent(Dimension.FOOD, LocalDate.of(2020, 1, 2), BigDecimal.valueOf(24.2d));
        moneyOperations.spent(Dimension.FOOD, LocalDate.of(2020, 1, 3), BigDecimal.valueOf(42.226145d));
        moneyOperations.spent(Dimension.FOOD, LocalDate.of(2020, 1, 4), BigDecimal.valueOf(4.226145d));

        /**
         * Внимание - сначала производит операции, потом создаем виджеты.
         */
        ControlPlane controlPlane = new ControlPlane("Расходы");

        SingleDimensionWidgetSettings settings = new SingleDimensionWidgetSettings(2, Dimension.FOOD, true);
        Shape shape = new Shape2D(100, 200, new Point(0, 0));
        controlPlane.addWidget(widgetApi.createSpentWidget(1, "Суммарные расходы на еду", settings, shape));

        SingleDimensionWidgetSettings settings2 = new SingleDimensionWidgetSettings(4, Dimension.FOOD, true);
        Shape shape2 = new Shape2D(100, 200, new Point(300, 400));
        controlPlane.addWidget(widgetApi.createRecordWidget(
            1,
            "Максимальные и минимальные расходы на еду",
            settings2,
            shape2
        ));

        WidgetConsoleWriter wcw = new WidgetConsoleWriter();
        wcw.writeToConsole(controlPlane);

    }

}
