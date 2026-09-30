package com.google.maps.android.clustering.view;

import x6.InterfaceC3300e;
import x6.InterfaceC3301f;
import x6.InterfaceC3302g;
import z6.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC3302g, InterfaceC3300e, InterfaceC3301f {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ DefaultClusterRenderer bravo;

    public /* synthetic */ d(DefaultClusterRenderer defaultClusterRenderer, int i4) {
        this.alpha = i4;
        this.bravo = defaultClusterRenderer;
    }

    @Override // x6.InterfaceC3300e
    public void onInfoWindowClick(f fVar) {
        switch (this.alpha) {
            case 1:
                this.bravo.lambda$onAdd$1(fVar);
                return;
            default:
                this.bravo.lambda$onAdd$4(fVar);
                return;
        }
    }

    @Override // x6.InterfaceC3301f
    public void onInfoWindowLongClick(f fVar) {
        switch (this.alpha) {
            case 2:
                this.bravo.lambda$onAdd$2(fVar);
                return;
            default:
                this.bravo.lambda$onAdd$5(fVar);
                return;
        }
    }

    @Override // x6.InterfaceC3302g
    public boolean onMarkerClick(f fVar) {
        boolean lambda$onAdd$0;
        boolean lambda$onAdd$3;
        switch (this.alpha) {
            case 0:
                lambda$onAdd$0 = this.bravo.lambda$onAdd$0(fVar);
                return lambda$onAdd$0;
            default:
                lambda$onAdd$3 = this.bravo.lambda$onAdd$3(fVar);
                return lambda$onAdd$3;
        }
    }
}
