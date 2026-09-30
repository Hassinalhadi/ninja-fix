package U8;

import A7.m;
import I7.e;
import T1.c;
import V1.b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.camera.core.am;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.af;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import av.q;
import be.j;
import com.app.network.network.models.Order;
import com.bumptech.glide.load.resource.bitmap.n;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1327h3;
import com.google.android.gms.internal.measurement.C1331i2;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.C1381u2;
import com.google.android.gms.internal.measurement.G2;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.measurement.internal.aa;
import com.google.android.gms.measurement.internal.ac;
import com.google.gson.l;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import f8.InterfaceC1695a;
import java.io.File;
import java.security.Provider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.az;
import pe.aq;
import r6.s;

/* loaded from: classes2.dex */
public class a implements m, InterfaceC1695a, e, InterfaceC0522u, n, aa {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    public static final void charlie(String str, String str2, String str3, Map map) {
        int i4 = LocationInfoActivity.Q;
        try {
            Map sierra = y.sierra(new Pair("sessionId", "debug-session"), new Pair("runId", "run1"), new Pair("hypothesisId", str), new Pair("location", str2), new Pair(Constants.KEY_MESSAGE, str3), new Pair(Column.DATA, map), new Pair("timestamp", Long.valueOf(System.currentTimeMillis())));
            FilesKt.foxtrot(new File("/Users/hsanimeh/##Work/Samurai - Ninja - C2 /samurai-android-c2/app/.cursor/debug.log"), new l().india(sierra) + "\n");
        } catch (Exception unused) {
        }
    }

    public static as echo(aq aqVar, De.a typeAttr, gd.a typeParameterUpperBoundEraser, kotlin.reflect.jvm.internal.impl.types.y yVar) {
        Intrinsics.echo(typeAttr, "typeAttr");
        Intrinsics.echo(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        if (!typeAttr.charlie) {
            typeAttr = typeAttr.bravo(1);
        }
        int mike = q.mike(typeAttr.bravo);
        if (mike != 0 && mike != 1) {
            if (mike == 2) {
                return new at(1, yVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        int fuchsia = aqVar.fuchsia();
        boolean z2 = true;
        if (fuchsia != 1) {
            if (fuchsia != 2) {
                if (fuchsia != 3) {
                    throw null;
                }
            } else {
                z2 = false;
            }
        }
        if (!z2) {
            return new at(1, Ue.e.echo(aqVar).mike());
        }
        List parameters = yVar.green().getParameters();
        Intrinsics.delta(parameters, "erasedUpperBound.constructor.parameters");
        if (!parameters.isEmpty()) {
            return new at(3, yVar);
        }
        return az.lima(aqVar, typeAttr);
    }

    public static b0 foxtrot(d0 owner, a0 factory, int i4) {
        c extras;
        if ((i4 & 2) != 0) {
            Intrinsics.echo(owner, "owner");
            if (owner instanceof InterfaceC0651v) {
                factory = ((InterfaceC0651v) owner).getDefaultViewModelProviderFactory();
            } else {
                factory = b.alpha;
            }
        }
        Intrinsics.echo(owner, "owner");
        if (owner instanceof InterfaceC0651v) {
            extras = ((InterfaceC0651v) owner).getDefaultViewModelCreationExtras();
        } else {
            extras = T1.a.bravo;
        }
        Intrinsics.echo(owner, "owner");
        Intrinsics.echo(factory, "factory");
        Intrinsics.echo(extras, "extras");
        return new b0(owner.getViewModelStore(), factory, extras);
    }

    public static Intent golf(Context context, int i4, Order order) {
        Intent putExtra = new Intent(context, (Class<?>) ProcessOrderActivityV2.class).putExtra("ORDER_ID", i4).putExtra("ORDER_OBJECT", order);
        Intrinsics.delta(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // A7.m
    public Object alpha(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.n
    public void bravo() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [r6.o, java.lang.Object] */
    @Override // I7.e
    public Object create(I7.c cVar) {
        synchronized (s.class) {
            byte b2 = (byte) (((byte) 1) | 2);
            if (b2 == 3) {
                s.echo(new Object());
            } else {
                StringBuilder sb2 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        }
        return new a(0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void cyan(af afVar) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.n
    public void delta(G3.b bVar, Bitmap bitmap) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public /* synthetic */ void f(am amVar) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public Rect gold() {
        return new Rect();
    }

    public Signature[] hotel(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void india(J2.e eVar, float f5) {
        bu.a aVar = (bu.a) ((Drawable) eVar.purple);
        CardView cardView = (CardView) eVar.red;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f5 != aVar.echo || aVar.foxtrot != useCompatPadding || aVar.golf != preventCornerOverlap) {
            aVar.echo = f5;
            aVar.foxtrot = useCompatPadding;
            aVar.golf = preventCornerOverlap;
            aVar.bravo(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            eVar.K(0, 0, 0, 0);
            return;
        }
        bu.a aVar2 = (bu.a) ((Drawable) eVar.purple);
        float f10 = aVar2.echo;
        float f11 = aVar2.alpha;
        int ceil = (int) Math.ceil(bu.b.alpha(f10, f11, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(bu.b.bravo(f10, f11, cardView.getPreventCornerOverlap()));
        eVar.K(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void ivory(int i4) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void m() {
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void ochre(L l10) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public com.google.common.util.concurrent.e purple(boolean z2) {
        return j.red;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public af white() {
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = ac.alpha;
                Boolean bool = (Boolean) G2.bravo.bravo();
                bool.getClass();
                return bool;
            case 21:
                List list2 = ac.alpha;
                return Integer.valueOf((int) ((Long) C1381u2.alpha.bravo()).longValue());
            case 22:
                List list3 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.teal.bravo()).longValue());
            case 23:
                List list4 = ac.alpha;
                Boolean bool2 = (Boolean) C1331i2.alpha.bravo();
                bool2.getClass();
                return bool2;
            case 24:
                List list5 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool3 = (Boolean) C1327h3.delta.bravo();
                bool3.getClass();
                return bool3;
            case 25:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.alpha.bravo();
                l10.getClass();
                return l10;
            case 26:
                Boolean bool4 = (Boolean) V2.alpha.bravo();
                bool4.getClass();
                return bool4;
            case 27:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.f6693j.bravo();
            case 28:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.coral.bravo();
                l11.getClass();
                return l11;
            default:
                List list9 = ac.alpha;
                C1362p2.purple.get();
                Long l12 = (Long) C1369r2.indigo.bravo();
                l12.getClass();
                return l12;
        }
    }

    public a(ff.l lVar, List samWithReceiverResolvers) {
        this.alpha = 12;
        Intrinsics.echo(samWithReceiverResolvers, "samWithReceiverResolvers");
        String str = ff.l.delta;
        new ConcurrentHashMap(3, 1.0f, 2);
    }
}
