package pro.sisit.hr.widget.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Fact(LocalDate date, BigDecimal amount, DirectionType direction) {

}
