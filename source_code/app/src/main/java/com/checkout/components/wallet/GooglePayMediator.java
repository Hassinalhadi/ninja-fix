package com.checkout.components.wallet;

import Aa.m;
import Ac.l;
import G6.q;
import T5.o;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.model.Currency;
import com.checkout.components.wallet.data.model.RequiredPaymentInfo;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import com.checkout.components.wallet.di.DaggerGooglePayComponent;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import h9.aq;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 A2\u00020\u0001:\u0001ABg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\f2\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010!H\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u0086@¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=¨\u0006B"}, d2 = {"Lcom/checkout/components/wallet/GooglePayMediator;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", "environment", "Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;", "paymentInfo", "Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;", "googlePayFlowCoordinator", "Lkotlin/Function1;", "", "", "onError", "", "supportedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "supportedCardTypes", "Lcom/checkout/components/wallet/GooglePayMediator$Companion$TaskHandler;", "taskHandler", "<init>", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;Lcom/checkout/components/wallet/data/model/RequiredPaymentInfo;Lcom/checkout/components/wallet/wrapper/GooglePayFlowCoordinator;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lcom/checkout/components/wallet/GooglePayMediator$Companion$TaskHandler;)V", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "onComplete", "requestPayment$wallet_standardRelease", "(Lkotlin/jvm/functions/Function1;)V", "requestPayment", "formattedAmount", "Lcom/checkout/components/wallet/data/model/Currency;", "currency", "update", "(Ljava/lang/String;Lcom/checkout/components/wallet/data/model/Currency;)V", "Lah/b;", "getPaymentDataLauncher", "()Lah/b;", "payByGooglePay", "()V", "", "isGooglePayReady", "(LNd/c;)Ljava/lang/Object;", "getAllowedPaymentMethods", "()Ljava/lang/String;", "Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "repository", "Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "getRepository", "()Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "setRepository", "(Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;)V", "Lcom/checkout/components/wallet/common/GooglePayMapper;", "mapper", "Lcom/checkout/components/wallet/common/GooglePayMapper;", "getMapper", "()Lcom/checkout/components/wallet/common/GooglePayMapper;", "setMapper", "(Lcom/checkout/components/wallet/common/GooglePayMapper;)V", "Landroidx/compose/runtime/D0;", "h", "Landroidx/compose/runtime/D0;", "isGooglePayReady$wallet_standardRelease", "()Landroidx/compose/runtime/D0;", "j", "getAllowedPaymentMethods$wallet_standardRelease", "allowedPaymentMethods", "Companion", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayMediator {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name */
    private RequiredPaymentInfo f6428a;

    /* renamed from: b, reason: collision with root package name */
    private final GooglePayFlowCoordinator f6429b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f6430c;

    /* renamed from: d, reason: collision with root package name */
    private final List f6431d;
    private final List e;

    /* renamed from: f, reason: collision with root package name */
    private final Companion.TaskHandler f6432f;

    /* renamed from: g, reason: collision with root package name */
    private final ax f6433g;

    /* renamed from: h, reason: collision with root package name */
    private final ax f6434h;

    /* renamed from: i, reason: collision with root package name */
    private final ax f6435i;

    /* renamed from: j, reason: collision with root package name */
    private final ax f6436j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f6437k;
    public GooglePayMapper mapper;
    public GooglePayRepositoryImpl repository;

    public GooglePayMediator(Context context, Environment environment, RequiredPaymentInfo paymentInfo, GooglePayFlowCoordinator googlePayFlowCoordinator, Function1<? super String, Unit> onError, List<String> list, List<? extends CardTypeName> list2, Companion.TaskHandler taskHandler) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(paymentInfo, "paymentInfo");
        Intrinsics.echo(onError, "onError");
        Intrinsics.echo(taskHandler, "taskHandler");
        this.f6428a = paymentInfo;
        this.f6429b = googlePayFlowCoordinator;
        this.f6430c = onError;
        this.f6431d = list;
        this.e = list2;
        this.f6432f = taskHandler;
        ax zulu = C0564b.zulu(null);
        this.f6433g = zulu;
        this.f6434h = zulu;
        ax zulu2 = C0564b.zulu("");
        this.f6435i = zulu2;
        this.f6436j = zulu2;
        ((com.checkout.components.wallet.di.a) DaggerGooglePayComponent.create()).inject(this);
        this.f6437k = LazyKt.lazy(new l(this, context, environment, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H6.b a(GooglePayMediator googlePayMediator, Context context, Environment environment) {
        return googlePayMediator.getRepository().createPaymentsClient(context, environment);
    }

    public final String getAllowedPaymentMethods() {
        try {
            return getMapper().toAllowedPaymentMethodsJsonString(this.f6428a.getCardParameters(), this.f6428a.getPublicKey(), this.f6431d, this.e);
        } catch (Exception e) {
            this.f6430c.invoke(a(ErrorMessages.BUTTON_RENDER_FAILED, e));
            return null;
        }
    }

    public final D0 getAllowedPaymentMethods$wallet_standardRelease() {
        return this.f6436j;
    }

    public final GooglePayMapper getMapper() {
        GooglePayMapper googlePayMapper = this.mapper;
        if (googlePayMapper != null) {
            return googlePayMapper;
        }
        Intrinsics.lima("mapper");
        throw null;
    }

    public final ah.b getPaymentDataLauncher() {
        GooglePayFlowCoordinator googlePayFlowCoordinator = this.f6429b;
        if (googlePayFlowCoordinator != null) {
            return googlePayFlowCoordinator.getPaymentDataLauncher$wallet_standardRelease();
        }
        return null;
    }

    public final GooglePayRepositoryImpl getRepository() {
        GooglePayRepositoryImpl googlePayRepositoryImpl = this.repository;
        if (googlePayRepositoryImpl != null) {
            return googlePayRepositoryImpl;
        }
        Intrinsics.lima("repository");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(2:20|(1:22)(2:23|(1:25)))|12|13|14|15))|28|6|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        r8.f6430c.invoke(a(com.checkout.components.wallet.ErrorMessages.BUTTON_READY_CHECK_FAILED, r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isGooglePayReady(Nd.c<? super Boolean> cVar) {
        b bVar;
        int i4;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.f6453g;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                bVar.f6453g = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = bVar.e;
                Od.a aVar = Od.a.alpha;
                i4 = bVar.f6453g;
                boolean z2 = false;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Object value = this.f6434h.getValue();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.areEqual(value, bool)) {
                        return bool;
                    }
                    this.f6435i.setValue(getMapper().toAllowedPaymentMethodsJsonString(this.f6428a.getCardParameters(), this.f6428a.getPublicKey(), this.f6431d, this.e));
                    IsReadyToPayRequest createIsReadyToPayRequest = getRepository().createIsReadyToPayRequest(getMapper().createIsReadyToPayRequestJson(this.f6428a, this.f6431d, this.e));
                    H6.b bVar2 = (H6.b) this.f6437k.getValue();
                    bVar2.getClass();
                    o bravo = o.bravo();
                    bravo.charlie = 23705;
                    bravo.delta = new D8.c(15, createIsReadyToPayRequest);
                    q delta = bVar2.delta(0, bravo.alpha());
                    Intrinsics.delta(delta, "isReadyToPay(...)");
                    Companion.TaskHandler taskHandler = this.f6432f;
                    bVar.f6448a = null;
                    bVar.f6449b = null;
                    bVar.f6450c = null;
                    bVar.f6451d = null;
                    bVar.f6453g = 1;
                    obj = taskHandler.awaitTask$wallet_standardRelease(delta, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue = bool2.booleanValue();
                this.f6433g.setValue(bool2);
                z2 = booleanValue;
                return Boolean.valueOf(z2);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.e;
        Od.a aVar2 = Od.a.alpha;
        i4 = bVar.f6453g;
        boolean z22 = false;
        if (i4 == 0) {
        }
        Boolean bool22 = (Boolean) obj2;
        boolean booleanValue2 = bool22.booleanValue();
        this.f6433g.setValue(bool22);
        z22 = booleanValue2;
        return Boolean.valueOf(z22);
    }

    public final D0 isGooglePayReady$wallet_standardRelease() {
        return this.f6434h;
    }

    public final void payByGooglePay() {
        ah.b paymentDataLauncher = getPaymentDataLauncher();
        if (paymentDataLauncher != null) {
            requestPayment$wallet_standardRelease(new c(paymentDataLauncher));
        }
    }

    public final void requestPayment$wallet_standardRelease(Function1<? super Task, Unit> onComplete) {
        Intrinsics.echo(onComplete, "onComplete");
        try {
            PaymentDataRequest createPaymentDataRequest = getRepository().createPaymentDataRequest(getMapper().toJson(this.f6428a, this.f6431d, this.e));
            H6.b bVar = (H6.b) this.f6437k.getValue();
            bVar.getClass();
            o bravo = o.bravo();
            bravo.delta = new m(16, createPaymentDataRequest);
            bravo.echo = new Feature[]{H6.e.bravo};
            bravo.bravo = true;
            bravo.charlie = 23707;
            q delta = bVar.delta(1, bravo.alpha());
            delta.bravo(new aq(6, onComplete));
            Intrinsics.checkNotNull(delta);
        } catch (Exception e) {
            this.f6430c.invoke(a(ErrorMessages.PAYMENT_REQUEST_FAILED, e));
        }
    }

    public final void setMapper(GooglePayMapper googlePayMapper) {
        Intrinsics.echo(googlePayMapper, "<set-?>");
        this.mapper = googlePayMapper;
    }

    public final void setRepository(GooglePayRepositoryImpl googlePayRepositoryImpl) {
        Intrinsics.echo(googlePayRepositoryImpl, "<set-?>");
        this.repository = googlePayRepositoryImpl;
    }

    public final void update(String formattedAmount, Currency currency) {
        Intrinsics.echo(formattedAmount, "formattedAmount");
        Intrinsics.echo(currency, "currency");
        this.f6428a = RequiredPaymentInfo.copy$default(this.f6428a, null, new BigDecimal(formattedAmount), null, null, currency.getValue(), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Task p02) {
        Intrinsics.echo(p02, "p0");
        function1.invoke(p02);
    }

    private static String a(String str, Exception exc) {
        return AbstractC2327c.xray(str, " [", u.alpha.bravo(exc.getClass()).kilo(), Constants.AES_SUFFIX);
    }

    public /* synthetic */ GooglePayMediator(Context context, Environment environment, RequiredPaymentInfo requiredPaymentInfo, GooglePayFlowCoordinator googlePayFlowCoordinator, Function1 function1, List list, List list2, Companion.TaskHandler taskHandler, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, environment, requiredPaymentInfo, googlePayFlowCoordinator, function1, list, list2, (i4 & 128) != 0 ? new Companion.TaskHandler() : taskHandler);
    }
}
