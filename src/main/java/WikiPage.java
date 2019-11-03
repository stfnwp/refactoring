public class WikiPage {

    String name = "";
    String path = "";

    WikiPage(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public PageCrowlerImpl getPageCrawler() {
        return new PageCrowlerImpl("<Crawler>" + path + "</Crawler>");
    }

    public String getPath() {
        return "<PageCrawlerImpl>" + path + "</PageCrawlerImpl>";
    }
}
