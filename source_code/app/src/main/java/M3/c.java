package M3;

import Y3.f;
import Y3.l;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.w;
import java.io.File;

/* loaded from: classes3.dex */
public final class c implements w {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void alpha() {
    }

    private final void charlie() {
    }

    private final void echo() {
    }

    @Override // com.bumptech.glide.load.engine.w
    public final void bravo() {
        switch (this.alpha) {
            case 0:
                return;
            case 1:
                ((AnimatedImageDrawable) this.purple).stop();
                ((AnimatedImageDrawable) this.purple).clearAnimationCallbacks();
                return;
            case 2:
            default:
                return;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Class delta() {
        switch (this.alpha) {
            case 0:
                return byte[].class;
            case 1:
                return Drawable.class;
            case 2:
                return ((File) this.purple).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return (byte[]) this.purple;
            case 1:
                return (AnimatedImageDrawable) this.purple;
            case 2:
                return (File) this.purple;
            default:
                return (Bitmap) this.purple;
        }
    }

    @Override // com.bumptech.glide.load.engine.w
    public final int getSize() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.alpha) {
            case 0:
                return ((byte[]) this.purple).length;
            case 1:
                intrinsicWidth = ((AnimatedImageDrawable) this.purple).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.purple).getIntrinsicHeight();
                return l.delta(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            case 2:
                return 1;
            default:
                return l.charlie((Bitmap) this.purple);
        }
    }

    public c(byte[] bArr) {
        this.alpha = 0;
        f.charlie(bArr, "Argument must not be null");
        this.purple = bArr;
    }

    public c(File file) {
        this.alpha = 2;
        f.charlie(file, "Argument must not be null");
        this.purple = file;
    }
}
