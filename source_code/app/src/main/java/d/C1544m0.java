package d;

import kotlin.ResultKt;
import kotlin.Unit;
import l0.C2047d;

/* renamed from: d.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1544m0 extends Pd.i implements Xd.l {
    public long alpha;
    public int purple;
    public /* synthetic */ long red;
    public final /* synthetic */ C1548o0 silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1544m0(C1548o0 c1548o0, Nd.c cVar) {
        super(2, cVar);
        this.silver = c1548o0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1544m0 c1544m0 = new C1544m0(this.silver, cVar);
        c1544m0.red = ((Q0.r) obj).alpha;
        return c1544m0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        long j5 = ((Q0.r) obj).alpha;
        C1544m0 c1544m0 = new C1544m0(this.silver, (Nd.c) obj2);
        c1544m0.red = j5;
        return c1544m0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        long j6;
        long j7;
        long j10;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        C1548o0 c1548o0 = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        j10 = this.alpha;
                        j7 = this.red;
                        ResultKt.alpha(obj);
                        return new Q0.r(Q0.r.delta(j7, Q0.r.delta(j10, ((Q0.r) obj).alpha)));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = this.alpha;
                j5 = this.red;
                ResultKt.alpha(obj);
                long j11 = ((Q0.r) obj).alpha;
                C2047d c2047d = c1548o0.foxtrot;
                long delta = Q0.r.delta(j6, j11);
                this.red = j5;
                this.alpha = j11;
                this.purple = 3;
                obj = c2047d.alpha(delta, j11, this);
                if (obj != aVar) {
                    j7 = j5;
                    j10 = j11;
                    return new Q0.r(Q0.r.delta(j7, Q0.r.delta(j10, ((Q0.r) obj).alpha)));
                }
                return aVar;
            }
            j5 = this.red;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            j5 = this.red;
            C2047d c2047d2 = c1548o0.foxtrot;
            this.red = j5;
            this.purple = 1;
            obj = c2047d2.bravo(j5, this);
        }
        long delta2 = Q0.r.delta(j5, ((Q0.r) obj).alpha);
        this.red = j5;
        this.alpha = delta2;
        this.purple = 2;
        obj = c1548o0.alpha(delta2, this);
        if (obj != aVar) {
            j6 = delta2;
            long j112 = ((Q0.r) obj).alpha;
            C2047d c2047d3 = c1548o0.foxtrot;
            long delta3 = Q0.r.delta(j6, j112);
            this.red = j5;
            this.alpha = j112;
            this.purple = 3;
            obj = c2047d3.alpha(delta3, j112, this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }
}
