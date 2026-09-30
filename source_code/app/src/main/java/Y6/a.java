package Y6;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import g7.i;

/* loaded from: classes2.dex */
public final class a extends ViewOutlineProvider {
    public final Rect alpha = new Rect();
    public final /* synthetic */ ShapeableImageView bravo;

    public a(ShapeableImageView shapeableImageView) {
        this.bravo = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.bravo;
        if (shapeableImageView.f8032b == null) {
            return;
        }
        if (shapeableImageView.f8031a == null) {
            shapeableImageView.f8031a = new i(shapeableImageView.f8032b);
        }
        RectF rectF = shapeableImageView.purple;
        Rect rect = this.alpha;
        rectF.round(rect);
        shapeableImageView.f8031a.setBounds(rect);
        shapeableImageView.f8031a.getOutline(outline);
    }
}
