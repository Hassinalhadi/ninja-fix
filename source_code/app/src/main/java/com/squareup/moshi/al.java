package com.squareup.moshi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class al {
    public final ArrayList alpha = new ArrayList();
    public final ArrayDeque bravo = new ArrayDeque();
    public boolean charlie;
    public final /* synthetic */ Moshi delta;

    public al(Moshi moshi) {
        this.delta = moshi;
    }

    public final IllegalArgumentException alpha(IllegalArgumentException illegalArgumentException) {
        if (!this.charlie) {
            this.charlie = true;
            ArrayDeque arrayDeque = this.bravo;
            if (arrayDeque.size() != 1 || ((ak) arrayDeque.getFirst()).bravo != null) {
                StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    ak akVar = (ak) descendingIterator.next();
                    sb2.append("\nfor ");
                    sb2.append(akVar.alpha);
                    String str = akVar.bravo;
                    if (str != null) {
                        sb2.append(' ');
                        sb2.append(str);
                    }
                }
                return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void bravo(boolean z2) {
        ThreadLocal threadLocal;
        Map map;
        Map map2;
        Map map3;
        this.bravo.removeLast();
        if (this.bravo.isEmpty()) {
            threadLocal = this.delta.lookupChainThreadLocal;
            threadLocal.remove();
            if (z2) {
                map = this.delta.adapterCache;
                synchronized (map) {
                    try {
                        int size = this.alpha.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ak akVar = (ak) this.alpha.get(i4);
                            map2 = this.delta.adapterCache;
                            JsonAdapter jsonAdapter = (JsonAdapter) map2.put(akVar.charlie, akVar.delta);
                            if (jsonAdapter != null) {
                                akVar.delta = jsonAdapter;
                                map3 = this.delta.adapterCache;
                                map3.put(akVar.charlie, jsonAdapter);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
