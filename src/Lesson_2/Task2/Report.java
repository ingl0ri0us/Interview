package Lesson_2.Task2;

import java.util.*;

class Report {
    private List<ReportItem> items;    // Отчетные данные

    // расчет отчетных данных
    public void calculate() {
        items = new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void output(Output outputSource) {
        if (outputSource instanceof PrintReport) {
            outputSource.output(items);
        }
        if (outputSource instanceof DisplayReport) {
            outputSource.output(items);
        }
        //PrintReport reportPrint = new PrintReport();
        //reportPrint.output(items);
    }
}