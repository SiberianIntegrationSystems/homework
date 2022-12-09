package pro.sisit.hr.widget.api;

import pro.sisit.hr.widget.domain.SingleDimensionWidgetSettings;

public interface WidgetApi {
    Widget createSpentWidget(int code, String name, SingleDimensionWidgetSettings settings, Shape shape);
    Widget createRecordWidget(int code, String name, SingleDimensionWidgetSettings settings, Shape shape);
    // todo реализуйте получение BalanceWidget createRecordWidget(...)

}
