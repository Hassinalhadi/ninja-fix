package ye;

import ge.InterfaceC1774f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.h implements Function1 {
    public static final w alpha = new kotlin.jvm.internal.h(1);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return kotlin.jvm.internal.u.alpha.charlie(u.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Ne.c p02 = (Ne.c) obj;
        Intrinsics.echo(p02, "p0");
        Ne.c cVar = u.alpha;
        ae.plum.getClass();
        com.google.android.material.internal.ab configuredReportLevels = ad.bravo;
        kotlin.g gVar = new kotlin.g(1, 7, 20);
        Intrinsics.echo(configuredReportLevels, "configuredReportLevels");
        af afVar = (af) ((ff.j) configuredReportLevels.red).invoke(p02);
        if (afVar != null) {
            return afVar;
        }
        com.google.android.material.internal.ab abVar = u.charlie;
        abVar.getClass();
        v vVar = (v) ((ff.j) abVar.red).invoke(p02);
        if (vVar == null) {
            return af.IGNORE;
        }
        kotlin.g gVar2 = vVar.bravo;
        if (gVar2 != null && gVar2.silver - gVar.silver <= 0) {
            return vVar.charlie;
        }
        return vVar.alpha;
    }
}
