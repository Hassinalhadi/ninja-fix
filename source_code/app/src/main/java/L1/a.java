package L1;

import K1.x;
import android.text.Editable;

/* loaded from: classes3.dex */
public final class a extends Editable.Factory {
    public static final Object alpha = new Object();
    public static volatile a bravo;
    public static Class charlie;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = charlie;
        if (cls != null) {
            return new x(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
