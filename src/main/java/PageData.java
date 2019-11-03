import java.util.HashSet;
import java.util.Set;

public class PageData {
    private String name;
    private String path;
    private String content;
    private Set<String> attributes;

    PageData(String name, String path, String content) {
       this.name = name;
       this.path = path;
       this.content = content;
       this.attributes = new HashSet<String>();
    }

    public void addAttribute(String name) {
        attributes.add(name);
    }

    public WikiPage getWikiPage() {
        return new WikiPage(name, path);
    }

    public boolean hasAttribute(String test) {
        return attributes.contains(test);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return content;
    }
}
