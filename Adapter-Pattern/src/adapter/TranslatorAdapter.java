package adapter;

/**
 * Apdapter điều phối từng Adaptees
 */
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
        japaneseAdaptee.receive(translateJapanese(words));
        englishAdaptee.receive(translateEnglish(words));
        chinaAdaptee.receive(translateChina(words));
    }

    private String translateJapanese(String vietnameseWords) {
        return vietnameseWords + " Translated To Japanese こんにちは";
    }

    private String translateEnglish(String vietnameseWords) {
        return vietnameseWords + " Translated To English ! Hello";
    }

    private String translateChina(String vietnameseWords) {
        return vietnameseWords + " Translated To China ! 你好";
    }
}
