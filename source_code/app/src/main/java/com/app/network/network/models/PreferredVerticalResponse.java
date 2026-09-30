package com.app.network.network.models;

import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/PreferredVerticalResponse;", "", "value", "", "displayName", Constants.KEY_ID, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getDisplayName", "getId", "()I", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferredVerticalResponse {

    @NotNull
    private final String displayName;
    private final int id;

    @NotNull
    private final String value;

    public PreferredVerticalResponse(@NotNull String value, @NotNull String displayName, int i4) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(displayName, "displayName");
        this.value = value;
        this.displayName = displayName;
        this.id = i4;
    }

    public static /* synthetic */ PreferredVerticalResponse copy$default(PreferredVerticalResponse preferredVerticalResponse, String str, String str2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = preferredVerticalResponse.value;
        }
        if ((i5 & 2) != 0) {
            str2 = preferredVerticalResponse.displayName;
        }
        if ((i5 & 4) != 0) {
            i4 = preferredVerticalResponse.id;
        }
        return preferredVerticalResponse.copy(str, str2, i4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final PreferredVerticalResponse copy(@NotNull String value, @NotNull String displayName, int id2) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(displayName, "displayName");
        return new PreferredVerticalResponse(value, displayName, id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferredVerticalResponse)) {
            return false;
        }
        PreferredVerticalResponse preferredVerticalResponse = (PreferredVerticalResponse) other;
        return Intrinsics.areEqual(this.value, preferredVerticalResponse.value) && Intrinsics.areEqual(this.displayName, preferredVerticalResponse.displayName) && this.id == preferredVerticalResponse.id;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AbstractC2327c.sierra(this.value.hashCode() * 31, 31, this.displayName) + this.id;
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.displayName;
        return P0.cyan(q.india("PreferredVerticalResponse(value=", str, ", displayName=", str2, ", id="), this.id, ")");
    }

    public /* synthetic */ PreferredVerticalResponse(String str, String str2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i5 & 4) != 0 ? str.hashCode() : i4);
    }
}
