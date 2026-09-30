package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.t0;

/* loaded from: classes3.dex */
public final class ag implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public long f3455a;
    public Number alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aj f3456b;
    public Number purple;
    public final g0 red;
    public final androidx.compose.runtime.ax silver;
    public Q teal;
    public boolean white;
    public boolean yellow;

    public ag(aj ajVar, Number number, Number number2, g0 g0Var, ae aeVar) {
        this.f3456b = ajVar;
        this.alpha = number;
        this.purple = number2;
        this.red = g0Var;
        this.silver = C0564b.zulu(number);
        this.teal = new Q(aeVar, g0Var, this.alpha, this.purple, null);
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return ((t0) this.silver).getValue();
    }
}
