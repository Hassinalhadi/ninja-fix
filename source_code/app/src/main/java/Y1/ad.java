package Y1;

import d2.AbstractC1579d;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import s6.T5;
import t6.AbstractC2996g2;

/* loaded from: classes3.dex */
public final class ad extends ab {
    public final au golf;
    public final String hotel;
    public final Object india;
    public final ArrayList juliet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(au provider, Object startDestination, kotlin.collections.t typeMap) {
        super(provider.bravo(AbstractC2996g2.bravo(af.class)), (InterfaceC1772d) null, typeMap);
        Intrinsics.echo(provider, "provider");
        Intrinsics.echo(startDestination, "startDestination");
        Intrinsics.echo(typeMap, "typeMap");
        this.juliet = new ArrayList();
        this.golf = provider;
        this.india = startDestination;
    }

    @Override // Y1.ab
    /* renamed from: kilo, reason: merged with bridge method [inline-methods] */
    public final ac alpha() {
        ac acVar = (ac) super.alpha();
        ArrayList nodes = this.juliet;
        Intrinsics.echo(nodes, "nodes");
        Be.e eVar = acVar.yellow;
        eVar.getClass();
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            aa aaVar = (aa) it.next();
            if (aaVar != null) {
                eVar.bravo(aaVar);
            }
        }
        Object obj = this.india;
        String str = this.hotel;
        if (str == null && obj == null) {
            if (this.alpha != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str != null) {
            Intrinsics.checkNotNull(str);
            eVar.uniform(str);
            return acVar;
        }
        if (obj != null) {
            Intrinsics.checkNotNull(obj);
            KSerializer bravo = T5.bravo(kotlin.jvm.internal.u.alpha.bravo(obj.getClass()));
            int charlie = AbstractC1579d.charlie(bravo);
            aa charlie2 = eVar.charlie(charlie);
            if (charlie2 != null) {
                Map india = charlie2.india();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y.quebec(india.size()));
                for (Map.Entry entry : india.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((k) entry.getValue()).alpha);
                }
                eVar.uniform(AbstractC1579d.delta(obj, linkedHashMap));
                eVar.alpha = charlie;
                return acVar;
            }
            throw new IllegalStateException(("Cannot find startDestination " + bravo.getDescriptor().oscar() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
        eVar.tango(0);
        return acVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(au provider, String startDestination) {
        super(provider.bravo(AbstractC2996g2.bravo(af.class)), -1, (String) null);
        Intrinsics.echo(provider, "provider");
        Intrinsics.echo(startDestination, "startDestination");
        this.juliet = new ArrayList();
        this.golf = provider;
        this.hotel = startDestination;
    }
}
