package t6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.annotation.Annotation;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import ue.C3158b;
import ve.AbstractC3192d;

/* renamed from: t6.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3090z2 {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        if (r2 != He.a.MULTIFILE_CLASS_PART) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r0.delta != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Type inference failed for: r0v1, types: [He.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3158b alpha(Class klass) {
        He.b bVar;
        Ge.l lVar;
        He.a aVar;
        Intrinsics.echo(klass, "klass");
        ?? obj = new Object();
        obj.alpha = null;
        obj.bravo = null;
        boolean z2 = false;
        obj.charlie = 0;
        obj.delta = null;
        obj.echo = null;
        obj.foxtrot = null;
        obj.golf = null;
        obj.hotel = null;
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.delta(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.delta(annotation, "annotation");
            Class bravo = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation));
            Ne.b alpha = AbstractC3192d.alpha(bravo);
            Ne.c bravo2 = alpha.bravo();
            if (bravo2.equals(ye.ab.alpha)) {
                lVar = new He.e(obj, 0);
            } else if (bravo2.equals(ye.ab.oscar)) {
                lVar = new Aa.m(17, (Object) obj);
            } else if (!He.g.india && obj.golf == null && (aVar = (He.a) He.g.juliet.get(alpha)) != null) {
                obj.golf = aVar;
                lVar = new He.e(obj, 1);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                AbstractC3075w2.bravo(lVar, annotation, bravo);
            }
        }
        Me.f fVar = Me.f.golf;
        if (obj.golf != null && obj.alpha != null) {
            int[] iArr = obj.alpha;
            if ((obj.charlie & 8) != 0) {
                z2 = true;
            }
            Me.f fVar2 = new Me.f(iArr, z2);
            if (!fVar2.bravo(fVar)) {
                obj.foxtrot = obj.delta;
                obj.delta = null;
            } else {
                He.a aVar2 = obj.golf;
                if (aVar2 != He.a.CLASS) {
                    if (aVar2 != He.a.FILE_FACADE) {
                    }
                }
            }
            String[] strArr = obj.hotel;
            if (strArr != null) {
                Me.a.alpha(strArr);
            }
            bVar = new He.b(obj.golf, fVar2, obj.delta, obj.foxtrot, obj.echo, obj.bravo, obj.charlie);
            if (bVar != null) {
                return null;
            }
            return new C3158b(klass, bVar);
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    public static void bravo(Context context, String deeplink) {
        Object m206constructorimpl;
        Intrinsics.echo(deeplink, "deeplink");
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(Uri.parse(deeplink));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        Uri uri = (Uri) m206constructorimpl;
        if (uri != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setPackage("com.ananinja.lava");
            intent.addFlags(268435456);
            try {
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(intent);
                } else {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ananinja.lava")).addFlags(268435456));
                }
            } catch (Exception unused) {
            }
        }
    }
}
