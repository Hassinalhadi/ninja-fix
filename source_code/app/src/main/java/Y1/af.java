package Y1;

import android.os.Bundle;
import bv.ax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import s6.S6;
import t6.AbstractC2971b2;
import zendesk.classic.messaging.Update;

@as(Update.NAVIGATION)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LY1/af;", "LY1/at;", "LY1/ac;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class af extends at {
    public final au charlie;

    public af(au navigatorProvider) {
        Intrinsics.echo(navigatorProvider, "navigatorProvider");
        this.charlie = navigatorProvider;
    }

    @Override // Y1.at
    public final void delta(List list, aj ajVar) {
        aa aaVar;
        Bundle bundle;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            aa aaVar2 = lVar.purple;
            Intrinsics.charlie(aaVar2, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            ac acVar = (ac) aaVar2;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.alpha = lVar.f2268a.alpha();
            Be.e eVar = acVar.yellow;
            int i4 = eVar.alpha;
            String str = (String) eVar.echo;
            if (i4 == 0 && str == null) {
                He.b bVar = acVar.purple;
                String superName = bVar.bravo;
                if (superName == null) {
                    superName = String.valueOf(bVar.charlie);
                }
                Intrinsics.echo(superName, "superName");
                if (((ac) eVar.bravo).purple.charlie == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            if (str != null) {
                aaVar = eVar.delta(str, false);
            } else {
                aaVar = (aa) ((ax) eVar.charlie).delta(i4);
            }
            if (aaVar == null) {
                if (((String) eVar.delta) == null) {
                    String str2 = (String) eVar.echo;
                    if (str2 == null) {
                        str2 = String.valueOf(eVar.alpha);
                    }
                    eVar.delta = str2;
                }
                String str3 = (String) eVar.delta;
                Intrinsics.checkNotNull(str3);
                throw new IllegalArgumentException(ao.ad.gray("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                He.b bVar2 = aaVar.purple;
                if (!Intrinsics.areEqual(str, (String) bVar2.golf)) {
                    z bravo = bVar2.bravo(str);
                    if (bravo != null) {
                        bundle = bravo.purple;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        charlie.putAll(bundle);
                        Bundle bundle2 = (Bundle) objectRef.alpha;
                        if (bundle2 != null) {
                            charlie.putAll(bundle2);
                        }
                        objectRef.alpha = charlie;
                    }
                }
                if (aaVar.india().isEmpty()) {
                    continue;
                } else {
                    ArrayList alpha = AbstractC2971b2.alpha(aaVar.india(), new ae(objectRef, 0));
                    if (!alpha.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + aaVar + ". Missing required arguments [" + alpha + ']').toString());
                    }
                }
            }
            this.charlie.bravo(aaVar.alpha).delta(kotlin.collections.ab.juliet(bravo().bravo(aaVar, aaVar.bravo((Bundle) objectRef.alpha))), ajVar);
        }
    }

    @Override // Y1.at
    /* renamed from: kilo, reason: merged with bridge method [inline-methods] */
    public ac alpha() {
        return new ac(this);
    }
}
