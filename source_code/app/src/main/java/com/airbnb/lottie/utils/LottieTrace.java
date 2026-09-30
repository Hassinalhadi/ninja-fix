package com.airbnb.lottie.utils;

import Q0.c;
import android.os.Trace;
import androidx.appcompat.widget.P0;
import o1.i;

/* loaded from: classes3.dex */
public class LottieTrace {
    private static final int MAX_DEPTH = 5;
    private final String[] sections = new String[5];
    private final long[] startTimeNs = new long[5];
    private int traceDepth = 0;
    private int depthPastMaxDepth = 0;

    public void beginSection(String str) {
        int i4 = this.traceDepth;
        if (i4 == 5) {
            this.depthPastMaxDepth++;
            return;
        }
        this.sections[i4] = str;
        this.startTimeNs[i4] = System.nanoTime();
        int i5 = i.alpha;
        Trace.beginSection(str);
        this.traceDepth++;
    }

    public float endSection(String str) {
        int i4 = this.depthPastMaxDepth;
        if (i4 > 0) {
            this.depthPastMaxDepth = i4 - 1;
            return 0.0f;
        }
        int i5 = this.traceDepth - 1;
        this.traceDepth = i5;
        if (i5 != -1) {
            if (str.equals(this.sections[i5])) {
                int i10 = i.alpha;
                Trace.endSection();
                return ((float) (System.nanoTime() - this.startTimeNs[this.traceDepth])) / 1000000.0f;
            }
            throw new IllegalStateException(P0.gold(c.victor("Unbalanced trace call ", str, ". Expected "), this.sections[this.traceDepth], "."));
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }
}
