package ae;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class aa extends x {
    public final Field alpha;
    public final Field bravo;
    public final Field charlie;

    public aa(Field field, Field field2, Field field3) {
        this.alpha = field;
        this.bravo = field2;
        this.charlie = field3;
    }

    @Override // ae.x
    public final boolean alpha(InputMethodManager inputMethodManager) {
        try {
            this.charlie.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // ae.x
    public final Object bravo(InputMethodManager inputMethodManager) {
        try {
            return this.alpha.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // ae.x
    public final View charlie(InputMethodManager inputMethodManager) {
        try {
            return (View) this.bravo.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
