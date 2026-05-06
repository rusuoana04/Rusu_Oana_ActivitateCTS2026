public class CardFidelitate {
    private boolean card;

    public CardFidelitate(boolean card) {
        this.card = card;
    }

    public boolean verificareCard()
    {
        if(card==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
