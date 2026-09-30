package U;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;

/* loaded from: classes3.dex */
public final class i extends AutofillManager$AutofillCallback {
    public static final i alpha = new AutofillManager$AutofillCallback();

    public final void onAutofillEvent(View view, int i4, int i5) {
        String str;
        super.onAutofillEvent(view, i4, i5);
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }
}
