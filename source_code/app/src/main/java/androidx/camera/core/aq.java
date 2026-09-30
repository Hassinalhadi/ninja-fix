package androidx.camera.core;

/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements v {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ar purple;

    public /* synthetic */ aq(ar arVar, ar arVar2, int i4) {
        this.alpha = i4;
        this.purple = arVar2;
    }

    @Override // androidx.camera.core.v
    public final void charlie(w wVar) {
        ar arVar = this.purple;
        switch (this.alpha) {
            case 0:
                int i4 = ImageProcessingUtil.alpha;
                if (arVar != null) {
                    arVar.close();
                    return;
                }
                return;
            default:
                int i5 = ImageProcessingUtil.alpha;
                arVar.close();
                return;
        }
    }
}
