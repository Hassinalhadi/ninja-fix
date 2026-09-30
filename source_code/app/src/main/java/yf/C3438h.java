package yf;

import kotlin.Unit;

/* renamed from: yf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3438h implements InterfaceC3439i {
    public static final C3438h purple = new C3438h(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C3438h(int i4) {
        this.alpha = i4;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            default:
                Object emit = interfaceC3440j.emit(EnumC3430C.alpha, cVar);
                if (emit != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return emit;
        }
    }
}
