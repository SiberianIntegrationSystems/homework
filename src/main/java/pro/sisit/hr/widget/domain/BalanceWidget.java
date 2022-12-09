package pro.sisit.hr.widget.domain;

import pro.sisit.hr.widget.api.Shape;
import pro.sisit.hr.widget.api.Widget;

/**
 *
 *
 * Виджет отображающий итоги по доходам и расходам
 * должен вести себя как SpentMoneyWidget но учитывать доходы
 * todo
 */
public class BalanceWidget implements Widget {

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getBody() {
        return null;
    }

    @Override
    public Shape shape() {
        return null;
    }

}
