package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import se.AbstractC2858h;
import se.C2866p;
import t6.Z1;

/* loaded from: classes3.dex */
public final class G implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ G(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object valueOf;
        boolean z2;
        Object obj;
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                H h4 = (H) obj2;
                bv.al alVar = new bv.al(h4.alpha.size());
                ArrayList arrayList = h4.alpha;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ap apVar = (ap) arrayList.get(i4);
                    Object obj3 = apVar.bravo;
                    int i5 = apVar.alpha;
                    if (obj3 != null) {
                        valueOf = new ao(Integer.valueOf(i5), apVar.bravo);
                    } else {
                        valueOf = Integer.valueOf(i5);
                    }
                    int foxtrot = alVar.foxtrot(valueOf);
                    if (foxtrot < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        obj = null;
                    } else {
                        obj = alVar.charlie[foxtrot];
                    }
                    if ((obj instanceof List) && (obj instanceof Yd.a)) {
                        boolean z10 = obj instanceof Yd.c;
                    }
                    if (obj != null) {
                        if (obj instanceof bv.ah) {
                            bv.ah ahVar = (bv.ah) obj;
                            ahVar.golf(apVar);
                            apVar = ahVar;
                        } else {
                            Object[] objArr = bv.as.alpha;
                            bv.ah ahVar2 = new bv.ah(2);
                            ahVar2.golf(obj);
                            ahVar2.golf(apVar);
                            apVar = ahVar2;
                        }
                    }
                    if (z2) {
                        int i10 = ~foxtrot;
                        alVar.bravo[i10] = valueOf;
                        alVar.charlie[i10] = apVar;
                    } else {
                        alVar.charlie[foxtrot] = apVar;
                    }
                }
                return new J.a(alVar);
            case 1:
                StringBuilder sb2 = new StringBuilder("Scope for type parameter ");
                Ic.c cVar = (Ic.c) obj2;
                sb2.append(((Ne.f) cVar.purple).bravo());
                return Z1.alpha(((AbstractC2858h) cVar.red).getUpperBounds(), sb2.toString());
            case 2:
                C2866p c2866p = (C2866p) obj2;
                c2866p.getClass();
                HashSet hashSet = new HashSet();
                for (Ne.f fVar : (Set) c2866p.echo.f13758b.invoke()) {
                    if (fVar != null) {
                        hashSet.addAll((Collection) c2866p.bravo.invoke(fVar));
                        hashSet.addAll((Collection) c2866p.charlie.invoke(fVar));
                    } else {
                        C2866p.hotel(5);
                        throw null;
                    }
                }
                return hashSet;
            default:
                return (List) obj2;
        }
    }
}
