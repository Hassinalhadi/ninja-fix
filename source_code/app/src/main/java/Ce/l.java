package Ce;

import Ie.aq;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import ef.C1659g;
import ef.C1661i;
import ge.InterfaceC1774f;
import gf.C1790e;
import gf.C1791f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.h implements Function1 {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i4, Object obj, int i5) {
        super(i4, obj);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        switch (this.alpha) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
            case 2:
                return "loadResource";
            case 3:
                return "simpleType";
            case 4:
                return "getValueClassPropertyType";
            case 5:
                return "<init>";
            case 6:
                return "prepareType";
            default:
                return "onPageScrollStateChanged";
        }
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        switch (this.alpha) {
            case 0:
                return kotlin.jvm.internal.u.alpha.bravo(p.class);
            case 1:
                return kotlin.jvm.internal.u.alpha.bravo(p.class);
            case 2:
                return kotlin.jvm.internal.u.alpha.bravo(df.d.class);
            case 3:
                return kotlin.jvm.internal.u.alpha.bravo(kotlin.jvm.internal.j.class);
            case 4:
                return kotlin.jvm.internal.u.alpha.bravo(C1661i.class);
            case 5:
                return kotlin.jvm.internal.u.alpha.bravo(C1659g.class);
            case 6:
                return kotlin.jvm.internal.u.alpha.bravo(C1790e.class);
            default:
                return kotlin.jvm.internal.u.alpha.bravo(MultiTouchViewPager.class);
        }
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        switch (this.alpha) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 1:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            case 2:
                return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
            case 3:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 4:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
            case 5:
                return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
            case 6:
                return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
            default:
                return "onPageScrollStateChanged(I)V";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2 = true;
        switch (this.alpha) {
            case 0:
                Ne.f p02 = (Ne.f) obj;
                Intrinsics.echo(p02, "p0");
                return p.victor((p) this.receiver, p02);
            case 1:
                Ne.f p03 = (Ne.f) obj;
                Intrinsics.echo(p03, "p0");
                return p.whiskey((p) this.receiver, p03);
            case 2:
                String p04 = (String) obj;
                Intrinsics.echo(p04, "p0");
                ((df.d) this.receiver).getClass();
                return df.d.alpha(p04);
            case 3:
                aq p05 = (aq) obj;
                Intrinsics.echo(p05, "p0");
                return ((cf.z) this.receiver).delta(p05, true);
            case 4:
                Ne.f p06 = (Ne.f) obj;
                Intrinsics.echo(p06, "p0");
                return ((C1661i) this.receiver).gold(p06);
            case 5:
                C1791f p07 = (C1791f) obj;
                Intrinsics.echo(p07, "p0");
                return new C1659g((C1661i) this.receiver, p07);
            case 6:
                p000if.c p08 = (p000if.c) obj;
                Intrinsics.echo(p08, "p0");
                return ((C1790e) this.receiver).alpha(p08);
            default:
                int intValue = ((Number) obj).intValue();
                MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) this.receiver;
                int i4 = MultiTouchViewPager.silver;
                multiTouchViewPager.getClass();
                if (intValue != 0) {
                    z2 = false;
                }
                multiTouchViewPager.alpha = z2;
                return Unit.INSTANCE;
        }
    }
}
