package s6;

import Ie.C0181a;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import pe.InterfaceC2331g;
import pe.InterfaceC2349y;
import qe.InterfaceC2472h;

/* renamed from: s6.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2826z0 {
    public static B9.ab alpha(B9.ab abVar, InterfaceC2331g interfaceC2331g, ve.q qVar, int i4) {
        Be.f fVar;
        if ((i4 & 2) != 0) {
            qVar = null;
        }
        Intrinsics.echo(abVar, "<this>");
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Aa.i(4, abVar, interfaceC2331g));
        Be.a aVar = (Be.a) abVar.purple;
        if (qVar != null) {
            fVar = new Be.e(abVar, interfaceC2331g, qVar, 0);
        } else {
            fVar = (Be.f) abVar.white;
        }
        return new B9.ab(aVar, fVar, alpha);
    }

    public static final B9.ab bravo(B9.ab abVar, InterfaceC2472h additionalAnnotations) {
        Intrinsics.echo(abVar, "<this>");
        Intrinsics.echo(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return abVar;
        }
        return new B9.ab((Be.a) abVar.purple, (Be.f) abVar.white, LazyKt.alpha(kotlin.i.purple, new Aa.i(5, abVar, additionalAnnotations)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        if (r0 <= r2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static df.c charlie(Ne.c fqName, ff.l lVar, InterfaceC2349y module, InputStream inputStream) {
        Ie.ae aeVar;
        Ie.ae aeVar2;
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(module, "module");
        try {
            Je.a aVar = Je.a.foxtrot;
            Je.a echo = R5.echo(inputStream);
            Je.a ourVersion = Je.a.foxtrot;
            Intrinsics.echo(ourVersion, "ourVersion");
            int i4 = echo.charlie;
            int i5 = ourVersion.charlie;
            int i10 = ourVersion.bravo;
            int i11 = echo.bravo;
            if (i11 == 0) {
                if (i10 == 0 && i4 == i5) {
                    Oe.h hVar = new Oe.h();
                    Je.b.alpha(hVar);
                    C0181a c0181a = Ie.ae.f1431d;
                    c0181a.getClass();
                    Oe.f fVar = new Oe.f(inputStream);
                    Oe.v vVar = (Oe.v) c0181a.alpha(fVar, hVar);
                    try {
                        if (fVar.foxtrot == 0) {
                            Oe.c.bravo(vVar);
                            aeVar = (Ie.ae) vVar;
                            aeVar2 = aeVar;
                            inputStream.close();
                            if (aeVar2 != null) {
                                return new df.c(fqName, lVar, module, aeVar2, echo);
                            }
                            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + echo + ". Please update Kotlin");
                        }
                        throw InvalidProtocolBufferException.invalidEndTag();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(vVar);
                    }
                }
                aeVar = null;
                aeVar2 = aeVar;
                inputStream.close();
                if (aeVar2 != null) {
                }
            } else {
                if (i11 == i10) {
                }
                aeVar = null;
                aeVar2 = aeVar;
                inputStream.close();
                if (aeVar2 != null) {
                }
            }
        } finally {
        }
    }
}
