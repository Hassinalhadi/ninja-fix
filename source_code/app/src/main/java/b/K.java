package b;

import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import kotlin.Unit;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.InterfaceC2558s;
import s0.InterfaceC2559t;
import s6.AbstractC2627c7;
import t6.AbstractC3017k3;
import y.C3352L;

/* loaded from: classes3.dex */
public final class K extends T.r implements InterfaceC2559t, InterfaceC2558s, s0.e0, s0.P {

    /* renamed from: a, reason: collision with root package name */
    public androidx.compose.runtime.ad f3287a;
    public com.clevertap.android.sdk.variables.b alpha;

    /* renamed from: c, reason: collision with root package name */
    public Q0.m f3289c;

    /* renamed from: d, reason: collision with root package name */
    public xf.e f3290d;
    public C3352L purple;
    public X red;
    public View silver;
    public Q0.d teal;
    public W white;
    public final androidx.compose.runtime.ax yellow = C0564b.yankee(null, androidx.compose.runtime.as.red);

    /* renamed from: b, reason: collision with root package name */
    public long f3288b = 9205357640488583168L;

    public K(com.clevertap.android.sdk.variables.b bVar, C3352L c3352l, X x4) {
        this.alpha = bVar;
        this.purple = c3352l;
        this.red = x4;
    }

    public final long b() {
        if (this.f3287a == null) {
            this.f3287a = C0564b.quebec(new I(this, 2));
        }
        androidx.compose.runtime.ad adVar = this.f3287a;
        if (adVar != null) {
            return ((Z.b) adVar.getValue()).alpha;
        }
        return 9205357640488583168L;
    }

    @Override // s0.InterfaceC2558s
    public final /* synthetic */ void blue() {
    }

    public final void c() {
        W w4 = this.white;
        if (w4 != null) {
            ((Y) w4).bravo();
        }
        View view = this.silver;
        if (view == null) {
            view = AbstractC2557q.oscar(this);
        }
        this.silver = view;
        Q0.d dVar = this.teal;
        if (dVar == null) {
            dVar = AbstractC2555o.golf(this).f13298q;
        }
        this.teal = dVar;
        this.white = this.red.bravo(view, dVar);
        e();
    }

    @Override // s0.e0
    public final /* synthetic */ boolean charlie() {
        return true;
    }

    public final void d() {
        Q0.d dVar = this.teal;
        if (dVar == null) {
            dVar = AbstractC2555o.golf(this).f13298q;
            this.teal = dVar;
        }
        long j5 = ((Z.b) this.alpha.invoke(dVar)).alpha;
        if ((j5 & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & b()) != 9205357640488583168L) {
            this.f3288b = Z.b.golf(b(), j5);
            if (this.white == null) {
                c();
            }
            W w4 = this.white;
            if (w4 != null) {
                w4.alpha(this.f3288b, 9205357640488583168L);
            }
            e();
            return;
        }
        this.f3288b = 9205357640488583168L;
        W w10 = this.white;
        if (w10 != null) {
            ((Y) w10).bravo();
        }
    }

    public final void e() {
        Q0.d dVar;
        W w4 = this.white;
        if (w4 == null || (dVar = this.teal) == null) {
            return;
        }
        Y y10 = (Y) w4;
        long charlie = y10.charlie();
        Q0.m mVar = this.f3289c;
        if (!av.q.kilo(mVar) || charlie != mVar.alpha) {
            this.purple.invoke(new Q0.i(dVar.mike(AbstractC2627c7.bravo(y10.charlie()))));
            this.f3289c = new Q0.m(y10.charlie());
        }
    }

    @Override // s0.InterfaceC2559t
    public final void hotel(s0.L l10) {
        ((t0) this.yellow).setValue(l10);
    }

    @Override // s0.e0
    public final void india(A0.ad adVar) {
        ((A0.k) adVar).hotel(L.alpha, new I(this, 1));
    }

    @Override // s0.InterfaceC2558s
    public final void jade(s0.an anVar) {
        anVar.charlie();
        xf.e eVar = this.f3290d;
        if (eVar != null) {
            eVar.mike(Unit.INSTANCE);
        }
    }

    @Override // s0.P
    public final void magenta() {
        AbstractC2557q.november(this, new I(this, 0));
    }

    @Override // T.r
    public final void onAttach() {
        magenta();
        this.f3290d = AbstractC3017k3.bravo(0, 7, null);
        vf.ad.zulu(getCoroutineScope(), null, vf.ac.silver, new J(this, null), 1);
    }

    @Override // T.r
    public final void onDetach() {
        W w4 = this.white;
        if (w4 != null) {
            ((Y) w4).bravo();
        }
        this.white = null;
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
