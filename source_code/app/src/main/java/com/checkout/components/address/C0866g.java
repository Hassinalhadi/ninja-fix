package com.checkout.components.address;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: com.checkout.components.address.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0866g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f3885a;

    public C0866g(List list) {
        this.f3885a = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f3885a.get(((Number) obj).intValue());
        return null;
    }
}
