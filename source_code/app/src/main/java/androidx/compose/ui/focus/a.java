package androidx.compose.ui.focus;

import T.s;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class a {
    public static final s alpha(s sVar, Y.s sVar2) {
        return sVar.then(new FocusRequesterElement(sVar2));
    }

    public static final s bravo(s sVar, Function1 function1) {
        return sVar.then(new FocusChangedElement(function1));
    }

    public static final s charlie(s sVar, Function1 function1) {
        return sVar.then(new FocusEventElement(function1));
    }
}
