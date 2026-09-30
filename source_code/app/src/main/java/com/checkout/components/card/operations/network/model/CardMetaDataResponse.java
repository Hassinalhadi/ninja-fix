package com.checkout.components.card.operations.network.model;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b4\b\u0001\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0017\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0017\u0012\u0004\b*\u0010\u001d\u001a\u0004\b)\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0017\u0012\u0004\b-\u0010\u001d\u001a\u0004\b,\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\u0017\u0012\u0004\b0\u0010\u001d\u001a\u0004\b/\u0010\u0019R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u0017\u0012\u0004\b3\u0010\u001d\u001a\u0004\b2\u0010\u0019R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u0017\u0012\u0004\b6\u0010\u001d\u001a\u0004\b5\u0010\u0019R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u001d\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0017\u001a\u0004\b=\u0010\u0019R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010\u0017\u0012\u0004\b@\u0010\u001d\u001a\u0004\b?\u0010\u0019R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010\u001d\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/checkout/components/card/operations/network/model/CardMetaDataResponse;", "", "", "scheme", "schemeLocal", "cardType", "cardCategory", "currency", "issuer", "issuerCountry", "issuerCountryName", "productId", "subProductId", "productType", "", "regulatedIndicator", "bin", "binMax", "", "localSchemes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getScheme", "()Ljava/lang/String;", "b", "getSchemeLocal", "getSchemeLocal$annotations", "()V", "c", "getCardType", "getCardType$annotations", Constants.INAPP_DATA_TAG, "getCardCategory", "getCardCategory$annotations", "e", "getCurrency", "f", "getIssuer", "g", "getIssuerCountry", "getIssuerCountry$annotations", "h", "getIssuerCountryName", "getIssuerCountryName$annotations", "i", "getProductId", "getProductId$annotations", "j", "getSubProductId", "getSubProductId$annotations", "k", "getProductType", "getProductType$annotations", "l", "Ljava/lang/Boolean;", "getRegulatedIndicator", "()Ljava/lang/Boolean;", "getRegulatedIndicator$annotations", "m", "getBin", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "getBinMax", "getBinMax$annotations", "o", "Ljava/util/List;", "getLocalSchemes", "()Ljava/util/List;", "getLocalSchemes$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMetaDataResponse {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String scheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String schemeLocal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String cardType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String cardCategory;

    /* renamed from: e, reason: from kotlin metadata */
    private final String currency;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String issuer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String issuerCountry;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String issuerCountryName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String productId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String subProductId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String productType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Boolean regulatedIndicator;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String bin;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String binMax;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List localSchemes;

    public CardMetaDataResponse(@NotNull String scheme, @Json(name = "scheme_local") @Nullable String str, @Json(name = "card_type") @Nullable String str2, @Json(name = "card_category") @Nullable String str3, @Nullable String str4, @Nullable String str5, @Json(name = "issuer_country") @Nullable String str6, @Json(name = "issuer_country_name") @Nullable String str7, @Json(name = "product_id") @Nullable String str8, @Json(name = "sub_product_id") @Nullable String str9, @Json(name = "product_type") @Nullable String str10, @Json(name = "regulated_indicator") @Nullable Boolean bool, @NotNull String bin, @Json(name = "bin_max") @Nullable String str11, @Json(name = "local_schemes") @Nullable List<String> list) {
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

    @Json(name = "bin_max")
    public static /* synthetic */ void getBinMax$annotations() {
    }

    @Json(name = "card_category")
    public static /* synthetic */ void getCardCategory$annotations() {
    }

    @Json(name = "card_type")
    public static /* synthetic */ void getCardType$annotations() {
    }

    @Json(name = "issuer_country")
    public static /* synthetic */ void getIssuerCountry$annotations() {
    }

    @Json(name = "issuer_country_name")
    public static /* synthetic */ void getIssuerCountryName$annotations() {
    }

    @Json(name = "local_schemes")
    public static /* synthetic */ void getLocalSchemes$annotations() {
    }

    @Json(name = "product_id")
    public static /* synthetic */ void getProductId$annotations() {
    }

    @Json(name = "product_type")
    public static /* synthetic */ void getProductType$annotations() {
    }

    @Json(name = "regulated_indicator")
    public static /* synthetic */ void getRegulatedIndicator$annotations() {
    }

    @Json(name = "scheme_local")
    public static /* synthetic */ void getSchemeLocal$annotations() {
    }

    @Json(name = "sub_product_id")
    public static /* synthetic */ void getSubProductId$annotations() {
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
}
