package com.app.feature.location;

import W1.b;
import android.content.Context;
import android.content.Intent;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/app/feature/location/LocationBroadcastConfig;", "", "", "actionPrefix", "<init>", "(Ljava/lang/String;)V", "suffix", Constants.KEY_ACTION, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "configureIntent", "send", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/app/feature/location/LocationBroadcastConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionPrefix", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationBroadcastConfig {

    @NotNull
    private final String actionPrefix;

    public LocationBroadcastConfig(@NotNull String actionPrefix) {
        Intrinsics.echo(actionPrefix, "actionPrefix");
        this.actionPrefix = actionPrefix;
    }

    public static /* synthetic */ LocationBroadcastConfig copy$default(LocationBroadcastConfig locationBroadcastConfig, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = locationBroadcastConfig.actionPrefix;
        }
        return locationBroadcastConfig.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void send$default(LocationBroadcastConfig locationBroadcastConfig, Context context, String str, Function1 function1, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        locationBroadcastConfig.send(context, str, function1);
    }

    @NotNull
    public final String action(@NotNull String suffix) {
        Intrinsics.echo(suffix, "suffix");
        return ad.amber(this.actionPrefix, ".", suffix);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getActionPrefix() {
        return this.actionPrefix;
    }

    @NotNull
    public final LocationBroadcastConfig copy(@NotNull String actionPrefix) {
        Intrinsics.echo(actionPrefix, "actionPrefix");
        return new LocationBroadcastConfig(actionPrefix);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocationBroadcastConfig) && Intrinsics.areEqual(this.actionPrefix, ((LocationBroadcastConfig) other).actionPrefix);
    }

    @NotNull
    public final String getActionPrefix() {
        return this.actionPrefix;
    }

    public int hashCode() {
        return this.actionPrefix.hashCode();
    }

    public final void send(@NotNull Context context, @NotNull String suffix, @Nullable Function1<? super Intent, Unit> configureIntent) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(suffix, "suffix");
        Intent intent = new Intent(action(suffix));
        if (configureIntent != null) {
            configureIntent.invoke(intent);
        }
        b.alpha(context).charlie(intent);
    }

    @NotNull
    public String toString() {
        return ad.gray("LocationBroadcastConfig(actionPrefix=", this.actionPrefix, ")");
    }
}
