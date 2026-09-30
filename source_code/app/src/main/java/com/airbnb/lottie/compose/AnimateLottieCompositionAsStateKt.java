package com.airbnb.lottie.compose;

import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import av.q;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0011\u001a\u00020\u00102\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "", "isPlaying", "restartOnPlay", "reverseOnRepeat", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "", "speed", "", "iterations", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "animateLottieCompositionAsState", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/m;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "wasPlaying", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimateLottieCompositionAsStateKt {
    @NotNull
    public static final LottieAnimationState animateLottieCompositionAsState(@Nullable LottieComposition lottieComposition, boolean z2, boolean z10, boolean z11, @Nullable LottieClipSpec lottieClipSpec, float f5, int i4, @Nullable LottieCancellationBehavior lottieCancellationBehavior, boolean z12, boolean z13, @Nullable InterfaceC0581m interfaceC0581m, int i5, int i10) {
        boolean z14;
        boolean z15;
        boolean z16;
        LottieClipSpec lottieClipSpec2;
        float f10;
        int i11;
        LottieCancellationBehavior lottieCancellationBehavior2;
        boolean z17;
        boolean z18;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(683659508);
        if ((i10 & 2) != 0) {
            z14 = true;
        } else {
            z14 = z2;
        }
        if ((i10 & 4) != 0) {
            z15 = true;
        } else {
            z15 = z10;
        }
        if ((i10 & 8) != 0) {
            z16 = false;
        } else {
            z16 = z11;
        }
        if ((i10 & 16) != 0) {
            lottieClipSpec2 = null;
        } else {
            lottieClipSpec2 = lottieClipSpec;
        }
        if ((i10 & 32) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f5;
        }
        if ((i10 & 64) != 0) {
            i11 = 1;
        } else {
            i11 = i4;
        }
        if ((i10 & 128) != 0) {
            lottieCancellationBehavior2 = LottieCancellationBehavior.Immediately;
        } else {
            lottieCancellationBehavior2 = lottieCancellationBehavior;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            z17 = false;
        } else {
            z17 = z12;
        }
        if ((i10 & 512) != 0) {
            z18 = false;
        } else {
            z18 = z13;
        }
        if (i11 > 0) {
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(c0585q, 0);
                c0585q.red(-180606964);
                Object jade = c0585q.jade();
                if (jade == C0580l.alpha) {
                    jade = C0564b.zulu(Boolean.valueOf(z14));
                    c0585q.f(jade);
                }
                ax axVar = (ax) jade;
                c0585q.quebec(false);
                c0585q.red(-180606834);
                if (!z17) {
                    f10 /= Utils.getAnimationScale((Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo));
                }
                float f11 = f10;
                c0585q.quebec(false);
                C0564b.india(new Object[]{lottieComposition, Boolean.valueOf(z14), lottieClipSpec2, Float.valueOf(f11), Integer.valueOf(i11)}, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z14, z15, rememberLottieAnimatable, lottieComposition, i11, z16, f11, lottieClipSpec2, lottieCancellationBehavior2, z18, axVar, null), c0585q);
                c0585q.quebec(false);
                return rememberLottieAnimatable;
            }
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f10 + ".").toString());
        }
        throw new IllegalArgumentException(q.delta(i11, "Iterations must be a positive number (", ").").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateLottieCompositionAsState$lambda$3(ax axVar) {
        return ((Boolean) axVar.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateLottieCompositionAsState$lambda$4(ax axVar, boolean z2) {
        axVar.setValue(Boolean.valueOf(z2));
    }
}
