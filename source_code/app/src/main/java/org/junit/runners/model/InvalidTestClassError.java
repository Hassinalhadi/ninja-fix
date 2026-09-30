package org.junit.runners.model;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class InvalidTestClassError extends InitializationError {
    private static final long serialVersionUID = 1;
    private final String message;

    public InvalidTestClassError(Class<?> cls, List<Throwable> list) {
        super(list);
        this.message = createMessage(cls, list);
    }

    private static String createMessage(Class<?> cls, List<Throwable> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid test class '" + cls.getName() + "':");
        Iterator<Throwable> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            sb2.append("\n  " + i4 + ". " + it.next().getMessage());
            i4++;
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
