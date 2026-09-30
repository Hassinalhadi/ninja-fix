package ao;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import s1.av;

/* loaded from: classes3.dex */
public class l implements Menu {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f3202r = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public boolean f3203a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3204b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3205c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3206d;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3207f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f3208g;

    /* renamed from: h, reason: collision with root package name */
    public View f3209h;

    /* renamed from: o, reason: collision with root package name */
    public n f3216o;
    public final Resources purple;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3218q;
    public boolean red;
    public final boolean silver;
    public j teal;
    public final ArrayList white;
    public final ArrayList yellow;
    public int e = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3210i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3211j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3212k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3213l = false;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3214m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f3215n = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f3217p = false;

    public l(Context context) {
        boolean z2;
        boolean z10 = false;
        this.alpha = context;
        Resources resources = context.getResources();
        this.purple = resources;
        this.white = new ArrayList();
        this.yellow = new ArrayList();
        this.f3203a = true;
        this.f3204b = new ArrayList();
        this.f3205c = new ArrayList();
        this.f3206d = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = av.alpha;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = E2.e.sierra(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                z10 = true;
            }
        }
        this.silver = z10;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return alpha(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        Intent intent2;
        int i13;
        PackageManager packageManager = this.alpha.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i12 = queryIntentActivityOptions.size();
        } else {
            i12 = 0;
        }
        if ((i11 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i14 = 0; i14 < i12; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            if (i15 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i15];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n alpha = alpha(i4, i5, i10, resolveInfo.loadLabel(packageManager));
            alpha.setIcon(resolveInfo.loadIcon(packageManager));
            alpha.yellow = intent3;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = alpha;
            }
        }
        return i12;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final n alpha(int i4, int i5, int i10, CharSequence charSequence) {
        int i11;
        int i12 = ((-65536) & i10) >> 16;
        if (i12 >= 0 && i12 < 6) {
            int i13 = (f3202r[i12] << 16) | (65535 & i10);
            n nVar = new n(this, i4, i5, i10, i13, charSequence, this.e);
            ArrayList arrayList = this.white;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((n) arrayList.get(size)).silver <= i13) {
                        i11 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i11 = 0;
                    break;
                }
            }
            arrayList.add(i11, nVar);
            papa(true);
            return nVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final void bravo(x xVar, Context context) {
        this.f3215n.add(new WeakReference(xVar));
        xVar.charlie(context, this);
        this.f3206d = true;
    }

