package com.google.gson.internal.bind;

import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.u;

/* loaded from: classes2.dex */
public final class k implements u, o {
    public final /* synthetic */ TreeTypeAdapter alpha;

    public k(TreeTypeAdapter treeTypeAdapter) {
        this.alpha = treeTypeAdapter;
    }

    public final q alpha(String str) {
        com.google.gson.l lVar = this.alpha.gson;
        lVar.getClass();
        if (str == null) {
            return r.alpha;
        }
        Class<?> cls = str.getClass();
        g gVar = new g();
        lVar.kilo(str, cls, gVar);
        return gVar.pink();
    }
}
