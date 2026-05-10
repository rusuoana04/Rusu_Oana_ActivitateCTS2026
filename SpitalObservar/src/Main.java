public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Ion");
        Pacient pacient1=new Pacient("Gigel");


        Spital spital=new Spital("Spital 1");


        spital.adaugaObserver(pacient);
        spital.adaugaObserver(pacient1);
        spital.notificareVirus();




    }
}