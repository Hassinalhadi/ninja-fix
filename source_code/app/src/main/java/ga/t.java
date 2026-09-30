package ga;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class t implements TextWatcher {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ TextInputLayout purple;

    public /* synthetic */ t(TextInputLayout textInputLayout, int i4) {
        this.alpha = i4;
        this.purple = textInputLayout;
    }

    private final void alpha(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void bravo(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void charlie(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void delta(int i4, int i5, int i10, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.alpha) {
            case 0:
                TextInputLayout textInputLayout = this.purple;
                textInputLayout.setError(null);
                textInputLayout.setErrorEnabled(false);
                return;
            default:
                TextInputLayout textInputLayout2 = this.purple;
                textInputLayout2.setError(null);
                textInputLayout2.setErrorEnabled(false);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        int i11 = this.alpha;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        int i11 = this.alpha;
    }
}
