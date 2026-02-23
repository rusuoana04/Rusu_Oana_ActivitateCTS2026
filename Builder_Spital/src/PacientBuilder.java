public class PacientBuilder implements Builder{
    public Pacient pacient;

    public PacientBuilder()
    {
        pacient=new Pacient(false,false,false,false);
    }


    @Override
    public Pacient build() {
        return pacient;
    }

    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil)
    {
        this.pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }
    public PacientBuilder setHasMicDejun(boolean hasMicDejun)
    {
        this.pacient.setHasMicDejun(hasMicDejun);
        return  this;
    }

    public PacientBuilder setHasPapuciCamera(boolean hasPapuciCamera)
    {
        this.pacient.setHasPapuciCamera(hasPapuciCamera);
        return this;
    }

    public PacientBuilder setHasHalatInterior(boolean hasHalatInterior)
    {
        this.pacient.setHasHalatInterior(hasHalatInterior);
        return this;
    }
}
