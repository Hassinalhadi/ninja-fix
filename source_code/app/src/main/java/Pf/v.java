package Pf;

import Nf.az;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public class v extends b {
    public final Of.aa foxtrot;
    public final SerialDescriptor golf;
    public int hotel;
    public boolean india;

    public /* synthetic */ v(Of.d dVar, Of.aa aaVar, String str, int i4) {
        this(dVar, aaVar, (i4 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // Pf.b, Mf.a
    public void alpha(SerialDescriptor descriptor) {
        Set set;
        Set mike;
        Intrinsics.echo(descriptor, "descriptor");
        Of.d dVar = this.charlie;
        if (!r.kilo(dVar, descriptor) && !(descriptor.november() instanceof Lf.d)) {
            r.november(dVar, descriptor);
            if (!this.echo.india) {
                mike = az.bravo(descriptor);
            } else {
                Set bravo = az.bravo(descriptor);
                Map map = (Map) dVar.charlie.charlie(descriptor, r.alpha);
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = kotlin.collections.u.alpha;
                }
                mike = kotlin.collections.ab.mike(bravo, set);
            }
            for (String str : lime().alpha.keySet()) {
                if (!mike.contains(str) && !Intrinsics.areEqual(str, this.delta)) {
                    StringBuilder victor = Q0.c.victor("Encountered an unknown key '", str, "' at element: ");
                    victor.append(maroon());
                    victor.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                    victor.append((Object) r.mike(lime().toString(), -1));
                    throw r.echo(-1, victor.toString());
                }
            }
        }
    }

    @Override // Pf.b
    public Of.n blue(String tag) {
        Intrinsics.echo(tag, "tag");
        return (Of.n) kotlin.collections.y.papa(lime(), tag);
    }

    @Override // Pf.b, kotlinx.serialization.encoding.Decoder
    public final Mf.a charlie(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.golf;
        if (descriptor == serialDescriptor) {
            Of.n bronze = bronze();
            String oscar = serialDescriptor.oscar();
            if (bronze instanceof Of.aa) {
                return new v(this.charlie, (Of.aa) bronze, this.delta, serialDescriptor);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
            sb2.append(vVar.bravo(Of.aa.class).kilo());
            sb2.append(", but had ");
            sb2.append(vVar.bravo(bronze.getClass()).kilo());
            sb2.append(" as the serialized body of ");
            sb2.append(oscar);
            sb2.append(" at element: ");
            sb2.append(maroon());
            throw r.delta(-1, bronze.toString(), sb2.toString());
        }
        return super.charlie(descriptor);
    }

    @Override // Pf.b
    public String jade(SerialDescriptor descriptor, int i4) {
        Object obj;
        Intrinsics.echo(descriptor, "descriptor");
        Of.d dVar = this.charlie;
        r.november(dVar, descriptor);
        String sierra = descriptor.sierra(i4);
        if (this.echo.india && !lime().alpha.keySet().contains(sierra)) {
            Intrinsics.echo(dVar, "<this>");
            s sVar = r.alpha;
            Ac.g gVar = new Ac.g(18, descriptor, dVar);
            O7.j jVar = dVar.charlie;
            jVar.getClass();
            Object charlie = jVar.charlie(descriptor, sVar);
            if (charlie == null) {
                charlie = gVar.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.purple;
                Object obj2 = concurrentHashMap.get(descriptor);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, obj2);
                }
                ((Map) obj2).put(sVar, charlie);
            }
            Map map = (Map) charlie;
            Iterator it = lime().alpha.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Integer num = (Integer) map.get((String) obj);
                    if (num != null && num.intValue() == i4) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return sierra;
    }

    @Override // Pf.b
    /* renamed from: olive, reason: merged with bridge method [inline-methods] */
    public Of.aa lime() {
        return this.foxtrot;
    }

    @Override // Pf.b, kotlinx.serialization.encoding.Decoder
    public final boolean quebec() {
        if (!this.india && super.quebec()) {
            return true;
        }
        return false;
    }

    @Override // Mf.a
    public int sierra(SerialDescriptor descriptor) {
        boolean z2;
        Intrinsics.echo(descriptor, "descriptor");
        while (this.hotel < descriptor.romeo()) {
            int i4 = this.hotel;
            this.hotel = i4 + 1;
            String lavender = lavender(descriptor, i4);
            int i5 = this.hotel - 1;
            this.india = false;
            if (!lime().containsKey(lavender)) {
                if (!this.charlie.alpha.echo && !descriptor.victor(i5) && descriptor.uniform(i5).papa()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.india = z2;
                if (z2) {
                }
            }
            this.echo.getClass();
            return i5;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Of.d json, Of.aa value, String str, SerialDescriptor serialDescriptor) {
        super(json, str);
        Intrinsics.echo(json, "json");
        Intrinsics.echo(value, "value");
        this.foxtrot = value;
        this.golf = serialDescriptor;
    }
}
