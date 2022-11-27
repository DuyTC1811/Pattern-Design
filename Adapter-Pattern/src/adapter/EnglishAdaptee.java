package adapter;

public class EnglishAdaptee {
    /**
     * nhận messenger và chuyển đổi data
     *
     * @param words messenger đầu vào
     */
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(translateEnglish(words));
    }

    private String translateEnglish(String vietnameseWords) {
        return vietnameseWords + " Translated To English ! Hello";
    }
}
