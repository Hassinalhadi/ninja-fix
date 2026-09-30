package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÀ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/F0;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F0 {

    @NotNull
    public static final F0 alpha = new Object();
    public static final Lazy bravo = LazyKt.lazy(a.alpha);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a alpha = new Lambda(0);

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z2 = false;
            try {
                System.loadLibrary("fp");
                z2 = true;
            } catch (Exception | UnsatisfiedLinkError unused) {
            }
            return Boolean.valueOf(z2);
        }
    }

    public static boolean alpha() {
        return ((Boolean) bravo.getValue()).booleanValue();
    }
}
