package wg;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import vg.at;
import vg.l;
import vg.m;

/* loaded from: classes2.dex */
public final class a extends l {
    public final com.google.gson.l alpha;

    public a(com.google.gson.l lVar) {
        this.alpha = lVar;
    }

    public static a charlie(com.google.gson.l lVar) {
        if (lVar != null) {
            return new a(lVar);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // vg.l
    public final m alpha(Type type, Annotation[] annotationArr) {
        TypeToken<?> typeToken = TypeToken.get(type);
        com.google.gson.l lVar = this.alpha;
        return new b(lVar, lVar.foxtrot(typeToken));
    }

    @Override // vg.l
    public final m bravo(Type type, Annotation[] annotationArr, at atVar) {
        TypeToken<?> typeToken = TypeToken.get(type);
        com.google.gson.l lVar = this.alpha;
        return new gd.a(12, lVar, lVar.foxtrot(typeToken));
    }
}
