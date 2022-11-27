package adapter;

public class ChinaAdaptee {
    /**
     * nhận messenger và chuyển đổi data
     *
     * @param words messenger đầu vào
     */
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(translateChina(words));
    }

    private String translateChina(String vietnameseWords) {
        return vietnameseWords + " Translated To China ! 你好";
    }
}
