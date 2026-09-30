package com.incognia.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.k;

/* loaded from: classes2.dex */
public final class lj {
    public static String W() {
        String str;
        Object m206constructorimpl;
        Path path;
        Path readSymbolicLink;
        Object obj = null;
        if (!CnH.b(CnH.f8484b, 26, 0, 2)) {
            return null;
        }
        Context context = OQ.f9304b;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.sourceDir) == null) {
                return null;
            }
            File file = new File(str);
            try {
                Result.Companion companion = Result.INSTANCE;
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                try {
                    path = Paths.get(((String) wGk.cE.getValue()) + open.getFd(), new String[0]);
                    readSymbolicLink = Files.readSymbolicLink(path);
                    String obj2 = readSymbolicLink.toString();
                    open.close();
                    m206constructorimpl = Result.m206constructorimpl(obj2);
                } finally {
                }
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (!(m206constructorimpl instanceof k)) {
                obj = m206constructorimpl;
            }
            return (String) obj;
        }
        throw new NullPointerException("Using SDK context before initialization");
    }

    public static N8 b() {
        Object m206constructorimpl;
        Object m206constructorimpl2;
        Context context;
        String str;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                context = OQ.f9304b;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
        }
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                str = applicationInfo.sourceDir;
            } else {
                str = null;
            }
            m206constructorimpl2 = Result.m206constructorimpl(str);
            if (m206constructorimpl2 instanceof k) {
                m206constructorimpl2 = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new N8((String) m206constructorimpl2, W()));
            if (!(m206constructorimpl instanceof k)) {
                obj = m206constructorimpl;
            }
            return (N8) obj;
        }
        throw new NullPointerException("Using SDK context before initialization");
    }
}
