package com.checkout.components.redirecthandler.customtab;

import android.os.SystemClock;
import av.q;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.redirecthandler.b;
import com.checkout.components.redirecthandler.model.RedirectResult;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import com.clevertap.android.sdk.Constants;
import java.net.URI;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000  2\u00020\u0001:\u0002! B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0013¨\u0006\""}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabEventLogger;", "", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "", "presentationPrefix", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;Ljava/lang/String;)V", "redirectUrl", "", "hasWarmupSession", "", "onRedirectStarted", "(Ljava/lang/String;Z)V", "Lcom/checkout/components/redirecthandler/model/RedirectResult;", "parsedOutcome", "onSessionIdMismatch", "(Ljava/lang/String;Lcom/checkout/components/redirecthandler/model/RedirectResult;)V", "onUnexpectedRedirect", "(Ljava/lang/String;)V", "reason", "onRedirectDropped", "result", "dismissReason", "buildAuthFailedStack", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "f", "Ljava/lang/String;", "getPresentation", "()Ljava/lang/String;", "setPresentation", "presentation", "Companion", "com/checkout/components/redirecthandler/b", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectCustomTabEventLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEFAULT_PRESENTATION_PREFIX = "REDIRECT";

    @NotNull
    public static final String DISMISS_REASON_NO_ACTIVITY = "no_activity_context";

    @NotNull
    public static final String DISMISS_REASON_REDIRECT_DROPPED = "redirect_dropped";

    @NotNull
    public static final String DISMISS_REASON_SESSION_MISMATCH = "session_id_mismatch";

    @NotNull
    public static final String DISMISS_REASON_USER_CANCELLED = "user_cancelled";

    @NotNull
    public static final String PRESENTATION_AUTH_TAB = "auth_tab";

    @NotNull
    public static final String PRESENTATION_CUSTOM_TAB = "custom_tab";

    @NotNull
    public static final String RESULT_DISMISSED = "dismissed";

    @NotNull
    public static final String RESULT_ERROR = "error";

    @NotNull
    public static final String RESULT_FAILURE = "failure";

    @NotNull
    public static final String RESULT_REJECTED = "rejected";

    @NotNull
    public static final String RESULT_UNEXPECTED_REDIRECT = "unexpected_redirect_url";

    @NotNull
    public static final String RESULT_UNRECOGNIZED_REDIRECT = "unrecognized_redirect";

    /* renamed from: a, reason: collision with root package name */
    private final Logger f5676a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5677b;

    /* renamed from: c, reason: collision with root package name */
    private long f5678c;

    /* renamed from: d, reason: collision with root package name */
    private String f5679d;
    private boolean e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String presentation;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b,\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\n¨\u00062"}, d2 = {"Lcom/checkout/components/redirecthandler/customtab/RedirectCustomTabEventLogger$Companion;", "", "", Constants.KEY_URL, "extractDomain", "(Ljava/lang/String;)Ljava/lang/String;", "", "NO_TIMESTAMP", "J", "UNKNOWN_DOMAIN", "Ljava/lang/String;", "DELIMITER", "PRESENTATION_CUSTOM_TAB", "PRESENTATION_AUTH_TAB", "DEFAULT_PRESENTATION_PREFIX", "MESSAGE_CUSTOM_TAB_ERROR", "TYPE_SESSION_MISMATCH", "TYPE_UNEXPECTED_REDIRECT", "TYPE_REDIRECT_DROPPED", "DISMISS_REASON_USER_CANCELLED", "DISMISS_REASON_SESSION_MISMATCH", "DISMISS_REASON_NO_ACTIVITY", "DISMISS_REASON_REDIRECT_DROPPED", "RESULT_DISMISSED", "RESULT_FAILURE", "RESULT_REJECTED", "RESULT_ERROR", "RESULT_UNEXPECTED_REDIRECT", "RESULT_UNRECOGNIZED_REDIRECT", "CONTEXT_NO_ACTIVITY", "CONTEXT_SESSION_MISMATCH", "CONTEXT_USER_CANCELLED", "CONTEXT_UNEXPECTED_REDIRECT", "CONTEXT_UNRECOGNIZED_REDIRECT", "CONTEXT_AUTHENTICATION_FAILED", "CONTEXT_UNKNOWN", "KEY_PRESENTATION", "KEY_RESULT", "KEY_CONTEXT", "KEY_TOTAL_DURATION_MS", "KEY_DOMAIN", "KEY_WARMUP_ACTIVE", "KEY_TYPE", "KEY_REASON", "KEY_REDIRECT_DOMAIN", "KEY_TIME_SINCE_REDIRECT_STARTED_MS", "KEY_OUTCOME", "OUTCOME_SUCCESS", "OUTCOME_FAILURE", "OUTCOME_UNRECOGNIZED", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String extractDomain(@NotNull String url) {
            String str;
            String host;
            Intrinsics.echo(url, "url");
            try {
                URI uri = new URI(url);
                String scheme = uri.getScheme();
                String str2 = null;
                if (scheme != null) {
                    str = scheme.toLowerCase(Locale.ROOT);
                    Intrinsics.delta(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                if ((Intrinsics.areEqual(str, "http") || Intrinsics.areEqual(str, "https")) && (host = uri.getHost()) != null) {
                    if (host.length() != 0) {
                        str2 = host;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
            } catch (Exception unused) {
            }
            return "unknown";
        }
    }

    public RedirectCustomTabEventLogger(@NotNull Logger logger, @NotNull String presentationPrefix) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(presentationPrefix, "presentationPrefix");
        this.f5676a = logger;
        this.f5677b = presentationPrefix.concat("_CUSTOM_TAB_ERROR");
        this.f5679d = "unknown";
        this.presentation = PRESENTATION_CUSTOM_TAB;
    }

    @NotNull
    public final String buildAuthFailedStack(@NotNull String result, @Nullable String dismissReason) {
        Intrinsics.echo(result, "result");
        String str = DISMISS_REASON_NO_ACTIVITY;
        if (!Intrinsics.areEqual(dismissReason, DISMISS_REASON_NO_ACTIVITY)) {
            str = DISMISS_REASON_SESSION_MISMATCH;
            if (!Intrinsics.areEqual(dismissReason, DISMISS_REASON_SESSION_MISMATCH)) {
                str = DISMISS_REASON_REDIRECT_DROPPED;
                if (!Intrinsics.areEqual(dismissReason, DISMISS_REASON_REDIRECT_DROPPED)) {
                    str = DISMISS_REASON_USER_CANCELLED;
                    if (!Intrinsics.areEqual(dismissReason, DISMISS_REASON_USER_CANCELLED)) {
                        if (Intrinsics.areEqual(result, RESULT_UNEXPECTED_REDIRECT)) {
                            str = "unexpected_redirect";
                        } else {
                            str = RESULT_UNRECOGNIZED_REDIRECT;
                            if (!Intrinsics.areEqual(result, RESULT_UNRECOGNIZED_REDIRECT)) {
                                if (Intrinsics.areEqual(result, "failure")) {
                                    str = "authentication_failed";
                                } else {
                                    str = "unknown";
                                }
                            }
                        }
                    }
                }
            }
        }
        b a6 = new b().a("presentation", this.presentation).a("result", result).a("context", str);
        long j5 = this.f5678c;
        long j6 = 0;
        if (j5 > 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        return CollectionsKt.maroon(a6.a("total_duration_ms", Long.valueOf(j6)).a("domain", this.f5679d).a("warmup_active", Boolean.valueOf(this.e)).f5660a, "|", null, null, null, 62);
    }

    @NotNull
    public final String getPresentation() {
        return this.presentation;
    }

    public final void onRedirectDropped(@NotNull String reason) {
        Intrinsics.echo(reason, "reason");
        b a6 = new b().a("presentation", this.presentation).a(Constants.KEY_TYPE, DISMISS_REASON_REDIRECT_DROPPED).a("reason", reason).a("domain", this.f5679d).a("warmup_active", Boolean.valueOf(this.e));
        long j5 = this.f5678c;
        long j6 = 0;
        if (j5 > 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        this.f5676a.logWarning("Redirect Custom Tab error", this.f5677b, q.foxtrot("type=redirect_dropped|reason=", reason, "|domain=", this.f5679d), CollectionsKt.maroon(a6.a("time_since_redirect_started_ms", Long.valueOf(j6)).f5660a, "|", null, null, null, 62));
    }

    public final void onRedirectStarted(@NotNull String redirectUrl, boolean hasWarmupSession) {
        Intrinsics.echo(redirectUrl, "redirectUrl");
        this.f5678c = SystemClock.elapsedRealtime();
        this.f5679d = INSTANCE.extractDomain(redirectUrl);
        this.e = hasWarmupSession;
    }

    public final void onSessionIdMismatch(@NotNull String redirectUrl, @Nullable RedirectResult parsedOutcome) {
        String str;
        Intrinsics.echo(redirectUrl, "redirectUrl");
        if (Intrinsics.areEqual(parsedOutcome, RedirectResult.Success.INSTANCE)) {
            str = RedirectionConstants.REDIRECT_SUCCESS_VALUE;
        } else if (parsedOutcome instanceof RedirectResult.Failure) {
            str = "failure";
        } else if (parsedOutcome == null) {
            str = "unrecognized";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        b a6 = new b().a("presentation", this.presentation).a(Constants.KEY_TYPE, DISMISS_REASON_SESSION_MISMATCH).a("outcome", str).a("domain", this.f5679d).a("redirect_domain", INSTANCE.extractDomain(redirectUrl)).a("warmup_active", Boolean.valueOf(this.e));
        long j5 = this.f5678c;
        long j6 = 0;
        if (j5 > 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        this.f5676a.logWarning("Redirect Custom Tab error", this.f5677b, q.foxtrot("type=session_id_mismatch|outcome=", str, "|domain=", this.f5679d), CollectionsKt.maroon(a6.a("time_since_redirect_started_ms", Long.valueOf(j6)).f5660a, "|", null, null, null, 62));
    }

    public final void onUnexpectedRedirect(@NotNull String redirectUrl) {
        Intrinsics.echo(redirectUrl, "redirectUrl");
        b a6 = new b().a("presentation", this.presentation).a(Constants.KEY_TYPE, "unexpected_redirect").a("domain", this.f5679d).a("redirect_domain", INSTANCE.extractDomain(redirectUrl)).a("warmup_active", Boolean.valueOf(this.e));
        long j5 = this.f5678c;
        long j6 = 0;
        if (j5 > 0) {
            j6 = SystemClock.elapsedRealtime() - j5;
        }
        this.f5676a.logWarning("Redirect Custom Tab error", this.f5677b, q.echo("type=unexpected_redirect|domain=", this.f5679d), CollectionsKt.maroon(a6.a("time_since_redirect_started_ms", Long.valueOf(j6)).f5660a, "|", null, null, null, 62));
    }

    public final void setPresentation(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.presentation = str;
    }

    public /* synthetic */ RedirectCustomTabEventLogger(Logger logger, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, (i4 & 2) != 0 ? "REDIRECT" : str);
    }
}
