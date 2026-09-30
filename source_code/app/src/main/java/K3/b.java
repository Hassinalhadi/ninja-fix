package K3;

import Gc.v;
import J3.s;
import J3.x;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.SparseIntArray;
import android.view.MenuItem;
import androidx.appcompat.app.ab;
import b7.C0721c;
import bv.aw;
import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import l1.InterfaceMenuItemC2052a;
import sd.j;
import sd.k;

/* loaded from: classes3.dex */
public abstract class b implements s {
    public final /* synthetic */ int alpha;
    public Object purple;
    public Object red;

    public b(String content, List parameters) {
        this.alpha = 5;
        Intrinsics.echo(content, "content");
        Intrinsics.echo(parameters, "parameters");
        this.purple = content;
        this.red = parameters;
    }

    public static float hotel(int i4, int i5, int i10) {
        return O6.c.alpha((i4 - i5) / i10, 0.0f, 1.0f);
    }

    public abstract void charlie();

    public void delta() {
        v vVar = (v) this.purple;
        if (vVar != null) {
            try {
                ((ab) this.red).f2728d.unregisterReceiver(vVar);
            } catch (IllegalArgumentException unused) {
            }
            this.purple = null;
        }
    }

    public abstract IntentFilter echo();

    public abstract int[] foxtrot(int i4);

    public abstract int golf();

    public MenuItem india(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC2052a) {
            InterfaceMenuItemC2052a interfaceMenuItemC2052a = (InterfaceMenuItemC2052a) menuItem;
            if (((aw) this.red) == null) {
                this.red = new aw(0);
            }
            MenuItem menuItem2 = (MenuItem) ((aw) this.red).get(interfaceMenuItemC2052a);
            if (menuItem2 == null) {
                ao.s sVar = new ao.s((Context) this.purple, interfaceMenuItemC2052a);
                ((aw) this.red).put(interfaceMenuItemC2052a, sVar);
                return sVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public int[] juliet(int i4, int i5) {
        if (i4 >= 0 && i5 >= 0 && i4 != i5) {
            int[] iArr = (int[]) this.red;
            iArr[0] = i4;
            iArr[1] = i5;
            return iArr;
        }
        return null;
    }

    public int kilo(int i4, int i5) {
        int mike = mike(i4);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            int mike2 = mike(i12);
            i10 += mike2;
            if (i10 == i5) {
                i11++;
                i10 = 0;
            } else if (i10 > i5) {
                i11++;
                i10 = mike2;
            }
        }
        if (i10 + mike > i5) {
            return i11 + 1;
        }
        return i11;
    }

    public int lima(int i4, int i5) {
        int mike = mike(i4);
        if (mike == i5) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            int mike2 = mike(i11);
            i10 += mike2;
            if (i10 == i5) {
                i10 = 0;
            } else if (i10 > i5) {
                i10 = mike2;
            }
        }
        if (mike + i10 > i5) {
            return 0;
        }
        return i10;
    }

    public abstract int mike(int i4);

    public String november() {
        String str = (String) this.purple;
        if (str != null) {
            return str;
        }
        Intrinsics.lima(Constants.KEY_TEXT);
        throw null;
    }

    public void oscar() {
        ((SparseIntArray) this.purple).clear();
    }

    public abstract void papa();

    public abstract void quebec();

