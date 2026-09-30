package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

/* loaded from: classes2.dex */
public final class zJn extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final zJn f11903b = new zJn();

    public zJn() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        boolean z2 = true;
        String str = matchResult.getGroupValues().get(1);
        if (matchResult.getGroupValues().get(2).length() <= 0) {
            z2 = false;
        }
        return new q0n(str, Boolean.valueOf(z2));
    }
}
