package R;

import J2.t;
import Lb.C0222e;
import Lb.am;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import s6.AbstractC2743p6;

/* loaded from: classes3.dex */
public abstract class l {
    public static final J2.l alpha = new J2.l(new C0222e(27), new am(15));

    public static final String alpha(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final J2.l bravo(Xd.l lVar, Function1 function1) {
        Ac.k kVar = new Ac.k(13, lVar);
        Intrinsics.charlie(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        x.echo(1, function1);
        return new J2.l(kVar, function1);
    }

    public static final Object charlie(Object[] objArr, J2.l lVar, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        return delta(Arrays.copyOf(objArr, objArr.length), lVar, function0, interfaceC0581m, 384 | ((i4 << 3) & 7168), 0);
    }

    public static final Object delta(Object[] objArr, J2.l lVar, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        Object[] objArr2;
        boolean z2;
        final Object obj;
        Object obj2;
        Object delta;
        if ((i5 & 2) != 0) {
            lVar = alpha;
        }
        final J2.l lVar2 = lVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        long j5 = c0585q.magenta;
        AbstractC2743p6.alpha(36);
        final String l10 = Long.toString(j5, 36);
        Intrinsics.delta(l10, "toString(...)");
        Intrinsics.charlie(lVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final g gVar = (g) c0585q.kilo(i.alpha);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        Object obj3 = null;
        if (jade == asVar) {
            if (gVar != null && (delta = gVar.delta(l10)) != null) {
                obj2 = ((Function1) lVar2.purple).invoke(delta);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = function0.invoke();
            }
            objArr2 = objArr;
            b bVar = new b(lVar2, gVar, l10, obj2, objArr2);
            c0585q.f(bVar);
            jade = bVar;
        } else {
            objArr2 = objArr;
        }
        final b bVar2 = (b) jade;
        if (Arrays.equals(objArr2, bVar2.teal)) {
            obj3 = bVar2.silver;
        }
        if (obj3 == null) {
            obj3 = function0.invoke();
        }
        boolean india = c0585q.india(bVar2);
        if ((((i4 & 112) ^ 48) > 32 && c0585q.india(lVar2)) || (i4 & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean india2 = india | z2 | c0585q.india(gVar) | c0585q.golf(l10) | c0585q.india(obj3) | c0585q.india(objArr2);
        Object jade2 = c0585q.jade();
        if (!india2 && jade2 != asVar) {
            obj = obj3;
        } else {
            Object obj4 = obj3;
            final Object[] objArr3 = objArr2;
            obj = obj4;
            Function0 function02 = new Function0() { // from class: R.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z10;
                    b bVar3 = b.this;
                    g gVar2 = bVar3.purple;
                    g gVar3 = gVar;
                    boolean z11 = true;
                    if (gVar2 != gVar3) {
                        bVar3.purple = gVar3;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str = bVar3.red;
                    String str2 = l10;
                    if (!Intrinsics.areEqual(str, str2)) {
                        bVar3.red = str2;
                    } else {
                        z11 = z10;
                    }
                    bVar3.alpha = lVar2;
                    bVar3.silver = obj;
                    bVar3.teal = objArr3;
                    f fVar = bVar3.white;
                    if (fVar != null && z11) {
                        ((t) fVar).azure();
                        bVar3.white = null;
                        bVar3.charlie();
                    }
                    return Unit.INSTANCE;
                }
            };
            c0585q.f(function02);
            jade2 = function02;
        }
        C0564b.juliet((Function0) jade2, c0585q);
        return obj;
    }

    public static final Object echo(Object[] objArr, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        return delta(Arrays.copyOf(objArr, objArr.length), alpha, function0, interfaceC0581m, ((i4 << 6) & 7168) | 384, 0);
    }

    public static final e foxtrot(InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(1967008021);
        Object[] objArr = new Object[0];
        J2.l lVar = e.teal;
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = new Q4.a(21);
            c0585q.f(jade);
        }
        e eVar = (e) charlie(objArr, lVar, (Function0) jade, c0585q, 384);
        eVar.red = (g) c0585q.kilo(i.alpha);
        c0585q.quebec(false);
        return eVar;
    }
}
