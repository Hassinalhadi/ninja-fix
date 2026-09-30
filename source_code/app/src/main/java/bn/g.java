package bn;

import V5.x;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.EnumC0516n;
import androidx.camera.core.impl.EnumC0517o;
import androidx.camera.core.impl.EnumC0518p;
import androidx.camera.core.impl.InterfaceC0519q;
import androidx.camera.core.impl.V;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.internal.measurement.C1379u0;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.measurement.internal.C1446h;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.au;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n0.EnumC2152b;

/* loaded from: classes3.dex */
public final class g implements InterfaceC0519q {
    public long alpha;
    public final Object purple;
    public final Object red;

    public g(C1450j c1450j, String str) {
        this.red = c1450j;
        x.echo(str);
        this.purple = str;
        this.alpha = -1L;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public EnumC0516n a() {
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) this.purple;
        if (interfaceC0519q != null) {
            return interfaceC0519q.a();
        }
        return EnumC0516n.alpha;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public V alpha() {
        return (V) this.red;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List bravo() {
        ArrayList arrayList;
        C1450j c1450j = (C1450j) this.red;
        ArrayList arrayList2 = new ArrayList();
        String valueOf = String.valueOf(this.alpha);
        String str = (String) this.purple;
        Cursor cursor = null;
        try {
            try {
                cursor = c1450j.S0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", Column.DATA, "realtime"}, "app_id = ? and rowid > ?", new String[]{str, valueOf}, null, null, "rowid", "1000");
            } catch (SQLiteException e) {
                ar arVar = ((G) c1450j.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.charlie(ar.e0(str), e, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            if (!cursor.moveToFirst()) {
                arrayList = Collections.EMPTY_LIST;
                return arrayList;
            }
            do {
                boolean z2 = false;
                long j5 = cursor.getLong(0);
                long j6 = cursor.getLong(3);
                if (cursor.getLong(5) == 1) {
                    z2 = true;
                }
                byte[] blob = cursor.getBlob(4);
                if (j5 > this.alpha) {
                    this.alpha = j5;
                }
                try {
                    C1379u0 c1379u0 = (C1379u0) au.C0(C1383v0.romeo(), blob);
                    String string = cursor.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    c1379u0.golf();
                    C1383v0.zulu((C1383v0) c1379u0.purple, string);
                    long j7 = cursor.getLong(2);
                    c1379u0.golf();
                    C1383v0.beige(j7, (C1383v0) c1379u0.purple);
                    arrayList2.add(new C1446h(j5, j6, z2, (C1383v0) c1379u0.echo()));
                } catch (IOException e4) {
                    ar arVar2 = ((G) c1450j.alpha).f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(ar.e0(str), e4, "Data loss. Failed to merge raw event. appId");
                }
            } while (cursor.moveToNext());
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public long getTimestamp() {
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) this.purple;
        if (interfaceC0519q != null) {
            return interfaceC0519q.getTimestamp();
        }
        long j5 = this.alpha;
        if (j5 != -1) {
            return j5;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public /* synthetic */ CaptureResult m() {
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public EnumC0517o s() {
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) this.purple;
        if (interfaceC0519q != null) {
            return interfaceC0519q.s();
        }
        return EnumC0517o.alpha;
    }

    @Override // androidx.camera.core.impl.InterfaceC0519q
    public EnumC0518p xray() {
        InterfaceC0519q interfaceC0519q = (InterfaceC0519q) this.purple;
        if (interfaceC0519q != null) {
            return interfaceC0519q.xray();
        }
        return EnumC0518p.alpha;
    }

    public g(C1450j c1450j, String str, long j5) {
        this.red = c1450j;
        x.echo(str);
        this.purple = str;
        this.alpha = c1450j.O0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j5)}, -1L);
    }

    public g() {
        EnumC2152b enumC2152b = EnumC2152b.alpha;
        this.purple = new n0.c();
        this.red = new n0.c();
    }

    public g(InterfaceC0519q interfaceC0519q, V v4, long j5) {
        this.purple = interfaceC0519q;
        this.red = v4;
        this.alpha = j5;
    }
}
