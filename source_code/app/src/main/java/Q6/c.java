package Q6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import com.google.android.material.carousel.CarouselLayoutManager;
import delivery.samurai.android.R;
import j1.AbstractC1928b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends I {
    public final Paint alpha;
    public final List bravo;

    public c() {
        Paint paint = new Paint();
        this.alpha = paint;
        this.bravo = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.I
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        Canvas canvas2;
        int emerald;
        int fuchsia;
        int i4;
        int i5;
        super.onDrawOver(canvas, recyclerView, b0Var);
        Paint paint = this.alpha;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC1928b.alpha;
            float f5 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f5)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f5)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f5)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f5))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).B()) {
                d dVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).quebec;
                switch (dVar.bravo) {
                    case 0:
                        i4 = 0;
                        break;
                    default:
                        i4 = dVar.charlie.gold();
                        break;
                }
                float f10 = i4;
                d dVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).quebec;
                switch (dVar2.bravo) {
                    case 0:
                        i5 = dVar2.charlie.oscar;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = dVar2.charlie;
                        i5 = carouselLayoutManager.oscar - carouselLayoutManager.cyan();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f10, 0.0f, i5, paint);
            } else {
                canvas2 = canvas;
                d dVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).quebec;
                switch (dVar3.bravo) {
                    case 0:
                        emerald = dVar3.charlie.emerald();
                        break;
                    default:
                        emerald = 0;
                        break;
                }
                float f11 = emerald;
                d dVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).quebec;
                switch (dVar4.bravo) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = dVar4.charlie;
                        fuchsia = carouselLayoutManager2.november - carouselLayoutManager2.fuchsia();
                        break;
                    default:
                        fuchsia = dVar4.charlie.november;
                        break;
                }
                canvas2.drawLine(f11, 0.0f, fuchsia, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
