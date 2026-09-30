package l0;

import Q0.r;
import androidx.recyclerview.widget.RecyclerView;
import je.ab;
import kotlin.ResultKt;
import kotlin.jvm.internal.Lambda;
import s0.AbstractC2557q;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2047d {
    public C2050g alpha;
    public C2050g bravo;
    public Lambda charlie = new ab(9, this);
    public vf.ab delta;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(long j5, long j6, Pd.c cVar) {
        C2045b c2045b;
        int i4;
        C2050g c2050g;
        long j7;
        if (cVar instanceof C2045b) {
            c2045b = (C2045b) cVar;
            int i5 = c2045b.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2045b.red = i5 - RecyclerView.UNDEFINED_DURATION;
                C2045b c2045b2 = c2045b;
                Object obj = c2045b2.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2045b2.red;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            j7 = ((r) obj).alpha;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        j7 = ((r) obj).alpha;
                    }
                } else {
                    ResultKt.alpha(obj);
                    C2050g c2050g2 = this.alpha;
                    C2050g c2050g3 = null;
                    if (c2050g2 != null && c2050g2.isAttached()) {
                        c2050g = (C2050g) AbstractC2557q.foxtrot(c2050g2);
                    } else {
                        c2050g = null;
                    }
                    j7 = 0;
                    if (c2050g == null) {
                        C2050g c2050g4 = this.bravo;
                        if (c2050g4 != null) {
                            c2045b2.red = 1;
                            obj = c2050g4.oscar(j5, j6, c2045b2);
                        }
                    } else {
                        C2050g c2050g5 = this.alpha;
                        if (c2050g5 != null && c2050g5.isAttached()) {
                            c2050g3 = (C2050g) AbstractC2557q.foxtrot(c2050g5);
                        }
                        if (c2050g3 != null) {
                            c2045b2.red = 2;
                            obj = c2050g3.oscar(j5, j6, c2045b2);
                        } else {
                            j7 = 0;
                        }
                    }
                }
                return new r(j7);
            }
        }
        c2045b = new C2045b(this, cVar);
        C2045b c2045b22 = c2045b;
        Object obj2 = c2045b22.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2045b22.red;
        if (i4 == 0) {
        }
        return new r(j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(long j5, Pd.c cVar) {
        C2046c c2046c;
        int i4;
        long j6;
        if (cVar instanceof C2046c) {
            c2046c = (C2046c) cVar;
            int i5 = c2046c.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2046c.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c2046c.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c2046c.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C2050g c2050g = this.alpha;
                    C2050g c2050g2 = null;
                    if (c2050g != null && c2050g.isAttached()) {
                        c2050g2 = (C2050g) AbstractC2557q.foxtrot(c2050g);
                    }
                    if (c2050g2 != null) {
                        c2046c.red = 1;
                        obj = c2050g2.navy(j5, c2046c);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        j6 = 0;
                        return new r(j6);
                    }
                }
                j6 = ((r) obj).alpha;
                return new r(j6);
            }
        }
        c2046c = new C2046c(this, cVar);
        Object obj2 = c2046c.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c2046c.red;
        if (i4 == 0) {
        }
        j6 = ((r) obj2).alpha;
        return new r(j6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final vf.ab charlie() {
        vf.ab abVar = (vf.ab) this.charlie.invoke();
        if (abVar != null) {
            return abVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
