package com.airbnb.lottie.compose;

import T.s;
import Z.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q0.AbstractC2372H;
import s6.AbstractC2627c7;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LT/s;", "", "width", "height", "lottieSize", "(LT/s;II)LT/s;", "LZ/e;", "Lq0/H;", "scale", "LQ0/m;", "times-UQTWf7w", "(JJ)J", "times", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationSizeNodeKt {
    @NotNull
    public static final s lottieSize(@NotNull s sVar, int i4, int i5) {
        Intrinsics.echo(sVar, "<this>");
        return sVar.then(new LottieAnimationSizeElement(i4, i5));
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    private static final long m14timesUQTWf7w(long j5, long j6) {
        float delta = e.delta(j5);
        int i4 = AbstractC2372H.alpha;
        return AbstractC2627c7.alpha((int) (Float.intBitsToFloat((int) (j6 >> 32)) * delta), (int) (Float.intBitsToFloat((int) (j6 & 4294967295L)) * e.bravo(j5)));
    }
}
