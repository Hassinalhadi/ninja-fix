package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.appcompat.widget.P0;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.c0;
import bd.ScheduledExecutorServiceC0750c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import s6.T7;
import t6.j4;

/* loaded from: classes3.dex */
public final class az extends O {
    public static final ax victor = new Object();
    public static final ScheduledExecutorServiceC0750c whiskey = tg.k.echo();
    public ay oscar;
    public ScheduledExecutorServiceC0750c papa;
    public androidx.camera.core.impl.L quebec;
    public J romeo;
    public bj.k sierra;
    public M tango;
    public androidx.camera.core.impl.M uniform;

    public final void azure() {
        androidx.camera.core.impl.M m4 = this.uniform;
        if (m4 != null) {
            m4.bravo();
            this.uniform = null;
        }
        J j5 = this.romeo;
        if (j5 != null) {
            j5.alpha();
            this.romeo = null;
        }
        bj.k kVar = this.sierra;
        if (kVar != null) {
            kVar.bravo();
            this.sierra = null;
        }
        this.tango = null;
    }

    public final void beige(ay ayVar) {
        j4.alpha();
        Size size = null;
        if (ayVar == null) {
            this.oscar = null;
            this.charlie = 2;
            oscar();
            return;
        }
        this.oscar = ayVar;
        this.papa = whiskey;
        C0509g c0509g = this.golf;
        if (c0509g != null) {
            size = c0509g.alpha;
        }
        if (size != null) {
            black((androidx.camera.core.impl.C) this.foxtrot, c0509g);
            november();
        }
        mike();
    }

    public final void black(androidx.camera.core.impl.C c3, C0509g c0509g) {
        boolean z2;
        boolean z10;
        j4.alpha();
        InterfaceC0525x bravo = bravo();
        Objects.requireNonNull(bravo);
        azure();
        if (this.sierra == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Rect rect = null;
        T7.golf(null, z2);
        Matrix matrix = this.juliet;
        boolean mike = bravo.mike();
        Size size = c0509g.alpha;
        Rect rect2 = this.india;
        if (rect2 == null) {
            if (size != null) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect2 = rect;
        }
        Objects.requireNonNull(rect2);
        int golf = golf(bravo, kilo(bravo));
        int peach = ((androidx.camera.core.impl.ap) this.foxtrot).peach();
        if (bravo.mike() && kilo(bravo)) {
            z10 = true;
        } else {
            z10 = false;
        }
        bj.k kVar = new bj.k(1, 34, c0509g, matrix, mike, rect2, golf, peach, z10);
        this.sierra = kVar;
        A2.q qVar = new A2.q(27, this);
        j4.alpha();
        kVar.alpha();
        kVar.mike.add(qVar);
        M charlie = this.sierra.charlie(bravo, true);
        this.tango = charlie;
        this.romeo = charlie.kilo;
        if (this.oscar != null) {
            InterfaceC0525x bravo2 = bravo();
            bj.k kVar2 = this.sierra;
            if (bravo2 != null && kVar2 != null) {
                j4.delta(new bj.h(kVar2, golf(bravo2, kilo(bravo2)), ((androidx.camera.core.impl.ap) this.foxtrot).peach()));
            }
            ay ayVar = this.oscar;
            ayVar.getClass();
            M m4 = this.tango;
            m4.getClass();
            this.papa.execute(new A8.g(26, ayVar, m4));
        }
        androidx.camera.core.impl.L delta = androidx.camera.core.impl.L.delta(c3, c0509g.alpha);
        S2.l lVar = delta.bravo;
        lVar.getClass();
        ((androidx.camera.core.impl.aw) lVar.silver).hotel(androidx.camera.core.impl.ad.juliet, c0509g.charlie);
        int india = P0.india(c3);
        if (india != 0) {
            lVar.getClass();
            if (india != 0) {
                ((androidx.camera.core.impl.aw) lVar.silver).hotel(Z.black, Integer.valueOf(india));
            }
        }
        au.a aVar = c0509g.delta;
        if (aVar != null) {
            lVar.echo(aVar);
        }
        if (this.oscar != null) {
            delta.bravo(this.romeo, c0509g.bravo, ((androidx.camera.core.impl.ap) this.foxtrot).papa());
        }
        androidx.camera.core.impl.M m5 = this.uniform;
        if (m5 != null) {
            m5.bravo();
        }
        androidx.camera.core.impl.M m8 = new androidx.camera.core.impl.M(new x(2, this));
        this.uniform = m8;
        delta.foxtrot = m8;
        this.quebec = delta;
        Object[] objArr = {delta.charlie()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        amber(Collections.unmodifiableList(arrayList));
    }

    @Override // androidx.camera.core.O
    public final Z echo(boolean z2, c0 c0Var) {
        victor.getClass();
        androidx.camera.core.impl.C c3 = ax.alpha;
        c3.getClass();
        androidx.camera.core.impl.af alpha = c0Var.alpha(P0.foxtrot(c3), 1);
        if (z2) {
            alpha = P0.jade(alpha, c3);
        }
        if (alpha == null) {
            return null;
        }
        return new androidx.camera.core.impl.C(androidx.camera.core.impl.B.alpha(((aa) juliet(alpha)).bravo));
    }

    @Override // androidx.camera.core.O
    public final Set india() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.O
    public final Y juliet(androidx.camera.core.impl.af afVar) {
        return new aa(androidx.camera.core.impl.aw.delta(afVar), 1);
    }

    @Override // androidx.camera.core.O
    public final Z romeo(InterfaceC0523v interfaceC0523v, Y y10) {
        ((androidx.camera.core.impl.aw) y10.alpha()).hotel(androidx.camera.core.impl.an.india, 34);
        return y10.bravo();
    }

    public final String toString() {
        return "Preview:".concat(foxtrot());
    }

    @Override // androidx.camera.core.O
    public final C0509g uniform(au.a aVar) {
        this.quebec.alpha(aVar);
        Object[] objArr = {this.quebec.charlie()};
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
        black((androidx.camera.core.impl.C) this.foxtrot, c0509g);
        return c0509g;
    }

    @Override // androidx.camera.core.O
    public final void whiskey() {
        azure();
    }

    @Override // androidx.camera.core.O
    public final void yankee(Rect rect) {
        this.india = rect;
        InterfaceC0525x bravo = bravo();
        bj.k kVar = this.sierra;
        if (bravo != null && kVar != null) {
            j4.delta(new bj.h(kVar, golf(bravo, kilo(bravo)), ((androidx.camera.core.impl.ap) this.foxtrot).peach()));
        }
    }
}
