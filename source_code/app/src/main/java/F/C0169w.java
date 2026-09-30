package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0169w extends Lambda implements Xd.l {
    public final /* synthetic */ P.d alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1238d;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ float teal;
    public final /* synthetic */ androidx.compose.foundation.layout.G white;
    public final /* synthetic */ M2 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169w(P.d dVar, T.s sVar, P.d dVar2, P.d dVar3, float f5, androidx.compose.foundation.layout.G g2, M2 m22, int i4, int i5) {
        super(2);
        this.alpha = dVar;
        this.purple = sVar;
        this.red = dVar2;
        this.silver = dVar3;
        this.teal = f5;
        this.white = g2;
        this.yellow = m22;
        this.f1237c = i4;
        this.f1238d = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1237c | 1);
        M2 m22 = this.yellow;
        P.d dVar = this.alpha;
        P.d dVar2 = this.red;
        androidx.compose.foundation.layout.G g2 = this.white;
        ag.delta(dVar, this.purple, dVar2, this.silver, this.teal, g2, m22, (InterfaceC0581m) obj, cyan, this.f1238d);
        return Unit.INSTANCE;
    }
}
