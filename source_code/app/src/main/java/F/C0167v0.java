package F;

import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0167v0 extends Lambda implements Xd.l {
    public final /* synthetic */ C0156s0 alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ P.d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167v0(C0156s0 c0156s0, boolean z2, P.d dVar) {
        super(2);
        this.alpha = c0156s0;
        this.purple = z2;
        this.red = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        long j5;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.purple(1264683960);
        c0585q2.quebec(false);
        androidx.compose.runtime.aa aaVar = Y.alpha;
        boolean z2 = this.purple;
        C0156s0 c0156s0 = this.alpha;
        if (z2) {
            j5 = c0156s0.alpha;
        } else {
            j5 = c0156s0.delta;
        }
        C0564b.alpha(aaVar.alpha(new C0366t(j5)), P.e.echo(-1728894036, new C0096d(this.red, 5, (byte) 0), c0585q2), c0585q2, 56);
        return Unit.INSTANCE;
    }
}
