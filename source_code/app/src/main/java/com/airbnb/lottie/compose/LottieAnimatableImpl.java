package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import b.Q;
import bz.AbstractC0779d;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J4;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJl\u0010\u001a\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%R+\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u0010\u000f\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R+\u0010\u0010\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00128V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010\u0011\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010(\u001a\u0004\b>\u0010?\"\u0004\b@\u0010%R+\u0010\u0019\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010(\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R\u001b\u0010G\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010?R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010(\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010P\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010(\u001a\u0004\bN\u0010?\"\u0004\bO\u0010%R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010(\u001a\u0004\bR\u0010?\"\u0004\bS\u0010%R+\u0010Y\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001e8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bT\u0010(\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001b\u0010\\\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010E\u001a\u0004\b[\u0010?R\u001b\u0010^\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b]\u0010E\u001a\u0004\b^\u0010*R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "snapTo", "(Lcom/airbnb/lottie/LottieComposition;FIZLNd/c;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "animate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLNd/c;)Ljava/lang/Object;", "doFrame", "(ILNd/c;)Ljava/lang/Object;", "", "frameNanos", "onFrame", "(IJ)Z", "roundToCompositionFrameRate", "(FLcom/airbnb/lottie/LottieComposition;)F", "updateProgress", "(F)V", "<set-?>", "isPlaying$delegate", "Landroidx/compose/runtime/ax;", "isPlaying", "()Z", "setPlaying", "(Z)V", "iteration$delegate", "getIteration", "()I", "setIteration", "(I)V", "iterations$delegate", "getIterations", "setIterations", "reverseOnRepeat$delegate", "getReverseOnRepeat", "setReverseOnRepeat", "clipSpec$delegate", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "speed$delegate", "getSpeed", "()F", "setSpeed", "useCompositionFrameRate$delegate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "frameSpeed$delegate", "Landroidx/compose/runtime/D0;", "getFrameSpeed", "frameSpeed", "composition$delegate", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "progressRaw$delegate", "getProgressRaw", "setProgressRaw", "progressRaw", "progress$delegate", "getProgress", "setProgress", "lastFrameNanos$delegate", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos", "endProgress$delegate", "getEndProgress", "endProgress", "isAtEnd$delegate", "isAtEnd", "Lb/Q;", "mutex", "Lb/Q;", "getValue", "()Ljava/lang/Float;", "value", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimatableImpl implements LottieAnimatable {

    /* renamed from: clipSpec$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax clipSpec;

    /* renamed from: composition$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax composition;

    /* renamed from: endProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 endProgress;

    /* renamed from: frameSpeed$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 frameSpeed;

    /* renamed from: isAtEnd$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 isAtEnd;

    /* renamed from: isPlaying$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax isPlaying;

    /* renamed from: iteration$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax iteration;

    /* renamed from: iterations$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax iterations;

    /* renamed from: lastFrameNanos$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax lastFrameNanos;

    @NotNull
    private final Q mutex;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax progress;

    /* renamed from: progressRaw$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax progressRaw;

    /* renamed from: reverseOnRepeat$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax reverseOnRepeat;

    /* renamed from: speed$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax speed;

    /* renamed from: useCompositionFrameRate$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax useCompositionFrameRate;

    public LottieAnimatableImpl() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = C0564b.zulu(bool);
        this.iteration = C0564b.zulu(1);
        this.iterations = C0564b.zulu(1);
        this.reverseOnRepeat = C0564b.zulu(bool);
        this.clipSpec = C0564b.zulu(null);
        this.speed = C0564b.zulu(Float.valueOf(1.0f));
        this.useCompositionFrameRate = C0564b.zulu(bool);
        this.frameSpeed = C0564b.quebec(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf((LottieAnimatableImpl.this.getReverseOnRepeat() && LottieAnimatableImpl.this.getIteration() % 2 == 0) ? -LottieAnimatableImpl.this.getSpeed() : LottieAnimatableImpl.this.getSpeed());
            }
        });
        this.composition = C0564b.zulu(null);
        Float valueOf = Float.valueOf(0.0f);
        this.progressRaw = C0564b.zulu(valueOf);
        this.progress = C0564b.zulu(valueOf);
        this.lastFrameNanos = C0564b.zulu(Long.MIN_VALUE);
        this.endProgress = C0564b.quebec(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                LottieComposition composition = LottieAnimatableImpl.this.getComposition();
                float f5 = 0.0f;
                if (composition != null) {
                    if (LottieAnimatableImpl.this.getSpeed() < 0.0f) {
                        LottieClipSpec clipSpec = LottieAnimatableImpl.this.getClipSpec();
                        if (clipSpec != null) {
                            f5 = clipSpec.getMinProgress$lottie_compose_release(composition);
                        }
                    } else {
                        LottieClipSpec clipSpec2 = LottieAnimatableImpl.this.getClipSpec();
                        f5 = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
                    }
                }
                return Float.valueOf(f5);
            }
        });
        this.isAtEnd = C0564b.quebec(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$isAtEnd$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                boolean z2;
                float endProgress;
                if (LottieAnimatableImpl.this.getIteration() == LottieAnimatableImpl.this.getIterations()) {
                    float progress = LottieAnimatableImpl.this.getProgress();
                    endProgress = LottieAnimatableImpl.this.getEndProgress();
                    if (progress == endProgress) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        });
        this.mutex = new Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doFrame(final int i4, c<? super Boolean> cVar) {
        if (i4 == Integer.MAX_VALUE) {
            return AbstractC0779d.lima(new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Long l10) {
                    return invoke(l10.longValue());
                }

                @NotNull
                public final Boolean invoke(long j5) {
                    boolean onFrame;
                    onFrame = LottieAnimatableImpl.this.onFrame(i4, j5);
                    return Boolean.valueOf(onFrame);
                }
            }, cVar);
        }
        return C0564b.sierra(cVar.getContext()).blue(new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$doFrame$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Long l10) {
                return invoke(l10.longValue());
            }

            @NotNull
            public final Boolean invoke(long j5) {
                boolean onFrame;
                onFrame = LottieAnimatableImpl.this.onFrame(i4, j5);
                return Boolean.valueOf(onFrame);
            }
        }, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getEndProgress() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    private final float getFrameSpeed() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    private final float getProgressRaw() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFrame(int iterations, long frameNanos) {
        long lastFrameNanos;
        float f5;
        float f10;
        float progressRaw;
        float f11;
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        if (getLastFrameNanos() == Long.MIN_VALUE) {
            lastFrameNanos = 0;
        } else {
            lastFrameNanos = frameNanos - getLastFrameNanos();
        }
        setLastFrameNanos(frameNanos);
        LottieClipSpec clipSpec = getClipSpec();
        if (clipSpec != null) {
            f5 = clipSpec.getMinProgress$lottie_compose_release(composition);
        } else {
            f5 = 0.0f;
        }
        LottieClipSpec clipSpec2 = getClipSpec();
        if (clipSpec2 != null) {
            f10 = clipSpec2.getMaxProgress$lottie_compose_release(composition);
        } else {
            f10 = 1.0f;
        }
        float duration = (((float) (lastFrameNanos / 1000000)) / composition.getDuration()) * getFrameSpeed();
        if (getFrameSpeed() < 0.0f) {
            progressRaw = f5 - (getProgressRaw() + duration);
        } else {
            progressRaw = (getProgressRaw() + duration) - f10;
        }
        if (f5 == f10) {
            updateProgress(f5);
            return false;
        }
        if (progressRaw < 0.0f) {
            updateProgress(J4.charlie(getProgressRaw(), f5, f10) + duration);
        } else {
            float f12 = f10 - f5;
            int i4 = (int) (progressRaw / f12);
            int i5 = i4 + 1;
            if (getIteration() + i5 > iterations) {
                updateProgress(getEndProgress());
                setIteration(iterations);
                return false;
            }
            setIteration(getIteration() + i5);
            float f13 = progressRaw - (i4 * f12);
            if (getFrameSpeed() < 0.0f) {
                f11 = f10 - f13;
            } else {
                f11 = f5 + f13;
            }
            updateProgress(f11);
        }
        return true;
    }

    private final float roundToCompositionFrameRate(float f5, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f5;
        }
        return f5 - (f5 % (1 / lottieComposition.getFrameRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipSpec(LottieClipSpec lottieClipSpec) {
        this.clipSpec.setValue(lottieClipSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComposition(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIteration(int i4) {
        this.iteration.setValue(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIterations(int i4) {
        this.iterations.setValue(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastFrameNanos(long j5) {
        this.lastFrameNanos.setValue(Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaying(boolean z2) {
        this.isPlaying.setValue(Boolean.valueOf(z2));
    }

    private void setProgress(float f5) {
        this.progress.setValue(Float.valueOf(f5));
    }

    private final void setProgressRaw(float f5) {
        this.progressRaw.setValue(Float.valueOf(f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseOnRepeat(boolean z2) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f5) {
        this.speed.setValue(Float.valueOf(f5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCompositionFrameRate(boolean z2) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(float progress) {
        setProgressRaw(progress);
        if (getUseCompositionFrameRate()) {
            progress = roundToCompositionFrameRate(progress, getComposition());
        }
        setProgress(progress);
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    @Nullable
    public Object animate(@Nullable LottieComposition lottieComposition, int i4, int i5, boolean z2, float f5, @Nullable LottieClipSpec lottieClipSpec, float f10, boolean z10, @NotNull LottieCancellationBehavior lottieCancellationBehavior, boolean z11, boolean z12, @NotNull c<? super Unit> cVar) {
        Object bravo = Q.bravo(this.mutex, new LottieAnimatableImpl$animate$2(this, i4, i5, z2, f5, lottieClipSpec, lottieComposition, f10, z12, z10, lottieCancellationBehavior, null), cVar);
        if (bravo == a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    @Nullable
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.clipSpec.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    @Nullable
    public LottieComposition getComposition() {
        return (LottieComposition) this.composition.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public long getLastFrameNanos() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.isAtEnd.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.isPlaying.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    @Nullable
    public Object snapTo(@Nullable LottieComposition lottieComposition, float f5, int i4, boolean z2, @NotNull c<? super Unit> cVar) {
        Object bravo = Q.bravo(this.mutex, new LottieAnimatableImpl$snapTo$2(this, lottieComposition, f5, i4, z2, null), cVar);
        if (bravo == a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable, com.airbnb.lottie.compose.LottieAnimationState, androidx.compose.runtime.D0
    @NotNull
    public Float getValue() {
        return Float.valueOf(getProgress());
    }
}
