package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.AbstractC3017k3;
import vf.ad;
import xf.EnumC3340a;
import xf.i;
import xf.k;
import xf.l;
import xf.n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/airbnb/lottie/compose/LottieRetrySignal;", "", "<init>", "()V", "", "retry", "awaitRetry", "(LNd/c;)Ljava/lang/Object;", "Lxf/i;", "channel", "Lxf/i;", "", "<set-?>", "isAwaitingRetry$delegate", "Landroidx/compose/runtime/ax;", "isAwaitingRetry", "()Z", "setAwaitingRetry", "(Z)V", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieRetrySignal {
    public static final int $stable = 0;

    @NotNull
    private final i channel = AbstractC3017k3.bravo(1, 4, EnumC3340a.purple);

    /* renamed from: isAwaitingRetry$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax isAwaitingRetry = C0564b.zulu(Boolean.FALSE);

    private final void setAwaitingRetry(boolean z2) {
        this.isAwaitingRetry.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitRetry(@NotNull c<? super Unit> cVar) {
        LottieRetrySignal$awaitRetry$1 lottieRetrySignal$awaitRetry$1;
        int i4;
        LottieRetrySignal lottieRetrySignal;
        if (cVar instanceof LottieRetrySignal$awaitRetry$1) {
            lottieRetrySignal$awaitRetry$1 = (LottieRetrySignal$awaitRetry$1) cVar;
            int i5 = lottieRetrySignal$awaitRetry$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                lottieRetrySignal$awaitRetry$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = lottieRetrySignal$awaitRetry$1.result;
                a aVar = a.alpha;
                i4 = lottieRetrySignal$awaitRetry$1.label;
                if (i4 == 0) {
                    if (i4 == 1) {
                        lottieRetrySignal = (LottieRetrySignal) lottieRetrySignal$awaitRetry$1.L$0;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th) {
                            th = th;
                            lottieRetrySignal.setAwaitingRetry(false);
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    try {
                        setAwaitingRetry(true);
                        i iVar = this.channel;
                        lottieRetrySignal$awaitRetry$1.L$0 = this;
                        lottieRetrySignal$awaitRetry$1.label = 1;
                        if (iVar.india(lottieRetrySignal$awaitRetry$1) == aVar) {
                            return aVar;
                        }
                        lottieRetrySignal = this;
                    } catch (Throwable th2) {
                        th = th2;
                        lottieRetrySignal = this;
                        lottieRetrySignal.setAwaitingRetry(false);
                        throw th;
                    }
                }
                lottieRetrySignal.setAwaitingRetry(false);
                return Unit.INSTANCE;
            }
        }
        lottieRetrySignal$awaitRetry$1 = new LottieRetrySignal$awaitRetry$1(this, cVar);
        Object obj2 = lottieRetrySignal$awaitRetry$1.result;
        a aVar2 = a.alpha;
        i4 = lottieRetrySignal$awaitRetry$1.label;
        if (i4 == 0) {
        }
        lottieRetrySignal.setAwaitingRetry(false);
        return Unit.INSTANCE;
    }

    public final boolean isAwaitingRetry() {
        return ((Boolean) this.isAwaitingRetry.getValue()).booleanValue();
    }

    public final void retry() {
        i iVar = this.channel;
        Unit unit = Unit.INSTANCE;
        Object mike = iVar.mike(unit);
        if (!(mike instanceof k)) {
        } else {
            Object obj = ((l) ad.amber(Nd.i.alpha, new n(iVar, unit, null))).alpha;
        }
    }
}
