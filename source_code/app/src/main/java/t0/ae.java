package t0;

import android.content.res.Resources;
import delivery.samurai.android.R;
import fe.C1712d;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import s6.J4;

/* loaded from: classes3.dex */
public abstract class ae {
    public static final boolean alpha(A0.s sVar) {
        A0.k kilo = sVar.kilo();
        return !kilo.alpha.charlie(A0.x.india);
    }

    public static final boolean bravo(A0.s sVar, Resources resources) {
        String str;
        boolean z2;
        List list = (List) A0.v.delta(sVar.delta, A0.x.alpha);
        if (list != null) {
            str = (String) CollectionsKt.green(list);
        } else {
            str = null;
        }
        if (str == null && foxtrot(sVar) == null && echo(sVar, resources) == null && !delta(sVar)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!A0.v.echo(sVar) && (sVar.delta.red || (sVar.oscar() && z2))) {
            return true;
        }
        return false;
    }

    public static final s0.al charlie(s0.al alVar, Function1 function1) {
        for (s0.al victor = alVar.victor(); victor != null; victor = victor.victor()) {
            if (((Boolean) function1.invoke(victor)).booleanValue()) {
                return victor;
            }
        }
        return null;
    }

    public static final boolean delta(A0.s sVar) {
        boolean z2;
        C0.a aVar = (C0.a) A0.v.delta(sVar.delta, A0.x.cyan);
        A0.ac acVar = A0.x.xray;
        A0.k kVar = sVar.delta;
        A0.h hVar = (A0.h) A0.v.delta(kVar, acVar);
        if (aVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Boolean) A0.v.delta(kVar, A0.x.crimson)) != null && (hVar == null || hVar.alpha != 4)) {
            return true;
        }
        return z2;
    }

    public static final String echo(A0.s sVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object string;
        float f5;
        int i4;
        Object delta = A0.v.delta(sVar.delta, A0.x.bravo);
        A0.ac acVar = A0.x.cyan;
        A0.k kVar = sVar.delta;
        C0.a aVar = (C0.a) A0.v.delta(kVar, acVar);
        A0.h hVar = (A0.h) A0.v.delta(kVar, A0.x.xray);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (delta == null) {
                            delta = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (hVar != null && hVar.alpha == 2 && delta == null) {
                    delta = resources.getString(R.string.state_off);
                }
            } else if (hVar != null && hVar.alpha == 2 && delta == null) {
                delta = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) A0.v.delta(kVar, A0.x.crimson);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((hVar == null || hVar.alpha != 4) && delta == null) {
                if (booleanValue) {
                    delta = resources.getString(R.string.selected);
                } else {
                    delta = resources.getString(R.string.not_selected);
                }
            }
        }
        A0.g gVar = (A0.g) A0.v.delta(kVar, A0.x.charlie);
        if (gVar != null) {
            if (gVar != A0.g.charlie) {
                if (delta == null) {
                    C1712d c1712d = gVar.bravo;
                    if (c1712d.alpha - 0.0f == 0.0f) {
                        f5 = 0.0f;
                    } else {
                        f5 = (gVar.alpha - 0.0f) / (c1712d.alpha - 0.0f);
                    }
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                    if (f5 == 0.0f) {
                        i4 = 0;
                    } else {
                        i4 = 100;
                        if (f5 != 1.0f) {
                            i4 = J4.delta(Math.round(f5 * 100), 1, 99);
                        }
                    }
                    delta = resources.getString(R.string.template_percent, Integer.valueOf(i4));
                }
            } else if (delta == null) {
                delta = resources.getString(R.string.in_progress);
            }
        }
        A0.ac acVar2 = A0.x.blue;
        if (kVar.alpha.charlie(acVar2)) {
            A0.k kilo = new A0.s(sVar.alpha, true, sVar.charlie, kVar).kilo();
            Collection collection2 = (Collection) A0.v.delta(kilo, A0.x.alpha);
            if ((collection2 != null && !collection2.isEmpty()) || (((collection = (Collection) A0.v.delta(kilo, A0.x.amber)) != null && !collection.isEmpty()) || ((charSequence = (CharSequence) A0.v.delta(kilo, acVar2)) != null && charSequence.length() != 0))) {
                string = null;
            } else {
                string = resources.getString(R.string.state_empty);
            }
            delta = string;
        }
        return (String) delta;
    }

    public static final D0.g foxtrot(A0.s sVar) {
        D0.g gVar;
        A0.k kVar = sVar.delta;
        A0.ac acVar = A0.x.alpha;
        D0.g gVar2 = (D0.g) A0.v.delta(kVar, A0.x.blue);
        List list = (List) A0.v.delta(sVar.delta, A0.x.amber);
        if (list != null) {
            gVar = (D0.g) CollectionsKt.green(list);
        } else {
            gVar = null;
        }
        if (gVar2 == null) {
            return gVar;
        }
        return gVar2;
    }
}
