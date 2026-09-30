package d;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import l0.InterfaceC2044a;

/* loaded from: classes3.dex */
public final class X implements InterfaceC2044a {
    public final C1548o0 alpha;
    public boolean purple;

    public X(C1548o0 c1548o0, boolean z2) {
        this.alpha = c1548o0;
        this.purple = z2;
    }

    @Override // l0.InterfaceC2044a
    public final /* synthetic */ long black(int i4, long j5) {
        return 0L;
    }

    @Override // l0.InterfaceC2044a
    public final long maroon(int i4, long j5, long j6) {
        if (this.purple) {
            C1548o0 c1548o0 = this.alpha;
            if (!c1548o0.alpha.alpha()) {
                return c1548o0.hotel(c1548o0.delta(c1548o0.alpha.echo(c1548o0.delta(c1548o0.golf(j6)))));
            }
            return 0L;
        }
        return 0L;
    }

    @Override // l0.InterfaceC2044a
    public final Object navy(long j5, Nd.c cVar) {
        return new Q0.r(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // l0.InterfaceC2044a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object oscar(long j5, long j6, Nd.c cVar) {
        W w4;
        int i4;
        long j7;
        if (cVar instanceof W) {
            w4 = (W) cVar;
            int i5 = w4.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                w4.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = w4.purple;
                Od.a aVar = Od.a.alpha;
                i4 = w4.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        j6 = w4.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    j7 = 0;
                    if (this.purple) {
                        C1548o0 c1548o0 = this.alpha;
                        if (!c1548o0.india) {
                            w4.alpha = j6;
                            w4.silver = 1;
                            obj = c1548o0.alpha(j6, w4);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                        j7 = Q0.r.delta(j6, j7);
                    }
                    return new Q0.r(j7);
                }
                j7 = ((Q0.r) obj).alpha;
                j7 = Q0.r.delta(j6, j7);
                return new Q0.r(j7);
            }
        }
        w4 = new W(this, (Pd.c) cVar);
        Object obj2 = w4.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = w4.silver;
        if (i4 == 0) {
        }
        j7 = ((Q0.r) obj2).alpha;
        j7 = Q0.r.delta(j6, j7);
        return new Q0.r(j7);
    }
}
