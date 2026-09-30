package Y;

import B9.C0058p;
import android.os.Trace;
import androidx.compose.runtime.t0;
import com.google.mlkit.vision.barcode.common.Barcode;
import j0.C1926a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;
import pe.AbstractC2327c;
import r0.C2480b;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;
import s0.P;
import s0.al;
import s0.g0;
import s6.J7;
import t0.AbstractC2901T;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class aa extends T.r implements InterfaceC2553m, y, P, r0.e {
    public final Xd.l alpha;
    public boolean purple;
    public boolean red;
    public final int silver;

    public aa(int i4, Pf.n nVar, int i5) {
        i4 = (i5 & 1) != 0 ? 1 : i4;
        this.alpha = (i5 & 2) != 0 ? null : nVar;
        this.silver = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public final void b(x xVar, x xVar2) {
        C0058p c0058p;
        Xd.l lVar;
        n nVar = (n) ((C2946x) AbstractC2555o.hotel(this)).getFocusOwner();
        aa aaVar = nVar.hotel;
        if (!Intrinsics.areEqual(xVar, xVar2) && (lVar = this.alpha) != null) {
            lVar.invoke(xVar, xVar2);
        }
        T.r node = getNode();
        if (!getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r node2 = getNode();
        al golf = AbstractC2555o.golf(this);
        while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & 5120) != 0) {
                        if (node2 == node || (node2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                            if ((node2.getKindSet$ui_release() & 4096) != 0) {
                                AbstractC2556p abstractC2556p = node2;
                                ?? r62 = 0;
                                while (abstractC2556p != 0) {
                                    if (abstractC2556p instanceof e) {
                                        e eVar = (e) abstractC2556p;
                                        if (aaVar == nVar.hotel) {
                                            eVar.a(xVar2);
                                        }
                                    } else if ((abstractC2556p.getKindSet$ui_release() & 4096) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                        T.r rVar = abstractC2556p.purple;
                                        int i4 = 0;
                                        abstractC2556p = abstractC2556p;
                                        r62 = r62;
                                        while (rVar != null) {
                                            if ((rVar.getKindSet$ui_release() & 4096) != 0) {
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
                        } else {
                            return;
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                node2 = (g0) c0058p.golf;
            } else {
                node2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Y.o, Y.q] */
    /* JADX WARN: Type inference failed for: r6v10, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v11, types: [Y.r] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final q c() {
        boolean z2;
        boolean z10;
        C0058p c0058p;
        ?? obj = new Object();
        obj.alpha = true;
        s sVar = s.bravo;
        obj.bravo = sVar;
        obj.charlie = sVar;
        obj.delta = sVar;
        obj.echo = sVar;
        obj.foxtrot = sVar;
        obj.golf = sVar;
        obj.hotel = sVar;
        obj.india = sVar;
        obj.juliet = p.purple;
        obj.kilo = p.red;
        int i4 = this.silver;
        if (i4 == 1) {
            z2 = true;
        } else if (i4 == 0) {
            if (((C1926a) ((t0) ((j0.c) ((j0.b) AbstractC2557q.echo(this, AbstractC2901T.mike))).alpha).getValue()).alpha == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            z2 = !z10;
        } else if (i4 == 2) {
            z2 = false;
        } else {
            throw new IllegalStateException("Unknown Focusability");
        }
        obj.alpha = z2;
        T.r node = getNode();
        if (!getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r node2 = getNode();
        al golf = AbstractC2555o.golf(this);
        loop0: while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 3072) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & 3072) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet$ui_release() & 2048) != 0) {
                            AbstractC2556p abstractC2556p = node2;
                            ?? r82 = 0;
                            while (abstractC2556p != 0) {
                                if (abstractC2556p instanceof r) {
                                    ((r) abstractC2556p).romeo(obj);
                                } else if ((abstractC2556p.getKindSet$ui_release() & 2048) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                    T.r rVar = abstractC2556p.purple;
                                    int i5 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r82 = r82;
                                    while (rVar != null) {
                                        if ((rVar.getKindSet$ui_release() & 2048) != 0) {
                                            i5++;
                                            r82 = r82;
                                            if (i5 == 1) {
                                                abstractC2556p = rVar;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new J.e(new T.r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r82.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r82.bravo(rVar);
                                            }
                                        }
                                        rVar = rVar.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r82 = r82;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2556p = AbstractC2555o.bravo(r82);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                node2 = (g0) c0058p.golf;
            } else {
                node2 = null;
            }
        }
        return obj;
    }

    @Override // r0.f
    public final /* synthetic */ Object coral(r0.g gVar) {
        return AbstractC2327c.alpha(this, gVar);
    }

    public final x d() {
        C0058p c0058p;
        if (!isAttached()) {
            return x.silver;
        }
        n nVar = (n) ((C2946x) AbstractC2555o.hotel(this)).getFocusOwner();
        aa aaVar = nVar.hotel;
        if (aaVar == null) {
            return x.silver;
        }
        if (this == aaVar) {
            nVar.getClass();
            return x.alpha;
        }
        if (aaVar.isAttached()) {
            if (!aaVar.getNode().isAttached()) {
                AbstractC2264a.bravo("visitAncestors called on an unattached node");
            }
            T.r parent$ui_release = aaVar.getNode().getParent$ui_release();
            al golf = AbstractC2555o.golf(aaVar);
            while (golf != null) {
                if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            T.r rVar = parent$ui_release;
                            J.e eVar = null;
                            while (rVar != null) {
                                if (rVar instanceof aa) {
                                    if (this == ((aa) rVar)) {
                                        return x.purple;
                                    }
                                } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                    int i4 = 0;
                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                rVar = rVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new J.e(new T.r[16]);
                                                }
                                                if (rVar != null) {
                                                    eVar.bravo(rVar);
                                                    rVar = null;
                                                }
                                                eVar.bravo(rVar2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                rVar = AbstractC2555o.bravo(eVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                golf = golf.victor();
                if (golf != null && (c0058p = golf.f13305x) != null) {
                    parent$ui_release = (g0) c0058p.golf;
                } else {
                    parent$ui_release = null;
                }
            }
        }
        return x.silver;
    }

    public final void e() {
        int ordinal = d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC2557q.november(this, new z(objectRef, this));
        Object obj = objectRef.alpha;
        if (obj != null) {
            if (!((o) obj).alpha()) {
                ((n) ((C2946x) AbstractC2555o.hotel(this)).getFocusOwner()).bravo(8, true, true);
                return;
            }
            return;
        }
        Intrinsics.lima("focusProperties");
        throw null;
    }

    public final boolean f(int i4) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z2 = false;
            if (!c().alpha) {
                Trace.endSection();
                return false;
            }
            int ordinal = ab.delta(this, i4).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        z2 = true;
                    }
                }
            } else {
                z2 = ab.echo(this);
            }
            return z2;
        } finally {
            Trace.endSection();
        }
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // r0.e
    public final /* synthetic */ J7 green() {
        return C2480b.alpha;
    }

    @Override // s0.P
    public final void magenta() {
        e();
    }

    @Override // T.r
    public final void onDetach() {
        int ordinal = d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        n nVar = (n) ((C2946x) AbstractC2555o.hotel(this)).getFocusOwner();
        nVar.bravo(8, true, false);
        nVar.delta.alpha();
    }

    @Override // T.r
    public final void onReset() {
        if (d().bravo()) {
            ((n) ((C2946x) AbstractC2555o.hotel(this)).getFocusOwner()).bravo(8, true, true);
        }
    }
}
