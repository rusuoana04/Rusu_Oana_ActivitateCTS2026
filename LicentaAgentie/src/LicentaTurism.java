public class LicentaTurism implements AbstractTurismLicence{
    private  static  LicentaTurism instance=null;
    private Integer licenceNumber;

    private LicentaTurism()
    {

    }

    private LicentaTurism(Integer licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public static synchronized LicentaTurism getInstance()
    {
        if (instance==null)
        {
            instance=new LicentaTurism();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LicentaTurism{" +
                "licenceNumber=" + licenceNumber +
                '}';
    }

    @Override
    public void setLicenceNumber(int licenceNumber) throws Exception {
        if(this.licenceNumber!=null)
        {
            throw new Exception("Eroare nu se poate modifica licence number");
        }
        else
        {
            this.licenceNumber=licenceNumber;
        }

    }
}
