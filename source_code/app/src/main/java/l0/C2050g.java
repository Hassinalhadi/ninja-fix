package l0;

import T.r;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.jvm.internal.Ref;
import s0.AbstractC2557q;
import s0.j0;
import vf.ab;
import vf.ad;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2050g extends r implements j0, InterfaceC2044a {
    public InterfaceC2044a alpha;
    public C2047d purple;
    public C2050g red;
    public final String silver;

    public C2050g(InterfaceC2044a interfaceC2044a, C2047d c2047d) {
        this.alpha = interfaceC2044a;
        this.purple = c2047d == null ? new C2047d() : c2047d;
        this.silver = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final ab b() {
        C2050g c2050g;
        ab abVar = null;
        if (isAttached()) {
            c2050g = (C2050g) AbstractC2557q.foxtrot(this);
        } else {
            c2050g = null;
        }
        if (c2050g != null) {
            abVar = c2050g.b();
        }
        if (abVar != null && ad.xray(abVar)) {
            return abVar;
        }
        ab abVar2 = this.purple.delta;
        if (abVar2 != null) {
            return abVar2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // l0.InterfaceC2044a
    public final long black(int i4, long j5) {
        long j6;
        C2050g c2050g = null;
        if (isAttached() && isAttached()) {
            c2050g = (C2050g) AbstractC2557q.foxtrot(this);
        }
        if (c2050g != null) {
            j6 = c2050g.black(i4, j5);
        } else {
            j6 = 0;
        }
        return Z.b.golf(j6, this.alpha.black(i4, Z.b.foxtrot(j5, j6)));
    }

    @Override // s0.j0
    public final Object golf() {
        return this.silver;
    }

    @Override // l0.InterfaceC2044a
    public final long maroon(int i4, long j5, long j6) {
        long j7;
        long maroon = this.alpha.maroon(i4, j5, j6);
        C2050g c2050g = null;
        if (isAttached() && isAttached()) {
            c2050g = (C2050g) AbstractC2557q.foxtrot(this);
        }
        C2050g c2050g2 = c2050g;
        if (c2050g2 != null) {
            j7 = c2050g2.maroon(i4, Z.b.golf(j5, maroon), Z.b.foxtrot(j6, maroon));
        } else {
            j7 = 0;
        }
        return Z.b.golf(maroon, j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // l0.InterfaceC2044a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navy(long j5, Nd.c cVar) {
        C2049f c2049f;
        int i4;
        long j6;
        long j7;
        if (cVar instanceof C2049f) {
            c2049f = (C2049f) cVar;
            int i5 = c2049f.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2049f.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c2049f.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c2049f.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            j7 = c2049f.alpha;
                            ResultKt.alpha(obj);
                            return new Q0.r(Q0.r.echo(j7, ((Q0.r) obj).alpha));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = c2049f.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    C2050g c2050g = null;
                    if (isAttached() && isAttached()) {
                        c2050g = (C2050g) AbstractC2557q.foxtrot(this);
                    }
                    if (c2050g != null) {
                        c2049f.alpha = j5;
                        c2049f.silver = 1;
                        obj = c2050g.navy(j5, c2049f);
                    } else {
                        j6 = 0;
                        long j10 = j6;
                        long j11 = j5;
                        j7 = j10;
                        InterfaceC2044a interfaceC2044a = this.alpha;
                        long delta = Q0.r.delta(j11, j7);
                        c2049f.alpha = j7;
                        c2049f.silver = 2;
                        obj = interfaceC2044a.navy(delta, c2049f);
                    }
                }
                j6 = ((Q0.r) obj).alpha;
                long j102 = j6;
                long j112 = j5;
                j7 = j102;
                InterfaceC2044a interfaceC2044a2 = this.alpha;
                long delta2 = Q0.r.delta(j112, j7);
                c2049f.alpha = j7;
                c2049f.silver = 2;
                obj = interfaceC2044a2.navy(delta2, c2049f);
            }
        }
        c2049f = new C2049f(this, (Pd.c) cVar);
        Object obj2 = c2049f.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2049f.silver;
        if (i4 == 0) {
        }
        j6 = ((Q0.r) obj2).alpha;
        long j1022 = j6;
        long j1122 = j5;
        j7 = j1022;
        InterfaceC2044a interfaceC2044a22 = this.alpha;
        long delta22 = Q0.r.delta(j1122, j7);
        c2049f.alpha = j7;
        c2049f.silver = 2;
        obj2 = interfaceC2044a22.navy(delta22, c2049f);
    }

    @Override // T.r
    public final void onAttach() {
        C2047d c2047d = this.purple;
        c2047d.alpha = this;
        c2047d.bravo = null;
        this.red = null;
        c2047d.charlie = new je.ab(10, this);
        this.purple.delta = getCoroutineScope();
    }

    @Override // T.r
    public final void onDetach() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC2557q.quebec(this, new C2051h(objectRef));
        C2050g c2050g = (C2050g) ((j0) objectRef.alpha);
        this.red = c2050g;
        C2047d c2047d = this.purple;
        c2047d.bravo = c2050g;
        if (c2047d.alpha == this) {
            c2047d.alpha = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // l0.InterfaceC2044a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object oscar(long j5, long j6, Nd.c cVar) {
        C2048e c2048e;
        int i4;
        long j7;
        long j10;
        long j11;
        C2050g c2050g;
        long j12;
        long j13;
        if (cVar instanceof C2048e) {
            c2048e = (C2048e) cVar;
            int i5 = c2048e.teal;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2048e.teal = i5 - RecyclerView.UNDEFINED_DURATION;
                C2048e c2048e2 = c2048e;
                Object obj = c2048e2.red;
                Od.a aVar = Od.a.alpha;
                i4 = c2048e2.teal;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            j13 = c2048e2.alpha;
                            ResultKt.alpha(obj);
                            j12 = ((Q0.r) obj).alpha;
                            j11 = j13;
                            return new Q0.r(Q0.r.echo(j11, j12));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = c2048e2.purple;
                    j7 = c2048e2.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC2044a interfaceC2044a = this.alpha;
                    c2048e2.alpha = j5;
                    c2048e2.purple = j6;
                    c2048e2.teal = 1;
                    obj = interfaceC2044a.oscar(j5, j6, c2048e2);
                    if (obj != aVar) {
                        j7 = j5;
                        j10 = j6;
                    }
                    return aVar;
                }
                j11 = ((Q0.r) obj).alpha;
                if (!isAttached()) {
                    c2050g = null;
                    if (isAttached() && isAttached()) {
                        c2050g = (C2050g) AbstractC2557q.foxtrot(this);
                    }
                } else {
                    c2050g = this.red;
                }
                if (c2050g == null) {
                    long echo = Q0.r.echo(j7, j11);
                    long delta = Q0.r.delta(j10, j11);
                    c2048e2.alpha = j11;
                    c2048e2.teal = 2;
                    obj = c2050g.oscar(echo, delta, c2048e2);
                    if (obj != aVar) {
                        j13 = j11;
                        j12 = ((Q0.r) obj).alpha;
                        j11 = j13;
                        return new Q0.r(Q0.r.echo(j11, j12));
                    }
                    return aVar;
                }
                j12 = 0;
                return new Q0.r(Q0.r.echo(j11, j12));
            }
        }
        c2048e = new C2048e(this, (Pd.c) cVar);
        C2048e c2048e22 = c2048e;
        Object obj2 = c2048e22.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2048e22.teal;
        if (i4 == 0) {
        }
        j11 = ((Q0.r) obj2).alpha;
        if (!isAttached()) {
        }
        if (c2050g == null) {
        }
    }
}
