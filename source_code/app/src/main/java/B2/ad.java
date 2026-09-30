package B2;

import a2.C0394s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.location.Location;
import android.os.Handler;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.app.feature.location.api.StompStateHolder;
import delivery.samurai.android.R;
import ga.as;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p3.C2275g;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;
import u3.InterfaceC3142e;

/* loaded from: classes3.dex */
public final class ad {
    public final Object alpha;
    public final Object bravo;
    public final Object charlie;
    public final Object delta;
    public final Object echo;
    public final Object foxtrot;
    public final Object golf;
    public Object hotel;

    public ad(C2275g c2275g, StompStateHolder stompStateHolder, InterfaceC3142e interfaceC3142e, Handler handler, C2275g c2275g2, Cb.d dVar) {
        this.alpha = c2275g;
        this.bravo = stompStateHolder;
        this.charlie = interfaceC3142e;
        this.delta = handler;
        this.echo = c2275g2;
        this.golf = dVar;
        this.foxtrot = new ArrayList();
    }

    public void alpha(Location location, String str, String str2) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.foxtrot;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((p3.ag) obj).alpha.getTime() == location.getTime()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((p3.ag) obj) == null) {
            arrayList.add(new p3.ag(location, str, str2, System.currentTimeMillis()));
            if (CollectionsKt.d(arrayList, new com.clevertap.android.sdk.inapp.evaluation.a(System.currentTimeMillis(), 3))) {
                ((InterfaceC3142e) this.charlie).alpha("LocationFlow", "Cleaned up stale pending locations");
            }
        }
    }

    public void bravo() {
        if (((as) this.hotel) != null) {
            return;
        }
        as asVar = new as(8, this);
        this.hotel = asVar;
        Intrinsics.checkNotNull(asVar);
        ((Handler) this.delta).postDelayed(asVar, 5000L);
    }

    public void charlie(final Location location, String topic, String payload, final p3.ae aeVar, final Function0 function0, Function1 function1) {
        Intrinsics.echo(location, "location");
        Intrinsics.echo(topic, "topic");
        Intrinsics.echo(payload, "payload");
        final String str = (String) ((C2275g) this.echo).invoke();
        p3.ah state = ((StompStateHolder) this.bravo).getState();
        String str2 = "[SEND_RETRY] sendLocationWithRetry source=" + aeVar + " | accuracyMode=" + str + " | STOMP=" + state + " | lat=" + location.getLatitude() + ", lng=" + location.getLongitude();
        InterfaceC3142e interfaceC3142e = (InterfaceC3142e) this.charlie;
        interfaceC3142e.alpha("LocationFlow", str2);
        if (state != p3.ah.purple) {
            interfaceC3142e.alpha("LocationFlow", "[STOMP_NOT_CONNECTED] STOMP not connected (" + state + "), adding to queue | accuracyMode=" + str);
            StringBuilder sb2 = new StringBuilder("LocationSend: STOMP_NOT_CONNECTED state=");
            sb2.append(state);
            String message = sb2.toString();
            Intrinsics.echo(message, "message");
            try {
                K7.b.alpha().bravo(message);
            } catch (Exception unused) {
            }
            alpha(location, topic, payload);
            return;
        }
        interfaceC3142e.alpha("LocationFlow", "[PUSH_LOCATION] Pushing location source=" + aeVar + " lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + ", accuracy=" + location.getAccuracy() + "m, topic=" + topic + ", accuracyMode=" + str);
        g3.w wVar = (g3.w) ((C2275g) this.alpha).invoke();
        if (wVar == null) {
            interfaceC3142e.alpha("LocationFlow", "[SEND_NULL] locationSend is NULL - cannot send location | lat=" + location.getLatitude() + ", lng=" + location.getLongitude() + " | accuracyMode=" + str);
            alpha(location, topic, payload);
            function1.invoke(new Exception("locationSend is null"));
            return;
        }
        StringBuilder green = P0.green("[SEND_CALL] Calling locationSend.send() | topic=", topic, " | payloadLength=", " | accuracyMode=", payload.length());
        green.append(str);
        interfaceC3142e.alpha("LocationFlow", green.toString());
        wVar.alpha(topic, payload, new Function0() { // from class: p3.ac
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Location location2 = location;
                long time = location2.getTime();
                B2.ad adVar = B2.ad.this;
                CollectionsKt.d((ArrayList) adVar.foxtrot, new com.clevertap.android.sdk.inapp.evaluation.a(time, 4));
                double latitude = location2.getLatitude();
                double longitude = location2.getLongitude();
                float accuracy = location2.getAccuracy();
                long time2 = location2.getTime();
                StringBuilder sb3 = new StringBuilder("[PUSH_SUCCESS] Location pushed successfully | source=");
                ae aeVar2 = aeVar;
                sb3.append(aeVar2);
                sb3.append(" lat=");
                sb3.append(latitude);
                sb3.append(", lng=");
                sb3.append(longitude);
                sb3.append(", accuracy=");
                sb3.append(accuracy);
                sb3.append("m, time=");
                sb3.append(time2);
                sb3.append(", accuracyMode=");
                sb3.append(str);
                ((InterfaceC3142e) adVar.charlie).alpha("LocationFlow", sb3.toString());
                String message2 = "LocationSend: PUSH_SUCCESS source=" + aeVar2 + " lat=" + location2.getLatitude() + " lng=" + location2.getLongitude() + " time=" + location2.getTime();
                Intrinsics.echo(message2, "message");
                try {
                    K7.b.alpha().bravo(message2);
                } catch (Exception unused2) {
                }
                function0.invoke();
                return Unit.INSTANCE;
            }
        }, new C0394s(this, aeVar, location, str, topic, payload, function1));
    }

    public ad(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageButton imageButton, ImageButton imageButton2, RecyclerView recyclerView2, LinearLayout linearLayout, EditText editText, Toolbar toolbar) {
        this.alpha = constraintLayout;
        this.bravo = recyclerView;
        this.charlie = imageButton;
        this.delta = imageButton2;
        this.echo = recyclerView2;
        this.foxtrot = linearLayout;
        this.golf = editText;
        this.hotel = toolbar;
    }

    public ad(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC2710m0.delta(context, R.attr.materialCalendarStyle, com.google.android.material.datepicker.r.class.getCanonicalName()).data, L6.a.whiskey);
        this.alpha = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(4, 0), context);
        this.golf = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(2, 0), context);
        this.bravo = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(3, 0), context);
        this.charlie = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(5, 0), context);
        ColorStateList alpha = AbstractC2719n0.alpha(context, obtainStyledAttributes, 7);
        this.delta = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(9, 0), context);
        this.echo = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(8, 0), context);
        this.foxtrot = com.google.android.material.datepicker.c.alpha(obtainStyledAttributes.getResourceId(10, 0), context);
        Paint paint = new Paint();
        this.hotel = paint;
        paint.setColor(alpha.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public ad(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, J2.l lVar) {
        this.alpha = str;
        this.bravo = str2;
        this.foxtrot = arrayList;
        this.charlie = str3;
        this.delta = str4;
        this.echo = str5;
        this.golf = str6;
        this.hotel = lVar;
    }

    public ad(Context context, A2.a aVar, L2.c cVar, f fVar, WorkDatabase workDatabase, J2.p pVar, ArrayList arrayList) {
        Intrinsics.echo(context, "context");
        this.alpha = aVar;
        this.bravo = cVar;
        this.charlie = fVar;
        this.delta = workDatabase;
        this.echo = pVar;
        this.foxtrot = arrayList;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.delta(applicationContext, "context.applicationContext");
        this.golf = applicationContext;
        this.hotel = new J2.t(1);
    }
}
