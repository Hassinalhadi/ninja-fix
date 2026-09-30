package androidx.camera.core;

import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import s6.T7;

/* renamed from: androidx.camera.core.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0533o {
    public static final C0533o bravo;
    public static final C0533o charlie;
    public final LinkedHashSet alpha;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new androidx.camera.core.impl.as(0));
        bravo = new C0533o(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new androidx.camera.core.impl.as(1));
        charlie = new C0533o(linkedHashSet2);
    }

    public C0533o(LinkedHashSet linkedHashSet) {
        this.alpha = linkedHashSet;
    }

    public final ArrayList alpha(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            InterfaceC0532n interfaceC0532n = (InterfaceC0532n) it.next();
            List<InterfaceC0523v> unmodifiableList = Collections.unmodifiableList(arrayList2);
            androidx.camera.core.impl.as asVar = (androidx.camera.core.impl.as) interfaceC0532n;
            asVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC0523v interfaceC0523v : unmodifiableList) {
                T7.bravo("The camera info doesn't contain internal implementation.", interfaceC0523v instanceof InterfaceC0523v);
                if (interfaceC0523v.echo() == asVar.bravo) {
                    arrayList3.add(interfaceC0523v);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer bravo() {
        Iterator it = this.alpha.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0532n interfaceC0532n = (InterfaceC0532n) it.next();
            if (interfaceC0532n instanceof androidx.camera.core.impl.as) {
                Integer valueOf = Integer.valueOf(((androidx.camera.core.impl.as) interfaceC0532n).bravo);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final InterfaceC0525x charlie(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0525x) it.next()).alpha());
        }
        ArrayList alpha = alpha(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC0525x interfaceC0525x = (InterfaceC0525x) it2.next();
            if (alpha.contains(interfaceC0525x.alpha())) {
                linkedHashSet2.add(interfaceC0525x);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC0525x) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
