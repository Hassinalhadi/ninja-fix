package com.checkout.risk;

import Nd.c;
import Nd.j;
import Od.a;
import android.content.Context;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.risk.FingerprintResult;
import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSFactory;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro.e;
import com.fingerprintjs.android.fpjs_pro.h;
import com.fingerprintjs.android.fpjs_pro_internal.D2;
import com.fingerprintjs.android.fpjs_pro_internal.fO27287;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J6;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/checkout/risk/FingerprintService;", "", "Landroid/content/Context;", "context", "Lcom/checkout/risk/RiskSDKInternalConfig;", "internalConfig", "", "fingerprintPublicKey", "<init>", "(Landroid/content/Context;Lcom/checkout/risk/RiskSDKInternalConfig;Ljava/lang/String;)V", "", "generateMetaData", "()Ljava/util/Map;", "Lcom/checkout/risk/FingerprintResult;", "publishData", "(LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/RiskSDKInternalConfig;", "Lcom/fingerprintjs/android/fpjs_pro/h;", "client", "Lcom/fingerprintjs/android/fpjs_pro/h;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintService {

    @NotNull
    private final h client;

    @NotNull
    private final RiskSDKInternalConfig internalConfig;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, C2.d] */
    public FingerprintService(@NotNull Context context, @NotNull RiskSDKInternalConfig internalConfig, @NotNull String fingerprintPublicKey) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(internalConfig, "internalConfig");
        Intrinsics.echo(fingerprintPublicKey, "fingerprintPublicKey");
        this.internalConfig = internalConfig;
        FingerprintJSFactory fingerprintJSFactory = new FingerprintJSFactory(context);
        String fingerprintEndpoint = internalConfig.getFingerprintEndpoint();
        e[] eVarArr = e.alpha;
        List emptyList = CollectionsKt.emptyList();
        List emptyList2 = CollectionsKt.emptyList();
        ?? obj = new Object();
        obj.purple = fingerprintPublicKey;
        obj.red = fingerprintEndpoint;
        obj.silver = emptyList;
        obj.teal = emptyList2;
        obj.alpha = 5000L;
        D2 d22 = new D2(new fO27287.AnonymousClass2(obj));
        FingerprintJSFactory.delta = (FingerprintJSFactory.echo + 73) % 128;
        this.client = d22;
    }

    private final Map<String, String> generateMetaData() {
        return y.sierra(new Pair("fpjsSource", this.internalConfig.getSourceType().getRawValue()), new Pair("fpjsTimestamp", String.valueOf(System.currentTimeMillis())));
    }

    @Nullable
    public final Object publishData(@NotNull c<? super FingerprintResult> cVar) {
        final j jVar = new j(J6.delta(cVar));
        ((D2) this.client).india(generateMetaData(), new Function1<FingerprintJSProResponse, Unit>() { // from class: com.checkout.risk.FingerprintService$publishData$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FingerprintJSProResponse fingerprintJSProResponse) {
                invoke2(fingerprintJSProResponse);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull FingerprintJSProResponse it) {
                Intrinsics.echo(it, "it");
                c<FingerprintResult> cVar2 = jVar;
                Result.Companion companion = Result.INSTANCE;
                cVar2.resumeWith(Result.m206constructorimpl(new FingerprintResult.Success(it.alpha)));
            }
        }, new Function1<Error, Unit>() { // from class: com.checkout.risk.FingerprintService$publishData$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Error it) {
                Intrinsics.echo(it, "it");
                c<FingerprintResult> cVar2 = jVar;
                String str = it.bravo;
                if (str == null) {
                    str = LogMessages.UNKNOWN_ERROR;
                }
                cVar2.resumeWith(Result.m206constructorimpl(new FingerprintResult.Failure(str)));
            }
        });
        Object alpha = jVar.alpha();
        a aVar = a.alpha;
        return alpha;
    }
}
