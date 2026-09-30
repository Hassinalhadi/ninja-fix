package d0;

import android.view.RenderNode;

/* renamed from: d0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1574l {
    public static int alpha(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int bravo(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void charlie(RenderNode renderNode, int i4) {
        renderNode.setAmbientShadowColor(i4);
    }

    public static void delta(RenderNode renderNode, int i4) {
        renderNode.setSpotShadowColor(i4);
    }
}
