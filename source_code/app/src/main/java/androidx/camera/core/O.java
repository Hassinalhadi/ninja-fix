package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.c0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import s6.T7;

/* loaded from: classes3.dex */
public abstract class O {
    public Z delta;
    public final Object echo;
    public Z foxtrot;
    public C0509g golf;
    public Z hotel;
    public Rect india;
    public InterfaceC0525x kilo;
    public InterfaceC0525x lima;
    public final HashSet alpha = new HashSet();
    public final Object bravo = new Object();
    public int charlie = 2;
    public Matrix juliet = new Matrix();
    public androidx.camera.core.impl.P mike = androidx.camera.core.impl.P.alpha();
    public androidx.camera.core.impl.P november = androidx.camera.core.impl.P.alpha();

    public O(Z z2) {
        this.echo = z2;
        this.foxtrot = z2;
    }

    public final void alpha(InterfaceC0525x interfaceC0525x, InterfaceC0525x interfaceC0525x2, Z z2, Z z10) {
        synchronized (this.bravo) {
            this.kilo = interfaceC0525x;
            this.lima = interfaceC0525x2;
            this.alpha.add(interfaceC0525x);
            if (interfaceC0525x2 != null) {
                this.alpha.add(interfaceC0525x2);
            }
        }
        this.delta = z2;
        this.hotel = z10;
        this.foxtrot = lima(interfaceC0525x.oscar(), this.delta, this.hotel);
        papa();
    }

    public final void amber(List list) {
        if (!list.isEmpty()) {
            this.mike = (androidx.camera.core.impl.P) list.get(0);
            if (list.size() > 1) {
                this.november = (androidx.camera.core.impl.P) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (androidx.camera.core.impl.ah ahVar : ((androidx.camera.core.impl.P) it.next()).bravo()) {
                    if (ahVar.juliet == null) {
                        ahVar.juliet = getClass();
                    }
                }
            }
        }
    }

    public final InterfaceC0525x bravo() {
        InterfaceC0525x interfaceC0525x;
        synchronized (this.bravo) {
            interfaceC0525x = this.kilo;
        }
        return interfaceC0525x;
    }

