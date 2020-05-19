package Lesson_2.Task2;

class Programm {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        Output print = new PrintReport();
        report.output(print);
        Output display = new DisplayReport();
        report.output(display);
    }
}