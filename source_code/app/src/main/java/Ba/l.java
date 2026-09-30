package Ba;

import B9.AbstractC0063s;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements TextView.OnEditorActionListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ l(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                if (i4 != 3) {
                    return false;
                }
                ((TextInputEditText) ((n) obj).bronze().purple).clearFocus();
                return true;
            default:
                int i5 = SignUpActivity.f12184d0;
                if (i4 == 5) {
                    SignUpActivity signUpActivity = (SignUpActivity) obj;
                    if (!signUpActivity.green().f624G.isExpanded()) {
                        signUpActivity.green().f648f.performClick();
                        signUpActivity.green().f660l.performClick();
                        AbstractC0063s green = signUpActivity.green();
                        green.f678u.postDelayed(new wa.m(signUpActivity, 0), 700L);
                    }
                }
                return false;
        }
    }
}