    public final InterfaceC0522u charlie() {
        synchronized (this.bravo) {
            try {
                InterfaceC0525x interfaceC0525x = this.kilo;
                if (interfaceC0525x == null) {
                    return InterfaceC0522u.hotel;
                }
                return interfaceC0525x.golf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String delta() {
        InterfaceC0525x bravo = bravo();
        T7.foxtrot(bravo, "No camera attached to use case: " + this);
        return bravo.oscar().bravo();
    }

    public abstract Z echo(boolean z2, c0 c0Var);

    public final String foxtrot() {
        String blue = this.foxtrot.blue("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(blue);
        return blue;
    }

    public final int golf(InterfaceC0525x interfaceC0525x, boolean z2) {
        int golf = interfaceC0525x.oscar().golf(((androidx.camera.core.impl.ap) this.foxtrot).crimson());
        if (!interfaceC0525x.mike() && z2) {
            return bc.f.foxtrot(-golf);
        }
        return golf;
    }

    public final InterfaceC0525x hotel() {
        InterfaceC0525x interfaceC0525x;
        synchronized (this.bravo) {
            interfaceC0525x = this.lima;
        }
        return interfaceC0525x;
    }

    public Set india() {
        return Collections.EMPTY_SET;
    }

    public abstract Y juliet(androidx.camera.core.impl.af afVar);

    public final boolean kilo(InterfaceC0525x interfaceC0525x) {
        int papa = ((androidx.camera.core.impl.ap) this.foxtrot).papa();
        if (papa != -1 && papa != 0) {
            if (papa == 1) {
                return true;
            }
            if (papa == 2) {
                return interfaceC0525x.bravo();
            }
            throw new AssertionError(ao.ad.zulu(papa, "Unknown mirrorMode: "));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.camera.core.impl.af, java.lang.Object] */
    public final Z lima(InterfaceC0523v interfaceC0523v, Z z2, Z z10) {
        androidx.camera.core.impl.aw bravo;
        if (z10 != null) {
            bravo = androidx.camera.core.impl.aw.delta(z10);
            bravo.alpha.remove(bf.j.crimson);
        } else {
            bravo = androidx.camera.core.impl.aw.bravo();
        }
        C0505c c0505c = androidx.camera.core.impl.ap.kilo;
        ?? r12 = this.echo;
        boolean echo = r12.echo(c0505c);
        TreeMap treeMap = bravo.alpha;
        if (echo || r12.echo(androidx.camera.core.impl.ap.oscar)) {
            C0505c c0505c2 = androidx.camera.core.impl.ap.sierra;
            if (treeMap.containsKey(c0505c2)) {
                treeMap.remove(c0505c2);
            }
        }
        C0505c c0505c3 = androidx.camera.core.impl.ap.sierra;
        if (r12.echo(c0505c3)) {
            C0505c c0505c4 = androidx.camera.core.impl.ap.quebec;
            if (treeMap.containsKey(c0505c4) && ((bm.b) r12.quebec(c0505c3)).bravo != null) {
                treeMap.remove(c0505c4);
            }
        }
        Iterator it = r12.romeo().iterator();
        while (it.hasNext()) {
            P0.lavender(bravo, bravo, r12, (C0505c) it.next());
        }
        if (z2 != null) {
            for (C0505c c0505c5 : z2.romeo()) {
                if (!c0505c5.alpha.equals(bf.j.crimson.alpha)) {
                    P0.lavender(bravo, bravo, z2, c0505c5);
                }
            }
        }
        if (treeMap.containsKey(androidx.camera.core.impl.ap.oscar)) {
            C0505c c0505c6 = androidx.camera.core.impl.ap.kilo;
            if (treeMap.containsKey(c0505c6)) {
                treeMap.remove(c0505c6);
            }
        }
        C0505c c0505c7 = androidx.camera.core.impl.ap.sierra;
        if (treeMap.containsKey(c0505c7)) {
            ((bm.b) bravo.quebec(c0505c7)).getClass();
        }
        return romeo(interfaceC0523v, juliet(bravo));
    }

    public final void mike() {
        this.charlie = 1;
        oscar();
    }

    public final void november() {
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((N) it.next()).delta(this);
        }
    }

    public final void oscar() {
        int mike = av.q.mike(this.charlie);
        HashSet hashSet = this.alpha;
        if (mike != 0) {
            if (mike == 1) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((N) it.next()).papa(this);
                }
                return;
            }
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((N) it2.next()).charlie(this);
        }
    }

    public void papa() {
    }

    public void quebec() {
    }

    public abstract Z romeo(InterfaceC0523v interfaceC0523v, Y y10);

    public void sierra() {
    }

    public void tango() {
    }

    public abstract C0509g uniform(au.a aVar);

    public abstract C0509g victor(C0509g c0509g, C0509g c0509g2);

    public abstract void whiskey();

    public void xray(Matrix matrix) {
        this.juliet = new Matrix(matrix);
    }

    public void yankee(Rect rect) {
        this.india = rect;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.camera.core.impl.Z, java.lang.Object] */
    public final void zulu(InterfaceC0525x interfaceC0525x) {
        whiskey();
        synchronized (this.bravo) {
            try {
                InterfaceC0525x interfaceC0525x2 = this.kilo;
                if (interfaceC0525x == interfaceC0525x2) {
                    this.alpha.remove(interfaceC0525x2);
                    this.kilo = null;
                }
                InterfaceC0525x interfaceC0525x3 = this.lima;
                if (interfaceC0525x == interfaceC0525x3) {
                    this.alpha.remove(interfaceC0525x3);
                    this.lima = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.golf = null;
        this.india = null;
        this.foxtrot = this.echo;
        this.delta = null;
        this.hotel = null;
    }
}
