package je;

import ef.C1661i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.AbstractC2340p;
import pe.InterfaceC2321ad;
import pe.InterfaceC2335k;
import s6.AbstractC2617b6;

/* renamed from: je.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1974m extends V {
    public final pe.al purple;
    public final Ie.ag red;
    public final Le.e silver;
    public final Ke.e teal;
    public final G6.j white;
    public final String yellow;

    public C1974m(pe.al alVar, Ie.ag proto, Le.e eVar, Ke.e nameResolver, G6.j typeTable) {
        String str;
        String sb2;
        String str2;
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(nameResolver, "nameResolver");
        Intrinsics.echo(typeTable, "typeTable");
        this.purple = alVar;
        this.red = proto;
        this.silver = eVar;
        this.teal = nameResolver;
        this.white = typeTable;
        if ((eVar.purple & 4) == 4) {
            sb2 = nameResolver.getString(eVar.teal.red).concat(nameResolver.getString(eVar.teal.silver));
        } else {
            Me.d bravo = Me.h.bravo(proto, nameResolver, typeTable, true);
            if (bravo != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(ye.aa.alpha(bravo.bravo));
                InterfaceC2335k lima = alVar.lima();
                Intrinsics.delta(lima, "descriptor.containingDeclaration");
                if (Intrinsics.areEqual(alVar.getVisibility(), AbstractC2340p.delta) && (lima instanceof C1661i)) {
                    Oe.n classModuleName = Le.k.india;
                    Intrinsics.delta(classModuleName, "classModuleName");
                    Integer num = (Integer) AbstractC2617b6.charlie(((C1661i) lima).teal, classModuleName);
                    if (num != null) {
                        str2 = nameResolver.getString(num.intValue());
                    } else {
                        str2 = "main";
                    }
                    str = "$".concat(Ne.g.alpha.foxtrot(str2, "_"));
                } else {
                    if (Intrinsics.areEqual(alVar.getVisibility(), AbstractC2340p.alpha) && (lima instanceof InterfaceC2321ad)) {
                        Ge.g gVar = ((ef.q) alVar).f12603x;
                        if (av.q.kilo(gVar) && gVar.purple != null) {
                            StringBuilder sb4 = new StringBuilder("$");
                            String echo = gVar.alpha.echo();
                            Intrinsics.delta(echo, "className.internalName");
                            sb4.append(Ne.f.echo(StringsKt.purple('/', echo, echo)).bravo());
                            str = sb4.toString();
                        }
                    }
                    str = "";
                }
                sb3.append(str);
                sb3.append("()");
                sb3.append(bravo.charlie);
                sb2 = sb3.toString();
            } else {
                throw new Q("No field signature for property: " + alVar);
            }
        }
        this.yellow = sb2;
    }

    @Override // je.V
    public final String foxtrot() {
        return this.yellow;
    }
}
