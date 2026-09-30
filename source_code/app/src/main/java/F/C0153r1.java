package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0153r1 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ InterfaceC1673j silver;
    public final /* synthetic */ C0143o2 teal;
    public final /* synthetic */ a0.as white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0153r1(boolean z2, boolean z10, InterfaceC1673j interfaceC1673j, C0143o2 c0143o2, a0.as asVar, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = z2;
        this.red = z10;
        this.silver = interfaceC1673j;
        this.teal = c0143o2;
        this.white = asVar;
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
                C0150q1.alpha.alpha(this.purple, this.red, this.silver, null, this.teal, this.white, 0.0f, 0.0f, interfaceC0581m, 100663296, 200);
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
                C0162t2 c0162t2 = C0162t2.alpha;
                C0143o2 c0143o2 = this.teal;
                c0162t2.alpha(this.purple, this.red, this.silver, c0143o2, this.white, interfaceC0581m2, 114822144);
                return Unit.INSTANCE;
        }
    }
}
