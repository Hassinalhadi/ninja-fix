package Ba;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements View.OnFocusChangeListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ m(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.alpha) {
            case 0:
                if (z2) {
                    ((n) this.purple).getClass();
                    return;
                }
                return;
            case 1:
                for (EditText editText : (EditText[]) this.purple) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 2:
                com.google.android.material.textfield.c cVar = (com.google.android.material.textfield.c) this.purple;
                cVar.tango(cVar.uniform());
                return;
            default:
                com.google.android.material.textfield.i iVar = (com.google.android.material.textfield.i) this.purple;
                iVar.lima = z2;
                iVar.quebec();
                if (!z2) {
                    iVar.tango(false);
                    iVar.mike = false;
                    return;
                }
                return;
        }
    }
}
