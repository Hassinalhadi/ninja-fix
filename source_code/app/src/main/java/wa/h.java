package wa;

import android.os.Build;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignUpActivity purple;

    public /* synthetic */ h(SignUpActivity signUpActivity, int i4) {
        this.alpha = i4;
        this.purple = signUpActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        SignUpActivity signUpActivity = this.purple;
        switch (this.alpha) {
            case 0:
                return SignUpActivity.gold(signUpActivity);
            case 1:
                int i4 = SignUpActivity.f12184d0;
                C3462a.alpha("SIGNUP", 12, "Requesting CAMERA permission", null);
                signUpActivity.f12199W.alpha("android.permission.CAMERA");
                return Unit.INSTANCE;
            default:
                int i5 = SignUpActivity.f12184d0;
                if (Build.VERSION.SDK_INT >= 33) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                }
                C3462a.alpha("SIGNUP", 12, "Requesting GALLERY permission ".concat(str), null);
                signUpActivity.f12200X.alpha(str);
                return Unit.INSTANCE;
        }
    }
}
