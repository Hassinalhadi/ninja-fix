package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2770s7;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010 \u001a\u0004\u0018\u00010\fJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/app/network/network/models/Zone;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "nameAr", "getNameAr", "setNameAr", "geom", "Lcom/app/network/network/models/Zone$Geometry;", "getGeom", "()Lcom/app/network/network/models/Zone$Geometry;", "setGeom", "(Lcom/app/network/network/models/Zone$Geometry;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getLocalizedName", "isLocationInside", "", "location", "Lcom/google/android/gms/maps/model/LatLng;", "Geometry", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Zone implements Serializable {

    @Nullable
    private Date createdAt;

    @Nullable
    private Geometry geom;

    @Nullable
    private Long id;

    @Nullable
    private String name;

    @Nullable
    private String nameAr;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR4\u0010\n\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000b0\u000b\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/app/network/network/models/Zone$Geometry;", "", "<init>", "()V", Constants.KEY_TYPE, "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "coordinates", "", "", "getCoordinates", "()Ljava/util/List;", "setCoordinates", "(Ljava/util/List;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Geometry {

        @Nullable
        private List<? extends List<? extends List<? extends List<Double>>>> coordinates;

        @Nullable
        private String type;

        @Nullable
        public final List<List<List<List<Double>>>> getCoordinates() {
            return this.coordinates;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setCoordinates(@Nullable List<? extends List<? extends List<? extends List<Double>>>> list) {
            this.coordinates = list;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Geometry getGeom() {
        return this.geom;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getLocalizedName() {
        String str;
        if (Locale.getDefault().getLanguage().equals("ar") && (str = this.nameAr) != null) {
            return str;
        }
        return this.name;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameAr() {
        return this.nameAr;
    }

    public final boolean isLocationInside(@NotNull LatLng location) {
        ArrayList arrayList;
        boolean z2;
        boolean z10;
        List<List<List<List<Double>>>> coordinates;
        Intrinsics.echo(location, "location");
        Geometry geometry = this.geom;
        if (geometry != null && (coordinates = geometry.getCoordinates()) != null) {
            arrayList = CollectionsKt.indigo(CollectionsKt.indigo(CollectionsKt.indigo(coordinates)));
        } else {
            arrayList = null;
        }
        boolean z11 = false;
        if (arrayList != null && !arrayList.isEmpty() && arrayList.size() % 2 == 0) {
            int size = arrayList.size() - 2;
            int alpha = AbstractC2770s7.alpha(0, arrayList.size() - 1, 2);
            if (alpha >= 0) {
                boolean z12 = false;
                int i4 = size;
                int i5 = 0;
                while (true) {
                    double doubleValue = ((Number) arrayList.get(i5)).doubleValue();
                    double doubleValue2 = ((Number) arrayList.get(i5 + 1)).doubleValue();
                    double doubleValue3 = ((Number) arrayList.get(i4)).doubleValue();
                    double doubleValue4 = ((Number) arrayList.get(i4 + 1)).doubleValue();
                    double d4 = location.alpha;
                    if (doubleValue2 > d4) {
                        z2 = z11;
                        z11 = true;
                    } else {
                        z2 = z11;
                    }
                    if (doubleValue4 > d4) {
                        z10 = true;
                    } else {
                        z10 = z2;
                    }
                    if (z11 != z10) {
                        if (location.purple < (((d4 - doubleValue2) * (doubleValue3 - doubleValue)) / (doubleValue4 - doubleValue2)) + doubleValue) {
                            z12 = !z12;
                        }
                    }
                    if (i5 != alpha) {
                        i4 = i5;
                        i5 += 2;
                        z11 = z2;
                    } else {
                        return z12;
                    }
                }
            }
        }
        return false;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setGeom(@Nullable Geometry geometry) {
        this.geom = geometry;
    }

    public final void setId(@Nullable Long l10) {
        this.id = l10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNameAr(@Nullable String str) {
        this.nameAr = str;
    }
}
