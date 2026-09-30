package com.app.network.network.models;

import P8.c;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/StartingPoint;", "", Constants.KEY_ID, "", "name", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/String;)Lcom/app/network/network/models/StartingPoint;", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StartingPoint {

    @c(Constants.KEY_ID)
    @Nullable
    private final Long id;

    @c("name")
    @Nullable
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public StartingPoint() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StartingPoint copy$default(StartingPoint startingPoint, Long l10, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l10 = startingPoint.id;
        }
        if ((i4 & 2) != 0) {
            str = startingPoint.name;
        }
        return startingPoint.copy(l10, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final StartingPoint copy(@Nullable Long id2, @Nullable String name) {
        return new StartingPoint(id2, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartingPoint)) {
            return false;
        }
        StartingPoint startingPoint = (StartingPoint) other;
        return Intrinsics.areEqual(this.id, startingPoint.id) && Intrinsics.areEqual(this.name, startingPoint.name);
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Long l10 = this.id;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StartingPoint(id=" + this.id + ", name=" + this.name + ")";
    }

    public StartingPoint(@Nullable Long l10, @Nullable String str) {
        this.id = l10;
        this.name = str;
    }

    public /* synthetic */ StartingPoint(Long l10, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : l10, (i4 & 2) != 0 ? null : str);
    }
}
