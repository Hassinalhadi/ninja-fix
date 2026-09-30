package hf;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ap;
import pe.InterfaceC2335k;

/* loaded from: classes2.dex */
public final class i {
    public static final i alpha = new Object();
    public static final c bravo = c.alpha;
    public static final C1851a charlie = new C1851a(Ne.f.golf(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final f delta = charlie(h.f12722a, new String[0]);
    public static final f echo = charlie(h.f12734n, new String[0]);
    public static final Set foxtrot = ab.oscar(new d());

    public static final e alpha(int i4, boolean z2, String... formatParams) {
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Intrinsics.echo(formatParams, "formatParams");
        if (z2) {
            String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
            Intrinsics.echo(formatParams2, "formatParams");
            return new e(i4, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
        }
        return new e(i4, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final e bravo(int i4, String... strArr) {
        com.google.android.material.datepicker.j.papa(i4, "kind");
        return alpha(i4, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f charlie(h kind, String... strArr) {
        Intrinsics.echo(kind, "kind");
        List arguments = CollectionsKt.emptyList();
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(formatParams, "formatParams");
        return echo(kind, arguments, delta(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static g delta(h kind, String... formatParams) {
        Intrinsics.echo(kind, "kind");
        Intrinsics.echo(formatParams, "formatParams");
        return new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static f echo(h kind, List arguments, ap apVar, String... formatParams) {
        Intrinsics.echo(kind, "kind");
        Intrinsics.echo(arguments, "arguments");
        Intrinsics.echo(formatParams, "formatParams");
        return new f(apVar, bravo(7, apVar.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean foxtrot(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            if ((interfaceC2335k instanceof C1851a) || (interfaceC2335k.lima() instanceof C1851a) || interfaceC2335k == bravo) {
                return true;
            }
            return false;
        }
        return false;
    }
}
