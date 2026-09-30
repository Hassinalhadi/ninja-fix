package com.checkout.components.interfaces.model;

import Q0.c;
import androidx.annotation.Keep;
import av.q;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003JÄ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006?"}, d2 = {"Lcom/checkout/components/interfaces/model/CardMetadata;", "", "scheme", "", "schemeLocal", "cardType", "cardCategory", "currency", "issuer", "issuerCountry", "issuerCountryName", "productId", "subProductId", "productType", "regulatedIndicator", "", "bin", "binMax", "localSchemes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getScheme", "()Ljava/lang/String;", "getSchemeLocal", "getCardType", "getCardCategory", "getCurrency", "getIssuer", "getIssuerCountry", "getIssuerCountryName", "getProductId", "getSubProductId", "getProductType", "getRegulatedIndicator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBin", "getBinMax", "getLocalSchemes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/interfaces/model/CardMetadata;", "equals", "other", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class CardMetadata {
    public static final int $stable = 8;

    @NotNull
    private final String bin;

    @Nullable
    private final String binMax;

    @Nullable
    private final String cardCategory;

    @Nullable
    private final String cardType;

    @Nullable
    private final String currency;

    @Nullable
    private final String issuer;

    @Nullable
    private final String issuerCountry;

    @Nullable
    private final String issuerCountryName;

    @Nullable
    private final List<String> localSchemes;

    @Nullable
    private final String productId;

    @Nullable
    private final String productType;

    @Nullable
    private final Boolean regulatedIndicator;

    @NotNull
    private final String scheme;

    @Nullable
    private final String schemeLocal;

    @Nullable
    private final String subProductId;

    public CardMetadata(@NotNull String scheme, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool, @NotNull String bin, @Nullable String str11, @Nullable List<String> list) {
        Intrinsics.echo(scheme, "scheme");
        Intrinsics.echo(bin, "bin");
        this.scheme = scheme;
        this.schemeLocal = str;
        this.cardType = str2;
        this.cardCategory = str3;
        this.currency = str4;
        this.issuer = str5;
        this.issuerCountry = str6;
        this.issuerCountryName = str7;
        this.productId = str8;
        this.subProductId = str9;
        this.productType = str10;
        this.regulatedIndicator = bool;
        this.bin = bin;
        this.binMax = str11;
        this.localSchemes = list;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getSubProductId() {
        return this.subProductId;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Boolean getRegulatedIndicator() {
        return this.regulatedIndicator;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getBinMax() {
        return this.binMax;
    }

    @Nullable
    public final List<String> component15() {
        return this.localSchemes;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCardCategory() {
        return this.cardCategory;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getIssuerCountryName() {
        return this.issuerCountryName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final CardMetadata copy(@NotNull String scheme, @Nullable String schemeLocal, @Nullable String cardType, @Nullable String cardCategory, @Nullable String currency, @Nullable String issuer, @Nullable String issuerCountry, @Nullable String issuerCountryName, @Nullable String productId, @Nullable String subProductId, @Nullable String productType, @Nullable Boolean regulatedIndicator, @NotNull String bin, @Nullable String binMax, @Nullable List<String> localSchemes) {
        Intrinsics.echo(scheme, "scheme");
        Intrinsics.echo(bin, "bin");
        return new CardMetadata(scheme, schemeLocal, cardType, cardCategory, currency, issuer, issuerCountry, issuerCountryName, productId, subProductId, productType, regulatedIndicator, bin, binMax, localSchemes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardMetadata)) {
            return false;
        }
        CardMetadata cardMetadata = (CardMetadata) other;
        return Intrinsics.areEqual(this.scheme, cardMetadata.scheme) && Intrinsics.areEqual(this.schemeLocal, cardMetadata.schemeLocal) && Intrinsics.areEqual(this.cardType, cardMetadata.cardType) && Intrinsics.areEqual(this.cardCategory, cardMetadata.cardCategory) && Intrinsics.areEqual(this.currency, cardMetadata.currency) && Intrinsics.areEqual(this.issuer, cardMetadata.issuer) && Intrinsics.areEqual(this.issuerCountry, cardMetadata.issuerCountry) && Intrinsics.areEqual(this.issuerCountryName, cardMetadata.issuerCountryName) && Intrinsics.areEqual(this.productId, cardMetadata.productId) && Intrinsics.areEqual(this.subProductId, cardMetadata.subProductId) && Intrinsics.areEqual(this.productType, cardMetadata.productType) && Intrinsics.areEqual(this.regulatedIndicator, cardMetadata.regulatedIndicator) && Intrinsics.areEqual(this.bin, cardMetadata.bin) && Intrinsics.areEqual(this.binMax, cardMetadata.binMax) && Intrinsics.areEqual(this.localSchemes, cardMetadata.localSchemes);
    }

    @NotNull
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    public final String getBinMax() {
        return this.binMax;
    }

    @Nullable
    public final String getCardCategory() {
        return this.cardCategory;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    @Nullable
    public final String getIssuerCountryName() {
        return this.issuerCountryName;
    }

    @Nullable
    public final List<String> getLocalSchemes() {
        return this.localSchemes;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final Boolean getRegulatedIndicator() {
        return this.regulatedIndicator;
    }

    @NotNull
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    @Nullable
    public final String getSubProductId() {
        return this.subProductId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13 = this.scheme.hashCode() * 31;
        String str = this.schemeLocal;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode13 + hashCode) * 31;
        String str2 = this.cardType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.cardCategory;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.currency;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.issuer;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.issuerCountry;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.issuerCountryName;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.productId;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.subProductId;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str10 = this.productType;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        Boolean bool = this.regulatedIndicator;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int a6 = b.a(this.bin, (i18 + hashCode11) * 31, 31);
        String str11 = this.binMax;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int i19 = (a6 + hashCode12) * 31;
        List<String> list = this.localSchemes;
        if (list != null) {
            i4 = list.hashCode();
        }
        return i19 + i4;
    }

    @NotNull
    public String toString() {
        String str = this.scheme;
        String str2 = this.schemeLocal;
        String str3 = this.cardType;
        String str4 = this.cardCategory;
        String str5 = this.currency;
        String str6 = this.issuer;
        String str7 = this.issuerCountry;
        String str8 = this.issuerCountryName;
        String str9 = this.productId;
        String str10 = this.subProductId;
        String str11 = this.productType;
        Boolean bool = this.regulatedIndicator;
        String str12 = this.bin;
        String str13 = this.binMax;
        List<String> list = this.localSchemes;
        StringBuilder india = q.india("CardMetadata(scheme=", str, ", schemeLocal=", str2, ", cardType=");
        c.azure(india, str3, ", cardCategory=", str4, ", currency=");
        c.azure(india, str5, ", issuer=", str6, ", issuerCountry=");
        c.azure(india, str7, ", issuerCountryName=", str8, ", productId=");
        c.azure(india, str9, ", subProductId=", str10, ", productType=");
        india.append(str11);
        india.append(", regulatedIndicator=");
        india.append(bool);
        india.append(", bin=");
        c.azure(india, str12, ", binMax=", str13, ", localSchemes=");
        india.append(list);
        india.append(")");
        return india.toString();
    }

    public /* synthetic */ CardMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool, String str12, String str13, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, (i4 & 32) != 0 ? null : str6, (i4 & 64) != 0 ? null : str7, (i4 & 128) != 0 ? null : str8, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str9, (i4 & 512) != 0 ? null : str10, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : str11, (i4 & 2048) != 0 ? null : bool, str12, (i4 & 8192) != 0 ? null : str13, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list);
    }
}