    public String romeo(String name) {
        Intrinsics.echo(name, "name");
        List list = (List) this.red;
        int ivory = CollectionsKt.ivory(list);
        if (ivory >= 0) {
            int i4 = 0;
            while (true) {
                j jVar = (j) list.get(i4);
                if (r.hotel(jVar.alpha, name, true)) {
                    return jVar.bravo;
                }
                if (i4 != ivory) {
                    i4++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    @Override // J3.s
    public J3.r sierra(x xVar) {
        Class cls = (Class) this.red;
        return new e((Context) this.purple, xVar.bravo(File.class, cls), xVar.bravo(Uri.class, cls), cls);
    }

    public abstract int[] tango(int i4);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0125 A[LOOP:1: B:16:0x0055->B:39:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i4 = 2;
        switch (this.alpha) {
            case 5:
                List<j> list = (List) this.red;
                boolean isEmpty = list.isEmpty();
                String str = (String) this.purple;
                if (!isEmpty) {
                    int length = str.length();
                    int i5 = 0;
                    for (j jVar : list) {
                        i5 += jVar.bravo.length() + jVar.alpha.length() + 3;
                    }
                    StringBuilder sb2 = new StringBuilder(length + i5);
                    sb2.append(str);
                    int ivory = CollectionsKt.ivory(list);
                    if (ivory >= 0) {
                        int i10 = 0;
                        while (true) {
                            j jVar2 = (j) list.get(i10);
                            sb2.append("; ");
                            sb2.append(jVar2.alpha);
                            sb2.append("=");
                            Set set = k.alpha;
                            String str2 = jVar2.bravo;
                            if (str2.length() != 0) {
                                if (str2.length() >= i4 && StringsKt.crimson(str2) == '\"' && StringsKt.green(str2) == '\"') {
                                    int i11 = 1;
                                    do {
                                        int emerald = StringsKt.emerald(str2, '\"', i11, 4);
                                        if (emerald != StringsKt.cyan(str2)) {
                                            int i12 = 0;
                                            for (int i13 = emerald - 1; str2.charAt(i13) == '\\'; i13--) {
                                                i12++;
                                            }
                                            if (i12 % i4 != 0) {
                                                i11 = emerald + 1;
                                            }
                                        }
                                        sb2.append(str2);
                                        if (i10 == ivory) {
                                            i10++;
                                            i4 = 2;
                                        }
                                    } while (i11 < str2.length());
                                    sb2.append(str2);
                                    if (i10 == ivory) {
                                    }
                                }
                                int length2 = str2.length();
                                for (int i14 = 0; i14 < length2; i14++) {
                                    if (!k.alpha.contains(Character.valueOf(str2.charAt(i14)))) {
                                    }
                                }
                                sb2.append(str2);
                                if (i10 == ivory) {
                                }
                            }
                            StringBuilder sb3 = new StringBuilder("\"");
                            int length3 = str2.length();
                            for (int i15 = 0; i15 < length3; i15++) {
                                char charAt = str2.charAt(i15);
                                if (charAt != '\t') {
                                    if (charAt != '\n') {
                                        if (charAt != '\r') {
                                            if (charAt != '\"') {
                                                if (charAt != '\\') {
                                                    sb3.append(charAt);
                                                } else {
                                                    sb3.append("\\\\");
                                                }
                                            } else {
                                                sb3.append("\\\"");
                                            }
                                        } else {
                                            sb3.append("\\r");
                                        }
                                    } else {
                                        sb3.append("\\n");
                                    }
                                } else {
                                    sb3.append("\\t");
                                }
                            }
                            sb3.append("\"");
                            sb2.append(sb3.toString());
                            if (i10 == ivory) {
                            }
                        }
                    }
                    String sb4 = sb2.toString();
                    Intrinsics.checkNotNull(sb4);
                    return sb4;
                }
                return str;
            default:
                return super.toString();
        }
    }

    public abstract void uniform(C0721c c0721c);

    public abstract void victor();

    public void whiskey() {
        delta();
        IntentFilter echo = echo();
        if (echo.countActions() == 0) {
            return;
        }
        if (((v) this.purple) == null) {
            this.purple = new v(3, this);
        }
        ((ab) this.red).f2728d.registerReceiver((v) this.purple, echo);
    }

    public abstract void xray();

    public abstract void yankee();

    public b(Context context) {
        this.alpha = 3;
        this.purple = context;
    }

    public b(int i4) {
        this.alpha = 4;
        this.red = new ArrayList();
        for (int i5 = 0; i5 < i4; i5++) {
            ((ArrayList) this.red).add(new b7.r());
        }
    }

    public b(Context context, Class cls) {
        this.alpha = 0;
        this.purple = context;
        this.red = cls;
    }

    public b(byte b2, int i4) {
        this.alpha = i4;
        switch (i4) {
            case 6:
                this.red = new int[2];
                return;
            default:
                this.purple = new SparseIntArray();
                this.red = new SparseIntArray();
                return;
        }
    }

    public b(ab abVar) {
        this.alpha = 1;
        this.red = abVar;
    }
}
