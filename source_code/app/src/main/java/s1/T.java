package s1;

import android.graphics.Insets;
import android.view.WindowInsets;
import j1.C1929c;

/* loaded from: classes3.dex */
public class T extends S {
    public C1929c oscar;
    public C1929c papa;
    public C1929c quebec;

    public T(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
        this.oscar = null;
        this.papa = null;
        this.quebec = null;
    }

    @Override // s1.X
    public C1929c india() {
        Insets mandatorySystemGestureInsets;
        if (this.papa == null) {
            mandatorySystemGestureInsets = this.charlie.getMandatorySystemGestureInsets();
            this.papa = C1929c.charlie(mandatorySystemGestureInsets);
        }
        return this.papa;
    }

    @Override // s1.X
    public C1929c kilo() {
        Insets systemGestureInsets;
        if (this.oscar == null) {
            systemGestureInsets = this.charlie.getSystemGestureInsets();
            this.oscar = C1929c.charlie(systemGestureInsets);
        }
        return this.oscar;
    }

    @Override // s1.X
    public C1929c mike() {
        Insets tappableElementInsets;
        if (this.quebec == null) {
            tappableElementInsets = this.charlie.getTappableElementInsets();
            this.quebec = C1929c.charlie(tappableElementInsets);
        }
        return this.quebec;
    }

    @Override // s1.P, s1.X
    public a0 november(int i4, int i5, int i10, int i11) {
        WindowInsets inset;
        inset = this.charlie.inset(i4, i5, i10, i11);
        return a0.hotel(null, inset);
    }

    @Override // s1.Q, s1.X
    public void uniform(C1929c c1929c) {
    }

    public T(a0 a0Var, T t5) {
        super(a0Var, t5);
        this.oscar = null;
        this.papa = null;
        this.quebec = null;
    }
}
