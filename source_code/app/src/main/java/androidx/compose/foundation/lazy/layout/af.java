package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class af {
    public final int alpha;
    public final ArrayList bravo = new ArrayList();
    public final /* synthetic */ ai charlie;

    public af(ai aiVar, int i4) {
        this.charlie = aiVar;
        this.alpha = i4;
    }

    public final void alpha(int i4) {
        ai aiVar = this.charlie;
        C3.d dVar = aiVar.charlie;
        if (dVar == null) {
            return;
        }
        ArrayList arrayList = this.bravo;
        boolean z2 = ((aw) dVar.silver) instanceof ViewOnAttachStateChangeListenerC0560a;
        arrayList.add(new au(dVar, i4, aiVar.bravo, null));
    }
}
