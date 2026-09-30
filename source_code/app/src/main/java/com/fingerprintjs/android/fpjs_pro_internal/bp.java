package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/bp;", "", "", "setPivotYN16904", "()Ljava/lang/Long;", "vD14832N6715"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class bp {

    /* renamed from: vD14832N6715, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public final Long alpha;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/bp$vD14832N6715;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.bp$vD14832N6715, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static bp D8871(Companion companion, Integer num) {
            Long l10;
            Long l11;
            Long echo = I0.echo();
            if (num != null) {
                l10 = Long.valueOf(num.intValue());
            } else {
                l10 = null;
            }
            if (echo != null && l10 != null) {
                l11 = Long.valueOf(l10.longValue() + echo.longValue());
            } else {
                l11 = null;
            }
            return new bp(echo, l11, null);
        }
    }

    public bp(Long l10, Long l11, DefaultConstructorMarker defaultConstructorMarker) {
        this.alpha = l11;
    }

    @Nullable
    public final Long setPivotYN16904() {
        Long l10 = this.alpha;
        if (l10 == null) {
            return null;
        }
        long longValue = l10.longValue();
        Long echo = I0.echo();
        if (echo == null) {
            return null;
        }
        return Long.valueOf(longValue - echo.longValue());
    }
}
