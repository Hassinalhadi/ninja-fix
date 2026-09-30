package va;

import android.content.Intent;
import android.util.Pair;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.auth.signup.RegisterActivity;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import g1.AbstractC1735d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import w3.AbstractC3236a;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ SignInActivity purple;

    public /* synthetic */ p(SignInActivity signInActivity, int i4) {
        this.alpha = i4;
        this.purple = signInActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SignInActivity signInActivity = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = SignInActivity.f12172P;
                AbstractC3236a.alpha(signInActivity, new Intent(signInActivity, (Class<?>) RegisterActivity.class), new Pair((MaterialButton) signInActivity.gray().charlie, signInActivity.getString(R.string.anim_go)));
                return Unit.INSTANCE;
            case 1:
                int i5 = SignInActivity.f12172P;
                ((MaterialButton) signInActivity.gray().charlie).performClick();
                return Unit.INSTANCE;
            case 2:
                int i10 = SignInActivity.f12172P;
                signInActivity.finishAffinity();
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 3:
                int i11 = SignInActivity.f12172P;
                p pVar = new p(signInActivity, 5);
                signInActivity.getClass();
                if (AbstractC1735d.alpha(signInActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    signInActivity.startActivityForResult(new Intent(signInActivity, (Class<?>) LocationInfoActivity.class), 1002);
                } else {
                    pVar.invoke();
                }
                return Unit.INSTANCE;
            case 4:
                int i12 = SignInActivity.f12172P;
                ((MaterialButton) signInActivity.gray().charlie).performClick();
                return Unit.INSTANCE;
            case 5:
                int i13 = SignInActivity.f12172P;
                signInActivity.uniform(signInActivity.getIntent());
                return Unit.INSTANCE;
            default:
                if (AbstractC1735d.alpha(signInActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    signInActivity.startActivityForResult(new Intent(signInActivity, (Class<?>) LocationInfoActivity.class), 1002);
                } else {
                    signInActivity.uniform(signInActivity.getIntent());
                }
                return Unit.INSTANCE;
        }
    }
}
