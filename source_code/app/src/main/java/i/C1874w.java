package i;

import androidx.compose.foundation.lazy.layout.ae;
import androidx.compose.foundation.lazy.layout.ag;
import androidx.compose.foundation.lazy.layout.ai;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import b.M;
import bz.AbstractC0779d;
import bz.C0788m;
import d.C1534h0;
import d.C1551q;
import d.InterfaceC1532g0;
import f.C1674k;
import g.AbstractC1719b;
import g.C1718a;
import g4.C1752a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import s0.al;
import s6.AbstractC2788u7;
import vf.Y;

/* renamed from: i.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1874w implements InterfaceC1532g0 {
    public static final J2.l xray = R.l.bravo(new C1752a(11), new hd.l(9));
    public final C1852a alpha;
    public boolean bravo;
    public C1867p charlie;
    public boolean delta;
    public final C1870s echo;
    public final ax foxtrot;
    public final C1674k golf;
    public float hotel;
    public final C1551q india;
    public final boolean juliet;
    public al kilo;
    public final C1871t lima;
    public final androidx.compose.foundation.lazy.layout.d mike;
    public final androidx.compose.foundation.lazy.layout.s november;
    public final androidx.compose.foundation.lazy.layout.i oscar;
    public final ai papa;
    public final C1718a quebec;
    public final ae romeo;
    public final ax sierra;
    public final ax tango;
    public final ax uniform;
    public final ax victor;
    public final J2.l whiskey;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i.a] */
    public C1874w(int i4, int i5) {
        ?? obj = new Object();
        obj.alpha = -1;
        obj.charlie = -1;
        this.alpha = obj;
        this.echo = new C1870s(i4, i5, 0);
        this.foxtrot = C0564b.yankee(AbstractC1876y.alpha, as.red);
        this.golf = new C1674k();
        this.india = new C1551q(new C1534h0(14, this));
        this.juliet = true;
        this.lima = new C1871t(this, 0);
        this.mike = new androidx.compose.foundation.lazy.layout.d();
        this.november = new androidx.compose.foundation.lazy.layout.s();
        this.oscar = new androidx.compose.foundation.lazy.layout.i(0);
        this.papa = new ai(new Aa.d(this, i4, 5));
        this.quebec = new C1718a(4, this);
        this.romeo = new ae();
        this.sierra = androidx.compose.foundation.lazy.layout.j.hotel();
        Boolean bool = Boolean.FALSE;
        this.tango = C0564b.zulu(bool);
        this.uniform = C0564b.zulu(bool);
        this.victor = androidx.compose.foundation.lazy.layout.j.hotel();
        this.whiskey = new J2.l(22);
    }

    public static Object india(C1874w c1874w, int i4, Pd.i iVar) {
        c1874w.getClass();
        Object bravo = c1874w.bravo(M.alpha, new C1873v(c1874w, i4, null), iVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    @Override // d.InterfaceC1532g0
    public final boolean alpha() {
        return this.india.alpha();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r5.india.bravo(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r5.mike.delta(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // d.InterfaceC1532g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(M m4, Xd.l lVar, Pd.c cVar) {
        C1872u c1872u;
        int i4;
        if (cVar instanceof C1872u) {
            c1872u = (C1872u) cVar;
            int i5 = c1872u.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1872u.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c1872u.red;
                Od.a aVar = Od.a.alpha;
                i4 = c1872u.teal;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = c1872u.purple;
                    m4 = c1872u.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    c1872u.alpha = m4;
                    c1872u.purple = lVar;
                    c1872u.teal = 1;
                }
                c1872u.alpha = null;
                c1872u.purple = null;
                c1872u.teal = 2;
            }
        }
        c1872u = new C1872u(this, cVar);
        Object obj2 = c1872u.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = c1872u.teal;
        if (i4 == 0) {
        }
        c1872u.alpha = null;
        c1872u.purple = null;
        c1872u.teal = 2;
    }

    @Override // d.InterfaceC1532g0
    public final boolean charlie() {
        return ((Boolean) ((t0) this.uniform).getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final boolean delta() {
        return ((Boolean) ((t0) this.tango).getValue()).booleanValue();
    }

    @Override // d.InterfaceC1532g0
    public final float echo(float f5) {
        return this.india.echo(f5);
    }

    public final void foxtrot(C1867p c1867p, boolean z2, boolean z10) {
        int i4;
        boolean z11;
        String str;
        long j5;
        Object obj;
        boolean z12;
        int i5;
        Function1 function1;
        List list = c1867p.kilo;
        this.papa.echo = list.size();
        J2.l lVar = this.whiskey;
        C1870s c1870s = this.echo;
        int i10 = c1867p.bravo;
        C1868q c1868q = c1867p.alpha;
        if (!z2 && this.bravo) {
            this.charlie = c1867p;
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            try {
                if (((Number) ((t0) ((C0788m) lVar.purple).purple).getValue()).floatValue() != 0.0f && c1868q != null && c1868q.alpha == c1870s.alpha() && i10 == c1870s.bravo()) {
                    Y y10 = (Y) lVar.alpha;
                    if (y10 != null) {
                        y10.foxtrot(null);
                    }
                    lVar.purple = new C0788m(AbstractC0779d.juliet, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                r6.u.juliet(echo, foxtrot, function1);
            }
        }
        boolean z13 = true;
        if (z2) {
            this.bravo = true;
        }
        if (c1868q != null) {
            i4 = c1868q.alpha;
        } else {
            i4 = 0;
        }
        if (i4 == 0 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        ((t0) this.uniform).setValue(Boolean.valueOf(z11));
        ((t0) this.tango).setValue(Boolean.valueOf(c1867p.charlie));
        this.hotel -= c1867p.delta;
        ((t0) this.foxtrot).setValue(c1867p);
        if (z10) {
            c1870s.getClass();
            if (i10 < 0.0f) {
                z13 = false;
            }
            if (!z13) {
                AbstractC1719b.charlie("scrollOffset should be non-negative");
            }
            c1870s.charlie.kilo(i10);
        } else {
            C1868q c1868q2 = (C1868q) CollectionsKt.green(list);
            C1868q c1868q3 = (C1868q) CollectionsKt.olive(list);
            long j6 = -1;
            if (c1868q2 != null) {
                str = "scrollOffset should be non-negative";
                j5 = c1868q2.alpha;
            } else {
                str = "scrollOffset should be non-negative";
                j5 = -1;
            }
            AbstractC2788u7.alpha(j5, "firstVisibleItem:index");
            if (c1868q3 != null) {
                j6 = c1868q3.alpha;
            }
            AbstractC2788u7.alpha(j6, "lastVisibleItem:index");
            c1870s.getClass();
            if (c1868q != null) {
                obj = c1868q.india;
            } else {
                obj = null;
            }
            c1870s.echo = obj;
            boolean z14 = c1870s.delta;
            int i11 = c1867p.november;
            if (z14 || i11 > 0) {
                c1870s.delta = true;
                if (i10 >= 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    AbstractC1719b.charlie(str);
                }
                if (c1868q != null) {
                    i5 = c1868q.alpha;
                } else {
                    i5 = 0;
                }
                c1870s.charlie(i5, i10);
            }
            if (this.juliet) {
                C1852a c1852a = this.alpha;
                int i12 = c1852a.alpha;
                boolean z15 = c1852a.bravo;
                if (i12 != -1 && !list.isEmpty() && i12 != C1852a.bravo(c1867p, z15)) {
                    c1852a.alpha = -1;
                    ag agVar = (ag) c1852a.echo;
                    if (agVar != null) {
                        agVar.cancel();
                    }
                    c1852a.echo = null;
                }
                int i13 = c1852a.charlie;
                if (i13 != -1 && c1852a.delta != 0.0f && i13 != i11 && !list.isEmpty()) {
                    if (c1852a.delta >= 0.0f) {
                        z13 = false;
                    }
                    int bravo = C1852a.bravo(c1867p, z13);
                    if (bravo >= 0 && bravo < i11) {
                        c1852a.alpha = bravo;
                        c1852a.echo = com.google.android.material.datepicker.j.tango(this.quebec, bravo);
                    }
                }
                c1852a.charlie = i11;
            }
        }
        if (z2) {
            lVar.quebec(c1867p.foxtrot, c1867p.india, c1867p.hotel);
        }
    }

    public final C1867p golf() {
        return (C1867p) ((t0) this.foxtrot).getValue();
    }

    public final void hotel(float f5, C1867p c1867p) {
        boolean z2;
        ag agVar;
        ag agVar2;
        if (this.juliet) {
            C1852a c1852a = this.alpha;
            if (!c1867p.kilo.isEmpty()) {
                if (f5 < 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int bravo = C1852a.bravo(c1867p, z2);
                if (bravo >= 0 && bravo < c1867p.november) {
                    if (bravo != c1852a.alpha) {
                        if (c1852a.bravo != z2) {
                            c1852a.alpha = -1;
                            ag agVar3 = (ag) c1852a.echo;
                            if (agVar3 != null) {
                                agVar3.cancel();
                            }
                            c1852a.echo = null;
                        }
                        c1852a.bravo = z2;
                        c1852a.alpha = bravo;
                        c1852a.echo = com.google.android.material.datepicker.j.tango(this.quebec, bravo);
                    }
                    List list = c1867p.kilo;
                    if (z2) {
                        C1868q c1868q = (C1868q) CollectionsKt.ochre(list);
                        if (((c1868q.lima + c1868q.mike) + c1867p.quebec) - c1867p.mike < (-f5) && (agVar2 = (ag) c1852a.echo) != null) {
                            agVar2.alpha();
                        }
                    } else if (c1867p.lima - ((C1868q) CollectionsKt.gold(list)).lima < f5 && (agVar = (ag) c1852a.echo) != null) {
                        agVar.alpha();
                    }
                }
            }
            c1852a.delta = f5;
        }
    }
}
