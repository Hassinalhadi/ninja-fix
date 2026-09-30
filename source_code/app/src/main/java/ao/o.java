package ao;

import android.view.ActionProvider;

/* loaded from: classes3.dex */
public final class o implements ActionProvider.VisibilityListener {
    public O7.l alpha;
    public final ActionProvider bravo;
    public final /* synthetic */ s charlie;

    public o(s sVar, ActionProvider actionProvider) {
        this.charlie = sVar;
        this.bravo = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        O7.l lVar = this.alpha;
        if (lVar != null) {
            l lVar2 = ((n) lVar.purple).f3224g;
            lVar2.f3203a = true;
            lVar2.papa(true);
        }
    }
}
