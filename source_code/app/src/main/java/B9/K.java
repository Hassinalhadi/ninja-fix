package B9;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import cf.C0851g;
import cf.C0852h;
import cf.C0853i;
import cf.InterfaceC0845a;
import cf.InterfaceC0849e;
import cf.InterfaceC0854j;
import cf.InterfaceC0855k;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import gf.C1795j;
import gf.InterfaceC1796k;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2321ad;
import pe.InterfaceC2325ah;
import pe.InterfaceC2330f;
import pe.InterfaceC2349y;
import re.C2517a;
import re.InterfaceC2518b;
import re.InterfaceC2520d;
import xe.C3338a;

/* loaded from: classes2.dex */
public final class K {
    public final Object alpha;
    public final Object bravo;
    public final Object charlie;
    public final Object delta;
    public final Object echo;
    public final Object foxtrot;
    public final Object golf;
    public final Object hotel;
    public final Object india;
    public final Object juliet;
    public final Object kilo;
    public final Object lima;
    public final Object mike;
    public final Object november;
    public final Object oscar;
    public final Object papa;
    public final Object quebec;
    public final Object romeo;
    public final Object sierra;
    public final Object tango;

    public K(ff.l lVar, InterfaceC2349y moduleDescriptor, InterfaceC0849e interfaceC0849e, InterfaceC0845a interfaceC0845a, InterfaceC2325ah interfaceC2325ah, InterfaceC0854j interfaceC0854j, InterfaceC0855k interfaceC0855k, Iterable fictitiousClassDescriptorFactories, J2.i iVar, InterfaceC2518b interfaceC2518b, InterfaceC2520d interfaceC2520d, Oe.h extensionRegistryLite, gf.l lVar2, U8.a aVar, List list, int i4) {
        gf.l kotlinTypeChecker;
        C0853i c0853i = C0853i.bravo;
        C0853i c0853i2 = C0853i.delta;
        C3338a c3338a = C3338a.alpha;
        C0853i c0853i3 = C0852h.alpha;
        if ((i4 & 65536) != 0) {
            InterfaceC1796k.bravo.getClass();
            kotlinTypeChecker = C1795j.bravo;
        } else {
            kotlinTypeChecker = lVar2;
        }
        C2517a c2517a = C2517a.echo;
        List juliet = (i4 & 524288) != 0 ? kotlin.collections.ab.juliet(kotlin.reflect.jvm.internal.impl.types.n.alpha) : list;
        Intrinsics.echo(moduleDescriptor, "moduleDescriptor");
        Intrinsics.echo(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.echo(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.echo(kotlinTypeChecker, "kotlinTypeChecker");
        this.alpha = lVar;
        this.bravo = moduleDescriptor;
        this.charlie = c0853i;
        this.delta = interfaceC0849e;
        this.echo = interfaceC0845a;
        this.foxtrot = interfaceC2325ah;
        this.golf = c0853i2;
        this.hotel = interfaceC0854j;
        this.india = c3338a;
        this.juliet = interfaceC0855k;
        this.kilo = fictitiousClassDescriptorFactories;
        this.lima = iVar;
        this.mike = c0853i3;
        this.november = interfaceC2518b;
        this.oscar = interfaceC2520d;
        this.papa = extensionRegistryLite;
        this.quebec = kotlinTypeChecker;
        this.romeo = c2517a;
        this.sierra = juliet;
        this.tango = new C0851g(this);
    }

    public D5.s alpha(InterfaceC2321ad descriptor, Ke.e nameResolver, G6.j jVar, Ke.f versionRequirementTable, Ke.a metadataVersion, Ge.g gVar) {
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(versionRequirementTable, "versionRequirementTable");
        Intrinsics.echo(metadataVersion, "metadataVersion");
        return new D5.s(this, nameResolver, descriptor, jVar, versionRequirementTable, metadataVersion, gVar, null, CollectionsKt.emptyList());
    }

    public InterfaceC2330f bravo(Ne.b classId) {
        Intrinsics.echo(classId, "classId");
        Set set = C0851g.charlie;
        return ((C0851g) this.tango).alpha(classId, null);
    }

    public K(NestedScrollView nestedScrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7, MaterialButton materialButton8, MaterialButton materialButton9, MaterialButton materialButton10, MaterialButton materialButton11, MaterialButton materialButton12, MaterialButton materialButton13, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, MaterialCardView materialCardView, TextView textView) {
        this.alpha = nestedScrollView;
        this.bravo = materialButton;
        this.charlie = materialButton2;
        this.delta = materialButton3;
        this.echo = materialButton4;
        this.foxtrot = materialButton5;
        this.golf = materialButton6;
        this.hotel = materialButton7;
        this.india = materialButton8;
        this.juliet = materialButton9;
        this.kilo = materialButton10;
        this.lima = materialButton11;
        this.mike = materialButton12;
        this.november = materialButton13;
        this.oscar = constraintLayout;
        this.papa = shapeableImageView;
        this.quebec = shapeableImageView2;
        this.romeo = shapeableImageView3;
        this.sierra = materialCardView;
        this.tango = textView;
    }
}
