package androidx.loader.app;

import androidx.lifecycle.Y;
import bv.ax;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class LoaderManagerImpl$LoaderViewModel extends Y {
    public static final b bravo = new Object();
    public final ax alpha = new ax(0);

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        super.onCleared();
        ax axVar = this.alpha;
        if (axVar.golf() <= 0) {
            int i4 = axVar.silver;
            Object[] objArr = axVar.red;
            for (int i5 = 0; i5 < i4; i5++) {
                objArr[i5] = null;
            }
            axVar.silver = 0;
            axVar.alpha = false;
            return;
        }
        axVar.hotel(0).getClass();
        throw new ClassCastException();
    }
}
