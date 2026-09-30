package com.checkout.components.core.network.model.request;

import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/core/network/model/request/RedirectContext;", "", "", "scheme", "host", "appIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/core/network/model/request/RedirectContext;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getScheme", "b", "getHost", "c", "getAppIdentifier", "getAppIdentifier$annotations", "()V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RedirectContext {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String host;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String appIdentifier;

    public RedirectContext(@NotNull String scheme, @NotNull String host, @Json(name = "app_identifier") @NotNull String appIdentifier) {
        Intrinsics.echo(scheme, "scheme");
        Intrinsics.echo(host, "host");
        Intrinsics.echo(appIdentifier, "appIdentifier");
        this.scheme = scheme;
        this.host = host;
        this.appIdentifier = appIdentifier;
    }

    public static /* synthetic */ RedirectContext copy$default(RedirectContext redirectContext, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = redirectContext.scheme;
        }
        if ((i4 & 2) != 0) {
            str2 = redirectContext.host;
        }
        if ((i4 & 4) != 0) {
            str3 = redirectContext.appIdentifier;
        }
        return redirectContext.copy(str, str2, str3);
    }

    @Json(name = "app_identifier")
    public static /* synthetic */ void getAppIdentifier$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    @NotNull
    public final RedirectContext copy(@NotNull String scheme, @NotNull String host, @Json(name = "app_identifier") @NotNull String appIdentifier) {
        Intrinsics.echo(scheme, "scheme");
        Intrinsics.echo(host, "host");
        Intrinsics.echo(appIdentifier, "appIdentifier");
        return new RedirectContext(scheme, host, appIdentifier);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectContext)) {
            return false;
        }
        RedirectContext redirectContext = (RedirectContext) other;
        return Intrinsics.areEqual(this.scheme, redirectContext.scheme) && Intrinsics.areEqual(this.host, redirectContext.host) && Intrinsics.areEqual(this.appIdentifier, redirectContext.appIdentifier);
    }

    @NotNull
    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    public final int hashCode() {
        return this.appIdentifier.hashCode() + AbstractC2327c.sierra(this.scheme.hashCode() * 31, 31, this.host);
    }

    @NotNull
    public final String toString() {
        String str = this.scheme;
        String str2 = this.host;
        return P0.gold(q.india("RedirectContext(scheme=", str, ", host=", str2, ", appIdentifier="), this.appIdentifier, ")");
    }
}
