package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0154r2 extends Lambda implements Xd.m {
    public final /* synthetic */ InterfaceC1673j alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ C0143o2 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154r2(C0143o2 c0143o2, InterfaceC1673j interfaceC1673j, boolean z2, boolean z10) {
        super(3);
        C0162t2 c0162t2 = C0162t2.alpha;
        C0162t2 c0162t22 = C0162t2.alpha;
        this.alpha = interfaceC1673j;
        this.purple = z2;
        this.red = z10;
        this.silver = c0143o2;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C0585q c0585q = (C0585q) ((InterfaceC0581m) obj2);
        c0585q.purple(-891038934);
        androidx.compose.runtime.ax delta = androidx.compose.material3.internal.at.delta(this.purple, this.red, ((Boolean) s6.J0.alpha(this.alpha, c0585q, 0).getValue()).booleanValue(), this.silver, C0162t2.echo, C0162t2.delta, c0585q, 0);
        T.p pVar = T.p.alpha;
        float f5 = z2.alpha;
        T.s charlie = androidx.compose.ui.draw.a.charlie(pVar, new y2(delta, 0));
        c0585q.quebec(false);
        return charlie;
    }
}
