package com.google.gson.internal.bind;

import com.clevertap.android.sdk.Constants;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TypeAdapters$29 implements ae {
    final /* synthetic */ Class val$type;
    final /* synthetic */ ad val$typeAdapter;

    public TypeAdapters$29(Class cls, ad adVar) {
        this.val$type = cls;
        this.val$typeAdapter = adVar;
    }

    @Override // com.google.gson.ae
    public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == this.val$type) {
            return this.val$typeAdapter;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.val$type.getName() + ",adapter=" + this.val$typeAdapter + Constants.AES_SUFFIX;
    }
}
