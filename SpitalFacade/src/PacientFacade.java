public class PacientFacade {
    public void  verificaPacient(StarePacient starePacient, String numePacient, int nrPat)
    {
        Pacient pacient=new Pacient(StarePacient.grava);
        ConfirmareInternare confirmareInternare=new ConfirmareInternare(numePacient);
        Salon salon=new Salon(nrPat);
        System.out.println("Stare pacient este grava? "+pacient.verificaStare());
        System.out.println("Medicul confirma internarea? "+confirmareInternare.verificaConfirmareInternare(numePacient));
        System.out.println("Patul este disponibil? "+ salon.verificaPat());

        if(pacient.verificaStare()&&confirmareInternare.verificaConfirmareInternare(numePacient)&& salon.verificaPat()==true)
        {
            System.out.println("Pacientul trebuie internat " );
        }
        else
        {
            System.out.println("Pacientul nu necesita internare");
        }
    }
}
