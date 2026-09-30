package Ta;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import delivery.samurai.android.ui.chat.ChatActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends WebViewClient {
    public final /* synthetic */ ChatActivity alpha;

    public a(ChatActivity chatActivity) {
        this.alpha = chatActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.alpha.getClass();
        Intrinsics.lima("binding");
        throw null;
    }
}
