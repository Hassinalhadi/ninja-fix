package l2;

import B2.s;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import m2.AbstractC2096a;

/* loaded from: classes3.dex */
public final class o {
    public final Context alpha;
    public final String bravo;
    public Executor foxtrot;
    public Executor golf;
    public s hotel;
    public boolean india;
    public boolean lima;
    public HashSet papa;
    public final ArrayList charlie = new ArrayList();
    public final ArrayList delta = new ArrayList();
    public final ArrayList echo = new ArrayList();
    public final int juliet = 1;
    public boolean kilo = true;
    public final long mike = -1;
    public final A2.h november = new A2.h(3);
    public final LinkedHashSet oscar = new LinkedHashSet();

    public o(Context context, String str) {
        this.alpha = context;
        this.bravo = str;
    }

    public final void alpha(AbstractC2096a... abstractC2096aArr) {
        if (this.papa == null) {
            this.papa = new HashSet();
        }
        for (AbstractC2096a abstractC2096a : abstractC2096aArr) {
            HashSet hashSet = this.papa;
            Intrinsics.checkNotNull(hashSet);
            hashSet.add(Integer.valueOf(abstractC2096a.alpha));
            HashSet hashSet2 = this.papa;
            Intrinsics.checkNotNull(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC2096a.bravo));
        }
        this.november.alpha((AbstractC2096a[]) Arrays.copyOf(abstractC2096aArr, abstractC2096aArr.length));
    }
}
