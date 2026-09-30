package androidx.compose.material3.internal;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class am extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Xd.l red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am(long j5, Xd.l lVar, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = j5;
        this.red = lVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                at.charlie(this.purple, this.red, interfaceC0581m, 0);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.bronze()) {
                        c0585q2.ochre();
                        return Unit.INSTANCE;
                    }
                }
                at.charlie(this.purple, this.red, interfaceC0581m2, 0);
                return Unit.INSTANCE;
        }
    }
}
