package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ad extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P.d f1103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1104d;
    public final /* synthetic */ float e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.G f1105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M2 f1106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q2 f1107h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1108i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1109j;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ D0.an red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ P.d teal;
    public final /* synthetic */ D0.an white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(T.s sVar, P.d dVar, D0.an anVar, float f5, P.d dVar2, D0.an anVar2, P.d dVar3, P.d dVar4, float f10, float f11, androidx.compose.foundation.layout.G g2, M2 m22, Q2 q22, int i4, int i5) {
        super(2);
        this.alpha = sVar;
        this.purple = dVar;
        this.red = anVar;
        this.silver = f5;
        this.teal = dVar2;
        this.white = anVar2;
        this.yellow = dVar3;
        this.f1103c = dVar4;
        this.f1104d = f10;
        this.e = f11;
        this.f1105f = g2;
        this.f1106g = m22;
        this.f1107h = q22;
        this.f1108i = i4;
        this.f1109j = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f1108i | 1);
        int cyan2 = C0564b.cyan(this.f1109j);
        P.d dVar = this.purple;
        P.d dVar2 = this.teal;
        P.d dVar3 = this.yellow;
        P.d dVar4 = this.f1103c;
        androidx.compose.foundation.layout.G g2 = this.f1105f;
        M2 m22 = this.f1106g;
        ag.echo(this.alpha, dVar, this.red, this.silver, dVar2, this.white, dVar3, dVar4, this.f1104d, this.e, g2, m22, this.f1107h, (InterfaceC0581m) obj, cyan, cyan2);
        return Unit.INSTANCE;
    }
}
