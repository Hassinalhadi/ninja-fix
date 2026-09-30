package com.google.maps.android.data;

import com.google.maps.android.data.Layer;
import x6.InterfaceC3302g;
import x6.InterfaceC3304i;
import x6.j;
import z6.f;
import z6.g;
import z6.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC3304i, InterfaceC3302g, j {
    public final /* synthetic */ Renderer alpha;
    public final /* synthetic */ Layer.OnFeatureClickListener bravo;

    public /* synthetic */ a(Renderer renderer, Layer.OnFeatureClickListener onFeatureClickListener) {
        this.alpha = renderer;
        this.bravo = onFeatureClickListener;
    }

    @Override // x6.InterfaceC3302g
    public boolean onMarkerClick(f fVar) {
        boolean lambda$setOnFeatureClickListener$1;
        lambda$setOnFeatureClickListener$1 = this.alpha.lambda$setOnFeatureClickListener$1(this.bravo, fVar);
        return lambda$setOnFeatureClickListener$1;
    }

    @Override // x6.InterfaceC3304i
    public void onPolygonClick(g gVar) {
        this.alpha.lambda$setOnFeatureClickListener$0(this.bravo, gVar);
    }

    @Override // x6.j
    public void onPolylineClick(h hVar) {
        this.alpha.lambda$setOnFeatureClickListener$2(this.bravo, hVar);
    }
}
