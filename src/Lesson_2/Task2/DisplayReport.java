package Lesson_2.Task2;

import java.util.List;

public class DisplayReport implements Output {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to display");
        for (ReportItem item : items) {
            System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
