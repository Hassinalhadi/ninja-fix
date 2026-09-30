package androidx.compose.ui.layout;

import T.s;
import Xd.m;
import kotlin.jvm.functions.Function1;
import q0.aa;
import q0.ao;

/* loaded from: classes3.dex */
public abstract class a {
    public static final Object alpha(ao aoVar) {
        aa aaVar;
        Object yankee = aoVar.yankee();
        if (yankee instanceof aa) {
            aaVar = (aa) yankee;
        } else {
            aaVar = null;
        }
        if (aaVar == null) {
            return null;
        }
        return aaVar.alpha;
    }

    public static final s bravo(m mVar) {
        return new LayoutElement(mVar);
    }

    public static final s charlie(s sVar, String str) {
        return sVar.then(new LayoutIdElement(str));
    }

    public static final s delta(s sVar, Function1 function1) {
        return sVar.then(new OnGloballyPositionedElement(function1));
    }

    public static final s echo(s sVar, Function1 function1) {
        return sVar.then(new OnSizeChangedModifier(function1));
    }
}
