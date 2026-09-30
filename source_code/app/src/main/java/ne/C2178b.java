package ne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.reflect.jvm.internal.impl.types.AbstractC2040b;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.at;
import me.n;
import pe.AbstractC2347w;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2349y;
import pe.ao;
import pe.aq;

/* renamed from: ne.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2178b extends AbstractC2040b {
    public final /* synthetic */ C2179c charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178b(C2179c c2179c) {
        super(c2179c.teal);
        this.charlie = c2179c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final Collection bravo() {
        List<Ne.b> juliet;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        C2179c c2179c = this.charlie;
        int ordinal = c2179c.yellow.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                int i4 = c2179c.f13121a;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        juliet = CollectionsKt.listOf(C2179c.f13120f, new Ne.b(n.echo, EnumC2181e.teal.alpha(i4)));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    juliet = CollectionsKt.listOf(C2179c.f13120f, new Ne.b(n.juliet, EnumC2181e.silver.alpha(i4)));
                }
            } else {
                juliet = ab.juliet(C2179c.e);
            }
        } else {
            juliet = ab.juliet(C2179c.e);
        }
        InterfaceC2349y lima = c2179c.white.lima();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(juliet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Ne.b bVar : juliet) {
            InterfaceC2330f delta = AbstractC2347w.delta(lima, bVar);
            if (delta != null) {
                List s3 = CollectionsKt.s(delta.tango().getParameters().size(), c2179c.f13124d);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(s3, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                Iterator it = s3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new at(((aq) it.next()).oscar()));
                }
                al.purple.getClass();
                arrayList.add(kotlin.reflect.jvm.internal.impl.types.ab.bravo(al.red, delta, arrayList2));
            } else {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
        }
        return CollectionsKt.z(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    public final ao echo() {
        return ao.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        return this.charlie.f13124d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC2040b, kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        return this.charlie;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC2040b
    /* renamed from: oscar */
    public final InterfaceC2330f kilo() {
        return this.charlie;
    }

    public final String toString() {
        return this.charlie.toString();
    }
}
