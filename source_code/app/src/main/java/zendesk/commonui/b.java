package zendesk.commonui;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ah.a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ PhotoPickerLifecycleObserver purple;

    public /* synthetic */ b(PhotoPickerLifecycleObserver photoPickerLifecycleObserver, int i4) {
        this.alpha = i4;
        this.purple = photoPickerLifecycleObserver;
    }

    @Override // ah.a
    public final void charlie(Object obj) {
        switch (this.alpha) {
            case 0:
                PhotoPickerLifecycleObserver.charlie(this.purple, (Boolean) obj);
                return;
            case 1:
                PhotoPickerLifecycleObserver.alpha(this.purple, (List) obj);
                return;
            default:
                PhotoPickerLifecycleObserver.bravo(this.purple, (List) obj);
                return;
        }
    }
}
