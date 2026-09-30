package va;

import android.content.Intent;
import android.util.Patterns;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.resetPassword.ResetPasswordActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import t6.S2;
import xa.C3315b;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignInActivity purple;

    public /* synthetic */ r(SignInActivity signInActivity, int i4) {
        this.alpha = i4;
        this.purple = signInActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SignInActivity signInActivity = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = SignInActivity.f12172P;
                signInActivity.startActivity(new Intent(signInActivity, (Class<?>) ResetPasswordActivity.class));
                return;
            case 1:
                if (!signInActivity.f12177L) {
                    String str = S2.bravo((TextInputLayout) signInActivity.gray().golf) + ((Object) ((TextInputLayout) signInActivity.gray().golf).getSuffixText());
                    Pattern EMAIL_ADDRESS = Patterns.EMAIL_ADDRESS;
                    Intrinsics.delta(EMAIL_ADDRESS, "EMAIL_ADDRESS");
                    if (!new Regex(EMAIL_ADDRESS).echo(str)) {
                        String string = signInActivity.getString(R.string.invalid_email);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(signInActivity, string);
                        return;
                    }
                    ((AuthViewModel) signInActivity.f12174I.getValue()).onSignIn(str, String.valueOf(((TextInputEditText) signInActivity.gray().foxtrot).getText()));
                    return;
                }
                return;
            default:
                int i5 = SignInActivity.f12172P;
                p pVar = new p(signInActivity, 0);
                C3315b c3315b = new C3315b();
                c3315b.f14112u = pVar;
                c3315b.romeo(signInActivity.getSupportFragmentManager(), null);
                return;
        }
    }
}
