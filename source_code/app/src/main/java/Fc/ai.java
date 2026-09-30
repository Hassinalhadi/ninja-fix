package Fc;

import delivery.samurai.android.ui.splash.SplashActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ai extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SplashActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(SplashActivity splashActivity, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = splashActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return this.purple.getDefaultViewModelProviderFactory();
            case 1:
                return this.purple.getViewModelStore();
            default:
                return this.purple.getDefaultViewModelCreationExtras();
        }
    }
}
