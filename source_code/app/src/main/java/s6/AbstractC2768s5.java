package s6;

import androidx.compose.runtime.InterfaceC0566c;
import ge.InterfaceC1775g;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import ke.InterfaceC2037e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2768s5 {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final Field alpha(ge.v vVar) {
        Intrinsics.echo(vVar, "<this>");
        je.L charlie = je.a0.charlie(vVar);
        if (charlie != null) {
            return (Field) charlie.f12892c.getValue();
        }
        return null;
    }

    public static final Method bravo(InterfaceC1775g interfaceC1775g) {
        Member member;
        InterfaceC2037e quebec;
        Intrinsics.echo(interfaceC1775g, "<this>");
        je.r alpha = je.a0.alpha(interfaceC1775g);
        if (alpha != null && (quebec = alpha.quebec()) != null) {
            member = quebec.bravo();
        } else {
            member = null;
        }
        if (!(member instanceof Method)) {
            return null;
        }
        return (Method) member;
    }

    public static final Type charlie(ge.w wVar) {
        Type type;
        Intrinsics.echo(wVar, "<this>");
        je.T t5 = ((je.N) wVar).purple;
        if (t5 != null) {
            type = (Type) t5.invoke();
        } else {
            type = null;
        }
        if (type == null) {
            return ge.ah.delta(wVar);
        }
        return type;
    }

    public static final void delta(androidx.compose.runtime.j0 j0Var, InterfaceC0566c interfaceC0566c, int i4) {
        while (true) {
            int i5 = j0Var.victor;
            if (i4 <= i5 || i4 >= j0Var.uniform) {
                if (i5 == 0 && i4 == 0) {
                    return;
                }
                j0Var.gold();
                if (j0Var.xray(j0Var.victor)) {
                    interfaceC0566c.kilo();
                }
                j0Var.juliet();
            } else {
                return;
            }
        }
    }
}
