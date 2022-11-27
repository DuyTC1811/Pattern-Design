package adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee(), new EnglishAdaptee(), new ChinaAdaptee());
        client.send("Xin chào");
    }
}
