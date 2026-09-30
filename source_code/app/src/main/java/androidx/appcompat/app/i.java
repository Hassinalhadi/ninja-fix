package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0488x;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j1;
import f1.AbstractC1686f;
import i1.AbstractC1881b;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class i extends androidx.fragment.app.an implements j, f1.ah {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private o mDelegate;
    private Resources mResources;

    public i() {
        getSavedStateRegistry().charlie(DELEGATE_TAG, new h(this));
        addOnContextAvailableListener(new Eb.b(this, 22));
    }

    @Override // ae.o, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ab abVar = (ab) getDelegate();
        abVar.whiskey();
        ((ViewGroup) abVar.f2743t.findViewById(R.id.content)).addView(view, layoutParams);
        abVar.f2729f.alpha(abVar.e.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ab abVar = (ab) getDelegate();
        abVar.f2709H = true;
        int i16 = abVar.f2713L;
        if (i16 == -100) {
            i16 = o.purple;
        }
        int blue = abVar.blue(i16, context);
        if (o.charlie(context) && o.charlie(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!o.white) {
                    o.alpha.execute(new k(context, 0));
                }
            } else {
                synchronized (o.f2751b) {
                    try {
                        o1.e eVar = o.red;
                        if (eVar == null) {
                            if (o.silver == null) {
                                o.silver = o1.e.bravo(AbstractC1686f.echo(context));
                            }
                            if (!o.silver.alpha.isEmpty()) {
                                o.red = o.silver;
                            }
                        } else if (!eVar.equals(o.silver)) {
                            o1.e eVar2 = o.red;
                            o.silver = eVar2;
                            AbstractC1686f.delta(context, eVar2.alpha.alpha());
                        }
                    } finally {
                    }
                }
            }
        }
        o1.e oscar = ab.oscar(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(ab.tango(context, blue, oscar, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof an.d) {
            try {
                ((an.d) context).alpha(ab.tango(context, blue, oscar, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (ab.f2704c0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f5 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f5 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i17 = configuration3.mcc;
                    int i18 = configuration4.mcc;
                    if (i17 != i18) {
                        configuration.mcc = i18;
                    }
                    int i19 = configuration3.mnc;
                    int i20 = configuration4.mnc;
                    if (i19 != i20) {
                        configuration.mnc = i20;
                    }
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 24) {
                        u.alpha(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i22 = configuration3.touchscreen;
                    int i23 = configuration4.touchscreen;
                    if (i22 != i23) {
                        configuration.touchscreen = i23;
                    }
                    int i24 = configuration3.keyboard;
                    int i25 = configuration4.keyboard;
                    if (i24 != i25) {
                        configuration.keyboard = i25;
                    }
                    int i26 = configuration3.keyboardHidden;
                    int i27 = configuration4.keyboardHidden;
                    if (i26 != i27) {
                        configuration.keyboardHidden = i27;
                    }
                    int i28 = configuration3.navigation;
                    int i29 = configuration4.navigation;
                    if (i28 != i29) {
                        configuration.navigation = i29;
                    }
                    int i30 = configuration3.navigationHidden;
                    int i31 = configuration4.navigationHidden;
                    if (i30 != i31) {
                        configuration.navigationHidden = i31;
                    }
                    int i32 = configuration3.orientation;
                    int i33 = configuration4.orientation;
                    if (i32 != i33) {
                        configuration.orientation = i33;
                    }
                    int i34 = configuration3.screenLayout & 15;
                    int i35 = configuration4.screenLayout & 15;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    int i36 = configuration3.screenLayout & 192;
                    int i37 = configuration4.screenLayout & 192;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 48;
                    int i39 = configuration4.screenLayout & 48;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 768;
                    int i41 = configuration4.screenLayout & 768;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    if (i21 >= 26) {
                        i4 = configuration3.colorMode;
                        int i42 = i4 & 3;
                        i5 = configuration4.colorMode;
                        if (i42 != (i5 & 3)) {
                            i14 = configuration.colorMode;
                            i15 = configuration4.colorMode;
                            configuration.colorMode = i14 | (i15 & 3);
                        }
                        i10 = configuration3.colorMode;
                        int i43 = i10 & 12;
                        i11 = configuration4.colorMode;
                        if (i43 != (i11 & 12)) {
                            i12 = configuration.colorMode;
                            i13 = configuration4.colorMode;
                            configuration.colorMode = i12 | (i13 & 12);
                        }
                    }
                    int i44 = configuration3.uiMode & 15;
                    int i45 = configuration4.uiMode & 15;
                    if (i44 != i45) {
                        configuration.uiMode |= i45;
                    }
                    int i46 = configuration3.uiMode & 48;
                    int i47 = configuration4.uiMode & 48;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.screenWidthDp;
                    int i49 = configuration4.screenWidthDp;
                    if (i48 != i49) {
                        configuration.screenWidthDp = i49;
                    }
                    int i50 = configuration3.screenHeightDp;
                    int i51 = configuration4.screenHeightDp;
                    if (i50 != i51) {
                        configuration.screenHeightDp = i51;
                    }
                    int i52 = configuration3.smallestScreenWidthDp;
                    int i53 = configuration4.smallestScreenWidthDp;
                    if (i52 != i53) {
                        configuration.smallestScreenWidthDp = i53;
                    }
                    int i54 = configuration3.densityDpi;
                    int i55 = configuration4.densityDpi;
                    if (i54 != i55) {
                        configuration.densityDpi = i55;
                    }
                }
            }
            Configuration tango = ab.tango(context, blue, oscar, configuration, true);
            an.d dVar = new an.d(context, 2132083358);
            dVar.alpha(tango);
            try {
                if (context.getTheme() != null) {
                    AbstractC1881b.mike(dVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.alpha()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // f1.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.kilo(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i4) {
        ab abVar = (ab) getDelegate();
        abVar.whiskey();
        return (T) abVar.e.findViewById(i4);
    }

    public o getDelegate() {
        if (this.mDelegate == null) {
            K2.i iVar = o.alpha;
            this.mDelegate = new ab(this, null, this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        ab abVar = (ab) getDelegate();
        abVar.getClass();
        return new q(abVar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        Context context;
        ab abVar = (ab) getDelegate();
        if (abVar.f2732i == null) {
            abVar.beige();
            a aVar = abVar.f2731h;
            if (aVar != null) {
                context = aVar.echo();
            } else {
                context = abVar.f2728d;
            }
            abVar.f2732i = new an.i(context);
        }
        return abVar.f2732i;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i4 = j1.alpha;
        }
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public a getSupportActionBar() {
        ab abVar = (ab) getDelegate();
        abVar.beige();
        return abVar.f2731h;
    }

    @Override // f1.ah
    public Intent getSupportParentActivityIntent() {
        return AbstractC1686f.bravo(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().bravo();
    }

    @Override // ae.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ab abVar = (ab) getDelegate();
        if (abVar.f2748y && abVar.f2742s) {
            abVar.beige();
            a aVar = abVar.f2731h;
            if (aVar != null) {
                aVar.hotel();
            }
        }
        C0488x alpha = C0488x.alpha();
        Context context = abVar.f2728d;
        synchronized (alpha) {
            alpha.alpha.lima(context);
        }
        abVar.f2712K = new Configuration(abVar.f2728d.getResources().getConfiguration());
        abVar.mike(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(f1.ai aiVar) {
        aiVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC1686f.bravo(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(aiVar.purple.getPackageManager());
            }
            aiVar.bravo(component);
            aiVar.alpha.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().echo();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public void onLocalesChanged(o1.e eVar) {
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.delta() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    public void onNightModeChanged(int i4) {
    }

    @Override // ae.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((ab) getDelegate()).whiskey();
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        ab abVar = (ab) getDelegate();
        abVar.beige();
        a aVar = abVar.f2731h;
        if (aVar != null) {
            aVar.sierra(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(f1.ai aiVar) {
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onStart() {
        super.onStart();
        ((ab) getDelegate()).mike(true, false);
    }

    @Override // androidx.fragment.app.an, android.app.Activity
    public void onStop() {
        super.onStop();
        ab abVar = (ab) getDelegate();
        abVar.beige();
        a aVar = abVar.f2731h;
        if (aVar != null) {
            aVar.sierra(false);
        }
    }

    @Override // androidx.appcompat.app.j
    public void onSupportActionModeFinished(an.b bVar) {
    }

    @Override // androidx.appcompat.app.j
    public void onSupportActionModeStarted(an.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                f1.ai aiVar = new f1.ai(this);
                onCreateSupportNavigateUpTaskStack(aiVar);
                onPrepareSupportNavigateUpTaskStack(aiVar);
                aiVar.delta();
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        getDelegate().kilo(charSequence);
    }

    @Override // androidx.appcompat.app.j
    public an.b onWindowStartingSupportActionMode(an.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.lima()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // ae.o, android.app.Activity
    public void setContentView(int i4) {
        initializeViewTreeOwners();
        getDelegate().hotel(i4);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        CharSequence charSequence;
        ab abVar = (ab) getDelegate();
        if (!(abVar.f2727c instanceof Activity)) {
            return;
        }
        abVar.beige();
        a aVar = abVar.f2731h;
        if (!(aVar instanceof ap)) {
            abVar.f2732i = null;
            if (aVar != null) {
                aVar.india();
            }
            abVar.f2731h = null;
            if (toolbar != null) {
                Object obj = abVar.f2727c;
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = abVar.f2733j;
                }
                ak akVar = new ak(toolbar, charSequence, abVar.f2729f);
                abVar.f2731h = akVar;
                abVar.f2729f.purple = akVar.charlie;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                abVar.f2729f.purple = null;
            }
            abVar.bravo();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Deprecated
    public void setSupportProgress(int i4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z2) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z2) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z2) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        super.setTheme(i4);
        ((ab) getDelegate()).f2714M = i4;
    }

    public an.b startSupportActionMode(an.a aVar) {
        return getDelegate().lima(aVar);
    }

    @Override // androidx.fragment.app.an
    public void supportInvalidateOptionsMenu() {
        getDelegate().bravo();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().golf(i4);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // ae.o, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().india(view);
    }

    @Override // ae.o, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().juliet(view, layoutParams);
    }
}
