package n;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import k.C1990b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y.C3344D;

/* loaded from: classes3.dex */
public final class ad implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0.aj f12994a;
    public final /* synthetic */ P.d alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.s f12995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T.s f12996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T.s f12997d;
    public final /* synthetic */ T.s e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1990b f12998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C3344D f12999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f13000h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f13001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f13002j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.t f13003k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0.d f13004l;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ D0.an red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ c0 white;
    public final /* synthetic */ I0.aa yellow;

    public ad(P.d dVar, ax axVar, D0.an anVar, int i4, int i5, c0 c0Var, I0.aa aaVar, I0.aj ajVar, T.s sVar, T.s sVar2, T.s sVar3, T.s sVar4, C1990b c1990b, C3344D c3344d, boolean z2, boolean z10, Function1 function1, I0.t tVar, Q0.d dVar2) {
        this.alpha = dVar;
        this.purple = axVar;
        this.red = anVar;
        this.silver = i4;
        this.teal = i5;
        this.white = c0Var;
        this.yellow = aaVar;
        this.f12994a = ajVar;
        this.f12995b = sVar;
        this.f12996c = sVar2;
        this.f12997d = sVar3;
        this.e = sVar4;
        this.f12998f = c1990b;
        this.f12999g = c3344d;
        this.f13000h = z2;
        this.f13001i = z10;
        this.f13002j = function1;
        this.f13003k = tVar;
        this.f13004l = dVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            this.alpha.invoke(P.e.echo(-44346382, new ac(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f12994a, this.f12995b, this.f12996c, this.f12997d, this.e, this.f12998f, this.f12999g, this.f13000h, this.f13001i, this.f13002j, this.f13003k, this.f13004l), c0585q), c0585q, 6);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
