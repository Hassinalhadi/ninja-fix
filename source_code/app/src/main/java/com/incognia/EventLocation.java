package com.incognia;

import android.location.Location;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/incognia/EventLocation;", "", "location", "Landroid/location/Location;", "(Landroid/location/Location;)V", "latitude", "", "longitude", "timestamp", "", "(DDLjava/lang/Long;)V", "getLatitude", "()D", "getLongitude", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", Constants.COPY_TYPE, "(DDLjava/lang/Long;)Lcom/incognia/EventLocation;", "equals", "", "other", "hashCode", "", "toString", "", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EventLocation {
    private final double latitude;
    private final double longitude;
    private final Long timestamp;

    public EventLocation(double d4, double d9) {
        this(d4, d9, null, 4, null);
    }

    public static /* synthetic */ EventLocation copy$default(EventLocation eventLocation, double d4, double d9, Long l10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            d4 = eventLocation.latitude;
        }
        double d10 = d4;
        if ((i4 & 2) != 0) {
            d9 = eventLocation.longitude;
        }
        double d11 = d9;
        if ((i4 & 4) != 0) {
            l10 = eventLocation.timestamp;
        }
        return eventLocation.copy(d10, d11, l10);
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
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final EventLocation copy(double latitude, double longitude, Long timestamp) {
        return new EventLocation(latitude, longitude, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventLocation)) {
            return false;
        }
        EventLocation eventLocation = (EventLocation) other;
        return Double.compare(this.latitude, eventLocation.latitude) == 0 && Double.compare(this.longitude, eventLocation.longitude) == 0 && Intrinsics.areEqual(this.timestamp, eventLocation.timestamp);
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode;
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i4 = (((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2)) + (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31)) * 31;
        Long l10 = this.timestamp;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return i4 + hashCode;
    }

    public String toString() {
        return "EventLocation(latitude=" + this.latitude + ", longitude=" + this.longitude + ", timestamp=" + this.timestamp + ')';
    }

    public EventLocation(double d4, double d9, Long l10) {
        this.latitude = d4;
        this.longitude = d9;
        this.timestamp = l10;
    }

    public /* synthetic */ EventLocation(double d4, double d9, Long l10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(d4, d9, (i4 & 4) != 0 ? null : l10);
    }

    public EventLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), Long.valueOf(location.getTime()));
    }
}
