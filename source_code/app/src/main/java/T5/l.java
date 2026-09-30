package T5;

/* loaded from: classes2.dex */
public final class l {
    public m alpha;
    public m bravo;
    public K1.f charlie;
    public boolean delta;
    public int echo;

    public final J2.c alpha() {
        boolean z2;
        boolean z10;
        boolean z11 = false;
        if (this.alpha != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        V5.x.alpha("Must set register function", z2);
        if (this.bravo != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        V5.x.alpha("Must set unregister function", z10);
        if (this.charlie != null) {
            z11 = true;
        }
        V5.x.alpha("Must set holder", z11);
        i iVar = (i) this.charlie.bravo;
        V5.x.india(iVar, "Key must not be null");
        return new J2.c(14, new o(this, this.charlie, this.delta, this.echo), new w.o(16, (Object) this, (Object) iVar, false));
    }
}
