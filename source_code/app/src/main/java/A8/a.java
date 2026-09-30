package A8;

import A0.z;
import B9.ab;
import C8.t;
import E5.i;
import I0.aj;
import I0.s;
import I7.l;
import J7.k;
import R7.ae;
import R7.ah;
import a4.w;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.protobuf.C1503f;
import com.squareup.picasso.Picasso;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;
import id.C1915c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import q9.InterfaceC2431a;
import s6.V4;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements B5.e, I7.e, B5.g, G6.g, aj, I7.f, InterfaceC1903a, OnFailureListener, L5.f, InterfaceC2431a, ah.a, S7.b {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9 A[SYNTHETIC] */
    @Override // S7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object alpha(JsonReader jsonReader) {
        String str = null;
        switch (this.alpha) {
            case 27:
                jsonReader.beginObject();
                String str2 = null;
                String str3 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    char c3 = 65535;
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                c3 = 0;
                            }
                            switch (c3) {
                                case 0:
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    break;
                                case 1:
                                    str = jsonReader.nextString();
                                    if (str == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    break;
                                case 2:
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        case 3002454:
                            if (nextName.equals("arch")) {
                                c3 = 1;
                            }
                            switch (c3) {
                            }
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                c3 = 2;
                            }
                            switch (c3) {
                            }
                            break;
                        default:
                            switch (c3) {
                            }
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str2 != null && str3 != null) {
                    return new ae(str, str2, str3);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" arch");
                }
                if (str2 == null) {
                    sb2.append(" libraryName");
                }
                if (str3 == null) {
                    sb2.append(" buildId");
                }
                throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
            default:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (!nextName2.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        }
                    } else {
                        str = jsonReader.nextString();
                        if (str == null) {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new ah(str, bArr);
                }
                StringBuilder sb3 = new StringBuilder();
                if (str == null) {
                    sb3.append(" filename");
                }
                if (bArr == null) {
                    sb3.append(" contents");
                }
                throw new IllegalStateException(z.kilo(sb3, "Missing required properties:"));
        }
    }

    @Override // B5.e, L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.alpha) {
            case 0:
                t tVar = (t) obj;
                tVar.getClass();
                try {
                    int hotel = tVar.hotel(null);
                    byte[] bArr = new byte[hotel];
                    C1503f c1503f = new C1503f(hotel, bArr);
                    tVar.romeo(c1503f);
                    if (hotel - c1503f.foxtrot == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + t.class.getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        C1915c alpha = i.alpha();
                        alpha.zulu(rawQuery.getString(1));
                        alpha.silver = O5.a.bravo(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        alpha.red = decode;
                        arrayList.add(alpha.hotel());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
        }
    }

    @Override // I7.f
    public List bravo(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // ah.a
    public void charlie(Object obj) {
        w it = (w) obj;
        Intrinsics.echo(it, "it");
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        switch (this.alpha) {
            case 7:
                return AbtRegistrar.alpha((ab) cVar);
            case 8:
                Set maroon = ((ab) cVar).maroon(D8.a.class);
                D8.c cVar2 = D8.c.red;
                if (cVar2 == null) {
                    synchronized (D8.c.class) {
                        try {
                            cVar2 = D8.c.red;
                            if (cVar2 == null) {
                                cVar2 = new D8.c(0);
                                D8.c.red = cVar2;
                            }
                        } finally {
                        }
                    }
                }
                return new D8.b(maroon, cVar2);
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.alpha.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.charlie.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.bravo.get();
            case 19:
                l lVar = ExecutorsRegistrar.alpha;
                return k.alpha;
            case 21:
                return FirebaseSessionsRegistrar.bravo((ab) cVar);
            default:
                return FirebaseSessionsRegistrar.alpha((ab) cVar);
        }
    }

    @Override // i8.InterfaceC1903a
    public void delta(InterfaceC1904b interfaceC1904b) {
    }

    @Override // B5.g
    public void echo(Exception exc) {
    }

    @Override // I0.aj
    public I0.ah filter(D0.g gVar) {
        return new I0.ah(gVar, s.alpha);
    }

    @Override // q9.InterfaceC2431a
    public void foxtrot(ImageView imageView, Object obj) {
        Picasso.get().load((String) obj).into(imageView);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // G6.g
    public Task then(Object obj) {
        switch (this.alpha) {
            case 10:
                return V4.echo(null);
            case 11:
                return V4.echo(null);
            default:
                return V4.echo(null);
        }
    }
}
