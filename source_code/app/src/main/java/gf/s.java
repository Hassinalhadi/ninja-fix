package gf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.an;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class s {
    public static final q alpha;
    public static final o purple;
    public static final r red;
    public static final p silver;
    public static final /* synthetic */ s[] teal;

    static {
        q qVar = new q();
        alpha = qVar;
        o oVar = new o();
        purple = oVar;
        r rVar = new r();
        red = rVar;
        p pVar = new p();
        silver = pVar;
        teal = new s[]{qVar, oVar, rVar, pVar};
    }

    public static s bravo(B b2) {
        Intrinsics.echo(b2, "<this>");
        if (b2.indigo()) {
            return purple;
        }
        if (b2 instanceof kotlin.reflect.jvm.internal.impl.types.o) {
        }
        if (kotlin.reflect.jvm.internal.impl.types.c.foxtrot(AbstractC1792g.lima(false, null, 24), kotlin.reflect.jvm.internal.impl.types.c.kilo(b2), an.bravo)) {
            return silver;
        }
        return red;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) teal.clone();
    }

    public abstract s alpha(B b2);
}
