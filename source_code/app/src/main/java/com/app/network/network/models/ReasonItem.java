package com.app.network.network.models;

import A0.z;
import P8.c;
import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/ReasonItem;", "", Constants.KEY_ID, "", "value", "", Constants.KEY_TYPE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getValue", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReasonItem {

    @c(Constants.KEY_ID)
    private final int id;

    @c(Constants.KEY_TYPE)
    @NotNull
    private final String type;

    @c("value")
    @NotNull
    private final String value;

    public ReasonItem(int i4, @NotNull String value, @NotNull String type) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(type, "type");
        this.id = i4;
        this.value = value;
        this.type = type;
    }

    public static /* synthetic */ ReasonItem copy$default(ReasonItem reasonItem, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = reasonItem.id;
        }
        if ((i5 & 2) != 0) {
            str = reasonItem.value;
        }
        if ((i5 & 4) != 0) {
            str2 = reasonItem.type;
        }
        return reasonItem.copy(i4, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final ReasonItem copy(int id2, @NotNull String value, @NotNull String type) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(type, "type");
        return new ReasonItem(id2, value, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReasonItem)) {
            return false;
        }
        ReasonItem reasonItem = (ReasonItem) other;
        return this.id == reasonItem.id && Intrinsics.areEqual(this.value, reasonItem.value) && Intrinsics.areEqual(this.type, reasonItem.type);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC2327c.sierra(this.id * 31, 31, this.value);
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        String str = this.value;
        return P0.gold(z.lima("ReasonItem(id=", ", value=", str, ", type=", i4), this.type, ")");
    }
}
