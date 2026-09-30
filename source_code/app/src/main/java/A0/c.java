package A0;

import kotlin.jvm.functions.Function1;
import s0.e0;

/* loaded from: classes3.dex */
public final class c extends T.r implements e0 {
    public boolean alpha;
    public final boolean purple;
    public Function1 red;

    public c(boolean z2, boolean z10, Function1 function1) {
        this.alpha = z2;
        this.purple = z10;
        this.red = function1;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // s0.e0
    public final void india(ad adVar) {
        this.red.invoke(adVar);
    }

    @Override // s0.e0
    public final boolean yankee() {
        return this.purple;
    }

    @Override // s0.e0
    public final boolean yellow() {
        return this.alpha;
    }
}
