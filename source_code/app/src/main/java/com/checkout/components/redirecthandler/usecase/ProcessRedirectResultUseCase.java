package com.checkout.components.redirecthandler.usecase;

import N4.a;
import android.net.Uri;
import av.q;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.redirecthandler.model.RedirectResult;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000b2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/checkout/components/redirecthandler/usecase/ProcessRedirectResultUseCase;", "Lcom/checkout/components/interfaces/usecase/UseCase;", "", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;)V", Column.DATA, "execute", "(Ljava/lang/String;)Lcom/checkout/components/redirecthandler/model/RedirectResult;", "Companion", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProcessRedirectResultUseCase implements UseCase<String, RedirectResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Logger f5694a;

    public ProcessRedirectResultUseCase(@NotNull Logger logger) {
        Intrinsics.echo(logger, "logger");
        this.f5694a = logger;
    }

    private final void a(String str) {
        a.delta(this.f5694a, "Failed to parse cko-decline-reason", "redirect_decline_reason_parse_failed", q.echo("url=", str), null, 8, null);
    }

    @Override // com.checkout.components.interfaces.usecase.UseCase
    @Nullable
    public final RedirectResult execute(@NotNull String data) {
        Object m206constructorimpl;
        Intrinsics.echo(data, "data");
        if (StringsKt.beige(data, RedirectionConstants.REDIRECT_SUCCESS, false)) {
            return RedirectResult.Success.INSTANCE;
        }
        if (!StringsKt.beige(data, RedirectionConstants.REDIRECT_FAILURE, false)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Uri.parse(data).getQueryParameter(RedirectionConstants.DECLINE_REASON_PARAM));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
            a(data);
        }
        return new RedirectResult.Failure((String) (m206constructorimpl instanceof k ? null : m206constructorimpl));
    }
}
