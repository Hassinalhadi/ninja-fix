package androidx.fragment.app;

/* loaded from: classes3.dex */
public final class ad implements ar.a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ad(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // ar.a
    /* renamed from: apply */
    public final Object mo11apply(Object obj) {
        switch (this.alpha) {
            case 0:
                ai aiVar = (ai) this.purple;
                Object obj2 = aiVar.mHost;
                if (obj2 instanceof ah.i) {
                    return ((ah.i) obj2).getActivityResultRegistry();
                }
                return aiVar.requireActivity().getActivityResultRegistry();
            default:
                return (ah.h) this.purple;
        }
    }
}
