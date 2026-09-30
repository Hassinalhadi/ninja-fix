package Q6;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes2.dex */
public final class d {
    public final int alpha;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ CarouselLayoutManager charlie;

    public d(int i4) {
        this.alpha = i4;
    }

    public final int alpha() {
        switch (this.bravo) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.charlie;
                if (carouselLayoutManager.C()) {
                    return carouselLayoutManager.november;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i4) {
        this(1);
        this.bravo = i4;
        switch (i4) {
            case 1:
                this.charlie = carouselLayoutManager;
                this(0);
                return;
            default:
                this.charlie = carouselLayoutManager;
                return;
        }
    }
}
