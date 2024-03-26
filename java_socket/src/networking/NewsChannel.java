package networking;

public class NewsChannel implements Channel{
    @Override
    public void upgrade(Object news) {
        System.out.println("Breaking News: " + news);
    }
}
