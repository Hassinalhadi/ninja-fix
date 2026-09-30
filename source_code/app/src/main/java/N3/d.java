package N3;

import E3.i;
import E3.k;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.w;
import java.io.File;

/* loaded from: classes3.dex */
public final class d implements k {
    public final /* synthetic */ int alpha;

    public /* synthetic */ d(int i4) {
        this.alpha = i4;
    }

    @Override // E3.k
    public final /* bridge */ /* synthetic */ boolean alpha(Object obj, i iVar) {
        switch (this.alpha) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }

    @Override // E3.k
    public final w bravo(Object obj, int i4, int i5, i iVar) {
        switch (this.alpha) {
            case 0:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new b(drawable, 0);
                }
                return null;
            case 1:
                return new M3.c((File) obj);
            default:
                return new M3.c(3, (Bitmap) obj);
        }
    }
}
