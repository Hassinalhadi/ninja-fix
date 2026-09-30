package Q6;

import A2.q;
import android.view.View;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;
import t6.j4;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ a(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15) {
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i10 - i4 != i14 - i12 || i11 - i5 != i15 - i13) {
                    view.post(new q(14, carouselLayoutManager));
                    return;
                }
                return;
            default:
                int i16 = PreviewView.f2959f;
                PreviewView previewView = (PreviewView) obj;
                if (i10 - i4 != i14 - i12 || i11 - i5 != i15 - i13) {
                    previewView.alpha();
                    j4.alpha();
                    previewView.getViewPort();
                    return;
                }
                return;
        }
    }
}
