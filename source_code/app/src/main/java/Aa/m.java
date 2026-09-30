package Aa;

import J3.s;
import J3.x;
import O7.r;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase;
import com.app.network.network.models.Country;
import com.app.network.network.models.EnvelopNotification;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.ax;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.material.behavior.SwipeDismissBehavior;
import delivery.samurai.android.ui.envelop.EnvelopDetailActivity;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.support.SupportFragment;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import g.C1718a;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import pe.an;
import s1.au;
import s6.K4;
import w6.AbstractC3237a;
import x9.InterfaceC3312f;
import ya.C3407c;
import zendesk.support.Request;

/* loaded from: classes2.dex */
public final class m implements InterfaceC3312f, OnSuccessListener, OnFailureListener, G6.d, an, T5.m, Ge.l, s, J3.a, M7.b, N7.a, t1.n {
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ m(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static String lima(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        w6.g gVar = (w6.g) obj;
        PaymentDataRequest paymentDataRequest = (PaymentDataRequest) this.purple;
        Bundle beige = gVar.beige();
        beige.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        w6.f fVar = new w6.f(1, (G6.h) obj2);
        try {
            w6.d dVar = (w6.d) gVar.tango();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar.india);
            AbstractC3237a.charlie(obtain, paymentDataRequest);
            AbstractC3237a.charlie(obtain, beige);
            obtain.writeStrongBinder(fVar);
            try {
                dVar.hotel.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Status status = Status.white;
            Bundle bundle = Bundle.EMPTY;
            fVar.romeo(status, null);
        }
    }

    @Override // G6.d
    public void alpha() {
        ((CountDownLatch) this.purple).countDown();
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        switch (this.alpha) {
            case 0:
                Country item = (Country) obj;
                Intrinsics.echo(item, "item");
                Intrinsics.echo(view, "view");
                n nVar = (n) this.purple;
                C3407c c3407c = nVar.f46v;
                if (c3407c != null) {
                    c3407c.invoke(item);
                }
                nVar.juliet();
                return;
            case 5:
                Country item2 = (Country) obj;
                Intrinsics.echo(item2, "item");
                Intrinsics.echo(view, "view");
                Ba.n nVar2 = (Ba.n) this.purple;
                Ba.a aVar = nVar2.f740u;
                if (aVar != null) {
                    aVar.invoke(item2);
                }
                nVar2.juliet();
                return;
            case 8:
                EnvelopNotification item3 = (EnvelopNotification) obj;
                Intrinsics.echo(item3, "item");
                Intrinsics.echo(view, "view");
                int i5 = EnvelopDetailActivity.f12246L;
                String valueOf = String.valueOf(item3.getId());
                EnvelopsListingActivity envelopsListingActivity = (EnvelopsListingActivity) this.purple;
                Intent intent = new Intent(envelopsListingActivity, (Class<?>) EnvelopDetailActivity.class);
                intent.putExtra("ENVELOP_NOTIFICATION_ID", valueOf);
                intent.putExtra("ENVELOP_NOTIFICATION", item3);
                envelopsListingActivity.startActivity(intent);
                return;
            default:
                Request item4 = (Request) obj;
                Intrinsics.echo(item4, "item");
                Intrinsics.echo(view, "view");
                int i10 = ZenDeskChatActivity.f12498T;
                SupportFragment supportFragment = (SupportFragment) this.purple;
                Context context = supportFragment.getContext();
                String valueOf2 = String.valueOf(item4.getId());
                Intent intent2 = new Intent(context, (Class<?>) ZenDeskChatActivity.class);
                intent2.putExtra(Constants.KEY_ID, valueOf2);
                supportFragment.startActivity(intent2);
                return;
        }
    }

    @Override // Ge.l
    public void bravo() {
    }

    @Override // t1.n
    public boolean charlie(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.purple;
        boolean z2 = false;
        if (!swipeDismissBehavior.echo(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        }
        int i4 = swipeDismissBehavior.teal;
        if ((i4 == 0 && z2) || (i4 == 1 && !z2)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        WeakHashMap weakHashMap = au.alpha;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        C1718a c1718a = swipeDismissBehavior.purple;
        if (c1718a != null) {
            c1718a.beige(view);
        }
        return true;
    }

    public void delta(G7.b bVar) {
        J j5 = (J) this.purple;
        j5.getClass();
        ArrayList arrayList = j5.echo;
        synchronized (arrayList) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i4)).first)) {
                        Log.w(j5.alpha, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            G g2 = new G(bVar);
            arrayList.add(new Pair(bVar, g2));
            if (j5.hotel != null) {
                try {
                    j5.hotel.registerOnMeasurementEventListener(g2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(j5.alpha, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            j5.bravo(new ax(j5, g2, 3));
        }
    }

    @Override // Ge.l
    public void echo(Ne.f fVar, Object obj) {
    }

    @Override // M7.b
    public void foxtrot(Bundle bundle, String str) {
        O7.q qVar = (O7.q) this.purple;
        if (qVar != null) {
            try {
                String str2 = "$A$:" + lima(bundle, str);
                r rVar = qVar.alpha;
                rVar.getClass();
                rVar.oscar.alpha.alpha(new O7.p(rVar, System.currentTimeMillis() - rVar.delta, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // Ge.l
    public Ge.m golf(Ne.f fVar) {
        if ("b".equals(fVar.bravo())) {
            return new He.d(this, 2);
        }
        return null;
    }

    @Override // J3.a
    public com.bumptech.glide.load.data.e hotel(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    @Override // N7.a
    public void india(O7.q qVar) {
        this.purple = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // Ge.l
    public void juliet(Ne.f fVar, Ne.b bVar, Ne.f fVar2) {
    }

    @Override // Ge.l
    public void kilo(Ne.f fVar, Se.f fVar2) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.purple).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.alpha) {
            case 9:
                ((G6.f) this.purple).alpha();
                return;
            default:
                ((CountDownLatch) this.purple).countDown();
                return;
        }
    }

    @Override // Ge.l
    public Ge.l quebec(Ne.b bVar, Ne.f fVar) {
        return null;
    }

    @Override // J3.s
    public J3.r sierra(x xVar) {
        switch (this.alpha) {
            case 21:
                return new J3.b(0, (AssetManager) this.purple, this);
            default:
                return new K3.a((m) this.purple);
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 13:
                StringBuilder sb2 = new StringBuilder();
                Ce.r rVar = (Ce.r) this.purple;
                sb2.append(rVar);
                sb2.append(": ");
                sb2.append(((Map) K4.alpha(rVar.f924c, Ce.r.f921g[0])).keySet());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(ConstraintLayout constraintLayout, View view, int i4) {
        this.alpha = i4;
        this.purple = view;
    }

    public m(m mVar, J2.l lVar) {
        this.alpha = 11;
        this.purple = lVar;
        mVar.delta(new G7.b(1, this));
    }

    public m(Ce.r packageFragment) {
        this.alpha = 13;
        Intrinsics.echo(packageFragment, "packageFragment");
        this.purple = packageFragment;
    }

    public m(WorkDatabase workDatabase) {
        this.alpha = 23;
        Intrinsics.echo(workDatabase, "workDatabase");
        this.purple = workDatabase;
    }

    public m(int i4) {
        Object fVar;
        this.alpha = i4;
        switch (i4) {
            case 10:
                this.purple = new CountDownLatch(1);
                return;
            case 14:
                if (Build.VERSION.SDK_INT >= 28) {
                    fVar = new com.google.mlkit.common.sdkinternal.b(4);
                } else {
                    fVar = new g7.f(4);
                }
                this.purple = fVar;
                return;
            case 22:
                this.purple = new B8.h(500L);
                return;
            case 24:
                this.purple = new m(22);
                return;
            case 27:
                return;
            default:
                this.purple = new AtomicInteger(0);
                return;
        }
    }

    public m(EditText editText) {
        this.alpha = 25;
        this.purple = new J2.c(editText);
    }
}
