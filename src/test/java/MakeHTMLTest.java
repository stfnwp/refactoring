import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeHTMLTest {

    private PageData pageData;

    @BeforeEach
    public void setup(){
        pageData = new PageData(
                "TestPage",
                "/path/to/test/page",
                "<TestPageContent></TestPageContent>");

        pageData.addAttribute("Test");
    }



    // testableHtml(PageData pageData, boolean includeSuiteSetup)
    @Test

    public void testableHtml_includeSuiteSetup_true() throws Exception{

        String expected = "!include -setup . <Rendered><FullPath>/path/to/test/page/Suite Steup Name</FullPath></Rendered>\n" +
                "!include -setup . <Rendered><FullPath>/path/to/test/page/SetUp</FullPath></Rendered>\n" +
                "<TestPageContent></TestPageContent>!include -teardown . <Rendered><FullPath>/path/to/test/page/TearDown</FullPath></Rendered>\n" +
                "!include -teardown . <Rendered><FullPath>/path/to/test/page/Suite Teardown Name</FullPath></Rendered>\n";

        String actual =  MakeHTML.testableHtml(pageData, true);
        assertEquals(expected, actual);
    }


    @Test

    public void testableHtml_includeSuiteSetup_false() throws Exception{

        String expected = "!include -setup . <Rendered><FullPath>/path/to/test/page/SetUp</FullPath></Rendered>\n" +
                "<TestPageContent></TestPageContent>!include -teardown . <Rendered><FullPath>/path/to/test/page/TearDown</FullPath></Rendered>\n";

        String actual =  MakeHTML.testableHtml(pageData, false);
        assertEquals(expected, actual);
    }
}
