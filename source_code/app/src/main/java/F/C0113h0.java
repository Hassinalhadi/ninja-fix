package F;

import androidx.recyclerview.widget.RecyclerView;
import bz.C0797w;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import l0.InterfaceC2044a;

/* renamed from: F.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0113h0 implements InterfaceC2044a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Q2 purple;

    public /* synthetic */ C0113h0(Q2 q22, int i4) {
        this.alpha = i4;
        this.purple = q22;
    }

    @Override // l0.InterfaceC2044a
    public final long black(int i4, long j5) {
        switch (this.alpha) {
            case 0:
                B9.ab abVar = (B9.ab) this.purple;
                if (((Boolean) ((Function0) abVar.silver).invoke()).booleanValue()) {
                    R2 r22 = (R2) abVar.purple;
                    float bravo = r22.bravo();
                    r22.delta(Z.b.delta(j5) + r22.bravo());
                    if (bravo != r22.bravo()) {
                        return Z.b.alpha(0.0f, 2, j5);
                    }
                }
                return 0L;
            default:
                B9.ab abVar2 = (B9.ab) this.purple;
                if (((Boolean) ((Function0) abVar2.silver).invoke()).booleanValue() && Z.b.delta(j5) <= 0.0f) {
                    R2 r23 = (R2) abVar2.purple;
                    float bravo2 = r23.bravo();
                    r23.delta(Z.b.delta(j5) + r23.bravo());
                    if (bravo2 != r23.bravo()) {
                        return Z.b.alpha(0.0f, 2, j5);
                    }
                }
                return 0L;
        }
    }

    @Override // l0.InterfaceC2044a
    public final long maroon(int i4, long j5, long j6) {
        switch (this.alpha) {
            case 0:
                B9.ab abVar = (B9.ab) this.purple;
                if (((Boolean) ((Function0) abVar.silver).invoke()).booleanValue()) {
                    R2 r22 = (R2) abVar.purple;
                    ((androidx.compose.runtime.n0) r22.bravo).kilo(Z.b.delta(j5) + ((androidx.compose.runtime.n0) r22.bravo).juliet());
                    if ((r22.bravo() == 0.0f || r22.bravo() == r22.charlie()) && Z.b.delta(j5) == 0.0f && Z.b.delta(j6) > 0.0f) {
                        ((androidx.compose.runtime.n0) r22.bravo).kilo(0.0f);
                    }
                    r22.delta(Z.b.delta(j5) + r22.bravo());
                }
                return 0L;
            default:
                B9.ab abVar2 = (B9.ab) this.purple;
                if (((Boolean) ((Function0) abVar2.silver).invoke()).booleanValue()) {
                    R2 r23 = (R2) abVar2.purple;
                    ((androidx.compose.runtime.n0) r23.bravo).kilo(Z.b.delta(j5) + ((androidx.compose.runtime.n0) r23.bravo).juliet());
                    if (Z.b.delta(j6) >= 0.0f && Z.b.delta(j5) >= 0.0f) {
                        if (Z.b.delta(j5) == 0.0f && Z.b.delta(j6) > 0.0f) {
                            ((androidx.compose.runtime.n0) r23.bravo).kilo(0.0f);
                        }
                        if (Z.b.delta(j6) > 0.0f) {
                            float bravo = r23.bravo();
                            r23.delta(Z.b.delta(j6) + r23.bravo());
                            return t6.H2.alpha(0.0f, r23.bravo() - bravo);
                        }
                    } else {
                        float bravo2 = r23.bravo();
                        r23.delta(Z.b.delta(j5) + r23.bravo());
                        return t6.H2.alpha(0.0f, r23.bravo() - bravo2);
                    }
                }
                return 0L;
        }
    }

    @Override // l0.InterfaceC2044a
    public final Object navy(long j5, Nd.c cVar) {
        switch (this.alpha) {
            case 0:
                return new Q0.r(0L);
            default:
                return new Q0.r(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    @Override // l0.InterfaceC2044a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object oscar(long j5, long j6, Nd.c cVar) {
        C0109g0 c0109g0;
        Object obj;
        Object obj2;
        int i4;
        C0113h0 c0113h0;
        long j7;
        C0117i0 c0117i0;
        Object obj3;
        Object obj4;
        int i5;
        C0113h0 c0113h02;
        long j10;
        switch (this.alpha) {
            case 0:
                if (cVar instanceof C0109g0) {
                    c0109g0 = (C0109g0) cVar;
                    int i10 = c0109g0.teal;
                    if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0109g0.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                        obj = c0109g0.red;
                        obj2 = Od.a.alpha;
                        i4 = c0109g0.teal;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    j7 = c0109g0.purple;
                                    ResultKt.alpha(obj);
                                    return new Q0.r(Q0.r.echo(j7, ((Q0.r) obj).alpha));
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = c0109g0.purple;
                            c0113h0 = c0109g0.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            ResultKt.alpha(obj);
                            c0109g0.alpha = this;
                            c0109g0.purple = j6;
                            c0109g0.teal = 1;
                            obj = new Q0.r(0L);
                            if (obj != obj2) {
                                c0113h0 = this;
                            } else {
                                return obj2;
                            }
                        }
                        long j11 = ((Q0.r) obj).alpha;
                        R2 r22 = (R2) ((B9.ab) c0113h0.purple).purple;
                        float charlie = Q0.r.charlie(j6);
                        B9.ab abVar = (B9.ab) c0113h0.purple;
                        C0797w c0797w = (C0797w) abVar.red;
                        bz.I i11 = (bz.I) abVar.white;
                        c0109g0.alpha = null;
                        c0109g0.purple = j11;
                        c0109g0.teal = 2;
                        obj = ag.golf(r22, charlie, c0797w, i11, c0109g0);
                        if (obj == obj2) {
                            j7 = j11;
                            return new Q0.r(Q0.r.echo(j7, ((Q0.r) obj).alpha));
                        }
                        return obj2;
                    }
                }
                c0109g0 = new C0109g0(this, (Pd.c) cVar);
                obj = c0109g0.red;
                obj2 = Od.a.alpha;
                i4 = c0109g0.teal;
                if (i4 == 0) {
                }
                long j112 = ((Q0.r) obj).alpha;
                R2 r222 = (R2) ((B9.ab) c0113h0.purple).purple;
                float charlie2 = Q0.r.charlie(j6);
                B9.ab abVar2 = (B9.ab) c0113h0.purple;
                C0797w c0797w2 = (C0797w) abVar2.red;
                bz.I i112 = (bz.I) abVar2.white;
                c0109g0.alpha = null;
                c0109g0.purple = j112;
                c0109g0.teal = 2;
                obj = ag.golf(r222, charlie2, c0797w2, i112, c0109g0);
                if (obj == obj2) {
                }
            default:
                if (cVar instanceof C0117i0) {
                    c0117i0 = (C0117i0) cVar;
                    int i12 = c0117i0.teal;
                    if ((i12 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c0117i0.teal = i12 - RecyclerView.UNDEFINED_DURATION;
                        obj3 = c0117i0.red;
                        obj4 = Od.a.alpha;
                        i5 = c0117i0.teal;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    j10 = c0117i0.purple;
                                    ResultKt.alpha(obj3);
                                    return new Q0.r(Q0.r.echo(j10, ((Q0.r) obj3).alpha));
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = c0117i0.purple;
                            c0113h02 = c0117i0.alpha;
                            ResultKt.alpha(obj3);
                        } else {
                            ResultKt.alpha(obj3);
                            c0117i0.alpha = this;
                            c0117i0.purple = j6;
                            c0117i0.teal = 1;
                            obj3 = new Q0.r(0L);
                            if (obj3 != obj4) {
                                c0113h02 = this;
                            } else {
                                return obj4;
                            }
                        }
                        long j12 = ((Q0.r) obj3).alpha;
                        R2 r23 = (R2) ((B9.ab) c0113h02.purple).purple;
                        float charlie3 = Q0.r.charlie(j6);
                        B9.ab abVar3 = (B9.ab) c0113h02.purple;
                        C0797w c0797w3 = (C0797w) abVar3.red;
                        bz.I i13 = (bz.I) abVar3.white;
                        c0117i0.alpha = null;
                        c0117i0.purple = j12;
                        c0117i0.teal = 2;
                        obj3 = ag.golf(r23, charlie3, c0797w3, i13, c0117i0);
                        if (obj3 == obj4) {
                            j10 = j12;
                            return new Q0.r(Q0.r.echo(j10, ((Q0.r) obj3).alpha));
                        }
                        return obj4;
                    }
                }
                c0117i0 = new C0117i0(this, (Pd.c) cVar);
                obj3 = c0117i0.red;
                obj4 = Od.a.alpha;
                i5 = c0117i0.teal;
                if (i5 == 0) {
                }
                long j122 = ((Q0.r) obj3).alpha;
                R2 r232 = (R2) ((B9.ab) c0113h02.purple).purple;
                float charlie32 = Q0.r.charlie(j6);
                B9.ab abVar32 = (B9.ab) c0113h02.purple;
                C0797w c0797w32 = (C0797w) abVar32.red;
                bz.I i132 = (bz.I) abVar32.white;
                c0117i0.alpha = null;
                c0117i0.purple = j122;
                c0117i0.teal = 2;
                obj3 = ag.golf(r232, charlie32, c0797w32, i132, c0117i0);
                if (obj3 == obj4) {
                }
        }
    }
}
