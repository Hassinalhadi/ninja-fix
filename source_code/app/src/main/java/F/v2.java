package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import n.AbstractC2134i;

/* loaded from: classes3.dex */
public final class v2 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D0.an f1227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1228d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A8.a f1230g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1673j f1231h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P.d f1232i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P.d f1233j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1234k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1235l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.as f1236m;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ C0143o2 red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ Function1 teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(T.s sVar, boolean z2, C0143o2 c0143o2, String str, Function1 function1, boolean z10, boolean z11, D0.an anVar, boolean z12, int i4, int i5, A8.a aVar, InterfaceC1673j interfaceC1673j, P.d dVar, P.d dVar2, Xd.l lVar, Xd.l lVar2, a0.as asVar) {
        super(2);
        n.aw awVar = n.aw.delta;
        n.av avVar = n.av.bravo;
        this.alpha = sVar;
        this.purple = z2;
        this.red = c0143o2;
        this.silver = str;
        this.teal = function1;
        this.white = z10;
        this.yellow = z11;
        this.f1227c = anVar;
        this.f1228d = z12;
        this.e = i4;
        this.f1229f = i5;
        this.f1230g = aVar;
        this.f1231h = interfaceC1673j;
        this.f1232i = dVar;
        this.f1233j = dVar2;
        this.f1234k = lVar;
        this.f1235l = lVar2;
        this.f1236m = asVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        long j5;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        String echo = androidx.compose.material3.internal.i.echo(interfaceC0581m, R.string.default_error_message);
        float f5 = androidx.compose.material3.internal.at.bravo;
        T.s sVar = this.alpha;
        boolean z2 = this.purple;
        if (z2) {
            sVar = A0.o.bravo(sVar, false, new A0.q(echo, 26));
        }
        T.s alpha = androidx.compose.foundation.layout.V.alpha(sVar, C0162t2.charlie, C0162t2.bravo);
        C0143o2 c0143o2 = this.red;
        if (z2) {
            j5 = c0143o2.juliet;
        } else {
            j5 = c0143o2.india;
        }
        a0.au auVar = new a0.au(j5);
        a0.as asVar = this.f1236m;
        String str = this.silver;
        boolean z10 = this.white;
        boolean z11 = this.f1228d;
        A8.a aVar = this.f1230g;
        InterfaceC1673j interfaceC1673j = this.f1231h;
        P.d echo2 = P.e.echo(-288211827, new u2(str, z10, z11, aVar, interfaceC1673j, this.purple, this.f1232i, this.f1233j, this.f1234k, this.f1235l, asVar, c0143o2), interfaceC0581m);
        AbstractC2134i.alpha(str, this.teal, alpha, z10, this.yellow, this.f1227c, n.aw.delta, n.av.bravo, z11, this.e, this.f1229f, aVar, null, interfaceC1673j, auVar, echo2, interfaceC0581m, 0, 196608, 4096);
        return Unit.INSTANCE;
    }
}
