package delivery.samurai.android.ui.chat;

import Eb.b;
import Ta.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.app.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.a0;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import delivery.samurai.android.R;
import kotlin.Metadata;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/chat/ChatActivity;", "Landroidx/appcompat/app/i;", "<init>", "()V", "Ta/a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ChatActivity extends i implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int teal = 0;
    public SavedStateHandleHolder alpha;
    public volatile ActivityComponentManager purple;
    public final Object red = new Object();
    public boolean silver = false;

    public ChatActivity() {
        addOnContextAvailableListener(new b(this, 13));
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    /* renamed from: echo, reason: merged with bridge method [inline-methods] */
    public final ActivityComponentManager componentManager() {
        if (this.purple == null) {
            synchronized (this.red) {
                try {
                    if (this.purple == null) {
                        this.purple = new ActivityComponentManager(this);
                    }
                } finally {
                }
            }
        }
        return this.purple;
    }

    public final void foxtrot(Bundle bundle) {
        super.onCreate(bundle);
        SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        this.alpha = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.alpha.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // ae.o, androidx.lifecycle.InterfaceC0651v
    public final a0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        foxtrot(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_chat, (ViewGroup) null, false);
        int i4 = R.id.loading;
        View bravo = S3.bravo(R.id.loading, inflate);
        if (bravo != null) {
            i4 = R.id.webview;
            WebView webView = (WebView) S3.bravo(R.id.webview, inflate);
            if (webView != null) {
                setContentView((ConstraintLayout) inflate);
                webView.setWebViewClient(new a(this));
                webView.getSettings().setJavaScriptEnabled(true);
                String stringExtra = getIntent().getStringExtra("CHAT_URL");
                if (stringExtra != null) {
                    webView.loadUrl(stringExtra);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.alpha;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }
}
