package com.incognia.internal;

import android.content.Context;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o1Y {

    /* renamed from: b, reason: collision with root package name */
    public final Context f10989b;

    /* renamed from: W, reason: collision with root package name */
    public static final String f10987W = (String) wGk.oP.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10988f9 = (String) wGk.eym.getValue();
    public static final String sVU = (String) wGk.lqg.getValue();
    public static final String gmP = (String) wGk.f11701la.getValue();

    /* renamed from: J, reason: collision with root package name */
    public static final String f10985J = (String) wGk.Mu.getValue();
    public static final String PqK = (String) wGk.cF.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f10986V = (String) wGk.In.getValue();

    public o1Y(Context context) {
        this.f10989b = context;
    }

    public final void b(long j5) {
        try {
            File b2 = b(odR.f11028W);
            if (b2 == null) {
                return;
            }
            FilesKt.november(new File(b2, f10987W), String.valueOf(j5));
        } catch (Throwable unused) {
        }
    }

    public final File b(bdh bdhVar) {
        File noBackupFilesDir;
        String str;
        if (!CnH.b(CnH.f8484b, 21, 0, 2) || (noBackupFilesDir = this.f10989b.getNoBackupFilesDir()) == null) {
            return null;
        }
        if (Intrinsics.areEqual(bdhVar, GmL.f8809W)) {
            str = PqK;
        } else if (Intrinsics.areEqual(bdhVar, Q7W.f9485W)) {
            str = f10985J;
        } else {
            if (!Intrinsics.areEqual(bdhVar, odR.f11028W)) {
                throw new NoWhenBranchMatchedException();
            }
            str = f10986V;
        }
        File file = new File(noBackupFilesDir, str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final bdh b() {
        return new d9U(new vQ(this.f10989b, sVU), new vQ(this.f10989b, gmP), new vQ(this.f10989b, f10988f9)).b();
    }
}
