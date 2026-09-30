package com.google.firebase.perf.session;

import B8.e;
import C8.v;
import C8.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import g8.d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import s8.C2837a;
import s8.o;
import s8.r;
import w6.c;

/* loaded from: classes2.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new c(2);
    public final String alpha;
    public final Timer purple;
    public boolean red;

    public PerfSession(String str, d dVar) {
        this.red = false;
        this.alpha = str;
        this.purple = new Timer();
    }

    public static w[] delta(List list) {
        if (list.isEmpty()) {
            return null;
        }
        w[] wVarArr = new w[list.size()];
        w charlie = ((PerfSession) list.get(0)).charlie();
        boolean z2 = false;
        for (int i4 = 1; i4 < list.size(); i4++) {
            w charlie2 = ((PerfSession) list.get(i4)).charlie();
            if (!z2 && ((PerfSession) list.get(i4)).red) {
                wVarArr[0] = charlie2;
                wVarArr[i4] = charlie;
                z2 = true;
            } else {
                wVarArr[i4] = charlie2;
            }
        }
        if (!z2) {
            wVarArr[0] = charlie;
        }
        return wVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (s8.C2837a.uniform(r5) != false) goto L32;
     */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, s8.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PerfSession echo(String str) {
        boolean z2;
        r rVar;
        double d4;
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new d(1));
        C2837a echo = C2837a.echo();
        if (echo.tango()) {
            double random = Math.random();
            synchronized (r.class) {
                try {
                    if (r.alpha == null) {
                        r.alpha = new Object();
                    }
                    rVar = r.alpha;
                } catch (Throwable th) {
                    throw th;
                }
            }
            e juliet = echo.juliet(rVar);
            if (juliet.bravo()) {
                d4 = ((Double) juliet.alpha()).doubleValue() / 100.0d;
            }
            e eVar = echo.alpha.getDouble("fpr_vc_session_sampling_rate");
            if (eVar.bravo() && C2837a.uniform(((Double) eVar.alpha()).doubleValue())) {
                echo.charlie.echo("com.google.firebase.perf.SessionSamplingRate", ((Double) eVar.alpha()).doubleValue());
                d4 = ((Double) eVar.alpha()).doubleValue();
            } else {
                e bravo = echo.bravo(rVar);
                if (bravo.bravo() && C2837a.uniform(((Double) bravo.alpha()).doubleValue())) {
                    d4 = ((Double) bravo.alpha()).doubleValue();
                } else if (echo.alpha.isLastFetchFailed()) {
                    d4 = 1.0E-5d;
                } else {
                    d4 = 0.01d;
                }
            }
            if (random < d4) {
                z2 = true;
                perfSession.red = z2;
                return perfSession;
            }
        }
        z2 = false;
        perfSession.red = z2;
        return perfSession;
    }

    public final w charlie() {
        v whiskey = w.whiskey();
        whiskey.india();
        w.sierra((w) whiskey.purple, this.alpha);
        if (this.red) {
            whiskey.india();
            w.tango((w) whiskey.purple);
        }
        return (w) whiskey.golf();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [s8.o, java.lang.Object] */
    public final boolean foxtrot() {
        o oVar;
        long j5;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.purple.charlie());
        C2837a echo = C2837a.echo();
        echo.getClass();
        synchronized (o.class) {
            try {
                if (o.alpha == null) {
                    o.alpha = new Object();
                }
                oVar = o.alpha;
            } catch (Throwable th) {
                throw th;
            }
        }
        e kilo = echo.kilo(oVar);
        if (kilo.bravo() && ((Long) kilo.alpha()).longValue() > 0) {
            j5 = ((Long) kilo.alpha()).longValue();
        } else {
            e eVar = echo.alpha.getLong("fpr_session_max_duration_min");
            if (eVar.bravo() && ((Long) eVar.alpha()).longValue() > 0) {
                echo.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                j5 = ((Long) eVar.alpha()).longValue();
            } else {
                e charlie = echo.charlie(oVar);
                if (charlie.bravo() && ((Long) charlie.alpha()).longValue() > 0) {
                    j5 = ((Long) charlie.alpha()).longValue();
                } else {
                    j5 = 240;
                }
            }
        }
        if (minutes > j5) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.alpha);
        parcel.writeByte(this.red ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.purple, 0);
    }

    public PerfSession(Parcel parcel) {
        this.red = false;
        this.alpha = parcel.readString();
        this.red = parcel.readByte() != 0;
        this.purple = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
