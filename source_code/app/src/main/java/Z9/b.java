package Z9;

import Pd.i;
import Xd.l;
import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;
import t6.AbstractC3070v2;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class b extends i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ c red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Nd.c cVar2) {
        super(2, cVar2);
        this.red = cVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        b bVar = new b(this.red, cVar);
        bVar.purple = obj;
        return bVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:33)|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0155, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0156, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0031 -> B:5:0x0013). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i4;
        double bravo;
        int i5;
        b bVar = this;
        int i10 = 0;
        int i11 = 1;
        ab abVar = (ab) bVar.purple;
        Od.a aVar = Od.a.alpha;
        int i12 = bVar.alpha;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.alpha(obj);
                ab abVar2 = abVar;
                c cVar = bVar.red;
                e eVar = cVar.bravo;
                int andSet = eVar.alpha.getAndSet(i10);
                int andSet2 = eVar.bravo.getAndSet(i10);
                int andSet3 = eVar.charlie.getAndSet(i10);
                String failReason = eVar.delta;
                Intrinsics.echo(failReason, "failReason");
                synchronized (cVar.delta) {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j5 = cVar.foxtrot;
                        i4 = i10;
                        if (j5 != 0) {
                            cVar.echo = (elapsedRealtime - j5) + cVar.echo;
                            cVar.foxtrot = elapsedRealtime;
                        }
                        long j6 = elapsedRealtime - cVar.golf;
                        if (j6 < 1) {
                            j6 = 1;
                        }
                        bravo = J4.bravo(cVar.echo / j6, 0.0d, 1.0d);
                        cVar.echo = 0L;
                        cVar.golf = elapsedRealtime;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                double d4 = 0.0d;
                if (andSet == 0 && andSet2 == 0 && bravo == 0.0d) {
                    i5 = i4;
                    i11 = 1;
                } else {
                    if (andSet > 0) {
                        d4 = J4.bravo(andSet3 / andSet, 0.0d, 1.0d);
                    }
                    Context context = cVar.alpha;
                    i5 = i4;
                    Pair pair = new Pair("transport", cVar.charlie);
                    Pair pair2 = new Pair("success_count", String.valueOf(andSet));
                    Pair pair3 = new Pair("failure_count", String.valueOf(andSet2));
                    Pair pair4 = new Pair("delivered_count", String.valueOf(andSet3));
                    Pair pair5 = new Pair("fail_reason", failReason);
                    Locale locale = Locale.US;
                    Double valueOf = Double.valueOf(bravo);
                    i11 = 1;
                    Object[] objArr = new Object[1];
                    objArr[i5] = valueOf;
                    Pair pair6 = new Pair("connected_ratio", String.format(locale, "%.2f", Arrays.copyOf(objArr, 1)));
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Double.valueOf(d4);
                    Pair pair7 = new Pair("delivered_ratio", String.format(locale, "%.2f", Arrays.copyOf(objArr2, 1)));
                    Pair[] pairArr = new Pair[7];
                    pairArr[i5] = pair;
                    pairArr[1] = pair2;
                    pairArr[2] = pair3;
                    pairArr[3] = pair4;
                    pairArr[4] = pair5;
                    pairArr[5] = pair6;
                    pairArr[6] = pair7;
                    AbstractC3070v2.charlie(context, "location_send_stats", y.sierra(pairArr));
                    Result.Companion companion = Result.INSTANCE;
                    K7.b alpha = K7.b.alpha();
                    alpha.delta(andSet, "loc_send_window_success");
                    alpha.delta(andSet2, "loc_send_window_failure");
                    alpha.delta(andSet3, "loc_send_window_delivered");
                    Result.m206constructorimpl(alpha);
                }
                bVar = this;
                i10 = i5;
                abVar = abVar2;
                if (!ad.xray(abVar)) {
                    bVar.purple = abVar;
                    bVar.alpha = i11;
                    if (ad.november(60000L, bVar) == aVar) {
                        return aVar;
                    }
                    ab abVar22 = abVar;
                    c cVar2 = bVar.red;
                    e eVar2 = cVar2.bravo;
                    int andSet4 = eVar2.alpha.getAndSet(i10);
                    int andSet22 = eVar2.bravo.getAndSet(i10);
                    int andSet32 = eVar2.charlie.getAndSet(i10);
                    String failReason2 = eVar2.delta;
                    Intrinsics.echo(failReason2, "failReason");
                    synchronized (cVar2.delta) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            if (!ad.xray(abVar)) {
            }
        }
    }
}
