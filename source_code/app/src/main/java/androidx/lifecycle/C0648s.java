package androidx.lifecycle;

import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0648s implements InterfaceC3440j {
    public final /* synthetic */ aw alpha;

    public C0648s(aw awVar) {
        this.alpha = awVar;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        aw awVar = this.alpha;
        awVar.getClass();
        Object blue = vf.ad.blue(awVar.bravo, new av(awVar, obj, null), cVar);
        Od.a aVar = Od.a.alpha;
        if (blue != aVar) {
            blue = Unit.INSTANCE;
        }
        if (blue == aVar) {
            return blue;
        }
        return Unit.INSTANCE;
    }
}
