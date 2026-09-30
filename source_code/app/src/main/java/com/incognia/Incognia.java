package com.incognia;

import android.app.Application;
import android.util.Log;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.incognia.internal.BD1;
import com.incognia.internal.CLi;
import com.incognia.internal.Fk;
import com.incognia.internal.MbI;
import com.incognia.internal.Ncr;
import com.incognia.internal.NrW;
import com.incognia.internal.RjL;
import com.incognia.internal.Tt6;
import com.incognia.internal.VgX;
import com.incognia.internal.YUx;
import com.incognia.internal.aus;
import com.incognia.internal.eSs;
import com.incognia.internal.elV;
import com.incognia.internal.l4V;
import com.incognia.internal.mXi;
import com.incognia.internal.pl2;
import com.incognia.internal.qEZ;
import com.incognia.internal.qR;
import com.incognia.internal.qy5;
import com.incognia.internal.sEC;
import com.incognia.internal.uY;
import g9.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.c;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010\u0003JW\u0010*\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b*\u0010.JS\u00101\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b1\u00105JW\u00106\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b6\u0010+J\u0017\u00106\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b6\u00109J\u009b\u0001\u0010D\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010:2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bD\u0010HJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u0010H\u0007¢\u0006\u0004\bJ\u0010!J\u001d\u0010M\u001a\u00020\b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0KH\u0002¢\u0006\u0004\bM\u0010NJ)\u0010P\u001a\u00020\b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00102\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0KH\u0002¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0KH\u0002¢\u0006\u0004\bR\u0010NJ+\u0010T\u001a\u00028\u0000\"\u0004\b\u0000\u0010S2\u0006\u0010O\u001a\u00020\u00102\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000KH\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010Y¨\u0006["}, d2 = {"Lcom/incognia/Incognia;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/incognia/IncogniaOptions;", "incogniaOptions", "", "init", "(Landroid/app/Application;Lcom/incognia/IncogniaOptions;)V", "disable", "(Landroid/app/Application;)V", "", "timeout", "Lcom/incognia/Callback;", "", "callback", "generateRequestToken", "(Ljava/lang/Long;Lcom/incognia/Callback;)V", "Lcom/incognia/RequestTokenWithStatus;", "generateRequestTokenWithStatus", "generateRequestTokenSync", "(J)Ljava/lang/String;", "generateRequestTokenWithStatusSync", "(J)Lcom/incognia/RequestTokenWithStatus;", "notifyAppInForeground", "", "enabled", "setLocationEnabled", "(Z)V", "accountId", "setAccountId", "(Ljava/lang/String;)V", "clearAccountId", "externalId", "Lcom/incognia/EventAddress;", "address", "tag", "Lcom/incognia/EventProperties;", "properties", "status", "sendCustomEvent", "(Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventAddress;Ljava/lang/String;Lcom/incognia/EventProperties;Ljava/lang/String;)V", "Lcom/incognia/CustomEvent;", "customEvent", "(Lcom/incognia/CustomEvent;)V", "Lcom/incognia/EventLocation;", "location", "sendLoginEvent", "(Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventLocation;Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventProperties;)V", "Lcom/incognia/LoginEvent;", "loginEvent", "(Lcom/incognia/LoginEvent;)V", "sendOnboardingEvent", "Lcom/incognia/OnboardingEvent;", "onboardingEvent", "(Lcom/incognia/OnboardingEvent;)V", "", "Lcom/incognia/PaymentAddress;", "addresses", "Lcom/incognia/PaymentValue;", "paymentValue", "Lcom/incognia/PaymentCoupon;", "paymentCoupon", "Lcom/incognia/PaymentMethod;", "paymentMethods", "storeId", "sendPaymentEvent", "(Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventLocation;Ljava/util/List;Lcom/incognia/PaymentValue;Lcom/incognia/PaymentCoupon;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/incognia/EventProperties;Ljava/lang/String;)V", "Lcom/incognia/PaymentEvent;", "paymentEvent", "(Lcom/incognia/PaymentEvent;)V", "businessUnitId", "reportBusinessUnitId", "Lkotlin/Function0;", "block", "runOnIncogniaThread", "(Lkotlin/jvm/functions/Function0;)V", "methodName", "runOnIncogniaThreadIfInitialized", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "runOnMainThread", "T", "runAndMeasureTime", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "DEFAULT_TIMEOUT", "J", "ASYNC_TOKEN_GENERATION_NAME", "Ljava/lang/String;", "ASYNC_TOKEN_CLIENT_SIDE_NAME", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Incognia {
    private static final String ASYNC_TOKEN_CLIENT_SIDE_NAME = "async_request_token_client";
    private static final String ASYNC_TOKEN_GENERATION_NAME = "async_request_token_generation";
    private static final long DEFAULT_TIMEOUT = 5000;
    public static final Incognia INSTANCE = new Incognia();

    private Incognia() {
    }

    public static final void clearAccountId() {
        INSTANCE.runAndMeasureTime("clearAccountId", qy5.f11186b);
    }

    @c
    public static final void disable(Application application) {
        if (eSs.f10363b.get()) {
            Log.w("Incognia", "disable is deprecated and won't have any effect.");
        }
    }

    public static final void generateRequestToken(Callback<String> callback) {
        generateRequestToken$default(null, callback, 1, null);
    }

    public static /* synthetic */ void generateRequestToken$default(Long l10, Callback callback, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l10 = null;
        }
        generateRequestToken(l10, callback);
    }

    public static final String generateRequestTokenSync() {
        return generateRequestTokenSync$default(0L, 1, null);
    }

    public static /* synthetic */ String generateRequestTokenSync$default(long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = 5000;
        }
        return generateRequestTokenSync(j5);
    }

    public static final void generateRequestTokenWithStatus(Callback<RequestTokenWithStatus> callback) {
        generateRequestTokenWithStatus$default(null, callback, 1, null);
    }

    public static /* synthetic */ void generateRequestTokenWithStatus$default(Long l10, Callback callback, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l10 = null;
        }
        generateRequestTokenWithStatus(l10, callback);
    }

    public static final RequestTokenWithStatus generateRequestTokenWithStatusSync() {
        return generateRequestTokenWithStatusSync$default(0L, 1, null);
    }

    public static /* synthetic */ RequestTokenWithStatus generateRequestTokenWithStatusSync$default(long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = 5000;
        }
        return generateRequestTokenWithStatusSync(j5);
    }

    public static final void init(Application application) {
        init$default(application, null, 2, null);
    }

    public static /* synthetic */ void init$default(Application application, IncogniaOptions incogniaOptions, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            incogniaOptions = null;
        }
        init(application, incogniaOptions);
    }

    @c
    public static final void notifyAppInForeground() {
        if (eSs.f10363b.get()) {
            Log.w("Incognia", "notifyAppInForeground is deprecated and won't have any effect.");
        }
    }

    public static final void reportBusinessUnitId(String businessUnitId) {
        INSTANCE.runAndMeasureTime("reportBusinessUnitId", new qEZ(businessUnitId));
    }

    private final <T> T runAndMeasureTime(String methodName, Function0<? extends T> block) {
        int b2 = mXi.b(methodName);
        try {
            T invoke = block.invoke();
            mXi.f9(b2);
            runOnIncogniaThreadIfInitialized$default(this, null, new aus(methodName), 1, null);
            return invoke;
        } catch (Throwable th) {
            pl2 pl2Var = mXi.f10907b;
            mXi.f9(b2);
            runOnIncogniaThreadIfInitialized$default(this, null, new aus(methodName), 1, null);
            throw th;
        }
    }

    public final void runOnIncogniaThread(Function0<Unit> block) {
        pl2 pl2Var = RjL.f9562b;
        RjL.b(new Fk(block));
    }

    public final void runOnIncogniaThreadIfInitialized(String methodName, Function0<Unit> block) {
        runOnIncogniaThread(new elV(methodName, block));
    }

    public static /* synthetic */ void runOnIncogniaThreadIfInitialized$default(Incognia incognia, String str, Function0 function0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        incognia.runOnIncogniaThreadIfInitialized(str, function0);
    }

    public final void runOnMainThread(Function0<Unit> block) {
        new pl2(l4V.f10797b, true).b(new a(0, block));
    }

    public static final void sendCustomEvent(String accountId, String externalId, EventAddress address, String tag, EventProperties properties, String status) {
        INSTANCE.runAndMeasureTime("sendCustomEvent", new qR(accountId, externalId, address, tag, properties, status));
    }

    public static /* synthetic */ void sendCustomEvent$default(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            eventAddress = null;
        }
        if ((i4 & 8) != 0) {
            str3 = null;
        }
        if ((i4 & 16) != 0) {
            eventProperties = null;
        }
        if ((i4 & 32) != 0) {
            str4 = null;
        }
        sendCustomEvent(str, str2, eventAddress, str3, eventProperties, str4);
    }

    public static final void sendLoginEvent(String accountId, String externalId, EventLocation location, String status, String tag, EventProperties properties) {
        INSTANCE.runAndMeasureTime("sendLoginEvent", new YUx(accountId, externalId, location, status, tag, properties));
    }

    public static /* synthetic */ void sendLoginEvent$default(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            eventLocation = null;
        }
        if ((i4 & 8) != 0) {
            str3 = null;
        }
        if ((i4 & 16) != 0) {
            str4 = null;
        }
        if ((i4 & 32) != 0) {
            eventProperties = null;
        }
        sendLoginEvent(str, str2, eventLocation, str3, str4, eventProperties);
    }

    public static final void sendOnboardingEvent(String accountId, String externalId, EventAddress address, String tag, EventProperties properties, String status) {
        INSTANCE.runAndMeasureTime("sendOnboardingEvent", new VgX(accountId, externalId, address, tag, properties, status));
    }

    public static /* synthetic */ void sendOnboardingEvent$default(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            eventAddress = null;
        }
        if ((i4 & 8) != 0) {
            str3 = null;
        }
        if ((i4 & 16) != 0) {
            eventProperties = null;
        }
        if ((i4 & 32) != 0) {
            str4 = null;
        }
        sendOnboardingEvent(str, str2, eventAddress, str3, eventProperties, str4);
    }

    public static final void sendPaymentEvent(String accountId, String externalId, EventLocation location, List<PaymentAddress> addresses, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List<PaymentMethod> paymentMethods, String storeId, String tag, EventProperties properties, String status) {
        INSTANCE.runAndMeasureTime("sendPaymentEvent", new uY(accountId, externalId, location, paymentMethods, paymentValue, paymentCoupon, addresses, storeId, tag, properties, status));
    }

    public static /* synthetic */ void sendPaymentEvent$default(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            eventLocation = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        if ((i4 & 16) != 0) {
            paymentValue = null;
        }
        if ((i4 & 32) != 0) {
            paymentCoupon = null;
        }
        if ((i4 & 64) != 0) {
            list2 = null;
        }
        if ((i4 & 128) != 0) {
            str3 = null;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            str4 = null;
        }
        if ((i4 & 512) != 0) {
            eventProperties = null;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            str5 = null;
        }
        sendPaymentEvent(str, str2, eventLocation, list, paymentValue, paymentCoupon, list2, str3, str4, eventProperties, str5);
    }

    public static final void setAccountId(String accountId) {
        INSTANCE.runAndMeasureTime("setAccountId", new NrW(accountId));
    }

    public static final void setLocationEnabled(boolean enabled) {
        INSTANCE.runAndMeasureTime("setLocationEnabled", new MbI(enabled));
    }

    public static final void generateRequestToken(Long timeout, Callback<String> callback) {
        INSTANCE.runAndMeasureTime("generateRequestToken", new sEC(timeout, mXi.b(ASYNC_TOKEN_CLIENT_SIDE_NAME), callback));
    }

    public static final String generateRequestTokenSync(long timeout) {
        return (String) INSTANCE.runAndMeasureTime("generateRequestTokenSync", new Tt6(timeout));
    }

    public static final void generateRequestTokenWithStatus(Long timeout, Callback<RequestTokenWithStatus> callback) {
        INSTANCE.runAndMeasureTime("generateRequestTokenWithStatus", new Ncr(timeout, mXi.b(ASYNC_TOKEN_CLIENT_SIDE_NAME), callback));
    }

    public static final RequestTokenWithStatus generateRequestTokenWithStatusSync(long timeout) {
        return (RequestTokenWithStatus) INSTANCE.runAndMeasureTime("generateRequestTokenWithStatusSync", new BD1(timeout));
    }

    public static final void init(Application application, IncogniaOptions incogniaOptions) {
        INSTANCE.runAndMeasureTime("init", new CLi(application, incogniaOptions));
    }

    public static final void sendCustomEvent(CustomEvent customEvent) {
        sendCustomEvent(customEvent.getAccountId(), customEvent.getExternalId(), customEvent.getAddress(), customEvent.getTag(), customEvent.getProperties(), customEvent.getStatus());
    }

    public static final void sendLoginEvent(LoginEvent loginEvent) {
        sendLoginEvent(loginEvent.getAccountId(), loginEvent.getExternalId(), loginEvent.getLocation(), loginEvent.getStatus(), loginEvent.getTag(), loginEvent.getProperties());
    }

    public static final void sendOnboardingEvent(OnboardingEvent onboardingEvent) {
        sendOnboardingEvent(onboardingEvent.getAccountId(), onboardingEvent.getExternalId(), onboardingEvent.getAddress(), onboardingEvent.getTag(), onboardingEvent.getProperties(), onboardingEvent.getStatus());
    }

    public static final void sendPaymentEvent(PaymentEvent paymentEvent) {
        sendPaymentEvent(paymentEvent.getAccountId(), paymentEvent.getExternalId(), paymentEvent.getLocation(), paymentEvent.getAddresses(), paymentEvent.getPaymentValue(), paymentEvent.getPaymentCoupon(), paymentEvent.getPaymentMethods(), paymentEvent.getStoreId(), paymentEvent.getTag(), paymentEvent.getProperties(), paymentEvent.getStatus());
    }
}
