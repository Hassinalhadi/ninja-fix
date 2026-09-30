package com.checkout.components.interfaces.model;

import Q0.c;
import av.q;
import com.checkout.components.interfaces.b;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJÚ\u0001\u00100\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001bJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bD\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u0010\u001eR \u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010A\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bL\u0010A\u001a\u0004\bM\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010A\u0012\u0004\bP\u0010<\u001a\u0004\bO\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010A\u0012\u0004\bS\u0010<\u001a\u0004\bR\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u0010A\u0012\u0004\bV\u0010<\u001a\u0004\bU\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bW\u0010A\u001a\u0004\bX\u0010\u001eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u0010A\u0012\u0004\b[\u0010<\u001a\u0004\bZ\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\\\u0010A\u0012\u0004\b^\u0010<\u001a\u0004\b]\u0010\u001eR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b_\u0010A\u0012\u0004\ba\u0010<\u001a\u0004\b`\u0010\u001eR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\be\u0010<\u001a\u0004\bd\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010.R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bi\u0010A\u001a\u0004\bj\u0010\u001e¨\u0006k"}, d2 = {"Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "", "", "expiryMonth", "expiryYear", "", "last4", "bin", Constants.KEY_TYPE, "token", "expiresOn", "scheme", "schemeLocal", "cardType", "cardCategory", "issuer", "issuerCountry", "productId", "productType", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "billingAddress", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "name", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "component17", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "component18", Constants.COPY_TYPE, "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/TokenDetailsResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getExpiryMonth", "getExpiryMonth$annotations", "()V", "b", "getExpiryYear", "getExpiryYear$annotations", "c", "Ljava/lang/String;", "getLast4", Constants.INAPP_DATA_TAG, "getBin", "e", "getType", "f", "getToken", "g", "getExpiresOn", "getExpiresOn$annotations", "h", "getScheme", "i", "getSchemeLocal", "getSchemeLocal$annotations", "j", "getCardType", "getCardType$annotations", "k", "getCardCategory", "getCardCategory$annotations", "l", "getIssuer", "m", "getIssuerCountry", "getIssuerCountry$annotations", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "getProductId", "getProductId$annotations", "o", "getProductType", "getProductType$annotations", "p", "Lcom/checkout/components/interfaces/model/BillingAddressNetworkEntity;", "getBillingAddress", "getBillingAddress$annotations", "q", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "r", "getName", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TokenDetailsResponse {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int expiryMonth;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int expiryYear;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String last4;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String bin;

    /* renamed from: e, reason: from kotlin metadata */
    private final String type;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String token;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String expiresOn;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String schemeLocal;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String cardType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String cardCategory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String issuer;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String issuerCountry;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String productId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String productType;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final BillingAddressNetworkEntity billingAddress;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String name;

    public TokenDetailsResponse(@Json(name = "expiry_month") int i4, @Json(name = "expiry_year") int i5, @NotNull String last4, @NotNull String bin, @NotNull String type, @NotNull String token, @Json(name = "expires_on") @NotNull String expiresOn, @Nullable String str, @Json(name = "scheme_local") @Nullable String str2, @Json(name = "card_type") @Nullable String str3, @Json(name = "card_category") @Nullable String str4, @Nullable String str5, @Json(name = "issuer_country") @Nullable String str6, @Json(name = "product_id") @Nullable String str7, @Json(name = "product_type") @Nullable String str8, @Json(name = "billing_address") @Nullable BillingAddressNetworkEntity billingAddressNetworkEntity, @Nullable PhoneNetworkEntity phoneNetworkEntity, @Nullable String str9) {
        Intrinsics.echo(last4, "last4");
        Intrinsics.echo(bin, "bin");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(token, "token");
        Intrinsics.echo(expiresOn, "expiresOn");
        this.expiryMonth = i4;
        this.expiryYear = i5;
        this.last4 = last4;
        this.bin = bin;
        this.type = type;
        this.token = token;
        this.expiresOn = expiresOn;
        this.scheme = str;
        this.schemeLocal = str2;
        this.cardType = str3;
        this.cardCategory = str4;
        this.issuer = str5;
        this.issuerCountry = str6;
        this.productId = str7;
        this.productType = str8;
        this.billingAddress = billingAddressNetworkEntity;
        this.phone = phoneNetworkEntity;
        this.name = str9;
    }

    public static /* synthetic */ TokenDetailsResponse copy$default(TokenDetailsResponse tokenDetailsResponse, int i4, int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, String str14, int i10, Object obj) {
        String str15;
        PhoneNetworkEntity phoneNetworkEntity2;
        int i11 = (i10 & 1) != 0 ? tokenDetailsResponse.expiryMonth : i4;
        int i12 = (i10 & 2) != 0 ? tokenDetailsResponse.expiryYear : i5;
        String str16 = (i10 & 4) != 0 ? tokenDetailsResponse.last4 : str;
        String str17 = (i10 & 8) != 0 ? tokenDetailsResponse.bin : str2;
        String str18 = (i10 & 16) != 0 ? tokenDetailsResponse.type : str3;
        String str19 = (i10 & 32) != 0 ? tokenDetailsResponse.token : str4;
        String str20 = (i10 & 64) != 0 ? tokenDetailsResponse.expiresOn : str5;
        String str21 = (i10 & 128) != 0 ? tokenDetailsResponse.scheme : str6;
        String str22 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? tokenDetailsResponse.schemeLocal : str7;
        String str23 = (i10 & 512) != 0 ? tokenDetailsResponse.cardType : str8;
        String str24 = (i10 & Barcode.FORMAT_UPC_E) != 0 ? tokenDetailsResponse.cardCategory : str9;
        String str25 = (i10 & 2048) != 0 ? tokenDetailsResponse.issuer : str10;
        String str26 = (i10 & 4096) != 0 ? tokenDetailsResponse.issuerCountry : str11;
        String str27 = (i10 & 8192) != 0 ? tokenDetailsResponse.productId : str12;
        int i13 = i11;
        String str28 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? tokenDetailsResponse.productType : str13;
        BillingAddressNetworkEntity billingAddressNetworkEntity2 = (i10 & 32768) != 0 ? tokenDetailsResponse.billingAddress : billingAddressNetworkEntity;
        PhoneNetworkEntity phoneNetworkEntity3 = (i10 & 65536) != 0 ? tokenDetailsResponse.phone : phoneNetworkEntity;
        if ((i10 & 131072) != 0) {
            phoneNetworkEntity2 = phoneNetworkEntity3;
            str15 = tokenDetailsResponse.name;
        } else {
            str15 = str14;
            phoneNetworkEntity2 = phoneNetworkEntity3;
        }
        return tokenDetailsResponse.copy(i13, i12, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, billingAddressNetworkEntity2, phoneNetworkEntity2, str15);
    }

    @Json(name = "billing_address")
    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    @Json(name = "card_category")
    public static /* synthetic */ void getCardCategory$annotations() {
    }

    @Json(name = "card_type")
    public static /* synthetic */ void getCardType$annotations() {
    }

    @Json(name = "expires_on")
    public static /* synthetic */ void getExpiresOn$annotations() {
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

    /* renamed from: component1, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getCardCategory() {
        return this.cardCategory;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getIssuerCountry() {
        return this.issuerCountry;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getExpiresOn() {
        return this.expiresOn;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getSchemeLocal() {
        return this.schemeLocal;
    }

    @NotNull
    public final TokenDetailsResponse copy(@Json(name = "expiry_month") int expiryMonth, @Json(name = "expiry_year") int expiryYear, @NotNull String last4, @NotNull String bin, @NotNull String type, @NotNull String token, @Json(name = "expires_on") @NotNull String expiresOn, @Nullable String scheme, @Json(name = "scheme_local") @Nullable String schemeLocal, @Json(name = "card_type") @Nullable String cardType, @Json(name = "card_category") @Nullable String cardCategory, @Nullable String issuer, @Json(name = "issuer_country") @Nullable String issuerCountry, @Json(name = "product_id") @Nullable String productId, @Json(name = "product_type") @Nullable String productType, @Json(name = "billing_address") @Nullable BillingAddressNetworkEntity billingAddress, @Nullable PhoneNetworkEntity phone, @Nullable String name) {
        Intrinsics.echo(last4, "last4");
        Intrinsics.echo(bin, "bin");
        Intrinsics.echo(type, "type");
        Intrinsics.echo(token, "token");
        Intrinsics.echo(expiresOn, "expiresOn");
        return new TokenDetailsResponse(expiryMonth, expiryYear, last4, bin, type, token, expiresOn, scheme, schemeLocal, cardType, cardCategory, issuer, issuerCountry, productId, productType, billingAddress, phone, name);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenDetailsResponse)) {
            return false;
        }
        TokenDetailsResponse tokenDetailsResponse = (TokenDetailsResponse) other;
        return this.expiryMonth == tokenDetailsResponse.expiryMonth && this.expiryYear == tokenDetailsResponse.expiryYear && Intrinsics.areEqual(this.last4, tokenDetailsResponse.last4) && Intrinsics.areEqual(this.bin, tokenDetailsResponse.bin) && Intrinsics.areEqual(this.type, tokenDetailsResponse.type) && Intrinsics.areEqual(this.token, tokenDetailsResponse.token) && Intrinsics.areEqual(this.expiresOn, tokenDetailsResponse.expiresOn) && Intrinsics.areEqual(this.scheme, tokenDetailsResponse.scheme) && Intrinsics.areEqual(this.schemeLocal, tokenDetailsResponse.schemeLocal) && Intrinsics.areEqual(this.cardType, tokenDetailsResponse.cardType) && Intrinsics.areEqual(this.cardCategory, tokenDetailsResponse.cardCategory) && Intrinsics.areEqual(this.issuer, tokenDetailsResponse.issuer) && Intrinsics.areEqual(this.issuerCountry, tokenDetailsResponse.issuerCountry) && Intrinsics.areEqual(this.productId, tokenDetailsResponse.productId) && Intrinsics.areEqual(this.productType, tokenDetailsResponse.productType) && Intrinsics.areEqual(this.billingAddress, tokenDetailsResponse.billingAddress) && Intrinsics.areEqual(this.phone, tokenDetailsResponse.phone) && Intrinsics.areEqual(this.name, tokenDetailsResponse.name);
    }

    @Nullable
    public final BillingAddressNetworkEntity getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
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

    @NotNull
    public final String getExpiresOn() {
        return this.expiresOn;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
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
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
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

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getType() {
        return this.type;
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
        int a6 = b.a(this.expiresOn, b.a(this.token, b.a(this.type, b.a(this.bin, b.a(this.last4, (this.expiryYear + (this.expiryMonth * 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.scheme;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (a6 + hashCode) * 31;
        String str2 = this.schemeLocal;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str3 = this.cardType;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.cardCategory;
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
        String str7 = this.productId;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.productType;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        if (billingAddressNetworkEntity == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = billingAddressNetworkEntity.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        if (phoneNetworkEntity == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = phoneNetworkEntity.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.name;
        if (str9 != null) {
            i4 = str9.hashCode();
        }
        return i18 + i4;
    }

    @NotNull
    public final String toString() {
        int i4 = this.expiryMonth;
        int i5 = this.expiryYear;
        String str = this.last4;
        String str2 = this.bin;
        String str3 = this.type;
        String str4 = this.token;
        String str5 = this.expiresOn;
        String str6 = this.scheme;
        String str7 = this.schemeLocal;
        String str8 = this.cardType;
        String str9 = this.cardCategory;
        String str10 = this.issuer;
        String str11 = this.issuerCountry;
        String str12 = this.productId;
        String str13 = this.productType;
        BillingAddressNetworkEntity billingAddressNetworkEntity = this.billingAddress;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        String str14 = this.name;
        StringBuilder hotel = q.hotel(i4, i5, "TokenDetailsResponse(expiryMonth=", ", expiryYear=", ", last4=");
        c.azure(hotel, str, ", bin=", str2, ", type=");
        c.azure(hotel, str3, ", token=", str4, ", expiresOn=");
        c.azure(hotel, str5, ", scheme=", str6, ", schemeLocal=");
        c.azure(hotel, str7, ", cardType=", str8, ", cardCategory=");
        c.azure(hotel, str9, ", issuer=", str10, ", issuerCountry=");
        c.azure(hotel, str11, ", productId=", str12, ", productType=");
        hotel.append(str13);
        hotel.append(", billingAddress=");
        hotel.append(billingAddressNetworkEntity);
        hotel.append(", phone=");
        hotel.append(phoneNetworkEntity);
        hotel.append(", name=");
        hotel.append(str14);
        hotel.append(")");
        return hotel.toString();
    }

    public /* synthetic */ TokenDetailsResponse(int i4, int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, BillingAddressNetworkEntity billingAddressNetworkEntity, PhoneNetworkEntity phoneNetworkEntity, String str14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, str, str2, str3, str4, str5, (i10 & 128) != 0 ? null : str6, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8, (i10 & Barcode.FORMAT_UPC_E) != 0 ? null : str9, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? null : str11, (i10 & 8192) != 0 ? null : str12, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str13, (32768 & i10) != 0 ? null : billingAddressNetworkEntity, (65536 & i10) != 0 ? null : phoneNetworkEntity, (i10 & 131072) != 0 ? null : str14);
    }
}
