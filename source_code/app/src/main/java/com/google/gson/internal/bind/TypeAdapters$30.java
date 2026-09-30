package com.google.gson.internal.bind;

import com.clevertap.android.sdk.Constants;
import com.google.gson.ad;
import com.google.gson.ae;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TypeAdapters$30 implements ae {
    final /* synthetic */ Class val$boxed;
    final /* synthetic */ ad val$typeAdapter;
    final /* synthetic */ Class val$unboxed;

    public TypeAdapters$30(Class cls, Class cls2, ad adVar) {
        this.val$unboxed = cls;
        this.val$boxed = cls2;
        this.val$typeAdapter = adVar;
    }

    @Override // com.google.gson.ae
    public <T> ad create(com.google.gson.l lVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType != this.val$unboxed && rawType != this.val$boxed) {
            return null;
        }
        return this.val$typeAdapter;
    }

    public String toString() {
        return "Factory[type=" + this.val$boxed.getName() + "+" + this.val$unboxed.getName() + ",adapter=" + this.val$typeAdapter + Constants.AES_SUFFIX;
    }
}
