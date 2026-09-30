package Ce;

import cf.C0853i;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.an;
import qe.C2471g;
import qe.InterfaceC2472h;
import s6.A0;
import s6.AbstractC2826z0;

/* loaded from: classes2.dex */
public final class r extends se.ab {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ge.v[] f921g;

    /* renamed from: a, reason: collision with root package name */
    public final B9.ab f922a;

    /* renamed from: b, reason: collision with root package name */
    public final Me.f f923b;

    /* renamed from: c, reason: collision with root package name */
    public final ff.i f924c;

    /* renamed from: d, reason: collision with root package name */
    public final d f925d;
    public final ff.c e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2472h f926f;
    public final ve.aa yellow;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        f921g = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(r.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(r.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(B9.ab outerContext, ve.aa aaVar) {
        super(r0.oscar, aaVar.alpha);
        InterfaceC2472h bravo;
        Intrinsics.echo(outerContext, "outerContext");
        Be.a aVar = (Be.a) outerContext.purple;
        this.yellow = aaVar;
        B9.ab alpha = AbstractC2826z0.alpha(outerContext, this, null, 6);
        this.f922a = alpha;
        Intrinsics.echo((C0853i) aVar.delta.charlie().charlie, "<this>");
        this.f923b = Me.f.golf;
        Be.a aVar2 = (Be.a) alpha.purple;
        ff.l lVar = aVar2.alpha;
        this.f924c = lVar.bravo(new q(this, 0));
        this.f925d = new d(alpha, aaVar, this);
        q qVar = new q(this, 2);
        List emptyList = CollectionsKt.emptyList();
        lVar.getClass();
        if (emptyList != null) {
            this.e = new ff.c(lVar, qVar, emptyList);
            if (aVar2.victor.bravo) {
                bravo = C2471g.alpha;
            } else {
                bravo = A0.bravo(alpha, aaVar);
            }
            this.f926f = bravo;
            lVar.bravo(new q(this, 1));
            return;
        }
        ff.l.alpha(27);
        throw null;
    }

    @Override // se.ab, se.AbstractC2864n, pe.InterfaceC2336l
    public final an echo() {
        return new Aa.m(this);
    }

    @Override // G3.a, qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return this.f926f;
    }

    @Override // pe.InterfaceC2321ad
    public final Xe.n olive() {
        return this.f925d;
    }

    @Override // se.ab, se.AbstractC2863m
    public final String toString() {
        return "Lazy Java package fragment: " + this.teal + " of module " + ((Be.a) this.f922a.purple).oscar;
    }
}
