package com.checkout.components.redirecthandler.model;

import Xd.l;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/redirecthandler/model/RedirectRequest;", "", "", "redirectUrl", "Lkotlin/Function2;", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "", "resultHandler", "<init>", "(Ljava/lang/String;LXd/l;)V", "component1", "()Ljava/lang/String;", "component2", "()LXd/l;", Constants.COPY_TYPE, "(Ljava/lang/String;LXd/l;)Lcom/checkout/components/redirecthandler/model/RedirectRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRedirectUrl", "b", "LXd/l;", "getResultHandler", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RedirectRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String redirectUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l resultHandler;

    public RedirectRequest(@NotNull String redirectUrl, @NotNull l resultHandler) {
        Intrinsics.echo(redirectUrl, "redirectUrl");
        Intrinsics.echo(resultHandler, "resultHandler");
        this.redirectUrl = redirectUrl;
        this.resultHandler = resultHandler;
    }

    public static /* synthetic */ RedirectRequest copy$default(RedirectRequest redirectRequest, String str, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = redirectRequest.redirectUrl;
        }
        if ((i4 & 2) != 0) {
            lVar = redirectRequest.resultHandler;
        }
        return redirectRequest.copy(str, lVar);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final l getResultHandler() {
        return this.resultHandler;
    }

    @NotNull
    public final RedirectRequest copy(@NotNull String redirectUrl, @NotNull l resultHandler) {
        Intrinsics.echo(redirectUrl, "redirectUrl");
        Intrinsics.echo(resultHandler, "resultHandler");
        return new RedirectRequest(redirectUrl, resultHandler);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectRequest)) {
            return false;
        }
        RedirectRequest redirectRequest = (RedirectRequest) other;
        return Intrinsics.areEqual(this.redirectUrl, redirectRequest.redirectUrl) && Intrinsics.areEqual(this.resultHandler, redirectRequest.resultHandler);
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final l getResultHandler() {
        return this.resultHandler;
    }

    public final int hashCode() {
        return this.resultHandler.hashCode() + (this.redirectUrl.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RedirectRequest(redirectUrl=" + this.redirectUrl + ", resultHandler=" + this.resultHandler + ")";
    }
}
