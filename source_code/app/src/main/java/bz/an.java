package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;

/* loaded from: classes3.dex */
public final class an extends G3.a {
    public final androidx.compose.runtime.ax purple;
    public final androidx.compose.runtime.ax red;

    public an(Object obj) {
        super(6);
        this.purple = C0564b.zulu(obj);
        this.red = C0564b.zulu(obj);
    }

    @Override // G3.a
    public final Object L() {
        return ((t0) this.purple).getValue();
    }

    @Override // G3.a
    public final Object N() {
        return ((t0) this.red).getValue();
    }

    @Override // G3.a
    public final void Q(Object obj) {
        ((t0) this.purple).setValue(obj);
    }

    @Override // G3.a
    public final void R(a0 a0Var) {
    }

    @Override // G3.a
    public final void S() {
    }
}
