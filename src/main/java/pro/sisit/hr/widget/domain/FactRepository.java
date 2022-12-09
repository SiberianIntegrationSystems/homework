package pro.sisit.hr.widget.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactRepository {

    private Map<Dimension, List<Fact>> facts = new HashMap<>();

    /**
     * тратим деньги
     * @param dimension
     * @param date
     * @param sum
     */
    public void spent(Dimension dimension, LocalDate date, BigDecimal sum) {
        var list = facts.getOrDefault(dimension, new ArrayList<>());
        list.add(new Fact(date, sum, DirectionType.OUTCOME));
        facts.put(dimension, list);
    }

    /**
     * зарабатываем. todo - можно ли вынести общий код?
     * @param dimension
     * @param date
     * @param sum
     */
    public void earn(Dimension dimension, LocalDate date, BigDecimal sum) {
        var list = facts.getOrDefault(dimension, new ArrayList<>());
        list.add(new Fact(date, sum, DirectionType.INCOME));
        facts.put(dimension, list);
    }
    public List<Fact> getFacts(Dimension code) {
        return facts.getOrDefault(code, Collections.emptyList());
    }


}
