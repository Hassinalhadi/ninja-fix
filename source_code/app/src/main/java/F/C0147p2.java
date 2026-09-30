package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0147p2 extends Lambda implements Xd.l {
    public final /* synthetic */ C0162t2 alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ InterfaceC1673j silver;
    public final /* synthetic */ C0143o2 teal;
    public final /* synthetic */ a0.as white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147p2(C0162t2 c0162t2, boolean z2, boolean z10, InterfaceC1673j interfaceC1673j, C0143o2 c0143o2, a0.as asVar, int i4) {
        super(2);
        C0162t2 c0162t22 = C0162t2.alpha;
        C0162t2 c0162t23 = C0162t2.alpha;
        this.alpha = c0162t2;
        this.purple = z2;
        this.red = z10;
        this.silver = interfaceC1673j;
        this.teal = c0143o2;
        this.white = asVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(114822145);
        C0162t2 c0162t2 = C0162t2.alpha;
        C0162t2 c0162t22 = C0162t2.alpha;
        this.alpha.alpha(this.purple, this.red, this.silver, this.teal, this.white, interfaceC0581m, cyan);
        return Unit.INSTANCE;
    }
}
