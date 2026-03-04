

public class Main {
    public static void main(String[] args) {
        ContClient contClient= new ContClientBuilder().setHasCardAtasat(true).build();
        System.out.println(contClient);
    }
}