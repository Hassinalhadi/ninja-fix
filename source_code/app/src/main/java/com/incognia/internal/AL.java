package com.incognia.internal;

import android.content.Context;

/* loaded from: classes2.dex */
public final class AL implements M1 {
    static {
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return false;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 1;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        FVj fVj = FVj.f8708b;
        vQ vQVar = new vQ(context, FVj.f8707W);
        vQ vQVar2 = new vQ(context, FVj.f8709f9);
        vQ vQVar3 = new vQ(context, FVj.sVU);
        vQVar.b();
        vQVar2.b();
        vQVar3.b();
        for (String str : fVj.b()) {
            if (context.getDatabasePath(str).exists()) {
                context.deleteDatabase(str);
            }
        }
    }
}
