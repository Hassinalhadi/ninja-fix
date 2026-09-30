package d;

import Yb.C0312j0;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import b.C0704t;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import l0.C2047d;
import l0.C2050g;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import t0.C2946x;

/* renamed from: d.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1548o0 {
    public InterfaceC1532g0 alpha;
    public C0704t bravo;
    public C1543m charlie;
    public K delta;
    public boolean echo;
    public C2047d foxtrot;
    public final C1530f0 golf;
    public final C0312j0 hotel;
    public boolean india;
    public int juliet = 1;
    public O kilo = androidx.compose.foundation.gestures.a.bravo;
    public final C1542l0 lima = new C1542l0(this);
    public final C1534h0 mike = new C1534h0(0, this);

    public C1548o0(InterfaceC1532g0 interfaceC1532g0, C0704t c0704t, C1543m c1543m, K k6, boolean z2, C2047d c2047d, C1530f0 c1530f0, C0312j0 c0312j0) {
        this.alpha = interfaceC1532g0;
        this.bravo = c0704t;
        this.charlie = c1543m;
        this.delta = k6;
        this.echo = z2;
        this.foxtrot = c2047d;
        this.golf = c1530f0;
        this.hotel = c0312j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(long j5, Pd.c cVar) {
        C1536i0 c1536i0;
        int i4;
        C1548o0 c1548o0;
        Throwable th;
        kotlin.jvm.internal.t tVar;
        if (cVar instanceof C1536i0) {
            c1536i0 = (C1536i0) cVar;
            int i5 = c1536i0.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1536i0.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c1536i0.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c1536i0.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        tVar = c1536i0.alpha;
                        try {
                            ResultKt.alpha(obj);
                            c1548o0 = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c1548o0 = this;
                            c1548o0.india = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    ?? obj2 = new Object();
                    obj2.alpha = j5;
                    this.india = true;
                    try {
                        b.M m4 = b.M.alpha;
                        c1548o0 = this;
                        try {
                            C1540k0 c1540k0 = new C1540k0(c1548o0, obj2, j5, null);
                            c1536i0.alpha = obj2;
                            c1536i0.silver = 1;
                            if (foxtrot(m4, c1540k0, c1536i0) == aVar) {
                                return aVar;
                            }
                            tVar = obj2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            c1548o0.india = false;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c1548o0 = this;
                    }
                }
                c1548o0.india = false;
                return new Q0.r(tVar.alpha);
            }
        }
        c1536i0 = new C1536i0(this, cVar);
        Object obj3 = c1536i0.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c1536i0.silver;
        if (i4 == 0) {
        }
        c1548o0.india = false;
        return new Q0.r(tVar.alpha);
    }

    public final Object bravo(long j5, boolean z2, Pd.i iVar) {
        int i4;
        if (z2 && this.charlie != null) {
            return Unit.INSTANCE;
        }
        if (this.delta == K.purple) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        long alpha = Q0.r.alpha(0.0f, 0.0f, i4, j5);
        C1544m0 c1544m0 = new C1544m0(this, null);
        C0704t c0704t = this.bravo;
        if (c0704t != null && (this.alpha.delta() || this.alpha.charlie())) {
            Object bravo = c0704t.bravo(alpha, c1544m0, iVar);
            if (bravo == Od.a.alpha) {
                return bravo;
            }
            return Unit.INSTANCE;
        }
        C1544m0 c1544m02 = new C1544m0(c1544m0.silver, iVar);
        c1544m02.red = alpha;
        Object invokeSuspend = c1544m02.invokeSuspend(Unit.INSTANCE);
        if (invokeSuspend == Od.a.alpha) {
            return invokeSuspend;
        }
        return Unit.INSTANCE;
    }

    public final long charlie(O o5, long j5, int i4) {
        C2050g c2050g;
        long j6;
        long alpha;
        C2050g c2050g2 = this.foxtrot.alpha;
        C2050g c2050g3 = null;
        if (c2050g2 != null && c2050g2.isAttached()) {
            c2050g = (C2050g) AbstractC2557q.foxtrot(c2050g2);
        } else {
            c2050g = null;
        }
        long j7 = 0;
        if (c2050g != null) {
            j6 = c2050g.black(i4, j5);
        } else {
            j6 = 0;
        }
        long foxtrot = Z.b.foxtrot(j5, j6);
        if (this.delta == K.purple) {
            alpha = Z.b.alpha(0.0f, 1, foxtrot);
        } else {
            alpha = Z.b.alpha(0.0f, 2, foxtrot);
        }
        long echo = echo(hotel(o5.alpha(golf(echo(alpha)))));
        C1530f0 c1530f0 = this.golf;
        if (c1530f0.isAttached()) {
            ViewTreeObserver viewTreeObserver = ((C2946x) AbstractC2555o.hotel(c1530f0)).getViewTreeObserver();
            try {
                if (C2946x.f13855F0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    C2946x.f13855F0 = declaredMethod;
                }
                Method method = C2946x.f13855F0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long foxtrot2 = Z.b.foxtrot(foxtrot, echo);
        C2050g c2050g4 = this.foxtrot.alpha;
        if (c2050g4 != null && c2050g4.isAttached()) {
            c2050g3 = (C2050g) AbstractC2557q.foxtrot(c2050g4);
        }
        C2050g c2050g5 = c2050g3;
        if (c2050g5 != null) {
            j7 = c2050g5.maroon(i4, echo, foxtrot2);
        }
        return Z.b.golf(Z.b.golf(j6, echo), j7);
    }

    public final float delta(float f5) {
        if (this.echo) {
            return f5 * (-1);
        }
        return f5;
    }

    public final long echo(long j5) {
        if (this.echo) {
            return Z.b.hotel(-1.0f, j5);
        }
        return j5;
    }

    public final Object foxtrot(b.M m4, Xd.l lVar, Pd.c cVar) {
        Object bravo = this.alpha.bravo(m4, new C1546n0(this, lVar, null), cVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    public final float golf(long j5) {
        long j6;
        if (this.delta == K.purple) {
            j6 = j5 >> 32;
        } else {
            j6 = j5 & 4294967295L;
        }
        return Float.intBitsToFloat((int) j6);
    }

    public final long hotel(float f5) {
        long floatToRawIntBits;
        long j5;
        if (f5 == 0.0f) {
            return 0L;
        }
        if (this.delta == K.purple) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f5);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j5 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f5);
            j5 = floatToRawIntBits3 << 32;
        }
        return j5 | (4294967295L & floatToRawIntBits);
    }
}
