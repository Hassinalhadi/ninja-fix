package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/app/network/network/models/HeatMapLocation;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeatMapLocation {
    private final double latitude;
    private final double longitude;

    public HeatMapLocation(double d4, double d9) {
        this.latitude = d4;
        this.longitude = d9;
    }

    public static /* synthetic */ HeatMapLocation copy$default(HeatMapLocation heatMapLocation, double d4, double d9, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            d4 = heatMapLocation.latitude;
        }
        if ((i4 & 2) != 0) {
            d9 = heatMapLocation.longitude;
        }
        return heatMapLocation.copy(d4, d9);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final HeatMapLocation copy(double latitude, double longitude) {
        return new HeatMapLocation(latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeatMapLocation)) {
            return false;
        }
        HeatMapLocation heatMapLocation = (HeatMapLocation) other;
        return Double.compare(this.latitude, heatMapLocation.latitude) == 0 && Double.compare(this.longitude, heatMapLocation.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i4 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return i4 + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    @NotNull
    public String toString() {
        return "HeatMapLocation(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
