package V5;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import av.ao;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class f extends e implements com.google.android.gms.common.api.c {
    public final Set yankee;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, Looper looper, int i4, ao aoVar, com.google.android.gms.common.api.h hVar, com.google.android.gms.common.api.i iVar) {
        super(context, looper, r3, r4, i4, new l(hVar), new l(iVar), (String) aoVar.silver);
        ag alpha = ag.alpha(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        x.hotel(hVar);
        x.hotel(iVar);
        Set set = (Set) aoVar.purple;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.yankee = set;
    }

    @Override // com.google.android.gms.common.api.c
    public final Set alpha() {
        if (lima()) {
            return this.yankee;
        }
        return Collections.EMPTY_SET;
    }

    @Override // V5.e
    public final Account papa() {
        return null;
    }

    @Override // V5.e
    public final Set sierra() {
        return this.yankee;
    }
}
