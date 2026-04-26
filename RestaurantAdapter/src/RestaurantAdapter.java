public class RestaurantAdapter extends SoftVechi {
    private SoftNou softNou;

    public RestaurantAdapter(SoftNou softNou) {
        this.softNou = softNou;
    }

    @Override
    public void printeazaFacturaVechi() {
       softNou.printeazaFacturaNou();
    }


}
