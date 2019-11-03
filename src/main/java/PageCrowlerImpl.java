public class PageCrowlerImpl {
    String path = "";

    PageCrowlerImpl(String path) {
        this.path = "<PageCrawlerImpl>" + path + "</PageCrawlerImpl>";
    }

    public static WikiPage getInheritedPage(String name,  WikiPage wikiPage){
        return new WikiPage("subpage " + name + " of " + wikiPage.toString(),
                wikiPage.path + "/" + name);
    }

    public WikiPagePath getFullPath(WikiPage suiteSetup) {
        return new WikiPagePath("<FullPath>" + suiteSetup.path + "</FullPath>");
    }
}
