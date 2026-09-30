package T5;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import av.ao;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m6.AbstractC2101b;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class ad extends E6.b implements com.google.android.gms.common.api.h, com.google.android.gms.common.api.i {
    public static final D6.b oscar = D6.c.alpha;
    public final Context hotel;
    public final com.google.android.gms.internal.measurement.ai india;
    public final D6.b juliet;
    public final Set kilo;
    public final ao lima;
    public E6.a mike;
    public O7.u november;

    public ad(Context context, com.google.android.gms.internal.measurement.ai aiVar, ao aoVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.hotel = context;
        this.india = aiVar;
        this.lima = aoVar;
        this.kilo = (Set) aoVar.alpha;
        this.juliet = oscar;
    }

    @Override // com.google.android.gms.common.api.h
    public final void bravo(int i4) {
        O7.u uVar = this.november;
        r rVar = (r) ((e) uVar.foxtrot).juliet.get((b) uVar.charlie);
        if (rVar != null) {
            if (rVar.oscar) {
                rVar.papa(new ConnectionResult(17));
            } else {
                rVar.bravo(i4);
            }
        }
    }

    @Override // com.google.android.gms.common.api.h
    public final void charlie() {
        GoogleSignInAccount googleSignInAccount;
        E6.a aVar = this.mike;
        aVar.getClass();
        try {
            aVar.amber.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.charlie;
                ReentrantLock reentrantLock = R5.a.charlie;
                V5.x.hotel(context);
                ReentrantLock reentrantLock2 = R5.a.charlie;
                reentrantLock2.lock();
                try {
                    if (R5.a.delta == null) {
                        R5.a.delta = new R5.a(context.getApplicationContext());
                    }
                    R5.a aVar2 = R5.a.delta;
                    reentrantLock2.unlock();
                    String alpha = aVar2.alpha("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(alpha)) {
                        String alpha2 = aVar2.alpha("googleSignInAccount:" + alpha);
                        if (alpha2 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.o(alpha2);
                            } catch (JSONException unused) {
                            }
                            Integer num = aVar.beige;
                            V5.x.hotel(num);
                            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccount);
                            E6.c cVar = (E6.c) aVar.tango();
                            zai zaiVar = new zai(1, zatVar);
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(cVar.india);
                            AbstractC2101b.charlie(obtain, zaiVar);
                            AbstractC2101b.delta(obtain, this);
                            cVar.bravo(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = aVar.beige;
            V5.x.hotel(num2);
            zat zatVar2 = new zat(2, account, num2.intValue(), googleSignInAccount);
            E6.c cVar2 = (E6.c) aVar.tango();
            zai zaiVar2 = new zai(1, zatVar2);
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(cVar2.india);
            AbstractC2101b.charlie(obtain2, zaiVar2);
            AbstractC2101b.delta(obtain2, this);
            cVar2.bravo(obtain2, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.india.post(new be.g(7, this, new zak(1, new ConnectionResult(8, null), null), false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.api.i
    public final void delta(ConnectionResult connectionResult) {
        this.november.delta(connectionResult);
    }
}
