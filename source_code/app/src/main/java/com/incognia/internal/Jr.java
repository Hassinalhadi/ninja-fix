package com.incognia.internal;

import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Jr implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final Lazy f8971W = LazyKt.lazy(S9v.f9582b);

    /* renamed from: b, reason: collision with root package name */
    public final BDO f8972b;

    public Jr(BDO bdo) {
        this.f8972b = bdo;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8971W.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        String str;
        File filesDir;
        File absoluteFile;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                filesDir = this.f8972b.f8403b.getFilesDir();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (filesDir != null && (absoluteFile = filesDir.getAbsoluteFile()) != null) {
            str = absoluteFile.getPath();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.f11680b.getValue(), str, new Hnm(new u7(str))));
            Bo7.b(m206constructorimpl, wa2);
        }
        str = null;
        m206constructorimpl = Result.m206constructorimpl(new P7R((String) wGk.f11680b.getValue(), str, new Hnm(new u7(str))));
        Bo7.b(m206constructorimpl, wa2);
    }
}
