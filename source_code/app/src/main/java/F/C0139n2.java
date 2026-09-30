package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0139n2 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ C0131l2 silver;
    public final /* synthetic */ InterfaceC1673j teal;
    public final /* synthetic */ a0.as white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0139n2(T.s sVar, boolean z2, boolean z10, C0131l2 c0131l2, InterfaceC1673j interfaceC1673j, a0.as asVar, int i4) {
        super(2);
        this.alpha = sVar;
        this.purple = z2;
        this.red = z10;
        this.silver = c0131l2;
        this.teal = interfaceC1673j;
        this.white = asVar;
        this.yellow = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.yellow | 1);
        boolean z2 = this.red;
        C0131l2 c0131l2 = this.silver;
        androidx.compose.material3.a.bravo(this.alpha, this.purple, z2, c0131l2, this.teal, this.white, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
