package I0;

import D0.ak;
import D0.am;
import Lb.W;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import id.C1915c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.C2146v;
import s6.AbstractC2813x5;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ad implements v {
    public final View alpha;
    public final C1915c bravo;
    public final ae charlie;
    public boolean delta;
    public Function1 echo;
    public Function1 foxtrot;
    public aa golf;
    public l hotel;
    public final ArrayList india;
    public final Object juliet;
    public Rect kilo;
    public final c lima;
    public final J.e mike;
    public A2.q november;

    public ad(View view, C2946x c2946x) {
        C1915c c1915c = new C1915c(view);
        ae aeVar = new ae(0, Choreographer.getInstance());
        this.alpha = view;
        this.bravo = c1915c;
        this.charlie = aeVar;
        this.echo = b.silver;
        this.foxtrot = b.teal;
        this.golf = new aa(4, am.bravo, "");
        this.hotel = l.golf;
        this.india = new ArrayList();
        this.juliet = LazyKt.alpha(kotlin.i.purple, new Aa.g(23, this));
        this.lima = new c(c2946x, c1915c);
        this.mike = new J.e(new ac[16]);
    }

    @Override // I0.v
    public final void alpha(Z.c cVar) {
        Rect rect;
        this.kilo = new Rect(Zd.a.delta(cVar.alpha), Zd.a.delta(cVar.bravo), Zd.a.delta(cVar.charlie), Zd.a.delta(cVar.delta));
        if (this.india.isEmpty() && (rect = this.kilo) != null) {
            this.alpha.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // I0.v
    public final void bravo() {
        india(ac.alpha);
    }

    @Override // I0.v
    public final void charlie(aa aaVar, t tVar, ak akVar, W w4, Z.c cVar, Z.c cVar2) {
        c cVar3 = this.lima;
        synchronized (cVar3.charlie) {
            try {
                cVar3.juliet = aaVar;
                cVar3.lima = tVar;
                cVar3.kilo = akVar;
                cVar3.mike = w4;
                cVar3.november = cVar;
                cVar3.oscar = cVar2;
                if (!cVar3.echo) {
                    if (cVar3.delta) {
                    }
                }
                cVar3.alpha();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.v
    public final void delta() {
        india(ac.red);
    }

    @Override // I0.v
    public final void echo() {
        this.delta = false;
        this.echo = b.white;
        this.foxtrot = b.yellow;
        this.kilo = null;
        india(ac.purple);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // I0.v
    public final void foxtrot(aa aaVar, aa aaVar2) {
        boolean z2;
        int i4;
        int i5;
        int i10;
        if (am.bravo(this.golf.bravo, aaVar2.bravo) && Intrinsics.areEqual(this.golf.charlie, aaVar2.charlie)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.golf = aaVar2;
        int size = this.india.size();
        for (int i11 = 0; i11 < size; i11++) {
            w wVar = (w) ((WeakReference) this.india.get(i11)).get();
            if (wVar != null) {
                wVar.delta = aaVar2;
            }
        }
        c cVar = this.lima;
        synchronized (cVar.charlie) {
            cVar.juliet = null;
            cVar.lima = null;
            cVar.kilo = null;
            cVar.mike = b.purple;
            cVar.november = null;
            cVar.oscar = null;
        }
        int i12 = -1;
        if (Intrinsics.areEqual(aaVar, aaVar2)) {
            if (z2) {
                C1915c c1915c = this.bravo;
                int foxtrot = am.foxtrot(aaVar2.bravo);
                int echo = am.echo(aaVar2.bravo);
                am amVar = this.golf.charlie;
                if (amVar != null) {
                    i10 = am.foxtrot(amVar.alpha);
                } else {
                    i10 = -1;
                }
                am amVar2 = this.golf.charlie;
                if (amVar2 != null) {
                    i12 = am.echo(amVar2.alpha);
                }
                ((InputMethodManager) c1915c.red.getValue()).updateSelection((View) c1915c.purple, foxtrot, echo, i10, i12);
                return;
            }
            return;
        }
        if (aaVar != null && (!Intrinsics.areEqual(aaVar.alpha.purple, aaVar2.alpha.purple) || (am.bravo(aaVar.bravo, aaVar2.bravo) && !Intrinsics.areEqual(aaVar.charlie, aaVar2.charlie)))) {
            C1915c c1915c2 = this.bravo;
            ((InputMethodManager) c1915c2.red.getValue()).restartInput((View) c1915c2.purple);
            return;
        }
        int size2 = this.india.size();
        for (int i13 = 0; i13 < size2; i13++) {
            w wVar2 = (w) ((WeakReference) this.india.get(i13)).get();
            if (wVar2 != null) {
                aa aaVar3 = this.golf;
                C1915c c1915c3 = this.bravo;
                if (wVar2.hotel) {
                    wVar2.delta = aaVar3;
                    if (wVar2.foxtrot) {
                        ((InputMethodManager) c1915c3.red.getValue()).updateExtractedText((View) c1915c3.purple, wVar2.echo, AbstractC2813x5.bravo(aaVar3));
                    }
                    am amVar3 = aaVar3.charlie;
                    if (amVar3 != null) {
                        i4 = am.foxtrot(amVar3.alpha);
                    } else {
                        i4 = -1;
                    }
                    am amVar4 = aaVar3.charlie;
                    if (amVar4 != null) {
                        i5 = am.echo(amVar4.alpha);
                    } else {
                        i5 = -1;
                    }
                    long j5 = aaVar3.bravo;
                    ((InputMethodManager) c1915c3.red.getValue()).updateSelection((View) c1915c3.purple, am.foxtrot(j5), am.echo(j5), i4, i5);
                }
            }
        }
    }

    @Override // I0.v
    public final void golf() {
        india(ac.silver);
    }

    @Override // I0.v
    public final void hotel(aa aaVar, l lVar, Cb.ac acVar, C2146v c2146v) {
        this.delta = true;
        this.golf = aaVar;
        this.hotel = lVar;
        this.echo = acVar;
        this.foxtrot = c2146v;
        india(ac.alpha);
    }

    public final void india(ac acVar) {
        this.mike.bravo(acVar);
        if (this.november == null) {
            A2.q qVar = new A2.q(7, this);
            this.charlie.execute(qVar);
            this.november = qVar;
        }
    }
}
