package vg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class b extends l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    @Override // vg.l
    public m alpha(Type type, Annotation[] annotationArr) {
        switch (this.alpha) {
            case 0:
                if (RequestBody.class.isAssignableFrom(A.hotel(type))) {
                    return C3222a.silver;
                }
                return null;
            default:
                return super.alpha(type, annotationArr);
        }
    }

    @Override // vg.l
    public final m bravo(Type type, Annotation[] annotationArr, at atVar) {
        switch (this.alpha) {
            case 0:
                if (type == ResponseBody.class) {
                    if (A.lima(annotationArr, yg.w.class)) {
                        return C3222a.teal;
                    }
                    return C3222a.red;
                }
                if (type == Void.class) {
                    return C3222a.yellow;
                }
                if (A.mike(type)) {
                    return C3222a.white;
                }
                return null;
            default:
                if (A.hotel(type) != s1.af.black()) {
                    return null;
                }
                return new tg.b(3, atVar.delta(A.golf(0, (ParameterizedType) type), annotationArr));
        }
    }
}
