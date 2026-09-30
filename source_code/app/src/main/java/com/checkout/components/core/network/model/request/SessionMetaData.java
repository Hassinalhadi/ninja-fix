package com.checkout.components.core.network.model.request;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/checkout/components/core/network/model/request/SessionMetaData;", "", "Lcom/checkout/components/core/network/model/request/InternalPlatform;", "internalPlatform", "Lcom/checkout/components/core/network/model/request/RedirectContext;", "redirectContext", "<init>", "(Lcom/checkout/components/core/network/model/request/InternalPlatform;Lcom/checkout/components/core/network/model/request/RedirectContext;)V", "component1", "()Lcom/checkout/components/core/network/model/request/InternalPlatform;", "component2", "()Lcom/checkout/components/core/network/model/request/RedirectContext;", Constants.COPY_TYPE, "(Lcom/checkout/components/core/network/model/request/InternalPlatform;Lcom/checkout/components/core/network/model/request/RedirectContext;)Lcom/checkout/components/core/network/model/request/SessionMetaData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/core/network/model/request/InternalPlatform;", "getInternalPlatform", "getInternalPlatform$annotations", "()V", "b", "Lcom/checkout/components/core/network/model/request/RedirectContext;", "getRedirectContext", "getRedirectContext$annotations", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SessionMetaData {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InternalPlatform internalPlatform;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RedirectContext redirectContext;

    public SessionMetaData(@Json(name = "internal_platform") @NotNull InternalPlatform internalPlatform, @Json(name = "redirect_context") @Nullable RedirectContext redirectContext) {
        Intrinsics.echo(internalPlatform, "internalPlatform");
        this.internalPlatform = internalPlatform;
        this.redirectContext = redirectContext;
    }

    public static /* synthetic */ SessionMetaData copy$default(SessionMetaData sessionMetaData, InternalPlatform internalPlatform, RedirectContext redirectContext, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            internalPlatform = sessionMetaData.internalPlatform;
        }
        if ((i4 & 2) != 0) {
            redirectContext = sessionMetaData.redirectContext;
        }
        return sessionMetaData.copy(internalPlatform, redirectContext);
    }

    @Json(name = "internal_platform")
    public static /* synthetic */ void getInternalPlatform$annotations() {
    }

    @Json(name = "redirect_context")
    public static /* synthetic */ void getRedirectContext$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InternalPlatform getInternalPlatform() {
        return this.internalPlatform;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RedirectContext getRedirectContext() {
        return this.redirectContext;
    }

    @NotNull
    public final SessionMetaData copy(@Json(name = "internal_platform") @NotNull InternalPlatform internalPlatform, @Json(name = "redirect_context") @Nullable RedirectContext redirectContext) {
        Intrinsics.echo(internalPlatform, "internalPlatform");
        return new SessionMetaData(internalPlatform, redirectContext);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionMetaData)) {
            return false;
        }
        SessionMetaData sessionMetaData = (SessionMetaData) other;
        return Intrinsics.areEqual(this.internalPlatform, sessionMetaData.internalPlatform) && Intrinsics.areEqual(this.redirectContext, sessionMetaData.redirectContext);
    }

    @NotNull
    public final InternalPlatform getInternalPlatform() {
        return this.internalPlatform;
    }

    @Nullable
    public final RedirectContext getRedirectContext() {
        return this.redirectContext;
    }

    public final int hashCode() {
        int hashCode = this.internalPlatform.hashCode() * 31;
        RedirectContext redirectContext = this.redirectContext;
        return hashCode + (redirectContext == null ? 0 : redirectContext.hashCode());
    }

    @NotNull
    public final String toString() {
        return "SessionMetaData(internalPlatform=" + this.internalPlatform + ", redirectContext=" + this.redirectContext + ")";
    }

    public /* synthetic */ SessionMetaData(InternalPlatform internalPlatform, RedirectContext redirectContext, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalPlatform, (i4 & 2) != 0 ? null : redirectContext);
    }
}
