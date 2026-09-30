package W8;

import A2.ao;
import A7.m;
import B9.ab;
import I7.e;
import I7.f;
import Nd.g;
import T1.b;
import Tf.ah;
import Uf.h;
import Z3.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import androidx.fragment.app.an;
import com.bumptech.glide.load.resource.bitmap.aa;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1327h3;
import com.google.android.gms.internal.measurement.C1342k3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.C1393x2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.G2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.ac;
import com.google.firebase.components.ComponentRegistrar;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;

/* loaded from: classes2.dex */
public final class a implements m, g, f, R3.f, e, c, b, aa, com.google.android.gms.measurement.internal.aa {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    public static final boolean echo(ah ahVar) {
        ah ahVar2 = h.silver;
        return !r.golf(ahVar.bravo(), ".class", true);
    }

    public static Intent golf(Context context, String str) {
        Intrinsics.echo(context, "context");
        Intent intent = new Intent(context, (Class<?>) EnvelopsListingActivity.class);
        intent.putExtra("redirectId", str);
        return intent;
    }

    public static ah hotel(ah ahVar, ah base) {
        Intrinsics.echo(ahVar, "<this>");
        Intrinsics.echo(base, "base");
        return h.silver.foxtrot(r.november(StringsKt.lime(ahVar.alpha.romeo(), base.alpha.romeo()), '\\', '/'));
    }

    @Override // A7.m
    public Object alpha(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }

    @Override // I7.f
    public List bravo(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (I7.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.alpha;
            if (str != null) {
                ao aoVar = new ao(11, str, bVar);
                bVar = new I7.b(str, bVar.bravo, bVar.charlie, bVar.delta, bVar.echo, aoVar, bVar.golf);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // R3.f
    public void charlie(an anVar) {
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        switch (this.alpha) {
            case 9:
                return new a(0);
            default:
                return new V8.b(((ab) cVar).india(U8.a.class));
        }
    }

    @Override // Z3.c
    public void delta(Object obj) {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.aa
    public void foxtrot(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.aa
    public void juliet(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public String toString() {
        switch (this.alpha) {
            case 14:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = ac.alpha;
                Boolean bool = (Boolean) G2.alpha.bravo();
                bool.getClass();
                return bool;
            case 21:
                List list2 = ac.alpha;
                Boolean bool2 = (Boolean) D2.alpha.bravo();
                bool2.getClass();
                return bool2;
            case 22:
                List list3 = ac.alpha;
                x3.purple.get();
                Boolean bool3 = (Boolean) z3.hotel.bravo();
                bool3.getClass();
                return bool3;
            case 23:
                Boolean bool4 = (Boolean) Y2.alpha.bravo();
                bool4.getClass();
                return bool4;
            case 24:
                List list4 = ac.alpha;
                Boolean bool5 = (Boolean) C1342k3.alpha.bravo();
                bool5.getClass();
                return bool5;
            case 25:
                Boolean bool6 = (Boolean) C1393x2.alpha.bravo();
                bool6.getClass();
                return bool6;
            case 26:
                Boolean bool7 = (Boolean) S2.alpha.bravo();
                bool7.getClass();
                return bool7;
            case 27:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.lima.bravo();
            case 28:
                List list6 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool8 = (Boolean) C1327h3.bravo.bravo();
                bool8.getClass();
                return bool8;
            default:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.green.bravo();
                l10.getClass();
                return l10;
        }
    }
}
