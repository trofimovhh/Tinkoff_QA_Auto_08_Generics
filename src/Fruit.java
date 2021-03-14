public class Fruit {
    private boolean fresh = true;

    public final boolean isFresh() {
        return fresh;
    }

    public final void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }

    public final Fruit getIfFresh() {
        if (this != null && this.isFresh()) {
            return this;
        } else {
            return null;

        }
    }
}