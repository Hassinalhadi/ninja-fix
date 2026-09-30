package I0;

import android.os.Handler;

/* loaded from: classes3.dex */
public class p extends o {
    @Override // I0.o
    public final void alpha(w.v vVar) {
        vVar.closeConnection();
    }

    @Override // I0.o, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.deleteSurroundingTextInCodePoints(i4, i5);
        }
        return false;
    }

    @Override // I0.o, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
