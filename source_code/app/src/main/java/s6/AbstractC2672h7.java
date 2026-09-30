package s6;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import s6.AbstractC2672h7;

/* renamed from: s6.h7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2672h7 {
    public static final void alpha(final double d4, final double d9, final double d10, final double d11, final T.s sVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-640170182);
        if (c0585q.charlie(d4)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.charlie(d9)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.charlie(d10)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.charlie(d11)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12 | 24576;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            androidx.compose.runtime.Q uniform = c0585q.uniform();
            if (uniform != null) {
                uniform.delta = new Xd.l(d4, d9, d10, d11, i4) { // from class: Qb.t
                    public final /* synthetic */ double alpha;
                    public final /* synthetic */ double purple;
                    public final /* synthetic */ double red;
                    public final /* synthetic */ double silver;

                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int cyan = C0564b.cyan(1);
                        T.p pVar = T.p.alpha;
                        AbstractC2672h7.alpha(this.alpha, this.purple, this.red, this.silver, pVar, (InterfaceC0581m) obj, cyan);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        c0585q.ochre();
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Xd.l(d4, d9, d10, d11, sVar, i4) { // from class: Qb.u
                public final /* synthetic */ double alpha;
                public final /* synthetic */ double purple;
                public final /* synthetic */ double red;
                public final /* synthetic */ double silver;
                public final /* synthetic */ T.s teal;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(1);
                    double d12 = this.silver;
                    T.s sVar2 = this.teal;
                    AbstractC2672h7.alpha(this.alpha, this.purple, this.red, d12, sVar2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final kotlin.reflect.jvm.internal.impl.types.ak bravo(InterfaceC2330f from, InterfaceC2330f to) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.echo(from, "from");
        Intrinsics.echo(to, "to");
        from.papa().size();
        to.papa().size();
        List papa = from.papa();
        Intrinsics.delta(papa, "from.declaredTypeParameters");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(papa, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = papa.iterator();
        while (it.hasNext()) {
            arrayList.add(((pe.aq) it.next()).tango());
        }
        List papa2 = to.papa();
        Intrinsics.delta(papa2, "to.declaredTypeParameters");
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(papa2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator it2 = papa2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.types.ae oscar = ((pe.aq) it2.next()).oscar();
            Intrinsics.delta(oscar, "it.defaultType");
            arrayList2.add(O5.alpha(oscar));
        }
        return new kotlin.reflect.jvm.internal.impl.types.ak(1, kotlin.collections.y.yankee(CollectionsKt.H(arrayList, arrayList2)));
    }
}
