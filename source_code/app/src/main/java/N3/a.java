package N3;

import E3.i;
import E3.k;
import G3.g;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.w;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s6.H4;
import w.o;

/* loaded from: classes3.dex */
public final class a implements k {
    public final /* synthetic */ int alpha;
    public final o bravo;

    public /* synthetic */ a(o oVar, int i4) {
        this.alpha = i4;
        this.bravo = oVar;
    }

    @Override // E3.k
    public final boolean alpha(Object obj, i iVar) {
        switch (this.alpha) {
            case 0:
                ImageHeaderParser$ImageType delta = H4.delta((ArrayList) this.bravo.purple, (ByteBuffer) obj);
                if (delta != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || delta != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
            default:
                o oVar = this.bravo;
                ImageHeaderParser$ImageType charlie = H4.charlie((ArrayList) oVar.purple, (InputStream) obj, (g) oVar.red);
                if (charlie != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || charlie != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
        }
    }

    @Override // E3.k
    public final w bravo(Object obj, int i4, int i5, i iVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.alpha) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return o.sierra(createSource, i4, i5, iVar);
            default:
                createSource2 = ImageDecoder.createSource(Y3.b.bravo((InputStream) obj));
                return o.sierra(createSource2, i4, i5, iVar);
        }
    }
}
