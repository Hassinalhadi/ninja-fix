package L1;

import K1.k;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class i implements TextWatcher {
    public final EditText alpha;
    public h purple;
    public boolean red = true;

    public i(EditText editText) {
        this.alpha = editText;
    }

    public static void alpha(EditText editText, int i4) {
        int length;
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k alpha = k.alpha();
            if (editableText == null) {
                length = 0;
            } else {
                alpha.getClass();
                length = editableText.length();
            }
            alpha.golf(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        EditText editText = this.alpha;
        if (!editText.isInEditMode() && this.red && k.delta() && i5 <= i10 && (charSequence instanceof Spannable)) {
            int charlie = k.alpha().charlie();
            if (charlie != 0) {
                if (charlie != 1) {
                    if (charlie != 3) {
                        return;
                    }
                } else {
                    k.alpha().golf(i4, i10 + i4, 0, (Spannable) charSequence);
                    return;
                }
            }
            k alpha = k.alpha();
            if (this.purple == null) {
                this.purple = new h(editText);
            }
            alpha.hotel(this.purple);
        }
    }
}
