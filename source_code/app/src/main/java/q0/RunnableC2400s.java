package q0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import j1.C1929c;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import s1.C2575h;
import s1.InterfaceC2587u;
import s1.a0;

/* renamed from: q0.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2400s extends Pf.g implements Runnable, InterfaceC2587u, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final bv.ah f13158a;

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotStateList f13159b;
    public boolean red;
    public int silver;
    public a0 teal;
    public final bv.al white;
    public final p0 yellow;

    public RunnableC2400s() {
        super(1);
        bv.al alVar = new bv.al(9);
        U.alpha.getClass();
        alVar.mike(T.bravo, new W("caption bar"));
        alVar.mike(T.charlie, new W("display cutout"));
        alVar.mike(T.delta, new W("ime"));
        alVar.mike(T.echo, new W("mandatory system gestures"));
        alVar.mike(T.foxtrot, new W("navigation bars"));
        alVar.mike(T.golf, new W("status bars"));
        alVar.mike(T.hotel, new W("system gestures"));
        alVar.mike(T.india, new W("tappable element"));
        alVar.mike(T.juliet, new W("waterfall"));
        this.white = alVar;
        this.yellow = C0564b.whiskey(0);
        this.f13158a = new bv.ah(4);
        this.f13159b = new SnapshotStateList();
    }

    public final void beige(a0 a0Var) {
        long j5;
        char c3;
        char c4;
        char c10;
        char c11;
        boolean z2;
        boolean z10;
        boolean z11;
        long j6;
        int i4;
        int i5;
        int i10;
        int i11;
        long j7;
        List list;
        boolean z12;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i12;
        bv.aa aaVar = androidx.compose.ui.layout.b.alpha;
        int[] iArr5 = aaVar.bravo;
        Object[] objArr = aaVar.charlie;
        long[] jArr5 = aaVar.alpha;
        int length = jArr5.length - 2;
        int i13 = 8;
        if (length >= 0) {
            int i14 = 0;
            z10 = false;
            j5 = 255;
            z11 = false;
            c3 = 7;
            c4 = 16;
            while (true) {
                long j10 = jArr5[i14];
                c10 = ' ';
                c11 = '0';
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr5[i17];
                            i12 = i13;
                            U u4 = (U) objArr[i17];
                            C1929c golf = a0Var.alpha.golf(i18);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j11 = (golf.bravo << 32) | (golf.alpha << 48) | (golf.charlie << 16) | golf.delta;
                            Object golf2 = this.white.golf(u4);
                            Intrinsics.checkNotNull(golf2);
                            W w4 = (W) golf2;
                            if (!AbstractC2375K.golf(j11, w4.hotel)) {
                                w4.hotel = j11;
                                z10 = true;
                                if (!AbstractC2375K.golf(j11, 0L)) {
                                    z11 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i12 = i13;
                        }
                        j10 >>= i12;
                        i16++;
                        jArr5 = jArr4;
                        i13 = i12;
                        iArr5 = iArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z2 = true;
                    if (i15 != i13) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z2 = true;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                jArr5 = jArr3;
                iArr5 = iArr3;
                i13 = 8;
            }
        } else {
            j5 = 255;
            c3 = 7;
            c4 = 16;
            c10 = ' ';
            c11 = '0';
            z2 = true;
            z10 = false;
            z11 = false;
        }
        bv.aa aaVar2 = androidx.compose.ui.layout.b.charlie;
        int[] iArr6 = aaVar2.bravo;
        Object[] objArr2 = aaVar2.charlie;
        long[] jArr6 = aaVar2.alpha;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j12 = jArr6[i19];
                if ((((~j12) << c3) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j12 & j5) < 128) {
                            int i22 = (i19 << 3) + i21;
                            int i23 = iArr6[i22];
                            Object golf3 = this.white.golf((U) objArr2[i22]);
                            Intrinsics.checkNotNull(golf3);
                            W w10 = (W) golf3;
                            if (i23 != 8) {
                                C1929c hotel = a0Var.alpha.hotel(i23);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j13 = (hotel.alpha << c11) | (hotel.bravo << c10) | (hotel.charlie << c4) | hotel.delta;
                                if (!AbstractC2375K.golf(w10.india, j13)) {
                                    w10.india = j13;
                                    z10 = z2;
                                    if (!AbstractC2375K.golf(j13, 0L)) {
                                        z11 = z10;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            ((t0) w10.alpha).setValue(Boolean.valueOf(a0Var.alpha.quebec(i23)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j12 >>= 8;
                        i21++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i20 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                iArr6 = iArr;
                jArr6 = jArr;
            }
        }
        C2575h foxtrot = a0Var.alpha.foxtrot();
        if (foxtrot == null) {
            j6 = 0;
        } else {
            C1929c alpha = foxtrot.alpha();
            j6 = (alpha.alpha << c11) | (alpha.bravo << c10) | (alpha.charlie << c4) | alpha.delta;
        }
        bv.al alVar = this.white;
        U.alpha.getClass();
        Object golf4 = alVar.golf(T.juliet);
        Intrinsics.checkNotNull(golf4);
        W w11 = (W) golf4;
        if (!AbstractC2375K.golf(w11.hotel, j6)) {
            w11.hotel = j6;
            w11.india = j6;
            z10 = z2;
            if (!AbstractC2375K.golf(j6, 0L)) {
                z11 = z10;
            }
        }
        if (foxtrot == null) {
            j7 = 0;
        } else {
            int i24 = Build.VERSION.SDK_INT;
            if (i24 >= 28) {
                i4 = E2.e.juliet(foxtrot.alpha);
            } else {
                i4 = 0;
            }
            if (i24 >= 28) {
                i5 = E2.e.lima(foxtrot.alpha);
            } else {
                i5 = 0;
            }
            if (i24 >= 28) {
                i10 = E2.e.kilo(foxtrot.alpha);
            } else {
                i10 = 0;
            }
            if (i24 >= 28) {
                i11 = E2.e.india(foxtrot.alpha);
            } else {
                i11 = 0;
            }
            j7 = i11 | (i5 << c10) | (i4 << c11) | (i10 << c4);
        }
        Object golf5 = this.white.golf(T.charlie);
        Intrinsics.checkNotNull(golf5);
        W w12 = (W) golf5;
        if (!AbstractC2375K.golf(j7, w12.hotel)) {
            w12.hotel = j7;
            w12.india = j7;
            z10 = z2;
            if (!AbstractC2375K.golf(j7, 0L)) {
                z11 = z10;
            }
        }
        if (foxtrot == null) {
            bv.ah ahVar = this.f13158a;
            if (ahVar.bravo > 0) {
                ahVar.india();
                this.f13159b.clear();
                z10 = z2;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                list = E2.e.charlie(foxtrot.alpha);
            } else {
                list = Collections.EMPTY_LIST;
            }
            int size = list.size();
            bv.ah ahVar2 = this.f13158a;
            if (size < ahVar2.bravo) {
                ahVar2.lima(list.size(), this.f13158a.bravo);
                this.f13159b.kilo(list.size(), this.f13159b.size());
                z10 = z2;
            } else {
                int size2 = list.size() - this.f13158a.bravo;
                int i25 = 0;
                while (i25 < size2) {
                    bv.ah ahVar3 = this.f13158a;
                    ahVar3.golf(C0564b.zulu(list.get(ahVar3.bravo)));
                    this.f13159b.add(new C2399r("display cutout rect " + this.f13158a.bravo));
                    i25++;
                    z10 = z2;
                }
            }
            int size3 = list.size();
            for (int i26 = 0; i26 < size3; i26++) {
                Rect rect = (Rect) list.get(i26);
                androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) this.f13158a.bravo(i26);
                if (!Intrinsics.areEqual(axVar.getValue(), rect)) {
                    axVar.setValue(rect);
                    z10 = z2;
                }
            }
            if (!list.isEmpty()) {
                z11 = z2;
            }
        }
        if ((z11 || this.yellow.juliet() != 0) && z10) {
            p0 p0Var = this.yellow;
            p0Var.kilo(p0Var.juliet() + 1);
            synchronized (S.n.charlie) {
                bv.am amVar = S.n.juliet.hotel;
                if (amVar != null) {
                    boolean z13 = z2;
                    if (amVar.hotel() == z13) {
                        z12 = z13;
                    }
                }
                z12 = false;
            }
            if (z12) {
                S.n.alpha();
            }
        }
    }

    @Override // Pf.g
    public final void delta(s1.I i4) {
        boolean z2 = false;
        this.red = false;
        int delta = i4.alpha.delta();
        this.silver &= ~delta;
        this.teal = null;
        U u4 = (U) androidx.compose.ui.layout.b.charlie.bravo(delta);
        if (u4 != null) {
            Object golf = this.white.golf(u4);
            Intrinsics.checkNotNull(golf);
            W w4 = (W) golf;
            ((n0) w4.charlie).kilo(0.0f);
            ((n0) w4.echo).kilo(1.0f);
            w4.delta.kilo(0L);
            ((n0) w4.charlie).kilo(0.0f);
            ((t0) w4.bravo).setValue(Boolean.FALSE);
            w4.juliet = -1L;
            w4.kilo = -1L;
            p0 p0Var = this.yellow;
            p0Var.kilo(p0Var.juliet() + 1);
            synchronized (S.n.charlie) {
                bv.am amVar = S.n.juliet.hotel;
                if (amVar != null) {
                    if (amVar.hotel()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                S.n.alpha();
            }
        }
    }

    @Override // Pf.g
    public final void echo() {
        this.red = true;
    }

    @Override // Pf.g
    public final a0 foxtrot(a0 a0Var, List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            s1.I i5 = (s1.I) list.get(i4);
            U u4 = (U) androidx.compose.ui.layout.b.charlie.bravo(i5.alpha.delta());
            if (u4 != null) {
                Object golf = this.white.golf(u4);
                Intrinsics.checkNotNull(golf);
                W w4 = (W) golf;
                if (((Boolean) ((t0) w4.bravo).getValue()).booleanValue()) {
                    ((n0) w4.charlie).kilo(i5.alpha.charlie());
                    s1.H h4 = i5.alpha;
                    ((n0) w4.echo).kilo(h4.alpha());
                    w4.delta.kilo(h4.bravo());
                }
            }
        }
        beige(a0Var);
        return a0Var;
    }

    @Override // s1.InterfaceC2587u
    public final a0 gold(View view, a0 a0Var) {
        if (this.red) {
            this.teal = a0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return a0Var;
            }
        } else if (this.silver == 0) {
            beige(a0Var);
        }
        return a0Var;
    }

    @Override // Pf.g
    public final com.google.android.play.core.integrity.k golf(s1.I i4, com.google.android.play.core.integrity.k kVar) {
        a0 a0Var = this.teal;
        boolean z2 = false;
        this.red = false;
        this.teal = null;
        if (i4.alpha.bravo() > 0 && a0Var != null) {
            int delta = i4.alpha.delta();
            this.silver |= delta;
            U u4 = (U) androidx.compose.ui.layout.b.charlie.bravo(delta);
            if (u4 != null) {
                Object golf = this.white.golf(u4);
                Intrinsics.checkNotNull(golf);
                W w4 = (W) golf;
                C1929c golf2 = a0Var.alpha.golf(delta);
                long j5 = (golf2.alpha << 48) | (golf2.bravo << 32) | (golf2.charlie << 16) | golf2.delta;
                long j6 = w4.hotel;
                if (!AbstractC2375K.golf(j5, j6)) {
                    w4.juliet = j6;
                    w4.kilo = j5;
                    ((t0) w4.bravo).setValue(Boolean.TRUE);
                    ((n0) w4.charlie).kilo(i4.alpha.charlie());
                    s1.H h4 = i4.alpha;
                    ((n0) w4.echo).kilo(h4.alpha());
                    w4.delta.kilo(h4.bravo());
                    p0 p0Var = this.yellow;
                    p0Var.kilo(p0Var.juliet() + 1);
                    synchronized (S.n.charlie) {
                        bv.am amVar = S.n.juliet.hotel;
                        if (amVar != null) {
                            if (amVar.hotel()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        S.n.alpha();
                        return kVar;
                    }
                }
            }
        }
        return kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = s1.au.alpha;
        s1.al.lima(view, this);
        s1.au.papa(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = s1.au.alpha;
        s1.al.lima(view, null);
        s1.au.papa(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.red) {
            this.silver = 0;
            this.red = false;
            a0 a0Var = this.teal;
            if (a0Var != null) {
                beige(a0Var);
                this.teal = null;
            }
        }
    }
}
