package pro.sisit.hr.widget.api;

import pro.sisit.hr.widget.api.Shape;

/**
 * Виджет
 */
public interface Widget {
    int getCode();
    String getName();
    String getBody();
    Shape shape();
}
