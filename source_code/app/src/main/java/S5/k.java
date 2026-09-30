package S5;

import A7.o;
import G6.q;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.p0;
import f6.ThreadFactoryC1693a;
import j9.InterfaceC1954a;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s6.S6;
import s6.W6;
import y7.InterfaceC3401a;

/* loaded from: classes2.dex */
public final class k implements InterfaceC3401a {
    public static k teal;
    public int alpha;
    public final Object purple;
    public final Object red;
    public Object silver;

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.silver = new i(this);
        this.alpha = 1;
        this.red = scheduledExecutorService;
        this.purple = context.getApplicationContext();
    }

    public static void alpha(k kVar) {
        boolean gray = ((InterfaceC1954a) kVar.red).gray();
        boolean z2 = !gray;
        k9.d dVar = (k9.d) kVar.silver;
        if (dVar.bravo != z2) {
            dVar.bravo = z2;
            az azVar = (az) dVar.charlie;
            if (!gray) {
                dVar.notifyItemInserted(azVar.getItemCount());
            } else {
                dVar.notifyItemRemoved(azVar.getItemCount());
            }
        }
        kVar.bravo();
    }

    public static synchronized k charlie(Context context) {
        k kVar;
        synchronized (k.class) {
            try {
                if (teal == null) {
                    teal = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC1693a("MessengerIpcClient"))));
                }
                kVar = teal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public void bravo() {
        int i4;
        int echo;
        RecyclerView recyclerView = (RecyclerView) this.purple;
        int childCount = recyclerView.getChildCount();
        int coral = recyclerView.getLayoutManager().coral();
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            i4 = ((LinearLayoutManager) recyclerView.getLayoutManager()).K();
        } else if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            if (recyclerView.getLayoutManager().whiskey() > 0) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
                int[] iArr = new int[staggeredGridLayoutManager.papa];
                for (int i5 = 0; i5 < staggeredGridLayoutManager.papa; i5++) {
                    p0 p0Var = staggeredGridLayoutManager.quebec[i5];
                    boolean z2 = p0Var.foxtrot.whiskey;
                    ArrayList arrayList = p0Var.alpha;
                    if (z2) {
                        echo = p0Var.echo(arrayList.size() - 1, -1, true, false);
                    } else {
                        echo = p0Var.echo(0, arrayList.size(), true, false);
                    }
                    iArr[i5] = echo;
                }
                i4 = iArr[0];
            } else {
                i4 = 0;
            }
        } else {
            throw new IllegalStateException("LayoutManager needs to subclass LinearLayoutManager or StaggeredGridLayoutManager");
        }
        if (coral - childCount <= i4 + this.alpha || coral == 0) {
            InterfaceC1954a interfaceC1954a = (InterfaceC1954a) this.red;
            if (!interfaceC1954a.isLoading() && !interfaceC1954a.gray()) {
                interfaceC1954a.whiskey();
            }
        }
    }

    @Override // y7.InterfaceC3401a
    public byte[] delta(int i4, byte[] bArr) {
        if (i4 <= this.alpha) {
            o oVar = (o) this.purple;
            ((Mac) oVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) oVar.get()).doFinal(), i4);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    public synchronized q echo(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!((i) this.silver).delta(jVar)) {
                i iVar = new i(this);
                this.silver = iVar;
                iVar.delta(jVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jVar.bravo.alpha;
    }

    public k(RecyclerView recyclerView, InterfaceC1954a interfaceC1954a, int i4, boolean z2, F8.q qVar) {
        Q eVar = new Aa.e(5, this);
        B cVar = new k9.c(this);
        this.purple = recyclerView;
        this.red = interfaceC1954a;
        this.alpha = i4;
        recyclerView.addOnScrollListener(eVar);
        if (z2) {
            az adapter = recyclerView.getAdapter();
            k9.d dVar = new k9.d(adapter);
            this.silver = dVar;
            boolean gray = interfaceC1954a.gray();
            boolean z10 = !gray;
            if (dVar.bravo != z10) {
                dVar.bravo = z10;
                az azVar = (az) dVar.charlie;
                if (!gray) {
                    dVar.notifyItemInserted(azVar.getItemCount());
                } else {
                    dVar.notifyItemRemoved(azVar.getItemCount());
                }
            }
            adapter.registerAdapterDataObserver(cVar);
            recyclerView.setAdapter(dVar);
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                ((GridLayoutManager) recyclerView.getLayoutManager()).fuchsia = new k9.e(((GridLayoutManager) recyclerView.getLayoutManager()).fuchsia, qVar, dVar);
            }
        }
        bravo();
    }

    public k(Y1.l lVar, int i4) {
        this.purple = lVar.white;
        this.alpha = i4;
        androidx.navigation.internal.d dVar = lVar.f2268a;
        this.red = dVar.alpha();
        Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.silver = charlie;
        dVar.hotel.charlie(charlie);
    }

    public k(Bundle state) {
        Intrinsics.echo(state, "state");
        this.purple = W6.hotel(state, "nav-entry-state:id");
        this.alpha = W6.delta(state, "nav-entry-state:destination-id");
        this.red = W6.foxtrot(state, "nav-entry-state:args");
        this.silver = W6.foxtrot(state, "nav-entry-state:saved-state");
    }

    public k(String str, SecretKeySpec secretKeySpec) {
        o oVar = new o(this);
        this.purple = oVar;
        this.red = str;
        this.silver = secretKeySpec;
        if (secretKeySpec.getEncoded().length >= 16) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    this.alpha = 20;
                    break;
                case 1:
                    this.alpha = 32;
                    break;
                case 2:
                    this.alpha = 48;
                    break;
                case 3:
                    this.alpha = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            oVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }
}
