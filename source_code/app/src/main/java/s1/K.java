package s1;

import android.view.WindowInsets;
import j1.AbstractC1932f;
import j1.C1929c;

/* loaded from: classes3.dex */
public class K extends O {
    public final WindowInsets.Builder charlie;

    public K() {
        this.charlie = AbstractC1932f.hotel();
    }

    @Override // s1.O
    public a0 bravo() {
        WindowInsets build;
        alpha();
        build = this.charlie.build();
        a0 hotel = a0.hotel(null, build);
        hotel.alpha.romeo(this.bravo);
        return hotel;
    }

    @Override // s1.O
    public void delta(C1929c c1929c) {
        this.charlie.setMandatorySystemGestureInsets(c1929c.delta());
    }

    @Override // s1.O
    public void echo(C1929c c1929c) {
        this.charlie.setStableInsets(c1929c.delta());
    }

    @Override // s1.O
    public void foxtrot(C1929c c1929c) {
        this.charlie.setSystemGestureInsets(c1929c.delta());
    }

    @Override // s1.O
    public void golf(C1929c c1929c) {
        this.charlie.setSystemWindowInsets(c1929c.delta());
    }

    @Override // s1.O
    public void hotel(C1929c c1929c) {
        this.charlie.setTappableElementInsets(c1929c.delta());
    }

    public K(a0 a0Var) {
        super(a0Var);
        WindowInsets.Builder hotel;
        WindowInsets golf = a0Var.golf();
        if (golf != null) {
            hotel = AbstractC1932f.india(golf);
        } else {
            hotel = AbstractC1932f.hotel();
        }
        this.charlie = hotel;
    }
}
