package P3;

import E0.m;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.w;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public final class i implements E3.k {
    public final /* synthetic */ int alpha;
    public final G3.b bravo;

    public i() {
        this.alpha = 1;
        this.bravo = new com.google.mlkit.common.sdkinternal.b(3);
    }

    @Override // E3.k
    public final /* bridge */ /* synthetic */ boolean alpha(Object obj, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                return true;
            default:
                m.uniform(obj);
                return true;
        }
    }

    @Override // E3.k
    public final w bravo(Object obj, int i4, int i5, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                return com.bumptech.glide.load.resource.bitmap.c.charlie(this.bravo, ((D3.d) obj).bravo());
            default:
                return charlie(m.echo(obj), i4, i5, iVar);
        }
    }

    public com.bumptech.glide.load.resource.bitmap.c charlie(ImageDecoder.Source source, int i4, int i5, E3.i iVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new L3.b(i4, i5, iVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i4 + "x" + i5 + Constants.AES_SUFFIX);
        }
        return new com.bumptech.glide.load.resource.bitmap.c((com.google.mlkit.common.sdkinternal.b) this.bravo, decodeBitmap);
    }

    public i(G3.b bVar) {
        this.alpha = 0;
        this.bravo = bVar;
    }
}
