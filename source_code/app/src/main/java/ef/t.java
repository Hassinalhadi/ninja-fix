package ef;

import B9.K;
import Ie.aq;
import Ie.au;
import Ie.av;
import cf.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2335k;
import pe.ao;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;
import se.AbstractC2853c;

/* loaded from: classes2.dex */
public final class t extends AbstractC2853c {

    /* renamed from: d, reason: collision with root package name */
    public final D5.s f12617d;
    public final av e;

    /* renamed from: f, reason: collision with root package name */
    public final C1653a f12618f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(D5.s c3, av avVar, int i4) {
        super(r3, (InterfaceC2335k) c3.charlie, r5, r6, r7, avVar.white, i4, ao.red);
        int i5;
        Intrinsics.echo(c3, "c");
        K k6 = (K) c3.alpha;
        ff.l lVar = (ff.l) k6.alpha;
        C2470f c2470f = C2471g.alpha;
        Ne.f bravo = Zd.a.bravo((Ke.e) c3.bravo, avVar.teal);
        au auVar = avVar.yellow;
        Intrinsics.delta(auVar, "proto.variance");
        int ordinal = auVar.ordinal();
        int i10 = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i5 = 1;
                    this.f12617d = c3;
                    this.e = avVar;
                    this.f12618f = new C1653a((ff.l) k6.alpha, new Xe.s(15, this));
                }
                throw new NoWhenBranchMatchedException();
            }
            i10 = 3;
        }
        i5 = i10;
        this.f12617d = c3;
        this.e = avVar;
        this.f12618f = new C1653a((ff.l) k6.alpha, new Xe.s(15, this));
    }

    @Override // se.AbstractC2858h
    public final void a0(y type) {
        Intrinsics.echo(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    @Override // se.AbstractC2858h
    public final List b0() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        D5.s sVar = this.f12617d;
        G6.j jVar = (G6.j) sVar.delta;
        av avVar = this.e;
        Intrinsics.echo(avVar, "<this>");
        List list = avVar.f1503a;
        boolean isEmpty = list.isEmpty();
        ?? r32 = list;
        if (isEmpty) {
            r32 = 0;
        }
        if (r32 == 0) {
            List<Integer> upperBoundIdList = avVar.f1504b;
            Intrinsics.delta(upperBoundIdList, "upperBoundIdList");
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBoundIdList, 10);
            r32 = new ArrayList(collectionSizeOrDefault2);
            for (Integer it : upperBoundIdList) {
                Intrinsics.delta(it, "it");
                r32.add(jVar.alpha(it.intValue()));
            }
        }
        if (!r32.isEmpty()) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r32, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = r32.iterator();
            while (it2.hasNext()) {
                arrayList.add(((z) sVar.hotel).golf((aq) it2.next()));
            }
            return arrayList;
        }
        return ab.juliet(Ue.e.echo(this).november());
    }

    @Override // G3.a, qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return this.f12618f;
    }
}