    public final void charlie(boolean z2) {
        if (this.f3213l) {
            return;
        }
        this.f3213l = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.bravo(this, z2);
            }
        }
        this.f3213l = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f3216o;
        if (nVar != null) {
            delta(nVar);
        }
        this.white.clear();
        papa(true);
    }

    public final void clearHeader() {
        this.f3208g = null;
        this.f3207f = null;
        this.f3209h = null;
        papa(false);
    }

    @Override // android.view.Menu
    public final void close() {
        charlie(true);
    }

    public boolean delta(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3216o == nVar) {
            whiskey();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = xVar.kilo(nVar);
                    if (z2) {
                        break;
                    }
                }
            }
            victor();
            if (z2) {
                this.f3216o = null;
            }
        }
        return z2;
    }

    public boolean echo(l lVar, MenuItem menuItem) {
        j jVar = this.teal;
        if (jVar != null && jVar.sierra(lVar, menuItem)) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem findItem;
        ArrayList arrayList = this.white;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.alpha == i4) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f3225h.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean foxtrot(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        whiskey();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = xVar.foxtrot(nVar);
                if (z2) {
                    break;
                }
            }
        }
        victor();
        if (z2) {
            this.f3216o = nVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.white.get(i4);
    }

    public final n golf(int i4, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f3214m;
        arrayList.clear();
        hotel(arrayList, i4, keyEvent);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (n) arrayList.get(0);
            }
            boolean november = november();
            for (int i5 = 0; i5 < size; i5++) {
                n nVar = (n) arrayList.get(i5);
                if (november) {
                    c3 = nVar.f3221c;
                } else {
                    c3 = nVar.f3219a;
                }
                char[] cArr = keyData.meta;
                if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (november && c3 == '\b' && i4 == 67))) {
                    return nVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.f3218q) {
            ArrayList arrayList = this.white;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((n) arrayList.get(i4)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void hotel(ArrayList arrayList, int i4, KeyEvent keyEvent) {
        char c3;
        int i5;
        boolean november = november();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList2 = this.white;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) arrayList2.get(i10);
                if (nVar.hasSubMenu()) {
                    nVar.f3225h.hotel(arrayList, i4, keyEvent);
                }
                if (november) {
                    c3 = nVar.f3221c;
                } else {
                    c3 = nVar.f3219a;
                }
                if (november) {
                    i5 = nVar.f3222d;
                } else {
                    i5 = nVar.f3220b;
                }
                if ((modifiers & 69647) == (i5 & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (november && c3 == '\b' && i4 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    public final void india() {
        ArrayList lima = lima();
        if (!this.f3206d) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 |= xVar.delta();
            }
        }
        ArrayList arrayList = this.f3204b;
        ArrayList arrayList2 = this.f3205c;
        if (z2) {
            arrayList.clear();
            arrayList2.clear();
            int size = lima.size();
            for (int i4 = 0; i4 < size; i4++) {
                n nVar = (n) lima.get(i4);
                if ((nVar.f3234q & 32) == 32) {
                    arrayList.add(nVar);
                } else {
                    arrayList2.add(nVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(lima());
        }
        this.f3206d = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        if (golf(i4, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String juliet() {
        return "android:menu:actionviewstates";
    }

    public l kilo() {
        return this;
    }

    public final ArrayList lima() {
        boolean z2 = this.f3203a;
        ArrayList arrayList = this.yellow;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.white;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            n nVar = (n) arrayList2.get(i4);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f3203a = false;
        this.f3206d = true;
        return arrayList;
    }

    public boolean mike() {
        return this.f3217p;
    }

    public boolean november() {
        return this.red;
    }

    public boolean oscar() {
        return this.silver;
    }

    public void papa(boolean z2) {
        if (!this.f3210i) {
            if (z2) {
                this.f3203a = true;
                this.f3206d = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
            if (!copyOnWriteArrayList.isEmpty()) {
                whiskey();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        xVar.india();
                    }
                }
                victor();
                return;
            }
            return;
        }
        this.f3211j = true;
        if (z2) {
            this.f3212k = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return quebec(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        boolean z2;
        n golf = golf(i4, keyEvent);
        if (golf != null) {
            z2 = quebec(golf, null, i5);
        } else {
            z2 = false;
        }
        if ((i5 & 2) != 0) {
            charlie(true);
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean quebec(MenuItem menuItem, x xVar, int i4) {
        boolean z2;
        o oVar;
        boolean z10;
        n nVar = (n) menuItem;
        boolean z11 = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f3226i;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) {
            l lVar = nVar.f3224g;
            if (!lVar.echo(lVar, nVar)) {
                Intent intent = nVar.yellow;
                if (intent != null) {
                    try {
                        lVar.alpha.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    }
                }
                o oVar2 = nVar.f3237t;
                if (oVar2 == null || !oVar2.bravo.onPerformDefaultAction()) {
                    z2 = false;
                    oVar = nVar.f3237t;
                    if (oVar == null && oVar.bravo.hasSubMenu()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!nVar.echo()) {
                        z2 |= nVar.expandActionView();
                        if (z2) {
                            charlie(true);
                        }
                    } else if (!nVar.hasSubMenu() && !z10) {
                        if ((i4 & 1) == 0) {
                            charlie(true);
                        }
                    } else {
                        if ((i4 & 4) == 0) {
                            charlie(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            ae aeVar = new ae(this.alpha, this, nVar);
                            nVar.f3225h = aeVar;
                            aeVar.setHeaderTitle(nVar.teal);
                        }
                        ae aeVar2 = nVar.f3225h;
                        if (z10) {
                            s sVar = oVar.charlie;
                            oVar.bravo.onPrepareSubMenu(aeVar2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (xVar != null) {
                                z11 = xVar.mike(aeVar2);
                            }
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                x xVar2 = (x) weakReference.get();
                                if (xVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!z11) {
                                    z11 = xVar2.mike(aeVar2);
                                }
                            }
                        }
                        z2 |= z11;
                        if (!z2) {
                            charlie(true);
                        }
                    }
                    return z2;
                }
            }
        }
        z2 = true;
        oVar = nVar.f3237t;
        if (oVar == null) {
        }
        z10 = false;
        if (!nVar.echo()) {
        }
        return z2;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.white;
        int size = arrayList.size();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((n) arrayList.get(i10)).purple == i4) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            int size2 = arrayList.size() - i10;
            while (true) {
                int i11 = i5 + 1;
                if (i5 >= size2 || ((n) arrayList.get(i10)).purple != i4) {
                    break;
                }
                if (i10 >= 0) {
                    ArrayList arrayList2 = this.white;
                    if (i10 < arrayList2.size()) {
                        arrayList2.remove(i10);
                    }
                }
                i5 = i11;
            }
            papa(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.white;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (((n) arrayList.get(i5)).alpha == i4) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.white;
            if (i5 < arrayList2.size()) {
                arrayList2.remove(i5);
                papa(true);
            }
        }
    }

    public final void romeo(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3215n;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z2, boolean z10) {
        ArrayList arrayList = this.white;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.purple == i4) {
                nVar.foxtrot(z10);
                nVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3217p = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z2) {
        ArrayList arrayList = this.white;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = (n) arrayList.get(i5);
            if (nVar.purple == i4) {
                nVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z2) {
        int i5;
        ArrayList arrayList = this.white;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.purple == i4) {
                int i11 = nVar.f3234q;
                int i12 = i11 & (-9);
                if (z2) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                int i13 = i12 | i5;
                nVar.f3234q = i13;
                if (i11 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            papa(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.red = z2;
        papa(false);
    }

    public final void sierra(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(juliet());
            int size = this.white.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = getItem(i4);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((ae) item.getSubMenu()).sierra(bundle);
                }
            }
            int i5 = bundle.getInt("android:menu:expandedactionview");
            if (i5 > 0 && (findItem = findItem(i5)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override // android.view.Menu
    public final int size() {
        return this.white.size();
    }

    public final void tango(Bundle bundle) {
        int size = this.white.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((ae) item.getSubMenu()).tango(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(juliet(), sparseArray);
        }
    }

    public final void uniform(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f3209h = view;
            this.f3207f = null;
            this.f3208g = null;
        } else {
            if (i4 > 0) {
                this.f3207f = this.purple.getText(i4);
            } else if (charSequence != null) {
                this.f3207f = charSequence;
            }
            if (i5 > 0) {
                this.f3208g = this.alpha.getDrawable(i5);
            } else if (drawable != null) {
                this.f3208g = drawable;
            }
            this.f3209h = null;
        }
        papa(false);
    }

    public final void victor() {
        this.f3210i = false;
        if (this.f3211j) {
            this.f3211j = false;
            papa(this.f3212k);
        }
    }

    public final void whiskey() {
        if (!this.f3210i) {
            this.f3210i = true;
            this.f3211j = false;
            this.f3212k = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return alpha(0, 0, 0, this.purple.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.purple.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i10, CharSequence charSequence) {
        return alpha(i4, i5, i10, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i10, CharSequence charSequence) {
        n alpha = alpha(i4, i5, i10, charSequence);
        ae aeVar = new ae(this.alpha, this, alpha);
        alpha.f3225h = aeVar;
        aeVar.setHeaderTitle(alpha.teal);
        return aeVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i10, int i11) {
        return alpha(i4, i5, i10, this.purple.getString(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i10, int i11) {
        return addSubMenu(i4, i5, i10, this.purple.getString(i11));
    }
}
