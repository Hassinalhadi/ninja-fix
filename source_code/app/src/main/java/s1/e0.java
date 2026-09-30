package s1;

/* loaded from: classes3.dex */
public final class e0 extends d0 {
    @Override // s1.d0, t6.ab
    public final boolean bravo() {
        int systemBarsAppearance;
        systemBarsAppearance = this.alpha.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // s1.d0, t6.ab
    public final void foxtrot() {
        this.alpha.setSystemBarsBehavior(2);
    }
}
