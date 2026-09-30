package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class h extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ i purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar;
        Collection supertypes;
        Collection collection;
        switch (this.alpha) {
            case 0:
                ap it = (ap) obj;
                Intrinsics.echo(it, "it");
                this.purple.getClass();
                if (it instanceof i) {
                    iVar = (i) it;
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    supertypes = CollectionsKt.a(((f) iVar.bravo.invoke()).alpha, iVar.delta());
                } else {
                    supertypes = it.lima();
                    Intrinsics.delta(supertypes, "supertypes");
                }
                return supertypes;
            case 1:
                y it2 = (y) obj;
                Intrinsics.echo(it2, "it");
                this.purple.india(it2);
                return Unit.INSTANCE;
            default:
                f supertypes2 = (f) obj;
                Intrinsics.echo(supertypes2, "supertypes");
                i iVar2 = this.purple;
                pe.ao echo = iVar2.echo();
                new h(iVar2, 0);
                new h(iVar2, 1);
                echo.getClass();
                Collection superTypes = supertypes2.alpha;
                Intrinsics.echo(superTypes, "superTypes");
                boolean isEmpty = superTypes.isEmpty();
                List list = null;
                Collection collection2 = superTypes;
                if (isEmpty) {
                    y charlie = iVar2.charlie();
                    if (charlie != null) {
                        collection = kotlin.collections.ab.juliet(charlie);
                    } else {
                        collection = null;
                    }
                    if (collection == null) {
                        collection = CollectionsKt.emptyList();
                    }
                    collection2 = collection;
                }
                if (collection2 instanceof List) {
                    list = (List) collection2;
                }
                if (list == null) {
                    list = CollectionsKt.z(collection2);
                }
                List hotel = iVar2.hotel(list);
                Intrinsics.echo(hotel, "<set-?>");
                supertypes2.bravo = hotel;
                return Unit.INSTANCE;
        }
    }
}
