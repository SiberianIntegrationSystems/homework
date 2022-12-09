package pro.sisit.hr.widget.domain;

import java.math.BigDecimal;
import java.util.List;
import pro.sisit.hr.widget.api.Shape;
import pro.sisit.hr.widget.api.Widget;
import pro.sisit.hr.widget.api.WidgetApi;

/**
 * Апи работы с виджетами.
 */
public class WidgetApiImpl implements WidgetApi {

    private final FactRepository spentRepository;

    public WidgetApiImpl(FactRepository spentRepository) {
        this.spentRepository = spentRepository;
    }

    @Override
    public Widget createSpentWidget(
        int code, String name, SingleDimensionWidgetSettings settings, Shape shape
    ) {
        Dimension dimensionCode = settings.getDimensionCode();
        List<Fact> facts = spentRepository.getFacts(dimensionCode);
        // todo добавить расчет суммы
        // todo добавить расчет максимум
        BigDecimal sum = BigDecimal.ZERO;
        return new SpentMoneyWidget(code, name, settings, shape, sum);
    }


    @Override
    public Widget createRecordWidget(int code, String name, SingleDimensionWidgetSettings settings, Shape shape) {
        Dimension dimensionCode = settings.getDimensionCode();
        List<Fact> facts = spentRepository.getFacts(dimensionCode);
        // todo добавить расчет минимума
        // todo добавить расчет максимум
        BigDecimal min = BigDecimal.ZERO;
        BigDecimal max = BigDecimal.ZERO;
        return new RecordWidget(code, name, shape, settings, min, max);
    }

}
