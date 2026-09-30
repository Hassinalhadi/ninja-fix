package j;

import androidx.compose.foundation.lazy.layout.ae;
import androidx.compose.foundation.lazy.layout.ag;
import androidx.compose.foundation.lazy.layout.ai;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import b.M;
import d.C1534h0;
import d.C1551q;
import d.InterfaceC1532g0;
import d.K;
import f.C1674k;
import g.AbstractC1719b;
import g.C1718a;
import g4.C1752a;
import i.C1852a;
import i.C1870s;
import i.C1871t;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import s0.al;
import s6.A0;

/* loaded from: classes3.dex */
public final class t implements InterfaceC1532g0 {
    public static final J2.l whiskey = R.l.bravo(new C1752a(14), new hd.l(13));
    public final C1852a alpha;
    public boolean bravo;
    public l charlie;
    public final C1870s delta;
    public final ax echo;
    public final C1674k foxtrot;
    public float golf;
    public final C1551q hotel;
    public final boolean india;
    public al juliet;
    public final C1871t kilo;
    public final androidx.compose.foundation.lazy.layout.d lima;
    public final androidx.compose.foundation.lazy.layout.s mike;
    public final androidx.compose.foundation.lazy.layout.i november;
    public final ai oscar;
    public final C1718a papa;
    public final ae quebec;
    public final ax romeo;
    public final ax sierra;
    public final ax tango;
    public final ax uniform;
    public final J2.l victor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i.a] */
    public t(int i4, int i5) {
        ?? obj = new Object();
        obj.alpha = -1;
        obj.echo = new J.e(new ag[16]);
        obj.charlie = -1;
        this.alpha = obj;
        this.delta = new C1870s(i4, i5, 1);
        this.echo = C0564b.yankee(u.alpha, as.red);
        this.foxtrot = new C1674k();
        this.hotel = new C1551q(new C1534h0(17, this));
        this.india = true;
        this.kilo = new C1871t(this, 1);
        this.lima = new androidx.compose.foundation.lazy.layout.d();
        this.mike = new androidx.compose.foundation.lazy.layout.s();
        this.november = new androidx.compose.foundation.lazy.layout.i(0);
        this.oscar = new ai(new Aa.d(this, i4, 6));
        this.papa = new C1718a(6, this);
        this.quebec = new ae();
        this.romeo = androidx.compose.foundation.lazy.layout.j.hotel();
        this.sierra = androidx.compose.foundation.lazy.layout.j.hotel();
        Boolean bool = Boolean.FALSE;
        this.tango = C0564b.zulu(bool);
        this.uniform = C0564b.zulu(bool);
        this.victor = new J2.l(22);
    }

    @Override // d.InterfaceC1532g0
    public final boolean alpha() {
        return this.hotel.alpha();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r5.hotel.bravo(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r5.lima.delta(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // d.InterfaceC1532g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(M m4, Xd.l lVar, Pd.c cVar) {
        r rVar;
        int i4;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i5 = rVar.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                rVar.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = rVar.red;
                Od.a aVar = Od.a.alpha;
                i4 = rVar.teal;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = rVar.purple;
                    m4 = rVar.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    rVar.alpha = m4;
                    rVar.purple = lVar;
                    rVar.teal = 1;
                }
                rVar.alpha = null;
                rVar.purple = null;
                rVar.teal = 2;
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = rVar.teal;
        if (i4 == 0) {
        }
        rVar.alpha = null;
        rVar.purple = null;
        rVar.teal = 2;
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
        return this.hotel.echo(f5);
    }

    public final void foxtrot(l lVar, boolean z2, boolean z10) {
        int i4;
        boolean z11;
        Object obj;
        int i5;
        m mVar;
        boolean z12;
        m mVar2;
        List list = lVar.mike;
        this.oscar.echo = list.size();
        if (!z2 && this.bravo) {
            this.charlie = lVar;
            return;
        }
        boolean z13 = true;
        if (z2) {
            this.bravo = true;
        }
        this.golf -= lVar.delta;
        ((t0) this.echo).setValue(lVar);
        n nVar = lVar.alpha;
        if (nVar != null) {
            i4 = nVar.alpha;
        } else {
            i4 = 0;
        }
        int i10 = lVar.bravo;
        if (i4 == 0 && i10 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        ((t0) this.uniform).setValue(Boolean.valueOf(z11));
        ((t0) this.tango).setValue(Boolean.valueOf(lVar.charlie));
        C1870s c1870s = this.delta;
        if (z10) {
            c1870s.getClass();
            if (i10 < 0.0f) {
                AbstractC1719b.charlie("scrollOffset should be non-negative");
            }
            c1870s.charlie.kilo(i10);
        } else {
            c1870s.getClass();
            if (nVar != null && (mVar2 = (m) ArraysKt.gold(nVar.bravo)) != null) {
                obj = mVar2.bravo;
            } else {
                obj = null;
            }
            c1870s.echo = obj;
            boolean z14 = c1870s.delta;
            int i11 = lVar.papa;
            if (z14 || i11 > 0) {
                c1870s.delta = true;
                if (i10 < 0.0f) {
                    AbstractC1719b.charlie("scrollOffset should be non-negative (" + i10 + ')');
                }
                if (nVar != null && (mVar = (m) ArraysKt.gold(nVar.bravo)) != null) {
                    i5 = mVar.alpha;
                } else {
                    i5 = 0;
                }
                c1870s.charlie(i5, i10);
            }
            if (this.india) {
                C1852a c1852a = this.alpha;
                int i12 = c1852a.alpha;
                boolean z15 = c1852a.bravo;
                J.e eVar = (J.e) c1852a.echo;
                if (i12 != -1 && !list.isEmpty() && i12 != C1852a.charlie(lVar, z15)) {
                    c1852a.alpha = -1;
                    Object[] objArr = eVar.alpha;
                    int i13 = eVar.red;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((ag) objArr[i14]).cancel();
                    }
                    eVar.india();
                }
                int i15 = c1852a.charlie;
                if (i15 != -1 && c1852a.delta != 0.0f && i15 != i11 && !list.isEmpty()) {
                    if (c1852a.delta < 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int charlie = C1852a.charlie(lVar, z12);
                    if (c1852a.delta >= 0.0f) {
                        z13 = false;
                    }
                    int alpha = C1852a.alpha(lVar, z13);
                    if (alpha >= 0 && alpha < i11 && charlie != c1852a.alpha && charlie >= 0) {
                        c1852a.alpha = charlie;
                        eVar.india();
                        eVar.delta(eVar.red, this.papa.cyan(charlie));
                    }
                }
                c1852a.charlie = i11;
            }
        }
        if (z2) {
            this.victor.quebec(lVar.foxtrot, lVar.india, lVar.hotel);
        }
    }

    public final l golf() {
        return (l) ((t0) this.echo).getValue();
    }

    public final void hotel(float f5, l lVar) {
        boolean z2;
        long j5;
        if (this.india) {
            C1852a c1852a = this.alpha;
            c1852a.getClass();
            if (!lVar.mike.isEmpty()) {
                int i4 = 0;
                if (f5 < 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int charlie = C1852a.charlie(lVar, z2);
                int alpha = C1852a.alpha(lVar, z2);
                if (alpha >= 0 && alpha < lVar.papa) {
                    int i5 = c1852a.alpha;
                    J.e eVar = (J.e) c1852a.echo;
                    if (charlie != i5 && charlie >= 0) {
                        if (c1852a.bravo != z2) {
                            Object[] objArr = eVar.alpha;
                            int i10 = eVar.red;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((ag) objArr[i11]).cancel();
                            }
                        }
                        c1852a.bravo = z2;
                        c1852a.alpha = charlie;
                        eVar.india();
                        eVar.delta(eVar.red, this.papa.cyan(charlie));
                    }
                    K k6 = lVar.quebec;
                    List list = lVar.mike;
                    if (z2) {
                        m mVar = (m) CollectionsKt.ochre(list);
                        if (k6 == K.alpha) {
                            j5 = mVar.november & 4294967295L;
                        } else {
                            j5 = mVar.november >> 32;
                        }
                        if (((A0.alpha(mVar, k6) + ((int) j5)) + lVar.sierra) - lVar.oscar < (-f5)) {
                            Object[] objArr2 = eVar.alpha;
                            int i12 = eVar.red;
                            while (i4 < i12) {
                                ((ag) objArr2[i4]).alpha();
                                i4++;
                            }
                        }
                    } else {
                        if (lVar.november - A0.alpha((m) CollectionsKt.gold(list), k6) < f5) {
                            Object[] objArr3 = eVar.alpha;
                            int i13 = eVar.red;
                            while (i4 < i13) {
                                ((ag) objArr3[i4]).alpha();
                                i4++;
                            }
                        }
                    }
                }
            }
            c1852a.delta = f5;
        }
    }
}
