package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class u {
    public final J2.t alpha;
    public final List bravo;
    public final String charlie;

    public u(Class cls, Class cls2, Class cls3, List list, J2.t tVar) {
        this.alpha = tVar;
        if (!list.isEmpty()) {
            this.bravo = list;
            this.charlie = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final w alpha(int i4, int i5, E3.i iVar, com.bumptech.glide.load.data.g gVar, g gVar2) {
        J2.t tVar = this.alpha;
        List list = (List) tVar.charlie();
        try {
            List list2 = this.bravo;
            int size = list2.size();
            w wVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    wVar = ((j) list2.get(i10)).alpha(i4, i5, iVar, gVar, gVar2);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (wVar != null) {
                    break;
                }
            }
            if (wVar != null) {
                return wVar;
            }
            throw new GlideException(this.charlie, new ArrayList(list));
        } finally {
            tVar.alpha(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.bravo.toArray()) + '}';
    }
}
