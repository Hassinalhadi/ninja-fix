package s6;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import od.C2227d;

/* loaded from: classes2.dex */
public abstract class H4 {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r9 == r3) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v2, types: [fd.a, Nd.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [vf.ab, fd.f, fd.d] */
    /* JADX WARN: Type inference failed for: r7v1, types: [vf.ab, fd.d] */
    /* JADX WARN: Type inference failed for: r7v2, types: [vf.P, vf.ah] */
    /* JADX WARN: Type inference failed for: r7v4, types: [fd.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(fd.f fVar, C2227d c2227d, Pd.c cVar) {
        ?? r22;
        Object obj;
        int i4;
        Object tango;
        int i5 = 2;
        int i10 = 1;
        if (cVar instanceof fd.a) {
            fd.a aVar = (fd.a) cVar;
            int i11 = aVar.silver;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aVar.silver = i11 - RecyclerView.UNDEFINED_DURATION;
                r22 = aVar;
                Object obj2 = r22.red;
                obj = Od.a.alpha;
                i4 = r22.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj2);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2227d = r22.purple;
                    fVar = r22.alpha;
                    ResultKt.alpha(obj2);
                } else {
                    ResultKt.alpha(obj2);
                    vf.a0 a0Var = c2227d.echo;
                    r22.alpha = fVar;
                    r22.purple = c2227d;
                    r22.silver = 1;
                    vf.aa aaVar = fd.i.alpha;
                    vf.J j5 = new vf.J(a0Var);
                    obj2 = fVar.charlie().plus(j5).plus(fd.i.alpha);
                    vf.I i12 = (vf.I) r22.getContext().get(vf.H.alpha);
                    if (i12 != null) {
                        j5.crimson(new Lb.W(i10, i12.papa(true, true, new Lb.W(i5, j5))));
                    }
                }
                Nd.h hVar = (Nd.h) obj2;
                ?? golf = vf.ad.golf(fVar, hVar.plus(new fd.j(hVar)), new fd.b(fVar, c2227d, null), 2);
                r22.alpha = null;
                r22.purple = null;
                r22.silver = 2;
                tango = golf.tango(r22);
                if (tango != obj) {
                    return obj;
                }
                return tango;
            }
        }
        r22 = new Pd.c(cVar);
        Object obj22 = r22.red;
        obj = Od.a.alpha;
        i4 = r22.silver;
        if (i4 == 0) {
        }
        Nd.h hVar2 = (Nd.h) obj22;
        ?? golf2 = vf.ad.golf(fVar, hVar2.plus(new fd.j(hVar2)), new fd.b(fVar, c2227d, null), 2);
        r22.alpha = null;
        r22.purple = null;
        r22.silver = 2;
        tango = golf2.tango(r22);
        if (tango != obj) {
        }
    }

    public static int bravo(ArrayList arrayList, InputStream inputStream, G3.g gVar) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new com.bumptech.glide.load.resource.bitmap.w(inputStream, gVar);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    int delta = ((E3.e) arrayList.get(i4)).delta(inputStream, gVar);
                    if (delta != -1) {
                        return delta;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType charlie(ArrayList arrayList, InputStream inputStream, G3.g gVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new com.bumptech.glide.load.resource.bitmap.w(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                ImageHeaderParser$ImageType charlie = ((E3.e) arrayList.get(i4)).charlie(inputStream);
                inputStream.reset();
                if (charlie != ImageHeaderParser$ImageType.UNKNOWN) {
                    return charlie;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType delta(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                ImageHeaderParser$ImageType alpha = ((E3.e) arrayList.get(i4)).alpha(byteBuffer);
                AtomicReference atomicReference = Y3.b.alpha;
                if (alpha != ImageHeaderParser$ImageType.UNKNOWN) {
                    return alpha;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = Y3.b.alpha;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
