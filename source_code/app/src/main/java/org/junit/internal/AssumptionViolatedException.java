package org.junit.internal;

import O7.l;
import Vf.b;
import Vf.c;
import cg.a;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AssumptionViolatedException extends RuntimeException implements c {
    private static final long serialVersionUID = 2;
    private final String fAssumption;
    private final b fMatcher;
    private final Object fValue;
    private final boolean fValueMatcher;

    @Deprecated
    public AssumptionViolatedException(String str, boolean z2, Object obj, b bVar) {
        this.fAssumption = str;
        this.fValue = obj;
        this.fMatcher = bVar;
        this.fValueMatcher = z2;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("fAssumption", this.fAssumption);
        putFields.put("fValueMatcher", this.fValueMatcher);
        b bVar = this.fMatcher;
        if (bVar != null && !(bVar instanceof Serializable)) {
            bVar = new a(bVar);
        }
        putFields.put("fMatcher", bVar);
        Object obj = this.fValue;
        if (obj != null && !(obj instanceof Serializable)) {
            obj = new cg.b(obj);
        }
        putFields.put("fValue", obj);
        objectOutputStream.writeFields();
    }

    @Override // Vf.c
    public void describeTo(Vf.a aVar) {
        String str = this.fAssumption;
        if (str != null) {
            ((l) aVar).silver(str);
        }
        if (this.fValueMatcher) {
            if (this.fAssumption != null) {
                ((l) aVar).silver(": ");
            }
            l lVar = (l) aVar;
            lVar.silver("got: ");
            lVar.teal(this.fValue);
            if (this.fMatcher != null) {
                lVar.silver(", expected: ");
                ((a) this.fMatcher).describeTo(lVar);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return l.i(this);
    }

    @Deprecated
    public AssumptionViolatedException(Object obj, b bVar) {
        this(null, true, obj, bVar);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, b bVar) {
        this(str, true, obj, bVar);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }
}
