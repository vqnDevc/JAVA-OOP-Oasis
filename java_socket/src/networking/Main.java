package networking;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency("No news");
        NewsChannel newsChannel = new NewsChannel();
        newsAgency.addObserver(newsChannel);
        newsAgency.setNews("Electronic is going turn off.");
    }
}
