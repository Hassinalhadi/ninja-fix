package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes2.dex */
public final class ar extends P {

    /* renamed from: a, reason: collision with root package name */
    public final a4.j f7631a;

    /* renamed from: b, reason: collision with root package name */
    public final a4.j f7632b;

    /* renamed from: c, reason: collision with root package name */
    public final a4.j f7633c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.j f7634d;
    public final a4.j e;

    /* renamed from: f, reason: collision with root package name */
    public final a4.j f7635f;

    /* renamed from: g, reason: collision with root package name */
    public final a4.j f7636g;
    public char red;
    public long silver;
    public String teal;
    public final a4.j white;
    public final a4.j yellow;

    public ar(G g2) {
        super(g2);
        this.red = (char) 0;
        this.silver = -1L;
        this.white = new a4.j(6, this, false, false);
        this.yellow = new a4.j(6, this, true, false);
        this.f7631a = new a4.j(6, this, false, true);
        this.f7632b = new a4.j(5, this, false, false);
        this.f7633c = new a4.j(5, this, true, false);
        this.f7634d = new a4.j(5, this, false, true);
        this.e = new a4.j(4, this, false, false);
        this.f7635f = new a4.j(3, this, false, false);
        this.f7636g = new a4.j(2, this, false, false);
    }

    public static aq e0(String str) {
        if (str == null) {
            return null;
        }
        return new aq(str);
    }

    public static String f0(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String g02 = g0(obj, z2);
        String g03 = g0(obj2, z2);
        String g04 = g0(obj3, z2);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(g02)) {
            sb2.append(str2);
            sb2.append(g02);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(g03)) {
            sb2.append(str2);
            sb2.append(g03);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(g04)) {
            sb2.append(str3);
            sb2.append(g04);
        }
        return sb2.toString();
    }

    public static String g0(Object obj, boolean z2) {
        String th;
        int lastIndexOf;
        String substring;
        String className;
        int lastIndexOf2;
        String substring2;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z2) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder();
            if (charAt == '-') {
                str = "-";
            }
            Q0.c.amber(sb2, str, round, "...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z2) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb3 = new StringBuilder(th);
            String canonicalName = G.class.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) {
                substring = "";
            } else {
                substring = canonicalName.substring(0, lastIndexOf);
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) {
                        substring2 = "";
                    } else {
                        substring2 = className.substring(0, lastIndexOf2);
                    }
                    if (substring2.equals(substring)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                }
                i4++;
            }
            return sb3.toString();
        }
        if (obj instanceof aq) {
            return ((aq) obj).alpha;
        }
        if (z2) {
            return "-";
        }
        return obj.toString();
    }

    @Override // com.google.android.gms.measurement.internal.P
    public final boolean X() {
        return false;
    }

    public final a4.j a0() {
        return this.f7635f;
    }

    public final a4.j b0() {
        return this.white;
    }

    public final a4.j c0() {
        return this.f7636g;
    }

    public final a4.j d0() {
        return this.f7632b;
    }

    public final String h0() {
        String str;
        synchronized (this) {
            try {
                if (this.teal == null) {
                    G g2 = (G) this.alpha;
                    String str2 = g2.silver;
                    if (str2 != null) {
                        this.teal = str2;
                    } else {
                        ((G) g2.yellow.alpha).getClass();
                        this.teal = "FA";
                    }
                }
                V5.x.hotel(this.teal);
                str = this.teal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void i0(int i4, boolean z2, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && Log.isLoggable(h0(), i4)) {
            Log.println(i4, h0(), f0(false, str, obj, obj2, obj3));
        }
        if (!z10 && i4 >= 5) {
            V5.x.hotel(str);
            E e = ((G) this.alpha).f7508c;
            if (e == null) {
                Log.println(6, h0(), "Scheduler not set. Not logging error/warn");
            } else {
                if (!e.purple) {
                    Log.println(6, h0(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
                if (i4 >= 9) {
                    i4 = 8;
                }
                e.g0(new ap(this, i4, str, obj, obj2, obj3));
            }
        }
    }
}
