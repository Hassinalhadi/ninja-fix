package Nf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class ae extends AbstractC0243a {
    public final KSerializer alpha;
    public final KSerializer bravo;
    public final /* synthetic */ int charlie;
    public final ad delta;

    public ae(KSerializer kSerializer, KSerializer kSerializer2, byte b2) {
        this.alpha = kSerializer;
        this.bravo = kSerializer2;
    }

    @Override // Nf.AbstractC0243a
    public final Object alpha() {
        switch (this.charlie) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // Nf.AbstractC0243a
    public final int bravo(Object obj) {
        switch (this.charlie) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                Intrinsics.echo(hashMap, "<this>");
                return hashMap.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                Intrinsics.echo(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override // Nf.AbstractC0243a
    public final Iterator charlie(Object obj) {
        switch (this.charlie) {
            case 0:
                Map map = (Map) obj;
                Intrinsics.echo(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                Intrinsics.echo(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // Nf.AbstractC0243a
    public final int delta(Object obj) {
        switch (this.charlie) {
            case 0:
                Map map = (Map) obj;
                Intrinsics.echo(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                Intrinsics.echo(map2, "<this>");
                return map2.size();
        }
    }

    @Override // Nf.AbstractC0243a
    public final void foxtrot(Mf.a aVar, int i4, Object obj) {
        Object whiskey;
        Map builder = (Map) obj;
        Intrinsics.echo(builder, "builder");
        Object whiskey2 = aVar.whiskey(getDescriptor(), i4, this.alpha, null);
        int sierra = aVar.sierra(getDescriptor());
        if (sierra == i4 + 1) {
            boolean containsKey = builder.containsKey(whiskey2);
            KSerializer kSerializer = this.bravo;
            if (containsKey && !(kSerializer.getDescriptor().november() instanceof Lf.f)) {
                whiskey = aVar.whiskey(getDescriptor(), sierra, kSerializer, kotlin.collections.y.papa(builder, whiskey2));
            } else {
                whiskey = aVar.whiskey(getDescriptor(), sierra, kSerializer, null);
            }
            builder.put(whiskey2, whiskey);
            return;
        }
        throw new IllegalArgumentException(A0.z.juliet("Value must follow key in a map, index for key: ", i4, sierra, ", returned index for value: ").toString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.charlie) {
            case 0:
                return this.delta;
            default:
                return this.delta;
        }
    }

    @Override // Nf.AbstractC0243a
    public final Object golf(Object obj) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(null, "<this>");
                return new HashMap((Map) null);
            default:
                Intrinsics.echo(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // Nf.AbstractC0243a
    public final Object hotel(Object obj) {
        switch (this.charlie) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                Intrinsics.echo(hashMap, "<this>");
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                Intrinsics.echo(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        delta(obj);
        SerialDescriptor descriptor = getDescriptor();
        Mf.b sierra = ((AbstractC2796v6) encoder).sierra(descriptor);
        Iterator charlie = charlie(obj);
        int i4 = 0;
        while (charlie.hasNext()) {
            Map.Entry entry = (Map.Entry) charlie.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i5 = i4 + 1;
            AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) sierra;
            abstractC2796v6.whiskey(getDescriptor(), i4, this.alpha, key);
            i4 += 2;
            abstractC2796v6.whiskey(getDescriptor(), i5, this.bravo, value);
        }
        sierra.alpha(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ae(KSerializer kSerializer, KSerializer vSerializer, int i4) {
        this(kSerializer, vSerializer, (byte) 0);
        this.charlie = i4;
        switch (i4) {
            case 1:
                Intrinsics.echo(kSerializer, "kSerializer");
                Intrinsics.echo(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                SerialDescriptor keyDesc = kSerializer.getDescriptor();
                SerialDescriptor valueDesc = vSerializer.getDescriptor();
                Intrinsics.echo(keyDesc, "keyDesc");
                Intrinsics.echo(valueDesc, "valueDesc");
                this.delta = new ad("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                return;
            default:
                Intrinsics.echo(kSerializer, "kSerializer");
                Intrinsics.echo(vSerializer, "vSerializer");
                SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                Intrinsics.echo(keyDesc2, "keyDesc");
                Intrinsics.echo(valueDesc2, "valueDesc");
                this.delta = new ad("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                return;
        }
    }
}
