package zendesk.support;

import android.util.Patterns;

/* loaded from: classes.dex */
class EmailValidator {
    public boolean isValidEmail(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
