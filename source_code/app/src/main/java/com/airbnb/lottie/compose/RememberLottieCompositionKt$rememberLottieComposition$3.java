package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import Xd.m;
import android.content.Context;
import androidx.compose.runtime.ax;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {93, 95}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$3 extends i implements l {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ m $onRetry;
    final /* synthetic */ ax $result$delegate;
    final /* synthetic */ LottieCompositionSpec $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$rememberLottieComposition$3(m mVar, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, ax axVar, c<? super RememberLottieCompositionKt$rememberLottieComposition$3> cVar) {
        super(2, cVar);
        this.$onRetry = mVar;
        this.$context = context;
        this.$spec = lottieCompositionSpec;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = axVar;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:15|(2:17|18)|20)|22|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008f -> B:9:0x0092). Please report as a decompilation issue!!! */
    @Override // Pd.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        int i4;
        Throwable th;
        LottieCompositionResultImpl rememberLottieComposition$lambda$1;
        LottieCompositionResultImpl rememberLottieComposition$lambda$12;
        int i5;
        Throwable th2;
        String ensureTrailingSlash;
        String ensureTrailingSlash2;
        String ensureLeadingPeriod;
        RememberLottieCompositionKt$rememberLottieComposition$3 rememberLottieCompositionKt$rememberLottieComposition$3;
        LottieCompositionResultImpl rememberLottieComposition$lambda$13;
        LottieCompositionResultImpl rememberLottieComposition$lambda$14;
        a aVar = a.alpha;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    i5 = this.I$0;
                    th2 = (Throwable) this.L$0;
                    try {
                        ResultKt.alpha(obj);
                        rememberLottieCompositionKt$rememberLottieComposition$3 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        i4 = i5 + 1;
                    }
                    try {
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        int i11 = i5;
                        th = th5;
                        i4 = i11 + 1;
                        rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
                        if (!rememberLottieComposition$lambda$13.isSuccess()) {
                        }
                        rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
                        if (!rememberLottieComposition$lambda$1.isComplete()) {
                            rememberLottieComposition$lambda$12 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
                            rememberLottieComposition$lambda$12.completeExceptionally$lottie_compose_release(th);
                        }
                        return Unit.INSTANCE;
                    }
                    rememberLottieComposition$lambda$14 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(rememberLottieCompositionKt$rememberLottieComposition$3.$result$delegate);
                    rememberLottieComposition$lambda$14.complete$lottie_compose_release((LottieComposition) obj);
                    int i12 = i5;
                    th = th2;
                    i4 = i12;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i4 = this.I$0;
                th = (Throwable) this.L$0;
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            i4 = 0;
            th = null;
        }
        rememberLottieComposition$lambda$13 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
        if (!rememberLottieComposition$lambda$13.isSuccess()) {
            if (i4 != 0) {
                m mVar = this.$onRetry;
                Integer num = new Integer(i4);
                Intrinsics.checkNotNull(th);
                this.L$0 = th;
                this.I$0 = i4;
                this.label = 1;
                obj = mVar.invoke(num, th, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            Throwable th6 = th;
            i5 = i4;
            th2 = th6;
            Context context = this.$context;
            LottieCompositionSpec lottieCompositionSpec = this.$spec;
            ensureTrailingSlash = RememberLottieCompositionKt.ensureTrailingSlash(this.$imageAssetsFolder);
            ensureTrailingSlash2 = RememberLottieCompositionKt.ensureTrailingSlash(this.$fontAssetsFolder);
            ensureLeadingPeriod = RememberLottieCompositionKt.ensureLeadingPeriod(this.$fontFileExtension);
            String str = this.$cacheKey;
            this.L$0 = th2;
            this.I$0 = i5;
            this.label = 2;
            rememberLottieCompositionKt$rememberLottieComposition$3 = this;
            obj = RememberLottieCompositionKt.lottieComposition(context, lottieCompositionSpec, ensureTrailingSlash, ensureTrailingSlash2, ensureLeadingPeriod, str, rememberLottieCompositionKt$rememberLottieComposition$3);
        }
        rememberLottieComposition$lambda$1 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
        if (!rememberLottieComposition$lambda$1.isComplete() && th != null) {
            rememberLottieComposition$lambda$12 = RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate);
            rememberLottieComposition$lambda$12.completeExceptionally$lottie_compose_release(th);
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super Unit> cVar) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
