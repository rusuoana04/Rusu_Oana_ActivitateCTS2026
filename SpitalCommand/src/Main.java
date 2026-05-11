public class Main {
    public static void main(String[] args) {

        Operator operator=new Operator();
        Pacient pacient=new Pacient("Ion Ionel");
        Pacient pacient1=new Pacient("Georgescu Georgel");

        Triaj medic=new Medic("Ionescu Gigel");
        Command comandaTratare=new ComandaTratare(medic,pacient);
        CommandInternare commandInternare=new CommandInternare(medic, pacient1);

        operator.invoca(comandaTratare);
        operator.invoca(commandInternare);

    }
}