package com.google.maps.android.clustering.view;

import x6.InterfaceC3300e;
import x6.InterfaceC3301f;
import x6.InterfaceC3302g;
import z6.f;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC3301f, InterfaceC3302g, InterfaceC3300e {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ DefaultAdvancedMarkersClusterRenderer bravo;

    public /* synthetic */ c(DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer, int i4) {
        this.alpha = i4;
        this.bravo = defaultAdvancedMarkersClusterRenderer;
    }

    @Override // x6.InterfaceC3300e
    public void onInfoWindowClick(f fVar) {
        this.bravo.lambda$onAdd$2(fVar);
    }

    @Override // x6.InterfaceC3301f
    public void onInfoWindowLongClick(f fVar) {
        switch (this.alpha) {
            case 0:
                this.bravo.lambda$onAdd$0(fVar);
                return;
            default:
                this.bravo.lambda$onAdd$3(fVar);
                return;
        }
    }

    @Override // x6.InterfaceC3302g
    public boolean onMarkerClick(f fVar) {
        boolean lambda$onAdd$1;
        lambda$onAdd$1 = this.bravo.lambda$onAdd$1(fVar);
        return lambda$onAdd$1;
    }
}
