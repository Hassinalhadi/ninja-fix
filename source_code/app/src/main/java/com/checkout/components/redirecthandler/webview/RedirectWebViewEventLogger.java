package com.checkout.components.redirecthandler.webview;

import android.os.SystemClock;
import androidx.appcompat.widget.P0;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.redirecthandler.c;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import java.net.URI;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u0000 '2\u00020\u0001:\u0004()*'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0014J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;", "", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "", "presentationPrefix", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;Ljava/lang/String;)V", "redirectUrl", "", "onRedirectStarted", "(Ljava/lang/String;)V", "onPageLoadStarted", "()V", "onPageLoadFinished", Constants.KEY_URL, "", "errorCode", "description", "onPageLoadError", "(Ljava/lang/String;ILjava/lang/String;)V", "statusCode", "reason", "onHttpError", "primaryError", "onSslError", "(Ljava/lang/String;I)V", "", "didCrash", "onRendererGone", "(Z)V", Constants.KEY_MESSAGE, "lineNumber", "sourceId", "onJsError", "result", "dismissReason", "buildAuthFailedStack", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Companion", "ErrorType", "com/checkout/components/redirecthandler/webview/a", "com/checkout/components/redirecthandler/c", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectWebViewEventLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_PRESENTATION_PREFIX = "REDIRECT";

    @NotNull
    public static final String DISMISS_REASON_RENDERER_GONE = "renderer_gone";

    @NotNull
    public static final String DISMISS_REASON_USER_BACK_PRESS = "user_back_press";

    @NotNull
    public static final String RESULT_DISMISSED = "dismissed";

    @NotNull
    public static final String RESULT_FAILURE = "failure";

    /* renamed from: a, reason: collision with root package name */
    private final Logger f5699a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5700b;

    /* renamed from: c, reason: collision with root package name */
    private long f5701c;

    /* renamed from: d, reason: collision with root package name */
    private String f5702d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private long f5703f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5704g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5705h;

    /* renamed from: i, reason: collision with root package name */
    private a f5706i;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\rR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\rR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\rR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\rR\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\rR\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\rR\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\rR\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\rR\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\rR\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\rR\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\rR\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\rR\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\rR\u0014\u00100\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\rR\u0014\u00101\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\rR\u0014\u00102\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\rR\u0014\u00103\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\rR\u0014\u00104\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\r¨\u00065"}, d2 = {"Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger$Companion;", "", "", Constants.KEY_URL, "extractDomain", "(Ljava/lang/String;)Ljava/lang/String;", "", "NO_TIMESTAMP", "J", "", "NO_ERROR_CODE", "I", "UNKNOWN_DOMAIN", "Ljava/lang/String;", "DELIMITER", "PRESENTATION", "DEFAULT_PRESENTATION_PREFIX", "MESSAGE_WEBVIEW_ERROR", "SSL_ERROR_DESCRIPTION", "EVENT_RENDERER_GONE", "NAME_RENDERER_GONE", "EVENT_JS_ERROR", "NAME_JS_ERROR", "DISMISS_REASON_USER_BACK_PRESS", "DISMISS_REASON_RENDERER_GONE", "RESULT_DISMISSED", "RESULT_FAILURE", "IMMEDIATE_DISMISS_THRESHOLD_MS", "CONTEXT_RENDERER_CRASHED", "CONTEXT_PAGE_NEVER_LOADED", "CONTEXT_DISMISSED_IMMEDIATELY", "CONTEXT_USER_CANCELLED", "CONTEXT_WEBVIEW_ERROR", "CONTEXT_AUTHENTICATION_FAILED", "CONTEXT_LIKELY_SERVER_TIMEOUT", "KEY_TYPE", "KEY_ERROR_CODE", "KEY_DESCRIPTION", "KEY_REDIRECT_STARTED_AT", "KEY_TIME_SINCE_REDIRECT_STARTED_MS", "KEY_PAGE_LOAD_STARTED", "KEY_PAGE_LOAD_FINISHED", "KEY_PRESENTATION", "KEY_RESULT", "KEY_CONTEXT", "KEY_TOTAL_DURATION_MS", "KEY_PAGE_LOADED", "KEY_HAD_WEBVIEW_ERROR", "KEY_WEBVIEW_ERROR_TYPE", "KEY_WEBVIEW_ERROR_CODE", "KEY_WEBVIEW_ERROR_DESCRIPTION", "KEY_DOMAIN", "KEY_LOAD_DURATION_MS", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String extractDomain(@NotNull String url) {
            Intrinsics.echo(url, "url");
            try {
                String host = new URI(url).getHost();
                if (host != null) {
                    if (host.length() == 0) {
                        host = null;
                    }
                    if (host != null) {
                        return host;
                    }
                }
            } catch (Exception unused) {
            }
            return "unknown";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger$ErrorType;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "PAGE_LOAD", "HTTP", "SSL", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ErrorType {
        public static final ErrorType HTTP;
        public static final ErrorType PAGE_LOAD;
        public static final ErrorType SSL;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ ErrorType[] f5707b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ Qd.a f5708c;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        static {
            ErrorType errorType = new ErrorType("PAGE_LOAD", 0, "page_load_error");
            PAGE_LOAD = errorType;
            ErrorType errorType2 = new ErrorType("HTTP", 1, "http_error");
            HTTP = errorType2;
            ErrorType errorType3 = new ErrorType("SSL", 2, "ssl_error");
            SSL = errorType3;
            ErrorType[] errorTypeArr = {errorType, errorType2, errorType3};
            f5707b = errorTypeArr;
            f5708c = AbstractC2708l7.bravo(errorTypeArr);
        }

        private ErrorType(String str, int i4, String str2) {
            this.value = str2;
        }

        @NotNull
        public static Qd.a getEntries() {
            return f5708c;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f5707b.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public RedirectWebViewEventLogger(@NotNull Logger logger, @NotNull String presentationPrefix) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(presentationPrefix, "presentationPrefix");
        this.f5699a = logger;
        this.f5700b = presentationPrefix.concat("_WEBVIEW_ERROR");
        this.f5702d = "unknown";
    }

    private final void a(ErrorType errorType, int i4, String str, String str2, boolean z2) {
        this.f5706i = new a(errorType, i4, str);
        StringBuilder green = P0.green("type=", errorType.getValue(), "|error_code=", "|description=", i4);
        green.append(str);
        String sb2 = green.toString();
        c a6 = new c().a("presentation", "webview").a(Constants.KEY_TYPE, errorType.getValue()).a("error_code", Integer.valueOf(i4)).a("description", str).a("domain", str2).a("redirect_started_at", Long.valueOf(this.f5701c));
        long j5 = this.f5701c;
        long j6 = 0;
        if (j5 > 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        c a8 = a6.a("time_since_redirect_started_ms", Long.valueOf(j6)).a("page_load_started", Boolean.valueOf(this.f5704g)).a("page_load_finished", Boolean.valueOf(this.f5705h));
        if (this.f5705h) {
            a8.a("load_duration_ms", Long.valueOf(this.f5703f));
        }
        String maroon = CollectionsKt.maroon(a8.f5661a, "|", null, null, null, 62);
        if (z2) {
            N4.a.bravo(this.f5699a, "Redirect WebView error", this.f5700b, sb2, maroon, false, 16, null);
        } else {
            this.f5699a.logWarning("Redirect WebView error", this.f5700b, sb2, maroon);
        }
    }

    @NotNull
    public final String buildAuthFailedStack(@NotNull String result, @Nullable String dismissReason) {
        String str;
        long j5;
        long j6;
        boolean z2;
        String str2;
        ErrorType errorType;
        Intrinsics.echo(result, "result");
        long j7 = 0;
        if (Intrinsics.areEqual(dismissReason, DISMISS_REASON_RENDERER_GONE)) {
            str = "renderer_crashed";
        } else if (!this.f5704g) {
            str = "page_never_loaded";
        } else {
            if (!this.f5705h) {
                long j10 = this.f5701c;
                if (j10 > 0) {
                    j5 = SystemClock.elapsedRealtime() - j10;
                } else {
                    j5 = 0;
                }
                if (j5 < 3000) {
                    str = "dismissed_immediately";
                }
            }
            if (Intrinsics.areEqual(dismissReason, DISMISS_REASON_USER_BACK_PRESS)) {
                str = RedirectCustomTabEventLogger.DISMISS_REASON_USER_CANCELLED;
            } else if (this.f5706i != null) {
                str = "webview_error";
            } else if (Intrinsics.areEqual(result, "failure")) {
                str = "authentication_failed";
            } else {
                str = "likely_server_timeout";
            }
        }
        c a6 = new c().a("presentation", "webview").a("result", result).a("context", str);
        long j11 = this.f5701c;
        if (j11 > 0) {
            j6 = SystemClock.elapsedRealtime() - j11;
        } else {
            j6 = 0;
        }
        c a8 = a6.a("total_duration_ms", Long.valueOf(j6)).a("page_loaded", Boolean.valueOf(this.f5705h));
        if (this.f5705h) {
            j7 = this.f5703f;
        }
        c a10 = a8.a("load_duration_ms", Long.valueOf(j7)).a("domain", this.f5702d);
        int i4 = 0;
        if (this.f5706i != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c a11 = a10.a("had_webview_error", Boolean.valueOf(z2));
        a aVar = this.f5706i;
        String str3 = null;
        if (aVar != null && (errorType = aVar.f5710a) != null) {
            str2 = errorType.getValue();
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        c a12 = a11.a("webview_error_type", str2);
        a aVar2 = this.f5706i;
        if (aVar2 != null) {
            i4 = aVar2.f5711b;
        }
        c a13 = a12.a("webview_error_code", Integer.valueOf(i4));
        a aVar3 = this.f5706i;
        if (aVar3 != null) {
            str3 = aVar3.f5712c;
        }
        if (str3 != null) {
            str4 = str3;
        }
        return CollectionsKt.maroon(a13.a("webview_error_description", str4).f5661a, "|", null, null, null, 62);
    }

    public final void onHttpError(@NotNull String url, int statusCode, @NotNull String reason) {
        Intrinsics.echo(url, "url");
        Intrinsics.echo(reason, "reason");
        a(ErrorType.HTTP, statusCode, reason, INSTANCE.extractDomain(url), false);
    }

    public final void onJsError(@NotNull String message, int lineNumber, @NotNull String sourceId) {
        Intrinsics.echo(message, "message");
        Intrinsics.echo(sourceId, "sourceId");
        Logger logger = this.f5699a;
        String extractDomain = INSTANCE.extractDomain(sourceId);
        StringBuilder green = P0.green("message=", message, " | line=", " | source=", lineNumber);
        green.append(extractDomain);
        N4.a.delta(logger, "redirect_js_error", "RedirectJsError", green.toString(), null, 8, null);
    }

    public final void onPageLoadError(@NotNull String url, int errorCode, @NotNull String description) {
        Intrinsics.echo(url, "url");
        Intrinsics.echo(description, "description");
        a(ErrorType.PAGE_LOAD, errorCode, description, INSTANCE.extractDomain(url), false);
    }

    public final void onPageLoadFinished() {
        this.f5705h = true;
        long j5 = this.e;
        long j6 = 0;
        if (j5 > 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        this.f5703f = j6;
    }

    public final void onPageLoadStarted() {
        this.e = SystemClock.elapsedRealtime();
        this.f5704g = true;
    }

    public final void onRedirectStarted(@NotNull String redirectUrl) {
        Intrinsics.echo(redirectUrl, "redirectUrl");
        this.f5701c = SystemClock.elapsedRealtime();
        this.f5702d = INSTANCE.extractDomain(redirectUrl);
        this.e = 0L;
        this.f5703f = 0L;
        this.f5704g = false;
        this.f5705h = false;
        this.f5706i = null;
    }

    public final void onRendererGone(boolean didCrash) {
        N4.a.bravo(this.f5699a, "redirect_renderer_gone", "RedirectRendererGone", "WebView renderer terminated | did_crash=" + didCrash, null, false, 24, null);
    }

    public final void onSslError(@NotNull String url, int primaryError) {
        Intrinsics.echo(url, "url");
        a(ErrorType.SSL, primaryError, "SSL certificate error", INSTANCE.extractDomain(url), true);
    }

    public /* synthetic */ RedirectWebViewEventLogger(Logger logger, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, (i4 & 2) != 0 ? "REDIRECT" : str);
    }
}
