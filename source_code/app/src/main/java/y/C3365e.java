package y;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t0.AbstractC2901T;
import t0.C0;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3365e implements Xd.l {
    public final /* synthetic */ C0 alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ T.s silver;
    public final /* synthetic */ InterfaceC3372l teal;

    public C3365e(C0 c02, long j5, boolean z2, T.s sVar, InterfaceC3372l interfaceC3372l) {
        this.alpha = c02;
        this.purple = j5;
        this.red = z2;
        this.silver = sVar;
        this.teal = interfaceC3372l;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            C0564b.alpha(AbstractC2901T.sierra.alpha(this.alpha), P.e.echo(1260045569, new C3364d(this.purple, this.red, this.silver, this.teal), c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
