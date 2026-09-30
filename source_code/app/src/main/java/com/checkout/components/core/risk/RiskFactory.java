package com.checkout.components.core.risk;

import Nd.c;
import Od.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.G;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.risk.Risk;
import com.checkout.risk.RiskConfig;
import com.checkout.risk.RiskEnvironment;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/core/risk/RiskFactory;", "", "Landroid/content/Context;", "context", "", "publicKey", "Lcom/checkout/risk/RiskEnvironment;", "environment", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/checkout/risk/RiskEnvironment;)V", "Lkotlin/Result;", "Lcom/checkout/risk/Risk;", "build-IoAF18A$core_standardRelease", "(LNd/c;)Ljava/lang/Object;", "build", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RiskFactory {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4996a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4997b;

    /* renamed from: c, reason: collision with root package name */
    private final RiskEnvironment f4998c;

    public RiskFactory(@NotNull Context context, @NotNull String publicKey, @NotNull RiskEnvironment environment) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(publicKey, "publicKey");
        Intrinsics.echo(environment, "environment");
        this.f4996a = context;
        this.f4997b = publicKey;
        this.f4998c = environment;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0052, B:16:0x0057, B:21:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:10:0x0023, B:11:0x004e, B:13:0x0052, B:16:0x0057, B:21:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Nullable
    /* renamed from: build-IoAF18A$core_standardRelease, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m84buildIoAF18A$core_standardRelease(@NotNull c<? super Result<Risk>> cVar) {
        G g2;
        int i4;
        Risk risk;
        try {
            if (cVar instanceof G) {
                g2 = (G) cVar;
                int i5 = g2.f4631c;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    g2.f4631c = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = g2.f4629a;
                    a aVar = a.alpha;
                    i4 = g2.f4631c;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        Risk.Companion companion = Risk.INSTANCE;
                        Context context = this.f4996a;
                        RiskConfig riskConfig = new RiskConfig(this.f4997b, this.f4998c, null, 4, null);
                        g2.f4631c = 1;
                        obj = companion.getInstance(context, riskConfig, g2);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    risk = (Risk) obj;
                    if (risk == null) {
                        return Result.m206constructorimpl(risk);
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m206constructorimpl(ResultKt.createFailure(new IllegalStateException(CommonErrorMessages.RISK_SDK_INSTANCE_NULL_ERROR)));
                }
            }
            if (i4 == 0) {
            }
            risk = (Risk) obj;
            if (risk == null) {
            }
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m206constructorimpl(ResultKt.createFailure(e));
        }
        g2 = new G(this, cVar);
        Object obj2 = g2.f4629a;
        a aVar2 = a.alpha;
        i4 = g2.f4631c;
    }
}
