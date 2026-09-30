package Pe;

import Lb.C;
import androidx.appcompat.widget.P0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.C2039a;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.text.StringsKt;
import me.AbstractC2120h;
import pe.AbstractC2327c;
import pe.AbstractC2340p;
import pe.AbstractC2347w;
import pe.C2319ab;
import pe.C2339o;
import pe.InterfaceC2321ad;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2333i;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2348x;
import pe.InterfaceC2349y;
import pe.al;
import pe.aw;
import qe.EnumC2468d;
import qe.InterfaceC2465a;
import qe.InterfaceC2466b;
import s6.AbstractC2743p6;
import s6.D6;
import s6.E6;
import s6.U6;
import se.C2859i;
import se.C2868r;
import se.C2871u;
import se.ai;
import se.aj;
import se.aq;

/* loaded from: classes2.dex */
public final class t extends o implements v {
    public final z delta;
    public final Lazy echo = LazyKt.lazy(new C(4, this));

    public t(z zVar) {
        this.delta = zVar;
    }

    public static boolean b(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        if (D6.hotel(yVar)) {
            List cyan = yVar.cyan();
            if (cyan == null || !cyan.isEmpty()) {
                Iterator it = cyan.iterator();
                while (it.hasNext()) {
                    if (((as) it.next()).charlie()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final void november(t tVar, al alVar, StringBuilder sb2) {
        boolean z2;
        boolean z10;
        if (!tVar.romeo()) {
            z zVar = tVar.delta;
            ge.v[] vVarArr = z.ochre;
            if (!((Boolean) zVar.golf.alpha(vVarArr[5], zVar)).booleanValue()) {
                if (tVar.quebec().contains(u.ANNOTATIONS)) {
                    tVar.yankee(sb2, alVar, null);
                    C2868r k6 = alVar.k();
                    if (k6 != null) {
                        tVar.yankee(sb2, k6, EnumC2468d.FIELD);
                    }
                    C2868r h4 = alVar.h();
                    if (h4 != null) {
                        tVar.yankee(sb2, h4, EnumC2468d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((ae) zVar.coral.alpha(vVarArr[31], zVar)) == ae.purple) {
                        ai bravo = alVar.bravo();
                        if (bravo != null) {
                            tVar.yankee(sb2, bravo, EnumC2468d.PROPERTY_GETTER);
                        }
                        aj charlie = alVar.charlie();
                        if (charlie != null) {
                            tVar.yankee(sb2, charlie, EnumC2468d.PROPERTY_SETTER);
                            List peach = charlie.peach();
                            Intrinsics.delta(peach, "setter.valueParameters");
                            aq it = (aq) CollectionsKt.k(peach);
                            Intrinsics.delta(it, "it");
                            tVar.yankee(sb2, it, EnumC2468d.SETTER_PARAMETER);
                        }
                    }
                }
                List l10 = alVar.l();
                Intrinsics.delta(l10, "property.contextReceiverParameters");
                tVar.beige(l10, sb2);
                C2339o visibility = alVar.getVisibility();
                Intrinsics.delta(visibility, "property.visibility");
                tVar.yellow(visibility, sb2);
                if (tVar.quebec().contains(u.CONST) && alVar.whiskey()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                tVar.green(sb2, z2, "const");
                tVar.fuchsia(alVar, sb2);
                tVar.gray(sb2, alVar);
                tVar.lime(sb2, alVar);
                if (tVar.quebec().contains(u.LATEINIT) && alVar.n()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tVar.green(sb2, z10, "lateinit");
                tVar.emerald(sb2, alVar);
            }
            tVar.silver(alVar, sb2, false);
            List typeParameters = alVar.getTypeParameters();
            Intrinsics.delta(typeParameters, "property.typeParameters");
            tVar.red(sb2, typeParameters, true);
            tVar.navy(sb2, alVar);
        }
        tVar.ivory(alVar, sb2, true);
        sb2.append(": ");
        kotlin.reflect.jvm.internal.impl.types.y type = alVar.getType();
        Intrinsics.delta(type, "property.type");
        sb2.append(tVar.orange(type));
        tVar.ochre(sb2, alVar);
        tVar.crimson(alVar, sb2);
        List typeParameters2 = alVar.getTypeParameters();
        Intrinsics.delta(typeParameters2, "property.typeParameters");
        tVar.a(typeParameters2, sb2);
    }

    public static void olive(StringBuilder sb2) {
        int length = sb2.length();
        if (length != 0 && sb2.charAt(length - 1) == ' ') {
            return;
        }
        sb2.append(' ');
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int victor(InterfaceC2348x interfaceC2348x) {
        InterfaceC2330f interfaceC2330f;
        if (interfaceC2348x instanceof InterfaceC2330f) {
            if (((InterfaceC2330f) interfaceC2348x).c() == 2) {
                return 4;
            }
            return 1;
        }
        InterfaceC2335k lima = interfaceC2348x.lima();
        if (lima instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) lima;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f != null && (interfaceC2348x instanceof InterfaceC2328d)) {
            InterfaceC2328d interfaceC2328d = (InterfaceC2328d) interfaceC2348x;
            Collection mike = interfaceC2328d.mike();
            Intrinsics.delta(mike, "this.overriddenDescriptors");
            if (mike.isEmpty() || interfaceC2330f.golf() == 1) {
                if (interfaceC2330f.c() == 2 && !Intrinsics.areEqual(interfaceC2328d.getVisibility(), AbstractC2340p.alpha)) {
                    if (interfaceC2328d.golf() != 4) {
                        return 3;
                    }
                }
            } else {
                return 3;
            }
        }
        return 1;
    }

    public final void a(List list, StringBuilder sb2) {
        z zVar = this.delta;
        if (!((Boolean) zVar.victor.alpha(z.ochre[20], zVar)).booleanValue()) {
            ArrayList arrayList = new ArrayList(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pe.aq aqVar = (pe.aq) it.next();
                List upperBounds = aqVar.getUpperBounds();
                Intrinsics.delta(upperBounds, "typeParameter.upperBounds");
                for (kotlin.reflect.jvm.internal.impl.types.y it2 : CollectionsKt.crimson(upperBounds)) {
                    StringBuilder sb3 = new StringBuilder();
                    Ne.f name = aqVar.getName();
                    Intrinsics.delta(name, "typeParameter.name");
                    sb3.append(indigo(name, false));
                    sb3.append(" : ");
                    Intrinsics.delta(it2, "it");
                    sb3.append(orange(it2));
                    arrayList.add(sb3.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" ");
                sb2.append(cyan("where"));
                sb2.append(" ");
                CollectionsKt.magenta(arrayList, sb2, ", ", null, null, null, 124);
            }
        }
    }

    @Override // Pe.v
    public final void alpha() {
        this.delta.alpha();
    }

    public final void amber(InterfaceC2333i interfaceC2333i, StringBuilder sb2) {
        List papa = interfaceC2333i.papa();
        Intrinsics.delta(papa, "classifier.declaredTypeParameters");
        List parameters = interfaceC2333i.tango().getParameters();
        Intrinsics.delta(parameters, "classifier.typeConstructor.parameters");
        if (uniform() && interfaceC2333i.india() && parameters.size() > papa.size()) {
            sb2.append(" /*captured type parameters: ");
            purple(parameters.subList(papa.size(), parameters.size()), sb2);
            sb2.append("*/");
        }
    }

    public final String azure(Se.g gVar) {
        if (gVar instanceof Se.b) {
            return CollectionsKt.maroon((Iterable) ((Se.b) gVar).alpha, ", ", "{", "}", new p(this, 1), 24);
        }
        if (gVar instanceof Se.a) {
            return StringsKt.lime(xray((InterfaceC2466b) ((Se.a) gVar).alpha, null), "@");
        }
        if (gVar instanceof Se.r) {
            Se.q qVar = (Se.q) ((Se.r) gVar).alpha;
            if (qVar instanceof Se.o) {
                return ((Se.o) qVar).alpha + "::class";
            }
            if (qVar instanceof Se.p) {
                Se.p pVar = (Se.p) qVar;
                String bravo = pVar.alpha.alpha.bravo().bravo();
                Se.f fVar = pVar.alpha;
                for (int i4 = 0; i4 < fVar.bravo; i4++) {
                    bravo = AbstractC2327c.victor('>', "kotlin.Array<", bravo);
                }
                return P0.crimson(bravo, "::class");
            }
            throw new NoWhenBranchMatchedException();
        }
        return gVar.toString();
    }

    public final void beige(List list, StringBuilder sb2) {
        if (!list.isEmpty()) {
            sb2.append("context(");
            Iterator it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i5 = i4 + 1;
                C2871u c2871u = (C2871u) it.next();
                yankee(sb2, c2871u, EnumC2468d.RECEIVER);
                kotlin.reflect.jvm.internal.impl.types.y type = c2871u.getType();
                Intrinsics.delta(type, "contextReceiver.type");
                sb2.append(coral(type));
                if (i4 == CollectionsKt.ivory(list)) {
                    sb2.append(") ");
                } else {
                    sb2.append(", ");
                }
                i4 = i5;
            }
        }
    }

    public final void black(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.ae aeVar) {
        InterfaceC2333i interfaceC2333i;
        boolean z2;
        yankee(sb2, aeVar, null);
        boolean z10 = aeVar instanceof kotlin.reflect.jvm.internal.impl.types.o;
        if (kotlin.reflect.jvm.internal.impl.types.c.india(aeVar)) {
            boolean z11 = aeVar instanceof hf.f;
            if (z11 && ((hf.f) aeVar).silver.purple) {
                z2 = true;
            } else {
                z2 = false;
            }
            z zVar = this.delta;
            if (z2) {
                if (((Boolean) zVar.magenta.alpha(z.ochre[45], zVar)).booleanValue()) {
                    hf.i iVar = hf.i.alpha;
                    if (z11) {
                        boolean z12 = ((hf.f) aeVar).silver.purple;
                    }
                    ap green = aeVar.green();
                    Intrinsics.charlie(green, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                    sb2.append(blue(((hf.g) green).bravo[0]));
                }
            }
            if (z11) {
                if (!((Boolean) zVar.navy.alpha(z.ochre[47], zVar)).booleanValue()) {
                    sb2.append(((hf.f) aeVar).f12721a);
                    sb2.append(peach(aeVar.cyan()));
                }
            }
            sb2.append(aeVar.green().toString());
            sb2.append(peach(aeVar.cyan()));
        } else {
            ap green2 = aeVar.green();
            InterfaceC2332h kilo = aeVar.green().kilo();
            if (kilo instanceof InterfaceC2333i) {
                interfaceC2333i = (InterfaceC2333i) kilo;
            } else {
                interfaceC2333i = null;
            }
            com.bumptech.glide.load.engine.h alpha = AbstractC2347w.alpha(aeVar, interfaceC2333i, 0);
            if (alpha == null) {
                sb2.append(pink(green2));
                sb2.append(peach(aeVar.cyan()));
            } else {
                maroon(sb2, alpha);
            }
        }
        if (aeVar.indigo()) {
            sb2.append("?");
        }
        if (aeVar instanceof kotlin.reflect.jvm.internal.impl.types.o) {
            sb2.append(" & Any");
        }
    }

    public final String blue(String str) {
        int ordinal = sierra().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ao.ad.gray("<font color=red><b>", str, "</b></font>");
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    @Override // Pe.v
    public final void bravo() {
        this.delta.bravo();
    }

    public final String bronze(String lowerRendered, String upperRendered, AbstractC2120h abstractC2120h) {
        Intrinsics.echo(lowerRendered, "lowerRendered");
        Intrinsics.echo(upperRendered, "upperRendered");
        if (U6.echo(lowerRendered, upperRendered)) {
            if (kotlin.text.r.quebec(upperRendered, "(", false)) {
                return ao.ad.gray("(", lowerRendered, ")!");
            }
            return lowerRendered.concat("!");
        }
        String silver = StringsKt.silver(papa().alpha(abstractC2120h.india(me.m.azure), this), "Collection");
        String delta = U6.delta(lowerRendered, silver.concat("Mutable"), upperRendered, silver, silver.concat("(Mutable)"));
        if (delta != null) {
            return delta;
        }
        String delta2 = U6.delta(lowerRendered, silver.concat("MutableMap.MutableEntry"), upperRendered, silver.concat("Map.Entry"), silver.concat("(Mutable)Map.(Mutable)Entry"));
        if (delta2 != null) {
            return delta2;
        }
        String silver2 = StringsKt.silver(papa().alpha(abstractC2120h.juliet("Array"), this), "Array");
        String delta3 = U6.delta(lowerRendered, silver2.concat(oscar("Array<")), upperRendered, silver2.concat(oscar("Array<out ")), silver2.concat(oscar("Array<(out) ")));
        if (delta3 != null) {
            return delta3;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @Override // Pe.v
    public final void charlie() {
        this.delta.charlie();
    }

    public final String coral(kotlin.reflect.jvm.internal.impl.types.y yVar) {
        String orange = orange(yVar);
        if ((b(yVar) && !az.foxtrot(yVar)) || (yVar instanceof kotlin.reflect.jvm.internal.impl.types.o)) {
            return AbstractC2327c.victor(')', "(", orange);
        }
        return orange;
    }

    public final void crimson(aw awVar, StringBuilder sb2) {
        Se.g navy;
        z zVar = this.delta;
        if (((Boolean) zVar.uniform.alpha(z.ochre[19], zVar)).booleanValue() && (navy = awVar.navy()) != null) {
            sb2.append(" = ");
            sb2.append(oscar(azure(navy)));
        }
    }

    public final String cyan(String str) {
        int ordinal = sierra().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z zVar = this.delta;
                if (!((Boolean) zVar.maroon.alpha(z.ochre[46], zVar)).booleanValue()) {
                    return ao.ad.gray("<b>", str, "</b>");
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return str;
    }

    @Override // Pe.v
    public final void delta(Set set) {
        Intrinsics.echo(set, "<set-?>");
        this.delta.delta(set);
    }

    @Override // Pe.v
    public final void echo(LinkedHashSet linkedHashSet) {
        this.delta.echo(linkedHashSet);
    }

    public final void emerald(StringBuilder sb2, InterfaceC2328d interfaceC2328d) {
        String str;
        if (quebec().contains(u.MEMBER_KIND) && uniform() && interfaceC2328d.november() != 1) {
            sb2.append("/*");
            int november = interfaceC2328d.november();
            if (november != 1) {
                if (november != 2) {
                    if (november != 3) {
                        if (november == 4) {
                            str = "SYNTHESIZED";
                        } else {
                            throw null;
                        }
                    } else {
                        str = "DELEGATION";
                    }
                } else {
                    str = "FAKE_OVERRIDE";
                }
            } else {
                str = "DECLARATION";
            }
            sb2.append(E6.delta(str));
            sb2.append("*/ ");
        }
    }

    @Override // Pe.v
    public final void foxtrot() {
        this.delta.foxtrot();
    }

    public final void fuchsia(InterfaceC2348x interfaceC2348x, StringBuilder sb2) {
        boolean z2;
        green(sb2, interfaceC2348x.isExternal(), "external");
        boolean z10 = false;
        if (quebec().contains(u.EXPECT) && interfaceC2348x.emerald()) {
            z2 = true;
        } else {
            z2 = false;
        }
        green(sb2, z2, "expect");
        if (quebec().contains(u.ACTUAL) && interfaceC2348x.y()) {
            z10 = true;
        }
        green(sb2, z10, "actual");
    }

    public final void gold(StringBuilder sb2, int i4, int i5) {
        String str;
        z zVar = this.delta;
        if (!((Boolean) zVar.papa.alpha(z.ochre[14], zVar)).booleanValue() && i4 == i5) {
            return;
        }
        boolean contains = quebec().contains(u.MODALITY);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        str = "ABSTRACT";
                    } else {
                        throw null;
                    }
                } else {
                    str = "OPEN";
                }
            } else {
                str = "SEALED";
            }
        } else {
            str = "FINAL";
        }
        green(sb2, contains, E6.delta(str));
    }

    @Override // Pe.v
    public final void golf(c cVar) {
        this.delta.golf(cVar);
    }

    public final void gray(StringBuilder sb2, InterfaceC2328d interfaceC2328d) {
        if (!Qe.e.sierra(interfaceC2328d) || interfaceC2328d.golf() != 1) {
            z zVar = this.delta;
            if (((ac) zVar.amber.alpha(z.ochre[25], zVar)) == ac.alpha && interfaceC2328d.golf() == 3 && !interfaceC2328d.mike().isEmpty()) {
                return;
            }
            int golf = interfaceC2328d.golf();
            com.google.android.material.datepicker.j.sierra(golf, "callable.modality");
            gold(sb2, golf, victor(interfaceC2328d));
        }
    }

    public final void green(StringBuilder sb2, boolean z2, String str) {
        if (z2) {
            sb2.append(cyan(str));
            sb2.append(" ");
        }
    }

    @Override // Pe.v
    public final void hotel() {
        this.delta.hotel();
    }

    @Override // Pe.v
    public final void india() {
        this.delta.india();
    }

    public final String indigo(Ne.f fVar, boolean z2) {
        String oscar = oscar(U6.bravo(fVar));
        z zVar = this.delta;
        if (((Boolean) zVar.maroon.alpha(z.ochre[46], zVar)).booleanValue() && sierra() == ah.purple && z2) {
            return ao.ad.gray("<b>", oscar, "</b>");
        }
        return oscar;
    }

    public final void ivory(InterfaceC2335k interfaceC2335k, StringBuilder sb2, boolean z2) {
        Ne.f name = interfaceC2335k.getName();
        Intrinsics.delta(name, "descriptor.name");
        sb2.append(indigo(name, z2));
    }

    public final void jade(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        C2039a c2039a;
        B ochre = yVar.ochre();
        if (ochre instanceof C2039a) {
            c2039a = (C2039a) ochre;
        } else {
            c2039a = null;
        }
        if (c2039a != null) {
            z zVar = this.delta;
            ge.v[] vVarArr = z.ochre;
            boolean booleanValue = ((Boolean) zVar.jade.alpha(vVarArr[41], zVar)).booleanValue();
            kotlin.reflect.jvm.internal.impl.types.ae aeVar = c2039a.purple;
            if (booleanValue) {
                lavender(sb2, aeVar);
                return;
            }
            lavender(sb2, c2039a.red);
            if (((Boolean) zVar.ivory.alpha(vVarArr[40], zVar)).booleanValue()) {
                ah sierra = sierra();
                af afVar = ah.purple;
                if (sierra == afVar) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* = ");
                lavender(sb2, aeVar);
                sb2.append(" */");
                if (sierra() == afVar) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        lavender(sb2, yVar);
    }

    @Override // Pe.v
    public final Set juliet() {
        return this.delta.juliet();
    }

    @Override // Pe.v
    public final void kilo(ad adVar) {
        this.delta.kilo(adVar);
    }

    public final void lavender(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        boolean z2;
        boolean z10;
        Ne.f fVar;
        String oscar;
        boolean z11;
        boolean z12 = yVar instanceof kotlin.reflect.jvm.internal.impl.types.ac;
        z zVar = this.delta;
        if (z12 && zVar.november()) {
            ff.i iVar = ((kotlin.reflect.jvm.internal.impl.types.ac) yVar).silver;
            if (iVar.red == ff.k.alpha || iVar.red == ff.k.purple) {
                sb2.append("<Not computed yet>");
                return;
            }
        }
        B ochre = yVar.ochre();
        if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.s) {
            sb2.append(((kotlin.reflect.jvm.internal.impl.types.s) ochre).f(this, this));
            return;
        }
        if (ochre instanceof kotlin.reflect.jvm.internal.impl.types.ae) {
            kotlin.reflect.jvm.internal.impl.types.ae aeVar = (kotlin.reflect.jvm.internal.impl.types.ae) ochre;
            if (!Intrinsics.areEqual(aeVar, az.bravo) && aeVar.green() != az.alpha.purple) {
                ap green = aeVar.green();
                if ((green instanceof hf.g) && ((hf.g) green).alpha == hf.h.f12724c) {
                    if (((Boolean) zVar.tango.alpha(z.ochre[18], zVar)).booleanValue()) {
                        ap green2 = aeVar.green();
                        Intrinsics.charlie(green2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                        sb2.append(blue(((hf.g) green2).bravo[0]));
                        return;
                    }
                    sb2.append("???");
                    return;
                }
                if (kotlin.reflect.jvm.internal.impl.types.c.india(aeVar)) {
                    black(sb2, aeVar);
                    return;
                }
                if (b(aeVar)) {
                    int length = sb2.length();
                    ((t) this.echo.getValue()).yankee(sb2, aeVar, null);
                    if (sb2.length() != length) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    kotlin.reflect.jvm.internal.impl.types.y foxtrot = D6.foxtrot(aeVar);
                    List delta = D6.delta(aeVar);
                    if (!delta.isEmpty()) {
                        sb2.append("context(");
                        Iterator it = delta.subList(0, CollectionsKt.ivory(delta)).iterator();
                        while (it.hasNext()) {
                            jade(sb2, (kotlin.reflect.jvm.internal.impl.types.y) it.next());
                            sb2.append(", ");
                        }
                        jade(sb2, (kotlin.reflect.jvm.internal.impl.types.y) CollectionsKt.ochre(delta));
                        sb2.append(") ");
                    }
                    boolean india = D6.india(aeVar);
                    boolean indigo = aeVar.indigo();
                    if (!indigo && (!z2 || foxtrot == null)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (india) {
                            sb2.insert(length, '(');
                        } else {
                            if (z2) {
                                AbstractC2743p6.delta(StringsKt.green(sb2));
                                if (sb2.charAt(StringsKt.cyan(sb2) - 1) != ')') {
                                    sb2.insert(StringsKt.cyan(sb2), "()");
                                }
                            }
                            sb2.append("(");
                        }
                    }
                    green(sb2, india, "suspend");
                    if (foxtrot != null) {
                        if ((!b(foxtrot) || foxtrot.indigo()) && !D6.india(foxtrot) && foxtrot.getAnnotations().isEmpty() && !(foxtrot instanceof kotlin.reflect.jvm.internal.impl.types.o)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            sb2.append("(");
                        }
                        jade(sb2, foxtrot);
                        if (z11) {
                            sb2.append(")");
                        }
                        sb2.append(".");
                    }
                    sb2.append("(");
                    if (D6.hotel(aeVar) && aeVar.getAnnotations().gray(me.m.papa) != null && aeVar.cyan().size() <= 1) {
                        sb2.append("???");
                    } else {
                        int i4 = 0;
                        for (as typeProjection : D6.golf(aeVar)) {
                            int i5 = i4 + 1;
                            if (i4 > 0) {
                                sb2.append(", ");
                            }
                            if (((Boolean) zVar.lime.alpha(z.ochre[43], zVar)).booleanValue()) {
                                kotlin.reflect.jvm.internal.impl.types.y bravo = typeProjection.bravo();
                                Intrinsics.delta(bravo, "typeProjection.type");
                                fVar = D6.charlie(bravo);
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                sb2.append(indigo(fVar, false));
                                sb2.append(": ");
                            }
                            Intrinsics.echo(typeProjection, "typeProjection");
                            StringBuilder sb3 = new StringBuilder();
                            CollectionsKt.magenta(kotlin.collections.ab.juliet(typeProjection), sb3, ", ", null, null, new p(this, 0), 60);
                            String sb4 = sb3.toString();
                            Intrinsics.delta(sb4, "StringBuilder().apply(builderAction).toString()");
                            sb2.append(sb4);
                            i4 = i5;
                        }
                    }
                    sb2.append(") ");
                    int ordinal = sierra().ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            oscar = "&rarr;";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        oscar = oscar("->");
                    }
                    sb2.append(oscar);
                    sb2.append(" ");
                    D6.hotel(aeVar);
                    kotlin.reflect.jvm.internal.impl.types.y bravo2 = ((as) CollectionsKt.ochre(aeVar.cyan())).bravo();
                    Intrinsics.delta(bravo2, "arguments.last().type");
                    jade(sb2, bravo2);
                    if (z10) {
                        sb2.append(")");
                    }
                    if (indigo) {
                        sb2.append("?");
                        return;
                    }
                    return;
                }
                black(sb2, aeVar);
                return;
            }
            sb2.append("???");
        }
    }

    @Override // Pe.v
    public final void lima() {
        this.delta.lima();
    }

    public final void lime(StringBuilder sb2, InterfaceC2328d interfaceC2328d) {
        if (quebec().contains(u.OVERRIDE) && !interfaceC2328d.mike().isEmpty()) {
            z zVar = this.delta;
            if (((ac) zVar.amber.alpha(z.ochre[25], zVar)) != ac.purple) {
                green(sb2, true, "override");
                if (uniform()) {
                    sb2.append("/*");
                    sb2.append(interfaceC2328d.mike().size());
                    sb2.append("*/ ");
                }
            }
        }
    }

    public final void magenta(Ne.c cVar, String str, StringBuilder sb2) {
        sb2.append(cyan(str));
        Ne.e india = cVar.india();
        Intrinsics.delta(india, "fqName.toUnsafe()");
        String oscar = oscar(U6.charlie(india.echo()));
        if (oscar.length() > 0) {
            sb2.append(" ");
            sb2.append(oscar);
        }
    }

    public final void maroon(StringBuilder sb2, com.bumptech.glide.load.engine.h hVar) {
        com.bumptech.glide.load.engine.h hVar2 = (com.bumptech.glide.load.engine.h) hVar.silver;
        InterfaceC2333i interfaceC2333i = (InterfaceC2333i) hVar.purple;
        if (hVar2 != null) {
            maroon(sb2, hVar2);
            sb2.append('.');
            Ne.f name = interfaceC2333i.getName();
            Intrinsics.delta(name, "possiblyInnerType.classifierDescriptor.name");
            sb2.append(indigo(name, false));
        } else {
            ap tango = interfaceC2333i.tango();
            Intrinsics.delta(tango, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb2.append(pink(tango));
        }
        sb2.append(peach((List) hVar.red));
    }

    @Override // Pe.v
    public final void mike() {
        this.delta.mike();
    }

    public final void navy(StringBuilder sb2, InterfaceC2328d interfaceC2328d) {
        C2871u g2 = interfaceC2328d.g();
        if (g2 != null) {
            yankee(sb2, g2, EnumC2468d.RECEIVER);
            kotlin.reflect.jvm.internal.impl.types.y type = g2.getType();
            Intrinsics.delta(type, "receiver.type");
            sb2.append(coral(type));
            sb2.append(".");
        }
    }

    public final void ochre(StringBuilder sb2, InterfaceC2328d interfaceC2328d) {
        C2871u g2;
        z zVar = this.delta;
        if (((Boolean) zVar.blue.alpha(z.ochre[29], zVar)).booleanValue() && (g2 = interfaceC2328d.g()) != null) {
            sb2.append(" on ");
            kotlin.reflect.jvm.internal.impl.types.y type = g2.getType();
            Intrinsics.delta(type, "receiver.type");
            sb2.append(orange(type));
        }
    }

    public final String orange(kotlin.reflect.jvm.internal.impl.types.y type) {
        Intrinsics.echo(type, "type");
        StringBuilder sb2 = new StringBuilder();
        z zVar = this.delta;
        jade(sb2, (kotlin.reflect.jvm.internal.impl.types.y) ((Function1) zVar.xray.alpha(z.ochre[22], zVar)).invoke(type));
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String oscar(String str) {
        return sierra().alpha(str);
    }

    public final c papa() {
        z zVar = this.delta;
        return (c) zVar.bravo.alpha(z.ochre[0], zVar);
    }

    public final String peach(List typeArguments) {
        Intrinsics.echo(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(oscar("<"));
        CollectionsKt.magenta(typeArguments, sb2, ", ", null, null, new p(this, 0), 60);
        sb2.append(oscar(">"));
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String pink(ap typeConstructor) {
        boolean z2;
        Intrinsics.echo(typeConstructor, "typeConstructor");
        InterfaceC2332h klass = typeConstructor.kilo();
        boolean z10 = true;
        if (klass instanceof pe.aq) {
            z2 = true;
        } else {
            z2 = klass instanceof InterfaceC2330f;
        }
        if (!z2) {
            z10 = klass instanceof ef.s;
        }
        if (z10) {
            Intrinsics.echo(klass, "klass");
            if (hf.i.foxtrot(klass)) {
                return klass.tango().toString();
            }
            return papa().alpha(klass, this);
        }
        if (klass == null) {
            if (typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.x) {
                return ((kotlin.reflect.jvm.internal.impl.types.x) typeConstructor).charlie(s.alpha);
            }
            return typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    public final void plum(pe.aq aqVar, StringBuilder sb2, boolean z2) {
        String str;
        boolean z10;
        if (z2) {
            sb2.append(oscar("<"));
        }
        if (uniform()) {
            sb2.append("/*");
            sb2.append(aqVar.getIndex());
            sb2.append("*/ ");
        }
        green(sb2, aqVar.black(), "reified");
        int fuchsia = aqVar.fuchsia();
        if (fuchsia != 1) {
            if (fuchsia != 2) {
                if (fuchsia == 3) {
                    str = "out";
                } else {
                    throw null;
                }
            } else {
                str = "in";
            }
        } else {
            str = "";
        }
        boolean z11 = true;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        green(sb2, z10, str);
        yankee(sb2, aqVar, null);
        ivory(aqVar, sb2, z2);
        int size = aqVar.getUpperBounds().size();
        if ((size > 1 && !z2) || size == 1) {
            kotlin.reflect.jvm.internal.impl.types.y yVar = (kotlin.reflect.jvm.internal.impl.types.y) aqVar.getUpperBounds().iterator().next();
            if (yVar != null) {
                if (!AbstractC2120h.whiskey(yVar) || !yVar.indigo()) {
                    sb2.append(" : ");
                    sb2.append(orange(yVar));
                }
            } else {
                AbstractC2120h.alpha(ModuleDescriptor.MODULE_VERSION);
                throw null;
            }
        } else if (z2) {
            for (kotlin.reflect.jvm.internal.impl.types.y yVar2 : aqVar.getUpperBounds()) {
                if (yVar2 != null) {
                    if (!AbstractC2120h.whiskey(yVar2) || !yVar2.indigo()) {
                        if (z11) {
                            sb2.append(" : ");
                        } else {
                            sb2.append(" & ");
                        }
                        sb2.append(orange(yVar2));
                        z11 = false;
                    }
                } else {
                    AbstractC2120h.alpha(ModuleDescriptor.MODULE_VERSION);
                    throw null;
                }
            }
        }
        if (z2) {
            sb2.append(oscar(">"));
        }
    }

    public final void purple(List list, StringBuilder sb2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            plum((pe.aq) it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    public final Set quebec() {
        z zVar = this.delta;
        return (Set) zVar.echo.alpha(z.ochre[3], zVar);
    }

    public final void red(StringBuilder sb2, List list, boolean z2) {
        z zVar = this.delta;
        if (!((Boolean) zVar.victor.alpha(z.ochre[20], zVar)).booleanValue() && !list.isEmpty()) {
            sb2.append(oscar("<"));
            purple(list, sb2);
            sb2.append(oscar(">"));
            if (z2) {
                sb2.append(" ");
            }
        }
    }

    public final boolean romeo() {
        z zVar = this.delta;
        return ((Boolean) zVar.foxtrot.alpha(z.ochre[4], zVar)).booleanValue();
    }

    public final ah sierra() {
        z zVar = this.delta;
        return (ah) zVar.beige.alpha(z.ochre[27], zVar);
    }

    public final void silver(aw awVar, StringBuilder sb2, boolean z2) {
        String str;
        if (!z2 && (awVar instanceof aq)) {
            return;
        }
        if (awVar.e()) {
            str = "var";
        } else {
            str = "val";
        }
        sb2.append(cyan(str));
        sb2.append(" ");
    }

    public final n tango() {
        z zVar = this.delta;
        return (n) zVar.azure.alpha(z.ochre[26], zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void teal(aq aqVar, boolean z2, StringBuilder sb2, boolean z10) {
        boolean z11;
        kotlin.reflect.jvm.internal.impl.types.y type;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        kotlin.reflect.jvm.internal.impl.types.y yVar2;
        boolean z12;
        boolean alpha;
        if (z10) {
            sb2.append(cyan("value-parameter"));
            sb2.append(" ");
        }
        if (uniform()) {
            sb2.append("/*");
            sb2.append(aqVar.white);
            sb2.append("*/ ");
        }
        C2859i c2859i = null;
        yankee(sb2, aqVar, null);
        green(sb2, aqVar.f13745a, "crossinline");
        green(sb2, aqVar.f13746b, "noinline");
        z zVar = this.delta;
        ge.v[] vVarArr = z.ochre;
        boolean z13 = false;
        if (((Boolean) zVar.romeo.alpha(vVarArr[16], zVar)).booleanValue()) {
            InterfaceC2326b lima = aqVar.lima();
            if (lima instanceof C2859i) {
                c2859i = (C2859i) lima;
            }
            if (c2859i != null && c2859i.f13752w) {
                z11 = true;
                if (z11) {
                    green(sb2, ((Boolean) zVar.sierra.alpha(vVarArr[17], zVar)).booleanValue(), "actual");
                }
                type = aqVar.getType();
                Intrinsics.delta(type, "variable.type");
                yVar = aqVar.f13747c;
                if (yVar != null) {
                    yVar2 = type;
                } else {
                    yVar2 = yVar;
                }
                if (yVar == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                green(sb2, z12, "vararg");
                if (!z11 || (z10 && !romeo())) {
                    silver(aqVar, sb2, z11);
                }
                if (z2) {
                    ivory(aqVar, sb2, z10);
                    sb2.append(": ");
                }
                sb2.append(orange(yVar2));
                crimson(aqVar, sb2);
                if (uniform() && yVar != null) {
                    sb2.append(" /*");
                    sb2.append(orange(type));
                    sb2.append("*/");
                }
                if (((Function1) zVar.yankee.alpha(vVarArr[23], zVar)) != null) {
                    if (zVar.november()) {
                        alpha = aqVar.a0();
                    } else {
                        alpha = Ue.e.alpha(aqVar);
                    }
                    if (alpha) {
                        z13 = true;
                    }
                }
                if (!z13) {
                    StringBuilder sb3 = new StringBuilder(" = ");
                    Function1 function1 = (Function1) zVar.yankee.alpha(vVarArr[23], zVar);
                    Intrinsics.checkNotNull(function1);
                    sb3.append((String) function1.invoke(aqVar));
                    sb2.append(sb3.toString());
                    return;
                }
                return;
            }
        }
        z11 = false;
        if (z11) {
        }
        type = aqVar.getType();
        Intrinsics.delta(type, "variable.type");
        yVar = aqVar.f13747c;
        if (yVar != null) {
        }
        if (yVar == null) {
        }
        green(sb2, z12, "vararg");
        if (!z11) {
        }
        silver(aqVar, sb2, z11);
        if (z2) {
        }
        sb2.append(orange(yVar2));
        crimson(aqVar, sb2);
        if (uniform()) {
            sb2.append(" /*");
            sb2.append(orange(type));
            sb2.append("*/");
        }
        if (((Function1) zVar.yankee.alpha(vVarArr[23], zVar)) != null) {
        }
        if (!z13) {
        }
    }

    public final boolean uniform() {
        z zVar = this.delta;
        return ((Boolean) zVar.juliet.alpha(z.ochre[8], zVar)).booleanValue();
    }

    public final String whiskey(InterfaceC2335k declarationDescriptor) {
        InterfaceC2335k lima;
        String str;
        String oscar;
        Intrinsics.echo(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.quebec(new O7.l(2, this), sb2);
        z zVar = this.delta;
        x xVar = zVar.charlie;
        ge.v[] vVarArr = z.ochre;
        if (((Boolean) xVar.alpha(vVarArr[1], zVar)).booleanValue() && !(declarationDescriptor instanceof InterfaceC2321ad) && !(declarationDescriptor instanceof pe.ai) && (lima = declarationDescriptor.lima()) != null && !(lima instanceof InterfaceC2349y)) {
            sb2.append(" ");
            int ordinal = sierra().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = "<i>defined in</i>";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = "defined in";
            }
            sb2.append(str);
            sb2.append(" ");
            Ne.e golf = Qe.e.golf(lima);
            Intrinsics.delta(golf, "getFqName(containingDeclaration)");
            if (golf.alpha.isEmpty()) {
                oscar = "root package";
            } else {
                oscar = oscar(U6.charlie(golf.echo()));
            }
            sb2.append(oscar);
            if (((Boolean) zVar.delta.alpha(vVarArr[2], zVar)).booleanValue() && (lima instanceof InterfaceC2321ad) && (declarationDescriptor instanceof InterfaceC2336l)) {
                ((InterfaceC2336l) declarationDescriptor).echo().getClass();
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r10 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void white(StringBuilder builder, List list, boolean z2) {
        boolean z10;
        Iterator it;
        z zVar = this.delta;
        int ordinal = ((ad) zVar.black.alpha(z.ochre[28], zVar)).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            z10 = false;
            int size = list.size();
            tango().getClass();
            Intrinsics.echo(builder, "builder");
            builder.append("(");
            it = list.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                int i5 = i4 + 1;
                aq parameter = (aq) it.next();
                tango().getClass();
                Intrinsics.echo(parameter, "parameter");
                teal(parameter, z10, builder, false);
                tango().getClass();
                if (i4 != size - 1) {
                    builder.append(", ");
                }
                i4 = i5;
            }
            tango().getClass();
            builder.append(")");
        }
        z10 = true;
        int size2 = list.size();
        tango().getClass();
        Intrinsics.echo(builder, "builder");
        builder.append("(");
        it = list.iterator();
        int i42 = 0;
        while (it.hasNext()) {
        }
        tango().getClass();
        builder.append(")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    public final String xray(InterfaceC2466b annotation, EnumC2468d enumC2468d) {
        InterfaceC2330f interfaceC2330f;
        String str;
        C2859i lavender;
        List peach;
        Intrinsics.echo(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (enumC2468d != null) {
            sb2.append(enumC2468d.alpha + ':');
        }
        kotlin.reflect.jvm.internal.impl.types.y type = annotation.getType();
        sb2.append(orange(type));
        z zVar = this.delta;
        ge.v[] vVarArr = z.ochre;
        ge.v vVar = vVarArr[37];
        x xVar = zVar.gray;
        if (((a) xVar.alpha(vVar, zVar)).alpha) {
            Map bravo = annotation.bravo();
            List list = 0;
            list = 0;
            list = 0;
            if (((Boolean) zVar.crimson.alpha(vVarArr[32], zVar)).booleanValue()) {
                interfaceC2330f = Ue.e.delta(annotation);
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null && (lavender = interfaceC2330f.lavender()) != null && (peach = lavender.peach()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : peach) {
                    if (((aq) obj).a0()) {
                        arrayList.add(obj);
                    }
                }
                list = new ArrayList(CollectionsKt.blue(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add(((aq) it.next()).getName());
                }
            }
            if (list == 0) {
                list = CollectionsKt.emptyList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                Ne.f it2 = (Ne.f) obj2;
                Intrinsics.delta(it2, "it");
                if (!bravo.containsKey(it2)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.blue(arrayList2));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((Ne.f) it3.next()).bravo() + " = ...");
            }
            Set<Map.Entry> entrySet = bravo.entrySet();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.blue(entrySet));
            for (Map.Entry entry : entrySet) {
                Ne.f fVar = (Ne.f) entry.getKey();
                Se.g gVar = (Se.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.bravo());
                sb3.append(" = ");
                if (!list.contains(fVar)) {
                    str = azure(gVar);
                } else {
                    str = "...";
                }
                sb3.append(str);
                arrayList4.add(sb3.toString());
            }
            List o5 = CollectionsKt.o(CollectionsKt.a(arrayList3, arrayList4));
            if (((a) xVar.alpha(z.ochre[37], zVar)).purple || !o5.isEmpty()) {
                CollectionsKt.magenta(o5, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (uniform() && (kotlin.reflect.jvm.internal.impl.types.c.india(type) || (type.green().kilo() instanceof C2319ab))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb4 = sb2.toString();
        Intrinsics.delta(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public final void yankee(StringBuilder sb2, InterfaceC2465a interfaceC2465a, EnumC2468d enumC2468d) {
        Set set;
        if (quebec().contains(u.ANNOTATIONS)) {
            boolean z2 = interfaceC2465a instanceof kotlin.reflect.jvm.internal.impl.types.y;
            z zVar = this.delta;
            if (z2) {
                set = zVar.juliet();
            } else {
                set = (Set) zVar.emerald.alpha(z.ochre[34], zVar);
            }
            Function1 function1 = (Function1) zVar.gold.alpha(z.ochre[36], zVar);
            for (InterfaceC2466b interfaceC2466b : interfaceC2465a.getAnnotations()) {
                if (!CollectionsKt.bronze(set, interfaceC2466b.alpha()) && !Intrinsics.areEqual(interfaceC2466b.alpha(), me.m.romeo) && (function1 == null || ((Boolean) function1.invoke(interfaceC2466b)).booleanValue())) {
                    sb2.append(xray(interfaceC2466b, enumC2468d));
                    if (((Boolean) zVar.cyan.alpha(z.ochre[33], zVar)).booleanValue()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    public final boolean yellow(C2339o c2339o, StringBuilder sb2) {
        if (quebec().contains(u.VISIBILITY)) {
            z zVar = this.delta;
            ge.v[] vVarArr = z.ochre;
            if (((Boolean) zVar.november.alpha(vVarArr[12], zVar)).booleanValue()) {
                c2339o = AbstractC2340p.foxtrot(c2339o.alpha.charlie());
            }
            if (!((Boolean) zVar.oscar.alpha(vVarArr[13], zVar)).booleanValue() && Intrinsics.areEqual(c2339o, AbstractC2340p.juliet)) {
                return false;
            }
            sb2.append(cyan(c2339o.alpha.bravo()));
            sb2.append(" ");
            return true;
        }
        return false;
    }
}
