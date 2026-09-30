package L3;

import E3.h;
import E3.i;
import E3.j;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.u;

/* loaded from: classes3.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {
    public final u alpha = u.alpha();
    public final int bravo;
    public final int charlie;
    public final E3.b delta;
    public final m echo;
    public final boolean foxtrot;
    public final j golf;

    public b(int i4, int i5, i iVar) {
        boolean z2;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = (E3.b) iVar.charlie(o.foxtrot);
        this.echo = (m) iVar.charlie(m.golf);
        h hVar = o.india;
        if (iVar.charlie(hVar) != null && ((Boolean) iVar.charlie(hVar)).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.foxtrot = z2;
        this.golf = (j) iVar.charlie(o.golf);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [L3.a, java.lang.Object] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        ColorSpace.Named unused;
        if (this.alpha.charlie(this.bravo, this.charlie, this.foxtrot, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.delta == E3.b.purple) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        size = imageInfo.getSize();
        int i4 = this.bravo;
        if (i4 == Integer.MIN_VALUE) {
            i4 = size.getWidth();
        }
        int i5 = this.charlie;
        if (i5 == Integer.MIN_VALUE) {
            i5 = size.getHeight();
        }
        float bravo = this.echo.bravo(size.getWidth(), size.getHeight(), i4, i5);
        int round = Math.round(size.getWidth() * bravo);
        int round2 = Math.round(size.getHeight() * bravo);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + bravo);
        }
        imageDecoder.setTargetSize(round, round2);
        j jVar = this.golf;
        if (jVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                if (jVar == j.alpha) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named);
                            imageDecoder.setTargetColorSpace(colorSpace2);
                            return;
                        }
                    }
                }
                named = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i10 >= 26) {
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
