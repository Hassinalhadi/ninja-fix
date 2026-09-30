package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.c0;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import bd.ExecutorC0752e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import t6.AbstractC3061t3;
import t6.j4;

/* loaded from: classes3.dex */
public final class ad extends O {
    public static final ab uniform = new Object();
    public final ag oscar;
    public final Object papa;
    public y quebec;
    public androidx.camera.core.impl.L romeo;
    public J sierra;
    public androidx.camera.core.impl.M tango;

    public ad(androidx.camera.core.impl.al alVar) {
        super(alVar);
        this.papa = new Object();
        if (((Integer) ((androidx.camera.core.impl.B) ((androidx.camera.core.impl.al) this.foxtrot).getConfig()).plum(androidx.camera.core.impl.al.purple, 0)).intValue() == 1) {
            this.oscar = new ag();
        } else {
            this.oscar = new ak((Executor) P0.whiskey(alVar, bf.k.emerald, tg.k.charlie()));
        }
        this.oscar.silver = beige();
        ag agVar = this.oscar;
        androidx.camera.core.impl.al alVar2 = (androidx.camera.core.impl.al) this.foxtrot;
        Boolean bool = Boolean.FALSE;
        alVar2.getClass();
        agVar.teal = ((Boolean) P0.whiskey(alVar2, androidx.camera.core.impl.al.yellow, bool)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (r10.equals((java.lang.Boolean) androidx.appcompat.widget.P0.whiskey(r11, androidx.camera.core.impl.al.white, null)) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.camera.core.impl.L azure(androidx.camera.core.impl.al alVar, C0509g c0509g) {
        int i4;
        boolean z2;
        int width;
        int height;
        int i5;
        boolean z10;
        InterfaceC0525x bravo;
        au.a aVar;
        J j5;
        androidx.camera.core.impl.M m4;
        j4.alpha();
        Size size = c0509g.alpha;
        ExecutorC0752e charlie = tg.k.charlie();
        alVar.getClass();
        Executor executor = (Executor) P0.whiskey(alVar, bf.k.emerald, charlie);
        executor.getClass();
        boolean z11 = true;
        if (((Integer) ((androidx.camera.core.impl.B) ((androidx.camera.core.impl.al) this.foxtrot).getConfig()).plum(androidx.camera.core.impl.al.purple, 0)).intValue() == 1) {
            androidx.camera.core.impl.al alVar2 = (androidx.camera.core.impl.al) this.foxtrot;
            alVar2.getClass();
            i4 = ((Integer) ((androidx.camera.core.impl.B) alVar2.getConfig()).plum(androidx.camera.core.impl.al.red, 6)).intValue();
        } else {
            i4 = 4;
        }
        S2.l lVar = null;
        if (((androidx.camera.core.impl.B) alVar.getConfig()).plum(androidx.camera.core.impl.al.silver, null) == null) {
            S2.l lVar2 = new S2.l(AbstractC3061t3.bravo(size.getWidth(), size.getHeight(), this.foxtrot.oscar(), i4));
            if (bravo() != null) {
                InterfaceC0525x bravo2 = bravo();
                androidx.camera.core.impl.al alVar3 = (androidx.camera.core.impl.al) this.foxtrot;
                Boolean bool = Boolean.FALSE;
                alVar3.getClass();
                if (((Boolean) P0.whiskey(alVar3, androidx.camera.core.impl.al.yellow, bool)).booleanValue() && golf(bravo2, false) % 180 != 0) {
                    z2 = true;
                    if (!z2) {
                        width = size.getHeight();
                    } else {
                        width = size.getWidth();
                    }
                    if (!z2) {
                        height = size.getWidth();
                    } else {
                        height = size.getHeight();
                    }
                    if (beige() != 2) {
                        i5 = 1;
                    } else {
                        i5 = 35;
                    }
                    if (this.foxtrot.oscar() != 35 && beige() == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.foxtrot.oscar() == 35) {
                        if (bravo() == null || golf(bravo(), false) == 0) {
                            Boolean bool2 = Boolean.TRUE;
                            androidx.camera.core.impl.al alVar4 = (androidx.camera.core.impl.al) this.foxtrot;
                            alVar4.getClass();
                        }
                        if (!z10 || z11) {
                            lVar = new S2.l(AbstractC3061t3.bravo(width, height, i5, lVar2.uniform()));
                        }
                        if (lVar != null) {
                            ag agVar = this.oscar;
                            synchronized (agVar.f2933k) {
                                agVar.f2924a = lVar;
                            }
                        }
                        bravo = bravo();
                        if (bravo != null) {
                            this.oscar.purple = golf(bravo, false);
                        }
                        lVar2.yankee(this.oscar, executor);
                        androidx.camera.core.impl.L delta = androidx.camera.core.impl.L.delta(alVar, c0509g.alpha);
                        aVar = c0509g.delta;
                        if (aVar != null) {
                            delta.bravo.echo(aVar);
                        }
                        j5 = this.sierra;
                        if (j5 != null) {
                            j5.alpha();
                        }
                        J j6 = new J(lVar2.romeo(), size, this.foxtrot.oscar());
                        this.sierra = j6;
                        be.h.delta(j6.echo).foxtrot(new A8.g(24, lVar2, lVar), tg.k.echo());
                        Range range = c0509g.charlie;
                        S2.l lVar3 = delta.bravo;
                        lVar3.getClass();
                        ((androidx.camera.core.impl.aw) lVar3.silver).hotel(androidx.camera.core.impl.ad.juliet, range);
                        delta.bravo(this.sierra, c0509g.bravo, -1);
                        m4 = this.tango;
                        if (m4 != null) {
                            m4.bravo();
                        }
                        androidx.camera.core.impl.M m5 = new androidx.camera.core.impl.M(new x(0, this));
                        this.tango = m5;
                        delta.foxtrot = m5;
                        return delta;
                    }
                    z11 = false;
                    if (!z10) {
                    }
                    lVar = new S2.l(AbstractC3061t3.bravo(width, height, i5, lVar2.uniform()));
                    if (lVar != null) {
                    }
                    bravo = bravo();
                    if (bravo != null) {
                    }
                    lVar2.yankee(this.oscar, executor);
                    androidx.camera.core.impl.L delta2 = androidx.camera.core.impl.L.delta(alVar, c0509g.alpha);
                    aVar = c0509g.delta;
                    if (aVar != null) {
                    }
                    j5 = this.sierra;
                    if (j5 != null) {
                    }
                    J j62 = new J(lVar2.romeo(), size, this.foxtrot.oscar());
                    this.sierra = j62;
                    be.h.delta(j62.echo).foxtrot(new A8.g(24, lVar2, lVar), tg.k.echo());
                    Range range2 = c0509g.charlie;
                    S2.l lVar32 = delta2.bravo;
                    lVar32.getClass();
                    ((androidx.camera.core.impl.aw) lVar32.silver).hotel(androidx.camera.core.impl.ad.juliet, range2);
                    delta2.bravo(this.sierra, c0509g.bravo, -1);
                    m4 = this.tango;
                    if (m4 != null) {
                    }
                    androidx.camera.core.impl.M m52 = new androidx.camera.core.impl.M(new x(0, this));
                    this.tango = m52;
                    delta2.foxtrot = m52;
                    return delta2;
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (!z2) {
            }
            if (beige() != 2) {
            }
            if (this.foxtrot.oscar() != 35) {
            }
            z10 = false;
            if (this.foxtrot.oscar() == 35) {
            }
            z11 = false;
            if (!z10) {
            }
            lVar = new S2.l(AbstractC3061t3.bravo(width, height, i5, lVar2.uniform()));
            if (lVar != null) {
            }
            bravo = bravo();
            if (bravo != null) {
            }
            lVar2.yankee(this.oscar, executor);
            androidx.camera.core.impl.L delta22 = androidx.camera.core.impl.L.delta(alVar, c0509g.alpha);
            aVar = c0509g.delta;
            if (aVar != null) {
            }
            j5 = this.sierra;
            if (j5 != null) {
            }
            J j622 = new J(lVar2.romeo(), size, this.foxtrot.oscar());
            this.sierra = j622;
            be.h.delta(j622.echo).foxtrot(new A8.g(24, lVar2, lVar), tg.k.echo());
            Range range22 = c0509g.charlie;
            S2.l lVar322 = delta22.bravo;
            lVar322.getClass();
            ((androidx.camera.core.impl.aw) lVar322.silver).hotel(androidx.camera.core.impl.ad.juliet, range22);
            delta22.bravo(this.sierra, c0509g.bravo, -1);
            m4 = this.tango;
            if (m4 != null) {
            }
            androidx.camera.core.impl.M m522 = new androidx.camera.core.impl.M(new x(0, this));
            this.tango = m522;
            delta22.foxtrot = m522;
            return delta22;
        }
        throw new ClassCastException();
    }

    public final int beige() {
        androidx.camera.core.impl.al alVar = (androidx.camera.core.impl.al) this.foxtrot;
        alVar.getClass();
        return ((Integer) P0.whiskey(alVar, androidx.camera.core.impl.al.teal, 1)).intValue();
    }

    public final void black(Executor executor, y yVar) {
        synchronized (this.papa) {
            try {
                this.oscar.india(executor, new a4.u(2, yVar));
                if (this.quebec == null) {
                    mike();
                }
                this.quebec = yVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.O
    public final Z echo(boolean z2, c0 c0Var) {
        uniform.getClass();
        androidx.camera.core.impl.al alVar = ab.alpha;
        alVar.getClass();
        androidx.camera.core.impl.af alpha = c0Var.alpha(P0.foxtrot(alVar), 1);
        if (z2) {
            alpha = P0.jade(alpha, alVar);
        }
        if (alpha == null) {
            return null;
        }
        return new androidx.camera.core.impl.al(androidx.camera.core.impl.B.alpha(((aa) juliet(alpha)).bravo));
    }

    @Override // androidx.camera.core.O
    public final Y juliet(androidx.camera.core.impl.af afVar) {
        return new aa(androidx.camera.core.impl.aw.delta(afVar), 0);
    }

    @Override // androidx.camera.core.O
    public final void papa() {
        this.oscar.f2934l = true;
    }

    @Override // androidx.camera.core.O
    public final Z romeo(InterfaceC0523v interfaceC0523v, Y y10) {
        androidx.camera.core.impl.al alVar = (androidx.camera.core.impl.al) this.foxtrot;
        alVar.getClass();
        Boolean bool = (Boolean) P0.whiskey(alVar, androidx.camera.core.impl.al.white, null);
        boolean alpha = interfaceC0523v.hotel().alpha(OnePixelShiftQuirk.class);
        ag agVar = this.oscar;
        if (bool != null) {
            alpha = bool.booleanValue();
        }
        agVar.white = alpha;
        synchronized (this.papa) {
        }
        return y10.bravo();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(foxtrot());
    }

    @Override // androidx.camera.core.O
    public final C0509g uniform(au.a aVar) {
        this.romeo.alpha(aVar);
        Object[] objArr = {this.romeo.charlie()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        amber(Collections.unmodifiableList(arrayList));
        B9.ab alpha = this.golf.alpha();
        alpha.silver = aVar;
        return alpha.xray();
    }

    @Override // androidx.camera.core.O
    public final C0509g victor(C0509g c0509g, C0509g c0509g2) {
        androidx.camera.core.impl.al alVar = (androidx.camera.core.impl.al) this.foxtrot;
        delta();
        androidx.camera.core.impl.L azure = azure(alVar, c0509g);
        this.romeo = azure;
        Object[] objArr = {azure.charlie()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        amber(Collections.unmodifiableList(arrayList));
        return c0509g;
    }

    @Override // androidx.camera.core.O
    public final void whiskey() {
        j4.alpha();
        androidx.camera.core.impl.M m4 = this.tango;
        if (m4 != null) {
            m4.bravo();
            this.tango = null;
        }
        J j5 = this.sierra;
        if (j5 != null) {
            j5.alpha();
            this.sierra = null;
        }
        ag agVar = this.oscar;
        agVar.f2934l = false;
        agVar.delta();
    }

    @Override // androidx.camera.core.O
    public final void xray(Matrix matrix) {
        super.xray(matrix);
        ag agVar = this.oscar;
        synchronized (agVar.f2933k) {
            agVar.e = matrix;
            agVar.f2928f = new Matrix(agVar.e);
        }
    }

    @Override // androidx.camera.core.O
    public final void yankee(Rect rect) {
        this.india = rect;
        ag agVar = this.oscar;
        synchronized (agVar.f2933k) {
            agVar.f2926c = rect;
            agVar.f2927d = new Rect(agVar.f2926c);
        }
    }
}
