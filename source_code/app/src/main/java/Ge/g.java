package Ge;

import Ie.ac;
import ef.InterfaceC1662j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2617b6;
import ue.C3158b;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public final class g implements InterfaceC1662j {
    public final Ve.b alpha;
    public final Ve.b purple;
    public final C3158b red;

    public g(C3158b kotlinClass, ac packageProto, Me.g nameResolver, int i4) {
        String str;
        Intrinsics.echo(kotlinClass, "kotlinClass");
        Intrinsics.echo(packageProto, "packageProto");
        Intrinsics.echo(nameResolver, "nameResolver");
        com.google.android.material.datepicker.j.papa(i4, "abiStability");
        Ve.b bravo = Ve.b.bravo(AbstractC3192d.alpha(kotlinClass.alpha));
        He.b bVar = kotlinClass.bravo;
        Ve.b bVar2 = null;
        if (((He.a) bVar.delta) == He.a.MULTIFILE_CLASS_PART) {
            str = bVar.bravo;
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            bVar2 = Ve.b.delta(str);
        }
        this.alpha = bravo;
        this.purple = bVar2;
        this.red = kotlinClass;
        Oe.n packageModuleName = Le.k.mike;
        Intrinsics.delta(packageModuleName, "packageModuleName");
        Integer num = (Integer) AbstractC2617b6.charlie(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    public final Ne.b alpha() {
        Ne.c cVar;
        Ve.b bVar = this.alpha;
        String str = bVar.alpha;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = Ne.c.charlie;
            if (cVar == null) {
                Ve.b.alpha(7);
                throw null;
            }
        } else {
            cVar = new Ne.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String echo = bVar.echo();
        Intrinsics.delta(echo, "className.internalName");
        return new Ne.b(cVar, Ne.f.echo(StringsKt.purple('/', echo, echo)));
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.alpha;
    }
}
