package wa;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ab;
import com.google.android.material.textfield.TextInputEditText;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignUpActivity purple;

    public /* synthetic */ m(SignUpActivity signUpActivity, int i4) {
        this.alpha = i4;
        this.purple = signUpActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignUpActivity signUpActivity = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = SignUpActivity.f12184d0;
                TextInputEditText etFintechId = signUpActivity.green().f678u;
                Intrinsics.delta(etFintechId, "etFintechId");
                etFintechId.setFocusable(true);
                etFintechId.setFocusableInTouchMode(true);
                etFintechId.requestFocus();
                TextInputEditText etFintechId2 = signUpActivity.green().f678u;
                Intrinsics.delta(etFintechId2, "etFintechId");
                etFintechId2.requestFocus();
                Object systemService = signUpActivity.getSystemService("input_method");
                Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(etFintechId2, 1);
                return;
            default:
                int i5 = SignUpActivity.f12184d0;
                if (signUpActivity.getLifecycle().bravo() == ab.teal) {
                    signUpActivity.green().f660l.performClick();
                    return;
                }
                return;
        }
    }
}
