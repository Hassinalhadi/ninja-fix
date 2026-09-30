package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lf.AbstractC2075a;
import lf.AbstractC2078d;
import lf.C2087m;

/* loaded from: classes2.dex */
public final class al extends AbstractC2078d {
    public static final com.google.android.play.core.integrity.k purple = new com.google.android.play.core.integrity.k(3);
    public static final al red = new al(CollectionsKt.emptyList());

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lf.c, lf.a] */
    public al(List list) {
        this.alpha = C2087m.alpha;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            jVar.getClass();
            int foxtrot = purple.foxtrot(kotlin.jvm.internal.u.alpha.bravo(j.class));
            int alpha = this.alpha.alpha();
            if (alpha != 0) {
                if (alpha == 1) {
                    AbstractC2075a abstractC2075a = this.alpha;
                    Intrinsics.charlie(abstractC2075a, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    lf.r rVar = (lf.r) abstractC2075a;
                    int i4 = rVar.purple;
                    if (i4 == foxtrot) {
                        this.alpha = new lf.r(foxtrot, jVar);
                    } else {
                        ?? obj = new Object();
                        obj.alpha = new Object[20];
                        obj.purple = 0;
                        this.alpha = obj;
                        obj.bravo(i4, rVar.alpha);
                    }
                }
                this.alpha.bravo(foxtrot, jVar);
            } else {
                this.alpha = new lf.r(foxtrot, jVar);
            }
        }
    }
}
