package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0166v extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.G f1218c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2 f1219d;
    public final /* synthetic */ int e;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ D0.an red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ P.d white;
    public final /* synthetic */ float yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166v(T.s sVar, P.d dVar, D0.an anVar, boolean z2, P.d dVar2, P.d dVar3, float f5, androidx.compose.foundation.layout.G g2, M2 m22, int i4) {
        super(2);
        this.alpha = sVar;
        this.purple = dVar;
        this.red = anVar;
        this.silver = z2;
        this.teal = dVar2;
        this.white = dVar3;
        this.yellow = f5;
        this.f1218c = g2;
        this.f1219d = m22;
        this.e = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.e | 1);
        P.d dVar = this.purple;
        P.d dVar2 = this.teal;
        M2 m22 = this.f1219d;
        ag.charlie(this.alpha, dVar, this.red, this.silver, dVar2, this.white, this.yellow, this.f1218c, m22, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
