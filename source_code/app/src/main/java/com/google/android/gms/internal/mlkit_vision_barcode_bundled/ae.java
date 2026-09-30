package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ae {
    public static final ae charlie = new ae(0);
    public final O alpha = new O();
    public boolean bravo;

    public ae() {
    }

    public static int alpha(ak akVar, Object obj) {
        akVar.getClass();
        aa.romeo(0 << 3);
        if (Y.purple == null) {
            Charset charset = at.alpha;
        }
        Z z2 = Z.alpha;
        throw null;
    }

    public static boolean hotel(Map.Entry entry) {
        ((ak) entry.getKey()).getClass();
        throw null;
    }

    public static final int india(Map.Entry entry) {
        ak akVar = (ak) entry.getKey();
        entry.getValue();
        akVar.getClass();
        throw null;
    }

    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final ae clone() {
        ae aeVar = new ae();
        O o5 = this.alpha;
        int i4 = o5.purple;
        for (int i5 = 0; i5 < i4; i5++) {
            P charlie2 = o5.charlie(i5);
            aeVar.echo((ak) charlie2.alpha, charlie2.purple);
        }
        for (Map.Entry entry : o5.alpha()) {
            aeVar.echo((ak) entry.getKey(), entry.getValue());
        }
        return aeVar;
    }

    public final Iterator charlie() {
        O o5 = this.alpha;
        if (o5.isEmpty()) {
            return Collections.emptyIterator();
        }
        return ((Oe.ah) o5.entrySet()).iterator();
    }

    public final void delta() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.bravo) {
            return;
        }
        O o5 = this.alpha;
        int i4 = o5.purple;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = o5.charlie(i5).purple;
            if (obj instanceof am) {
                am amVar = (am) obj;
                amVar.getClass();
                H.charlie.alpha(amVar.getClass()).bravo(amVar);
                amVar.golf();
            }
        }
        if (!o5.silver) {
            for (int i10 = 0; i10 < o5.purple; i10++) {
                ((ak) o5.charlie(i10).alpha).getClass();
            }
            Iterator it = o5.alpha().iterator();
            while (it.hasNext()) {
                ((ak) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        if (!o5.silver) {
            if (o5.red.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(o5.red);
            }
            o5.red = unmodifiableMap;
            if (o5.white.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(o5.white);
            }
            o5.white = unmodifiableMap2;
            o5.silver = true;
        }
        this.bravo = true;
    }

    public final void echo(ak akVar, Object obj) {
        akVar.getClass();
        Charset charset = at.alpha;
        obj.getClass();
        Y y10 = Y.purple;
        Z z2 = Z.alpha;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        return this.alpha.equals(((ae) obj).alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean foxtrot() {
        O o5 = this.alpha;
        int i4 = o5.purple;
        int i5 = 0;
        while (true) {
            if (i5 < i4) {
                if (!hotel(o5.charlie(i5))) {
                    break;
                }
                i5++;
            } else {
                Iterator it = o5.alpha().iterator();
                while (it.hasNext()) {
                    if (!hotel((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
    }

    public final void golf(Map.Entry entry) {
        ak akVar = (ak) entry.getKey();
        entry.getValue();
        akVar.getClass();
        throw null;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public ae(int i4) {
        delta();
        delta();
    }
}
