package adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private final JapaneseAdaptee japaneseAdaptee;
    private EnglishAdaptee englishAdaptee;
    private ChinaAdaptee chinaAdaptee;

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee, EnglishAdaptee englishAdaptee) {
        this(japaneseAdaptee);
        this.englishAdaptee = englishAdaptee;
    }

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee, EnglishAdaptee englishAdaptee, ChinaAdaptee chinaAdaptee) {
        this(japaneseAdaptee, englishAdaptee);
        this.chinaAdaptee = chinaAdaptee;
    }


    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        System.out.println("Sending Words ...");
        japaneseAdaptee.receive(words);
        englishAdaptee.receive(words);
        chinaAdaptee.receive(words);
    }
}
