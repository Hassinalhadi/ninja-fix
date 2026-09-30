package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "alpha", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class K0 extends Lambda implements Function1<StackTraceElement, CharSequence> {
    public static final K0 alpha = new Lambda(1);

    public K0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement) {
        return stackTraceElement.toString();
    }
}
