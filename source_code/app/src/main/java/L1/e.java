package L1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import id.C1915c;

/* loaded from: classes3.dex */
public final class e implements KeyListener {
    public final KeyListener alpha;
    public final U8.a bravo;

    public e(KeyListener keyListener) {
        U8.a aVar = new U8.a(6);
        this.alpha = keyListener;
        this.bravo = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i4) {
        this.alpha.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.alpha.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        boolean juliet;
        boolean z2;
        this.bravo.getClass();
        if (i4 != 67) {
            if (i4 != 112) {
                juliet = false;
            } else {
                juliet = C1915c.juliet(editable, keyEvent, true);
            }
        } else {
            juliet = C1915c.juliet(editable, keyEvent, false);
        }
        if (juliet) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !this.alpha.onKeyDown(view, editable, i4, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.alpha.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.alpha.onKeyUp(view, editable, i4, keyEvent);
    }
}
