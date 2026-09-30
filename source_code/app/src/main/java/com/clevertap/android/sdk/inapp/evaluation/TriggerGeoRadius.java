package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerGeoRadius;", "", "latitude", "", "longitude", Constants.KEY_RADIUS, "<init>", "(DDD)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getRadius", "setRadius", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TriggerGeoRadius {
    private double latitude;
    private double longitude;
    private double radius;

    public TriggerGeoRadius(double d4, double d9, double d10) {
        this.latitude = d4;
        this.longitude = d9;
        this.radius = d10;
    }

    public static /* synthetic */ TriggerGeoRadius copy$default(TriggerGeoRadius triggerGeoRadius, double d4, double d9, double d10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            d4 = triggerGeoRadius.latitude;
        }
        double d11 = d4;
        if ((i4 & 2) != 0) {
            d9 = triggerGeoRadius.longitude;
        }
        double d12 = d9;
        if ((i4 & 4) != 0) {
            d10 = triggerGeoRadius.radius;
        }
        return triggerGeoRadius.copy(d11, d12, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRadius() {
        return this.radius;
    }

    @NotNull
    public final TriggerGeoRadius copy(double latitude, double longitude, double radius) {
        return new TriggerGeoRadius(latitude, longitude, radius);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerGeoRadius)) {
            return false;
        }
        TriggerGeoRadius triggerGeoRadius = (TriggerGeoRadius) other;
        return Double.compare(this.latitude, triggerGeoRadius.latitude) == 0 && Double.compare(this.longitude, triggerGeoRadius.longitude) == 0 && Double.compare(this.radius, triggerGeoRadius.radius) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getRadius() {
        return this.radius;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i4 = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        long doubleToLongBits3 = Double.doubleToLongBits(this.radius);
        return i4 + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final void setLatitude(double d4) {
        this.latitude = d4;
    }

    public final void setLongitude(double d4) {
        this.longitude = d4;
    }

    public final void setRadius(double d4) {
        this.radius = d4;
    }

    @NotNull
    public String toString() {
        return "TriggerGeoRadius(latitude=" + this.latitude + ", longitude=" + this.longitude + ", radius=" + this.radius + ')';
    }
}
