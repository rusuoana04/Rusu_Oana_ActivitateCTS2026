

public abstract class AbstractAutoWashOptions implements ISpalatorie{
        private ISpalatorie spalatorie;

    public AbstractAutoWashOptions(ISpalatorie spalatorie) {
        this.spalatorie = spalatorie;
    }

    @Override
    public void pornireSpalare() {
        spalatorie.pornireSpalare();
    }

    public  abstract void spalarePerii();
    public abstract void spalareSasiu();
    public abstract void spalareApaDedurizata();
}
