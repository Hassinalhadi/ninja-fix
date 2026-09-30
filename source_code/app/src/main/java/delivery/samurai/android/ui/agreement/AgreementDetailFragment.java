package delivery.samurai.android.ui.agreement;

import B9.ab;
import L9.d;
import Xa.f;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import d.C1534h0;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import la.i;
import ma.c;
import r3.C2492a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/agreement/AgreementDetailFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AgreementDetailFragment extends i {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public WebView f12130f;

    public AgreementDetailFragment() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new je.ab(13, new je.ab(12, this)));
        this.e = new ab(u.alpha.bravo(AgreementViewModel.class), new ga.ab(alpha, 8), new f(19, this, alpha), new ga.ab(alpha, 9));
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_agreement_detail, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        long j5;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j5 = arguments.getLong("agreementId");
        } else {
            j5 = 0;
        }
        long j6 = j5;
        View findViewById = view.findViewById(R.id.htmlContentTextView);
        Intrinsics.delta(findViewById, "findViewById(...)");
        WebView webView = (WebView) findViewById;
        this.f12130f = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(185);
        WebView webView2 = this.f12130f;
        if (webView2 != null) {
            webView2.setPadding(40, 40, 40, 40);
            WebView webView3 = this.f12130f;
            if (webView3 != null) {
                webView3.setInitialScale(1);
                WebView webView4 = this.f12130f;
                if (webView4 != null) {
                    webView4.setWebViewClient(new WebViewClient());
                    WebView webView5 = this.f12130f;
                    if (webView5 != null) {
                        webView5.setVerticalScrollBarEnabled(false);
                        WebView webView6 = this.f12130f;
                        if (webView6 != null) {
                            webView6.setHorizontalScrollBarEnabled(false);
                            if (j6 != -1) {
                                AgreementViewModel agreementViewModel = (AgreementViewModel) this.e.getValue();
                                ?? auVar = new au(new C2492a(2, "loading"));
                                BaseViewModel.launchApi$default(agreementViewModel, null, new c(agreementViewModel, j6, auVar, null), 1, null);
                                auVar.observe(getViewLifecycleOwner(), new Aa.f(28, new C1534h0(26, this)));
                                return;
                            }
                            Context context = getContext();
                            if (context != null) {
                                String string = getString(R.string.error_something_went_wrong);
                                Intrinsics.delta(string, "getString(...)");
                                d.pink(context, string);
                                return;
                            }
                            return;
                        }
                        Intrinsics.lima("htmlContentTextView");
                        throw null;
                    }
                    Intrinsics.lima("htmlContentTextView");
                    throw null;
                }
                Intrinsics.lima("htmlContentTextView");
                throw null;
            }
            Intrinsics.lima("htmlContentTextView");
            throw null;
        }
        Intrinsics.lima("htmlContentTextView");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
    }
}
