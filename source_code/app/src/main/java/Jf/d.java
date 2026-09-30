package Jf;

import Nf.AbstractC0244b;
import ge.InterfaceC1772d;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public final class d extends AbstractC0244b {
    public final InterfaceC1772d alpha;
    public final List bravo;
    public final Object charlie;
    public final Map delta;
    public final LinkedHashMap echo;

    public d(String str, InterfaceC1772d baseClass, InterfaceC1772d[] interfaceC1772dArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        Intrinsics.echo(baseClass, "baseClass");
        this.alpha = baseClass;
        this.bravo = CollectionsKt.emptyList();
        this.charlie = LazyKt.alpha(i.alpha, new Ac.g(11, str, this));
        if (interfaceC1772dArr.length == kSerializerArr.length) {
            Map yankee = y.yankee(ArraysKt.i(interfaceC1772dArr, kSerializerArr));
            this.delta = yankee;
            Set<Map.Entry> entrySet = yankee.entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : entrySet) {
                String oscar = ((KSerializer) entry.getValue()).getDescriptor().oscar();
                Object obj = linkedHashMap.get(oscar);
                if (obj == null) {
                    linkedHashMap.containsKey(oscar);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(oscar, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + this.alpha + "' have the same serial name '" + oscar + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.echo = linkedHashMap2;
            this.bravo = ArraysKt.sierra(annotationArr);
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.kilo() + " should be marked @Serializable");
    }

    @Override // Nf.AbstractC0244b
    public final KSerializer alpha(Mf.a aVar, String str) {
        KSerializer kSerializer = (KSerializer) this.echo.get(str);
        if (kSerializer != null) {
            return kSerializer;
        }
        super.alpha(aVar, str);
        return null;
    }

    @Override // Nf.AbstractC0244b
    public final KSerializer bravo(AbstractC2796v6 abstractC2796v6, Object value) {
        KSerializer kSerializer;
        Intrinsics.echo(value, "value");
        KSerializer kSerializer2 = (KSerializer) this.delta.get(u.alpha.bravo(value.getClass()));
        if (kSerializer2 != null) {
            kSerializer = kSerializer2;
        } else {
            super.bravo(abstractC2796v6, value);
            kSerializer = null;
        }
        if (kSerializer == null) {
            return null;
        }
        return kSerializer;
    }

    @Override // Nf.AbstractC0244b
    public final InterfaceC1772d charlie() {
        return this.alpha;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.charlie.getValue();
    }
}
