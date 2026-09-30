package com.incognia.internal;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class pVN extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Vpc f11072W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11073b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f11074f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pVN(ArrayList arrayList, Vpc vpc, LinkedHashMap linkedHashMap) {
        super(1);
        this.f11073b = arrayList;
        this.f11072W = vpc;
        this.f11074f9 = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        this.f11073b.add(str);
        int fuchsia = StringsKt.fuchsia(str, ":", 0, false, 6);
        if (fuchsia != -1) {
            Vpc vpc = this.f11072W;
            String obj2 = StringsKt.b(str.substring(0, fuchsia)).toString();
            vpc.getClass();
            if (kotlin.text.r.quebec(obj2, Constants.AES_PREFIX, false) && kotlin.text.r.golf(obj2, Constants.AES_SUFFIX, false)) {
                obj2 = obj2.substring(1, obj2.length() - 1);
            }
            Vpc vpc2 = this.f11072W;
            String obj3 = StringsKt.b(str.substring(fuchsia + 1)).toString();
            vpc2.getClass();
            if (kotlin.text.r.quebec(obj3, Constants.AES_PREFIX, false) && kotlin.text.r.golf(obj3, Constants.AES_SUFFIX, false)) {
                obj3 = obj3.substring(1, obj3.length() - 1);
            }
            this.f11074f9.put(obj2, obj3);
        }
        return Unit.INSTANCE;
    }
}
