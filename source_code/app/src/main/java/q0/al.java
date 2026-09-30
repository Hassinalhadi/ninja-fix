package q0;

import F.C0092c;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC0587t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.InterfaceC0578j;
import androidx.compose.runtime.t0;
import com.google.android.gms.internal.measurement.C1298c;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import t0.C2946x;
import t0.U0;

/* loaded from: classes3.dex */
public final class al implements InterfaceC0578j {

    /* renamed from: a, reason: collision with root package name */
    public final ag f13150a;
    public final s0.al alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ad f13151b;

    /* renamed from: c, reason: collision with root package name */
    public final bv.al f13152c;

    /* renamed from: d, reason: collision with root package name */
    public final bv.A f13153d;
    public final bv.al e;

    /* renamed from: f, reason: collision with root package name */
    public final J.e f13154f;

    /* renamed from: g, reason: collision with root package name */
    public int f13155g;

    /* renamed from: h, reason: collision with root package name */
    public int f13156h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13157i;
    public AbstractC0587t purple;
    public InterfaceC2381Q red;
    public int silver;
    public int teal;
    public final bv.al white;
    public final bv.al yellow;

    public al(s0.al alVar, InterfaceC2381Q interfaceC2381Q) {
        this.alpha = alVar;
        this.red = interfaceC2381Q;
        long[] jArr = bv.au.alpha;
        this.white = new bv.al();
        this.yellow = new bv.al();
        this.f13150a = new ag(this);
        this.f13151b = new ad(this);
        this.f13152c = new bv.al();
        this.f13153d = new bv.A();
        this.e = new bv.al();
        this.f13154f = new J.e(new Object[16]);
        this.f13157i = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void charlie(ae aeVar) {
        bv.am amVar;
        androidx.compose.runtime.E e = aeVar.foxtrot;
        if (e != null) {
            e.hotel.set(androidx.compose.runtime.F.purple);
            B9.r rVar = e.juliet;
            if (((bv.am) rVar.delta).hotel()) {
                amVar = (bv.am) rVar.delta;
                bv.am amVar2 = bv.av.alpha;
                rVar.delta = new bv.am();
                ((J.e) rVar.charlie).india();
            } else {
                amVar = null;
            }
            rVar.bravo();
            C0590w c0590w = e.alpha;
            c0590w.f3015j = null;
            if (amVar != null) {
                c0590w.f3019n.kilo = amVar;
                c0590w.f3021p = 2;
            }
            aeVar.foxtrot = null;
            C0590w c0590w2 = aeVar.charlie;
            if (c0590w2 != null) {
                c0590w2.mike();
            }
            aeVar.charlie = null;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0578j
    public final void alpha() {
        C0590w c0590w;
        s0.al alVar = this.alpha;
        alVar.f13290i = true;
        bv.al alVar2 = this.white;
        Object[] objArr = alVar2.charlie;
        long[] jArr = alVar2.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128 && (c0590w = ((ae) objArr[(i4 << 3) + i10]).charlie) != null) {
                            c0590w.mike();
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        alVar.lavender();
        alVar.f13290i = false;
        alVar2.alpha();
        this.yellow.alpha();
        this.f13156h = 0;
        this.f13155g = 0;
        this.f13152c.alpha();
        echo();
    }

    @Override // androidx.compose.runtime.InterfaceC0578j
    public final void bravo() {
        foxtrot(true);
    }

    public final void delta(int i4) {
        boolean z2;
        Function1 function1;
        boolean z10 = false;
        this.f13155g = 0;
        List papa = this.alpha.papa();
        J.b bVar = (J.b) papa;
        int i5 = (((J.e) bVar.purple).red - this.f13156h) - 1;
        if (i4 <= i5) {
            this.f13153d.clear();
            if (i4 <= i5) {
                int i10 = i4;
                while (true) {
                    Object golf = this.white.golf((s0.al) bVar.get(i10));
                    Intrinsics.checkNotNull(golf);
                    ((bv.ai) this.f13153d.purple).alpha(((ae) golf).alpha);
                    if (i10 == i5) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.red.lima(this.f13153d);
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            z2 = false;
            while (i5 >= i4) {
                try {
                    s0.al alVar = (s0.al) ((J.b) papa).get(i5);
                    Object golf2 = this.white.golf(alVar);
                    Intrinsics.checkNotNull(golf2);
                    ae aeVar = (ae) golf2;
                    Object obj = aeVar.alpha;
                    if (((bv.ai) this.f13153d.purple).charlie(obj)) {
                        this.f13155g++;
                        if (((Boolean) ((t0) aeVar.golf).getValue()).booleanValue()) {
                            s0.ap apVar = alVar.f13306y;
                            s0.C c3 = apVar.papa;
                            s0.ai aiVar = s0.ai.red;
                            c3.e = aiVar;
                            s0.ay ayVar = apVar.quebec;
                            if (ayVar != null) {
                                ayVar.f13323c = aiVar;
                            }
                            golf(aeVar, false);
                            if (aeVar.hotel) {
                                z2 = true;
                            }
                        }
                    } else {
                        s0.al alVar2 = this.alpha;
                        alVar2.f13290i = true;
                        this.white.kilo(alVar);
                        C0590w c0590w = aeVar.charlie;
                        if (c0590w != null) {
                            c0590w.mike();
                        }
                        this.alpha.lime(i5, 1);
                        alVar2.f13290i = false;
                    }
                    this.yellow.kilo(obj);
                    i5--;
                } catch (Throwable th) {
                    r6.u.juliet(echo, foxtrot, function1);
                    throw th;
                }
            }
            r6.u.juliet(echo, foxtrot, function1);
        } else {
            z2 = false;
        }
        if (z2) {
            synchronized (S.n.charlie) {
                bv.am amVar = S.n.juliet.hotel;
                if (amVar != null) {
                    if (amVar.hotel()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                S.n.alpha();
            }
        }
        echo();
    }

    public final void echo() {
        int i4 = ((J.e) ((J.b) this.alpha.papa()).purple).red;
        bv.al alVar = this.white;
        if (alVar.echo != i4) {
            AbstractC2264a.alpha("Inconsistency between the count of nodes tracked by the state (" + alVar.echo + ") and the children count on the SubcomposeLayout (" + i4 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i4 - this.f13155g) - this.f13156h < 0) {
            StringBuilder sierra = Q0.c.sierra(i4, "Incorrect state. Total children ", ". Reusable children ");
            sierra.append(this.f13155g);
            sierra.append(". Precomposed children ");
            sierra.append(this.f13156h);
            AbstractC2264a.alpha(sierra.toString());
        }
        bv.al alVar2 = this.f13152c;
        if (alVar2.echo == this.f13156h) {
            return;
        }
        AbstractC2264a.alpha("Incorrect state. Precomposed children " + this.f13156h + ". Map size " + alVar2.echo);
    }

    public final void foxtrot(boolean z2) {
        Function1 function1;
        this.f13156h = 0;
        this.f13152c.alpha();
        List papa = this.alpha.papa();
        int i4 = ((J.e) ((J.b) papa).purple).red;
        if (this.f13155g != i4) {
            this.f13155g = i4;
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            for (int i5 = 0; i5 < i4; i5++) {
                try {
                    s0.al alVar = (s0.al) ((J.b) papa).get(i5);
                    ae aeVar = (ae) this.white.golf(alVar);
                    if (aeVar != null && ((Boolean) ((t0) aeVar.golf).getValue()).booleanValue()) {
                        s0.ap apVar = alVar.f13306y;
                        s0.C c3 = apVar.papa;
                        s0.ai aiVar = s0.ai.red;
                        c3.e = aiVar;
                        s0.ay ayVar = apVar.quebec;
                        if (ayVar != null) {
                            ayVar.f13323c = aiVar;
                        }
                        golf(aeVar, z2);
                        aeVar.alpha = AbstractC2375K.alpha;
                    }
                } catch (Throwable th) {
                    r6.u.juliet(echo, foxtrot, function1);
                    throw th;
                }
            }
            r6.u.juliet(echo, foxtrot, function1);
            this.yellow.alpha();
        }
        echo();
    }

    public final void golf(ae aeVar, boolean z2) {
        C0590w c0590w;
        if (!z2 && aeVar.hotel) {
            ((t0) aeVar.golf).setValue(Boolean.FALSE);
        } else {
            aeVar.golf = C0564b.zulu(Boolean.FALSE);
        }
        if (aeVar.foxtrot != null) {
            charlie(aeVar);
            return;
        }
        if (z2) {
            C0590w c0590w2 = aeVar.charlie;
            if (c0590w2 != null) {
                c0590w2.lima();
                return;
            }
            return;
        }
        s0.T outOfFrameExecutor = ((C2946x) s0.ao.alpha(this.alpha)).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            je.ab abVar = new je.ab(26, aeVar);
            Handler handler = ((C2946x) outOfFrameExecutor).getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new ga.as(11, abVar));
                return;
            }
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        if (!aeVar.hotel && (c0590w = aeVar.charlie) != null) {
            c0590w.lima();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c1, code lost:
    
        if (r7 != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, q0.ae] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hotel(s0.al alVar, Object obj, boolean z2, Xd.l lVar) {
        boolean z10;
        boolean z11;
        C0590w c0590w;
        boolean z12;
        Function1 function1;
        bv.al alVar2 = this.white;
        Object golf = alVar2.golf(alVar);
        Function1 function12 = null;
        Object obj2 = golf;
        if (golf == null) {
            P.d dVar = AbstractC2390i.alpha;
            ?? obj3 = new Object();
            obj3.alpha = obj;
            obj3.bravo = dVar;
            obj3.charlie = null;
            obj3.golf = C0564b.zulu(Boolean.TRUE);
            alVar2.mike(alVar, obj3);
            obj2 = obj3;
        }
        ae aeVar = (ae) obj2;
        if (aeVar.bravo != lVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aeVar.foxtrot != null) {
            if (z10) {
                charlie(aeVar);
            } else if (!z2) {
                androidx.compose.runtime.E e = aeVar.foxtrot;
                if (e != null) {
                    S.g echo = r6.u.echo();
                    if (echo != null) {
                        function1 = echo.echo();
                    } else {
                        function1 = null;
                    }
                    S.g foxtrot = r6.u.foxtrot(echo);
                    try {
                        s0.al alVar3 = this.alpha;
                        alVar3.f13290i = true;
                        while (!e.charlie()) {
                            e.foxtrot(new com.google.firebase.messaging.l(14));
                        }
                        e.alpha();
                        aeVar.foxtrot = null;
                        alVar3.f13290i = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                return;
            }
        }
        C0590w c0590w2 = aeVar.charlie;
        if (c0590w2 != null) {
            synchronized (c0590w2.silver) {
                if (c0590w2.f3012g.echo > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        } else {
            z11 = true;
        }
        if (!z10 && !z11 && !aeVar.delta) {
            return;
        }
        aeVar.bravo = lVar;
        if (aeVar.foxtrot != null) {
            AbstractC2264a.alpha("new subcompose call while paused composition is still active");
        }
        S.g echo2 = r6.u.echo();
        if (echo2 != null) {
            function12 = echo2.echo();
        }
        S.g foxtrot2 = r6.u.foxtrot(echo2);
        try {
            s0.al alVar4 = this.alpha;
            alVar4.f13290i = true;
            C0590w c0590w3 = aeVar.charlie;
            AbstractC0587t abstractC0587t = this.purple;
            if (abstractC0587t != null) {
                if (c0590w3 != null) {
                    if (c0590w3.f3021p == 3) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z2) {
                    ViewGroup.LayoutParams layoutParams = U0.alpha;
                    c0590w = new C0590w(abstractC0587t, new C1298c(alVar));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = U0.alpha;
                    c0590w = new C0590w(abstractC0587t, new C1298c(alVar));
                }
                c0590w3 = c0590w;
                aeVar.charlie = c0590w3;
                Xd.l lVar2 = aeVar.bravo;
                if (((C2946x) s0.ao.alpha(this.alpha)).getOutOfFrameExecutor() != null) {
                    aeVar.hotel = false;
                } else {
                    aeVar.hotel = true;
                    lVar2 = new P.d(new C0092c(aeVar, lVar2, 8), 1524156494, true);
                }
                if (z2) {
                    if (aeVar.echo) {
                        c0590w3.india();
                        c0590w3.quebec();
                        aeVar.foxtrot = c0590w3.kilo(true, lVar2);
                    } else {
                        aeVar.foxtrot = c0590w3.kilo(c0590w3.india(), lVar2);
                    }
                } else if (aeVar.echo) {
                    c0590w3.india();
                    c0590w3.quebec();
                    C0585q c0585q = c0590w3.f3020o;
                    c0585q.zulu = 100;
                    c0585q.yankee = true;
                    c0590w3.alpha.alpha(c0590w3, lVar2);
                    c0585q.victor();
                } else {
                    c0590w3.azure(lVar2);
                }
                aeVar.echo = false;
                alVar4.f13290i = false;
                r6.u.juliet(echo2, foxtrot2, function12);
                aeVar.delta = false;
                return;
            }
            AbstractC2264a.charlie("parent composition reference not set");
            throw new KotlinNothingValueException();
        } finally {
            r6.u.juliet(echo2, foxtrot2, function12);
        }
    }

    public final s0.al india(Object obj) {
        bv.al alVar;
        int i4;
        if (this.f13155g != 0) {
            s0.al alVar2 = this.alpha;
            J.b bVar = (J.b) alVar2.papa();
            int i5 = ((J.e) bVar.purple).red - this.f13156h;
            int i10 = i5 - this.f13155g;
            int i11 = i5 - 1;
            int i12 = i11;
            while (true) {
                alVar = this.white;
                if (i12 >= i10) {
                    Object golf = alVar.golf((s0.al) bVar.get(i12));
                    Intrinsics.checkNotNull(golf);
                    if (Intrinsics.areEqual(((ae) golf).alpha, obj)) {
                        i4 = i12;
                        break;
                    }
                    i12--;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                while (i11 >= i10) {
                    Object golf2 = alVar.golf((s0.al) bVar.get(i11));
                    Intrinsics.checkNotNull(golf2);
                    ae aeVar = (ae) golf2;
                    Object obj2 = aeVar.alpha;
                    if (obj2 != AbstractC2375K.alpha && !this.red.green(obj, obj2)) {
                        i11--;
                    } else {
                        aeVar.alpha = obj;
                        i12 = i11;
                        i4 = i12;
                        break;
                    }
                }
                i12 = i11;
            }
            if (i4 == -1) {
                return null;
            }
            if (i12 != i10) {
                alVar2.f13290i = true;
                alVar2.gray(i12, i10, 1);
                alVar2.f13290i = false;
            }
            this.f13155g--;
            s0.al alVar3 = (s0.al) bVar.get(i10);
            Object golf3 = alVar.golf(alVar3);
            Intrinsics.checkNotNull(golf3);
            ae aeVar2 = (ae) golf3;
            aeVar2.golf = C0564b.zulu(Boolean.TRUE);
            aeVar2.echo = true;
            aeVar2.delta = true;
            return alVar3;
        }
        return null;
    }
}
