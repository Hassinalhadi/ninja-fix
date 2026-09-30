package bj;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C0502i;
import androidx.camera.core.E;
import androidx.camera.core.J;
import androidx.camera.core.L;
import androidx.camera.core.M;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.ai;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import r1.InterfaceC2482a;
import s6.T7;
import t6.j4;

/* loaded from: classes3.dex */
public final class k {
    public final int alpha;
    public final Matrix bravo;
    public final boolean charlie;
    public final Rect delta;
    public final boolean echo;
    public final int foxtrot;
    public final C0509g golf;
    public int hotel;
    public int india;
    public M kilo;
    public j lima;
    public boolean juliet = false;
    public final HashSet mike = new HashSet();
    public boolean november = false;
    public final ArrayList oscar = new ArrayList();

    public k(int i4, int i5, C0509g c0509g, Matrix matrix, boolean z2, Rect rect, int i10, int i11, boolean z10) {
        this.foxtrot = i4;
        this.alpha = i5;
        this.golf = c0509g;
        this.bravo = matrix;
        this.charlie = z2;
        this.delta = rect;
        this.india = i10;
        this.hotel = i11;
        this.echo = z10;
        this.lima = new j(c0509g.alpha, i5);
    }

    public final void alpha() {
        T7.golf("Edge is already closed.", !this.november);
    }

    public final void bravo() {
        j4.alpha();
        this.lima.alpha();
        this.november = true;
    }

    public final M charlie(InterfaceC0525x interfaceC0525x, boolean z2) {
        j4.alpha();
        alpha();
        C0509g c0509g = this.golf;
        M m4 = new M(c0509g.alpha, interfaceC0525x, z2, c0509g.bravo, new f(this, 0));
        try {
            J j5 = m4.kilo;
            j jVar = this.lima;
            Objects.requireNonNull(jVar);
            if (jVar.golf(j5, new g(jVar, 0))) {
                be.h.delta(jVar.echo).foxtrot(new ai(14, j5), tg.k.bravo());
            }
            this.kilo = m4;
            echo();
            return m4;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e4) {
            m4.charlie();
            throw e4;
        }
    }

    public final void delta() {
        boolean z2;
        j4.alpha();
        alpha();
        j jVar = this.lima;
        jVar.getClass();
        j4.alpha();
        if (jVar.quebec == null) {
            synchronized (jVar.alpha) {
                z2 = jVar.charlie;
            }
            if (!z2) {
                return;
            }
        }
        this.juliet = false;
        this.lima.alpha();
        this.lima = new j(this.golf.alpha, this.alpha);
        Iterator it = this.mike.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void echo() {
        L l10;
        Executor executor;
        j4.alpha();
        C0502i c0502i = new C0502i(this.delta, this.india, this.hotel, this.charlie, this.bravo, this.echo);
        M m4 = this.kilo;
        if (m4 != null) {
            synchronized (m4.alpha) {
                m4.lima = c0502i;
                l10 = m4.mike;
                executor = m4.november;
            }
            if (l10 != null && executor != null) {
                executor.execute(new E(l10, c0502i, 0));
            }
        }
        Iterator it = this.oscar.iterator();
        while (it.hasNext()) {
            ((InterfaceC2482a) it.next()).accept(c0502i);
        }
    }
}
