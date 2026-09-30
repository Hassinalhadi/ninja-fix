package aw;

import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final class q {
    public final List alpha;
    public final Size bravo;
    public final int charlie;
    public final int delta;
    public String echo;
    public boolean foxtrot = false;
    public long golf = 1;

    public q(Surface surface) {
        Size size;
        int i4;
        int i5 = 0;
        this.alpha = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            AbstractC3066u3.delta("OutputConfigCompat", "Unable to retrieve surface size.", e);
            size = null;
        }
        this.bravo = size;
        try {
            i5 = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            AbstractC3066u3.delta("OutputConfigCompat", "Unable to retrieve surface format.", e4);
        }
        this.charlie = i5;
        try {
            i4 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            AbstractC3066u3.delta("OutputConfigCompat", "Unable to retrieve surface generation id.", e5);
            i4 = -1;
        }
        this.delta = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.bravo.equals(qVar.bravo) && this.charlie == qVar.charlie && this.delta == qVar.delta && this.foxtrot == qVar.foxtrot && this.golf == qVar.golf && Objects.equals(this.echo, qVar.echo)) {
                List list = this.alpha;
                int size = list.size();
                List list2 = qVar.alpha;
                int min = Math.min(size, list2.size());
                for (int i4 = 0; i4 < min; i4++) {
                    if (list.get(i4) == list2.get(i4)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() ^ 31;
        int i4 = this.delta ^ ((hashCode2 << 5) - hashCode2);
        int hashCode3 = this.bravo.hashCode() ^ ((i4 << 5) - i4);
        int i5 = this.charlie ^ ((hashCode3 << 5) - hashCode3);
        int i10 = (this.foxtrot ? 1 : 0) ^ ((i5 << 5) - i5);
        int i11 = (i10 << 5) - i10;
        String str = this.echo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode ^ i11;
        int i13 = (i12 << 5) - i12;
        long j5 = this.golf;
        return ((int) (j5 ^ (j5 >>> 32))) ^ i13;
    }
}
