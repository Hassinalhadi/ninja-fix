package Y;

import B9.C0058p;
import C1.av;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.mlkit.vision.barcode.common.Barcode;
import fe.C1715g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;
import pe.AbstractC2327c;
import q0.AbstractC2375K;
import q0.AbstractC2388g;
import q0.InterfaceC2386e;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.L;
import s0.al;
import s0.g0;
import s6.J4;
import t0.C2946x;

/* loaded from: classes3.dex */
public abstract class g {
    public static final int[] alpha = new int[2];

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean alpha(aa aaVar, av avVar) {
        boolean z2;
        int ordinal = aaVar.d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!india(aaVar, avVar)) {
                            if (aaVar.c().alpha) {
                                z2 = ((Boolean) avVar.invoke(aaVar)).booleanValue();
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                return false;
                            }
                        }
                        return true;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aa golf = golf(aaVar);
                if (golf != null) {
                    int ordinal2 = golf.d().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else if (alpha(golf, avVar) || foxtrot(aaVar, golf, 2, avVar) || (golf.c().alpha && ((Boolean) avVar.invoke(golf)).booleanValue())) {
                            return true;
                        }
                    }
                    return foxtrot(aaVar, golf, 2, avVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return india(aaVar, avVar);
    }

    public static final Z.c bravo(View view, C2946x c2946x) {
        int[] iArr = alpha;
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        c2946x.getLocationInWindow(iArr);
        float f5 = i4 - iArr[0];
        float f10 = i5 - iArr[1];
        return new Z.c(f5, f10, view.getWidth() + f5, view.getHeight() + f10);
    }

    public static final aa charlie(aa aaVar) {
        aa aaVar2 = ((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).hotel;
        if (aaVar2 != null && aaVar2.isAttached()) {
            return aaVar2;
        }
        return null;
    }

    public static final Z.c delta(aa aaVar) {
        L coordinator$ui_release = aaVar.getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return AbstractC2375K.hotel(coordinator$ui_release).sierra(coordinator$ui_release, false);
        }
        return Z.c.echo;
    }

