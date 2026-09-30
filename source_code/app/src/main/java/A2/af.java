package A2;

import androidx.lifecycle.az;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import j8.C1944a;
import java.util.Date;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.V4;

/* loaded from: classes3.dex */
public final /* synthetic */ class af implements V0.i, G6.c {
    public final /* synthetic */ Object alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ af(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = obj3;
        this.silver = obj4;
        this.teal = obj5;
    }

    @Override // V0.i
    public Object black(V0.h hVar) {
        ((K2.i) this.alpha).execute(new ag((aa) this.purple, (String) this.red, (Function0) this.silver, (az) this.teal, hVar));
        return Unit.INSTANCE;
    }

    @Override // G6.c
    public Object ivory(Task task) {
        G6.q november;
        Date date = (Date) this.silver;
        HashMap hashMap = (HashMap) this.teal;
        F8.j jVar = (F8.j) this.alpha;
        jVar.getClass();
        G6.q qVar = (G6.q) this.purple;
        if (!qVar.juliet()) {
            return V4.delta(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", qVar.golf()));
        }
        G6.q qVar2 = (G6.q) this.red;
        if (!qVar2.juliet()) {
            return V4.delta(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", qVar2.golf()));
        }
        try {
            F8.i bravo = jVar.bravo((String) qVar.hotel(), ((C1944a) qVar2.hotel()).alpha, date, hashMap);
            if (bravo.alpha != 0) {
                november = V4.echo(bravo);
            } else {
                november = jVar.echo.echo(bravo.bravo).november(jVar.charlie, new B2.s(2, bravo));
            }
            return november;
        } catch (FirebaseRemoteConfigException e) {
            return V4.delta(e);
        }
    }
}
