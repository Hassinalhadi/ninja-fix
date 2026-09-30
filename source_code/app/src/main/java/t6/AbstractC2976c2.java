package t6;

import androidx.navigation.NavControllerViewModel;
import ge.InterfaceC1772d;
import io.ktor.http.BadContentTypeFormatException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: t6.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2976c2 {
    public static NavControllerViewModel alpha(androidx.lifecycle.c0 viewModelStore) {
        Intrinsics.echo(viewModelStore, "viewModelStore");
        T1.d factory = Y1.s.alpha;
        T1.a extras = T1.a.bravo;
        Intrinsics.echo(factory, "factory");
        Intrinsics.echo(extras, "extras");
        J2.i iVar = new J2.i(viewModelStore, factory, extras);
        InterfaceC1772d bravo = kotlin.jvm.internal.u.alpha.bravo(NavControllerViewModel.class);
        String juliet = bravo.juliet();
        if (juliet != null) {
            return (NavControllerViewModel) iVar.charlie(bravo, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static sd.e bravo(String value) {
        Intrinsics.echo(value, "value");
        if (StringsKt.gray(value)) {
            return sd.e.white;
        }
        sd.i iVar = (sd.i) CollectionsKt.ochre(AbstractC2986e2.bravo(value));
        String str = iVar.alpha;
        int emerald = StringsKt.emerald(str, '/', 0, 6);
        if (emerald == -1) {
            if (Intrinsics.areEqual(StringsKt.b(str).toString(), "*")) {
                return sd.e.white;
            }
            throw new BadContentTypeFormatException(value);
        }
        String substring = str.substring(0, emerald);
        Intrinsics.delta(substring, "substring(...)");
        String obj = StringsKt.b(substring).toString();
        if (obj.length() != 0) {
            String substring2 = str.substring(emerald + 1);
            Intrinsics.delta(substring2, "substring(...)");
            String obj2 = StringsKt.b(substring2).toString();
            if (!StringsKt.black(obj, ' ') && !StringsKt.black(obj2, ' ')) {
                if (obj2.length() != 0 && !StringsKt.black(obj2, '/')) {
                    return new sd.e(obj, obj2, iVar.bravo);
                }
                throw new BadContentTypeFormatException(value);
            }
            throw new BadContentTypeFormatException(value);
        }
        throw new BadContentTypeFormatException(value);
    }
}
