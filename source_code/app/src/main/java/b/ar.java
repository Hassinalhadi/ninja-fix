package b;

import B9.C0058p;
import Yb.C0331t0;
import a2.C0393r;
import f.C1667d;
import f.C1668e;
import f.C1674k;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s0.InterfaceC2559t;
import s0.j0;

/* loaded from: classes3.dex */
public final class ar extends AbstractC2556p implements s0.e0, InterfaceC2559t, InterfaceC2553m, s0.P, j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final S f3298b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Y.y f3299a;
    public InterfaceC1673j red;
    public final C0331t0 silver;
    public C1667d teal;
    public androidx.compose.foundation.lazy.layout.ad white;
    public s0.L yellow;

    public ar(InterfaceC1673j interfaceC1673j, int i4, C0331t0 c0331t0) {
        this.red = interfaceC1673j;
        this.silver = c0331t0;
        Y.aa aaVar = new Y.aa(i4, new Pf.n(2, this, ar.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 4);
        b(aaVar);
        this.f3299a = aaVar;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    public final void e(InterfaceC1673j interfaceC1673j, InterfaceC1672i interfaceC1672i) {
        vf.aq aqVar;
        if (isAttached()) {
            vf.I i4 = (vf.I) getCoroutineScope().charlie().get(vf.H.alpha);
            if (i4 != null) {
                aqVar = i4.crimson(new C0393r(14, interfaceC1673j, interfaceC1672i));
            } else {
                aqVar = null;
            }
            vf.ad.zulu(getCoroutineScope(), null, null, new ap(interfaceC1673j, interfaceC1672i, aqVar, null), 3);
            return;
        }
        ((C1674k) interfaceC1673j).bravo(interfaceC1672i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final as f() {
        j0 j0Var;
        C0058p c0058p;
        if (isAttached()) {
            S s3 = as.purple;
            if (!getNode().isAttached()) {
                AbstractC2264a.bravo("visitAncestors called on an unattached node");
            }
            T.r parent$ui_release = getNode().getParent$ui_release();
            s0.al golf = AbstractC2555o.golf(this);
            loop0: while (true) {
                if (golf != null) {
                    if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                                ?? r62 = 0;
                                AbstractC2556p abstractC2556p = parent$ui_release;
                                while (abstractC2556p != 0) {
                                    if (abstractC2556p instanceof j0) {
                                        j0Var = (j0) abstractC2556p;
                                        if (Intrinsics.areEqual(s3, j0Var.golf())) {
                                            break loop0;
                                        }
                                    } else if ((abstractC2556p.getKindSet$ui_release() & 262144) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                        T.r rVar = abstractC2556p.purple;
                                        int i4 = 0;
                                        abstractC2556p = abstractC2556p;
                                        r62 = r62;
                                        while (rVar != null) {
                                            if ((rVar.getKindSet$ui_release() & 262144) != 0) {
                                                i4++;
                                                r62 = r62;
                                                if (i4 == 1) {
                                                    abstractC2556p = rVar;
                                                } else {
                                                    if (r62 == 0) {
                                                        r62 = new J.e(new T.r[16]);
                                                    }
                                                    if (abstractC2556p != 0) {
                                                        r62.bravo(abstractC2556p);
                                                        abstractC2556p = 0;
                                                    }
                                                    r62.bravo(rVar);
                                                }
                                            }
                                            rVar = rVar.getChild$ui_release();
                                            abstractC2556p = abstractC2556p;
                                            r62 = r62;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    abstractC2556p = AbstractC2555o.bravo(r62);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    golf = golf.victor();
                    if (golf != null && (c0058p = golf.f13305x) != null) {
                        parent$ui_release = (s0.g0) c0058p.golf;
                    } else {
                        parent$ui_release = null;
                    }
                } else {
                    j0Var = null;
                    break;
                }
            }
            if (j0Var instanceof as) {
                return (as) j0Var;
            }
        }
        return null;
    }

    public final void g(InterfaceC1673j interfaceC1673j) {
        C1667d c1667d;
        if (!Intrinsics.areEqual(this.red, interfaceC1673j)) {
            InterfaceC1673j interfaceC1673j2 = this.red;
            if (interfaceC1673j2 != null && (c1667d = this.teal) != null) {
                ((C1674k) interfaceC1673j2).bravo(new C1668e(c1667d));
            }
            this.teal = null;
            this.red = interfaceC1673j;
        }
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.j0
    public final Object golf() {
        return f3298b;
    }

    @Override // s0.InterfaceC2559t
    public final void hotel(s0.L l10) {
        as f5;
        this.yellow = l10;
        if (((Y.aa) this.f3299a).d().bravo()) {
            if (l10.india()) {
                s0.L l11 = this.yellow;
                if (l11 != null) {
                    Intrinsics.checkNotNull(l11);
                    if (l11.india() && (f5 = f()) != null) {
                        f5.b(this.yellow);
                        return;
                    }
                    return;
                }
                return;
            }
            as f10 = f();
            if (f10 != null) {
                f10.b(null);
            }
        }
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        boolean bravo = ((Y.aa) this.f3299a).d().bravo();
        ge.v[] vVarArr = A0.aa.alpha;
        A0.ac acVar = A0.x.kilo;
        ge.v vVar = A0.aa.alpha[4];
        acVar.alpha(adVar, Boolean.valueOf(bravo));
        A0.k kVar = (A0.k) adVar;
        kVar.hotel(A0.j.victor, new A0.a(null, new P7.c(0, this, ar.class, "requestFocus", "requestFocus()Z", 0, 6)));
    }

    @Override // s0.P
    public final void magenta() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC2557q.november(this, new Yb.F(9, objectRef, this));
        androidx.compose.foundation.lazy.layout.ad adVar = (androidx.compose.foundation.lazy.layout.ad) objectRef.alpha;
        if (((Y.aa) this.f3299a).d().bravo()) {
            androidx.compose.foundation.lazy.layout.ad adVar2 = this.white;
            if (adVar2 != null) {
                adVar2.bravo();
            }
            if (adVar != null) {
                adVar.alpha();
            } else {
                adVar = null;
            }
            this.white = adVar;
        }
    }

    @Override // T.r
    public final void onReset() {
        androidx.compose.foundation.lazy.layout.ad adVar = this.white;
        if (adVar != null) {
            adVar.bravo();
        }
        this.white = null;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yankee() {
        return false;
    }

    @Override // s0.e0
    public final /* synthetic */ boolean yellow() {
        return false;
    }
}
