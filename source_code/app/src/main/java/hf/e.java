package hf;

import Xe.n;
import androidx.appcompat.widget.P0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2340p;
import pe.InterfaceC2332h;
import pe.an;
import qe.C2471g;
import se.ak;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public class e implements n {
    public final String bravo;

    public e(int i4, String... formatParams) {
        String str;
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Intrinsics.echo(formatParams, "formatParams");
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        switch (i4) {
            case 1:
                str = "No member resolution should be done on captured type, it used only during constraint system resolution";
                break;
            case 2:
                str = "Scope for integer literal type (%s)";
                break;
            case 3:
                str = "Error scope for erased receiver type";
                break;
            case 4:
                str = "Scope for abbreviation %s";
                break;
            case 5:
                str = "Scope for stub type %s";
                break;
            case 6:
                str = "A scope for common supertype which is not a normal classifier";
                break;
            case 7:
                str = "Scope for error type %s";
                break;
            case 8:
                str = "Scope for unsupported type %s";
                break;
            case 9:
                str = "Error scope for class %s with arguments: %s";
                break;
            case 10:
                str = "Error resolution candidate for call %s";
                break;
            default:
                throw null;
        }
        this.bravo = String.format(str, copyOf2);
    }

    @Override // Xe.p
    public Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        return CollectionsKt.emptyList();
    }

    @Override // Xe.n
    public Set bravo() {
        return u.alpha;
    }

    @Override // Xe.n
    public Set delta() {
        return u.alpha;
    }

    @Override // Xe.n
    public Set echo() {
        return u.alpha;
    }

    @Override // Xe.p
    public InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        return new C1851a(Ne.f.golf(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override // Xe.n
    /* renamed from: hotel, reason: merged with bridge method [inline-methods] */
    public Set charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        C1851a containingDeclaration = i.charlie;
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        ak akVar = new ak(containingDeclaration, null, C2471g.alpha, Ne.f.golf("<Error function>"), 1, an.magenta);
        akVar.e0(null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), i.charlie(h.teal, new String[0]), 3, AbstractC2340p.echo);
        return ab.oscar(akVar);
    }

    @Override // Xe.n
    /* renamed from: india, reason: merged with bridge method [inline-methods] */
    public Set foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        return i.foxtrot;
    }

    public String toString() {
        return P0.fuchsia(new StringBuilder("ErrorScope{"), this.bravo, '}');
    }
}
