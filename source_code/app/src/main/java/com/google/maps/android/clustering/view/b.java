package com.google.maps.android.clustering.view;

import com.google.maps.android.clustering.view.ClusterRendererMultipleItems;
import com.google.maps.android.clustering.view.DefaultAdvancedMarkersClusterRenderer;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ((ClusterRendererMultipleItems.AnimationTask) this.purple).cancel();
                return;
            case 1:
                ClusterRendererMultipleItems.ViewModifier.alpha((ClusterRendererMultipleItems.ViewModifier) this.purple);
                return;
            case 2:
                DefaultAdvancedMarkersClusterRenderer.ViewModifier.alpha((DefaultAdvancedMarkersClusterRenderer.ViewModifier) this.purple);
                return;
            default:
                DefaultClusterRenderer.ViewModifier.alpha((DefaultClusterRenderer.ViewModifier) this.purple);
                return;
        }
    }
}
