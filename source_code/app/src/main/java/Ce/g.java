package Ce;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2347w;
import pe.aq;

/* loaded from: classes2.dex */
public final class g extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ j purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                return AbstractC2347w.charlie(this.purple);
            case 1:
                j jVar = this.purple;
                ArrayList typeParameters = jVar.f907a.getTypeParameters();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    ve.ae aeVar = (ve.ae) it.next();
                    aq alpha = ((Be.f) jVar.f909c.white).alpha(aeVar);
                    if (alpha != null) {
                        arrayList.add(alpha);
                    } else {
                        throw new AssertionError("Parameter " + aeVar + " surely belongs to class " + jVar.f907a + ", so it must be resolved");
                    }
                }
                return arrayList;
            default:
                j jVar2 = this.purple;
                if (Ue.e.foxtrot(jVar2) != null) {
                    ((Be.a) jVar2.yellow.purple).whiskey.getClass();
                    return null;
                }
                return null;
        }
    }
}
