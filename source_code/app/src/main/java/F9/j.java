package F9;

import H9.k;
import H9.l;
import H9.m;
import android.graphics.BitmapFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements E9.d {
    public final m alpha(File file) {
        int i4;
        H9.f fVar = H9.f.alpha;
        Intrinsics.echo(file, "file");
        if (!file.exists()) {
            return new k(H9.c.alpha);
        }
        if (!file.canRead()) {
            return new k(H9.d.alpha);
        }
        if (file.length() <= 0) {
            return new k(H9.b.alpha);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i5 = options.outWidth;
            if (i5 > 0 && (i4 = options.outHeight) > 0) {
                if (i5 >= 100 && i4 >= 100) {
                    return new l(file);
                }
                return new k(H9.g.alpha);
            }
            return new k(fVar);
        } catch (Exception unused) {
            return new k(fVar);
        }
    }

    public final m bravo(File file) {
        Intrinsics.echo(file, "file");
        m alpha = alpha(file);
        if (alpha instanceof k) {
            return alpha;
        }
        long length = file.length();
        if (length >= 460800) {
            return new k(new H9.e(length));
        }
        return new l(file);
    }

    public final m charlie(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((File) next).exists()) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        long j5 = 0;
        while (it2.hasNext()) {
            j5 += ((File) it2.next()).length();
        }
        if (j5 >= 10485760) {
            H9.i iVar = new H9.i(j5);
            arrayList.size();
            return new k(iVar);
        }
        return new l(Unit.INSTANCE);
    }
}
