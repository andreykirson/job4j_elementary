package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }

    public static class ReportUsage {
        public static void main(String[] args) {
            JSONReport report = new JSONReport();
            String text = report.generate("Report's name", "Report's body");
            System.out.println(text);
        }
    }


    public class HtmlReport extends TextReport {
        @Override
        public String generate(String name, String body) {
            return "<h1>" + name + "</h1>" +
                    "<br/>" +
                    "<span>" + body + "</span>";
        }
    }


    public static class JSONReport extends TextReport {
        @Override
        public String generate(String name, String body) {
            return "{\n" +
                    "\n" +
                    "   name : name,\n" +
                    "   body : body\n" +
                    "\n" +
                    "}";
        }
    }



}


