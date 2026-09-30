package wf;

import Af.n;
import Nd.h;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.P0;
import java.util.concurrent.CancellationException;
import k4.C2007a;
import kotlin.jvm.internal.Intrinsics;
import vf.AbstractC3220y;
import vf.C3207k;
import vf.V;
import vf.ad;
import vf.ai;
import vf.ao;
import vf.aq;
import vf.d0;

/* renamed from: wf.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3268e extends AbstractC3220y implements ai {
    public final Handler purple;
    public final String red;
    public final boolean silver;
    public final C3268e teal;

    public C3268e(Handler handler, String str, boolean z2) {
        this.purple = handler;
        this.red = str;
        this.silver = z2;
        this.teal = z2 ? this : new C3268e(handler, str, true);
    }

    @Override // vf.AbstractC3220y
    public final void beige(h hVar, Runnable runnable) {
        if (!this.purple.post(runnable)) {
            magenta(hVar, runnable);
        }
    }

    @Override // vf.ai
    public final aq charlie(long j5, final d0 d0Var, h hVar) {
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.purple.postDelayed(d0Var, j5)) {
            return new aq() { // from class: wf.c
                @Override // vf.aq
                public final void dispose() {
                    C3268e.this.purple.removeCallbacks(d0Var);
                }
            };
        }
        magenta(hVar, d0Var);
        return V.alpha;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3268e) {
            C3268e c3268e = (C3268e) obj;
            if (c3268e.purple == this.purple && c3268e.silver == this.silver) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int identityHashCode = System.identityHashCode(this.purple);
        if (this.silver) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return identityHashCode ^ i4;
    }

    @Override // vf.AbstractC3220y
    public final boolean indigo(h hVar) {
        if (this.silver && Intrinsics.areEqual(Looper.myLooper(), this.purple.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // vf.AbstractC3220y
    public AbstractC3220y jade(int i4) {
        Af.f.alpha(i4);
        return this;
    }

    public final void magenta(h hVar, Runnable runnable) {
        ad.juliet(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Cf.e eVar = ao.alpha;
        Cf.d.purple.beige(hVar, runnable);
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        C3268e c3268e;
        String str;
        Cf.e eVar = ao.alpha;
        C3268e c3268e2 = n.alpha;
        if (this == c3268e2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c3268e = c3268e2.teal;
            } catch (UnsupportedOperationException unused) {
                c3268e = null;
            }
            if (this == c3268e) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.red;
            if (str2 == null) {
                str2 = this.purple.toString();
            }
            if (this.silver) {
                return P0.crimson(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // vf.ai
    public final void uniform(long j5, C3207k c3207k) {
        RunnableC3267d runnableC3267d = new RunnableC3267d(0, c3207k, this);
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.purple.postDelayed(runnableC3267d, j5)) {
            c3207k.victor(new C2007a(17, this, runnableC3267d));
        } else {
            magenta(c3207k.teal, runnableC3267d);
        }
    }

    public C3268e(Handler handler) {
        this(handler, null, false);
    }
}
