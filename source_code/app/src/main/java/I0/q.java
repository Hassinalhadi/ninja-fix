package I0;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes3.dex */
public class q extends p {
    @Override // I0.o, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        w.v vVar = this.bravo;
        if (vVar != null) {
            return vVar.commitContent(inputContentInfo, i4, bundle);
        }
        return false;
    }
}
