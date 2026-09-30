package Q6;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.ao;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class b extends ao {
    public final /* synthetic */ CarouselLayoutManager alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.alpha = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.ao
    public final int calculateDxToMakeVisible(View view, int i4) {
        this.alpha.getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.ao
    public final int calculateDyToMakeVisible(View view, int i4) {
        this.alpha.getClass();
        return 0;
    }

    @Override // androidx.recyclerview.widget.a0
    public final PointF computeScrollVectorForPosition(int i4) {
        this.alpha.getClass();
        return null;
    }
}
