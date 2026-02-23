public class Main {
    public static void main(String[] args) {

        Pacient pacient=new PacientBuilder().setHasPatRabatabi(true).setHasMicDejun(true).build();

        System.out.println(pacient);
    }
}