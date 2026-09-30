package C7;

import F7.c;
import V5.x;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.ax;
import com.google.android.gms.internal.measurement.ay;
import com.google.android.gms.measurement.internal.W;
import com.google.common.collect.f;
import com.google.firebase.abt.AbtException;
import i8.InterfaceC1904b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public final InterfaceC1904b alpha;
    public Integer bravo = null;

    public b(InterfaceC1904b interfaceC1904b) {
        this.alpha = interfaceC1904b;
    }

    public static boolean alpha(ArrayList arrayList, a aVar) {
        String str = aVar.alpha;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.alpha.equals(str) && aVar2.bravo.equals(aVar.bravo)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [F7.a, java.lang.Object] */
    public final ArrayList bravo() {
        c cVar = (c) ((F7.b) this.alpha.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((J) cVar.alpha.purple).echo("frc", "")) {
            f fVar = G7.a.alpha;
            x.hotel(bundle);
            ?? obj = new Object();
            String str = (String) W.alpha(bundle, "origin", String.class, null);
            x.hotel(str);
            obj.alpha = str;
            String str2 = (String) W.alpha(bundle, "name", String.class, null);
            x.hotel(str2);
            obj.bravo = str2;
            obj.charlie = W.alpha(bundle, "value", Object.class, null);
            obj.delta = (String) W.alpha(bundle, "trigger_event_name", String.class, null);
            obj.echo = ((Long) W.alpha(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.foxtrot = (String) W.alpha(bundle, "timed_out_event_name", String.class, null);
            obj.golf = (Bundle) W.alpha(bundle, "timed_out_event_params", Bundle.class, null);
            obj.hotel = (String) W.alpha(bundle, "triggered_event_name", String.class, null);
            obj.india = (Bundle) W.alpha(bundle, "triggered_event_params", Bundle.class, null);
            obj.juliet = ((Long) W.alpha(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.kilo = (String) W.alpha(bundle, "expired_event_name", String.class, null);
            obj.lima = (Bundle) W.alpha(bundle, "expired_event_params", Bundle.class, null);
            obj.november = ((Boolean) W.alpha(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mike = ((Long) W.alpha(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.oscar = ((Long) W.alpha(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void charlie(ArrayList arrayList) {
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ObjectInputStream objectInputStream2;
        String str;
        String str2;
        String str3;
        String str4;
        int i4 = 0;
        InterfaceC1904b interfaceC1904b = this.alpha;
        if (interfaceC1904b.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String str5 = "";
                if (it.hasNext()) {
                    Map map = (Map) it.next();
                    String[] strArr = a.golf;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = a.golf;
                    for (int i5 = 0; i5 < 5; i5++) {
                        String str6 = strArr2[i5];
                        if (!map.containsKey(str6)) {
                            arrayList3.add(str6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = a.hotel.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str7 = (String) map.get("experimentId");
                            String str8 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str5 = (String) map.get("triggerEvent");
                            }
                            arrayList2.add(new a(str7, str8, str5, parse, parseLong, parseLong2));
                        } catch (NumberFormatException e) {
                            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
                        } catch (ParseException e4) {
                            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e4);
                        }
                    } else {
                        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                    }
                } else {
                    String str9 = null;
                    if (arrayList2.isEmpty()) {
                        if (interfaceC1904b.get() != null) {
                            Iterator it2 = bravo().iterator();
                            while (it2.hasNext()) {
                                String str10 = ((F7.a) it2.next()).bravo;
                                J j5 = (J) ((c) ((F7.b) interfaceC1904b.get())).alpha.purple;
                                j5.getClass();
                                j5.bravo(new ay(j5, str10, null, null, 0));
                            }
                            return;
                        }
                        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    if (interfaceC1904b.get() != null) {
                        ArrayList bravo = bravo();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = bravo.iterator();
                        while (it3.hasNext()) {
                            F7.a aVar = (F7.a) it3.next();
                            String[] strArr3 = a.golf;
                            String str11 = aVar.delta;
                            if (str11 == null) {
                                str4 = "";
                            } else {
                                str4 = str11;
                            }
                            arrayList4.add(new a(aVar.bravo, String.valueOf(aVar.charlie), str4, new Date(aVar.mike), aVar.echo, aVar.juliet));
                            str9 = str9;
                        }
                        String str12 = str9;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            a aVar2 = (a) it4.next();
                            if (!alpha(arrayList2, aVar2)) {
                                arrayList5.add(aVar2.alpha());
                            }
                        }
                        Iterator it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            String str13 = ((F7.a) it5.next()).bravo;
                            J j6 = (J) ((c) ((F7.b) interfaceC1904b.get())).alpha.purple;
                            j6.getClass();
                            String str14 = str12;
                            j6.bravo(new ay(j6, str13, str14, str12, 0));
                            str12 = str14;
                        }
                        String str15 = str12;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            a aVar3 = (a) it6.next();
                            if (!alpha(arrayList4, aVar3)) {
                                arrayList6.add(aVar3);
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(bravo());
                        if (this.bravo == null) {
                            this.bravo = Integer.valueOf(((J) ((c) ((F7.b) interfaceC1904b.get())).alpha.purple).charlie("frc"));
                        }
                        int intValue = this.bravo.intValue();
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            a aVar4 = (a) it7.next();
                            while (arrayDeque.size() >= intValue) {
                                String str16 = ((F7.a) arrayDeque.pollFirst()).bravo;
                                J j7 = (J) ((c) ((F7.b) interfaceC1904b.get())).alpha.purple;
                                j7.getClass();
                                j7.bravo(new ay(j7, str16, str15, str15, 0));
                            }
                            F7.a alpha = aVar4.alpha();
                            c cVar = (c) ((F7.b) interfaceC1904b.get());
                            cVar.getClass();
                            f fVar = G7.a.alpha;
                            String str17 = alpha.alpha;
                            if (str17 != null && !str17.isEmpty()) {
                                Object obj = alpha.charlie;
                                if (obj != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                        try {
                                            objectOutputStream2.writeObject(obj);
                                            objectOutputStream2.flush();
                                            objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                        } catch (Throwable th) {
                                            th = th;
                                            objectInputStream = str15;
                                            objectOutputStream = objectOutputStream2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        String str18 = str15;
                                        objectInputStream = str18;
                                        objectOutputStream = str18;
                                    }
                                    try {
                                        Object obj2 = objectInputStream2.readObject();
                                        try {
                                            objectOutputStream2.close();
                                            objectInputStream2.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            obj2 = str15;
                                        }
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        objectOutputStream = objectOutputStream2;
                                        objectInputStream = objectInputStream2;
                                        if (objectOutputStream != 0) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != 0) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                        break;
                                    }
                                }
                                if (G7.a.charlie(str17) && G7.a.delta(str17, alpha.bravo) && (((str = alpha.kilo) == null || (G7.a.bravo(alpha.lima, str) && G7.a.alpha(str17, alpha.kilo, alpha.lima))) && (((str2 = alpha.hotel) == null || (G7.a.bravo(alpha.india, str2) && G7.a.alpha(str17, alpha.hotel, alpha.india))) && ((str3 = alpha.foxtrot) == null || (G7.a.bravo(alpha.golf, str3) && G7.a.alpha(str17, alpha.foxtrot, alpha.golf)))))) {
                                    Bundle bundle = new Bundle();
                                    String str19 = alpha.alpha;
                                    if (str19 != null) {
                                        bundle.putString("origin", str19);
                                    }
                                    String str20 = alpha.bravo;
                                    if (str20 != null) {
                                        bundle.putString("name", str20);
                                    }
                                    Object obj3 = alpha.charlie;
                                    if (obj3 != null) {
                                        W.echo(bundle, obj3);
                                    }
                                    String str21 = alpha.delta;
                                    if (str21 != null) {
                                        bundle.putString("trigger_event_name", str21);
                                    }
                                    bundle.putLong("trigger_timeout", alpha.echo);
                                    String str22 = alpha.foxtrot;
                                    if (str22 != null) {
                                        bundle.putString("timed_out_event_name", str22);
                                    }
                                    Bundle bundle2 = alpha.golf;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    String str23 = alpha.hotel;
                                    if (str23 != null) {
                                        bundle.putString("triggered_event_name", str23);
                                    }
                                    Bundle bundle3 = alpha.india;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", alpha.juliet);
                                    String str24 = alpha.kilo;
                                    if (str24 != null) {
                                        bundle.putString("expired_event_name", str24);
                                    }
                                    Bundle bundle4 = alpha.lima;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", alpha.mike);
                                    bundle.putBoolean("active", alpha.november);
                                    bundle.putLong("triggered_timestamp", alpha.oscar);
                                    J j10 = (J) cVar.alpha.purple;
                                    j10.getClass();
                                    j10.bravo(new ax(j10, bundle, i4));
                                }
                            }
                            arrayDeque.offer(alpha);
                        }
                        return;
                    }
                    throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
            }
        } else {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
