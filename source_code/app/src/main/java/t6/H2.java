package t6;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ve.AbstractC3192d;
import ve.C3193e;

/* loaded from: classes2.dex */
public abstract class H2 {
    public static final long alpha(float f5, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final C3193e bravo(Annotation[] annotationArr, Ne.c fqName) {
        Annotation annotation;
        Intrinsics.echo(annotationArr, "<this>");
        Intrinsics.echo(fqName, "fqName");
        int length = annotationArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                annotation = annotationArr[i4];
                if (Intrinsics.areEqual(AbstractC3192d.alpha(AbstractC3062u.bravo(AbstractC3062u.alpha(annotation))).bravo(), fqName)) {
                    break;
                }
                i4++;
            } else {
                annotation = null;
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new C3193e(annotation);
    }

    public static final ArrayList charlie(Annotation[] annotationArr) {
        Intrinsics.echo(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C3193e(annotation));
        }
        return arrayList;
    }
}
