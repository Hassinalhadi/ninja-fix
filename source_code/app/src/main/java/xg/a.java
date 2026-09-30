package xg;

import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import vg.at;
import vg.l;
import vg.m;

/* loaded from: classes2.dex */
public final class a extends l {
    public final Moshi alpha;

    public a(Moshi moshi) {
        this.alpha = moshi;
    }

    public static Set charlie(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.EMPTY_SET;
    }

    @Override // vg.l
    public final m alpha(Type type, Annotation[] annotationArr) {
        return new b(this.alpha.adapter(type, charlie(annotationArr)));
    }

    @Override // vg.l
    public final m bravo(Type type, Annotation[] annotationArr, at atVar) {
        return new c(this.alpha.adapter(type, charlie(annotationArr)));
    }
}