    public static final boolean echo(aa aaVar, av avVar) {
        int ordinal = aaVar.d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (aaVar.c().alpha) {
                            return ((Boolean) avVar.invoke(aaVar)).booleanValue();
                        }
                        return juliet(aaVar, avVar);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aa golf = golf(aaVar);
                if (golf != null) {
                    if (echo(golf, avVar) || foxtrot(aaVar, golf, 1, avVar)) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return juliet(aaVar, avVar);
    }

    public static final boolean foxtrot(aa aaVar, aa aaVar2, int i4, av avVar) {
        if (mike(aaVar, aaVar2, i4, avVar)) {
            return true;
        }
        Boolean bool = (Boolean) lima(aaVar, i4, new ad(((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).hotel, aaVar, aaVar2, i4, avVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aa golf(aa aaVar) {
        aa aaVar2;
        if (aaVar.getNode().isAttached()) {
            if (!aaVar.getNode().isAttached()) {
                AbstractC2264a.bravo("visitChildren called on an unattached node");
            }
            J.e eVar = new J.e(new T.r[16]);
            T.r child$ui_release = aaVar.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                AbstractC2555o.alpha(eVar, aaVar.getNode());
            } else {
                eVar.bravo(child$ui_release);
            }
            loop0: while (true) {
                int i4 = eVar.red;
                if (i4 == 0) {
                    break;
                }
                T.r rVar = (T.r) eVar.mike(i4 - 1);
                if ((rVar.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                    AbstractC2555o.alpha(eVar, rVar);
                } else {
                    while (true) {
                        if (rVar == null) {
                            break;
                        }
                        if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            J.e eVar2 = null;
                            while (rVar != null) {
                                if (rVar instanceof aa) {
                                    aaVar2 = (aa) rVar;
                                    if (aaVar2.getNode().isAttached()) {
                                        int ordinal = aaVar2.d().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
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
                        } else {
                            rVar = rVar.getChild$ui_release();
                        }
                    }
                }
            }
            return aaVar2;
        }
        return null;
    }

    public static final boolean hotel(aa aaVar) {
        al alVar;
        L coordinator$ui_release;
        al alVar2;
        L coordinator$ui_release2 = aaVar.getCoordinator$ui_release();
        if (coordinator$ui_release2 != null && (alVar = coordinator$ui_release2.f13251i) != null && alVar.emerald() && (coordinator$ui_release = aaVar.getCoordinator$ui_release()) != null && (alVar2 = coordinator$ui_release.f13251i) != null && alVar2.cyan()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean india(aa aaVar, av avVar) {
        aa[] aaVarArr = new aa[16];
        if (!aaVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitChildren called on an unattached node");
        }
        J.e eVar = new J.e(new T.r[16]);
        T.r child$ui_release = aaVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC2555o.alpha(eVar, aaVar.getNode());
        } else {
            eVar.bravo(child$ui_release);
        }
        int i4 = 0;
        while (true) {
            int i5 = eVar.red;
            if (i5 == 0) {
                break;
            }
            T.r rVar = (T.r) eVar.mike(i5 - 1);
            if ((rVar.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                AbstractC2555o.alpha(eVar, rVar);
            } else {
                while (true) {
                    if (rVar == null) {
                        break;
                    }
                    if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                        J.e eVar2 = null;
                        while (rVar != null) {
                            if (rVar instanceof aa) {
                                aa aaVar2 = (aa) rVar;
                                int i10 = i4 + 1;
                                if (aaVarArr.length < i10) {
                                    int length = aaVarArr.length;
                                    ?? r10 = new Object[Math.max(i10, length * 2)];
                                    System.arraycopy(aaVarArr, 0, r10, 0, length);
                                    aaVarArr = r10;
                                }
                                aaVarArr[i4] = aaVar2;
                                i4 = i10;
                            } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                int i11 = 0;
                                for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                    if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            rVar = AbstractC2555o.bravo(eVar2);
                        }
                    } else {
                        rVar = rVar.getChild$ui_release();
                    }
                }
            }
        }
        ArraysKt.plum(aaVarArr, ac.alpha, 0, i4);
        int i12 = i4 - 1;
        if (i12 < aaVarArr.length) {
            while (i12 >= 0) {
                aa aaVar3 = aaVarArr[i12];
                if (hotel(aaVar3) && alpha(aaVar3, avVar)) {
                    return true;
                }
                i12--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean juliet(aa aaVar, av avVar) {
        aa[] aaVarArr = new aa[16];
        if (!aaVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitChildren called on an unattached node");
        }
        J.e eVar = new J.e(new T.r[16]);
        T.r child$ui_release = aaVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC2555o.alpha(eVar, aaVar.getNode());
        } else {
            eVar.bravo(child$ui_release);
        }
        int i4 = 0;
        while (true) {
            int i5 = eVar.red;
            if (i5 == 0) {
                break;
            }
            T.r rVar = (T.r) eVar.mike(i5 - 1);
            if ((rVar.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                AbstractC2555o.alpha(eVar, rVar);
            } else {
                while (true) {
                    if (rVar == null) {
                        break;
                    }
                    if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                        J.e eVar2 = null;
                        while (rVar != null) {
                            if (rVar instanceof aa) {
                                aa aaVar2 = (aa) rVar;
                                int i10 = i4 + 1;
                                if (aaVarArr.length < i10) {
                                    int length = aaVarArr.length;
                                    ?? r10 = new Object[Math.max(i10, length * 2)];
                                    System.arraycopy(aaVarArr, 0, r10, 0, length);
                                    aaVarArr = r10;
                                }
                                aaVarArr[i4] = aaVar2;
                                i4 = i10;
                            } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                int i11 = 0;
                                for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                    if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
                                }
                            }
                            rVar = AbstractC2555o.bravo(eVar2);
                        }
                    } else {
                        rVar = rVar.getChild$ui_release();
                    }
                }
            }
        }
        ArraysKt.plum(aaVarArr, ac.alpha, 0, i4);
        for (int i12 = 0; i12 < i4; i12++) {
            aa aaVar3 = aaVarArr[i12];
            if (hotel(aaVar3) && echo(aaVar3, avVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean kilo(View view, Integer num, Rect rect) {
        View view2;
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C2946x) {
            return ((C2946x) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            if (findNextFocusFromRect != null) {
                return findNextFocusFromRect.requestFocus(num.intValue(), rect);
            }
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (viewGroup.hasFocus()) {
            view2 = viewGroup.findFocus();
        } else {
            view2 = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view2, num.intValue());
        if (findNextFocus != null) {
            return findNextFocus.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual((q0.InterfaceC2386e) pe.AbstractC2327c.alpha(r5, r0), (q0.InterfaceC2386e) pe.AbstractC2327c.alpha(r10, r0)) != false) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lima(aa aaVar, int i4, Function1 function1) {
        int i5;
        int i10;
        Object obj;
        T.r rVar;
        androidx.compose.foundation.lazy.layout.n nVar;
        int delta;
        C0058p c0058p;
        if (!aaVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = aaVar.getNode().getParent$ui_release();
        al golf = AbstractC2555o.golf(aaVar);
        loop0: while (true) {
            i5 = 1;
            i10 = 0;
            obj = null;
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
                                    int i11 = 0;
                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
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
        if (aaVar2 != null) {
            r0.g gVar = AbstractC2388g.alpha;
        }
        InterfaceC2386e interfaceC2386e = (InterfaceC2386e) AbstractC2327c.alpha(aaVar, AbstractC2388g.alpha);
        if (interfaceC2386e != null) {
            int i12 = 5;
            if (i4 != 5) {
                i12 = 6;
                if (i4 != 6) {
                    i12 = 3;
                    if (i4 != 3) {
                        i12 = 4;
                        if (i4 != 4) {
                            if (i4 == 1) {
                                i5 = 2;
                            } else if (i4 != 2) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            nVar = (androidx.compose.foundation.lazy.layout.n) interfaceC2386e;
                            if (nVar.alpha.getItemCount() <= 0 && nVar.alpha.charlie() && nVar.isAttached()) {
                                if (nVar.c(i5)) {
                                    delta = nVar.alpha.alpha();
                                } else {
                                    delta = nVar.alpha.delta();
                                }
                                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                androidx.compose.foundation.lazy.layout.i iVar = nVar.purple;
                                iVar.getClass();
                                androidx.compose.foundation.lazy.layout.h hVar = new androidx.compose.foundation.lazy.layout.h(delta, delta);
                                iVar.alpha.bravo(hVar);
                                objectRef.alpha = hVar;
                                int bravo = nVar.alpha.bravo() * 2;
                                int itemCount = nVar.alpha.getItemCount();
                                if (bravo > itemCount) {
                                    bravo = itemCount;
                                }
                                while (obj == null && nVar.b((androidx.compose.foundation.lazy.layout.h) objectRef.alpha, i5) && i10 < bravo) {
                                    androidx.compose.foundation.lazy.layout.h hVar2 = (androidx.compose.foundation.lazy.layout.h) objectRef.alpha;
                                    int i13 = hVar2.alpha;
                                    boolean c3 = nVar.c(i5);
                                    int i14 = hVar2.bravo;
                                    if (c3) {
                                        i14++;
                                    } else {
                                        i13--;
                                    }
                                    androidx.compose.foundation.lazy.layout.i iVar2 = nVar.purple;
                                    iVar2.getClass();
                                    androidx.compose.foundation.lazy.layout.h hVar3 = new androidx.compose.foundation.lazy.layout.h(i13, i14);
                                    iVar2.alpha.bravo(hVar3);
                                    nVar.purple.alpha.lima((androidx.compose.foundation.lazy.layout.h) objectRef.alpha);
                                    objectRef.alpha = hVar3;
                                    i10++;
                                    AbstractC2555o.golf(nVar).kilo();
                                    obj = function1.invoke(new androidx.compose.foundation.lazy.layout.m(nVar, objectRef, i5));
                                }
                                nVar.purple.alpha.lima((androidx.compose.foundation.lazy.layout.h) objectRef.alpha);
                                AbstractC2555o.golf(nVar).kilo();
                                return obj;
                            }
                            return function1.invoke(androidx.compose.foundation.lazy.layout.n.silver);
                        }
                    }
                }
            }
            i5 = i12;
            nVar = (androidx.compose.foundation.lazy.layout.n) interfaceC2386e;
            if (nVar.alpha.getItemCount() <= 0) {
            }
            return function1.invoke(androidx.compose.foundation.lazy.layout.n.silver);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9 A[EDGE_INSN: B:151:0x01c9->B:132:0x01c9 BREAK  A[LOOP:5: B:91:0x014e->B:146:0x014e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean mike(aa aaVar, aa aaVar2, int i4, av avVar) {
        T.r rVar;
        al golf;
        C0058p c0058p;
        if (aaVar.d() == x.purple) {
            aa[] aaVarArr = new aa[16];
            if (!aaVar.getNode().isAttached()) {
                AbstractC2264a.bravo("visitChildren called on an unattached node");
            }
            J.e eVar = new J.e(new T.r[16]);
            T.r child$ui_release = aaVar.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                AbstractC2555o.alpha(eVar, aaVar.getNode());
            } else {
                eVar.bravo(child$ui_release);
            }
            int i5 = 0;
            while (true) {
                int i10 = eVar.red;
                rVar = null;
                if (i10 == 0) {
                    break;
                }
                T.r rVar2 = (T.r) eVar.mike(i10 - 1);
                if ((rVar2.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                    AbstractC2555o.alpha(eVar, rVar2);
                } else {
                    while (true) {
                        if (rVar2 == null) {
                            break;
                        }
                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            J.e eVar2 = null;
                            while (rVar2 != null) {
                                if (rVar2 instanceof aa) {
                                    aa aaVar3 = (aa) rVar2;
                                    int i11 = i5 + 1;
                                    if (aaVarArr.length < i11) {
                                        int length = aaVarArr.length;
                                        ?? r11 = new Object[Math.max(i11, length * 2)];
                                        System.arraycopy(aaVarArr, 0, r11, 0, length);
                                        aaVarArr = r11;
                                    }
                                    aaVarArr[i5] = aaVar3;
                                    i5 = i11;
                                } else if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar2 instanceof AbstractC2556p)) {
                                    int i12 = 0;
                                    for (T.r rVar3 = ((AbstractC2556p) rVar2).purple; rVar3 != null; rVar3 = rVar3.getChild$ui_release()) {
                                        if ((rVar3.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                rVar2 = rVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new J.e(new T.r[16]);
                                                }
                                                if (rVar2 != null) {
                                                    eVar2.bravo(rVar2);
                                                    rVar2 = null;
                                                }
                                                eVar2.bravo(rVar3);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                rVar2 = AbstractC2555o.bravo(eVar2);
                            }
                        } else {
                            rVar2 = rVar2.getChild$ui_release();
                        }
                    }
                }
            }
            ArraysKt.plum(aaVarArr, ac.alpha, 0, i5);
            if (i4 == 1) {
                C1715g hotel = J4.hotel(0, i5);
                int i13 = hotel.alpha;
                int i14 = hotel.purple;
                if (i13 <= i14) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            aa aaVar4 = aaVarArr[i13];
                            if (hotel(aaVar4) && echo(aaVar4, avVar)) {
                                break;
                            }
                        }
                        if (Intrinsics.areEqual(aaVarArr[i13], aaVar2)) {
                            z2 = true;
                        }
                        if (i13 == i14) {
                            break;
                        }
                        i13++;
                    }
                    return true;
                }
                if (i4 != 1 && aaVar.c().alpha) {
                    if (!aaVar.getNode().isAttached()) {
                        AbstractC2264a.bravo("visitAncestors called on an unattached node");
                    }
                    T.r parent$ui_release = aaVar.getNode().getParent$ui_release();
                    golf = AbstractC2555o.golf(aaVar);
                    loop5: while (true) {
                        if (golf == null) {
                            break;
                        }
                        if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            while (parent$ui_release != null) {
                                if ((parent$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                    T.r rVar4 = parent$ui_release;
                                    J.e eVar3 = null;
                                    while (rVar4 != null) {
                                        if (rVar4 instanceof aa) {
                                            rVar = rVar4;
                                            break loop5;
                                        }
                                        if ((rVar4.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar4 instanceof AbstractC2556p)) {
                                            int i15 = 0;
                                            for (T.r rVar5 = ((AbstractC2556p) rVar4).purple; rVar5 != null; rVar5 = rVar5.getChild$ui_release()) {
                                                if ((rVar5.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        rVar4 = rVar5;
                                                    } else {
                                                        if (eVar3 == null) {
                                                            eVar3 = new J.e(new T.r[16]);
                                                        }
                                                        if (rVar4 != null) {
                                                            eVar3.bravo(rVar4);
                                                            rVar4 = null;
                                                        }
                                                        eVar3.bravo(rVar5);
                                                    }
                                                }
                                            }
                                            if (i15 == 1) {
                                            }
                                        }
                                        rVar4 = AbstractC2555o.bravo(eVar3);
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
                    if (rVar != null) {
                        return ((Boolean) avVar.invoke(aaVar)).booleanValue();
                    }
                }
                return false;
            }
            if (i4 == 2) {
                C1715g hotel2 = J4.hotel(0, i5);
                int i16 = hotel2.alpha;
                int i17 = hotel2.purple;
                if (i16 <= i17) {
                    boolean z10 = false;
                    while (true) {
                        if (z10) {
                            aa aaVar5 = aaVarArr[i17];
                            if (hotel(aaVar5) && alpha(aaVar5, avVar)) {
                                break;
                            }
                        }
                        if (Intrinsics.areEqual(aaVarArr[i17], aaVar2)) {
                            z10 = true;
                        }
                        if (i17 == i16) {
                            break;
                        }
                        i17--;
                    }
                    return true;
                }
                if (i4 != 1) {
                    if (!aaVar.getNode().isAttached()) {
                    }
                    T.r parent$ui_release2 = aaVar.getNode().getParent$ui_release();
                    golf = AbstractC2555o.golf(aaVar);
                    loop5: while (true) {
                        if (golf == null) {
                        }
                    }
                    if (rVar != null) {
                    }
                }
                return false;
            }
            throw new IllegalStateException("This function should only be used for 1-D focus search");
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }

    public static final Integer november(int i4) {
        if (i4 == 5) {
            return 33;
        }
        if (i4 == 6) {
            return 130;
        }
        if (i4 == 3) {
            return 17;
        }
        if (i4 == 4) {
            return 66;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 1;
        }
        return null;
    }

    public static final d oscar(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 != 130) {
                                return null;
                            }
                            return new d(6);
                        }
                        return new d(4);
                    }
                    return new d(5);
                }
                return new d(3);
            }
            return new d(1);
        }
        return new d(2);
    }
}
