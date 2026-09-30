package androidx.fragment.app;

import android.os.Bundle;
import o2.InterfaceC2193c;

/* loaded from: classes3.dex */
public final /* synthetic */ class aj implements InterfaceC2193c {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ aj(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // o2.InterfaceC2193c
    public final Bundle alpha() {
        switch (this.alpha) {
            case 0:
                an anVar = (an) this.bravo;
                anVar.markFragmentsCreated();
                anVar.mFragmentLifecycleRegistry.foxtrot(androidx.lifecycle.aa.ON_STOP);
                return new Bundle();
            default:
                return ((L) this.bravo).peach();
        }
    }
}
