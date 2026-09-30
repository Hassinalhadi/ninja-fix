package df;

import Oe.h;
import Oe.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* renamed from: df.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1622a extends Ze.a {
    public static final C1622a mike;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ze.a, df.a] */
    static {
        h hVar = new h();
        Je.b.alpha(hVar);
        n packageFqName = Je.b.alpha;
        Intrinsics.delta(packageFqName, "packageFqName");
        n constructorAnnotation = Je.b.charlie;
        Intrinsics.delta(constructorAnnotation, "constructorAnnotation");
        n classAnnotation = Je.b.bravo;
        Intrinsics.delta(classAnnotation, "classAnnotation");
        n functionAnnotation = Je.b.delta;
        Intrinsics.delta(functionAnnotation, "functionAnnotation");
        n propertyAnnotation = Je.b.echo;
        Intrinsics.delta(propertyAnnotation, "propertyAnnotation");
        n propertyGetterAnnotation = Je.b.foxtrot;
        Intrinsics.delta(propertyGetterAnnotation, "propertyGetterAnnotation");
        n propertySetterAnnotation = Je.b.golf;
        Intrinsics.delta(propertySetterAnnotation, "propertySetterAnnotation");
        n enumEntryAnnotation = Je.b.india;
        Intrinsics.delta(enumEntryAnnotation, "enumEntryAnnotation");
        n compileTimeValue = Je.b.hotel;
        Intrinsics.delta(compileTimeValue, "compileTimeValue");
        n parameterAnnotation = Je.b.juliet;
        Intrinsics.delta(parameterAnnotation, "parameterAnnotation");
        n typeAnnotation = Je.b.kilo;
        Intrinsics.delta(typeAnnotation, "typeAnnotation");
        n typeParameterAnnotation = Je.b.lima;
        Intrinsics.delta(typeParameterAnnotation, "typeParameterAnnotation");
        mike = new Ze.a(hVar, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String alpha(Ne.c fqName) {
        String bravo;
        Intrinsics.echo(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r.november(fqName.bravo(), '.', '/'));
        sb2.append('/');
        if (fqName.delta()) {
            bravo = "default-package";
        } else {
            bravo = fqName.foxtrot().bravo();
            Intrinsics.delta(bravo, "fqName.shortName().asString()");
        }
        sb2.append(bravo.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
