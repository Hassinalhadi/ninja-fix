package com.airbnb.lottie.compose;

import Nd.c;
import Nd.h;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.I;
import vf.U;
import vf.ab;
import vf.ad;

@e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimatableImpl$animate$2 extends i implements Function1<c<? super Unit>, Object> {
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    @e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements l {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ I $parentJob;
        int label;
        final /* synthetic */ LottieAnimatableImpl this$0;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, I i4, int i5, int i10, LottieAnimatableImpl lottieAnimatableImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$cancellationBehavior = lottieCancellationBehavior;
            this.$parentJob = i4;
            this.$iterations = i5;
            this.$iteration = i10;
            this.this$0 = lottieAnimatableImpl;
        }

        @Override // Pd.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, cVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
        @Override // Pd.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            /*
                r3 = this;
                Od.a r0 = Od.a.alpha
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.ResultKt.alpha(r4)
                goto L3f
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                kotlin.ResultKt.alpha(r4)
            L18:
                com.airbnb.lottie.compose.LottieCancellationBehavior r4 = r3.$cancellationBehavior
                int[] r1 = com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                int r4 = r4.ordinal()
                r4 = r1[r4]
                if (r4 != r2) goto L32
                vf.I r4 = r3.$parentJob
                boolean r4 = r4.echo()
                if (r4 == 0) goto L2f
                int r4 = r3.$iterations
                goto L34
            L2f:
                int r4 = r3.$iteration
                goto L34
            L32:
                int r4 = r3.$iterations
            L34:
                com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r3.this$0
                r3.label = r2
                java.lang.Object r4 = com.airbnb.lottie.compose.LottieAnimatableImpl.access$doFrame(r1, r4, r3)
                if (r4 != r0) goto L3f
                return r0
            L3f:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L18
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Xd.l
        @Nullable
        public final Object invoke(@NotNull ab abVar, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LottieCancellationBehavior.values().length];
            try {
                iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(LottieAnimatableImpl lottieAnimatableImpl, int i4, int i5, boolean z2, float f5, LottieClipSpec lottieClipSpec, LottieComposition lottieComposition, float f10, boolean z10, boolean z11, LottieCancellationBehavior lottieCancellationBehavior, c<? super LottieAnimatableImpl$animate$2> cVar) {
        super(1, cVar);
        this.this$0 = lottieAnimatableImpl;
        this.$iteration = i4;
        this.$iterations = i5;
        this.$reverseOnRepeat = z2;
        this.$speed = f5;
        this.$clipSpec = lottieClipSpec;
        this.$composition = lottieComposition;
        this.$initialProgress = f10;
        this.$useCompositionFrameRate = z10;
        this.$continueFromPreviousAnimate = z11;
        this.$cancellationBehavior = lottieCancellationBehavior;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@NotNull c<?> cVar) {
        return new LottieAnimatableImpl$animate$2(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable c<? super Unit> cVar) {
        return ((LottieAnimatableImpl$animate$2) create(cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        h hVar;
        float endProgress;
        a aVar = a.alpha;
        int i4 = this.label;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                this.this$0.setIteration(this.$iteration);
                this.this$0.setIterations(this.$iterations);
                this.this$0.setReverseOnRepeat(this.$reverseOnRepeat);
                this.this$0.setSpeed(this.$speed);
                this.this$0.setClipSpec(this.$clipSpec);
                this.this$0.setComposition(this.$composition);
                this.this$0.updateProgress(this.$initialProgress);
                this.this$0.setUseCompositionFrameRate(this.$useCompositionFrameRate);
                if (!this.$continueFromPreviousAnimate) {
                    this.this$0.setLastFrameNanos(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    this.this$0.setPlaying(false);
                    return Unit.INSTANCE;
                }
                if (!Float.isInfinite(this.$speed)) {
                    this.this$0.setPlaying(true);
                    int i5 = WhenMappings.$EnumSwitchMapping$0[this.$cancellationBehavior.ordinal()];
                    if (i5 != 1) {
                        if (i5 == 2) {
                            hVar = Nd.i.alpha;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        hVar = U.alpha;
                    }
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellationBehavior, ad.sierra(getContext()), this.$iterations, this.$iteration, this.this$0, null);
                    this.label = 1;
                    if (ad.blue(hVar, anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
                    endProgress = lottieAnimatableImpl.getEndProgress();
                    lottieAnimatableImpl.updateProgress(endProgress);
                    this.this$0.setPlaying(false);
                    this.this$0.setIteration(this.$iterations);
                    return Unit.INSTANCE;
                }
            }
            ad.oscar(getContext());
            this.this$0.setPlaying(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.setPlaying(false);
            throw th;
        }
    }
}
