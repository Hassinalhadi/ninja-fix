package s6;

import com.google.android.gms.measurement.internal.C1473v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class L6 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Type inference failed for: r13v4, types: [Of.d, Of.t] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Of.i, java.lang.Object] */
    public static Of.t alpha(Function1 function1) {
        Of.c from = Of.d.delta;
        Intrinsics.echo(from, "from");
        ?? obj = new Object();
        Of.k kVar = from.alpha;
        obj.alpha = kVar.alpha;
        obj.bravo = kVar.echo;
        obj.charlie = kVar.bravo;
        obj.delta = kVar.charlie;
        String str = kVar.foxtrot;
        obj.echo = str;
        obj.foxtrot = kVar.golf;
        obj.golf = kVar.juliet;
        obj.hotel = kVar.india;
        obj.india = kVar.hotel;
        obj.juliet = kVar.delta;
        obj.kilo = from.bravo;
        function1.invoke(obj);
        if (Intrinsics.areEqual(str, "    ")) {
            Of.k kVar2 = new Of.k(obj.alpha, obj.charlie, obj.delta, obj.juliet, obj.bravo, obj.echo, obj.foxtrot, obj.india, obj.hotel, obj.golf);
            C1473v module = obj.kilo;
            Intrinsics.echo(module, "module");
            ?? dVar = new Of.d(kVar2, module);
            if (Intrinsics.areEqual(module, kotlinx.serialization.modules.a.alpha)) {
                return dVar;
            }
            Of.a aVar = Of.a.alpha;
            return dVar;
        }
        throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
    }
}
