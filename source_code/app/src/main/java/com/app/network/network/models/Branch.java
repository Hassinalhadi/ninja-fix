package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010 \u001a\u00020\fJ\u0006\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/app/network/network/models/Branch;", "", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "description", "getDescription", "setDescription", "zone", "Lcom/app/network/network/models/Branch$Zone;", "getZone", "()Lcom/app/network/network/models/Branch$Zone;", "setZone", "(Lcom/app/network/network/models/Branch$Zone;)V", "getCityName", "getCityNameAr", "getZoneName", "getZoneNameAr", "Zone", "City", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Branch {

    @Nullable
    private String description;

    @Nullable
    private Long id;

    @Nullable
    private String latitude;

    @Nullable
    private String longitude;

    @Nullable
    private String name;

    @Nullable
    private Zone zone;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/app/network/network/models/Branch$City;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "nameAr", "getNameAr", "setNameAr", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class City {

        @Nullable
        private String name;

        @Nullable
        private String nameAr;

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNameAr() {
            return this.nameAr;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNameAr(@Nullable String str) {
            this.nameAr = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/Branch$Zone;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "nameAr", "getNameAr", "setNameAr", "city", "Lcom/app/network/network/models/Branch$City;", "getCity", "()Lcom/app/network/network/models/Branch$City;", "setCity", "(Lcom/app/network/network/models/Branch$City;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Zone {

        @Nullable
        private City city;

        @Nullable
        private String name;

        @Nullable
        private String nameAr;

        @Nullable
        public final City getCity() {
            return this.city;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNameAr() {
            return this.nameAr;
        }

        public final void setCity(@Nullable City city) {
            this.city = city;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNameAr(@Nullable String str) {
            this.nameAr = str;
        }
    }

    @NotNull
    public final String getCityName() {
        City city;
        String name;
        Zone zone = this.zone;
        if (zone != null && (city = zone.getCity()) != null && (name = city.getName()) != null) {
            return name;
        }
        return "-";
    }

    @NotNull
    public final String getCityNameAr() {
        City city;
        String nameAr;
        Zone zone = this.zone;
        if (zone != null && (city = zone.getCity()) != null && (nameAr = city.getNameAr()) != null) {
            return nameAr;
        }
        return "-";
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Zone getZone() {
        return this.zone;
    }

    @NotNull
    public final String getZoneName() {
        String name;
        Zone zone = this.zone;
        if (zone != null && (name = zone.getName()) != null) {
            return name;
        }
        return "-";
    }

    @NotNull
    public final String getZoneNameAr() {
        String nameAr;
        Zone zone = this.zone;
        if (zone != null && (nameAr = zone.getNameAr()) != null) {
            return nameAr;
        }
        return "-";
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setId(@Nullable Long l10) {
        this.id = l10;
    }

    public final void setLatitude(@Nullable String str) {
        this.latitude = str;
    }

    public final void setLongitude(@Nullable String str) {
        this.longitude = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setZone(@Nullable Zone zone) {
        this.zone = zone;
    }
}
