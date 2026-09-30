package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "rememberLottieAnimatable", "(Landroidx/compose/runtime/m;I)Lcom/airbnb/lottie/compose/LottieAnimatable;", "LottieAnimatable", "()Lcom/airbnb/lottie/compose/LottieAnimatable;", "", "resetToBeginning", "(Lcom/airbnb/lottie/compose/LottieAnimatable;LNd/c;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "", "speed", "defaultProgress", "(Lcom/airbnb/lottie/LottieComposition;Lcom/airbnb/lottie/compose/LottieClipSpec;F)F", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimatableKt {
    @NotNull
    public static final LottieAnimatable LottieAnimatable() {
        return new LottieAnimatableImpl();
    }

    public static final float defaultProgress(LottieComposition lottieComposition, LottieClipSpec lottieClipSpec, float f5) {
        if (f5 < 0.0f && lottieComposition == null) {
            return 1.0f;
        }
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (f5 < 0.0f) {
            if (lottieClipSpec == null) {
                return 1.0f;
            }
            return lottieClipSpec.getMaxProgress$lottie_compose_release(lottieComposition);
        }
        if (lottieClipSpec == null) {
            return 0.0f;
        }
        return lottieClipSpec.getMinProgress$lottie_compose_release(lottieComposition);
    }

    @NotNull
    public static final LottieAnimatable rememberLottieAnimatable(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(2024497114);
        c0585q.red(-610207850);
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = LottieAnimatable();
            c0585q.f(jade);
        }
        LottieAnimatable lottieAnimatable = (LottieAnimatable) jade;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return lottieAnimatable;
    }

    @Nullable
    public static final Object resetToBeginning(@NotNull LottieAnimatable lottieAnimatable, @NotNull c<? super Unit> cVar) {
        Object snapTo$default = LottieAnimatable.DefaultImpls.snapTo$default(lottieAnimatable, null, defaultProgress(lottieAnimatable.getComposition(), lottieAnimatable.getClipSpec(), lottieAnimatable.getSpeed()), 1, false, cVar, 9, null);
        if (snapTo$default == a.alpha) {
            return snapTo$default;
        }
        return Unit.INSTANCE;
    }
}
