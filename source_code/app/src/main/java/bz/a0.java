package bz;

import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 {
    public final G3.a alpha;
    public final a0 bravo;
    public final String charlie;
    public final androidx.compose.runtime.ax delta;
    public final androidx.compose.runtime.ax echo;
    public final r0 foxtrot = C0564b.xray(0);
    public final r0 golf = C0564b.xray(Long.MIN_VALUE);
    public final androidx.compose.runtime.ax hotel;
    public final SnapshotStateList india;
    public final SnapshotStateList juliet;
    public final androidx.compose.runtime.ax kilo;
    public final androidx.compose.runtime.ad lima;

    public a0(G3.a aVar, a0 a0Var, String str) {
        this.alpha = aVar;
        this.bravo = a0Var;
        this.charlie = str;
        this.delta = C0564b.zulu(aVar.L());
        this.echo = C0564b.zulu(new W(aVar.L(), aVar.L()));
        Boolean bool = Boolean.FALSE;
        this.hotel = C0564b.zulu(bool);
        this.india = new SnapshotStateList();
        this.juliet = new SnapshotStateList();
        this.kilo = C0564b.zulu(bool);
        this.lima = C0564b.quebec(new S(this, 1));
        aVar.R(this);
    }

    public final void alpha(Object obj, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        boolean india;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1493585151);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(obj);
            } else {
                india = c0585q.india(obj);
            }
            if (india) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(this)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        boolean z11 = true;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if (!hotel()) {
                c0585q.purple(466120769);
                quebec(obj);
                int i12 = i5 & 112;
                if (i12 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object jade = c0585q.jade();
                androidx.compose.runtime.as asVar = C0580l.alpha;
                if (z10 || jade == asVar) {
                    jade = C0564b.quebec(new S(this, 0));
                    c0585q.f(jade);
                }
                if (((Boolean) ((D0) jade).getValue()).booleanValue()) {
                    c0585q.purple(466528884);
                    Object jade2 = c0585q.jade();
                    if (jade2 == asVar) {
                        jade2 = C0564b.november(c0585q);
                        c0585q.f(jade2);
                    }
                    vf.ab abVar = (vf.ab) jade2;
                    boolean india2 = c0585q.india(abVar);
                    if (i12 != 32) {
                        z11 = false;
                    }
                    boolean z12 = india2 | z11;
                    Object jade3 = c0585q.jade();
                    if (z12 || jade3 == asVar) {
                        jade3 = new C0393r(16, abVar, this);
                        c0585q.f(jade3);
                    }
                    C0564b.charlie(abVar, this, (Function1) jade3, c0585q);
                    c0585q.quebec(false);
                } else {
                    c0585q.purple(467771457);
                    c0585q.quebec(false);
                }
                c0585q.quebec(false);
            } else {
                c0585q.purple(467781377);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(i4, 12, this, obj);
        }
    }

    public final long bravo() {
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        long j5 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j5 = Math.max(j5, ((X) snapshotStateList.get(i4)).e.juliet());
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            j5 = Math.max(j5, ((a0) snapshotStateList2.get(i5)).bravo());
        }
        return j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void charlie() {
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x4 = (X) snapshotStateList.get(i4);
            x4.white = null;
            x4.teal = null;
            x4.f3448b = false;
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((a0) snapshotStateList2.get(i5)).charlie();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean delta() {
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((X) snapshotStateList.get(i4)).teal != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (((a0) snapshotStateList2.get(i5)).delta()) {
                return true;
            }
        }
        return false;
    }

    public final long echo() {
        a0 a0Var = this.bravo;
        if (a0Var != null) {
            return a0Var.echo();
        }
        return this.foxtrot.juliet();
    }

    public final V foxtrot() {
        return (V) ((t0) this.echo).getValue();
    }

    public final Object golf() {
        return ((t0) this.delta).getValue();
    }

    public final boolean hotel() {
        return ((Boolean) ((t0) this.kilo).getValue()).booleanValue();
    }

    public final void india(long j5, boolean z2) {
        long j6;
        r0 r0Var = this.golf;
        long juliet = r0Var.juliet();
        G3.a aVar = this.alpha;
        if (juliet == Long.MIN_VALUE) {
            r0Var.kilo(j5);
            ((t0) ((androidx.compose.runtime.ax) aVar.alpha)).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((t0) ((androidx.compose.runtime.ax) aVar.alpha)).getValue()).booleanValue()) {
            ((t0) ((androidx.compose.runtime.ax) aVar.alpha)).setValue(Boolean.TRUE);
        }
        ((t0) this.hotel).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        boolean z10 = true;
        for (int i4 = 0; i4 < size; i4++) {
            X x4 = (X) snapshotStateList.get(i4);
            boolean booleanValue = ((Boolean) ((t0) x4.yellow).getValue()).booleanValue();
            androidx.compose.runtime.ax axVar = x4.yellow;
            if (!booleanValue) {
                if (z2) {
                    j6 = x4.alpha().bravo();
                } else {
                    j6 = j5;
                }
                x4.delta(x4.alpha().foxtrot(j6));
                x4.f3450d = x4.alpha().delta(j6);
                Q alpha = x4.alpha();
                alpha.getClass();
                if (ao.ad.charlie(alpha, j6)) {
                    ((t0) axVar).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((t0) axVar).getValue()).booleanValue()) {
                z10 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            a0 a0Var = (a0) snapshotStateList2.get(i5);
            Object value = ((t0) a0Var.delta).getValue();
            G3.a aVar2 = a0Var.alpha;
            if (!Intrinsics.areEqual(value, aVar2.L())) {
                a0Var.india(j5, z2);
            }
            if (!Intrinsics.areEqual(((t0) a0Var.delta).getValue(), aVar2.L())) {
                z10 = false;
            }
        }
        if (z10) {
            juliet();
        }
    }

    public final void juliet() {
        this.golf.kilo(Long.MIN_VALUE);
        G3.a aVar = this.alpha;
        if (aVar instanceof an) {
            ((an) aVar).Q(((t0) this.delta).getValue());
        }
        oscar(0L);
        ((t0) ((androidx.compose.runtime.ax) aVar.alpha)).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.juliet;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((a0) snapshotStateList.get(i4)).juliet();
        }
    }

    public final void kilo(float f5) {
        Object obj;
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x4 = (X) snapshotStateList.get(i4);
            x4.getClass();
            if (f5 == -4.0f || f5 == -5.0f) {
                Q q4 = x4.white;
                if (q4 != null) {
                    x4.alpha().hotel(q4.charlie);
                    x4.teal = null;
                    x4.white = null;
                }
                if (f5 == -4.0f) {
                    obj = x4.alpha().delta;
                } else {
                    obj = x4.alpha().charlie;
                }
                x4.alpha().hotel(obj);
                x4.alpha().india(obj);
                x4.delta(obj);
                x4.e.kilo(x4.alpha().bravo());
            } else {
                ((androidx.compose.runtime.n0) x4.f3447a).kilo(f5);
            }
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((a0) snapshotStateList2.get(i5)).kilo(f5);
        }
    }

    public final void lima(Object obj, Object obj2) {
        this.golf.kilo(Long.MIN_VALUE);
        G3.a aVar = this.alpha;
        ((t0) ((androidx.compose.runtime.ax) aVar.alpha)).setValue(Boolean.FALSE);
        boolean hotel = hotel();
        androidx.compose.runtime.ax axVar = this.delta;
        if (!hotel || !Intrinsics.areEqual(aVar.L(), obj) || !Intrinsics.areEqual(((t0) axVar).getValue(), obj2)) {
            if (!Intrinsics.areEqual(aVar.L(), obj) && (aVar instanceof an)) {
                ((an) aVar).Q(obj);
            }
            ((t0) axVar).setValue(obj2);
            ((t0) this.kilo).setValue(Boolean.TRUE);
            ((t0) this.echo).setValue(new W(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.juliet;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a0 a0Var = (a0) snapshotStateList.get(i4);
            Intrinsics.charlie(a0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (a0Var.hotel()) {
                a0Var.lima(a0Var.alpha.L(), ((t0) a0Var.delta).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.india;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((X) snapshotStateList2.get(i5)).charlie(0L);
        }
    }

    public final void mike(long j5) {
        r0 r0Var = this.golf;
        if (r0Var.juliet() == Long.MIN_VALUE) {
            r0Var.kilo(j5);
        }
        oscar(j5);
        ((t0) this.hotel).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((X) snapshotStateList.get(i4)).charlie(j5);
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            a0 a0Var = (a0) snapshotStateList2.get(i5);
            if (!Intrinsics.areEqual(((t0) a0Var.delta).getValue(), a0Var.alpha.L())) {
                a0Var.mike(j5);
            }
        }
    }

    public final void november(av avVar) {
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x4 = (X) snapshotStateList.get(i4);
            if (!Intrinsics.areEqual(x4.alpha().charlie, x4.alpha().delta)) {
                x4.white = x4.alpha();
                x4.teal = avVar;
            }
            t0 t0Var = (t0) x4.f3449c;
            ((t0) x4.silver).setValue(new Q(x4.f3452g, x4.alpha, t0Var.getValue(), t0Var.getValue(), x4.f3450d.charlie()));
            x4.e.kilo(x4.alpha().bravo());
            x4.f3448b = true;
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((a0) snapshotStateList2.get(i5)).november(avVar);
        }
    }

    public final void oscar(long j5) {
        if (this.bravo == null) {
            this.foxtrot.kilo(j5);
        }
    }

    public final void papa() {
        Q q4;
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x4 = (X) snapshotStateList.get(i4);
            av avVar = x4.teal;
            if (avVar != null && (q4 = x4.white) != null) {
                long echo = Zd.a.echo(avVar.golf * avVar.delta);
                Object foxtrot = q4.foxtrot(echo);
                if (x4.f3448b) {
                    x4.alpha().india(foxtrot);
                }
                x4.alpha().hotel(foxtrot);
                x4.e.kilo(x4.alpha().bravo());
                if (x4.bravo() == -2.0f || x4.f3448b) {
                    x4.delta(foxtrot);
                } else {
                    x4.charlie(x4.f3453h.echo());
                }
                if (echo >= avVar.golf) {
                    x4.teal = null;
                    x4.white = null;
                } else {
                    avVar.charlie = false;
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.juliet;
        int size2 = snapshotStateList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((a0) snapshotStateList2.get(i5)).papa();
        }
    }

    public final void quebec(Object obj) {
        androidx.compose.runtime.ax axVar = this.delta;
        t0 t0Var = (t0) axVar;
        if (!Intrinsics.areEqual(t0Var.getValue(), obj)) {
            ((t0) this.echo).setValue(new W(t0Var.getValue(), obj));
            G3.a aVar = this.alpha;
            if (!Intrinsics.areEqual(aVar.L(), t0Var.getValue())) {
                aVar.Q(t0Var.getValue());
            }
            ((t0) axVar).setValue(obj);
            if (this.golf.juliet() == Long.MIN_VALUE) {
                ((t0) this.hotel).setValue(Boolean.TRUE);
            }
            SnapshotStateList snapshotStateList = this.india;
            int size = snapshotStateList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((androidx.compose.runtime.n0) ((X) snapshotStateList.get(i4)).f3447a).kilo(-2.0f);
            }
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.india;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i4 = 0; i4 < size; i4++) {
            str = str + ((X) snapshotStateList.get(i4)) + ", ";
        }
        return str;
    }
}
