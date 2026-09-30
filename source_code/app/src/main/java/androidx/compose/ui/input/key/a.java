package androidx.compose.ui.input.key;

import T.s;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class a {
    public static final s alpha(Function1 function1) {
        return new KeyInputElement(function1, null);
    }

    public static final s bravo(s sVar, Function1 function1) {
        return sVar.then(new KeyInputElement(null, function1));
    }
}
