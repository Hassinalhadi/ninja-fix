package n;

import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import k.C1990b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2911e0;
import t0.C2932p;
import t6.AbstractC3061t3;
import t6.AbstractC3087z;
import y.C3344D;

/* loaded from: classes3.dex */
public final class ac implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T.s f12984a;
    public final /* synthetic */ ax alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.s f12985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T.s f12986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T.s f12987d;
    public final /* synthetic */ C1990b e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3344D f12988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f12989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f12991i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.t f12992j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q0.d f12993k;
    public final /* synthetic */ D0.an purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ c0 teal;
    public final /* synthetic */ I0.aa white;
    public final /* synthetic */ I0.aj yellow;

    public ac(ax axVar, D0.an anVar, int i4, int i5, c0 c0Var, I0.aa aaVar, I0.aj ajVar, T.s sVar, T.s sVar2, T.s sVar3, T.s sVar4, C1990b c1990b, C3344D c3344d, boolean z2, boolean z10, Function1 function1, I0.t tVar, Q0.d dVar) {
        this.alpha = axVar;
        this.purple = anVar;
        this.red = i4;
        this.silver = i5;
        this.teal = c0Var;
        this.white = aaVar;
        this.yellow = ajVar;
        this.f12984a = sVar;
        this.f12985b = sVar2;
        this.f12986c = sVar3;
        this.f12987d = sVar4;
        this.e = c1990b;
        this.f12988f = c3344d;
        this.f12989g = z2;
        this.f12990h = z10;
        this.f12991i = function1;
        this.f12992j = tVar;
        this.f12993k = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        T.s l0Var;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            T.p pVar = T.p.alpha;
            ax axVar = this.alpha;
            T.s golf = androidx.compose.foundation.layout.V.golf(pVar, ((Q0.g) ((t0) axVar.golf).getValue()).alpha, 0.0f, 2);
            C2932p c2932p = AbstractC2911e0.alpha;
            int i4 = this.red;
            int i5 = this.silver;
            D0.an anVar = this.purple;
            T.s alpha = T.a.alpha(golf, c2932p, new an(i4, i5, anVar));
            boolean india = c0585q.india(axVar);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new kotlin.collections.n(6, axVar);
                c0585q.f(jade);
            }
            Function0 function0 = (Function0) jade;
            c0 c0Var = this.teal;
            d.K k6 = (d.K) ((t0) c0Var.foxtrot).getValue();
            I0.aa aaVar = this.white;
            int i10 = D0.am.charlie;
            long j5 = aaVar.bravo;
            int i11 = (int) (j5 >> 32);
            long j6 = c0Var.echo;
            if (i11 == ((int) (j6 >> 32)) && (i11 = (int) (j5 & 4294967295L)) == ((int) (j6 & 4294967295L))) {
                i11 = D0.am.foxtrot(j5);
            }
            c0Var.echo = j5;
            I0.ah alpha2 = k0.alpha(this.yellow, aaVar.alpha);
            int ordinal = k6.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    l0Var = new ao(c0Var, i11, alpha2, function0);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                l0Var = new l0(c0Var, i11, alpha2, function0);
            }
            AbstractC3061t3.alpha(androidx.compose.foundation.relocation.a.alpha(T.a.alpha(AbstractC3087z.bravo(alpha).then(l0Var).then(this.f12984a).then(this.f12985b), c2932p, new androidx.compose.foundation.layout.c0(2, anVar)).then(this.f12986c).then(this.f12987d), this.e), P.e.echo(1412697320, new ab(this.f12988f, axVar, this.f12989g, this.f12990h, this.f12991i, aaVar, this.f12992j, this.f12993k, this.silver), c0585q), c0585q, 48);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
