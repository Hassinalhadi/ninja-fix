package com.fingerprintjs.android.fpjs_pro_internal;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.location.Location;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class H0 extends Lambda implements Function1<SafeWithTimeoutProContext, Boolean> {
    public static int purple;
    public static int red;
    public final Location alpha;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(115, H0.class);
        Hidden0.special_clinit_115_00(H0.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(Location location) {
        super(1);
        this.alpha = location;
    }

    public static native int vD14832N6715();

    public final native Boolean alpha(SafeWithTimeoutProContext safeWithTimeoutProContext);

    @Override // kotlin.jvm.functions.Function1
    public final native /* synthetic */ Boolean invoke(SafeWithTimeoutProContext safeWithTimeoutProContext);
}
