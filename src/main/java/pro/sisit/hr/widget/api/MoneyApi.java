package pro.sisit.hr.widget.api;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import pro.sisit.hr.widget.domain.Dimension;
import pro.sisit.hr.widget.domain.Fact;

/**
 * Интерфейс для записи об денежных операциях
 */
public interface MoneyApi {

    /**
     * Фиксация трат
     * @param dimensionCode
     * @param date
     * @param sum
     */
    void spent(Dimension dimensionCode, LocalDate date, BigDecimal sum);

    /**
     * Получение всех фактов по категории
     * @param code
     * @return
     */
    List<Fact> getFacts(Dimension code);

    /**
     * Учет доходов
     * @param dimension
     * @param date
     * @param sum
     */
    void earn(Dimension dimension, LocalDate date, BigDecimal sum);

}
