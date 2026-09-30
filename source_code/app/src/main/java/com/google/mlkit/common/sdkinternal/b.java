package com.google.mlkit.common.sdkinternal;

import H0.v;
import H0.x;
import H0.y;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import com.bumptech.glide.load.resource.bitmap.aa;
import com.bumptech.glide.load.resource.bitmap.z;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1327h3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.ac;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b implements G3.b, y, R3.m, I7.e, kotlin.time.a, Z3.a, aa, com.google.android.gms.measurement.internal.aa {
    public static b purple;
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    public static Typeface lima(String str, v vVar, int i4) {
        Typeface create;
        Typeface create2;
        if (i4 == 0 && Intrinsics.areEqual(vVar, v.yellow) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z2 = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i5 = vVar.alpha;
        if (i4 == 1) {
            z2 = true;
        }
        create2 = Typeface.create(create, i5, z2);
        return create2;
    }

    @Override // G3.b
    public void alpha(int i4) {
    }

    @Override // G3.b
    public Bitmap bravo(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // H0.y
    public Typeface charlie(x xVar, v vVar, int i4) {
        return lima(xVar.white, vVar, i4);
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        return new j();
    }

    @Override // G3.b
    public void delta(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // H0.y
    public Typeface echo(v vVar, int i4) {
        return lima(null, vVar, i4);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.aa
    public void foxtrot(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(new z((ByteBuffer) obj));
    }

    @Override // kotlin.time.a
    public kotlin.time.e golf() {
        Instant now;
        long epochSecond;
        int nano;
        now = Instant.now();
        Intrinsics.delta(now, "now(...)");
        kotlin.time.e eVar = kotlin.time.e.red;
        epochSecond = now.getEpochSecond();
        nano = now.getNano();
        return kotlin.time.g.india(nano, epochSecond);
    }

    @Override // G3.b
    public Bitmap hotel(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // G3.b
    public void india() {
    }

    @Override // com.bumptech.glide.load.resource.bitmap.aa
    public void juliet(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new z((ByteBuffer) obj));
    }

    @Override // Z3.a
    public Object kilo() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6690g.bravo()).longValue());
            case 21:
                List list2 = ac.alpha;
                Boolean bool = (Boolean) D2.bravo.bravo();
                bool.getClass();
                return bool;
            case 22:
                List list3 = ac.alpha;
                x3.purple.get();
                Boolean bool2 = (Boolean) z3.echo.bravo();
                bool2.getClass();
                return bool2;
            case 23:
                List list4 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool3 = (Boolean) C1327h3.foxtrot.bravo();
                bool3.getClass();
                return bool3;
            case 24:
                List list5 = ac.alpha;
                C1317f3.purple.get();
                Boolean bool4 = (Boolean) C1327h3.charlie.bravo();
                bool4.getClass();
                return bool4;
            case 25:
                Boolean bool5 = (Boolean) M2.alpha.bravo();
                bool5.getClass();
                return bool5;
            case 26:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6688d.bravo()).longValue());
            case 27:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.emerald.bravo();
            case 28:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.cyan.bravo();
                l10.getClass();
                return l10;
            default:
                List list9 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.yankee.bravo();
                l11.getClass();
                return l11;
        }
    }

    public b(Q3.c cVar) {
        this.alpha = 16;
        cVar.alpha(UseTorchAsFlashQuirk.class);
    }
}
