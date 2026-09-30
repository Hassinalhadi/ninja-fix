package androidx.appcompat.widget;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class an implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ an(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.alpha) {
            case 0:
                av avVar = (av) this.purple;
                if (!avVar.getInternalPopup().alpha()) {
                    avVar.white.mike(avVar.getTextDirection(), avVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = avVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                at atVar = (at) this.purple;
                av avVar2 = atVar.A;
                atVar.getClass();
                if (avVar2.isAttachedToWindow() && avVar2.getGlobalVisibleRect(atVar.f2868y)) {
                    atVar.sierra();
                    atVar.golf();
                    return;
                } else {
                    atVar.dismiss();
                    return;
                }
        }
    }
}
