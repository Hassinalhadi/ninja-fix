package com.incognia.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public abstract class VD2 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f9761b = (String) wGk.dmR.getValue();

    /* renamed from: W, reason: collision with root package name */
    public static final String f9760W = (String) wGk.sZ1.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9762f9 = (String) wGk.DuE.getValue();

    public static final List b(String str) {
        StringBuilder sb2 = new StringBuilder();
        String str2 = f9761b;
        sb2.append(str2);
        sb2.append('.');
        sb2.append(str);
        sb2.append('.');
        sb2.append(f9760W);
        return CollectionsKt.listOf(sb2.toString(), str2 + '.' + str + '.' + f9762f9);
    }
}
