package Y;

import B9.C0058p;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.NoWhenBranchMatchedException;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.al;
import s0.g0;
import t0.C2946x;

/* loaded from: classes3.dex */
public abstract class ab {
    public static final boolean alpha(aa aaVar, boolean z2) {
        boolean z10;
        int ordinal = aaVar.d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return true;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (z2) {
                    ((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).golf(null);
                    aaVar.b(x.red, x.silver);
                }
                return z2;
            }
            aa golf = g.golf(aaVar);
            if (golf != null) {
                z10 = alpha(golf, z2);
            } else {
                z10 = true;
            }
            if (z10) {
                aaVar.b(x.purple, x.silver);
                return true;
            }
            return false;
        }
        ((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).golf(null);
        aaVar.b(x.alpha, x.silver);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final b bravo(aa aaVar, int i4) {
        int ordinal = aaVar.d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return b.purple;
                }
            } else {
                aa golf = g.golf(aaVar);
                if (golf != null) {
                    b bravo = bravo(golf, i4);
                    b bVar = b.alpha;
                    if (bravo == bVar) {
                        bravo = null;
                    }
                    if (bravo == null) {
                        if (!aaVar.purple) {
                            aaVar.purple = true;
                            try {
                                q c3 = aaVar.c();
                                a aVar = new a(i4);
                                k focusOwner = ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner();
                                aa aaVar2 = ((n) focusOwner).hotel;
                                c3.kilo.invoke(aVar);
                                aa aaVar3 = ((n) focusOwner).hotel;
                                if (aVar.bravo) {
                                    s sVar = s.bravo;
                                    return b.purple;
                                }
                                if (aaVar2 != aaVar3 && aaVar3 != null) {
                                    if (s.delta == s.charlie) {
                                        return b.purple;
                                    }
                                    return b.red;
                                }
                                return bVar;
                            } finally {
                                aaVar.purple = false;
                            }
                        }
                        return bVar;
                    }
                    return bravo;
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
        }
        return b.alpha;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public static final b charlie(aa aaVar, int i4) {
        if (!aaVar.red) {
            aaVar.red = true;
            try {
                q c3 = aaVar.c();
                a aVar = new a(i4);
                k focusOwner = ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner();
                aa aaVar2 = ((n) focusOwner).hotel;
                c3.juliet.invoke(aVar);
                aa aaVar3 = ((n) focusOwner).hotel;
                if (aVar.bravo) {
                    s sVar = s.bravo;
                    return b.purple;
                }
                if (aaVar2 != aaVar3 && aaVar3 != null) {
                    if (s.delta == s.charlie) {
                        return b.purple;
                    }
                    return b.red;
                }
            } finally {
                aaVar.red = false;
            }
        }
        return b.alpha;
    }

    public static final b delta(aa aaVar, int i4) {
        b bVar;
        T.r rVar;
        C0058p c0058p;
        int ordinal = aaVar.d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!aaVar.getNode().isAttached()) {
                            AbstractC2264a.bravo("visitAncestors called on an unattached node");
                        }
                        T.r parent$ui_release = aaVar.getNode().getParent$ui_release();
                        al golf = AbstractC2555o.golf(aaVar);
                        loop0: while (true) {
                            bVar = null;
                            if (golf != null) {
                                if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                    while (parent$ui_release != null) {
                                        if ((parent$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            rVar = parent$ui_release;
                                            J.e eVar = null;
                                            while (rVar != null) {
                                                if (rVar instanceof aa) {
                                                    break loop0;
                                                }
                                                if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                                    int i5 = 0;
                                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                            i5++;
                                                            if (i5 == 1) {
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
                                                    if (i5 == 1) {
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
                            } else {
                                rVar = null;
                                break;
                            }
                        }
                        aa aaVar2 = (aa) rVar;
                        if (aaVar2 == null) {
                            return b.alpha;
                        }
                        int ordinal2 = aaVar2.d().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        b delta = delta(aaVar2, i4);
                                        if (delta != b.alpha) {
                                            bVar = delta;
                                        }
                                        if (bVar == null) {
                                            return charlie(aaVar2, i4);
                                        }
                                        return bVar;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                return b.purple;
                            }
                            return delta(aaVar2, i4);
                        }
                        return charlie(aaVar2, i4);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aa golf2 = g.golf(aaVar);
                if (golf2 != null) {
                    return bravo(golf2, i4);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
        }
        return b.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean echo(aa aaVar) {
        J.e eVar;
        x xVar;
        C0058p c0058p;
        char c3;
        Boolean bool;
        C0058p c0058p2;
        n nVar = (n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner();
        aa aaVar2 = nVar.hotel;
        x d4 = aaVar.d();
        if (aaVar2 == aaVar) {
            aaVar.b(d4, d4);
            return true;
        }
        int i4 = 0;
        if (aaVar2 == null && !((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).alpha.azure()) {
            return false;
        }
        char c4 = 16;
        if (aaVar2 != null) {
            eVar = new J.e(new aa[16]);
            if (!aaVar2.getNode().isAttached()) {
                AbstractC2264a.bravo("visitAncestors called on an unattached node");
            }
            T.r parent$ui_release = aaVar2.getNode().getParent$ui_release();
            al golf = AbstractC2555o.golf(aaVar2);
            while (golf != null) {
                if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            T.r rVar = parent$ui_release;
                            J.e eVar2 = null;
                            while (rVar != null) {
                                if (rVar instanceof aa) {
                                    eVar.bravo((aa) rVar);
                                } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                    int i5 = 0;
                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                rVar = rVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new J.e(new T.r[16]);
                                                }
                                                if (rVar != null) {
                                                    eVar2.bravo(rVar);
                                                    rVar = null;
                                                }
                                                eVar2.bravo(rVar2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                rVar = AbstractC2555o.bravo(eVar2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                golf = golf.victor();
                if (golf != null && (c0058p2 = golf.f13305x) != null) {
                    parent$ui_release = (g0) c0058p2.golf;
                } else {
                    parent$ui_release = null;
                }
            }
        } else {
            eVar = null;
        }
        aa[] aaVarArr = new aa[16];
        if (!aaVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release2 = aaVar.getNode().getParent$ui_release();
        al golf2 = AbstractC2555o.golf(aaVar);
        int i10 = 1;
        int i11 = 0;
        while (golf2 != null) {
            if ((((T.r) golf2.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                while (parent$ui_release2 != null) {
                    if ((parent$ui_release2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                        T.r rVar3 = parent$ui_release2;
                        J.e eVar3 = null;
                        while (rVar3 != null) {
                            if (rVar3 instanceof aa) {
                                aa aaVar3 = (aa) rVar3;
                                if (eVar != null) {
                                    bool = Boolean.valueOf(eVar.lima(aaVar3));
                                } else {
                                    bool = null;
                                }
                                if (bool == null || !bool.booleanValue()) {
                                    int i12 = i11 + 1;
                                    if (aaVarArr.length < i12) {
                                        int length = aaVarArr.length;
                                        ?? r4 = new Object[Math.max(i12, length * 2)];
                                        System.arraycopy(aaVarArr, i4, r4, i4, length);
                                        aaVarArr = r4;
                                    }
                                    aaVarArr[i11] = aaVar3;
                                    i11 = i12;
                                }
                                if (aaVar3 == aaVar2) {
                                    i10 = i4;
                                }
                            } else if ((rVar3.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar3 instanceof AbstractC2556p)) {
                                int i13 = i4;
                                for (T.r rVar4 = ((AbstractC2556p) rVar3).purple; rVar4 != null; rVar4 = rVar4.getChild$ui_release()) {
                                    if ((rVar4.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            rVar3 = rVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new J.e(new T.r[16]);
                                            }
                                            if (rVar3 != null) {
                                                eVar3.bravo(rVar3);
                                                rVar3 = null;
                                            }
                                            eVar3.bravo(rVar4);
                                        }
                                    }
                                }
                                c3 = 16;
                                if (i13 == 1) {
                                    c4 = 16;
                                    i4 = 0;
                                }
                                rVar3 = AbstractC2555o.bravo(eVar3);
                                c4 = c3;
                                i4 = 0;
                            }
                            c3 = 16;
                            rVar3 = AbstractC2555o.bravo(eVar3);
                            c4 = c3;
                            i4 = 0;
                        }
                    }
                    parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                    c4 = c4;
                    i4 = 0;
                }
            }
            char c10 = c4;
            golf2 = golf2.victor();
            if (golf2 != null && (c0058p = golf2.f13305x) != null) {
                parent$ui_release2 = (g0) c0058p.golf;
            } else {
                parent$ui_release2 = null;
            }
            c4 = c10;
            i4 = 0;
        }
        if (i10 == 0 || aaVar2 == null || alpha(aaVar2, false)) {
            AbstractC2557q.november(aaVar, new Xe.s(2, aaVar));
            int ordinal = aaVar.d().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                ((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).golf(aaVar);
            }
            if (eVar != null) {
                int i14 = eVar.red - 1;
                Object[] objArr = eVar.alpha;
                if (i14 < objArr.length) {
                    while (i14 >= 0) {
                        aa aaVar4 = (aa) objArr[i14];
                        if (nVar.hotel != aaVar) {
                            break;
                        }
                        aaVar4.b(x.purple, x.silver);
                        i14--;
                    }
                }
            }
            int i15 = i11 - 1;
            if (i15 < aaVarArr.length) {
                while (i15 >= 0) {
                    aa aaVar5 = aaVarArr[i15];
                    if (nVar.hotel != aaVar) {
                        break;
                    }
                    if (aaVar5 == aaVar2) {
                        xVar = x.alpha;
                    } else {
                        xVar = x.silver;
                    }
                    aaVar5.b(xVar, x.purple);
                    i15--;
                }
            }
            if (nVar.hotel == aaVar) {
                aaVar.b(d4, x.alpha);
                if (nVar.hotel != aaVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }
}
