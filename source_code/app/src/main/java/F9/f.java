package F9;

import android.content.Context;
import android.graphics.BitmapFactory;
import java.io.File;
import vf.ad;
import vf.ao;

/* loaded from: classes2.dex */
public final class f implements E9.a {
    public static final int alpha(f fVar, BitmapFactory.Options options, int i4, int i5) {
        fVar.getClass();
        int i10 = options.outHeight;
        int i11 = options.outWidth;
        int i12 = 1;
        if (i10 <= i5 && i11 <= i4) {
            return 1;
        }
        int i13 = i10 / 2;
        int i14 = i11 / 2;
        while (i13 / i12 >= i5 && i14 / i12 >= i4) {
            i12 *= 2;
        }
        return i12;
    }

    public static final Object bravo(f fVar, File file, File file2, int i4, long j5, int i5, int i10, String str, Pd.i iVar) {
        fVar.getClass();
        Cf.e eVar = ao.alpha;
        return ad.blue(Cf.d.purple, new c(str, file, file2, fVar, i4, j5, i5, i10, null), iVar);
    }

    public final Object charlie(Context context, File file, File file2, long j5, Integer num, String str, Pd.i iVar) {
        Cf.e eVar = ao.alpha;
        return ad.blue(Cf.d.purple, new b(str, file, num, j5, file2, context, this, null), iVar);
    }
}
