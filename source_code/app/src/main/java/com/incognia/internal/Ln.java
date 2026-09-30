package com.incognia.internal;

import android.location.Geocoder;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Ln extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K4F f9078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ln(K4F k4f) {
        super(0);
        this.f9078b = k4f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (Geocoder.isPresent()) {
            return new Geocoder(this.f9078b.f8985b, Locale.ENGLISH);
        }
        return null;
    }
}
