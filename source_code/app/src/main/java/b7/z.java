package b7;

/* loaded from: classes2.dex */
public final class z extends AbstractC0723e {
    public int oscar;
    public int papa;
    public boolean quebec;
    public int romeo;
    public Integer sierra;
    public int tango;
    public float uniform;
    public boolean victor;
    public boolean whiskey;

    @Override // b7.AbstractC0723e
    public final boolean charlie() {
        if (super.charlie() && echo() == alpha()) {
            return true;
        }
        return false;
    }

    @Override // b7.AbstractC0723e
    public final void delta() {
        super.delta();
        if (this.romeo >= 0) {
            if (this.oscar == 0) {
                if ((alpha() <= 0 && (!this.whiskey || echo() <= 0)) || this.india != 0) {
                    if (this.echo.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                    return;
                }
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            return;
        }
        throw new IllegalArgumentException("Stop indicator size must be >= 0.");
    }

    public final int echo() {
        if (!this.whiskey) {
            return alpha();
        }
        if (this.victor) {
            return (int) (this.alpha * this.uniform);
        }
        return this.tango;
    }
}
