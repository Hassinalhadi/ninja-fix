package ye;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {
    public static final x charlie;
    public final z alpha;
    public final boolean bravo;

    static {
        af globalReportLevel;
        af afVar;
        Ne.c cVar = u.alpha;
        kotlin.g configuredKotlinVersion = kotlin.g.teal;
        Intrinsics.echo(configuredKotlinVersion, "configuredKotlinVersion");
        v vVar = u.delta;
        kotlin.g gVar = vVar.bravo;
        if (gVar != null && gVar.silver - configuredKotlinVersion.silver <= 0) {
            globalReportLevel = vVar.charlie;
        } else {
            globalReportLevel = vVar.alpha;
        }
        Intrinsics.echo(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == af.WARN) {
            afVar = null;
        } else {
            afVar = globalReportLevel;
        }
        z zVar = new z(globalReportLevel, afVar);
        w wVar = w.alpha;
        charlie = new x(zVar);
    }

    public x(z zVar) {
        boolean z2;
        w wVar = w.alpha;
        this.alpha = zVar;
        if (!zVar.echo && wVar.invoke(u.alpha) != af.IGNORE) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.bravo = z2;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.alpha + ", getReportLevelForAnnotation=" + w.alpha + ')';
    }
}
