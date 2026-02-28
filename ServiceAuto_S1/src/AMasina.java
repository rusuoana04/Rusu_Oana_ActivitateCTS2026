public abstract class AMasina {
   protected String nrInmatriculare;

   public AMasina(String nrInmatriculare) {
      this.nrInmatriculare = nrInmatriculare;
   }

   public String getNrInmatriculare() {
      return nrInmatriculare;
   }

   public void setNrInmatriculare(String nrInmatriculare) {
      this.nrInmatriculare = nrInmatriculare;
   }
   public abstract String getTip();

}
