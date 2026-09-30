package com.checkout.components.interfaces.model.paymentsession;

import Q0.c;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001eJ\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001eJ\u0012\u00104\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b4\u00105Jò\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u001eJ\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001eR(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bJ\u0010F\u001a\u0004\bI\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010@\u0012\u0004\bM\u0010F\u001a\u0004\bL\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010@\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010@\u0012\u0004\bS\u0010F\u001a\u0004\bR\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u0010@\u0012\u0004\bV\u0010F\u001a\u0004\bU\u0010\u001eR(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u0010C\u0012\u0004\bY\u0010F\u001a\u0004\bX\u0010 R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010C\u0012\u0004\b\\\u0010F\u001a\u0004\b[\u0010 R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b]\u0010C\u0012\u0004\b_\u0010F\u001a\u0004\b^\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010-R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bi\u0010F\u001a\u0004\bh\u0010/R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bj\u0010k\u0012\u0004\bm\u0010F\u001a\u0004\bl\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010@\u001a\u0004\bo\u0010\u001eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010@\u001a\u0004\bq\u0010\u001eR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u00105¨\u0006u"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "", "", Constants.KEY_TYPE, "", "cardSchemes", "", "schemeChoiceEnabled", "storePaymentDetails", "displayName", "countryCode", com.clevertap.android.sdk.leanplum.Constants.CURRENCY_CODE_PARAM, "merchantCapabilities", "supportedNetworks", "countryCallingCodes", "Lcom/checkout/components/interfaces/model/paymentsession/Total;", "total", "Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "merchant", "Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;", "transactionInfo", "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "cardParameters", "email", "name", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "phone", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/model/paymentsession/Total;Lcom/checkout/components/interfaces/model/paymentsession/Merchant;Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/checkout/components/interfaces/model/paymentsession/Total;", "component12", "()Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "component13", "()Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;", "component14", "()Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "component15", "component16", "component17", "()Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/checkout/components/interfaces/model/paymentsession/Total;Lcom/checkout/components/interfaces/model/paymentsession/Merchant;Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentMethod;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "Ljava/util/List;", "getCardSchemes", "getCardSchemes$annotations", "()V", "c", "Ljava/lang/Boolean;", "getSchemeChoiceEnabled", "getSchemeChoiceEnabled$annotations", Constants.INAPP_DATA_TAG, "getStorePaymentDetails", "getStorePaymentDetails$annotations", "e", "getDisplayName", "getDisplayName$annotations", "f", "getCountryCode", "getCountryCode$annotations", "g", "getCurrencyCode", "getCurrencyCode$annotations", "h", "getMerchantCapabilities", "getMerchantCapabilities$annotations", "i", "getSupportedNetworks", "getSupportedNetworks$annotations", "j", "getCountryCallingCodes", "getCountryCallingCodes$annotations", "k", "Lcom/checkout/components/interfaces/model/paymentsession/Total;", "getTotal", "l", "Lcom/checkout/components/interfaces/model/paymentsession/Merchant;", "getMerchant", "m", "Lcom/checkout/components/interfaces/model/paymentsession/TransactionInfo;", "getTransactionInfo", "getTransactionInfo$annotations", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "getCardParameters", "getCardParameters$annotations", "o", "getEmail", "p", "getName", "q", "Lcom/checkout/components/interfaces/model/PhoneNetworkEntity;", "getPhone", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethod {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List cardSchemes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Boolean schemeChoiceEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String storePaymentDetails;

    /* renamed from: e, reason: from kotlin metadata */
    private final String displayName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String countryCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String currencyCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List merchantCapabilities;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List supportedNetworks;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List countryCallingCodes;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Total total;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Merchant merchant;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final TransactionInfo transactionInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CardParameters cardParameters;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String email;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final PhoneNetworkEntity phone;

    public PaymentMethod(@NotNull String type, @Json(name = "card_schemes") @Nullable List<String> list, @Json(name = "scheme_choice_enabled") @Nullable Boolean bool, @Json(name = "stored_payment_details") @Nullable String str, @Json(name = "display_name") @Nullable String str2, @Json(name = "country_code") @Nullable String str3, @Json(name = "currency_code") @Nullable String str4, @Json(name = "merchant_capabilities") @Nullable List<String> list2, @Json(name = "supported_networks") @Nullable List<String> list3, @Json(name = "country_calling_codes") @Nullable List<String> list4, @Nullable Total total, @Nullable Merchant merchant, @Json(name = "transaction_info") @Nullable TransactionInfo transactionInfo, @Json(name = "card_parameters") @Nullable CardParameters cardParameters, @Nullable String str5, @Nullable String str6, @Nullable PhoneNetworkEntity phoneNetworkEntity) {
        Intrinsics.echo(type, "type");
        this.type = type;
        this.cardSchemes = list;
        this.schemeChoiceEnabled = bool;
        this.storePaymentDetails = str;
        this.displayName = str2;
        this.countryCode = str3;
        this.currencyCode = str4;
        this.merchantCapabilities = list2;
        this.supportedNetworks = list3;
        this.countryCallingCodes = list4;
        this.total = total;
        this.merchant = merchant;
        this.transactionInfo = transactionInfo;
        this.cardParameters = cardParameters;
        this.email = str5;
        this.name = str6;
        this.phone = phoneNetworkEntity;
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, List list, Boolean bool, String str2, String str3, String str4, String str5, List list2, List list3, List list4, Total total, Merchant merchant, TransactionInfo transactionInfo, CardParameters cardParameters, String str6, String str7, PhoneNetworkEntity phoneNetworkEntity, int i4, Object obj) {
        PhoneNetworkEntity phoneNetworkEntity2;
        String str8;
        String str9;
        PaymentMethod paymentMethod2;
        String str10;
        List list5;
        Boolean bool2;
        String str11;
        String str12;
        String str13;
        String str14;
        List list6;
        List list7;
        List list8;
        Total total2;
        Merchant merchant2;
        TransactionInfo transactionInfo2;
        CardParameters cardParameters2;
        String str15 = (i4 & 1) != 0 ? paymentMethod.type : str;
        List list9 = (i4 & 2) != 0 ? paymentMethod.cardSchemes : list;
        Boolean bool3 = (i4 & 4) != 0 ? paymentMethod.schemeChoiceEnabled : bool;
        String str16 = (i4 & 8) != 0 ? paymentMethod.storePaymentDetails : str2;
        String str17 = (i4 & 16) != 0 ? paymentMethod.displayName : str3;
        String str18 = (i4 & 32) != 0 ? paymentMethod.countryCode : str4;
        String str19 = (i4 & 64) != 0 ? paymentMethod.currencyCode : str5;
        List list10 = (i4 & 128) != 0 ? paymentMethod.merchantCapabilities : list2;
        List list11 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? paymentMethod.supportedNetworks : list3;
        List list12 = (i4 & 512) != 0 ? paymentMethod.countryCallingCodes : list4;
        Total total3 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? paymentMethod.total : total;
        Merchant merchant3 = (i4 & 2048) != 0 ? paymentMethod.merchant : merchant;
        TransactionInfo transactionInfo3 = (i4 & 4096) != 0 ? paymentMethod.transactionInfo : transactionInfo;
        CardParameters cardParameters3 = (i4 & 8192) != 0 ? paymentMethod.cardParameters : cardParameters;
        String str20 = str15;
        String str21 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? paymentMethod.email : str6;
        String str22 = (i4 & 32768) != 0 ? paymentMethod.name : str7;
        if ((i4 & 65536) != 0) {
            str8 = str22;
            phoneNetworkEntity2 = paymentMethod.phone;
            str10 = str21;
            list5 = list9;
            bool2 = bool3;
            str11 = str16;
            str12 = str17;
            str13 = str18;
            str14 = str19;
            list6 = list10;
            list7 = list11;
            list8 = list12;
            total2 = total3;
            merchant2 = merchant3;
            transactionInfo2 = transactionInfo3;
            cardParameters2 = cardParameters3;
            str9 = str20;
            paymentMethod2 = paymentMethod;
        } else {
            phoneNetworkEntity2 = phoneNetworkEntity;
            str8 = str22;
            str9 = str20;
            paymentMethod2 = paymentMethod;
            str10 = str21;
            list5 = list9;
            bool2 = bool3;
            str11 = str16;
            str12 = str17;
            str13 = str18;
            str14 = str19;
            list6 = list10;
            list7 = list11;
            list8 = list12;
            total2 = total3;
            merchant2 = merchant3;
            transactionInfo2 = transactionInfo3;
            cardParameters2 = cardParameters3;
        }
        return paymentMethod2.copy(str9, list5, bool2, str11, str12, str13, str14, list6, list7, list8, total2, merchant2, transactionInfo2, cardParameters2, str10, str8, phoneNetworkEntity2);
    }

    @Json(name = "card_parameters")
    public static /* synthetic */ void getCardParameters$annotations() {
    }

    @Json(name = "card_schemes")
    public static /* synthetic */ void getCardSchemes$annotations() {
    }

    @Json(name = "country_calling_codes")
    public static /* synthetic */ void getCountryCallingCodes$annotations() {
    }

    @Json(name = "country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @Json(name = "currency_code")
    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    @Json(name = "display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @Json(name = "merchant_capabilities")
    public static /* synthetic */ void getMerchantCapabilities$annotations() {
    }

    @Json(name = "scheme_choice_enabled")
    public static /* synthetic */ void getSchemeChoiceEnabled$annotations() {
    }

    @Json(name = "stored_payment_details")
    public static /* synthetic */ void getStorePaymentDetails$annotations() {
    }

    @Json(name = "supported_networks")
    public static /* synthetic */ void getSupportedNetworks$annotations() {
    }

    @Json(name = "transaction_info")
    public static /* synthetic */ void getTransactionInfo$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final List<String> component10() {
        return this.countryCallingCodes;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Total getTotal() {
        return this.total;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Merchant getMerchant() {
        return this.merchant;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final TransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final CardParameters getCardParameters() {
        return this.cardParameters;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final PhoneNetworkEntity getPhone() {
        return this.phone;
    }

    @Nullable
    public final List<String> component2() {
        return this.cardSchemes;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getSchemeChoiceEnabled() {
        return this.schemeChoiceEnabled;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getStorePaymentDetails() {
        return this.storePaymentDetails;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final List<String> component8() {
        return this.merchantCapabilities;
    }

    @Nullable
    public final List<String> component9() {
        return this.supportedNetworks;
    }

    @NotNull
    public final PaymentMethod copy(@NotNull String type, @Json(name = "card_schemes") @Nullable List<String> cardSchemes, @Json(name = "scheme_choice_enabled") @Nullable Boolean schemeChoiceEnabled, @Json(name = "stored_payment_details") @Nullable String storePaymentDetails, @Json(name = "display_name") @Nullable String displayName, @Json(name = "country_code") @Nullable String countryCode, @Json(name = "currency_code") @Nullable String currencyCode, @Json(name = "merchant_capabilities") @Nullable List<String> merchantCapabilities, @Json(name = "supported_networks") @Nullable List<String> supportedNetworks, @Json(name = "country_calling_codes") @Nullable List<String> countryCallingCodes, @Nullable Total total, @Nullable Merchant merchant, @Json(name = "transaction_info") @Nullable TransactionInfo transactionInfo, @Json(name = "card_parameters") @Nullable CardParameters cardParameters, @Nullable String email, @Nullable String name, @Nullable PhoneNetworkEntity phone) {
        Intrinsics.echo(type, "type");
        return new PaymentMethod(type, cardSchemes, schemeChoiceEnabled, storePaymentDetails, displayName, countryCode, currencyCode, merchantCapabilities, supportedNetworks, countryCallingCodes, total, merchant, transactionInfo, cardParameters, email, name, phone);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.type, paymentMethod.type) && Intrinsics.areEqual(this.cardSchemes, paymentMethod.cardSchemes) && Intrinsics.areEqual(this.schemeChoiceEnabled, paymentMethod.schemeChoiceEnabled) && Intrinsics.areEqual(this.storePaymentDetails, paymentMethod.storePaymentDetails) && Intrinsics.areEqual(this.displayName, paymentMethod.displayName) && Intrinsics.areEqual(this.countryCode, paymentMethod.countryCode) && Intrinsics.areEqual(this.currencyCode, paymentMethod.currencyCode) && Intrinsics.areEqual(this.merchantCapabilities, paymentMethod.merchantCapabilities) && Intrinsics.areEqual(this.supportedNetworks, paymentMethod.supportedNetworks) && Intrinsics.areEqual(this.countryCallingCodes, paymentMethod.countryCallingCodes) && Intrinsics.areEqual(this.total, paymentMethod.total) && Intrinsics.areEqual(this.merchant, paymentMethod.merchant) && Intrinsics.areEqual(this.transactionInfo, paymentMethod.transactionInfo) && Intrinsics.areEqual(this.cardParameters, paymentMethod.cardParameters) && Intrinsics.areEqual(this.email, paymentMethod.email) && Intrinsics.areEqual(this.name, paymentMethod.name) && Intrinsics.areEqual(this.phone, paymentMethod.phone);
    }

    @Nullable
    public final CardParameters getCardParameters() {
        return this.cardParameters;
    }

    @Nullable
    public final List<String> getCardSchemes() {
        return this.cardSchemes;
    }

    @Nullable
    public final List<String> getCountryCallingCodes() {
        return this.countryCallingCodes;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Merchant getMerchant() {
        return this.merchant;
    }

    @Nullable
    public final List<String> getMerchantCapabilities() {
        return this.merchantCapabilities;
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
    public final Boolean getSchemeChoiceEnabled() {
        return this.schemeChoiceEnabled;
    }

    @Nullable
    public final String getStorePaymentDetails() {
        return this.storePaymentDetails;
    }

    @Nullable
    public final List<String> getSupportedNetworks() {
        return this.supportedNetworks;
    }

    @Nullable
    public final Total getTotal() {
        return this.total;
    }

    @Nullable
    public final TransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List list = this.cardSchemes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.schemeChoiceEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.storePaymentDetails;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list2 = this.merchantCapabilities;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.supportedNetworks;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.countryCallingCodes;
        int hashCode10 = (hashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Total total = this.total;
        int hashCode11 = (hashCode10 + (total == null ? 0 : total.hashCode())) * 31;
        Merchant merchant = this.merchant;
        int hashCode12 = (hashCode11 + (merchant == null ? 0 : merchant.hashCode())) * 31;
        TransactionInfo transactionInfo = this.transactionInfo;
        int hashCode13 = (hashCode12 + (transactionInfo == null ? 0 : transactionInfo.hashCode())) * 31;
        CardParameters cardParameters = this.cardParameters;
        int hashCode14 = (hashCode13 + (cardParameters == null ? 0 : cardParameters.hashCode())) * 31;
        String str5 = this.email;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        return hashCode16 + (phoneNetworkEntity != null ? phoneNetworkEntity.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.type;
        List list = this.cardSchemes;
        Boolean bool = this.schemeChoiceEnabled;
        String str2 = this.storePaymentDetails;
        String str3 = this.displayName;
        String str4 = this.countryCode;
        String str5 = this.currencyCode;
        List list2 = this.merchantCapabilities;
        List list3 = this.supportedNetworks;
        List list4 = this.countryCallingCodes;
        Total total = this.total;
        Merchant merchant = this.merchant;
        TransactionInfo transactionInfo = this.transactionInfo;
        CardParameters cardParameters = this.cardParameters;
        String str6 = this.email;
        String str7 = this.name;
        PhoneNetworkEntity phoneNetworkEntity = this.phone;
        StringBuilder sb2 = new StringBuilder("PaymentMethod(type=");
        sb2.append(str);
        sb2.append(", cardSchemes=");
        sb2.append(list);
        sb2.append(", schemeChoiceEnabled=");
        sb2.append(bool);
        sb2.append(", storePaymentDetails=");
        sb2.append(str2);
        sb2.append(", displayName=");
        c.azure(sb2, str3, ", countryCode=", str4, ", currencyCode=");
        sb2.append(str5);
        sb2.append(", merchantCapabilities=");
        sb2.append(list2);
        sb2.append(", supportedNetworks=");
        sb2.append(list3);
        sb2.append(", countryCallingCodes=");
        sb2.append(list4);
        sb2.append(", total=");
        sb2.append(total);
        sb2.append(", merchant=");
        sb2.append(merchant);
        sb2.append(", transactionInfo=");
        sb2.append(transactionInfo);
        sb2.append(", cardParameters=");
        sb2.append(cardParameters);
        sb2.append(", email=");
        c.azure(sb2, str6, ", name=", str7, ", phone=");
        sb2.append(phoneNetworkEntity);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ PaymentMethod(String str, List list, Boolean bool, String str2, String str3, String str4, String str5, List list2, List list3, List list4, Total total, Merchant merchant, TransactionInfo transactionInfo, CardParameters cardParameters, String str6, String str7, PhoneNetworkEntity phoneNetworkEntity, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : list, (i4 & 4) != 0 ? null : bool, (i4 & 8) != 0 ? null : str2, (i4 & 16) != 0 ? null : str3, (i4 & 32) != 0 ? null : str4, (i4 & 64) != 0 ? null : str5, (i4 & 128) != 0 ? null : list2, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : list3, (i4 & 512) != 0 ? null : list4, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : total, (i4 & 2048) != 0 ? null : merchant, (i4 & 4096) != 0 ? null : transactionInfo, (i4 & 8192) != 0 ? null : cardParameters, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6, (i4 & 32768) != 0 ? null : str7, (i4 & 65536) != 0 ? null : phoneNetworkEntity);
    }
}
