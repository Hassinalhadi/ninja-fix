package com.app.feature.location.api;

import android.location.Location;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p3.EnumC2270b;
import p3.ah;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001:\u00017BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ^\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001f¨\u00068"}, d2 = {"Lcom/app/feature/location/api/LocationState;", "", "", "serviceRunning", "Landroid/location/Location;", "lastSentLocation", "", "lastSentTimeMs", "Lcom/app/feature/location/api/LocationState$LastFailure;", "lastFailure", "Lp3/ah;", "stompConnectionState", "Lp3/b;", "gpsQuality", "", "currentActivity", "<init>", "(ZLandroid/location/Location;Ljava/lang/Long;Lcom/app/feature/location/api/LocationState$LastFailure;Lp3/ah;Lp3/b;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Landroid/location/Location;", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/app/feature/location/api/LocationState$LastFailure;", "component5", "()Lp3/ah;", "component6", "()Lp3/b;", "component7", "()Ljava/lang/String;", Constants.COPY_TYPE, "(ZLandroid/location/Location;Ljava/lang/Long;Lcom/app/feature/location/api/LocationState$LastFailure;Lp3/ah;Lp3/b;Ljava/lang/String;)Lcom/app/feature/location/api/LocationState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getServiceRunning", "Landroid/location/Location;", "getLastSentLocation", "Ljava/lang/Long;", "getLastSentTimeMs", "Lcom/app/feature/location/api/LocationState$LastFailure;", "getLastFailure", "Lp3/ah;", "getStompConnectionState", "Lp3/b;", "getGpsQuality", "Ljava/lang/String;", "getCurrentActivity", "LastFailure", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LocationState {

    @Nullable
    private final String currentActivity;

    @NotNull
    private final EnumC2270b gpsQuality;

    @Nullable
    private final LastFailure lastFailure;

    @Nullable
    private final Location lastSentLocation;

    @Nullable
    private final Long lastSentTimeMs;
    private final boolean serviceRunning;

    @NotNull
    private final ah stompConnectionState;

    public LocationState() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ LocationState copy$default(LocationState locationState, boolean z2, Location location, Long l10, LastFailure lastFailure, ah ahVar, EnumC2270b enumC2270b, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = locationState.serviceRunning;
        }
        if ((i4 & 2) != 0) {
            location = locationState.lastSentLocation;
        }
        if ((i4 & 4) != 0) {
            l10 = locationState.lastSentTimeMs;
        }
        if ((i4 & 8) != 0) {
            lastFailure = locationState.lastFailure;
        }
        if ((i4 & 16) != 0) {
            ahVar = locationState.stompConnectionState;
        }
        if ((i4 & 32) != 0) {
            enumC2270b = locationState.gpsQuality;
        }
        if ((i4 & 64) != 0) {
            str = locationState.currentActivity;
        }
        EnumC2270b enumC2270b2 = enumC2270b;
        String str2 = str;
        ah ahVar2 = ahVar;
        Long l11 = l10;
        return locationState.copy(z2, location, l11, lastFailure, ahVar2, enumC2270b2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getServiceRunning() {
        return this.serviceRunning;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Location getLastSentLocation() {
        return this.lastSentLocation;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getLastSentTimeMs() {
        return this.lastSentTimeMs;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final LastFailure getLastFailure() {
        return this.lastFailure;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ah getStompConnectionState() {
        return this.stompConnectionState;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final EnumC2270b getGpsQuality() {
        return this.gpsQuality;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCurrentActivity() {
        return this.currentActivity;
    }

    @NotNull
    public final LocationState copy(boolean serviceRunning, @Nullable Location lastSentLocation, @Nullable Long lastSentTimeMs, @Nullable LastFailure lastFailure, @NotNull ah stompConnectionState, @NotNull EnumC2270b gpsQuality, @Nullable String currentActivity) {
        Intrinsics.echo(stompConnectionState, "stompConnectionState");
        Intrinsics.echo(gpsQuality, "gpsQuality");
        return new LocationState(serviceRunning, lastSentLocation, lastSentTimeMs, lastFailure, stompConnectionState, gpsQuality, currentActivity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationState)) {
            return false;
        }
        LocationState locationState = (LocationState) other;
        return this.serviceRunning == locationState.serviceRunning && Intrinsics.areEqual(this.lastSentLocation, locationState.lastSentLocation) && Intrinsics.areEqual(this.lastSentTimeMs, locationState.lastSentTimeMs) && Intrinsics.areEqual(this.lastFailure, locationState.lastFailure) && this.stompConnectionState == locationState.stompConnectionState && this.gpsQuality == locationState.gpsQuality && Intrinsics.areEqual(this.currentActivity, locationState.currentActivity);
    }

    @Nullable
    public final String getCurrentActivity() {
        return this.currentActivity;
    }

    @NotNull
    public final EnumC2270b getGpsQuality() {
        return this.gpsQuality;
    }

    @Nullable
    public final LastFailure getLastFailure() {
        return this.lastFailure;
    }

    @Nullable
    public final Location getLastSentLocation() {
        return this.lastSentLocation;
    }

    @Nullable
    public final Long getLastSentTimeMs() {
        return this.lastSentTimeMs;
    }

    public final boolean getServiceRunning() {
        return this.serviceRunning;
    }

    @NotNull
    public final ah getStompConnectionState() {
        return this.stompConnectionState;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int hashCode2;
        int hashCode3;
        if (this.serviceRunning) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = i4 * 31;
        Location location = this.lastSentLocation;
        int i10 = 0;
        if (location == null) {
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
        }
        int i11 = (i5 + hashCode) * 31;
        Long l10 = this.lastSentTimeMs;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        LastFailure lastFailure = this.lastFailure;
        if (lastFailure == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lastFailure.hashCode();
        }
        int hashCode4 = (this.gpsQuality.hashCode() + ((this.stompConnectionState.hashCode() + ((i12 + hashCode3) * 31)) * 31)) * 31;
        String str = this.currentActivity;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode4 + i10;
    }

    @NotNull
    public String toString() {
        boolean z2 = this.serviceRunning;
        Location location = this.lastSentLocation;
        Long l10 = this.lastSentTimeMs;
        LastFailure lastFailure = this.lastFailure;
        ah ahVar = this.stompConnectionState;
        EnumC2270b enumC2270b = this.gpsQuality;
        String str = this.currentActivity;
        StringBuilder sb2 = new StringBuilder("LocationState(serviceRunning=");
        sb2.append(z2);
        sb2.append(", lastSentLocation=");
        sb2.append(location);
        sb2.append(", lastSentTimeMs=");
        sb2.append(l10);
        sb2.append(", lastFailure=");
        sb2.append(lastFailure);
        sb2.append(", stompConnectionState=");
        sb2.append(ahVar);
        sb2.append(", gpsQuality=");
        sb2.append(enumC2270b);
        sb2.append(", currentActivity=");
        return P0.gold(sb2, str, ")");
    }

    public LocationState(boolean z2, @Nullable Location location, @Nullable Long l10, @Nullable LastFailure lastFailure, @NotNull ah stompConnectionState, @NotNull EnumC2270b gpsQuality, @Nullable String str) {
        Intrinsics.echo(stompConnectionState, "stompConnectionState");
        Intrinsics.echo(gpsQuality, "gpsQuality");
        this.serviceRunning = z2;
        this.lastSentLocation = location;
        this.lastSentTimeMs = l10;
        this.lastFailure = lastFailure;
        this.stompConnectionState = stompConnectionState;
        this.gpsQuality = gpsQuality;
        this.currentActivity = str;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/app/feature/location/api/LocationState$LastFailure;", "", "reason", "", "atMs", "", "<init>", "(Ljava/lang/String;J)V", "getReason", "()Ljava/lang/String;", "getAtMs", "()J", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class LastFailure {
        private final long atMs;

        @NotNull
        private final String reason;

        public LastFailure(@NotNull String reason, long j5) {
            Intrinsics.echo(reason, "reason");
            this.reason = reason;
            this.atMs = j5;
        }

        public static /* synthetic */ LastFailure copy$default(LastFailure lastFailure, String str, long j5, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = lastFailure.reason;
            }
            if ((i4 & 2) != 0) {
                j5 = lastFailure.atMs;
            }
            return lastFailure.copy(str, j5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAtMs() {
            return this.atMs;
        }

        @NotNull
        public final LastFailure copy(@NotNull String reason, long atMs) {
            Intrinsics.echo(reason, "reason");
            return new LastFailure(reason, atMs);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastFailure)) {
                return false;
            }
            LastFailure lastFailure = (LastFailure) other;
            return Intrinsics.areEqual(this.reason, lastFailure.reason) && this.atMs == lastFailure.atMs;
        }

        public final long getAtMs() {
            return this.atMs;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            long j5 = this.atMs;
            return hashCode + ((int) (j5 ^ (j5 >>> 32)));
        }

        @NotNull
        public String toString() {
            return "LastFailure(reason=" + this.reason + ", atMs=" + this.atMs + ")";
        }

        public /* synthetic */ LastFailure(String str, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i4 & 2) != 0 ? System.currentTimeMillis() : j5);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ LocationState(boolean r2, android.location.Location r3, java.lang.Long r4, com.app.feature.location.api.LocationState.LastFailure r5, p3.ah r6, p3.EnumC2270b r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lb
            r3 = r0
        Lb:
            r10 = r9 & 4
            if (r10 == 0) goto L10
            r4 = r0
        L10:
            r10 = r9 & 8
            if (r10 == 0) goto L15
            r5 = r0
        L15:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            p3.ah r6 = p3.ah.red
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L21
            p3.b r7 = p3.EnumC2270b.f13137a
        L21:
            r9 = r9 & 64
            if (r9 == 0) goto L2e
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L36
        L2e:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.feature.location.api.LocationState.<init>(boolean, android.location.Location, java.lang.Long, com.app.feature.location.api.LocationState$LastFailure, p3.ah, p3.b, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
