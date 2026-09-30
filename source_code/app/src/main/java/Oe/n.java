package Oe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class n {
    public final l alpha;
    public final Object bravo;
    public final o charlie;
    public final m delta;
    public final Method echo;

    public n(l lVar, Object obj, o oVar, m mVar, Class cls) {
        if (lVar != null) {
            if (mVar.purple == ap.white && oVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.alpha = lVar;
            this.bravo = obj;
            this.charlie = oVar;
            this.delta = mVar;
            if (p.class.isAssignableFrom(cls)) {
                try {
                    this.echo = cls.getMethod("valueOf", Integer.TYPE);
                    return;
                } catch (NoSuchMethodException e) {
                    String name = cls.getName();
                    StringBuilder sb2 = new StringBuilder(name.length() + 52);
                    sb2.append("Generated message class \"");
                    sb2.append(name);
                    sb2.append("\" missing method \"valueOf\".");
                    throw new RuntimeException(sb2.toString(), e);
                }
            }
            this.echo = null;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }

    public final Object alpha(Object obj) {
        if (this.delta.purple.alpha == aq.f1884b) {
            try {
                return this.echo.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        return obj;
    }

    public final Object bravo(Object obj) {
        if (this.delta.purple.alpha == aq.f1884b) {
            return Integer.valueOf(((p) obj).alpha());
        }
        return obj;
    }
}
