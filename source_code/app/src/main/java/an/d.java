package an;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes3.dex */
public final class d extends ContextWrapper {
    public static Configuration foxtrot;
    public int alpha;
    public Resources.Theme bravo;
    public LayoutInflater charlie;
    public Configuration delta;
    public Resources echo;

    public d(Context context, int i4) {
        super(context);
        this.alpha = i4;
    }

    public final void alpha(Configuration configuration) {
        if (this.echo == null) {
            if (this.delta == null) {
                this.delta = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void bravo() {
        if (this.bravo == null) {
            this.bravo = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.bravo.setTo(theme);
            }
        }
        this.bravo.applyStyle(this.alpha, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(an.d.foxtrot) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.echo == null) {
            Configuration configuration = this.delta;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (foxtrot == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        foxtrot = configuration2;
                    }
                }
                this.echo = createConfigurationContext(this.delta).getResources();
            }
            this.echo = super.getResources();
        }
        return this.echo;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.charlie == null) {
                this.charlie = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.charlie;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.bravo;
        if (theme != null) {
            return theme;
        }
        if (this.alpha == 0) {
            this.alpha = 2132083359;
        }
        bravo();
        return this.bravo;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.alpha != i4) {
            this.alpha = i4;
            bravo();
        }
    }
}
