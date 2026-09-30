package s0;

import B9.C0058p;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.AbstractC0538d;
import com.google.mlkit.vision.barcode.common.Barcode;
import i.C1871t;
import i.C1874w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import r0.C2479a;
import r0.C2480b;
import r0.InterfaceC2481c;
import s6.AbstractC2627c7;
import s6.J7;
import t0.C2907c0;
import t0.C2946x;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2544d extends T.r implements ab, InterfaceC2558s, e0, b0, r0.e, r0.f, Z, aa, InterfaceC2559t, Y.e, Y.r, Y.t, X, X.a {
    public T.q alpha;
    public C2479a purple;
    public HashSet red;

    @Override // Y.e
    public final void a(Y.x xVar) {
        T.q qVar = this.alpha;
        AbstractC2264a.bravo("onFocusEvent called on wrong node");
        qVar.getClass();
        throw new ClassCastException();
    }

    @Override // X.a
    public final Q0.d alpha() {
        return AbstractC2555o.golf(this).f13298q;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [r0.a, java.lang.Object] */
    public final void b(boolean z2) {
        if (!isAttached()) {
            AbstractC2264a.bravo("initializeModifier called on unattached node");
        }
        T.q qVar = this.alpha;
        if ((getKindSet$ui_release() & 32) != 0) {
            if (qVar instanceof InterfaceC2481c) {
                sideEffect(new C2543c(this, 0));
            }
            if (qVar instanceof androidx.compose.foundation.layout.ax) {
                androidx.compose.foundation.layout.ax axVar = (androidx.compose.foundation.layout.ax) qVar;
                C2479a c2479a = this.purple;
                r0.g gVar = AbstractC0538d.charlie;
                if (c2479a != null) {
                    axVar.getClass();
                    if (c2479a.bravo(gVar)) {
                        c2479a.alpha = axVar;
                        r0.d modifierLocalManager = ((C2946x) AbstractC2555o.hotel(this)).getModifierLocalManager();
                        modifierLocalManager.bravo.bravo(this);
                        modifierLocalManager.charlie.bravo(gVar);
                        modifierLocalManager.alpha();
                    }
                }
                ?? obj = new Object();
                obj.alpha = axVar;
                this.purple = obj;
                if (AbstractC2547g.alpha(this)) {
                    r0.d modifierLocalManager2 = ((C2946x) AbstractC2555o.hotel(this)).getModifierLocalManager();
                    axVar.getClass();
                    modifierLocalManager2.bravo.bravo(this);
                    modifierLocalManager2.charlie.bravo(gVar);
                    modifierLocalManager2.alpha();
                }
            }
        }
        if ((getKindSet$ui_release() & 4) != 0 && !z2) {
            AbstractC2555o.echo(this, 2).H();
        }
        if ((getKindSet$ui_release() & 2) != 0) {
            if (AbstractC2547g.alpha(this)) {
                L coordinator$ui_release = getCoordinator$ui_release();
                Intrinsics.checkNotNull(coordinator$ui_release);
                ((ad) coordinator$ui_release).a0(this);
                U u4 = coordinator$ui_release.C;
                if (u4 != null) {
                    ((C2907c0) u4).invalidate();
                }
            }
            if (!z2) {
                AbstractC2555o.echo(this, 2).H();
                AbstractC2555o.golf(this).blue();
            }
        }
        if (qVar instanceof C1871t) {
            C1871t c1871t = (C1871t) qVar;
            al golf = AbstractC2555o.golf(this);
            switch (c1871t.alpha) {
                case 0:
                    ((C1874w) c1871t.purple).kilo = golf;
                    break;
                default:
                    ((j.t) c1871t.purple).juliet = golf;
                    break;
            }
        }
        getKindSet$ui_release();
        if ((getKindSet$ui_release() & Barcode.FORMAT_QR_CODE) != 0 && (qVar instanceof q0.aw) && AbstractC2547g.alpha(this)) {
            AbstractC2555o.golf(this).blue();
        }
        if ((getKindSet$ui_release() & 16) != 0 && (qVar instanceof m0.x)) {
            ((m0.x) qVar).silver.alpha = getCoordinator$ui_release();
        }
        if ((getKindSet$ui_release() & 8) != 0) {
            ((C2946x) AbstractC2555o.hotel(this)).yankee();
        }
    }

    @Override // s0.InterfaceC2558s
    public final void blue() {
        AbstractC2557q.india(this);
    }

    @Override // X.a
    public final long bravo() {
        return AbstractC2627c7.bravo(AbstractC2555o.echo(this, 128).red);
    }

    @Override // s0.b0
    public final void bronze() {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((m0.x) qVar).silver.getClass();
    }

    public final void c() {
        if (!isAttached()) {
            AbstractC2264a.bravo("unInitializeModifier called on unattached node");
        }
        T.q qVar = this.alpha;
        if ((getKindSet$ui_release() & 32) != 0) {
            if (qVar instanceof androidx.compose.foundation.layout.ax) {
                r0.d modifierLocalManager = ((C2946x) AbstractC2555o.hotel(this)).getModifierLocalManager();
                ((androidx.compose.foundation.layout.ax) qVar).getClass();
                modifierLocalManager.delta.bravo(AbstractC2555o.golf(this));
                modifierLocalManager.echo.bravo(AbstractC0538d.charlie);
                modifierLocalManager.alpha();
            }
            if (qVar instanceof InterfaceC2481c) {
                ((InterfaceC2481c) qVar).bravo(AbstractC2547g.alpha);
            }
        }
        if ((getKindSet$ui_release() & 8) != 0) {
            ((C2946x) AbstractC2555o.hotel(this)).yankee();
        }
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // r0.f
    public final Object coral(r0.g gVar) {
        C0058p c0058p;
        this.red.add(gVar);
        if (!getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = getNode().getParent$ui_release();
        al golf = AbstractC2555o.golf(this);
        while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 32) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 32) != 0) {
                        AbstractC2556p abstractC2556p = parent$ui_release;
                        ?? r4 = 0;
                        while (abstractC2556p != 0) {
                            if (abstractC2556p instanceof r0.e) {
                                r0.e eVar = (r0.e) abstractC2556p;
                                if (eVar.green().bravo(gVar)) {
                                    return eVar.green().delta(gVar);
                                }
                            } else if ((abstractC2556p.getKindSet$ui_release() & 32) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                T.r rVar = abstractC2556p.purple;
                                int i4 = 0;
                                abstractC2556p = abstractC2556p;
                                r4 = r4;
                                while (rVar != null) {
                                    if ((rVar.getKindSet$ui_release() & 32) != 0) {
                                        i4++;
                                        r4 = r4;
                                        if (i4 == 1) {
                                            abstractC2556p = rVar;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new J.e(new T.r[16]);
                                            }
                                            if (abstractC2556p != 0) {
                                                r4.bravo(abstractC2556p);
                                                abstractC2556p = 0;
                                            }
                                            r4.bravo(rVar);
                                        }
                                    }
                                    rVar = rVar.getChild$ui_release();
                                    abstractC2556p = abstractC2556p;
                                    r4 = r4;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r4);
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
        return gVar.alpha.invoke();
    }

    public final void d() {
        if (isAttached()) {
            this.red.clear();
            ((C2946x) AbstractC2555o.hotel(this)).getSnapshotObserver().alpha(this, AbstractC2547g.bravo, new C2543c(this, 1));
        }
    }

    @Override // s0.aa
    public final void foxtrot(q0.z zVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f A[ORIG_RETURN, RETURN] */
    @Override // s0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fuchsia(m0.k kVar, m0.l lVar, long j5) {
        boolean z2;
        boolean z10;
        m0.x xVar;
        boolean z11;
        boolean z12;
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        J2.n nVar = ((m0.x) qVar).silver;
        nVar.getClass();
        List list = kVar.alpha;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            m0.r rVar = (m0.r) list.get(i4);
            if (m0.q.alpha(rVar) || m0.q.charlie(rVar)) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (z2) {
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (!((m0.r) list.get(i5)).bravo()) {
                }
            }
            z10 = true;
            xVar = (m0.x) nVar.silver;
            if (!xVar.red) {
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size3) {
                        m0.r rVar2 = (m0.r) list.get(i10);
                        if (m0.q.alpha(rVar2) || m0.q.charlie(rVar2)) {
                            break;
                        } else {
                            i10++;
                        }
                    } else if (!z10) {
                        z11 = false;
                    }
                }
            }
            z11 = true;
            if (((m0.v) nVar.purple) != m0.v.red) {
                if (lVar == m0.l.alpha && z11) {
                    nVar.red = kVar;
                    if (z2 && !xVar.red) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    nVar.mike(kVar, z12);
                }
                if (lVar == m0.l.purple && z2 && Intrinsics.areEqual(kVar, (m0.k) nVar.red) && xVar.red) {
                    int size4 = list.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        ((m0.r) list.get(i11)).alpha();
                    }
                }
                if (lVar == m0.l.red && !z11 && !Intrinsics.areEqual(kVar, (m0.k) nVar.red)) {
                    nVar.mike(kVar, true);
                }
            }
            if (lVar != m0.l.red) {
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size5) {
                        if (!m0.q.charlie((m0.r) list.get(i12))) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        nVar.purple = m0.v.alpha;
                        xVar.red = false;
                        nVar.red = null;
                        break;
                    }
                }
                if (Intrinsics.areEqual(kVar, (m0.k) nVar.red) && z2) {
                    int size6 = list.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size6) {
                            break;
                        }
                        if (((m0.r) list.get(i13)).bravo()) {
                            if (!xVar.red) {
                                nVar.sierra(kVar);
                                return;
                            }
                        } else {
                            i13++;
                        }
                    }
                    int size7 = list.size();
                    for (int i14 = 0; i14 < size7; i14++) {
                        ((m0.r) list.get(i14)).alpha();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z10 = false;
        xVar = (m0.x) nVar.silver;
        if (!xVar.red) {
        }
        z11 = true;
        if (((m0.v) nVar.purple) != m0.v.red) {
        }
        if (lVar != m0.l.red) {
        }
    }

    @Override // X.a
    public final Q0.n getLayoutDirection() {
        return AbstractC2555o.golf(this).f13299r;
    }

    @Override // r0.e
    public final J7 green() {
        C2479a c2479a = this.purple;
        if (c2479a != null) {
            return c2479a;
        }
        return C2480b.alpha;
    }

    @Override // s0.InterfaceC2559t
    public final void hotel(L l10) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        androidx.compose.foundation.lazy.layout.d dVar = (androidx.compose.foundation.lazy.layout.d) ((q0.aw) qVar);
        if (!dVar.alpha) {
            dVar.alpha = true;
            ArrayList arrayList = dVar.purple;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Nd.c cVar = (Nd.c) arrayList.get(i4);
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
            }
            arrayList.clear();
        }
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        int i4;
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        A0.k hotel = ((A0.n) qVar).hotel();
        Intrinsics.charlie(adVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        A0.k kVar = (A0.k) adVar;
        if (hotel.red) {
            kVar.red = true;
        }
        if (hotel.silver) {
            kVar.silver = true;
        }
        bv.al alVar = hotel.alpha;
        Object[] objArr = alVar.bravo;
        Object[] objArr2 = alVar.charlie;
        long[] jArr = alVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i5 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j5) < 128) {
                            int i13 = (i5 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            A0.ac acVar = (A0.ac) obj;
                            bv.al alVar2 = kVar.alpha;
                            if (!alVar2.bravo(acVar)) {
                                alVar2.mike(acVar, obj2);
                            } else if (obj2 instanceof A0.a) {
                                Object golf = alVar2.golf(acVar);
                                i4 = i10;
                                Intrinsics.charlie(golf, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                A0.a aVar = (A0.a) golf;
                                String str = aVar.alpha;
                                if (str == null) {
                                    str = ((A0.a) obj2).alpha;
                                }
                                kotlin.e eVar = aVar.bravo;
                                if (eVar == null) {
                                    eVar = ((A0.a) obj2).bravo;
                                }
                                alVar2.mike(acVar, new A0.a(str, eVar));
                                j5 >>= i4;
                                i12++;
                                i10 = i4;
                            }
                        }
                        i4 = i10;
                        j5 >>= i4;
                        i12++;
                        i10 = i4;
                    }
                    if (i11 != i10) {
                        return;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // s0.InterfaceC2558s
    public final void jade(an anVar) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((b.F) qVar).alpha.charlie(anVar);
    }

    @Override // s0.b0
    public final long juliet() {
        return h0.alpha;
    }

    @Override // s0.aa
    public final void kilo(long j5) {
    }

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q0.ab) qVar).alpha((at) interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q0.ab) qVar).echo((at) interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q0.ab) qVar).mo2measure3p2s80s(arVar, aoVar, j5);
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q0.ab) qVar).golf((at) interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((q0.ab) qVar).charlie((at) interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // T.r
    public final void onAttach() {
        b(true);
    }

    @Override // T.r
    public final void onDensityChange() {
        if (this.alpha instanceof m0.x) {
            xray();
        }
    }

    @Override // T.r
    public final void onDetach() {
        c();
    }

    @Override // s0.b0
    public final boolean peach() {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((m0.x) qVar).silver.getClass();
        return true;
    }

    @Override // Y.r
    public final void romeo(Y.o oVar) {
        T.q qVar = this.alpha;
        AbstractC2264a.bravo("applyFocusProperties called on wrong node");
        qVar.getClass();
        throw new ClassCastException();
    }

    @Override // s0.b0
    public final void silver() {
        xray();
    }

    @Override // s0.Z
    public final Object tango(Q0.d dVar, Object obj) {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((q0.az) qVar).foxtrot();
    }

    public final String toString() {
        return this.alpha.toString();
    }

    @Override // s0.b0
    public final void xray() {
        T.q qVar = this.alpha;
        Intrinsics.charlie(qVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        J2.n nVar = ((m0.x) qVar).silver;
        if (((m0.v) nVar.purple) == m0.v.purple) {
            long uptimeMillis = SystemClock.uptimeMillis();
            m0.x xVar = (m0.x) nVar.silver;
            m0.w wVar = new m0.w(xVar, 0);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            wVar.invoke(obtain);
            obtain.recycle();
            nVar.purple = m0.v.alpha;
            xVar.red = false;
            nVar.red = null;
        }
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
