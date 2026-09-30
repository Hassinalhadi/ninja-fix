package w;

import A0.ac;
import A0.ad;
import A0.x;
import D0.ae;
import D0.am;
import I0.aa;
import I0.ag;
import I0.ah;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import n.C2146v;
import n.ax;
import s0.AbstractC2556p;
import s0.e0;
import y.C3344D;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3230h extends AbstractC2556p implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14002a;

    /* renamed from: b, reason: collision with root package name */
    public I0.t f14003b;

    /* renamed from: c, reason: collision with root package name */
    public C3344D f14004c;

    /* renamed from: d, reason: collision with root package name */
    public I0.l f14005d;
    public Y.s e;
    public ah red;
    public aa silver;
    public ax teal;
    public boolean white;
    public boolean yellow;

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(ax axVar, String str, boolean z2, boolean z10) {
        if (!z2 && z10) {
            ag agVar = axVar.echo;
            C2146v c2146v = axVar.victor;
            if (agVar != null) {
                aa alpha = axVar.delta.alpha(CollectionsKt.listOf(new Object(), new I0.a(str, 1)));
                agVar.alpha(null, alpha);
                c2146v.invoke(alpha);
            } else {
                int length = str.length();
                c2146v.invoke(new aa(4, ae.bravo(length, length), str));
            }
        }
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    @Override // s0.e0
    public final void india(ad adVar) {
        boolean z2 = false;
        D0.g gVar = this.silver.alpha;
        ge.v[] vVarArr = A0.aa.alpha;
        ac acVar = x.black;
        ge.v[] vVarArr2 = A0.aa.alpha;
        ge.v vVar = vVarArr2[17];
        acVar.alpha(adVar, gVar);
        D0.g gVar2 = this.red.alpha;
        ac acVar2 = x.blue;
        ge.v vVar2 = vVarArr2[18];
        acVar2.alpha(adVar, gVar2);
        long j5 = this.silver.bravo;
        ac acVar3 = x.bronze;
        ge.v vVar3 = vVarArr2[19];
        acVar3.alpha(adVar, new am(j5));
        U.d dVar = U.l.alpha;
        ac acVar4 = x.romeo;
        ge.v vVar4 = vVarArr2[9];
        acVar4.alpha(adVar, dVar);
        C3229g c3229g = new C3229g(this, 0);
        ac acVar5 = A0.j.golf;
        A0.a aVar = new A0.a(null, c3229g);
        A0.k kVar = (A0.k) adVar;
        kVar.hotel(acVar5, aVar);
        if (!this.yellow) {
            kVar.hotel(x.india, Unit.INSTANCE);
        }
        boolean z10 = this.f14002a;
        if (z10) {
            kVar.hotel(x.emerald, Unit.INSTANCE);
        }
        if (this.yellow && !this.white) {
            z2 = true;
        }
        ac acVar6 = x.gray;
        ge.v vVar5 = vVarArr2[25];
        acVar6.alpha(adVar, Boolean.valueOf(z2));
        A0.aa.alpha(adVar, new C3229g(this, 1));
        if (z2) {
            kVar.hotel(A0.j.juliet, new A0.a(null, new C3229g(this, 2)));
            kVar.hotel(A0.j.november, new A0.a(null, new C3229g(this, adVar)));
        }
        kVar.hotel(A0.j.india, new A0.a(null, new Cb.d(22, this)));
        int i4 = this.f14005d.echo;
        C3228f c3228f = new C3228f(this, 6);
        kVar.hotel(x.coral, new I0.k(i4));
        kVar.hotel(A0.j.oscar, new A0.a(null, c3228f));
        kVar.hotel(A0.j.bravo, new A0.a(null, new C3228f(this, 7)));
        kVar.hotel(A0.j.charlie, new A0.a(null, new C3228f(this, 1)));
        if (!am.charlie(this.silver.bravo) && !z10) {
            kVar.hotel(A0.j.papa, new A0.a(null, new C3228f(this, 2)));
            if (this.yellow && !this.white) {
                kVar.hotel(A0.j.quebec, new A0.a(null, new C3228f(this, 3)));
            }
        }
        if (this.yellow && !this.white) {
            kVar.hotel(A0.j.romeo, new A0.a(null, new C3228f(this, 5)));
        }
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final boolean yellow() {
        return true;
    }
}
