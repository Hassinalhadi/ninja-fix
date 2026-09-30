package B2;

import aa.AbstractC0417a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends android.support.v4.media.session.a {
    public static final String india = A2.z.golf("WorkContinuationImpl");
    public final w alpha;
    public final String bravo;
    public final int charlie;
    public final List delta;
    public final ArrayList echo;
    public final ArrayList foxtrot = new ArrayList();
    public boolean golf;
    public A2.aa hotel;

    public r(w wVar, String str, int i4, List list) {
        this.alpha = wVar;
        this.bravo = str;
        this.charlie = i4;
        this.delta = list;
        this.echo = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (i4 == 1 && ((A2.ak) list.get(i5)).bravo.uniform != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String uuid = ((A2.ak) list.get(i5)).alpha.toString();
            Intrinsics.delta(uuid, "id.toString()");
            this.echo.add(uuid);
            this.foxtrot.add(uuid);
        }
    }

    public static HashSet charlie(r rVar) {
        HashSet hashSet = new HashSet();
        rVar.getClass();
        return hashSet;
    }

    public final A2.aa bravo() {
        String str;
        if (!this.golf) {
            w wVar = this.alpha;
            A2.aa aaVar = wVar.charlie.mike;
            int i4 = this.charlie;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            str = "APPEND_OR_REPLACE";
                        } else {
                            throw null;
                        }
                    } else {
                        str = "APPEND";
                    }
                } else {
                    str = "KEEP";
                }
            } else {
                str = "REPLACE";
            }
            this.hotel = AbstractC0417a.bravo(aaVar, "EnqueueRunnable_".concat(str), ((L2.c) wVar.echo).alpha, new q(0, this));
        } else {
            A2.z.echo().hotel(india, "Already enqueued work ids (" + TextUtils.join(", ", this.echo) + ")");
        }
        return this.hotel;
    }
}
