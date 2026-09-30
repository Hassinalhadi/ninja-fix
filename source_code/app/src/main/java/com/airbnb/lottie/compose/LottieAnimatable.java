package com.airbnb.lottie.compose;

import Nd.c;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0080\u0001\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "snapTo", "(Lcom/airbnb/lottie/LottieComposition;FIZLNd/c;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "animate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLNd/c;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LottieAnimatable extends LottieAnimationState {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object animate$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i4, int i5, boolean z2, float f5, LottieClipSpec lottieClipSpec, float f10, boolean z10, LottieCancellationBehavior lottieCancellationBehavior, boolean z11, boolean z12, c cVar, int i10, Object obj) {
            int i11;
            int i12;
            boolean z13;
            float f11;
            LottieClipSpec lottieClipSpec2;
            float f12;
            boolean z14;
            LottieCancellationBehavior lottieCancellationBehavior2;
            boolean z15;
            boolean z16;
            LottieAnimatable lottieAnimatable2;
            c cVar2;
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    i11 = lottieAnimatable.getIteration();
                } else {
                    i11 = i4;
                }
                if ((i10 & 4) != 0) {
                    i12 = lottieAnimatable.getIterations();
                } else {
                    i12 = i5;
                }
                if ((i10 & 8) != 0) {
                    z13 = lottieAnimatable.getReverseOnRepeat();
                } else {
                    z13 = z2;
                }
                if ((i10 & 16) != 0) {
                    f11 = lottieAnimatable.getSpeed();
                } else {
                    f11 = f5;
                }
                if ((i10 & 32) != 0) {
                    lottieClipSpec2 = lottieAnimatable.getClipSpec();
                } else {
                    lottieClipSpec2 = lottieClipSpec;
                }
                if ((i10 & 64) != 0) {
                    f12 = LottieAnimatableKt.access$defaultProgress(lottieComposition, lottieClipSpec2, f11);
                } else {
                    f12 = f10;
                }
                if ((i10 & 128) != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                    lottieCancellationBehavior2 = LottieCancellationBehavior.Immediately;
                } else {
                    lottieCancellationBehavior2 = lottieCancellationBehavior;
                }
                if ((i10 & 512) != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if ((i10 & Barcode.FORMAT_UPC_E) != 0) {
                    z16 = false;
                    cVar2 = cVar;
                    lottieAnimatable2 = lottieAnimatable;
                } else {
                    z16 = z12;
                    lottieAnimatable2 = lottieAnimatable;
                    cVar2 = cVar;
                }
                return lottieAnimatable2.animate(lottieComposition, i11, i12, z13, f11, lottieClipSpec2, f12, z14, lottieCancellationBehavior2, z15, z16, cVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }

        public static long getLastFrameNanos(@NotNull LottieAnimatable lottieAnimatable) {
            return LottieAnimationState.DefaultImpls.getLastFrameNanos(lottieAnimatable);
        }

        public static /* synthetic */ Object snapTo$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, float f5, int i4, boolean z2, c cVar, int i5, Object obj) {
            boolean z10;
            if (obj == null) {
                if ((i5 & 1) != 0) {
                    lottieComposition = lottieAnimatable.getComposition();
                }
                if ((i5 & 2) != 0) {
                    f5 = lottieAnimatable.getProgress();
                }
                if ((i5 & 4) != 0) {
                    i4 = lottieAnimatable.getIteration();
                }
                if ((i5 & 8) != 0) {
                    if (f5 == lottieAnimatable.getProgress()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z2 = !z10;
                }
                return lottieAnimatable.snapTo(lottieComposition, f5, i4, z2, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
        }
    }

    @Nullable
    Object animate(@Nullable LottieComposition lottieComposition, int i4, int i5, boolean z2, float f5, @Nullable LottieClipSpec lottieClipSpec, float f10, boolean z10, @NotNull LottieCancellationBehavior lottieCancellationBehavior, boolean z11, boolean z12, @NotNull c<? super Unit> cVar);

    @Override // com.airbnb.lottie.compose.LottieAnimationState, androidx.compose.runtime.D0
    /* synthetic */ Object getValue();

    @Nullable
    Object snapTo(@Nullable LottieComposition lottieComposition, float f5, int i4, boolean z2, @NotNull c<? super Unit> cVar);
}
