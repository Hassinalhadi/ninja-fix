package com.checkout.components.rememberme.model;

import Q0.c;
import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b(\b\u0081\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014Jª\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00105\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010,\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u0014R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010,\u0012\u0004\b@\u00101\u001a\u0004\b?\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bB\u0010\u0014R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010,\u0012\u0004\bE\u00101\u001a\u0004\bD\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010,\u001a\u0004\bG\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010,\u001a\u0004\bI\u0010\u0014R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010,\u0012\u0004\bL\u00101\u001a\u0004\bK\u0010\u0014R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010,\u0012\u0004\bO\u00101\u001a\u0004\bN\u0010\u0014¨\u0006P"}, d2 = {"Lcom/checkout/components/rememberme/model/CardDetails;", "", "", "scheme", "schemeLocal", "last4", "", "expiryMonth", "expiryYear", "cardType", "cardCategory", "issuer", "issuerCountry", "name", "bin", "productId", "productType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/rememberme/model/CardDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getScheme", "b", "getSchemeLocal", "getSchemeLocal$annotations", "()V", "c", "getLast4", Constants.INAPP_DATA_TAG, "Ljava/lang/Integer;", "getExpiryMonth", "getExpiryMonth$annotations", "e", "getExpiryYear", "getExpiryYear$annotations", "f", "getCardType", "getCardType$annotations", "g", "getCardCategory", "getCardCategory$annotations", "h", "getIssuer", "i", "getIssuerCountry", "getIssuerCountry$annotations", "j", "getName", "k", "getBin", "l", "getProductId", "getProductId$annotations", "m", "getProductType", "getProductType$annotations", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardDetails {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String schemeLocal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String last4;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer expiryMonth;

    /* renamed from: e, reason: from kotlin metadata */
    private final Integer expiryYear;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String cardType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String cardCategory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String issuer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String issuerCountry;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String bin;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String productId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String productType;

    public CardDetails(@Nullable String str, @Json(name = "scheme_local") @Nullable String str2, @NotNull String last4, @Json(name = "expiry_month") @Nullable Integer num, @Json(name = "expiry_year") @Nullable Integer num2, @Json(name = "card_type") @Nullable String str3, @Json(name = "card_category") @Nullable String str4, @Nullable String str5, @Json(name = "issuer_country") @Nullable String str6, @Nullable String str7, @Nullable String str8, @Json(name = "product_id") @Nullable String str9, @Json(name = "product_type") @Nullable String str10) {
        Intrinsics.echo(last4, "last4");
        this.scheme = str;
        this.schemeLocal = str2;
        this.last4 = last4;
        this.expiryMonth = num;
        this.expiryYear = num2;
        this.cardType = str3;
        this.cardCategory = str4;
        this.issuer = str5;
        this.issuerCountry = str6;
        this.name = str7;
        this.bin = str8;
        this.productId = str9;
        this.productType = str10;
    }

    public static /* synthetic */ CardDetails copy$default(CardDetails cardDetails, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cardDetails.scheme;
        }
        return cardDetails.copy(str, (i4 & 2) != 0 ? cardDetails.schemeLocal : str2, (i4 & 4) != 0 ? cardDetails.last4 : str3, (i4 & 8) != 0 ? cardDetails.expiryMonth : num, (i4 & 16) != 0 ? cardDetails.expiryYear : num2, (i4 & 32) != 0 ? cardDetails.cardType : str4, (i4 & 64) != 0 ? cardDetails.cardCategory : str5, (i4 & 128) != 0 ? cardDetails.issuer : str6, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? cardDetails.issuerCountry : str7, (i4 & 512) != 0 ? cardDetails.name : str8, (i4 & Barcode.FORMAT_UPC_E) != 0 ? cardDetails.bin : str9, (i4 & 2048) != 0 ? cardDetails.productId : str10, (i4 & 4096) != 0 ? cardDetails.productType : str11);
    }

    @Json(name = "card_category")
    public static /* synthetic */ void getCardCategory$annotations() {
    }

    @Json(name = "card_type")
    public static /* synthetic */ void getCardType$annotations() {
    }

    @Json(name = "expiry_month")
    public static /* synthetic */ void getExpiryMonth$annotations() {
    }

    @Json(name = "expiry_year")
    public static /* synthetic */ void getExpiryYear$annotations() {
    }

    @Json(name = "issuer_country")
    public static /* synthetic */ void getIssuerCountry$annotations() {
    }

    @Json(name = "product_id")
    public static /* synthetic */ void getProductId$annotations() {
    }

    @Json(name = "product_type")
    public static /* synthetic */ void getProductType$annotations() {
    }

    @Json(name = "scheme_local")
    public static /* synthetic */ void getSchemeLocal$annotations() {
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCardCategory() {
        return this.cardCategory;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    @NotNull
    public final CardDetails copy(@Nullable String scheme, @Json(name = "scheme_local") @Nullable String schemeLocal, @NotNull String last4, @Json(name = "expiry_month") @Nullable Integer expiryMonth, @Json(name = "expiry_year") @Nullable Integer expiryYear, @Json(name = "card_type") @Nullable String cardType, @Json(name = "card_category") @Nullable String cardCategory, @Nullable String issuer, @Json(name = "issuer_country") @Nullable String issuerCountry, @Nullable String name, @Nullable String bin, @Json(name = "product_id") @Nullable String productId, @Json(name = "product_type") @Nullable String productType) {
        Intrinsics.echo(last4, "last4");
        return new CardDetails(scheme, schemeLocal, last4, expiryMonth, expiryYear, cardType, cardCategory, issuer, issuerCountry, name, bin, productId, productType);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetails)) {
            return false;
        }
        CardDetails cardDetails = (CardDetails) other;
        return Intrinsics.areEqual(this.scheme, cardDetails.scheme) && Intrinsics.areEqual(this.schemeLocal, cardDetails.schemeLocal) && Intrinsics.areEqual(this.last4, cardDetails.last4) && Intrinsics.areEqual(this.expiryMonth, cardDetails.expiryMonth) && Intrinsics.areEqual(this.expiryYear, cardDetails.expiryYear) && Intrinsics.areEqual(this.cardType, cardDetails.cardType) && Intrinsics.areEqual(this.cardCategory, cardDetails.cardCategory) && Intrinsics.areEqual(this.issuer, cardDetails.issuer) && Intrinsics.areEqual(this.issuerCountry, cardDetails.issuerCountry) && Intrinsics.areEqual(this.name, cardDetails.name) && Intrinsics.areEqual(this.bin, cardDetails.bin) && Intrinsics.areEqual(this.productId, cardDetails.productId) && Intrinsics.areEqual(this.productType, cardDetails.productType);
    }

    @Nullable
    public final String getBin() {
        return this.bin;
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
    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    @NotNull
    public final String getLast4() {
        return this.last4;
    }

    @Nullable
    public final String getName() {
        return this.name;
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
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    public final int hashCode() {
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
        String str = this.scheme;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.schemeLocal;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int sierra = AbstractC2327c.sierra((i5 + hashCode2) * 31, 31, this.last4);
        Integer num = this.expiryMonth;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i10 = (sierra + hashCode3) * 31;
        Integer num2 = this.expiryYear;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.cardType;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str4 = this.cardCategory;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        String str5 = this.issuer;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        String str6 = this.issuerCountry;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        String str7 = this.name;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        String str8 = this.bin;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        String str9 = this.productId;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        String str10 = this.productType;
        if (str10 != null) {
            i4 = str10.hashCode();
        }
        return i18 + i4;
    }

    @NotNull
    public final String toString() {
        String str = this.scheme;
        String str2 = this.schemeLocal;
        String str3 = this.last4;
        Integer num = this.expiryMonth;
        Integer num2 = this.expiryYear;
        String str4 = this.cardType;
        String str5 = this.cardCategory;
        String str6 = this.issuer;
        String str7 = this.issuerCountry;
        String str8 = this.name;
        String str9 = this.bin;
        String str10 = this.productId;
        String str11 = this.productType;
        StringBuilder india = q.india("CardDetails(scheme=", str, ", schemeLocal=", str2, ", last4=");
        india.append(str3);
        india.append(", expiryMonth=");
        india.append(num);
        india.append(", expiryYear=");
        india.append(num2);
        india.append(", cardType=");
        india.append(str4);
        india.append(", cardCategory=");
        c.azure(india, str5, ", issuer=", str6, ", issuerCountry=");
        c.azure(india, str7, ", name=", str8, ", bin=");
        c.azure(india, str9, ", productId=", str10, ", productType=");
        return P0.gold(india, str11, ")");
    }
}
