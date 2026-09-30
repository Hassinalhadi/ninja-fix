package com.checkout.components.redirecthandler;

import Vc.i;
import Xd.l;
import ae.o;
import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.P0;
import as.f;
import av.q;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.error.CheckoutErrorCode;
import com.checkout.components.interfaces.error.ErrorExtensionsKt;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.insight.ProductEventName;
import com.checkout.components.interfaces.insight.ProductEventProperties;
import com.checkout.components.redirecthandler.RedirectOutcome;
import com.checkout.components.redirecthandler.RedirectWebViewExecutor;
import com.checkout.components.redirecthandler.customtab.CustomTabWarmupManager;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabExecutor;
import com.checkout.components.redirecthandler.extension.ExtensionsKt;
import com.checkout.components.redirecthandler.model.RedirectRequest;
import com.checkout.components.redirecthandler.usecase.ProcessRedirectResultUseCase;
import com.checkout.components.redirecthandler.webview.RedirectWebViewEventLogger;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u000223Bu\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010%\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010-\u001a\u00020*2\u0006\u0010$\u001a\u00020\u001cH\u0001¢\u0006\u0004\b+\u0010,J\u0017\u00101\u001a\u00020.2\u0006\u0010$\u001a\u00020\u001cH\u0001¢\u0006\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectDelegate;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lkotlin/Function1;", "Lcom/checkout/components/redirecthandler/RedirectOutcome;", "", "onRedirectCompleted", "Lcom/checkout/components/redirecthandler/usecase/ProcessRedirectResultUseCase;", "processResultUseCase", "Lcom/checkout/components/redirecthandler/RedirectUtils;", "utils", "Lcom/checkout/components/redirecthandler/RedirectWebViewExecutor$Factory;", "webViewExecutorFactory", "Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabExecutor$Factory;", "customTabExecutorFactory", "Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;", "warmupManager", "", "toolbarColor", "", "isCustomTabEnabledForSession", "<init>", "(Landroid/content/Context;Lcom/checkout/components/interfaces/insight/Logger;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/redirecthandler/usecase/ProcessRedirectResultUseCase;Lcom/checkout/components/redirecthandler/RedirectUtils;Lcom/checkout/components/redirecthandler/RedirectWebViewExecutor$Factory;Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabExecutor$Factory;Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;IZ)V", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "component", "", "redirectUrl", Fixtures.PAYMENT_ID, "paymentSessionId", "Lcom/checkout/components/interfaces/insight/LogDetails;", "logDetails", "Lcom/checkout/components/interfaces/component/ComponentCallback;", "componentCallback", "actionType", "triggerRedirect", "(Lcom/checkout/components/interfaces/api/PaymentMethodComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/interfaces/insight/LogDetails;Lcom/checkout/components/interfaces/component/ComponentCallback;Ljava/lang/String;)V", "presentationPrefixFor$redirect_handler_standardRelease", "(Ljava/lang/String;)Ljava/lang/String;", "presentationPrefixFor", "Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "errorCodeFor$redirect_handler_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/error/CheckoutErrorCode;", "errorCodeFor", "Lcom/checkout/components/redirecthandler/RedirectDelegate$Messages;", "messagesFor$redirect_handler_standardRelease", "(Ljava/lang/String;)Lcom/checkout/components/redirecthandler/RedirectDelegate$Messages;", "messagesFor", "Messages", "Factory", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectDelegate {

    @Deprecated
    @NotNull
    public static final String COMPONENT_NAME_TAMARA = "tamara";

    @Deprecated
    @NotNull
    public static final String CONTEXT_USER_CANCELLED = "context=user_cancelled";

    @Deprecated
    @NotNull
    public static final String WIRE_VALUE_THREE_DS = "3ds";

    /* renamed from: k */
    private static final Messages f5639k = new Messages(CommonErrorMessages.ERROR_MESSAGE_AUTHENTICATION_CANCELLED, CommonErrorMessages.ERROR_MESSAGE_AUTHENTICATION_DISMISSED, CommonErrorMessages.ERROR_MESSAGE_NO_ACTIVITY_CONTEXT);

    /* renamed from: l */
    private static final Messages f5640l = new Messages("User cancelled the redirect flow.", "Redirect flow was dismissed before completion.", "Redirect requires an Activity Context — wrap your call in an Activity-scoped context.");

    /* renamed from: a */
    private final Context f5641a;

    /* renamed from: b */
    private final Logger f5642b;

    /* renamed from: c */
    private final Function1 f5643c;

    /* renamed from: d */
    private final ProcessRedirectResultUseCase f5644d;
    private final RedirectUtils e;

    /* renamed from: f */
    private final RedirectWebViewExecutor.Factory f5645f;

    /* renamed from: g */
    private final RedirectCustomTabExecutor.Factory f5646g;

    /* renamed from: h */
    private final CustomTabWarmupManager f5647h;

    /* renamed from: i */
    private final int f5648i;

    /* renamed from: j */
    private final boolean f5649j;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lkotlin/Function1;", "Lcom/checkout/components/redirecthandler/RedirectOutcome;", "", "onRedirectCompleted", "Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;", "warmupManager", "", "toolbarColor", "", "isCustomTabEnabledForSession", "Lcom/checkout/components/redirecthandler/RedirectDelegate;", "create", "(Landroid/content/Context;Lcom/checkout/components/interfaces/insight/Logger;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/redirecthandler/customtab/CustomTabWarmupManager;IZ)Lcom/checkout/components/redirecthandler/RedirectDelegate;", "Companion", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a */
        private static final Lazy f5650a = LazyKt.lazy(new i(14));

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory$Companion;", "", "Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory;", "INSTANCE$delegate", "Lkotlin/Lazy;", "getINSTANCE", "()Lcom/checkout/components/redirecthandler/RedirectDelegate$Factory;", "INSTANCE", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            @NotNull
            public final Factory getINSTANCE() {
                return (Factory) Factory.f5650a.getValue();
            }
        }

        public static final Factory a() {
            return new Factory();
        }

        public static /* synthetic */ RedirectDelegate create$default(Factory factory, Context context, Logger logger, Function1 function1, CustomTabWarmupManager customTabWarmupManager, int i4, boolean z2, int i5, Object obj) {
            if ((i5 & 8) != 0) {
                customTabWarmupManager = null;
            }
            CustomTabWarmupManager customTabWarmupManager2 = customTabWarmupManager;
            if ((i5 & 16) != 0) {
                i4 = -1;
            }
            int i10 = i4;
            if ((i5 & 32) != 0) {
                z2 = true;
            }
            return factory.create(context, logger, function1, customTabWarmupManager2, i10, z2);
        }

        @NotNull
        public final RedirectDelegate create(@NotNull Context context, @NotNull Logger logger, @NotNull Function1<? super RedirectOutcome, Unit> onRedirectCompleted, @Nullable CustomTabWarmupManager warmupManager, int toolbarColor, boolean isCustomTabEnabledForSession) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(logger, "logger");
            Intrinsics.echo(onRedirectCompleted, "onRedirectCompleted");
            return new RedirectDelegate(context, logger, onRedirectCompleted, null, null, null, null, warmupManager, toolbarColor, isCustomTabEnabledForSession, 120, null);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/redirecthandler/RedirectDelegate$Messages;", "", "", "cancelled", "dismissed", "noActivityContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/redirecthandler/RedirectDelegate$Messages;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCancelled", "b", "getDismissed", "c", "getNoActivityContext", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Messages {

        /* renamed from: a, reason: from kotlin metadata */
        private final String cancelled;

        /* renamed from: b, reason: from kotlin metadata */
        private final String dismissed;

        /* renamed from: c, reason: from kotlin metadata */
        private final String noActivityContext;

        public Messages(@NotNull String cancelled, @NotNull String dismissed, @NotNull String noActivityContext) {
            Intrinsics.echo(cancelled, "cancelled");
            Intrinsics.echo(dismissed, "dismissed");
            Intrinsics.echo(noActivityContext, "noActivityContext");
            this.cancelled = cancelled;
            this.dismissed = dismissed;
            this.noActivityContext = noActivityContext;
        }

        public static /* synthetic */ Messages copy$default(Messages messages, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = messages.cancelled;
            }
            if ((i4 & 2) != 0) {
                str2 = messages.dismissed;
            }
            if ((i4 & 4) != 0) {
                str3 = messages.noActivityContext;
            }
            return messages.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCancelled() {
            return this.cancelled;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDismissed() {
            return this.dismissed;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getNoActivityContext() {
            return this.noActivityContext;
        }

        @NotNull
        public final Messages copy(@NotNull String cancelled, @NotNull String dismissed, @NotNull String noActivityContext) {
            Intrinsics.echo(cancelled, "cancelled");
            Intrinsics.echo(dismissed, "dismissed");
            Intrinsics.echo(noActivityContext, "noActivityContext");
            return new Messages(cancelled, dismissed, noActivityContext);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) other;
            return Intrinsics.areEqual(this.cancelled, messages.cancelled) && Intrinsics.areEqual(this.dismissed, messages.dismissed) && Intrinsics.areEqual(this.noActivityContext, messages.noActivityContext);
        }

        @NotNull
        public final String getCancelled() {
            return this.cancelled;
        }

        @NotNull
        public final String getDismissed() {
            return this.dismissed;
        }

        @NotNull
        public final String getNoActivityContext() {
            return this.noActivityContext;
        }

        public final int hashCode() {
            return this.noActivityContext.hashCode() + AbstractC2327c.sierra(this.cancelled.hashCode() * 31, 31, this.dismissed);
        }

        @NotNull
        public final String toString() {
            String str = this.cancelled;
            String str2 = this.dismissed;
            return P0.gold(q.india("Messages(cancelled=", str, ", dismissed=", str2, ", noActivityContext="), this.noActivityContext, ")");
        }
    }

    public RedirectDelegate(@NotNull Context context, @NotNull Logger logger, @NotNull Function1<? super RedirectOutcome, Unit> onRedirectCompleted, @NotNull ProcessRedirectResultUseCase processResultUseCase, @NotNull RedirectUtils utils, @NotNull RedirectWebViewExecutor.Factory webViewExecutorFactory, @NotNull RedirectCustomTabExecutor.Factory customTabExecutorFactory, @Nullable CustomTabWarmupManager customTabWarmupManager, int i4, boolean z2) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(onRedirectCompleted, "onRedirectCompleted");
        Intrinsics.echo(processResultUseCase, "processResultUseCase");
        Intrinsics.echo(utils, "utils");
        Intrinsics.echo(webViewExecutorFactory, "webViewExecutorFactory");
        Intrinsics.echo(customTabExecutorFactory, "customTabExecutorFactory");
        this.f5641a = context;
        this.f5642b = logger;
        this.f5643c = onRedirectCompleted;
        this.f5644d = processResultUseCase;
        this.e = utils;
        this.f5645f = webViewExecutorFactory;
        this.f5646g = customTabExecutorFactory;
        this.f5647h = customTabWarmupManager;
        this.f5648i = i4;
        this.f5649j = z2;
    }

    public static final Unit a(RedirectDelegate redirectDelegate, PaymentMethodComponent paymentMethodComponent, String str, LogDetails logDetails, ComponentCallback componentCallback, String actionType, String errorStack) {
        String dismissed;
        Intrinsics.echo(errorStack, "errorStack");
        redirectDelegate.f5642b.sendProductEvent(ProductEventName.PaymentActionCompleted, new ProductEventProperties(paymentMethodComponent.getName().getValue(), paymentMethodComponent.getName().getValue(), actionType, null, str, RedirectEventValues.RESULT_ABANDONED, null, 72, null));
        Messages messagesFor$redirect_handler_standardRelease = redirectDelegate.messagesFor$redirect_handler_standardRelease(actionType);
        if (StringsKt.beige(errorStack, CONTEXT_USER_CANCELLED, false)) {
            dismissed = messagesFor$redirect_handler_standardRelease.getCancelled();
        } else {
            dismissed = messagesFor$redirect_handler_standardRelease.getDismissed();
        }
        Intrinsics.echo(actionType, "actionType");
        CheckoutError.PaymentMethod paymentMethod = new CheckoutError.PaymentMethod(dismissed, Intrinsics.areEqual(actionType, WIRE_VALUE_THREE_DS) ? CheckoutErrorCode.CARD_AUTHENTICATION_FAILED : CheckoutErrorCode.REDIRECT_FAILED, ErrorExtensionsKt.toPaymentMethodErrorDetails(logDetails));
        N4.a.alpha(redirectDelegate.f5642b, paymentMethod, errorStack, false, 4, null);
        l onError = componentCallback.getOnError();
        if (onError != null) {
            onError.invoke(paymentMethodComponent, paymentMethod);
        }
        redirectDelegate.f5643c.invoke(RedirectOutcome.Cancelled.INSTANCE);
        return Unit.INSTANCE;
    }

    @NotNull
    public final CheckoutErrorCode errorCodeFor$redirect_handler_standardRelease(@NotNull String actionType) {
        Intrinsics.echo(actionType, "actionType");
        if (Intrinsics.areEqual(actionType, WIRE_VALUE_THREE_DS)) {
            return CheckoutErrorCode.CARD_AUTHENTICATION_FAILED;
        }
        return CheckoutErrorCode.REDIRECT_FAILED;
    }

    @NotNull
    public final Messages messagesFor$redirect_handler_standardRelease(@NotNull String actionType) {
        Intrinsics.echo(actionType, "actionType");
        if (Intrinsics.areEqual(actionType, WIRE_VALUE_THREE_DS)) {
            return f5639k;
        }
        return f5640l;
    }

    @NotNull
    public final String presentationPrefixFor$redirect_handler_standardRelease(@NotNull String actionType) {
        Intrinsics.echo(actionType, "actionType");
        if (Intrinsics.areEqual(actionType, WIRE_VALUE_THREE_DS)) {
            return "THREEDS";
        }
        String upperCase = actionType.toUpperCase(Locale.ROOT);
        Intrinsics.delta(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public final void triggerRedirect(@NotNull PaymentMethodComponent component, @NotNull String redirectUrl, @NotNull String r23, @NotNull String paymentSessionId, @NotNull LogDetails logDetails, @NotNull ComponentCallback componentCallback, @NotNull String actionType) {
        String str;
        Executor create;
        f fVar;
        Messages messages;
        Intrinsics.echo(component, "component");
        Intrinsics.echo(redirectUrl, "redirectUrl");
        Intrinsics.echo(r23, "paymentId");
        Intrinsics.echo(paymentSessionId, "paymentSessionId");
        Intrinsics.echo(logDetails, "logDetails");
        Intrinsics.echo(componentCallback, "componentCallback");
        Intrinsics.echo(actionType, "actionType");
        CustomTabWarmupManager customTabWarmupManager = this.f5647h;
        if (customTabWarmupManager != null) {
            customTabWarmupManager.mayLaunchUrl(redirectUrl);
        }
        Activity findActivity = ExtensionsKt.findActivity(this.f5641a);
        if (findActivity == null) {
            CheckoutErrorCode errorCodeFor$redirect_handler_standardRelease = errorCodeFor$redirect_handler_standardRelease(actionType);
            if (Intrinsics.areEqual(actionType, WIRE_VALUE_THREE_DS)) {
                messages = f5639k;
            } else {
                messages = f5640l;
            }
            CheckoutError.PaymentMethod paymentMethod = new CheckoutError.PaymentMethod(messages.getNoActivityContext(), errorCodeFor$redirect_handler_standardRelease, ErrorExtensionsKt.toPaymentMethodErrorDetails(logDetails));
            N4.a.alpha(this.f5642b, paymentMethod, a(actionType), false, 4, null);
            l onError = componentCallback.getOnError();
            if (onError != null) {
                onError.invoke(component, paymentMethod);
            }
            this.f5643c.invoke(RedirectOutcome.Cancelled.INSTANCE);
            return;
        }
        String value = component.getName().getValue();
        if ((Intrinsics.areEqual(value, COMPONENT_NAME_TAMARA) && (!(findActivity instanceof o) || !ExtensionsKt.isAuthTabSupported(this.f5641a))) || !ExtensionsKt.isCustomTabAvailable(this.f5641a) || (Intrinsics.areEqual(actionType, WIRE_VALUE_THREE_DS) && !this.f5649j)) {
            str = RedirectEventValues.RENDERER_WEB_VIEW;
        } else {
            str = RedirectEventValues.RENDERER_CUSTOM_TABS;
        }
        this.f5642b.sendProductEvent(ProductEventName.PaymentActionInitialised, new ProductEventProperties(value, value, actionType, str, r23, null, null, 96, null));
        RedirectRequest buildRedirectRequest$redirect_handler_standardRelease = this.e.buildRedirectRequest$redirect_handler_standardRelease(component, r23, redirectUrl, this.f5642b, logDetails, componentCallback, this.f5643c, actionType);
        Y4.a aVar = new Y4.a(this, component, r23, logDetails, componentCallback, actionType);
        String presentationPrefixFor$redirect_handler_standardRelease = presentationPrefixFor$redirect_handler_standardRelease(actionType);
        if (Intrinsics.areEqual(str, RedirectEventValues.RENDERER_CUSTOM_TABS)) {
            RedirectCustomTabExecutor.Factory factory = this.f5646g;
            ProcessRedirectResultUseCase processRedirectResultUseCase = this.f5644d;
            CustomTabWarmupManager customTabWarmupManager2 = this.f5647h;
            if (customTabWarmupManager2 != null) {
                fVar = customTabWarmupManager2.getSession();
            } else {
                fVar = null;
            }
            create = factory.create(findActivity, processRedirectResultUseCase, aVar, paymentSessionId, fVar, new RedirectCustomTabEventLogger(this.f5642b, presentationPrefixFor$redirect_handler_standardRelease), this.f5648i);
        } else {
            create = this.f5645f.create(findActivity, this.f5644d, aVar, new RedirectWebViewEventLogger(this.f5642b, presentationPrefixFor$redirect_handler_standardRelease));
        }
        create.execute(buildRedirectRequest$redirect_handler_standardRelease);
    }

    public /* synthetic */ RedirectDelegate(Context context, Logger logger, Function1 function1, ProcessRedirectResultUseCase processRedirectResultUseCase, RedirectUtils redirectUtils, RedirectWebViewExecutor.Factory factory, RedirectCustomTabExecutor.Factory factory2, CustomTabWarmupManager customTabWarmupManager, int i4, boolean z2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, logger, function1, (i5 & 8) != 0 ? new ProcessRedirectResultUseCase(logger) : processRedirectResultUseCase, (i5 & 16) != 0 ? new RedirectUtils() : redirectUtils, (i5 & 32) != 0 ? new RedirectWebViewExecutor.Factory() : factory, (i5 & 64) != 0 ? new RedirectCustomTabExecutor.Factory() : factory2, (i5 & 128) != 0 ? null : customTabWarmupManager, (i5 & Barcode.FORMAT_QR_CODE) != 0 ? -1 : i4, (i5 & 512) != 0 ? true : z2);
    }

    private static String a(String str) {
        return P0.crimson(str, "|result=error|reason=no_activity_context|hint=Context must resolve to an Activity");
    }
}
