package ve;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.H2;

/* loaded from: classes2.dex */
public final class ae extends u implements Ee.b {
    public final TypeVariable alpha;

    public ae(TypeVariable typeVariable) {
        Intrinsics.echo(typeVariable, "typeVariable");
        this.alpha = typeVariable;
    }

    @Override // Ee.b
    public final C3193e alpha(Ne.c fqName) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        Intrinsics.echo(fqName, "fqName");
        TypeVariable typeVariable = this.alpha;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return H2.bravo(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae) {
            if (Intrinsics.areEqual(this.alpha, ((ae) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.alpha;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement != null && (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) != null) {
            return H2.charlie(declaredAnnotations);
        }
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return ae.class.getName() + ": " + this.alpha;
    }
}
