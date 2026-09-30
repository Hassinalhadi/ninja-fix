package com.incognia.internal;

import android.media.MediaDrm;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class gnv {

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f10498b = new UUID(-1301668207276963122L, -6645017420763422227L);

    public static String b(Function1 function1) {
        MediaDrm mediaDrm;
        try {
            mediaDrm = new MediaDrm(f10498b);
        } catch (Throwable unused) {
            mediaDrm = null;
        }
        try {
            String str = (String) function1.invoke(mediaDrm);
            if (CnH.b(CnH.f8484b, 28, 0, 2)) {
                mediaDrm.release();
                return str;
            }
            mediaDrm.release();
            return str;
        } catch (Throwable unused2) {
            try {
                if (CnH.b(CnH.f8484b, 28, 0, 2)) {
                    if (mediaDrm != null) {
                        mediaDrm.release();
                    }
                } else if (mediaDrm != null) {
                    mediaDrm.release();
                }
            } catch (Throwable unused3) {
            }
            return null;
        }
    }
}
