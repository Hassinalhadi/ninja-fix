package com.checkout.components.redirecthandler;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5660a = new ArrayList();

    public final b a(String key, Object value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        this.f5660a.add(key + "=" + value);
        return this;
    }
}
