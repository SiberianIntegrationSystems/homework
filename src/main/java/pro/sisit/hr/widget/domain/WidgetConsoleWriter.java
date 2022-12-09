package pro.sisit.hr.widget.domain;

import pro.sisit.hr.widget.api.ControlPlane;
import pro.sisit.hr.widget.api.Widget;

public class WidgetConsoleWriter {

    public void writeToConsole(Widget widget) {

        System.out.println("---------------------");
        System.out.println("<widget>");
        System.out.println("Код: " + widget.getCode());
        System.out.println("(" + widget.getName() + ")");
        System.out.println(widget.getBody());
        System.out.println("</widget>");
        System.out.println("---------------------");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void writeToConsole(ControlPlane controlPlane) {
        System.out.println("Панель: " + controlPlane.getName());
        System.out.println(
            "*********************Панель: " + controlPlane.getName() + "***************************************");
        controlPlane.getWidgets().forEach(this::writeToConsole);
        System.out.println("************************************************************");

    }

}
