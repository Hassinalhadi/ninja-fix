package s0;

import com.google.mlkit.vision.barcode.common.Barcode;
import k0.InterfaceC1997d;
import o0.C2186a;
import okhttp3.internal.http2.Http2;
import p0.AbstractC2264a;
import r0.InterfaceC2481c;
import t0.C2946x;
import x0.InterfaceC3278a;

/* loaded from: classes3.dex */
public abstract class M {
    public static final bv.ag alpha;

    static {
        bv.ag agVar = bv.aq.alpha;
        alpha = new bv.ag();
    }

    public static final void alpha(T.r rVar) {
        if (!rVar.isAttached()) {
            AbstractC2264a.bravo("autoInvalidateInsertedNode called on unattached node");
        }
        bravo(rVar, -1, 1);
    }

    public static final void bravo(T.r rVar, int i4, int i5) {
        if (rVar instanceof AbstractC2556p) {
            AbstractC2556p abstractC2556p = (AbstractC2556p) rVar;
            charlie(rVar, abstractC2556p.alpha & i4, i5);
            int i10 = (~abstractC2556p.alpha) & i4;
            for (T.r rVar2 = abstractC2556p.purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                bravo(rVar2, i10, i5);
            }
            return;
        }
        charlie(rVar, i4 & rVar.getKindSet$ui_release(), i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void charlie(T.r rVar, int i4, int i5) {
        if (i5 != 0 || rVar.getShouldAutoInvalidate()) {
            if ((i4 & 2) != 0 && (rVar instanceof ab)) {
                AbstractC2555o.golf((ab) rVar).blue();
                if (i5 == 2) {
                    L echo = AbstractC2555o.echo(rVar, 2);
                    echo.f13254l = true;
                    echo.A.invoke();
                    echo.R();
                }
            }
            if ((i4 & 128) != 0 && (rVar instanceof aa) && i5 != 2) {
                AbstractC2555o.golf(rVar).blue();
            }
            if ((i4 & Barcode.FORMAT_QR_CODE) != 0 && (rVar instanceof InterfaceC2559t)) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        AbstractC2555o.golf(rVar).purple(r0.f13281H - 1);
                    }
                } else {
                    al golf = AbstractC2555o.golf(rVar);
                    golf.purple(golf.f13281H + 1);
                }
                if (i5 != 2) {
                    al golf2 = AbstractC2555o.golf(rVar);
                    if (golf2.f13281H != 0 && !golf2.quebec() && !golf2.romeo() && !golf2.f13280G) {
                        C2946x c2946x = (C2946x) ao.alpha(golf2);
                        com.google.android.play.core.integrity.c cVar = c2946x.f13860H.echo;
                        cVar.getClass();
                        if (golf2.f13281H > 0) {
                            ((J.e) cVar.purple).bravo(golf2);
                            golf2.f13280G = true;
                        }
                        c2946x.beige(null);
                    }
                }
            }
            if ((i4 & 4) != 0 && (rVar instanceof InterfaceC2558s)) {
                AbstractC2557q.india((InterfaceC2558s) rVar);
            }
            if ((i4 & 8) != 0 && (rVar instanceof e0)) {
                AbstractC2555o.golf(rVar).f13291j = true;
            }
            if ((i4 & 64) != 0 && (rVar instanceof Z)) {
                ap apVar = AbstractC2555o.golf((Z) rVar).f13306y;
                apVar.papa.f13224j = true;
                ay ayVar = apVar.quebec;
                if (ayVar != null) {
                    ayVar.f13334o = true;
                }
            }
            if ((i4 & 2048) != 0 && (rVar instanceof Y.r)) {
                Y.r rVar2 = (Y.r) rVar;
                C2548h.bravo = null;
                rVar2.romeo(C2548h.alpha);
                if (C2548h.bravo != null) {
                    T.r rVar3 = (T.r) rVar2;
                    if (!rVar3.getNode().isAttached()) {
                        AbstractC2264a.bravo("visitChildren called on an unattached node");
                    }
                    J.e eVar = new J.e(new T.r[16]);
                    T.r child$ui_release = rVar3.getNode().getChild$ui_release();
                    if (child$ui_release == null) {
                        AbstractC2555o.alpha(eVar, rVar3.getNode());
                    } else {
                        eVar.bravo(child$ui_release);
                    }
                    while (true) {
                        int i10 = eVar.red;
                        if (i10 == 0) {
                            break;
                        }
                        T.r rVar4 = (T.r) eVar.mike(i10 - 1);
                        if ((rVar4.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                            AbstractC2555o.alpha(eVar, rVar4);
                        } else {
                            while (true) {
                                if (rVar4 == null) {
                                    break;
                                }
                                if ((rVar4.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                    J.e eVar2 = null;
                                    while (rVar4 != null) {
                                        if (rVar4 instanceof Y.aa) {
                                            Y.aa aaVar = (Y.aa) rVar4;
                                            Y.h hVar = ((Y.n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).delta;
                                            if (hVar.charlie.alpha(aaVar)) {
                                                hVar.alpha();
                                            }
                                        } else if ((rVar4.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar4 instanceof AbstractC2556p)) {
                                            int i11 = 0;
                                            for (T.r rVar5 = ((AbstractC2556p) rVar4).purple; rVar5 != null; rVar5 = rVar5.getChild$ui_release()) {
                                                if ((rVar5.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        rVar4 = rVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new J.e(new T.r[16]);
                                                        }
                                                        if (rVar4 != null) {
                                                            eVar2.bravo(rVar4);
                                                            rVar4 = null;
                                                        }
                                                        eVar2.bravo(rVar5);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        rVar4 = AbstractC2555o.bravo(eVar2);
                                    }
                                } else {
                                    rVar4 = rVar4.getChild$ui_release();
                                }
                            }
                        }
                    }
                }
            }
            if ((i4 & 4096) != 0 && (rVar instanceof Y.e)) {
                Y.e eVar3 = (Y.e) rVar;
                Y.h hVar2 = ((Y.n) ((C2946x) AbstractC2555o.hotel(eVar3)).getFocusOwner()).delta;
                if (hVar2.delta.alpha(eVar3)) {
                    hVar2.alpha();
                }
            }
        }
    }

    public static final void delta(T.r rVar) {
        if (!rVar.isAttached()) {
            AbstractC2264a.bravo("autoInvalidateUpdatedNode called on unattached node");
        }
        bravo(rVar, -1, 0);
    }

    public static final int echo(T.q qVar) {
        int i4;
        if (qVar instanceof q0.ab) {
            i4 = 3;
        } else {
            i4 = 1;
        }
        if (qVar instanceof b.F) {
            i4 |= 4;
        }
        if (qVar instanceof A0.n) {
            i4 |= 8;
        }
        if (qVar instanceof m0.x) {
            i4 |= 16;
        }
        if ((qVar instanceof InterfaceC2481c) || (qVar instanceof androidx.compose.foundation.layout.ax)) {
            i4 |= 32;
        }
        if (qVar instanceof q0.aw) {
            i4 |= Barcode.FORMAT_QR_CODE;
        }
        if (qVar instanceof q0.az) {
            i4 |= 64;
        }
        if (qVar instanceof InterfaceC3278a) {
            return 524288 | i4;
        }
        return i4;
    }

    public static final int foxtrot(T.r rVar) {
        int i4;
        if (rVar.getKindSet$ui_release() != 0) {
            return rVar.getKindSet$ui_release();
        }
        Class<?> cls = rVar.getClass();
        bv.ag agVar = alpha;
        int delta = agVar.delta(cls);
        if (delta >= 0) {
            return agVar.charlie[delta];
        }
        if (rVar instanceof ab) {
            i4 = 3;
        } else {
            i4 = 1;
        }
        if (rVar instanceof InterfaceC2558s) {
            i4 |= 4;
        }
        if (rVar instanceof e0) {
            i4 |= 8;
        }
        if (rVar instanceof b0) {
            i4 |= 16;
        }
        if (rVar instanceof r0.e) {
            i4 |= 32;
        }
        if (rVar instanceof Z) {
            i4 |= 64;
        }
        if (rVar instanceof aa) {
            i4 |= 128;
        }
        if (rVar instanceof InterfaceC2559t) {
            i4 |= Barcode.FORMAT_QR_CODE;
        }
        if (rVar instanceof Y.aa) {
            i4 |= Barcode.FORMAT_UPC_E;
        }
        if (rVar instanceof Y.r) {
            i4 |= 2048;
        }
        if (rVar instanceof Y.e) {
            i4 |= 4096;
        }
        if (rVar instanceof InterfaceC1997d) {
            i4 |= 8192;
        }
        if (rVar instanceof C2186a) {
            i4 |= Http2.INITIAL_MAX_FRAME_SIZE;
        }
        if (rVar instanceof InterfaceC2553m) {
            i4 |= 32768;
        }
        if (rVar instanceof j0) {
            i4 |= 262144;
        }
        if (rVar instanceof InterfaceC3278a) {
            i4 |= 524288;
        }
        agVar.hotel(i4, cls);
        return i4;
    }

    public static final int golf(T.r rVar) {
        if (rVar instanceof AbstractC2556p) {
            AbstractC2556p abstractC2556p = (AbstractC2556p) rVar;
            int i4 = abstractC2556p.alpha;
            for (T.r rVar2 = abstractC2556p.purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                i4 |= golf(rVar2);
            }
            return i4;
        }
        return foxtrot(rVar);
    }

    public static final boolean hotel(int i4) {
        if ((i4 & 128) != 0) {
            return true;
        }
        return false;
    }
}
