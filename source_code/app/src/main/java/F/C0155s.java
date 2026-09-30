package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0155s extends Lambda implements Xd.l {
    public final /* synthetic */ P.d alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f1179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q2 f1180d;
    public final /* synthetic */ int e;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ float teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ androidx.compose.foundation.layout.G yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155s(P.d dVar, T.p pVar, P.d dVar2, P.d dVar3, float f5, float f10, androidx.compose.foundation.layout.G g2, M2 m22, Q2 q22, int i4) {
        super(2);
        this.alpha = dVar;
        this.purple = pVar;
        this.red = dVar2;
        this.silver = dVar3;
        this.teal = f5;
        this.white = f10;
        this.yellow = g2;
        this.f1179c = m22;
        this.f1180d = q22;
        this.e = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.e | 1);
        P.d dVar = this.alpha;
        P.d dVar2 = this.red;
        P.d dVar3 = this.silver;
        float f5 = this.white;
        androidx.compose.foundation.layout.G g2 = this.yellow;
        ag.bravo(dVar, this.purple, dVar2, dVar3, this.teal, f5, g2, this.f1179c, this.f1180d, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
