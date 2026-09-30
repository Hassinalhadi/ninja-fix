package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.UserManager;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Lcom/fingerprintjs/android/fpjs_pro_internal/u0;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Lcom/fingerprintjs/android/fpjs_pro_internal/u0;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1238n0 extends Lambda implements Function1<SafeWithTimeoutProContext, C1265u0> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ androidx.core.widget.f alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238n0(androidx.core.widget.f fVar) {
        super(1);
        this.alpha = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r2 = androidx.core.widget.f.zulu(r6).isManagedProfile();
        r2 = java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 30) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 64) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        r2 = null;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1265u0 alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int size;
        Boolean valueOf;
        int i4 = red;
        int i5 = (i4 ^ 27) + ((i4 & 27) << 1);
        purple = i5 % 128;
        int i10 = i5 % 2;
        androidx.core.widget.f fVar = this.alpha;
        if (i10 != 0) {
            UserManager zulu = androidx.core.widget.f.zulu(fVar);
            Intrinsics.checkNotNull(zulu);
            size = zulu.getUserProfiles().size();
        } else {
            UserManager zulu2 = androidx.core.widget.f.zulu(fVar);
            Intrinsics.checkNotNull(zulu2);
            size = zulu2.getUserProfiles().size();
        }
        red = (purple + 3) % 128;
        Boolean valueOf2 = Boolean.valueOf(androidx.core.widget.f.zulu(fVar).isSystemUser());
        int i11 = red;
        purple = ((i11 ^ 19) + ((i11 & 19) << 1)) % 128;
        C1265u0 c1265u0 = new C1265u0(Integer.valueOf(size), valueOf, valueOf2);
        int i12 = red;
        int i13 = (i12 & 1) + (i12 | 1);
        purple = i13 % 128;
        if (i13 % 2 == 0) {
            return c1265u0;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ C1265u0 invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red;
        int i5 = (i4 & 91) + (i4 | 91);
        purple = i5 % 128;
        SafeWithTimeoutProContext safeWithTimeoutProContext2 = safeWithTimeoutProContext;
        if (i5 % 2 == 0) {
            C1265u0 alpha = alpha(safeWithTimeoutProContext2);
            red = (purple + 115) % 128;
            return alpha;
        }
        alpha(safeWithTimeoutProContext2);
        throw null;
    }
}
