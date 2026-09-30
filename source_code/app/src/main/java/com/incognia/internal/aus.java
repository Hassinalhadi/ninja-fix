package com.incognia.internal;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class aus extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10124b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aus(String str) {
        super(0);
        this.f10124b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j5;
        BPv bPv = BPv.f8417b;
        String str = this.f10124b;
        synchronized (bPv) {
            try {
                kT kTVar = QHn.f9492b;
                String str2 = BPv.f8416W;
                P6 p62 = (P6) kTVar.b(avG.f10125b, str2);
                if (p62 == null) {
                    p62 = new P6();
                }
                LinkedHashMap amber = kotlin.collections.y.amber(p62.f9388b);
                Long l10 = (Long) amber.get(str);
                if (l10 != null) {
                    j5 = l10.longValue();
                } else {
                    j5 = 0;
                }
                amber.put(str, Long.valueOf(j5 + 1));
                kTVar.b(str2, new P6(amber), vA.f11534b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }
}
