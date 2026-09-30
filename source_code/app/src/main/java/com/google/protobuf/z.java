package com.google.protobuf;

/* loaded from: classes2.dex */
public final class z extends aa {
    @Override // com.google.protobuf.aa
    public final void alpha(long j5, Object obj) {
        AbstractC1499b abstractC1499b = (AbstractC1499b) ((InterfaceC1516t) L.charlie.india(j5, obj));
        if (abstractC1499b.alpha) {
            abstractC1499b.alpha = false;
        }
    }

    @Override // com.google.protobuf.aa
    public final void bravo(Object obj, long j5, Object obj2) {
        K k6 = L.charlie;
        InterfaceC1516t interfaceC1516t = (InterfaceC1516t) k6.india(j5, obj);
        InterfaceC1516t interfaceC1516t2 = (InterfaceC1516t) k6.india(j5, obj2);
        int size = interfaceC1516t.size();
        int size2 = interfaceC1516t2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1499b) interfaceC1516t).alpha) {
                interfaceC1516t = interfaceC1516t.golf(size2 + size);
            }
            interfaceC1516t.addAll(interfaceC1516t2);
        }
        if (size > 0) {
            interfaceC1516t2 = interfaceC1516t;
        }
        L.oscar(obj, j5, interfaceC1516t2);
    }
}
