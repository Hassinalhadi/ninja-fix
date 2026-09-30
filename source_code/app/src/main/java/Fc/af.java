package Fc;

import android.R;
import delivery.samurai.android.ui.splash.SplashActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class af implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SplashActivity purple;

    public /* synthetic */ af(SplashActivity splashActivity, int i4) {
        this.alpha = i4;
        this.purple = splashActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SplashActivity splashActivity = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = SplashActivity.f12488L;
                splashActivity.gray();
                return Unit.INSTANCE;
            case 1:
                int i5 = SplashActivity.f12488L;
                splashActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                splashActivity.uniform(splashActivity.getIntent());
                return Unit.INSTANCE;
            case 2:
                int i10 = SplashActivity.f12488L;
                splashActivity.juliet(new af(splashActivity, 5));
                return Unit.INSTANCE;
            case 3:
                int i11 = SplashActivity.f12488L;
                splashActivity.gray();
                return Unit.INSTANCE;
            case 4:
                int i12 = SplashActivity.f12488L;
                splashActivity.gray();
                return Unit.INSTANCE;
            case 5:
                int i13 = SplashActivity.f12488L;
                splashActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                splashActivity.uniform(splashActivity.getIntent());
                return Unit.INSTANCE;
            case 6:
                int i14 = SplashActivity.f12488L;
                splashActivity.gray();
                return Unit.INSTANCE;
            default:
                splashActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
