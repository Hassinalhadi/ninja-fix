package B0;

import A2.h;
import Af.t;
import D2.d;
import Lf.l;
import Pf.s;
import T5.ah;
import T5.aj;
import V5.ai;
import Xd.n;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.widget.P0;
import androidx.appcompat.widget.i1;
import androidx.work.impl.WorkDatabase_Impl;
import ao.ad;
import av.q;
import bv.aw;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.f;
import com.google.android.material.internal.ab;
import com.google.common.collect.e;
import com.google.common.collect.m;
import e1.AbstractC1625a;
import i1.AbstractC1881b;
import i1.AbstractC1882c;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m2.AbstractC2096a;
import org.xmlpull.v1.XmlPullParserException;
import s6.AbstractC2716m6;
import s6.B5;
import s6.C2735o7;
import s6.L7;
import s6.U;
import s6.U7;
import s6.V;
import s6.X;
import t0.C0;

/* loaded from: classes3.dex */
public final class a implements L7 {
    public final /* synthetic */ int alpha;
    public int bravo;
    public Object charlie;
    public Object delta;

    public /* synthetic */ a(char c3, int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a charlie(int i4, Resources.Theme theme, Resources resources) {
        int next;
        boolean z2;
        float f5;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        boolean z11;
        int i5;
        int i10;
        boolean z12;
        int i11;
        int i12;
        float f15;
        int i13;
        float f16;
        float f17;
        float f18;
        ab abVar;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList bravo = AbstractC1882c.bravo(resources, xml, asAttributeSet, theme);
                    return new a(null, bravo, bravo.getDefaultColor());
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray hotel = AbstractC1881b.hotel(resources, theme, asAttributeSet, AbstractC1625a.echo);
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    f5 = 0.0f;
                } else {
                    f5 = hotel.getFloat(8, 0.0f);
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) {
                    f10 = hotel.getFloat(9, 0.0f);
                } else {
                    f10 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) {
                    f11 = hotel.getFloat(10, 0.0f);
                } else {
                    f11 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) {
                    f12 = hotel.getFloat(11, 0.0f);
                } else {
                    f12 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    f13 = 0.0f;
                } else {
                    f13 = hotel.getFloat(3, 0.0f);
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) {
                    f14 = hotel.getFloat(4, 0.0f);
                } else {
                    f14 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", Constants.KEY_TYPE) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    i5 = 0;
                } else {
                    i5 = hotel.getInt(2, 0);
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) {
                    i10 = hotel.getColor(0, 0);
                } else {
                    i10 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                    i11 = hotel.getColor(7, 0);
                } else {
                    i11 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
                    i12 = hotel.getColor(1, 0);
                } else {
                    i12 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
                    f15 = f5;
                    i13 = hotel.getInt(6, 0);
                } else {
                    f15 = f5;
                    i13 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) {
                    f16 = hotel.getFloat(5, 0.0f);
                } else {
                    f16 = 0.0f;
                }
                hotel.recycle();
                int depth = xml.getDepth() + 1;
                ArrayList arrayList = new ArrayList(20);
                float f19 = f16;
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    f17 = f10;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f18 = f11;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xml.getName().equals(com.clevertap.android.sdk.leanplum.Constants.IAP_ITEM_PARAM)) {
                            TypedArray hotel2 = AbstractC1881b.hotel(resources, theme, asAttributeSet, AbstractC1625a.foxtrot);
                            boolean hasValue = hotel2.hasValue(0);
                            boolean hasValue2 = hotel2.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color = hotel2.getColor(0, 0);
                            float f20 = hotel2.getFloat(1, 0.0f);
                            hotel2.recycle();
                            arrayList2.add(Integer.valueOf(color));
                            arrayList.add(Float.valueOf(f20));
                        }
                        f10 = f17;
                        f11 = f18;
                    } else {
                        f18 = f11;
                        break;
                    }
                }
                if (arrayList2.size() > 0) {
                    abVar = new ab(arrayList2, arrayList);
                } else {
                    abVar = null;
                }
                if (abVar == null) {
                    if (z12) {
                        abVar = new ab(i10, i11, i12);
                    } else {
                        abVar = new ab(i10, i12);
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                tileMode2 = Shader.TileMode.CLAMP;
                            } else {
                                tileMode2 = Shader.TileMode.MIRROR;
                            }
                        } else {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                        radialGradient = new LinearGradient(f15, f17, f18, f12, (int[]) abVar.purple, (float[]) abVar.red, tileMode2);
                    } else {
                        radialGradient = new SweepGradient(f13, f14, (int[]) abVar.purple, (float[]) abVar.red);
                    }
                } else if (f19 > 0.0f) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            tileMode = Shader.TileMode.CLAMP;
                        } else {
                            tileMode = Shader.TileMode.MIRROR;
                        }
                    } else {
                        tileMode = Shader.TileMode.REPEAT;
                    }
                    radialGradient = new RadialGradient(f13, f14, f19, (int[]) abVar.purple, (float[]) abVar.red, tileMode);
                } else {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                return new a(radialGradient, null, 0);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static void delta(String str) {
        int i4;
        boolean z2;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i5 = 0;
            boolean z10 = false;
            while (i5 <= length) {
                if (!z10) {
                    i4 = i5;
                } else {
                    i4 = length;
                }
                if (Intrinsics.golf(str.charAt(i4), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z10) {
                    if (!z2) {
                        z10 = true;
                    } else {
                        i5++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i5, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public l8.b alpha() {
        if ("".isEmpty()) {
            String str = (String) this.charlie;
            return new l8.b(this.bravo, ((Long) this.delta).longValue(), str);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public m bravo() {
        e eVar = (e) this.delta;
        if (eVar == null) {
            m alpha = m.alpha(this.bravo, (Object[]) this.charlie, this);
            e eVar2 = (e) this.delta;
            if (eVar2 == null) {
                return alpha;
            }
            throw eVar2.alpha();
        }
        throw eVar.alpha();
    }

    public String echo() {
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = this.bravo + 1;
        for (int i5 = 0; i5 < i4; i5++) {
            Object obj = ((Object[]) this.charlie)[i5];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(serialDescriptor.november(), l.charlie)) {
                    if (((int[]) this.delta)[i5] != -1) {
                        sb2.append(Constants.AES_PREFIX);
                        sb2.append(((int[]) this.delta)[i5]);
                        sb2.append(Constants.AES_SUFFIX);
                    }
                } else {
                    int i10 = ((int[]) this.delta)[i5];
                    if (i10 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.sierra(i10));
                    }
                }
            } else if (obj != s.alpha) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public void foxtrot(int i4, int i5, int i10, int i11, int i12, int i13, boolean z2, boolean z10) {
        long[] jArr = (long[]) this.charlie;
        int i14 = this.bravo;
        int i15 = i14 + 3;
        this.bravo = i15;
        int length = jArr.length;
        if (length <= i15) {
            int max = Math.max(length * 2, i15);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Intrinsics.delta(copyOf, "copyOf(...)");
            this.charlie = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.delta, max);
            Intrinsics.delta(copyOf2, "copyOf(...)");
            this.delta = copyOf2;
        }
        long[] jArr2 = (long[]) this.charlie;
        jArr2[i14] = (i5 << 32) | (i10 & 4294967295L);
        jArr2[i14 + 1] = (i11 << 32) | (i12 & 4294967295L);
        int i16 = i13 & 67108863;
        jArr2[i14 + 2] = ((z10 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i16 << 26) | (i4 & 67108863);
        if (i13 >= 0) {
            for (int i17 = i14 - 3; i17 >= 0; i17 -= 3) {
                int i18 = i17 + 2;
                long j5 = jArr2[i18];
                if ((((int) j5) & 67108863) == i16) {
                    jArr2[i18] = (j5 & (-2301339409586323457L)) | (((i14 - i17) & 511) << 52);
                    return;
                }
            }
        }
    }

    public boolean golf() {
        ColorStateList colorStateList;
        if (((Shader) this.charlie) == null && (colorStateList = (ColorStateList) this.delta) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void hotel(androidx.sqlite.db.framework.b bVar) {
    }

    public void india(androidx.sqlite.db.framework.b bVar) {
        Cursor azure = bVar.azure("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (azure.moveToFirst()) {
                if (azure.getInt(0) == 0) {
                    z2 = true;
                }
            }
            azure.close();
            D8.c cVar = (D8.c) this.delta;
            D8.c.bravo(bVar);
            if (!z2) {
                ai mike = D8.c.mike(bVar);
                if (!mike.alpha) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mike.bravo);
                }
            }
            bVar.juliet("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.juliet("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            ArrayList arrayList = ((WorkDatabase_Impl) cVar.purple).foxtrot;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((B2.a) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(azure, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void juliet(androidx.sqlite.db.framework.b bVar) {
        boolean z2;
        l2.l lVar;
        String str;
        Cursor azure = bVar.azure("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (azure.moveToFirst()) {
                if (azure.getInt(0) != 0) {
                    z2 = true;
                    azure.close();
                    if (!z2) {
                        Cursor beige = bVar.beige(new t("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            if (beige.moveToFirst()) {
                                str = beige.getString(0);
                            } else {
                                str = null;
                            }
                            beige.close();
                            if (!Intrinsics.areEqual("86254750241babac4b8d52996a675549", str) && !Intrinsics.areEqual("1cbd3130fa23b59692c061c594c16cc0", str)) {
                                throw new IllegalStateException(q.echo("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", str));
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC2716m6.alpha(beige, th);
                                throw th2;
                            }
                        }
                    } else {
                        ai mike = D8.c.mike(bVar);
                        if (mike.alpha) {
                            bVar.juliet("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                            bVar.juliet("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                        } else {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mike.bravo);
                        }
                    }
                    D8.c cVar = (D8.c) this.delta;
                    ((WorkDatabase_Impl) cVar.purple).alpha = bVar;
                    bVar.juliet("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.purple;
                    workDatabase_Impl.getClass();
                    lVar = workDatabase_Impl.delta;
                    lVar.getClass();
                    synchronized (lVar.lima) {
                        if (lVar.golf) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            bVar.juliet("PRAGMA temp_store = MEMORY;");
                            bVar.juliet("PRAGMA recursive_triggers='ON';");
                            bVar.juliet("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            lVar.delta(bVar);
                            lVar.hotel = bVar.foxtrot("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            lVar.golf = true;
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) cVar.purple).foxtrot;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            B2.a aVar = (B2.a) it.next();
                            aVar.getClass();
                            bVar.charlie();
                            try {
                                StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                aVar.alpha.getClass();
                                sb2.append(System.currentTimeMillis() - B2.t.alpha);
                                sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                bVar.juliet(sb2.toString());
                                bVar.blue();
                            } finally {
                                bVar.golf();
                            }
                        }
                    }
                    this.charlie = null;
                    return;
                }
            }
            z2 = false;
            azure.close();
            if (!z2) {
            }
            D8.c cVar2 = (D8.c) this.delta;
            ((WorkDatabase_Impl) cVar2.purple).alpha = bVar;
            bVar.juliet("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) cVar2.purple;
            workDatabase_Impl2.getClass();
            lVar = workDatabase_Impl2.delta;
            lVar.getClass();
            synchronized (lVar.lima) {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC2716m6.alpha(azure, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085 A[EDGE_INSN: B:86:0x0085->B:69:0x0085 BREAK  A[LOOP:3: B:48:0x0024->B:70:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void kilo(androidx.sqlite.db.framework.b bVar, int i4, int i5) {
        LinkedHashSet linkedHashSet;
        boolean z2;
        boolean z10;
        List list;
        TreeMap treeMap;
        Set<Integer> keySet;
        boolean z11;
        l2.e eVar = (l2.e) this.charlie;
        D8.c cVar = (D8.c) this.delta;
        if (eVar != null) {
            h hVar = eVar.delta;
            hVar.getClass();
            if (i4 == i5) {
                list = CollectionsKt.emptyList();
            } else {
                if (i5 > i4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                int i10 = i4;
                do {
                    if (z10) {
                        if (i10 >= i5) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) hVar.alpha.get(Integer.valueOf(i10));
                        if (treeMap == null) {
                            break;
                        }
                        if (z10) {
                            keySet = treeMap.descendingKeySet();
                        } else {
                            keySet = treeMap.keySet();
                        }
                        for (Integer targetVersion : keySet) {
                            if (z10) {
                                int i11 = i10 + 1;
                                Intrinsics.delta(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i11 <= intValue && intValue <= i5) {
                                    Object obj = treeMap.get(targetVersion);
                                    Intrinsics.checkNotNull(obj);
                                    arrayList.add(obj);
                                    i10 = targetVersion.intValue();
                                    z11 = true;
                                    break;
                                }
                            } else {
                                Intrinsics.delta(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i5 <= intValue2 && intValue2 < i10) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    Intrinsics.checkNotNull(obj2);
                                    arrayList.add(obj2);
                                    i10 = targetVersion.intValue();
                                    z11 = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                    } else {
                        if (i10 <= i5) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) hVar.alpha.get(Integer.valueOf(i10));
                        if (treeMap == null) {
                        }
                    }
                } while (z11);
                list = null;
            }
            if (list != null) {
                Ld.c hotel = kotlin.collections.ab.hotel();
                Cursor azure = bVar.azure("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (azure.moveToNext()) {
                    try {
                        hotel.add(azure.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC2716m6.alpha(azure, th);
                            throw th2;
                        }
                    }
                }
                azure.close();
                ListIterator listIterator = kotlin.collections.ab.alpha(hotel).listIterator(0);
                while (true) {
                    Ld.a aVar = (Ld.a) listIterator;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    String triggerName = (String) aVar.next();
                    Intrinsics.delta(triggerName, "triggerName");
                    if (r.quebec(triggerName, "room_fts_content_sync_", false)) {
                        bVar.juliet("DROP TRIGGER IF EXISTS ".concat(triggerName));
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC2096a) it.next()).alpha(bVar);
                }
                ai mike = D8.c.mike(bVar);
                if (mike.alpha) {
                    bVar.juliet("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    bVar.juliet("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: " + mike.bravo);
            }
        }
        l2.e eVar2 = (l2.e) this.charlie;
        if (eVar2 != null) {
            if ((i4 <= i5 || !eVar2.kilo) && eVar2.juliet && ((linkedHashSet = eVar2.lima) == null || !linkedHashSet.contains(Integer.valueOf(i4)))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                bVar.juliet("DROP TABLE IF EXISTS `Dependency`");
                bVar.juliet("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.juliet("DROP TABLE IF EXISTS `WorkTag`");
                bVar.juliet("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.juliet("DROP TABLE IF EXISTS `WorkName`");
                bVar.juliet("DROP TABLE IF EXISTS `WorkProgress`");
                bVar.juliet("DROP TABLE IF EXISTS `Preference`");
                ArrayList arrayList2 = ((WorkDatabase_Impl) cVar.purple).foxtrot;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((B2.a) it2.next()).getClass();
                    }
                }
                D8.c.bravo(bVar);
                return;
            }
        }
        throw new IllegalStateException(P0.azure(i4, i5, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }

    public void lima(Object obj, Object obj2) {
        int i4 = (this.bravo + 1) * 2;
        Object[] objArr = (Object[]) this.charlie;
        if (i4 > objArr.length) {
            this.charlie = Arrays.copyOf(objArr, X.alpha(objArr.length, i4));
        }
        V.alpha(obj, obj2);
        Object[] objArr2 = (Object[]) this.charlie;
        int i5 = this.bravo;
        int i10 = i5 * 2;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.bravo = i5 + 1;
    }

    public void mike(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.bravo) * 2;
            Object[] objArr = (Object[]) this.charlie;
            if (size > objArr.length) {
                this.charlie = Arrays.copyOf(objArr, X.alpha(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            lima(entry.getKey(), entry.getValue());
        }
    }

    public void november(int i4, n nVar) {
        int i5 = i4 & 67108863;
        long[] jArr = (long[]) this.charlie;
        int i10 = this.bravo;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & 67108863) == i5) {
                long j5 = jArr[i11];
                long j6 = jArr[i11 + 1];
                nVar.invoke(Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) j5), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) j6));
                return;
            }
        }
    }

    public void oscar(String str, Feature feature) {
        int i4 = this.bravo + 1;
        Object[] objArr = (Object[]) this.charlie;
        int length = objArr.length;
        int i5 = i4 + i4;
        if (i5 > length) {
            if (i5 >= 0) {
                int i10 = length + (length >> 1) + 1;
                if (i10 < i5) {
                    int highestOneBit = Integer.highestOneBit(i5 - 1);
                    i10 = highestOneBit + highestOneBit;
                }
                if (i10 < 0) {
                    i10 = LottieConstants.IterateForever;
                }
                this.charlie = Arrays.copyOf(objArr, i10);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.charlie;
        int i11 = this.bravo;
        int i12 = i11 + i11;
        objArr2[i12] = str;
        objArr2[i12 + 1] = feature;
        this.bravo = i11 + 1;
    }

    public void papa(String str, aj ajVar) {
        Map map = (Map) this.charlie;
        if (!map.containsKey(str)) {
            map.put(str, ajVar);
            if (this.bravo > 0) {
                new com.google.android.gms.internal.measurement.ai(Looper.getMainLooper(), 3).post(new d(this, ajVar, str, 2, false));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(ad.gray("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public byte[] quebec(int i4) {
        boolean z2;
        int i5 = i4 ^ 1;
        B9.r rVar = (B9.r) this.delta;
        if (1 != i5) {
            z2 = false;
        } else {
            z2 = true;
        }
        rVar.india = Boolean.valueOf(z2);
        B9.r rVar2 = (B9.r) this.delta;
        rVar2.golf = Boolean.FALSE;
        C2735o7 c2735o7 = new C2735o7(rVar2);
        i1 i1Var = (i1) this.charlie;
        i1Var.bravo = c2735o7;
        try {
            U7.bravo();
            U7 u72 = U7.red;
            if (i4 == 0) {
                B5 b52 = new B5(i1Var);
                d8.d dVar = new d8.d();
                u72.alpha(dVar);
                dVar.silver = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    d8.e eVar = new d8.e(stringWriter, dVar.alpha, dVar.purple, dVar.red, dVar.silver);
                    eVar.hotel(b52);
                    eVar.juliet();
                    eVar.bravo.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            B5 b53 = new B5(i1Var);
            U u4 = new U();
            u72.alpha(u4);
            return new U(new HashMap(u4.alpha), new HashMap(u4.purple), u4.red).bravo(b53);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void romeo(int i4, int i5, Intent intent) {
        for (aj ajVar : ((Map) this.charlie).values()) {
            ah ahVar = (ah) ajVar.red.get();
            AtomicReference atomicReference = ajVar.red;
            if (i4 != 1) {
                if (i4 == 2) {
                    int isGooglePlayServicesAvailable = ajVar.teal.isGooglePlayServicesAvailable(ajVar.alpha());
                    if (isGooglePlayServicesAvailable == 0) {
                        atomicReference.set(null);
                        ajVar.india();
                    } else if (ahVar != null) {
                        if (ahVar.bravo.purple == 18 && isGooglePlayServicesAvailable == 18) {
                        }
                    }
                }
                if (ahVar == null) {
                    atomicReference.set(null);
                    ajVar.hotel(ahVar.bravo, ahVar.alpha);
                }
            } else if (i5 == -1) {
                atomicReference.set(null);
                ajVar.india();
            } else if (i5 == 0) {
                if (ahVar != null) {
                    int i10 = 13;
                    if (intent != null) {
                        i10 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    ConnectionResult connectionResult = new ConnectionResult(1, i10, null, ahVar.bravo.toString());
                    atomicReference.set(null);
                    ajVar.hotel(connectionResult, ahVar.alpha);
                }
            } else if (ahVar == null) {
            }
        }
    }

    public void sierra(Bundle bundle) {
        Bundle bundle2;
        this.bravo = 1;
        this.delta = bundle;
        for (Map.Entry entry : ((Map) this.charlie).entrySet()) {
            aj ajVar = (aj) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            ajVar.charlie(bundle2);
        }
    }

    public void tango(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.charlie).entrySet()) {
                Bundle bundle2 = new Bundle();
                ah ahVar = (ah) ((aj) entry.getValue()).red.get();
                if (ahVar != null) {
                    bundle2.putBoolean("resolving_error", true);
                    bundle2.putInt("failed_client_id", ahVar.alpha);
                    ConnectionResult connectionResult = ahVar.bravo;
                    bundle2.putInt("failed_status", connectionResult.purple);
                    bundle2.putParcelable("failed_resolution", connectionResult.red);
                }
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public String toString() {
        switch (this.alpha) {
            case 1:
                return echo();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, bv.aw] */
    public a(byte b2, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 9:
                this.charlie = new Object[8];
                this.bravo = 0;
                return;
            default:
                this.charlie = Collections.synchronizedMap(new aw(0));
                this.bravo = 0;
                return;
        }
    }

    public a(i1 i1Var, int i4) {
        this.alpha = 10;
        this.delta = new Object();
        this.charlie = i1Var;
        U7.bravo();
        this.bravo = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(l2.e eVar, D8.c cVar) {
        this(23, 7);
        this.alpha = 7;
        this.charlie = eVar;
        this.delta = cVar;
    }

    public a(Shader shader, ColorStateList colorStateList, int i4) {
        this.alpha = 6;
        this.charlie = shader;
        this.delta = colorStateList;
        this.bravo = i4;
    }

    public a(C0 c02) {
        this.alpha = 12;
        this.charlie = c02;
    }

    public a(int i4, int i5) {
        this.alpha = i5;
        switch (i5) {
            case 7:
                this.bravo = i4;
                return;
            default:
                this.charlie = new Object[i4 * 2];
                this.bravo = 0;
                return;
        }
    }

    public a(f fVar) {
        this.alpha = 4;
        this.delta = Z3.d.alpha(150, new androidx.core.widget.f(19, this));
        this.charlie = fVar;
    }
}
