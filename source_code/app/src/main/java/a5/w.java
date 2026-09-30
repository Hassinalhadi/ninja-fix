package a5;

import android.content.Context;
import com.checkout.components.rememberme.AbstractC0927b;
import com.checkout.components.rememberme.webview.BottomSheetWebViewClient;
import com.checkout.components.rememberme.webview.BottomSheetWebViewImpl;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Function1 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ BottomSheetWebViewClient purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ BottomSheetWebViewState silver;

    public /* synthetic */ w(BottomSheetWebViewClient bottomSheetWebViewClient, String str, BottomSheetWebViewState bottomSheetWebViewState) {
        this.purple = bottomSheetWebViewClient;
        this.red = str;
        this.silver = bottomSheetWebViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return AbstractC0927b.a(this.silver, this.purple, this.red, (Context) obj);
            default:
                return AbstractC0927b.a(this.purple, this.red, this.silver, (BottomSheetWebViewImpl) obj);
        }
    }

    public /* synthetic */ w(BottomSheetWebViewState bottomSheetWebViewState, BottomSheetWebViewClient bottomSheetWebViewClient, String str) {
        this.silver = bottomSheetWebViewState;
        this.purple = bottomSheetWebViewClient;
        this.red = str;
    }
}
