package adapter;

public class JapaneseAdaptee {
    /**
     * nhận messenger và chuyển đổi data
     *
     * @param words messenger đầu vào
     */
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(translateJapanese(words));
    }

    private String translateJapanese(String vietnameseWords) {
        return vietnameseWords + " Translated To Japanese こんにちは";
    }
}
