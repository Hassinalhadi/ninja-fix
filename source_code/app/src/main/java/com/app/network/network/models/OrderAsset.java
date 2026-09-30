package com.app.network.network.models;

import A0.z;
import Q0.c;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jx\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006."}, d2 = {"Lcom/app/network/network/models/OrderAsset;", "Ljava/io/Serializable;", Constants.KEY_ID, "", "externalId", "", "name", "nameAr", "returnLocationName", "returnLocationLatitude", "", "returnLocationLongitude", "cost", "imageUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getId", "()I", "getExternalId", "()Ljava/lang/String;", "getName", "getNameAr", "getReturnLocationName", "getReturnLocationLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getReturnLocationLongitude", "getCost", "getImageUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/app/network/network/models/OrderAsset;", "equals", "", "other", "", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderAsset implements Serializable {

    @Nullable
    private final Double cost;

    @Nullable
    private final String externalId;
    private final int id;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String name;

    @Nullable
    private final String nameAr;

    @Nullable
    private final Double returnLocationLatitude;

    @Nullable
    private final Double returnLocationLongitude;

    @Nullable
    private final String returnLocationName;

    public OrderAsset(int i4, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d4, @Nullable Double d9, @Nullable Double d10, @Nullable String str5) {
        this.id = i4;
        this.externalId = str;
        this.name = str2;
        this.nameAr = str3;
        this.returnLocationName = str4;
        this.returnLocationLatitude = d4;
        this.returnLocationLongitude = d9;
        this.cost = d10;
        this.imageUrl = str5;
    }

    public static /* synthetic */ OrderAsset copy$default(OrderAsset orderAsset, int i4, String str, String str2, String str3, String str4, Double d4, Double d9, Double d10, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = orderAsset.id;
        }
        if ((i5 & 2) != 0) {
            str = orderAsset.externalId;
        }
        if ((i5 & 4) != 0) {
            str2 = orderAsset.name;
        }
        if ((i5 & 8) != 0) {
            str3 = orderAsset.nameAr;
        }
        if ((i5 & 16) != 0) {
            str4 = orderAsset.returnLocationName;
        }
        if ((i5 & 32) != 0) {
            d4 = orderAsset.returnLocationLatitude;
        }
        if ((i5 & 64) != 0) {
            d9 = orderAsset.returnLocationLongitude;
        }
        if ((i5 & 128) != 0) {
            d10 = orderAsset.cost;
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            str5 = orderAsset.imageUrl;
        }
        Double d11 = d10;
        String str6 = str5;
        Double d12 = d4;
        Double d13 = d9;
        String str7 = str4;
        String str8 = str2;
        return orderAsset.copy(i4, str, str8, str3, str7, d12, d13, d11, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNameAr() {
        return this.nameAr;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getReturnLocationName() {
        return this.returnLocationName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getReturnLocationLatitude() {
        return this.returnLocationLatitude;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getReturnLocationLongitude() {
        return this.returnLocationLongitude;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getCost() {
        return this.cost;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final OrderAsset copy(int id2, @Nullable String externalId, @Nullable String name, @Nullable String nameAr, @Nullable String returnLocationName, @Nullable Double returnLocationLatitude, @Nullable Double returnLocationLongitude, @Nullable Double cost, @Nullable String imageUrl) {
        return new OrderAsset(id2, externalId, name, nameAr, returnLocationName, returnLocationLatitude, returnLocationLongitude, cost, imageUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderAsset)) {
            return false;
        }
        OrderAsset orderAsset = (OrderAsset) other;
        return this.id == orderAsset.id && Intrinsics.areEqual(this.externalId, orderAsset.externalId) && Intrinsics.areEqual(this.name, orderAsset.name) && Intrinsics.areEqual(this.nameAr, orderAsset.nameAr) && Intrinsics.areEqual(this.returnLocationName, orderAsset.returnLocationName) && Intrinsics.areEqual(this.returnLocationLatitude, orderAsset.returnLocationLatitude) && Intrinsics.areEqual(this.returnLocationLongitude, orderAsset.returnLocationLongitude) && Intrinsics.areEqual(this.cost, orderAsset.cost) && Intrinsics.areEqual(this.imageUrl, orderAsset.imageUrl);
    }

    @Nullable
    public final Double getCost() {
        return this.cost;
    }

    @Nullable
    public final String getExternalId() {
        return this.externalId;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameAr() {
        return this.nameAr;
    }

    @Nullable
    public final Double getReturnLocationLatitude() {
        return this.returnLocationLatitude;
    }

    @Nullable
    public final Double getReturnLocationLongitude() {
        return this.returnLocationLongitude;
    }

    @Nullable
    public final String getReturnLocationName() {
        return this.returnLocationName;
    }

    public int hashCode() {
        int i4 = this.id * 31;
        String str = this.externalId;
        int hashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameAr;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.returnLocationName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.returnLocationLatitude;
        int hashCode5 = (hashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d9 = this.returnLocationLongitude;
        int hashCode6 = (hashCode5 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.cost;
        int hashCode7 = (hashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str5 = this.imageUrl;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i4 = this.id;
        String str = this.externalId;
        String str2 = this.name;
        String str3 = this.nameAr;
        String str4 = this.returnLocationName;
        Double d4 = this.returnLocationLatitude;
        Double d9 = this.returnLocationLongitude;
        Double d10 = this.cost;
        String str5 = this.imageUrl;
        StringBuilder lima = z.lima("OrderAsset(id=", ", externalId=", str, ", name=", i4);
        c.azure(lima, str2, ", nameAr=", str3, ", returnLocationName=");
        lima.append(str4);
        lima.append(", returnLocationLatitude=");
        lima.append(d4);
        lima.append(", returnLocationLongitude=");
        lima.append(d9);
        lima.append(", cost=");
        lima.append(d10);
        lima.append(", imageUrl=");
        return P0.gold(lima, str5, ")");
    }

    public /* synthetic */ OrderAsset(int i4, String str, String str2, String str3, String str4, Double d4, Double d9, Double d10, String str5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, str, str2, str3, str4, d4, d9, d10, (i5 & Barcode.FORMAT_QR_CODE) != 0 ? null : str5);
    }
}
