package pro.sisit.hr.widget.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Панель управления.
 */
public class ControlPlane {

    List<Widget> widgets = new ArrayList<>();
    private String name;

    public ControlPlane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public <T extends Widget> void addWidget(T widget) {
        checkIntersections(widgets, widget);
        widgets.add(widget);
    }

    public List<Widget> getWidgets() {
        return Collections.unmodifiableList(widgets);
    }

    private void checkIntersections(List<Widget> collection, Widget widget) {
        for (int i = 0; i < collection.size(); i++) {
            Widget widgetToCheck = widgets.get(i);
            if (!widgetToCheck.equals(widget) && widgetToCheck.shape().intersects(widget.shape())) {
                throw new RuntimeException("INTERSECTION ERROR! " + widget.getCode() + " -> " + widgetToCheck);
            }
        }
    }

}
