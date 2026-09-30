package tg;

import av.q;
import java.io.PrintStream;

/* loaded from: classes2.dex */
public abstract class f {
    public static final int alpha;
    public static final int bravo;

    static {
        int i4;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i5 = 2;
        if (property != null && !property.isEmpty()) {
            for (int i10 = 0; i10 < 3; i10++) {
                if (strArr[i10].equalsIgnoreCase(property)) {
                    i4 = 2;
                    break;
                }
            }
        }
        i4 = 1;
        alpha = i4;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i5 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i5 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i5 = 3;
            }
        }
        bravo = i5;
    }

    public static final void alpha(String str) {
        charlie().println("SLF4J(E): " + str);
    }

    public static final void bravo(String str, Throwable th) {
        charlie().println("SLF4J(E): " + str);
        charlie().println("SLF4J(E): Reported exception:");
        th.printStackTrace(charlie());
    }

    public static PrintStream charlie() {
        if (q.mike(alpha) != 1) {
            return System.err;
        }
        return System.out;
    }

    public static void delta(String str) {
        if (q.mike(2) >= q.mike(bravo)) {
            charlie().println("SLF4J(I): " + str);
        }
    }

    public static final void echo(String str) {
        if (q.mike(3) >= q.mike(bravo)) {
            charlie().println("SLF4J(W): " + str);
        }
    }
}
