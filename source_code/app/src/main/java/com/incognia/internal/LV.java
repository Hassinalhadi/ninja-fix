package com.incognia.internal;

import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.k;

/* loaded from: classes2.dex */
public final class LV implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f9061b = LazyKt.lazy(jsq.f10727b);

    public LV(Pp pp) {
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f9061b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Object m206constructorimpl2;
        String readText$default;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                readText$default = FilesKt__FileReadWriteKt.readText$default(new File((String) wGk.N17.getValue()), null, 1, null);
                m206constructorimpl2 = Result.m206constructorimpl(readText$default);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (m206constructorimpl2 instanceof k) {
                m206constructorimpl2 = null;
            }
            String str = (String) m206constructorimpl2;
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f9061b.getValue(), str, new Hnm(new Eq(str))));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
