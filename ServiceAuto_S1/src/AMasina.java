public abstract class AMasina {
   protected String NrInmatriculare;

   public AMasina(String nrInmatriculare) {
      NrInmatriculare = nrInmatriculare;
   }

   public String getNrInmatriculare() {
      return NrInmatriculare;
   }

   public void setNrInmatriculare(String nrInmatriculare) {
      NrInmatriculare = nrInmatriculare;
   }
   public  abstract String getTip();
}
