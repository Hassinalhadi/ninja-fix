package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Lcom/airbnb/lottie/LottieComposition;", "awaitOrNull", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;LNd/c;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieCompositionResultKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitOrNull(@NotNull LottieCompositionResult lottieCompositionResult, @NotNull c<? super LottieComposition> cVar) {
        LottieCompositionResultKt$awaitOrNull$1 lottieCompositionResultKt$awaitOrNull$1;
        int i4;
        try {
            if (cVar instanceof LottieCompositionResultKt$awaitOrNull$1) {
                lottieCompositionResultKt$awaitOrNull$1 = (LottieCompositionResultKt$awaitOrNull$1) cVar;
                int i5 = lottieCompositionResultKt$awaitOrNull$1.label;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    lottieCompositionResultKt$awaitOrNull$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = lottieCompositionResultKt$awaitOrNull$1.result;
                    Object obj2 = a.alpha;
                    i4 = lottieCompositionResultKt$awaitOrNull$1.label;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        lottieCompositionResultKt$awaitOrNull$1.label = 1;
                        obj = lottieCompositionResult.await(lottieCompositionResultKt$awaitOrNull$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return (LottieComposition) obj;
                }
            }
            if (i4 == 0) {
            }
            return (LottieComposition) obj;
        } catch (Throwable unused) {
            return null;
        }
        lottieCompositionResultKt$awaitOrNull$1 = new LottieCompositionResultKt$awaitOrNull$1(cVar);
        Object obj3 = lottieCompositionResultKt$awaitOrNull$1.result;
        Object obj22 = a.alpha;
        i4 = lottieCompositionResultKt$awaitOrNull$1.label;
    }
}
