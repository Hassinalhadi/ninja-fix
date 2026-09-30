package com.checkout.components.core.network.model.request;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/core/network/model/request/Processing;", "", "", "preferredScheme", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/core/network/model/request/Processing;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPreferredScheme", "getPreferredScheme$annotations", "()V", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Processing {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String preferredScheme;

    public Processing(@Json(name = "preferred_scheme") @NotNull String preferredScheme) {
        Intrinsics.echo(preferredScheme, "preferredScheme");
        this.preferredScheme = preferredScheme;
    }

    public static /* synthetic */ Processing copy$default(Processing processing, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = processing.preferredScheme;
        }
        return processing.copy(str);
    }

    @Json(name = "preferred_scheme")
    public static /* synthetic */ void getPreferredScheme$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPreferredScheme() {
        return this.preferredScheme;
    }

    @NotNull
    public final Processing copy(@Json(name = "preferred_scheme") @NotNull String preferredScheme) {
        Intrinsics.echo(preferredScheme, "preferredScheme");
        return new Processing(preferredScheme);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Processing) && Intrinsics.areEqual(this.preferredScheme, ((Processing) other).preferredScheme);
    }

    @NotNull
    public final String getPreferredScheme() {
        return this.preferredScheme;
    }

    public final int hashCode() {
        return this.preferredScheme.hashCode();
    }

    @NotNull
    public final String toString() {
        return ad.gray("Processing(preferredScheme=", this.preferredScheme, ")");
    }
}
