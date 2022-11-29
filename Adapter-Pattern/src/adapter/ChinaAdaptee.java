package adapter;

public class ChinaAdaptee {
    /**
     * nhận messenger đã được chuyển đổi
     *
     * @param messenger messenger đầu vào
     */
    public void receive(String messenger) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(messenger);
    }

}
