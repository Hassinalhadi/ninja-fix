package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class al {
    public static void alpha(Object obj, Object obj2) {
        ak akVar = (ak) obj;
        if (obj2 == null) {
            if (!akVar.isEmpty()) {
                Iterator it = akVar.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
            return;
        }
        throw new ClassCastException();
    }

    public static ak bravo(Object obj, Object obj2) {
        ak akVar = (ak) obj;
        ak akVar2 = (ak) obj2;
        if (!akVar2.isEmpty()) {
            if (!akVar.alpha) {
                akVar = akVar.charlie();
            }
            akVar.bravo();
            if (!akVar2.isEmpty()) {
                akVar.putAll(akVar2);
            }
        }
        return akVar;
    }
}
