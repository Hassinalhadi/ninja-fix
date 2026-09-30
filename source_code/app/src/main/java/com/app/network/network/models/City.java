package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/City;", "Lcom/app/network/network/models/Language;", "createdAt", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class City extends Language {

    @Nullable
    private Date createdAt;

    /* JADX WARN: Multi-variable type inference failed */
    public City() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ City copy$default(City city, Date date, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            date = city.createdAt;
        }
        return city.copy(date);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final City copy(@Nullable Date createdAt) {
        return new City(createdAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof City) && Intrinsics.areEqual(this.createdAt, ((City) other).createdAt);
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public int hashCode() {
        Date date = this.createdAt;
        if (date == null) {
            return 0;
        }
        return date.hashCode();
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    @NotNull
    public String toString() {
        return "City(createdAt=" + this.createdAt + ")";
    }

    public City(@Nullable Date date) {
        super(null, 1, null);
        this.createdAt = date;
    }

    public /* synthetic */ City(Date date, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : date);
    }
}
