package C4;

import com.checkout.components.core.di.extension.OkHttpProviderExtensionKt;
import com.checkout.components.rememberme.AbstractC0940f0;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Interceptor {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        switch (this.alpha) {
            case 0:
                return OkHttpProviderExtensionKt.alpha(chain);
            case 1:
                return com.checkout.components.insight.di.extension.OkHttpProviderExtensionKt.alpha(chain);
            default:
                return AbstractC0940f0.a(chain);
        }
    }
}
