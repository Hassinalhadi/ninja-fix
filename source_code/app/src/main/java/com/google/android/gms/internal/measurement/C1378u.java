package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1378u {
    public final Object alpha;
    public final Object bravo;

    public /* synthetic */ C1378u(C1290a1 c1290a1, String str) {
        this.alpha = c1290a1;
        this.bravo = str;
    }

    public InterfaceC1355o alpha(J2.i iVar, InterfaceC1355o interfaceC1355o) {
        C1374t c1374t;
        AbstractC1295b1.delta(iVar);
        if (interfaceC1355o instanceof C1359p) {
            C1359p c1359p = (C1359p) interfaceC1355o;
            ArrayList arrayList = c1359p.purple;
            HashMap hashMap = (HashMap) this.alpha;
            String str = c1359p.alpha;
            if (hashMap.containsKey(str)) {
                c1374t = (C1374t) hashMap.get(str);
            } else {
                c1374t = (C1374t) this.bravo;
            }
            return c1374t.alpha(str, iVar, arrayList);
        }
        return interfaceC1355o;
    }

    public Object bravo() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        C1290a1 c1290a1 = (C1290a1) this.alpha;
        String str2 = (String) this.bravo;
        Context context = (Context) c1290a1.bravo;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        U7.c cVar = R0.alpha;
        if (contentResolver != null) {
            synchronized (cVar) {
                try {
                    if (((HashMap) cVar.purple) == null) {
                        ((AtomicBoolean) cVar.alpha).set(false);
                        cVar.purple = new HashMap(16, 1.0f);
                        cVar.yellow = new Object();
                        contentResolver.registerContentObserver(S0.alpha, true, new U0(0, cVar));
                    } else if (((AtomicBoolean) cVar.alpha).getAndSet(false)) {
                        ((HashMap) cVar.purple).clear();
                        ((HashMap) cVar.red).clear();
                        ((HashMap) cVar.silver).clear();
                        ((HashMap) cVar.teal).clear();
                        ((HashMap) cVar.white).clear();
                        cVar.yellow = new Object();
                    }
                    Object obj = cVar.yellow;
                    String str3 = null;
                    if (((HashMap) cVar.purple).containsKey(str2)) {
                        String str4 = (String) ((HashMap) cVar.purple).get(str2);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    try {
                        uri = S0.alpha;
                        acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                        try {
                        } finally {
                            acquireUnstableContentProviderClient.release();
                        }
                    } catch (zzjg unused) {
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                            try {
                                if (query != null) {
                                    if (query.moveToFirst()) {
                                        str = query.getString(1);
                                        query.close();
                                    } else {
                                        query.close();
                                        str = null;
                                    }
                                    if (str != null && str.equals(null)) {
                                        str = null;
                                    }
                                    synchronized (cVar) {
                                        try {
                                            if (obj == cVar.yellow) {
                                                ((HashMap) cVar.purple).put(str2, str);
                                            }
                                        } finally {
                                        }
                                    }
                                    if (str == null) {
                                        return null;
                                    }
                                    return str;
                                }
                                throw new zzjg("ContentProvider query returned null cursor");
                            } finally {
                            }
                        } catch (RemoteException e) {
                            throw new zzjg("ContentProvider query failed", e);
                        }
                    } else {
                        throw new zzjg("Unable to acquire ContentProviderClient");
                    }
                } finally {
                }
            }
        } else {
            cVar.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public void charlie(J2.i iVar, C1298c c1298c) {
        int i4;
        C1357o1 c1357o1 = new C1357o1(c1298c);
        TreeMap treeMap = (TreeMap) this.alpha;
        for (Integer num : treeMap.keySet()) {
            C1293b clone = ((C1293b) c1298c.red).clone();
            InterfaceC1355o charlie = ((C1351n) treeMap.get(num)).charlie(iVar, Collections.singletonList(c1357o1));
            if (charlie instanceof C1323h) {
                i4 = AbstractC1295b1.charlie(((C1323h) charlie).alpha.doubleValue());
            } else {
                i4 = -1;
            }
            if (i4 == 2 || i4 == -1) {
                c1298c.red = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.bravo;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC1355o charlie2 = ((C1351n) treeMap2.get((Integer) it.next())).charlie(iVar, Collections.singletonList(c1357o1));
            if (charlie2 instanceof C1323h) {
                AbstractC1295b1.charlie(((C1323h) charlie2).alpha.doubleValue());
            }
        }
    }

    public void delta(C1374t c1374t) {
        Iterator it = c1374t.alpha.iterator();
        while (it.hasNext()) {
            ((HashMap) this.alpha).put(Integer.valueOf(((EnumC1390x) it.next()).alpha).toString(), c1374t);
        }
    }

    public C1378u(int i4) {
        switch (i4) {
            case 2:
                this.alpha = new TreeMap();
                this.bravo = new TreeMap();
                return;
            default:
                this.alpha = new HashMap();
                this.bravo = new C1374t(6);
                C1374t c1374t = new C1374t(0);
                ArrayList arrayList = c1374t.alpha;
                arrayList.add(EnumC1390x.BITWISE_AND);
                arrayList.add(EnumC1390x.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC1390x.BITWISE_NOT);
                arrayList.add(EnumC1390x.BITWISE_OR);
                arrayList.add(EnumC1390x.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC1390x.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC1390x.BITWISE_XOR);
                delta(c1374t);
                C1374t c1374t2 = new C1374t(1);
                ArrayList arrayList2 = c1374t2.alpha;
                arrayList2.add(EnumC1390x.EQUALS);
                arrayList2.add(EnumC1390x.GREATER_THAN);
                arrayList2.add(EnumC1390x.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC1390x.IDENTITY_EQUALS);
                arrayList2.add(EnumC1390x.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC1390x.LESS_THAN);
                arrayList2.add(EnumC1390x.LESS_THAN_EQUALS);
                arrayList2.add(EnumC1390x.NOT_EQUALS);
                delta(c1374t2);
                C1374t c1374t3 = new C1374t(2);
                ArrayList arrayList3 = c1374t3.alpha;
                arrayList3.add(EnumC1390x.APPLY);
                arrayList3.add(EnumC1390x.BLOCK);
                arrayList3.add(EnumC1390x.BREAK);
                arrayList3.add(EnumC1390x.CASE);
                arrayList3.add(EnumC1390x.DEFAULT);
                arrayList3.add(EnumC1390x.CONTINUE);
                arrayList3.add(EnumC1390x.DEFINE_FUNCTION);
                arrayList3.add(EnumC1390x.FN);
                arrayList3.add(EnumC1390x.IF);
                arrayList3.add(EnumC1390x.QUOTE);
                arrayList3.add(EnumC1390x.RETURN);
                arrayList3.add(EnumC1390x.SWITCH);
                arrayList3.add(EnumC1390x.TERNARY);
                delta(c1374t3);
                C1374t c1374t4 = new C1374t(3);
                ArrayList arrayList4 = c1374t4.alpha;
                arrayList4.add(EnumC1390x.AND);
                arrayList4.add(EnumC1390x.NOT);
                arrayList4.add(EnumC1390x.OR);
                delta(c1374t4);
                C1374t c1374t5 = new C1374t(4);
                ArrayList arrayList5 = c1374t5.alpha;
                arrayList5.add(EnumC1390x.FOR_IN);
                arrayList5.add(EnumC1390x.FOR_IN_CONST);
                arrayList5.add(EnumC1390x.FOR_IN_LET);
                arrayList5.add(EnumC1390x.FOR_LET);
                arrayList5.add(EnumC1390x.FOR_OF);
                arrayList5.add(EnumC1390x.FOR_OF_CONST);
                arrayList5.add(EnumC1390x.FOR_OF_LET);
                arrayList5.add(EnumC1390x.WHILE);
                delta(c1374t5);
                C1374t c1374t6 = new C1374t(5);
                ArrayList arrayList6 = c1374t6.alpha;
                arrayList6.add(EnumC1390x.ADD);
                arrayList6.add(EnumC1390x.DIVIDE);
                arrayList6.add(EnumC1390x.MODULUS);
                arrayList6.add(EnumC1390x.MULTIPLY);
                arrayList6.add(EnumC1390x.NEGATE);
                arrayList6.add(EnumC1390x.POST_DECREMENT);
                arrayList6.add(EnumC1390x.POST_INCREMENT);
                arrayList6.add(EnumC1390x.PRE_DECREMENT);
                arrayList6.add(EnumC1390x.PRE_INCREMENT);
                arrayList6.add(EnumC1390x.SUBTRACT);
                delta(c1374t6);
                C1374t c1374t7 = new C1374t(7);
                ArrayList arrayList7 = c1374t7.alpha;
                arrayList7.add(EnumC1390x.ASSIGN);
                arrayList7.add(EnumC1390x.CONST);
                arrayList7.add(EnumC1390x.CREATE_ARRAY);
                arrayList7.add(EnumC1390x.CREATE_OBJECT);
                arrayList7.add(EnumC1390x.EXPRESSION_LIST);
                arrayList7.add(EnumC1390x.GET);
                arrayList7.add(EnumC1390x.GET_INDEX);
                arrayList7.add(EnumC1390x.GET_PROPERTY);
                arrayList7.add(EnumC1390x.NULL);
                arrayList7.add(EnumC1390x.SET_PROPERTY);
                arrayList7.add(EnumC1390x.TYPEOF);
                arrayList7.add(EnumC1390x.UNDEFINED);
                arrayList7.add(EnumC1390x.VAR);
                delta(c1374t7);
                return;
        }
    }
}
