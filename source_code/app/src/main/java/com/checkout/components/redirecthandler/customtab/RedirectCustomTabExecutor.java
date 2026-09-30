package com.checkout.components.redirecthandler.customtab;

import A2.ao;
import E2.d;
import Xd.l;
import Ya.c;
import Yb.C0312j0;
import a4.s;
import ae.AbstractC0422a;
import ae.o;
import ah.b;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import as.f;
import av.q;
import com.checkout.components.interfaces.usecase.UseCase;
import com.checkout.components.redirecthandler.Executor;
import com.checkout.components.redirecthandler.extension.ExtensionsKt;
import com.checkout.components.redirecthandler.model.RedirectRequest;
import com.checkout.components.redirecthandler.model.RedirectResult;
import com.clevertap.android.sdk.Constants;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001aj\u0002`\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00062\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001aj\u0002`\u001bH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabExecutor;", "Lcom/checkout/components/redirecthandler/Executor;", "Lcom/checkout/components/redirecthandler/model/RedirectRequest;", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/usecase/UseCase;", "", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "processResultUseCase", "Lkotlin/Function1;", "", "onRedirectDismissed", "expectedSessionId", "Las/f;", "warmupSession", "Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabEventLogger;", "eventLogger", "", "toolbarColor", "<init>", "(Landroid/content/Context;Lcom/checkout/components/interfaces/usecase/UseCase;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Las/f;Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabEventLogger;I)V", "request", "execute", "(Lcom/checkout/components/redirecthandler/model/RedirectRequest;)V", "Landroidx/activity/result/ActivityResult;", "result", "Lkotlin/Function2;", "Lcom/checkout/components/redirecthandler/model/RedirectResultHandler;", "resultHandler", "handleAuthTabResult$redirect_handler_standardRelease", "(Landroidx/activity/result/ActivityResult;LXd/l;)V", "handleAuthTabResult", Constants.KEY_URL, "handleResult$redirect_handler_standardRelease", "(Ljava/lang/String;LXd/l;)V", "handleResult", "Factory", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectCustomTabExecutor implements Executor<RedirectRequest> {

    @Deprecated
    @NotNull
    public static final String AUTH_TAB_REGISTRY_KEY_PREFIX = "cko_auth_tab_redirect_";

    @Deprecated
    @NotNull
    public static final String QUERY_PARAM_SESSION_ID = "cko-payment-session-id";

    /* renamed from: a */
    private final Context f5681a;

    /* renamed from: b */
    private final UseCase f5682b;

    /* renamed from: c */
    private final Function1 f5683c;

    /* renamed from: d */
    private final String f5684d;
    private final f e;

    /* renamed from: f */
    private final RedirectCustomTabEventLogger f5685f;

    /* renamed from: g */
    private final int f5686g;

    /* renamed from: h */
    private final String f5687h;

    /* renamed from: i */
    private CustomTabCancellationObserver f5688i;

    /* renamed from: j */
    private b f5689j;

    /* renamed from: k */
    private AuthTabReRegistrationObserver f5690k;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabExecutor$Factory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/usecase/UseCase;", "", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "processResultUseCase", "Lkotlin/Function1;", "", "onRedirectDismissed", "expectedSessionId", "Las/f;", "warmupSession", "Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabEventLogger;", "eventLogger", "", "toolbarColor", "Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabExecutor;", "create", "(Landroid/content/Context;Lcom/checkout/components/interfaces/usecase/UseCase;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Las/f;Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabEventLogger;I)Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabExecutor;", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Factory {
        public static /* synthetic */ RedirectCustomTabExecutor create$default(Factory factory, Context context, UseCase useCase, Function1 function1, String str, f fVar, RedirectCustomTabEventLogger redirectCustomTabEventLogger, int i4, int i5, Object obj) {
            int i10;
            if ((i5 & 16) != 0) {
                fVar = null;
            }
            f fVar2 = fVar;
            if ((i5 & 64) != 0) {
                i10 = -1;
            } else {
                i10 = i4;
            }
            return factory.create(context, useCase, function1, str, fVar2, redirectCustomTabEventLogger, i10);
        }

        @NotNull
        public final RedirectCustomTabExecutor create(@NotNull Context context, @NotNull UseCase<String, RedirectResult> processResultUseCase, @NotNull Function1<? super String, Unit> onRedirectDismissed, @NotNull String expectedSessionId, @Nullable f warmupSession, @NotNull RedirectCustomTabEventLogger eventLogger, int toolbarColor) {
            Intrinsics.echo(context, "context");
            Intrinsics.echo(processResultUseCase, "processResultUseCase");
            Intrinsics.echo(onRedirectDismissed, "onRedirectDismissed");
            Intrinsics.echo(expectedSessionId, "expectedSessionId");
            Intrinsics.echo(eventLogger, "eventLogger");
            return new RedirectCustomTabExecutor(context, processResultUseCase, onRedirectDismissed, expectedSessionId, warmupSession, eventLogger, toolbarColor);
        }
    }

    public RedirectCustomTabExecutor(@NotNull Context context, @NotNull UseCase<String, RedirectResult> processResultUseCase, @NotNull Function1<? super String, Unit> onRedirectDismissed, @NotNull String expectedSessionId, @Nullable f fVar, @NotNull RedirectCustomTabEventLogger eventLogger, int i4) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(processResultUseCase, "processResultUseCase");
        Intrinsics.echo(onRedirectDismissed, "onRedirectDismissed");
        Intrinsics.echo(expectedSessionId, "expectedSessionId");
        Intrinsics.echo(eventLogger, "eventLogger");
        this.f5681a = context;
        this.f5682b = processResultUseCase;
        this.f5683c = onRedirectDismissed;
        this.f5684d = expectedSessionId;
        this.e = fVar;
        this.f5685f = eventLogger;
        this.f5686g = i4;
        this.f5687h = RedirectConfig.INSTANCE.buildRedirectUrl$redirect_handler_standardRelease(context);
    }

    private final void a(o oVar, RedirectRequest redirectRequest) {
        this.f5685f.setPresentation(RedirectCustomTabEventLogger.PRESENTATION_AUTH_TAB);
        a(oVar, redirectRequest.getResultHandler());
        AuthTabReRegistrationObserver authTabReRegistrationObserver = this.f5690k;
        if (authTabReRegistrationObserver != null) {
            authTabReRegistrationObserver.unregister();
        }
        Application application = oVar.getApplication();
        Intrinsics.delta(application, "getApplication(...)");
        this.f5690k = new AuthTabReRegistrationObserver(application, oVar.getClass(), new a(this, redirectRequest, 0));
        int i4 = this.f5686g | ShapeBuilder.DEFAULT_SHAPE_COLOR;
        Intent intent = new Intent("android.intent.action.VIEW");
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", i4);
        intent.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtras(new Bundle());
        intent.putExtras(bundle);
        b bVar = this.f5689j;
        if (bVar != null) {
            intent.setData(Uri.parse(redirectRequest.getRedirectUrl()));
            intent.putExtra("androidx.browser.auth.extra.REDIRECT_SCHEME", RedirectConfig.SCHEME);
            bVar.alpha(intent);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ Unit charlie(RedirectCustomTabExecutor redirectCustomTabExecutor, String str) {
        return a(redirectCustomTabExecutor, str);
    }

    public final void handleAuthTabResult$redirect_handler_standardRelease(@NotNull ActivityResult result, @NotNull l resultHandler) {
        Uri uri;
        Intrinsics.echo(result, "result");
        Intrinsics.echo(resultHandler, "resultHandler");
        Intent intent = result.purple;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        int i4 = result.alpha;
        if (i4 == -1 && uri != null) {
            String uri2 = uri.toString();
            Intrinsics.delta(uri2, "toString(...)");
            handleResult$redirect_handler_standardRelease(uri2, resultHandler);
        } else if (i4 == 0) {
            this.f5683c.invoke(this.f5685f.buildAuthFailedStack("dismissed", RedirectCustomTabEventLogger.DISMISS_REASON_USER_CANCELLED));
        } else {
            this.f5683c.invoke(this.f5685f.buildAuthFailedStack(RedirectCustomTabEventLogger.RESULT_ERROR, null));
        }
    }

    public final void handleResult$redirect_handler_standardRelease(@NotNull String r62, @NotNull l resultHandler) {
        Object m206constructorimpl;
        Object obj;
        Intrinsics.echo(r62, "url");
        Intrinsics.echo(resultHandler, "resultHandler");
        boolean z2 = false;
        if (!r.quebec(r62, this.f5687h, false)) {
            this.f5685f.onUnexpectedRedirect(r62);
            this.f5683c.invoke(this.f5685f.buildAuthFailedStack(RedirectCustomTabEventLogger.RESULT_UNEXPECTED_REDIRECT, null));
            RedirectContract.INSTANCE.clear();
            return;
        }
        RedirectResult redirectResult = (RedirectResult) this.f5682b.execute(r62);
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Uri.parse(r62).getQueryParameter(QUERY_PARAM_SESSION_ID));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof k) {
            m206constructorimpl = null;
        }
        String str = (String) m206constructorimpl;
        if (str != null) {
            z2 = Intrinsics.areEqual(str, this.f5684d);
        }
        if (!z2) {
            this.f5685f.onSessionIdMismatch(r62, redirectResult);
            this.f5683c.invoke(this.f5685f.buildAuthFailedStack(RedirectCustomTabEventLogger.RESULT_REJECTED, RedirectCustomTabEventLogger.DISMISS_REASON_SESSION_MISMATCH));
            RedirectContract.INSTANCE.clear();
            return;
        }
        if (redirectResult != null) {
            if (redirectResult instanceof RedirectResult.Failure) {
                obj = this.f5685f.buildAuthFailedStack("failure", null);
            } else {
                obj = "";
            }
            resultHandler.invoke(redirectResult, obj);
        } else {
            this.f5683c.invoke(this.f5685f.buildAuthFailedStack(RedirectCustomTabEventLogger.RESULT_UNRECOGNIZED_REDIRECT, null));
        }
        RedirectContract.INSTANCE.clear();
    }

    @Override // com.checkout.components.redirecthandler.Executor
    public final void execute(@NotNull RedirectRequest request) {
        Intrinsics.echo(request, "request");
        this.f5685f.onRedirectStarted(request.getRedirectUrl(), this.e != null);
        Activity findActivity = ExtensionsKt.findActivity(this.f5681a);
        if (findActivity == null) {
            this.f5683c.invoke(this.f5685f.buildAuthFailedStack(RedirectCustomTabEventLogger.RESULT_ERROR, RedirectCustomTabEventLogger.DISMISS_REASON_NO_ACTIVITY));
            return;
        }
        o oVar = findActivity instanceof o ? (o) findActivity : null;
        if (oVar != null && ExtensionsKt.isAuthTabSupported(this.f5681a)) {
            a(oVar, request);
        } else {
            a(findActivity, request);
        }
    }

    public /* synthetic */ RedirectCustomTabExecutor(Context context, UseCase useCase, Function1 function1, String str, f fVar, RedirectCustomTabEventLogger redirectCustomTabEventLogger, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, useCase, function1, str, (i5 & 16) != 0 ? null : fVar, redirectCustomTabEventLogger, (i5 & 64) != 0 ? -1 : i4);
    }

    public static final Unit a(RedirectCustomTabExecutor redirectCustomTabExecutor, RedirectRequest redirectRequest, o recreatedActivity) {
        Intrinsics.echo(recreatedActivity, "recreatedActivity");
        redirectCustomTabExecutor.a(recreatedActivity, redirectRequest.getResultHandler());
        return Unit.INSTANCE;
    }

    private final void a(o oVar, l lVar) {
        b bVar = this.f5689j;
        if (bVar != null) {
            bVar.bravo();
        }
        this.f5689j = oVar.getActivityResultRegistry().charlie(a(), new s(5), new ao(24, this, lVar));
    }

    public static final void a(RedirectCustomTabExecutor redirectCustomTabExecutor, l lVar, ActivityResult result) {
        Intrinsics.echo(result, "result");
        b bVar = redirectCustomTabExecutor.f5689j;
        if (bVar != null) {
            bVar.bravo();
        }
        redirectCustomTabExecutor.f5689j = null;
        AuthTabReRegistrationObserver authTabReRegistrationObserver = redirectCustomTabExecutor.f5690k;
        if (authTabReRegistrationObserver != null) {
            authTabReRegistrationObserver.unregister();
        }
        redirectCustomTabExecutor.f5690k = null;
        redirectCustomTabExecutor.handleAuthTabResult$redirect_handler_standardRelease(result, lVar);
    }

    private final void a(Activity activity, RedirectRequest redirectRequest) {
        ActivityOptions activityOptions;
        this.f5685f.setPresentation(RedirectCustomTabEventLogger.PRESENTATION_CUSTOM_TAB);
        CustomTabCancellationObserver customTabCancellationObserver = this.f5688i;
        if (customTabCancellationObserver != null) {
            customTabCancellationObserver.unregister();
        }
        RedirectContract redirectContract = RedirectContract.INSTANCE;
        redirectContract.setResultHandler(activity, new a(this, redirectRequest, 1));
        redirectContract.setDroppedRedirectListener(new c(22, this));
        this.f5688i = new CustomTabCancellationObserver(activity, new C0312j0(16, this));
        int i4 = this.f5686g | ShapeBuilder.DEFAULT_SHAPE_COLOR;
        f fVar = this.e;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (fVar != null) {
            intent.setPackage(fVar.charlie.getPackageName());
            as.a aVar = fVar.bravo;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", aVar);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", i4);
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", true);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 2);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            String bravo = d.bravo();
            if (!TextUtils.isEmpty(bravo)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey(zendesk.core.Constants.ACCEPT_LANGUAGE)) {
                    bundleExtra.putString(zendesk.core.Constants.ACCEPT_LANGUAGE, bravo);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i5 >= 34) {
            activityOptions = ActivityOptions.makeBasic();
            AbstractC0422a.papa(activityOptions);
        } else {
            activityOptions = null;
        }
        if (i5 >= 36) {
            if (activityOptions == null) {
                activityOptions = ActivityOptions.makeBasic();
            }
            as.c.echo(activityOptions, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        Bundle bundle4 = activityOptions != null ? activityOptions.toBundle() : null;
        intent.setData(Uri.parse(redirectRequest.getRedirectUrl()));
        activity.startActivity(intent, bundle4);
    }

    public static final Unit a(RedirectCustomTabExecutor redirectCustomTabExecutor, RedirectRequest redirectRequest, String url) {
        Intrinsics.echo(url, "url");
        CustomTabCancellationObserver customTabCancellationObserver = redirectCustomTabExecutor.f5688i;
        if (customTabCancellationObserver != null) {
            customTabCancellationObserver.unregister();
        }
        redirectCustomTabExecutor.f5688i = null;
        redirectCustomTabExecutor.handleResult$redirect_handler_standardRelease(url, redirectRequest.getResultHandler());
        return Unit.INSTANCE;
    }

    public static final Unit a(RedirectCustomTabExecutor redirectCustomTabExecutor, String reason) {
        Intrinsics.echo(reason, "reason");
        redirectCustomTabExecutor.f5685f.onRedirectDropped(reason);
        CustomTabCancellationObserver customTabCancellationObserver = redirectCustomTabExecutor.f5688i;
        if (customTabCancellationObserver != null) {
            customTabCancellationObserver.unregister();
        }
        redirectCustomTabExecutor.f5688i = null;
        redirectCustomTabExecutor.f5683c.invoke(redirectCustomTabExecutor.f5685f.buildAuthFailedStack("dismissed", RedirectCustomTabEventLogger.DISMISS_REASON_REDIRECT_DROPPED));
        RedirectContract.INSTANCE.clear();
        return Unit.INSTANCE;
    }

    public static final Unit a(RedirectCustomTabExecutor redirectCustomTabExecutor) {
        redirectCustomTabExecutor.f5683c.invoke(redirectCustomTabExecutor.f5685f.buildAuthFailedStack("dismissed", RedirectCustomTabEventLogger.DISMISS_REASON_USER_CANCELLED));
        RedirectContract.INSTANCE.clear();
        return Unit.INSTANCE;
    }

    private final String a() {
        return q.echo(AUTH_TAB_REGISTRY_KEY_PREFIX, this.f5684d);
    }
}
