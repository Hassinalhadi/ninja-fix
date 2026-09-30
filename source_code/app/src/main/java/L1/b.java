package L1;

import K1.k;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class b extends InputConnectionWrapper {
    public final EditText alpha;
    public final u8.b bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        u8.b bVar = new u8.b(5);
        this.alpha = editText;
        this.bravo = bVar;
        if (k.delta()) {
            k.alpha().india(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        Editable editableText = this.alpha.getEditableText();
        this.bravo.getClass();
        if (!u8.b.golf(this, editableText, i4, i5, false) && !super.deleteSurroundingText(i4, i5)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        Editable editableText = this.alpha.getEditableText();
        this.bravo.getClass();
        if (u8.b.golf(this, editableText, i4, i5, true) || super.deleteSurroundingTextInCodePoints(i4, i5)) {
            return true;
        }
        return false;
    }
}
