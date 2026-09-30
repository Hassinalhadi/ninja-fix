package u1;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import h9.aq;
import s1.C2576i;

/* loaded from: classes3.dex */
public final class d extends InputConnectionWrapper {
    public final /* synthetic */ aq alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, aq aqVar) {
        super(inputConnection, false);
        this.alpha = aqVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        C2576i c2576i = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c2576i = new C2576i(new f(inputContentInfo));
        }
        if (this.alpha.bravo(c2576i, i4, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i4, bundle);
    }
}
