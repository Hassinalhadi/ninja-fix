package com.incognia.internal;

import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import pf.AbstractC2360j;

/* loaded from: classes2.dex */
public final class GjU implements P0 {

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f8807b = LazyKt.lazy(gL3.f10470b);

    public GjU(TJd tJd) {
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8807b.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        File[] listFiles;
        List quebec;
        try {
            Result.Companion companion = Result.INSTANCE;
            List list = null;
            try {
                File file = new File((String) wGk.xSP.getValue());
                if (!file.isDirectory()) {
                    file = null;
                }
                list = (file == null || (listFiles = file.listFiles()) == null || (quebec = AbstractC2360j.quebec(AbstractC2360j.papa(ArraysKt.tango(listFiles), pCE.f11059b))) == null) ? CollectionsKt.emptyList() : quebec;
            } catch (Throwable unused) {
            }
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) this.f8807b.getValue(), list, new QUz(new fC(list))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
