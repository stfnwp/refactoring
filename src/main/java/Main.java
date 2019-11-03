public class Main {
    public static void main(String[] args) {
        PageData pageData = new PageData(
                "TestPage",
                "/path/to/test/page",
                "<TestPageContent></TestPageContent>");

        pageData.addAttribute("Test");
        try {
            String html = MakeHTML.testableHtml(pageData, true);
            System.out.println(html);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
