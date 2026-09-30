package com.incognia.internal;

import java.io.File;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class pCE extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final pCE f11059b = new pCE();

    public pCE() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String name = ((File) obj).getName();
        if (kotlin.text.r.quebec(name, (String) wGk.xah.getValue(), false)) {
            Lazy lazy = wGk.Wh6;
            if (kotlin.text.r.golf(name, (String) lazy.getValue(), false)) {
                String magenta = StringsKt.magenta(name, (String) lazy.getValue());
                if (new File(androidx.appcompat.widget.P0.gold(new StringBuilder(), (String) wGk.fnt.getValue(), magenta)).exists()) {
                    return magenta;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
