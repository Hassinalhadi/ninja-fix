package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public final class am extends AbstractViewOnTouchListenerC0448c0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ at f2864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av f2865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(av avVar, av avVar2, at atVar) {
        super(avVar2);
        this.f2865d = avVar;
        this.f2864c = atVar;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0448c0
    public final ao.ab bravo() {
        return this.f2864c;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0448c0
    public final boolean charlie() {
        av avVar = this.f2865d;
        if (!avVar.getInternalPopup().alpha()) {
            avVar.white.mike(avVar.getTextDirection(), avVar.getTextAlignment());
            return true;
        }
        return true;
    }
}
