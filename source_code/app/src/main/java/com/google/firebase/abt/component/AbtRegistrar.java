package com.google.firebase.abt.component;

import D7.a;
import F7.b;
import I7.c;
import I7.j;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s6.H0;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.charlie(Context.class), cVar.india(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I7.b> getComponents() {
        I7.a bravo = I7.b.bravo(a.class);
        bravo.alpha = LIBRARY_NAME;
        bravo.alpha(j.charlie(Context.class));
        bravo.alpha(j.alpha(b.class));
        bravo.foxtrot = new A8.a(7);
        return Arrays.asList(bravo.bravo(), H0.alpha(LIBRARY_NAME, "21.1.1"));
    }
}
