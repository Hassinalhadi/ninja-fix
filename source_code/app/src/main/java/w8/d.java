package w8;

import C8.aa;
import java.util.Iterator;
import java.util.Map;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class d extends e {
    public static final C3146a bravo = C3146a.delta();
    public final aa alpha;

    public d(aa aaVar) {
        this.alpha = aaVar;
    }

    public static boolean delta(aa aaVar, int i4) {
        if (aaVar != null) {
            C3146a c3146a = bravo;
            if (i4 > 1) {
                c3146a.foxtrot("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : aaVar.black().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String trim = str.trim();
                    if (trim.isEmpty()) {
                        c3146a.foxtrot("counterId is empty");
                    } else if (trim.length() > 100) {
                        c3146a.foxtrot("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        c3146a.foxtrot("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                c3146a.foxtrot("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator it = aaVar.emerald().iterator();
            while (it.hasNext()) {
                if (!delta((aa) it.next(), i4 + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        r7 = r7.blue().entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r7.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        r8 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        w8.e.bravo((java.lang.String) r8.getKey(), (java.lang.String) r8.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r0.foxtrot(r7.getLocalizedMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean echo(aa aaVar, int i4) {
        Long l10;
        C3146a c3146a = bravo;
        if (aaVar == null) {
            c3146a.foxtrot("TraceMetric is null");
            return false;
        }
        if (i4 > 1) {
            c3146a.foxtrot("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String crimson = aaVar.crimson();
        if (crimson != null) {
            String trim = crimson.trim();
            if (!trim.isEmpty() && trim.length() <= 100) {
                if (aaVar.coral() > 0) {
                    if (!aaVar.fuchsia()) {
                        c3146a.foxtrot("clientStartTimeUs is null.");
                        return false;
                    }
                    if (aaVar.crimson().startsWith("_st_") && ((l10 = (Long) aaVar.black().get("_fr_tot")) == null || l10.compareTo((Long) 0L) <= 0)) {
                        c3146a.foxtrot("non-positive totalFrames in screen trace " + aaVar.crimson());
                        return false;
                    }
                    Iterator it = aaVar.emerald().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!echo((aa) it.next(), i4 + 1)) {
                            break;
                        }
                    }
                } else {
                    c3146a.foxtrot("invalid TraceDuration:" + aaVar.coral());
                    return false;
                }
            }
        }
        c3146a.foxtrot("invalid TraceId:" + aaVar.crimson());
        return false;
    }

    @Override // w8.e
    public final boolean alpha() {
        aa aaVar = this.alpha;
        boolean echo = echo(aaVar, 0);
        C3146a c3146a = bravo;
        if (!echo) {
            c3146a.foxtrot("Invalid Trace:" + aaVar.crimson());
            return false;
        }
        if (aaVar.beige() <= 0) {
            Iterator it = aaVar.emerald().iterator();
            while (it.hasNext()) {
                if (((aa) it.next()).beige() > 0) {
                }
            }
            return true;
        }
        if (!delta(aaVar, 0)) {
            c3146a.foxtrot("Invalid Counters for Trace:" + aaVar.crimson());
            return false;
        }
        return true;
    }
}
