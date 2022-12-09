package pro.sisit.hr.widget.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import pro.sisit.hr.widget.api.MoneyApi;

/**
 * Реализация апи работы с денежными операциями
 */
public class MoneyOperations implements MoneyApi {

    private final FactRepository factRepository = new FactRepository();

    @Override
    public void spent(Dimension dimensionCode, LocalDate date, BigDecimal sum) {
        factRepository.spent(dimensionCode, date, sum);
    }

    @Override
    public List<Fact> getFacts(Dimension code) {
        return factRepository.getFacts(code);
    }

    @Override
    public void earn(Dimension dimensionCode, LocalDate date, BigDecimal sum) {
        factRepository.earn(dimensionCode, date, sum);

    }

}
