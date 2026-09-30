package com.google.gson;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TypeAdapter$NullSafeTypeAdapter extends ad {
    final /* synthetic */ ad this$0;

    private TypeAdapter$NullSafeTypeAdapter(ad adVar) {
        this.this$0 = adVar;
    }

    @Override // com.google.gson.ad
    public Object read(S8.a aVar) throws IOException {
        if (aVar.white() == S8.b.f2049b) {
            aVar.peach();
            return null;
        }
        return this.this$0.read(aVar);
    }

    public String toString() {
        return "NullSafeTypeAdapter[" + this.this$0 + Constants.AES_SUFFIX;
    }

    @Override // com.google.gson.ad
    public void write(S8.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.azure();
        } else {
            this.this$0.write(cVar, obj);
        }
    }
}
