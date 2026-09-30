package a9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.ap;
import t6.AbstractC2982d3;
import x2.C3287h;

/* loaded from: classes2.dex */
public final class h implements ap {
    public static final h bravo = new h(0);
    public static final h charlie = new h(1);
    public static final h delta = new h(2);
    public static final h echo = new h(3);
    public static final h foxtrot = new h(4);
    public final /* synthetic */ int alpha;

    public /* synthetic */ h(int i4) {
        this.alpha = i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.ap
    public final boolean alpha(int i4) {
        switch (this.alpha) {
            case 0:
                if (i4 == 0 || i4 == 1 || i4 == 2) {
                    return true;
                }
                return false;
            case 1:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
                    return true;
                }
                return false;
            case 2:
                if (C3287h.alpha(i4) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC2982d3.bravo(i4) != 0) {
                    return true;
                }
                return false;
            default:
                if (i4 == 0 || i4 == 1 || i4 == 2) {
                    return true;
                }
                return false;
        }
    }
}
