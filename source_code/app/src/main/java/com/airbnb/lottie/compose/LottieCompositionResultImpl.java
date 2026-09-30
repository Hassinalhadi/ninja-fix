package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import com.airbnb.lottie.LottieComposition;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.C3213q;
import vf.InterfaceC3212p;
import vf.ad;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R/\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\nR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000fR\u001b\u0010\"\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001b\u0010'\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001b\u0010)\u001a\u00020\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#¨\u0006*"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "await", "(LNd/c;)Ljava/lang/Object;", "composition", "", "complete$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "complete", "", RedirectCustomTabEventLogger.RESULT_ERROR, "completeExceptionally$lottie_compose_release", "(Ljava/lang/Throwable;)V", "completeExceptionally", "Lvf/p;", "compositionDeferred", "Lvf/p;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/ax;", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", "value", "error$delegate", "getError", "()Ljava/lang/Throwable;", "setError", "", "isLoading$delegate", "Landroidx/compose/runtime/D0;", "isLoading", "()Z", "isComplete$delegate", "isComplete", "isFailure$delegate", "isFailure", "isSuccess$delegate", "isSuccess", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieCompositionResultImpl implements LottieCompositionResult {
    public static final int $stable = 0;

    @NotNull
    private final InterfaceC3212p compositionDeferred = ad.bravo();

    /* renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax value = C0564b.zulu(null);

    /* renamed from: error$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax error = C0564b.zulu(null);

    /* renamed from: isLoading$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 isLoading = C0564b.quebec(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.getError() == null);
        }
    });

    /* renamed from: isComplete$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 isComplete = C0564b.quebec(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf((LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.getError() == null) ? false : true);
        }
    });

    /* renamed from: isFailure$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 isFailure = C0564b.quebec(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getError() != null);
        }
    });

    /* renamed from: isSuccess$delegate, reason: from kotlin metadata */
    @NotNull
    private final D0 isSuccess = C0564b.quebec(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() != null);
        }
    });

    private void setError(Throwable th) {
        this.error.setValue(th);
    }

    private void setValue(LottieComposition lottieComposition) {
        this.value.setValue(lottieComposition);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    @Nullable
    public Object await(@NotNull c<? super LottieComposition> cVar) {
        Object tango = ((C3213q) this.compositionDeferred).tango(cVar);
        a aVar = a.alpha;
        return tango;
    }

    public final synchronized void complete$lottie_compose_release(@NotNull LottieComposition composition) {
        Intrinsics.echo(composition, "composition");
        if (isComplete()) {
            return;
        }
        setValue(composition);
        ((C3213q) this.compositionDeferred).magenta(composition);
    }

    public final synchronized void completeExceptionally$lottie_compose_release(@NotNull Throwable error) {
        Intrinsics.echo(error, "error");
        if (isComplete()) {
            return;
        }
        setError(error);
        ((C3213q) this.compositionDeferred).yellow(error);
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    @Nullable
    public Throwable getError() {
        return (Throwable) this.error.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isComplete() {
        return ((Boolean) this.isComplete.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isFailure() {
        return ((Boolean) this.isFailure.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isLoading() {
        return ((Boolean) this.isLoading.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public boolean isSuccess() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult, androidx.compose.runtime.D0
    @Nullable
    public LottieComposition getValue() {
        return (LottieComposition) this.value.getValue();
    }
}
