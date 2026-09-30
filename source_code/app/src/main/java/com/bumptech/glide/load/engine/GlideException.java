package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private E3.a dataSource;
    private String detailMessage;
    private Exception exception;
    private E3.f key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            Iterator<Throwable> it = ((GlideException) th).getCauses().iterator();
            while (it.hasNext()) {
                addRootCauses(it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            appendable.append("Cause (").append(String.valueOf(i5)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i4);
            if (th instanceof GlideException) {
                ((GlideException) th).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th, appendable);
            }
            i4 = i5;
        }
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass == null) {
            str = "";
        } else {
            str = ", " + this.dataClass;
        }
        sb2.append(str);
        if (this.dataSource == null) {
            str2 = "";
        } else {
            str2 = ", " + this.dataSource;
        }
        sb2.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb2.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb2.toString();
        }
        if (rootCauses.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(rootCauses.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : rootCauses) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i4 = 0;
        while (i4 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i5 = i4 + 1;
            sb2.append(i5);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), rootCauses.get(i4));
            i4 = i5;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(E3.f fVar, E3.a aVar) {
        setLoggingDetails(fVar, aVar, null);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    public void setLoggingDetails(E3.f fVar, E3.a aVar, Class<?> cls) {
        this.key = fVar;
        this.dataSource = aVar;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new s(appendable));
    }
}
