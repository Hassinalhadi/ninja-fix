package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public final class ag extends ah {
    @Override // com.google.crypto.tink.shaded.protobuf.ah
    public final void alpha(long j5, Object obj) {
        ((AbstractC1484b) ((aa) M.delta.india(j5, obj))).alpha = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ah
    public final void bravo(x xVar, x xVar2, long j5) {
        L l10 = M.delta;
        aa aaVar = (aa) l10.india(j5, xVar);
        aa aaVar2 = (aa) l10.india(j5, xVar2);
        int size = aaVar.size();
        int size2 = aaVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1484b) aaVar).alpha) {
                aaVar = aaVar.golf(size2 + size);
            }
            aaVar.addAll(aaVar2);
        }
        if (size > 0) {
            aaVar2 = aaVar;
        }
        M.oscar(xVar, j5, aaVar2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ah
    public final List charlie(long j5, Object obj) {
        int i4;
        aa aaVar = (aa) M.delta.india(j5, obj);
        if (!((AbstractC1484b) aaVar).alpha) {
            int size = aaVar.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size * 2;
            }
            aa golf = aaVar.golf(i4);
            M.oscar(obj, j5, golf);
            return golf;
        }
        return aaVar;
    }
}
