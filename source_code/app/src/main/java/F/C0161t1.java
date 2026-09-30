package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import n.AbstractC2134i;

/* renamed from: F.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0161t1 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1186c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D0.an f1187d;
    public final /* synthetic */ n.aw e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n.av f1188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.aj f1192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1673j f1193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1194l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1195m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Xd.l f1196n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P.d f1197o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a0.as f1198p;
    public final /* synthetic */ Xd.l purple;
    public final /* synthetic */ Q0.d red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ C0143o2 teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ Function1 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161t1(T.s sVar, Xd.l lVar, Q0.d dVar, boolean z2, C0143o2 c0143o2, String str, Function1 function1, boolean z10, D0.an anVar, n.aw awVar, n.av avVar, boolean z11, int i4, int i5, I0.aj ajVar, InterfaceC1673j interfaceC1673j, Xd.l lVar2, Xd.l lVar3, Xd.l lVar4, P.d dVar2, a0.as asVar) {
        super(2);
        this.alpha = sVar;
        this.purple = lVar;
        this.red = dVar;
        this.silver = z2;
        this.teal = c0143o2;
        this.white = str;
        this.yellow = function1;
        this.f1186c = z10;
        this.f1187d = anVar;
        this.e = awVar;
        this.f1188f = avVar;
        this.f1189g = z11;
        this.f1190h = i4;
        this.f1191i = i5;
        this.f1192j = ajVar;
        this.f1193k = interfaceC1673j;
        this.f1194l = lVar2;
        this.f1195m = lVar3;
        this.f1196n = lVar4;
        this.f1197o = dVar2;
        this.f1198p = asVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        T.s sVar;
        long j5;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        if (this.purple != null) {
            sVar = AbstractC0538d.whiskey(new AppendedSemanticsElement(C0172x.yellow, true), 0.0f, this.red.quebec(AbstractC0174x1.bravo), 0.0f, 0.0f, 13);
        } else {
            sVar = T.p.alpha;
        }
        T.s then = this.alpha.then(sVar);
        String echo = androidx.compose.material3.internal.i.echo(interfaceC0581m, R.string.default_error_message);
        float f5 = androidx.compose.material3.internal.at.bravo;
        boolean z2 = this.silver;
        if (z2) {
            then = A0.o.bravo(then, false, new A0.q(echo, 26));
        }
        T.s alpha = androidx.compose.foundation.layout.V.alpha(then, C0150q1.charlie, C0150q1.bravo);
        C0143o2 c0143o2 = this.teal;
        if (z2) {
            j5 = c0143o2.juliet;
        } else {
            j5 = c0143o2.india;
        }
        a0.au auVar = new a0.au(j5);
        a0.as asVar = this.f1198p;
        String str = this.white;
        boolean z10 = this.f1186c;
        boolean z11 = this.f1189g;
        I0.aj ajVar = this.f1192j;
        InterfaceC1673j interfaceC1673j = this.f1193k;
        P.d echo2 = P.e.echo(1474611661, new C0157s1(str, z10, z11, ajVar, interfaceC1673j, this.silver, this.purple, this.f1194l, this.f1195m, this.f1196n, this.f1197o, c0143o2, asVar), interfaceC0581m);
        AbstractC2134i.alpha(str, this.yellow, alpha, z10, false, this.f1187d, this.e, this.f1188f, z11, this.f1190h, this.f1191i, ajVar, null, interfaceC1673j, auVar, echo2, interfaceC0581m, 0, 196608, 4096);
        return Unit.INSTANCE;
    }
}
