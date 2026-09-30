package Nf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public class B implements SerialDescriptor, InterfaceC0254l {
    public final String alpha;
    public final ac bravo;
    public final int charlie;
    public int delta = -1;
    public final String[] echo;
    public final List[] foxtrot;
    public final boolean[] golf;
    public Object hotel;
    public final Object india;
    public final Object juliet;
    public final Object kilo;

    public B(String str, ac acVar, int i4) {
        this.alpha = str;
        this.bravo = acVar;
        this.charlie = i4;
        String[] strArr = new String[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            strArr[i5] = "[UNINITIALIZED]";
        }
        this.echo = strArr;
        int i10 = this.charlie;
        this.foxtrot = new List[i10];
        this.golf = new boolean[i10];
        this.hotel = kotlin.collections.t.alpha;
        kotlin.i iVar = kotlin.i.alpha;
        final int i11 = 0;
        this.india = LazyKt.alpha(iVar, new Function0(this) { // from class: Nf.A
            public final /* synthetic */ B purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i11) {
                    case 0:
                        ac acVar2 = this.purple.bravo;
                        if (acVar2 == null || (childSerializers = acVar2.childSerializers()) == null) {
                            return az.bravo;
                        }
                        return childSerializers;
                    case 1:
                        ac acVar3 = this.purple.bravo;
                        if (acVar3 != null && (typeParametersSerializers = acVar3.typeParametersSerializers()) != null) {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return az.charlie(arrayList);
                    default:
                        B b2 = this.purple;
                        return Integer.valueOf(az.echo(b2, (SerialDescriptor[]) b2.juliet.getValue()));
                }
            }
        });
        final int i12 = 1;
        this.juliet = LazyKt.alpha(iVar, new Function0(this) { // from class: Nf.A
            public final /* synthetic */ B purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i12) {
                    case 0:
                        ac acVar2 = this.purple.bravo;
                        if (acVar2 == null || (childSerializers = acVar2.childSerializers()) == null) {
                            return az.bravo;
                        }
                        return childSerializers;
                    case 1:
                        ac acVar3 = this.purple.bravo;
                        if (acVar3 != null && (typeParametersSerializers = acVar3.typeParametersSerializers()) != null) {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return az.charlie(arrayList);
                    default:
                        B b2 = this.purple;
                        return Integer.valueOf(az.echo(b2, (SerialDescriptor[]) b2.juliet.getValue()));
                }
            }
        });
        final int i13 = 2;
        this.kilo = LazyKt.alpha(iVar, new Function0(this) { // from class: Nf.A
            public final /* synthetic */ B purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i13) {
                    case 0:
                        ac acVar2 = this.purple.bravo;
                        if (acVar2 == null || (childSerializers = acVar2.childSerializers()) == null) {
                            return az.bravo;
                        }
                        return childSerializers;
                    case 1:
                        ac acVar3 = this.purple.bravo;
                        if (acVar3 != null && (typeParametersSerializers = acVar3.typeParametersSerializers()) != null) {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return az.charlie(arrayList);
                    default:
                        B b2 = this.purple;
                        return Integer.valueOf(az.echo(b2, (SerialDescriptor[]) b2.juliet.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // Nf.InterfaceC0254l
    public final Set alpha() {
        return this.hotel.keySet();
    }

    public final void bravo(String name, boolean z2) {
        Intrinsics.echo(name, "name");
        int i4 = this.delta + 1;
        this.delta = i4;
        String[] strArr = this.echo;
        strArr[i4] = name;
        this.golf[i4] = z2;
        this.foxtrot[i4] = null;
        if (i4 == this.charlie - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                hashMap.put(strArr[i5], Integer.valueOf(i5));
            }
            this.hotel = hashMap;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(this.alpha, serialDescriptor.oscar()) && Arrays.equals((SerialDescriptor[]) this.juliet.getValue(), (SerialDescriptor[]) ((B) obj).juliet.getValue())) {
                    int romeo = serialDescriptor.romeo();
                    int i4 = this.charlie;
                    if (i4 == romeo) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (Intrinsics.areEqual(uniform(i5).oscar(), serialDescriptor.uniform(i5).oscar()) && Intrinsics.areEqual(uniform(i5).november(), serialDescriptor.uniform(i5).november())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public int hashCode() {
        return ((Number) this.kilo.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public AbstractC2716m6 november() {
        return Lf.l.bravo;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return this.alpha;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean papa() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        Integer num = (Integer) this.hotel.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return this.charlie;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        return this.echo[i4];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        List list = this.foxtrot[i4];
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    public String toString() {
        return az.lima(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor uniform(int i4) {
        return ((KSerializer[]) this.india.getValue())[i4].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        return this.golf[i4];
    }
}
