package com.checkout.components.redirecthandler.webview;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/redirecthandler/webview/RedirectWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;", "eventLogger", "<init>", "(Lcom/checkout/components/redirecthandler/webview/RedirectWebViewEventLogger;)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "redirect-handler_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RedirectWebChromeClient extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final RedirectWebViewEventLogger f5695a;

    public RedirectWebChromeClient(@NotNull RedirectWebViewEventLogger eventLogger) {
        Intrinsics.echo(eventLogger, "eventLogger");
        this.f5695a = eventLogger;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(@Nullable ConsoleMessage consoleMessage) {
        ConsoleMessage.MessageLevel messageLevel;
        if (consoleMessage != null) {
            messageLevel = consoleMessage.messageLevel();
        } else {
            messageLevel = null;
        }
        if (messageLevel == ConsoleMessage.MessageLevel.ERROR) {
            RedirectWebViewEventLogger redirectWebViewEventLogger = this.f5695a;
            String message = consoleMessage.message();
            String str = "";
            if (message == null) {
                message = "";
            }
            int lineNumber = consoleMessage.lineNumber();
            String sourceId = consoleMessage.sourceId();
            if (sourceId != null) {
                str = sourceId;
            }
            redirectWebViewEventLogger.onJsError(message, lineNumber, str);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
