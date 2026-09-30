package t6;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* renamed from: t6.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3051r3 {
    public static final O0.j alpha(D0.ak akVar, int i4) {
        D0.aj ajVar = akVar.alpha;
        if (ajVar.alpha.purple.length() != 0) {
            D0.o oVar = akVar.bravo;
            int delta = oVar.delta(i4);
            if ((i4 != 0 && delta == oVar.delta(i4 - 1)) || (i4 != ajVar.alpha.purple.length() && delta == oVar.delta(i4 + 1))) {
                return akVar.alpha(i4);
            }
        }
        return akVar.golf(i4);
    }

    public static void bravo(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }
}
